// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.g;
import c.h;
import c.j;
import c.o;
import com.c.a.a.i;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.Deflater;

// Referenced classes of package com.c.a.a.b:
//            D, b, c, k, 
//            q, e, a, d

public final class r
    implements D
{
    static final class a
        implements com.c.a.a.b.b
    {

        private final h a;
        private final boolean b;
        private final k c;

        private static transient IOException a(String s, Object aobj[])
            throws IOException
        {
            throw new IOException(String.format(s, aobj));
        }

        private void a(b.a a1, int j, int l)
            throws IOException
        {
            boolean flag = true;
            int i1 = a.g();
            if (l != i1 * 8 + 4)
            {
                throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(i1)
                });
            }
            q q1 = new q();
            for (l = 0; l < i1; l++)
            {
                int j1 = a.g();
                q1.a(j1 & 0xffffff, (0xff000000 & j1) >>> 24, a.g());
            }

            if ((j & 1) == 0)
            {
                flag = false;
            }
            a1.a(flag, q1);
        }

        public final void a()
        {
        }

        public final boolean a(b.a a1)
            throws IOException
        {
            boolean flag = false;
            boolean flag1 = false;
            int j;
            int l;
            int i1;
            int j1;
            try
            {
                l = a.g();
                j1 = a.g();
            }
            // Misplaced declaration of an exception variable
            catch (b.a a1)
            {
                return false;
            }
            if ((0x80000000 & l) != 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            i1 = (0xff000000 & j1) >>> 24;
            j1 = 0xffffff & j1;
            if (j != 0)
            {
                j = (0x7fff0000 & l) >>> 16;
                if (j != 3)
                {
                    throw new ProtocolException((new StringBuilder("version != 3: ")).append(j).toString());
                }
                switch (l & 0xffff)
                {
                case 5: // '\005'
                default:
                    a.f(j1);
                    return true;

                case 1: // '\001'
                    j = a.g();
                    a.g();
                    a.f();
                    List list = c.a(j1 - 10);
                    if ((i1 & 1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ((i1 & 2) != 0)
                    {
                        flag1 = true;
                    }
                    a1.a(flag1, flag, j & 0x7fffffff, list, e.a);
                    return true;

                case 2: // '\002'
                    j = a.g();
                    List list1 = c.a(j1 - 4);
                    if ((i1 & 1) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.a(false, flag, j & 0x7fffffff, list1, e.b);
                    return true;

                case 3: // '\003'
                    if (j1 != 8)
                    {
                        throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    j = a.g();
                    l = a.g();
                    com.c.a.a.b.a a2 = com.c.a.a.b.a.a(l);
                    if (a2 == null)
                    {
                        throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                            Integer.valueOf(l)
                        });
                    } else
                    {
                        a1.a(j & 0x7fffffff, a2);
                        return true;
                    }

                case 4: // '\004'
                    a(a1, i1, j1);
                    return true;

                case 6: // '\006'
                    if (j1 != 4)
                    {
                        throw a("TYPE_PING length: %d != 4", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    j = a.g();
                    boolean flag2 = b;
                    if ((j & 1) == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag2 == flag)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a1.a(flag, j, 0);
                    return true;

                case 7: // '\007'
                    if (j1 != 8)
                    {
                        throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                            Integer.valueOf(j1)
                        });
                    }
                    j = a.g();
                    l = a.g();
                    if (com.c.a.a.b.a.c(l) == null)
                    {
                        throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                            Integer.valueOf(l)
                        });
                    } else
                    {
                        a1.a(j & 0x7fffffff, c.i.b);
                        return true;
                    }

                case 8: // '\b'
                    a1.a(false, false, a.g() & 0x7fffffff, c.a(j1 - 4), e.c);
                    return true;

                case 9: // '\t'
                    break;
                }
                if (j1 != 8)
                {
                    throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                j = a.g();
                long l1 = a.g() & 0x7fffffff;
                if (l1 == 0L)
                {
                    throw a("windowSizeIncrement was 0", new Object[] {
                        Long.valueOf(l1)
                    });
                } else
                {
                    a1.a(j & 0x7fffffff, l1);
                    return true;
                }
            }
            if ((i1 & 1) != 0)
            {
                flag = true;
            }
            a1.a(flag, l & 0x7fffffff, a, j1);
            return true;
        }

        public final void close()
            throws IOException
        {
            c.b.close();
        }

        a(h h1, boolean flag)
        {
            a = h1;
            c = new k(a);
            b = flag;
        }
    }

    static final class b
        implements c
    {

        private final g a;
        private final e b = new e();
        private final g c;
        private final boolean d;
        private boolean e;

        private void a(List list)
            throws IOException
        {
            if (b.b != 0L)
            {
                throw new IllegalStateException();
            }
            c.e(list.size());
            int i1 = list.size();
            for (int l = 0; l < i1; l++)
            {
                c.i k = ((d)list.get(l)).h;
                c.e(k.c.length);
                c.b(k);
                k = ((d)list.get(l)).i;
                c.e(k.c.length);
                c.b(k);
            }

            c.flush();
        }

        public final void a()
        {
            this;
            JVM INSTR monitorenter ;
        }

        public final void a(int k, long l)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
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
                break MISSING_BLOCK_LABEL_64;
            }
            throw new IllegalArgumentException((new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ")).append(l).toString());
            a.e(0x80030009);
            a.e(8);
            a.e(k);
            a.e((int)l);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int k, com.c.a.a.b.a a1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            a1;
            this;
            JVM INSTR monitorexit ;
            throw a1;
            if (a1.t == -1)
            {
                throw new IllegalArgumentException();
            }
            a.e(0x80030003);
            a.e(8);
            a.e(0x7fffffff & k);
            a.e(a1.t);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int k, com.c.a.a.b.a a1, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            a1;
            this;
            JVM INSTR monitorexit ;
            throw a1;
            if (a1.u == -1)
            {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
            a.e(0x80030007);
            a.e(8);
            a.e(k);
            a.e(a1.u);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(q q1)
        {
        }

        public final void a(boolean flag, int k, int l)
            throws IOException
        {
            boolean flag2 = true;
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            boolean flag3 = d;
            boolean flag1;
            if ((k & 1) == 1)
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
            a.e(0x80030006);
            a.e(4);
            a.e(k);
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L1:
            if (true) goto _L3; else goto _L2
_L2:
        }

        public final void a(boolean flag, int k, e e1, int l)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            int i1;
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_37;
            e1;
            this;
            JVM INSTR monitorexit ;
            throw e1;
            if ((long)l <= 0xffffffL)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            throw new IllegalArgumentException((new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ")).append(l).toString());
            a.e(0x7fffffff & k);
            a.e((i1 & 0xff) << 24 | 0xffffff & l);
            if (l <= 0)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            a.write(e1, l);
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int k, List list)
            throws IOException
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_27;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int l;
            a(list);
            l = (int)(10L + b.b);
            if (flag)
            {
                flag1 = true;
            }
            a.e(0x80030001);
            a.e(((flag1 | false) & 0xff) << 24 | l & 0xffffff);
            a.e(0x7fffffff & k);
            a.e(0);
            a.f(0);
            a.a(b);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void b()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void b(q q1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (e)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            q1;
            this;
            JVM INSTR monitorexit ;
            throw q1;
            int k = Integer.bitCount(q1.a);
            a.e(0x80030004);
            a.e(k * 8 + 4 & 0xffffff | 0);
            a.e(k);
            int l = 0;
_L2:
            if (l > 10)
            {
                break MISSING_BLOCK_LABEL_140;
            }
            if (q1.a(l))
            {
                int i1 = q1.b(l);
                a.e((i1 & 0xff) << 24 | l & 0xffffff);
                a.e(q1.d[l]);
            }
            break MISSING_BLOCK_LABEL_152;
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
            l++;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final int c()
        {
            return 16383;
        }

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            e = true;
            i.a(a, c);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        b(g g1, boolean flag)
        {
            a = g1;
            d = flag;
            g1 = new Deflater();
            g1.setDictionary(r.a);
            c = o.a(new j(b, g1));
        }
    }


    static final byte a[];

    public r()
    {
    }

    public final com.c.a.a.b.b a(h h, boolean flag)
    {
        return new a(h, flag);
    }

    public final c a(g g, boolean flag)
    {
        return new b(g, flag);
    }

    static 
    {
        try
        {
            a = "\000\000\000\007options\000\000\000\004head\000\000\000\004post\000\000\000\003put\000\000\000\006delete\000\000\000\005trace\000\000\000\006accept\000\000\000\016accept-charset\000\000\000\017accept-encoding\000\000\000\017accept-language\000\000\000\raccept-ranges\000\000\000\003age\000\000\000\005allow\000\000\000\rauthorization\000\000\000\rcache-control\000\000\000\nconnection\000\000\000\fcontent-base\000\000\000\020content-encoding\000\000\000\020content-language\000\000\000\016content-length\000\000\000\020content-location\000\000\000\013content-md5\000\000\000\rcontent-range\000\000\000\fcontent-type\000\000\000\004date\000\000\000\004etag\000\000\000\006expect\000\000\000\007expires\000\000\000\004from\000\000\000\004host\000\000\000\bif-match\000\000\000\021if-modified-since\000\000\000\rif-none-match\000\000\000\bif-range\000\000\000\023if-unmodified-since\000\000\000\rlast-modified\000\000\000\blocation\000\000\000\fmax-forwards\000\000\000\006pragma\000\000\000\022proxy-authenticate\000\000\000\023proxy-authorization\000\000\000\005range\000\000\000\007referer\000\000\000\013retry-after\000\000\000\006server\000\000\000\002te\000\000\000\007trailer\000\000\000\021transfer-encoding\000\000\000\007upgrade\000\000\000\nuser-agent\000\000\000\004vary\000\000\000\003via\000\000\000\007warning\000\000\000\020www-authenticate\000\000\000\006method\000\000\000\003get\000\000\000\006status\000\000\000\006200 OK\000\000\000\007version\000\000\000\bHTTP/1.1\000\000\000\003url\000\000\000\006public\000\000\000\nset-cookie\000\000\000\nkeep-alive\000\000\000\006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(i.c.name());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new AssertionError();
        }
    }
}
