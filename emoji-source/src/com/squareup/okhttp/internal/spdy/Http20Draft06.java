// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Variant, FrameReader, FrameWriter, ErrorCode, 
//            HeadersMode, Settings

final class Http20Draft06
    implements Variant
{
    static final class Reader
        implements FrameReader
    {

        private final boolean client;
        private final Hpack.Reader hpackReader;
        private final DataInputStream in;

        private static transient IOException ioException(String s, Object aobj[])
            throws IOException
        {
            throw new IOException(String.format(s, aobj));
        }

        private void readData(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.data(flag, k, in, j);
        }

        private void readGoAway(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            if (j < 8)
            {
                throw ioException("TYPE_GOAWAY length < 8: %s", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = in.readInt();
            k = in.readInt();
            j -= 8;
            ErrorCode errorcode = ErrorCode.fromHttp2(k);
            if (errorcode == null)
            {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(k)
                });
            }
            if (Util.skipByReading(in, j) != (long)j)
            {
                throw new IOException("TYPE_GOAWAY opaque data was truncated");
            } else
            {
                handler.goAway(i, errorcode);
                return;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            if (k == 0)
            {
                throw ioException("TYPE_HEADERS streamId == 0", new Object[0]);
            }
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            int l;
            do
            {
                hpackReader.readHeaders(j);
                if ((i & 4) != 0)
                {
                    hpackReader.emitReferenceSet();
                    handler.headers(false, flag, k, -1, -1, hpackReader.getAndReset(), HeadersMode.HTTP_20_HEADERS);
                    return;
                }
                int i1 = in.readInt();
                l = in.readInt();
                j = (0xffff0000 & i1) >> 16;
                i = i1 & 0xff;
                if ((i & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if ((0xff00 & i1) >> 8 != 10)
                {
                    throw ioException("TYPE_CONTINUATION didn't have FLAG_END_HEADERS", new Object[0]);
                }
            } while ((l & 0x7fffffff) == k);
            throw ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
        }

        private void readPing(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            boolean flag = true;
            if (j != 8)
            {
                throw ioException("TYPE_PING length != 8: %s", new Object[] {
                    Integer.valueOf(j)
                });
            }
            if (k != 0)
            {
                throw ioException("TYPE_PING streamId != 0", new Object[0]);
            }
            j = in.readInt();
            k = in.readInt();
            if ((i & 1) == 0)
            {
                flag = false;
            }
            handler.ping(flag, j, k);
        }

        private void readPriority(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            if (j != 4)
            {
                throw ioException("TYPE_PRIORITY length: %d != 4", new Object[] {
                    Integer.valueOf(j)
                });
            }
            if (k == 0)
            {
                throw ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else
            {
                handler.priority(k, in.readInt() & 0x7fffffff);
                return;
            }
        }

        private void readPushPromise(FrameReader.Handler handler, int i, int j, int k)
        {
        }

        private void readRstStream(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            if (j != 4)
            {
                throw ioException("TYPE_RST_STREAM length: %d != 4", new Object[] {
                    Integer.valueOf(j)
                });
            }
            if (k == 0)
            {
                throw ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            i = in.readInt();
            ErrorCode errorcode = ErrorCode.fromHttp2(i);
            if (errorcode == null)
            {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                handler.rstStream(k, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            if (j % 8 != 0)
            {
                throw ioException("TYPE_SETTINGS length %% 8 != 0: %s", new Object[] {
                    Integer.valueOf(j)
                });
            }
            if (k != 0)
            {
                throw ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            Settings settings = new Settings();
            for (i = 0; i < j; i += 8)
            {
                settings.set(in.readInt() & 0xffffff, 0, in.readInt());
            }

            handler.settings(false, settings);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, int j, int k)
            throws IOException
        {
            j = in.readInt();
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.windowUpdate(k, j & 0x7fffffff, flag);
        }

        public void close()
            throws IOException
        {
            in.close();
        }

        public boolean nextFrame(FrameReader.Handler handler)
            throws IOException
        {
            int i;
            int j;
            int k;
            int l;
            try
            {
                i = in.readInt();
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            l = in.readInt();
            j = (0xffff0000 & i) >> 16;
            k = i & 0xff;
            l &= 0x7fffffff;
            switch ((0xff00 & i) >> 8)
            {
            case 8: // '\b'
            default:
                throw new UnsupportedOperationException("TODO");

            case 0: // '\0'
                readData(handler, k, j, l);
                return true;

            case 1: // '\001'
                readHeaders(handler, k, j, l);
                return true;

            case 2: // '\002'
                readPriority(handler, k, j, l);
                return true;

            case 3: // '\003'
                readRstStream(handler, k, j, l);
                return true;

            case 4: // '\004'
                readSettings(handler, k, j, l);
                return true;

            case 5: // '\005'
                readPushPromise(handler, k, j, l);
                return true;

            case 6: // '\006'
                readPing(handler, k, j, l);
                return true;

            case 7: // '\007'
                readGoAway(handler, k, j, l);
                return true;

            case 9: // '\t'
                readWindowUpdate(handler, k, j, l);
                break;
            }
            return true;
        }

        public void readConnectionHeader()
            throws IOException
        {
            if (!client)
            {
                byte abyte0[] = new byte[Http20Draft06.CONNECTION_HEADER.length];
                in.readFully(abyte0);
                if (!Arrays.equals(abyte0, Http20Draft06.CONNECTION_HEADER))
                {
                    throw ioException((new StringBuilder()).append("Expected a connection header but was ").append(Arrays.toString(abyte0)).toString(), new Object[0]);
                }
            }
        }

        Reader(InputStream inputstream, boolean flag)
        {
            in = new DataInputStream(inputstream);
            client = flag;
            hpackReader = new Hpack.Reader(in, flag);
        }
    }

    static final class Writer
        implements FrameWriter
    {

        private final boolean client;
        private final ByteArrayOutputStream hpackBuffer = new ByteArrayOutputStream();
        private final Hpack.Writer hpackWriter;
        private final DataOutputStream out;

        private void headers(boolean flag, int i, int j, List list)
            throws IOException
        {
            hpackBuffer.reset();
            hpackWriter.writeHeaders(list);
            int i1 = hpackBuffer.size();
            int k = 4;
            if (flag)
            {
                k = 4 | 1;
            }
            int l = k;
            if (j != -1)
            {
                l = k | 8;
            }
            out.writeInt((0xffff & i1) << 16 | 0x100 | l & 0xff);
            out.writeInt(i & 0x7fffffff);
            if (j != -1)
            {
                out.writeInt(j & 0x7fffffff);
            }
            hpackBuffer.writeTo(out);
        }

        public void close()
            throws IOException
        {
            out.close();
        }

        public void connectionHeader()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = client;
            if (flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            out.write(Http20Draft06.CONNECTION_HEADER);
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void data(boolean flag, int i, byte abyte0[])
            throws IOException
        {
            data(flag, i, abyte0, 0, abyte0.length);
        }

        public void data(boolean flag, int i, byte abyte0[], int j, int k)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int l;
            l = 0;
            if (flag)
            {
                l = false | true;
            }
            out.writeInt((0xffff & k) << 16 | 0 | l & 0xff);
            out.writeInt(0x7fffffff & i);
            out.write(abyte0, j, k);
            this;
            JVM INSTR monitorexit ;
            return;
            abyte0;
            throw abyte0;
        }

        public void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            out.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void goAway(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
        }

        public void headers(int i, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            headers(false, i, -1, list);
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public void noop()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            throw new UnsupportedOperationException();
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void ping(boolean flag, int i, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
        }

        public void rstStream(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            throw new UnsupportedOperationException("TODO");
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
        }

        public void settings(Settings settings1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int i = settings1.size();
            out.writeInt((0xffff & i * 8) << 16 | 0x400 | 0);
            out.writeInt(0);
            int j = 0;
_L2:
            if (j >= 10)
            {
                break MISSING_BLOCK_LABEL_89;
            }
            if (!settings1.isSet(j))
            {
                break MISSING_BLOCK_LABEL_91;
            }
            out.writeInt(0xffffff & j);
            out.writeInt(settings1.get(j));
            break MISSING_BLOCK_LABEL_91;
            settings1;
            throw settings1;
            return;
            j++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void synReply(boolean flag, int i, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            headers(flag, i, -1, list);
            this;
            JVM INSTR monitorexit ;
            return;
            list;
            throw list;
        }

        public void synStream(boolean flag, boolean flag1, int i, int j, int k, int l, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            throw new UnsupportedOperationException();
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            headers(flag, i, k, list);
            this;
            JVM INSTR monitorexit ;
        }

        public void windowUpdate(int i, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
        }

        Writer(OutputStream outputstream, boolean flag)
        {
            out = new DataOutputStream(outputstream);
            client = flag;
            hpackWriter = new Hpack.Writer(hpackBuffer);
        }
    }


    private static final byte CONNECTION_HEADER[];
    static final int FLAG_END_FLOW_CONTROL = 1;
    static final int FLAG_END_HEADERS = 4;
    static final int FLAG_END_STREAM = 1;
    static final int FLAG_PONG = 1;
    static final int FLAG_PRIORITY = 8;
    static final int TYPE_CONTINUATION = 10;
    static final int TYPE_DATA = 0;
    static final int TYPE_GOAWAY = 7;
    static final int TYPE_HEADERS = 1;
    static final int TYPE_PING = 6;
    static final int TYPE_PRIORITY = 2;
    static final int TYPE_PUSH_PROMISE = 5;
    static final int TYPE_RST_STREAM = 3;
    static final int TYPE_SETTINGS = 4;
    static final int TYPE_WINDOW_UPDATE = 9;

    Http20Draft06()
    {
    }

    public FrameReader newReader(InputStream inputstream, boolean flag)
    {
        return new Reader(inputstream, flag);
    }

    public FrameWriter newWriter(OutputStream outputstream, boolean flag)
    {
        return new Writer(outputstream, flag);
    }

    static 
    {
        try
        {
            CONNECTION_HEADER = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
    }

}
