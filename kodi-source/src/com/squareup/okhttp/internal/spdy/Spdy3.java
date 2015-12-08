// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.Deflater;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.DeflaterSink;
import okio.Okio;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            Variant, FrameReader, FrameWriter, NameValueBlockReader, 
//            ErrorCode, HeadersMode, Settings, Header

public final class Spdy3
    implements Variant
{
    static final class Reader
        implements FrameReader
    {

        private final boolean client;
        private final NameValueBlockReader headerBlockReader;
        private final BufferedSource source;

        private static transient IOException ioException(String s, Object aobj[])
            throws IOException
        {
            throw new IOException(String.format(s, aobj));
        }

        private void readGoAway(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = source.readInt();
            j = source.readInt();
            ErrorCode errorcode = ErrorCode.fromSpdyGoAway(j);
            if (errorcode == null)
            {
                throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                handler.goAway(i & 0x7fffffff, errorcode, ByteString.EMPTY);
                return;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            handler.headers(false, false, source.readInt() & 0x7fffffff, -1, headerBlockReader.readNameValueBlock(j - 4), HeadersMode.SPDY_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            boolean flag1 = true;
            if (j != 4)
            {
                throw ioException("TYPE_PING length: %d != 4", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = source.readInt();
            boolean flag2 = client;
            boolean flag;
            if ((i & 1) == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            handler.ping(flag, i, 0);
        }

        private void readRstStream(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = source.readInt();
            j = source.readInt();
            ErrorCode errorcode = ErrorCode.fromSpdy3Rst(j);
            if (errorcode == null)
            {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                handler.rstStream(i & 0x7fffffff, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            boolean flag = true;
            int k = source.readInt();
            if (j != k * 8 + 4)
            {
                throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                });
            }
            Settings settings = new Settings();
            for (j = 0; j < k; j++)
            {
                int l = source.readInt();
                settings.set(l & 0xffffff, (0xff000000 & l) >>> 24, source.readInt());
            }

            if ((i & 1) == 0)
            {
                flag = false;
            }
            handler.settings(flag, settings);
        }

        private void readSynReply(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            int k = source.readInt();
            List list = headerBlockReader.readNameValueBlock(j - 4);
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.headers(false, flag, k & 0x7fffffff, -1, list, HeadersMode.SPDY_REPLY);
        }

        private void readSynStream(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            boolean flag1 = true;
            int k = source.readInt();
            int l = source.readInt();
            source.readShort();
            List list = headerBlockReader.readNameValueBlock(j - 10);
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if ((i & 2) == 0)
            {
                flag1 = false;
            }
            handler.headers(flag1, flag, k & 0x7fffffff, l & 0x7fffffff, list, HeadersMode.SPDY_SYN_STREAM);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, int j)
            throws IOException
        {
            if (j != 8)
            {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(j)
                });
            }
            i = source.readInt();
            long l = source.readInt() & 0x7fffffff;
            if (l == 0L)
            {
                throw ioException("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l)
                });
            } else
            {
                handler.windowUpdate(i & 0x7fffffff, l);
                return;
            }
        }

        public void close()
            throws IOException
        {
            headerBlockReader.close();
        }

        public boolean nextFrame(FrameReader.Handler handler)
            throws IOException
        {
            boolean flag = false;
            int i;
            int j;
            int k;
            int l;
            try
            {
                j = source.readInt();
                k = source.readInt();
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            if ((0x80000000 & j) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            l = (0xff000000 & k) >>> 24;
            k &= 0xffffff;
            if (i != 0)
            {
                i = (0x7fff0000 & j) >>> 16;
                if (i != 3)
                {
                    throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
                }
                switch (j & 0xffff)
                {
                case 5: // '\005'
                default:
                    source.skip(k);
                    return true;

                case 1: // '\001'
                    readSynStream(handler, l, k);
                    return true;

                case 2: // '\002'
                    readSynReply(handler, l, k);
                    return true;

                case 3: // '\003'
                    readRstStream(handler, l, k);
                    return true;

                case 4: // '\004'
                    readSettings(handler, l, k);
                    return true;

                case 6: // '\006'
                    readPing(handler, l, k);
                    return true;

                case 7: // '\007'
                    readGoAway(handler, l, k);
                    return true;

                case 8: // '\b'
                    readHeaders(handler, l, k);
                    return true;

                case 9: // '\t'
                    readWindowUpdate(handler, l, k);
                    break;
                }
                return true;
            }
            if ((l & 1) != 0)
            {
                flag = true;
            }
            handler.data(flag, j & 0x7fffffff, source, k);
            return true;
        }

        public void readConnectionPreface()
        {
        }

        Reader(BufferedSource bufferedsource, boolean flag)
        {
            source = bufferedsource;
            headerBlockReader = new NameValueBlockReader(source);
            client = flag;
        }
    }

    static final class Writer
        implements FrameWriter
    {

        private final boolean client;
        private boolean closed;
        private final Buffer headerBlockBuffer = new Buffer();
        private final BufferedSink headerBlockOut;
        private final BufferedSink sink;

        private void writeNameValueBlockToBuffer(List list)
            throws IOException
        {
            if (headerBlockBuffer.size() != 0L)
            {
                throw new IllegalStateException();
            }
            headerBlockOut.writeInt(list.size());
            int i = 0;
            for (int j = list.size(); i < j; i++)
            {
                ByteString bytestring = ((Header)list.get(i)).name;
                headerBlockOut.writeInt(bytestring.size());
                headerBlockOut.write(bytestring);
                bytestring = ((Header)list.get(i)).value;
                headerBlockOut.writeInt(bytestring.size());
                headerBlockOut.write(bytestring);
            }

            headerBlockOut.flush();
        }

        public void ackSettings(Settings settings1)
        {
        }

        public void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            closed = true;
            Util.closeAll(sink, headerBlockOut);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public void connectionPreface()
        {
            this;
            JVM INSTR monitorenter ;
        }

        public void data(boolean flag, int i, Buffer buffer, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int k;
            if (flag)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            sendDataFrame(i, k, buffer, j);
            this;
            JVM INSTR monitorexit ;
            return;
            buffer;
            throw buffer;
        }

        public void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void goAway(int i, ErrorCode errorcode, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.spdyGoAwayCode == -1)
            {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            sink.writeInt(0x80030007);
            sink.writeInt(8);
            sink.writeInt(i);
            sink.writeInt(errorcode.spdyGoAwayCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public int maxDataLength()
        {
            return 16383;
        }

        public void ping(boolean flag, int i, int j)
            throws IOException
        {
            boolean flag2 = true;
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            boolean flag3 = client;
            boolean flag1;
            if ((i & 1) == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 != flag1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
              goto _L1
_L3:
            if (flag == flag1)
            {
                break MISSING_BLOCK_LABEL_64;
            }
            throw new IllegalArgumentException("payload != reply");
            sink.writeInt(0x80030006);
            sink.writeInt(4);
            sink.writeInt(i);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public void pushPromise(int i, int j, List list)
            throws IOException
        {
        }

        public void rstStream(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.spdyRstCode == -1)
            {
                throw new IllegalArgumentException();
            }
            sink.writeInt(0x80030003);
            sink.writeInt(8);
            sink.writeInt(0x7fffffff & i);
            sink.writeInt(errorcode.spdyRstCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        void sendDataFrame(int i, int j, Buffer buffer, int k)
            throws IOException
        {
            if (closed)
            {
                throw new IOException("closed");
            }
            if ((long)k > 0xffffffL)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("FRAME_TOO_LARGE max size is 16Mib: ").append(k).toString());
            }
            sink.writeInt(0x7fffffff & i);
            sink.writeInt((j & 0xff) << 24 | 0xffffff & k);
            if (k > 0)
            {
                sink.write(buffer, k);
            }
        }

        public void settings(Settings settings1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            settings1;
            this;
            JVM INSTR monitorexit ;
            throw settings1;
            int i = settings1.size();
            sink.writeInt(0x80030004);
            sink.writeInt(i * 8 + 4 & 0xffffff | 0);
            sink.writeInt(i);
            int j = 0;
_L2:
            if (j > 10)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            if (!settings1.isSet(j))
            {
                break MISSING_BLOCK_LABEL_151;
            }
            int k = settings1.flags(j);
            sink.writeInt((k & 0xff) << 24 | j & 0xffffff);
            sink.writeInt(settings1.get(j));
            break MISSING_BLOCK_LABEL_151;
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            j++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void synStream(boolean flag, boolean flag1, int i, int j, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int k;
            writeNameValueBlockToBuffer(list);
            k = (int)(10L + headerBlockBuffer.size());
            break MISSING_BLOCK_LABEL_46;
_L2:
            sink.writeInt(0x80030001);
            sink.writeInt(((flag2 | byte0) & 0xff) << 24 | 0xffffff & k);
            sink.writeInt(0x7fffffff & i);
            sink.writeInt(0x7fffffff & j);
            sink.writeShort(0);
            sink.writeAll(headerBlockBuffer);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            boolean flag2;
            byte byte0;
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            while (!flag1) 
            {
                byte0 = 0;
                continue; /* Loop/switch isn't completed */
            }
            byte0 = 2;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void windowUpdate(int i, long l)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (l != 0L && l <= 0x7fffffffL)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            throw new IllegalArgumentException((new StringBuilder()).append("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(l).toString());
            sink.writeInt(0x80030009);
            sink.writeInt(8);
            sink.writeInt(i);
            sink.writeInt((int)l);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        Writer(BufferedSink bufferedsink, boolean flag)
        {
            sink = bufferedsink;
            client = flag;
            bufferedsink = new Deflater();
            bufferedsink.setDictionary(Spdy3.DICTIONARY);
            headerBlockOut = Okio.buffer(new DeflaterSink(headerBlockBuffer, bufferedsink));
        }
    }


    static final byte DICTIONARY[];

    public Spdy3()
    {
    }

    public FrameReader newReader(BufferedSource bufferedsource, boolean flag)
    {
        return new Reader(bufferedsource, flag);
    }

    public FrameWriter newWriter(BufferedSink bufferedsink, boolean flag)
    {
        return new Writer(bufferedsink, flag);
    }

    static 
    {
        try
        {
            DICTIONARY = "\000\000\000\007options\000\000\000\004head\000\000\000\004post\000\000\000\003put\000\000\000\006delete\000\000\000\005trace\000\000\000\006accept\000\000\000\016accept-charset\000\000\000\017accept-encoding\000\000\000\017accept-language\000\000\000\raccept-ranges\000\000\000\003age\000\000\000\005allow\000\000\000\rauthorization\000\000\000\rcache-control\000\000\000\nconnection\000\000\000\fcontent-base\000\000\000\020content-encoding\000\000\000\020content-language\000\000\000\016content-length\000\000\000\020content-location\000\000\000\013content-md5\000\000\000\rcontent-range\000\000\000\fcontent-type\000\000\000\004date\000\000\000\004etag\000\000\000\006expect\000\000\000\007expires\000\000\000\004from\000\000\000\004host\000\000\000\bif-match\000\000\000\021if-modified-since\000\000\000\rif-none-match\000\000\000\bif-range\000\000\000\023if-unmodified-since\000\000\000\rlast-modified\000\000\000\blocation\000\000\000\fmax-forwards\000\000\000\006pragma\000\000\000\022proxy-authenticate\000\000\000\023proxy-authorization\000\000\000\005range\000\000\000\007referer\000\000\000\013retry-after\000\000\000\006server\000\000\000\002te\000\000\000\007trailer\000\000\000\021transfer-encoding\000\000\000\007upgrade\000\000\000\nuser-agent\000\000\000\004vary\000\000\000\003via\000\000\000\007warning\000\000\000\020www-authenticate\000\000\000\006method\000\000\000\003get\000\000\000\006status\000\000\000\006200 OK\000\000\000\007version\000\000\000\bHTTP/1.1\000\000\000\003url\000\000\000\006public\000\000\000\nset-cookie\000\000\000\nkeep-alive\000\000\000\006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(Util.UTF_8.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
    }
}
