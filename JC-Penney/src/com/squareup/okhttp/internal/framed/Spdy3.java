// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.i;
import c.j;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.Util;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            Variant, FrameReader, FrameWriter

public final class Spdy3
    implements Variant
{

    static final byte DICTIONARY[];
    static final int FLAG_FIN = 1;
    static final int FLAG_UNIDIRECTIONAL = 2;
    static final int TYPE_DATA = 0;
    static final int TYPE_GOAWAY = 7;
    static final int TYPE_HEADERS = 8;
    static final int TYPE_PING = 6;
    static final int TYPE_RST_STREAM = 3;
    static final int TYPE_SETTINGS = 4;
    static final int TYPE_SYN_REPLY = 2;
    static final int TYPE_SYN_STREAM = 1;
    static final int TYPE_WINDOW_UPDATE = 9;
    static final int VERSION = 3;

    public Spdy3()
    {
    }

    public Protocol getProtocol()
    {
        return Protocol.SPDY_3;
    }

    public FrameReader newReader(j j, boolean flag)
    {
        return new Reader(j, flag);
    }

    public FrameWriter newWriter(i i, boolean flag)
    {
        return new Writer(i, flag);
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

    private class Reader
        implements FrameReader
    {

        private final boolean client;
        private final NameValueBlockReader headerBlockReader;
        private final j source;

        private static transient IOException ioException(String s, Object aobj[])
        {
            throw new IOException(String.format(s, aobj));
        }

        private void readGoAway(FrameReader.Handler handler, int i, int l)
        {
            if (l != 8)
            {
                throw ioException("TYPE_GOAWAY length: %d != 8", new Object[] {
                    Integer.valueOf(l)
                });
            }
            i = source.k();
            l = source.k();
            ErrorCode errorcode = ErrorCode.fromSpdyGoAway(l);
            if (errorcode == null)
            {
                throw ioException("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                handler.goAway(i & 0x7fffffff, errorcode, k.b);
                return;
            }
        }

        private void readHeaders(FrameReader.Handler handler, int i, int l)
        {
            handler.headers(false, false, source.k() & 0x7fffffff, -1, headerBlockReader.readNameValueBlock(l - 4), HeadersMode.SPDY_HEADERS);
        }

        private void readPing(FrameReader.Handler handler, int i, int l)
        {
            boolean flag1 = true;
            if (l != 4)
            {
                throw ioException("TYPE_PING length: %d != 4", new Object[] {
                    Integer.valueOf(l)
                });
            }
            i = source.k();
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

        private void readRstStream(FrameReader.Handler handler, int i, int l)
        {
            if (l != 8)
            {
                throw ioException("TYPE_RST_STREAM length: %d != 8", new Object[] {
                    Integer.valueOf(l)
                });
            }
            i = source.k();
            l = source.k();
            ErrorCode errorcode = ErrorCode.fromSpdy3Rst(l);
            if (errorcode == null)
            {
                throw ioException("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                handler.rstStream(i & 0x7fffffff, errorcode);
                return;
            }
        }

        private void readSettings(FrameReader.Handler handler, int i, int l)
        {
            boolean flag = true;
            int i1 = source.k();
            if (l != i1 * 8 + 4)
            {
                throw ioException("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(i1)
                });
            }
            Settings settings = new Settings();
            for (l = 0; l < i1; l++)
            {
                int j1 = source.k();
                settings.set(j1 & 0xffffff, (0xff000000 & j1) >>> 24, source.k());
            }

            if ((i & 1) == 0)
            {
                flag = false;
            }
            handler.settings(flag, settings);
        }

        private void readSynReply(FrameReader.Handler handler, int i, int l)
        {
            int i1 = source.k();
            List list = headerBlockReader.readNameValueBlock(l - 4);
            boolean flag;
            if ((i & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            handler.headers(false, flag, i1 & 0x7fffffff, -1, list, HeadersMode.SPDY_REPLY);
        }

        private void readSynStream(FrameReader.Handler handler, int i, int l)
        {
            boolean flag1 = true;
            int i1 = source.k();
            int j1 = source.k();
            source.j();
            List list = headerBlockReader.readNameValueBlock(l - 10);
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
            handler.headers(flag1, flag, i1 & 0x7fffffff, j1 & 0x7fffffff, list, HeadersMode.SPDY_SYN_STREAM);
        }

        private void readWindowUpdate(FrameReader.Handler handler, int i, int l)
        {
            if (l != 8)
            {
                throw ioException("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                    Integer.valueOf(l)
                });
            }
            i = source.k();
            long l1 = source.k() & 0x7fffffff;
            if (l1 == 0L)
            {
                throw ioException("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l1)
                });
            } else
            {
                handler.windowUpdate(i & 0x7fffffff, l1);
                return;
            }
        }

        public void close()
        {
            headerBlockReader.close();
        }

        public boolean nextFrame(FrameReader.Handler handler)
        {
            boolean flag = false;
            int i;
            int l;
            int i1;
            int j1;
            try
            {
                l = source.k();
                i1 = source.k();
            }
            // Misplaced declaration of an exception variable
            catch (FrameReader.Handler handler)
            {
                return false;
            }
            if ((0x80000000 & l) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j1 = (0xff000000 & i1) >>> 24;
            i1 &= 0xffffff;
            if (i != 0)
            {
                i = (0x7fff0000 & l) >>> 16;
                if (i != 3)
                {
                    throw new ProtocolException((new StringBuilder()).append("version != 3: ").append(i).toString());
                }
                switch (0xffff & l)
                {
                case 5: // '\005'
                default:
                    source.g(i1);
                    return true;

                case 1: // '\001'
                    readSynStream(handler, j1, i1);
                    return true;

                case 2: // '\002'
                    readSynReply(handler, j1, i1);
                    return true;

                case 3: // '\003'
                    readRstStream(handler, j1, i1);
                    return true;

                case 4: // '\004'
                    readSettings(handler, j1, i1);
                    return true;

                case 6: // '\006'
                    readPing(handler, j1, i1);
                    return true;

                case 7: // '\007'
                    readGoAway(handler, j1, i1);
                    return true;

                case 8: // '\b'
                    readHeaders(handler, j1, i1);
                    return true;

                case 9: // '\t'
                    readWindowUpdate(handler, j1, i1);
                    break;
                }
                return true;
            }
            if ((j1 & 1) != 0)
            {
                flag = true;
            }
            handler.data(flag, 0x7fffffff & l, source, i1);
            return true;
        }

        public void readConnectionPreface()
        {
        }

        Reader(j j1, boolean flag)
        {
            source = j1;
            headerBlockReader = new NameValueBlockReader(source);
            client = flag;
        }
    }


    private class Writer
        implements FrameWriter
    {

        private final boolean client;
        private boolean closed;
        private final f headerBlockBuffer = new f();
        private final i headerBlockOut;
        private final i sink;

        private void writeNameValueBlockToBuffer(List list)
        {
            headerBlockOut.g(list.size());
            int i1 = list.size();
            for (int j = 0; j < i1; j++)
            {
                k k1 = ((Header)list.get(j)).name;
                headerBlockOut.g(k1.f());
                headerBlockOut.b(k1);
                k1 = ((Header)list.get(j)).value;
                headerBlockOut.g(k1.f());
                headerBlockOut.b(k1);
            }

            headerBlockOut.flush();
        }

        public void ackSettings(Settings settings1)
        {
        }

        public void close()
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

        public void data(boolean flag, int j, f f1, int i1)
        {
            this;
            JVM INSTR monitorenter ;
            int j1;
            if (flag)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            sendDataFrame(j, j1, f1, i1);
            this;
            JVM INSTR monitorexit ;
            return;
            f1;
            throw f1;
        }

        public void flush()
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

        public void goAway(int j, ErrorCode errorcode, byte abyte0[])
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
            sink.g(0x80030007);
            sink.g(8);
            sink.g(j);
            sink.g(errorcode.spdyGoAwayCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void headers(int j, List list)
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            writeNameValueBlockToBuffer(list);
            int i1 = (int)(headerBlockBuffer.a() + 4L);
            sink.g(0x80030008);
            sink.g(i1 & 0xffffff | 0);
            sink.g(0x7fffffff & j);
            sink.a(headerBlockBuffer);
            this;
            JVM INSTR monitorexit ;
        }

        public int maxDataLength()
        {
            return 16383;
        }

        public void ping(boolean flag, int j, int i1)
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
            if ((j & 1) == 1)
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
            sink.g(0x80030006);
            sink.g(4);
            sink.g(j);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public void pushPromise(int j, int i1, List list)
        {
        }

        public void rstStream(int j, ErrorCode errorcode)
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
            sink.g(0x80030003);
            sink.g(8);
            sink.g(0x7fffffff & j);
            sink.g(errorcode.spdyRstCode);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        void sendDataFrame(int j, int i1, f f1, int j1)
        {
            if (closed)
            {
                throw new IOException("closed");
            }
            if ((long)j1 > 0xffffffL)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("FRAME_TOO_LARGE max size is 16Mib: ").append(j1).toString());
            }
            sink.g(0x7fffffff & j);
            sink.g((i1 & 0xff) << 24 | 0xffffff & j1);
            if (j1 > 0)
            {
                sink.write(f1, j1);
            }
        }

        public void settings(Settings settings1)
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
            int j = settings1.size();
            sink.g(0x80030004);
            sink.g(j * 8 + 4 & 0xffffff | 0);
            sink.g(j);
            int i1 = 0;
_L2:
            if (i1 > 10)
            {
                break MISSING_BLOCK_LABEL_139;
            }
            if (!settings1.isSet(i1))
            {
                break MISSING_BLOCK_LABEL_151;
            }
            int j1 = settings1.flags(i1);
            sink.g((j1 & 0xff) << 24 | i1 & 0xffffff);
            sink.g(settings1.get(i1));
            break MISSING_BLOCK_LABEL_151;
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void synReply(boolean flag, int j, List list)
        {
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            writeNameValueBlockToBuffer(list);
            int i1;
            int j1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = (int)(headerBlockBuffer.a() + 4L);
            sink.g(0x80030002);
            sink.g((i1 & 0xff) << 24 | j1 & 0xffffff);
            sink.g(0x7fffffff & j);
            sink.a(headerBlockBuffer);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public void synStream(boolean flag, boolean flag1, int j, int i1, List list)
        {
            byte byte0 = 0;
            this;
            JVM INSTR monitorenter ;
            if (closed)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int j1;
            writeNameValueBlockToBuffer(list);
            j1 = (int)(10L + headerBlockBuffer.a());
            break MISSING_BLOCK_LABEL_49;
_L2:
            sink.g(0x80030001);
            sink.g(((byte0 | flag2) & 0xff) << 24 | j1 & 0xffffff);
            sink.g(j & 0x7fffffff);
            sink.g(i1 & 0x7fffffff);
            sink.h(0);
            sink.a(headerBlockBuffer);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            boolean flag2;
            if (flag)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1)
            {
                byte0 = 2;
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        public void windowUpdate(int j, long l1)
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
            if (l1 != 0L && l1 <= 0x7fffffffL)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            throw new IllegalArgumentException((new StringBuilder()).append("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(l1).toString());
            sink.g(0x80030009);
            sink.g(8);
            sink.g(j);
            sink.g((int)l1);
            sink.flush();
            this;
            JVM INSTR monitorexit ;
        }

        Writer(i j, boolean flag)
        {
            sink = j;
            client = flag;
            j = new Deflater();
            j.setDictionary(Spdy3.DICTIONARY);
            headerBlockOut = r.a(new l(headerBlockBuffer, j));
        }
    }

}
