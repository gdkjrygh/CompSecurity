// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.d;
import okio.e;
import okio.r;
import okio.s;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            o, a, b, f, 
//            e, HeadersMode, ErrorCode, m

public final class g
    implements o
{
    static final class a
        implements r
    {

        int a;
        byte b;
        int c;
        int d;
        short e;
        private final e f;

        public final long a(okio.c c1, long l)
            throws IOException
        {
_L7:
            if (d != 0) goto _L2; else goto _L1
_L1:
            f.f(e);
            e = 0;
            if ((b & 4) == 0) goto _L4; else goto _L3
_L3:
            return -1L;
_L4:
            int i = c;
            int j = g.a(f);
            d = j;
            a = j;
            byte byte0 = (byte)(f.f() & 0xff);
            b = (byte)(f.f() & 0xff);
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(true, c, a, byte0, b));
            }
            c = f.h() & 0x7fffffff;
            if (byte0 != 9)
            {
                throw g.a("%s != TYPE_CONTINUATION", new Object[] {
                    Byte.valueOf(byte0)
                });
            }
            if (c != i)
            {
                throw g.a("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l = f.a(c1, Math.min(l, d));
            if (l == -1L) goto _L3; else goto _L5
_L5:
            d = (int)((long)d - l);
            return l;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public final void close()
            throws IOException
        {
        }

        public final s q_()
        {
            return f.q_();
        }

        public a(e e1)
        {
            f = e1;
        }
    }

    static final class b
    {

        private static final String a[] = {
            "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
        };
        private static final String b[];
        private static final String c[];

        static String a(boolean flag, int i, int j, byte byte0, byte byte1)
        {
            String s;
            String s2;
            if (byte0 < a.length)
            {
                s2 = a[byte0];
            } else
            {
                s2 = String.format("0x%02x", new Object[] {
                    Byte.valueOf(byte0)
                });
            }
            if (byte1 != 0) goto _L2; else goto _L1
_L1:
            s = "";
_L4:
            String s1;
            if (flag)
            {
                s1 = "<<";
            } else
            {
                s1 = ">>";
            }
            return String.format("%s 0x%08x %5d %-13s %s", new Object[] {
                s1, Integer.valueOf(i), Integer.valueOf(j), s2, s
            });
_L2:
            switch (byte0)
            {
            case 5: // '\005'
            default:
                if (byte1 < b.length)
                {
                    s1 = b[byte1];
                } else
                {
                    s1 = c[byte1];
                }
                if (byte0 == 5 && (byte1 & 4) != 0)
                {
                    s = s1.replace("HEADERS", "PUSH_PROMISE");
                } else
                {
                    s = s1;
                    if (byte0 == 0)
                    {
                        s = s1;
                        if ((byte1 & 0x20) != 0)
                        {
                            s = s1.replace("PRIORITY", "COMPRESSED");
                        }
                    }
                }
                break;

            case 4: // '\004'
            case 6: // '\006'
                if (byte1 == 1)
                {
                    s = "ACK";
                } else
                {
                    s = c[byte1];
                }
                break;

            case 2: // '\002'
            case 3: // '\003'
            case 7: // '\007'
            case 8: // '\b'
                s = c[byte1];
                break;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        static 
        {
            boolean flag = false;
            b = new String[64];
            c = new String[256];
            for (int i = 0; i < c.length; i++)
            {
                c[i] = String.format("%8s", new Object[] {
                    Integer.toBinaryString(i)
                }).replace(' ', '0');
            }

            b[0] = "";
            b[1] = "END_STREAM";
            int ai[] = new int[1];
            ai[0] = 1;
            b[8] = "PADDED";
            for (int j = 0; j <= 0; j++)
            {
                int l = ai[j];
                b[l | 8] = (new StringBuilder()).append(b[l]).append("|PADDED").toString();
            }

            b[4] = "END_HEADERS";
            b[32] = "PRIORITY";
            b[36] = "END_HEADERS|PRIORITY";
            int k = 0;
            int i1;
            do
            {
                i1 = ((flag) ? 1 : 0);
                if (k >= 3)
                {
                    break;
                }
                int j1 = (new int[] {
                    4, 32, 36
                })[k];
                for (i1 = 0; i1 <= 0; i1++)
                {
                    int k1 = ai[i1];
                    b[k1 | j1] = (new StringBuilder()).append(b[k1]).append('|').append(b[j1]).toString();
                    b[k1 | j1 | 8] = (new StringBuilder()).append(b[k1]).append('|').append(b[j1]).append("|PADDED").toString();
                }

                k++;
            } while (true);
            for (; i1 < b.length; i1++)
            {
                if (b[i1] == null)
                {
                    b[i1] = c[i1];
                }
            }

        }

        b()
        {
        }
    }

    static final class c
        implements com.squareup.okhttp.internal.framed.a
    {

        final f.a a;
        private final e b;
        private final a c;
        private final boolean d;

        private List a(int i, short word0, byte byte0, int j)
            throws IOException
        {
            Object obj = c;
            c.d = i;
            obj.a = i;
            c.e = word0;
            c.b = byte0;
            c.c = j;
            for (obj = a; !((f.a) (obj)).b.d();)
            {
                i = ((f.a) (obj)).b.f() & 0xff;
                if (i == 128)
                {
                    throw new IOException("index == 0");
                }
                if ((i & 0x80) == 128)
                {
                    i = ((f.a) (obj)).a(i, 127) - 1;
                    if (f.a.c(i))
                    {
                        com.squareup.okhttp.internal.framed.e e1 = f.a()[i];
                        ((f.a) (obj)).a.add(e1);
                    } else
                    {
                        j = ((f.a) (obj)).a(i - f.a().length);
                        if (j < 0 || j > ((f.a) (obj)).e.length - 1)
                        {
                            throw new IOException((new StringBuilder("Header index too large ")).append(i + 1).toString());
                        }
                        ((f.a) (obj)).a.add(((f.a) (obj)).e[j]);
                    }
                } else
                if (i == 64)
                {
                    ((f.a) (obj)).a(new com.squareup.okhttp.internal.framed.e(f.a(((f.a) (obj)).b()), ((f.a) (obj)).b()));
                } else
                if ((i & 0x40) == 64)
                {
                    ((f.a) (obj)).a(new com.squareup.okhttp.internal.framed.e(((f.a) (obj)).b(((f.a) (obj)).a(i, 63) - 1), ((f.a) (obj)).b()));
                } else
                if ((i & 0x20) == 32)
                {
                    obj.d = ((f.a) (obj)).a(i, 31);
                    if (((f.a) (obj)).d < 0 || ((f.a) (obj)).d > ((f.a) (obj)).c)
                    {
                        throw new IOException((new StringBuilder("Invalid dynamic table size update ")).append(((f.a) (obj)).d).toString());
                    }
                    ((f.a) (obj)).a();
                } else
                if (i == 16 || i == 0)
                {
                    ByteString bytestring = f.a(((f.a) (obj)).b());
                    ByteString bytestring2 = ((f.a) (obj)).b();
                    ((f.a) (obj)).a.add(new com.squareup.okhttp.internal.framed.e(bytestring, bytestring2));
                } else
                {
                    ByteString bytestring1 = ((f.a) (obj)).b(((f.a) (obj)).a(i, 15) - 1);
                    ByteString bytestring3 = ((f.a) (obj)).b();
                    ((f.a) (obj)).a.add(new com.squareup.okhttp.internal.framed.e(bytestring1, bytestring3));
                }
            }

            obj = a;
            ArrayList arraylist = new ArrayList(((f.a) (obj)).a);
            ((f.a) (obj)).a.clear();
            return arraylist;
        }

        private void b()
            throws IOException
        {
            b.h();
            b.f();
        }

        public final void a()
            throws IOException
        {
            if (!d)
            {
                ByteString bytestring = b.c(g.a().c.length);
                if (g.b().isLoggable(Level.FINE))
                {
                    g.b().fine(String.format("<< CONNECTION %s", new Object[] {
                        bytestring.b()
                    }));
                }
                if (!g.a().equals(bytestring))
                {
                    throw g.a("Expected a connection header but was %s", new Object[] {
                        bytestring.a()
                    });
                }
            }
        }

        public final boolean a(a.a a1)
            throws IOException
        {
            int i;
            boolean flag;
            int j2;
            boolean flag2;
            boolean flag6;
            flag2 = true;
            flag = false;
            flag6 = false;
            i = 0;
            try
            {
                b.a(9L);
                break MISSING_BLOCK_LABEL_24;
            }
            // Misplaced declaration of an exception variable
            catch (a.a a1)
            {
                flag2 = false;
            }
_L12:
            return flag2;
            byte byte0;
            byte byte1;
            int i2;
            j2 = g.a(b);
            if (j2 < 0 || j2 > 16384)
            {
                throw g.a("FRAME_SIZE_ERROR: %s", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            byte0 = (byte)(b.f() & 0xff);
            byte1 = (byte)(b.f() & 0xff);
            i2 = b.h() & 0x7fffffff;
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(true, i2, j2, byte0, byte1));
            }
            byte0;
            JVM INSTR tableswitch 0 8: default 196
        //                       0 210
        //                       1 319
        //                       2 432
        //                       3 477
        //                       4 570
        //                       5 899
        //                       6 981
        //                       7 1072
        //                       8 1206;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            b.f(j2);
            return true;
_L2:
            boolean flag1;
            boolean flag3;
            if ((byte1 & 1) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if ((byte1 & 0x20) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                throw g.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            }
            if ((byte1 & 8) != 0)
            {
                i = (short)(b.f() & 0xff);
            }
            int j = g.a(j2, byte1, i);
            a1.a(flag3, i2, b, j);
            b.f(i);
            return true;
_L3:
            if (i2 == 0)
            {
                throw g.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            int k;
            boolean flag4;
            if ((byte1 & 1) != 0)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if ((byte1 & 8) != 0)
            {
                i = (short)(b.f() & 0xff);
            } else
            {
                i = 0;
            }
            k = j2;
            if ((byte1 & 0x20) != 0)
            {
                b();
                k = j2 - 5;
            }
            a1.a(false, flag4, i2, a(g.a(k, byte1, i), i, byte1, i2), com.squareup.okhttp.internal.framed.HeadersMode.d);
            return true;
_L4:
            if (j2 != 5)
            {
                throw g.a("TYPE_PRIORITY length: %d != 5", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            if (i2 == 0)
            {
                throw g.a("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else
            {
                b();
                return true;
            }
_L5:
            if (j2 != 4)
            {
                throw g.a("TYPE_RST_STREAM length: %d != 4", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            if (i2 == 0)
            {
                throw g.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int l = b.h();
            ErrorCode errorcode = ErrorCode.b(l);
            if (errorcode == null)
            {
                throw g.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(l)
                });
            } else
            {
                a1.a(i2, errorcode);
                return true;
            }
_L6:
            if (i2 != 0)
            {
                throw g.a("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((byte1 & 1) == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (j2 != 0)
            {
                throw g.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (true) goto _L12; else goto _L11
_L11:
            m m1;
            int i1;
            if (j2 % 6 != 0)
            {
                throw g.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            m1 = new m();
            i1 = 0;
_L21:
            if (i1 >= j2) goto _L14; else goto _L13
_L13:
            int k2;
            i = b.g();
            k2 = b.h();
            i2 = i;
            i;
            JVM INSTR tableswitch 1 6: default 720
        //                       1 772
        //                       2 739
        //                       3 769
        //                       4 793
        //                       5 813
        //                       6 772;
               goto _L15 _L16 _L17 _L18 _L19 _L20 _L16
_L16:
            break; /* Loop/switch isn't completed */
_L15:
            throw g.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
                Short.valueOf(i)
            });
_L17:
            i2 = i;
            if (k2 != 0)
            {
                i2 = i;
                if (k2 != 1)
                {
                    throw g.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            }
            break; /* Loop/switch isn't completed */
_L18:
            i2 = 4;
_L23:
            m1.a(i2, 0, k2);
            i1 += 6;
              goto _L21
_L19:
            i2 = 7;
            if (k2 >= 0) goto _L23; else goto _L22
_L22:
            throw g.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L20:
            if (k2 < 16384)
            {
                break; /* Loop/switch isn't completed */
            }
            i2 = i;
            if (k2 <= 0xffffff) goto _L23; else goto _L24
_L24:
            throw g.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
                Integer.valueOf(k2)
            });
_L14:
            a1.a(false, m1);
            if (m1.a() >= 0)
            {
                a1 = a;
                int j1 = m1.a();
                a1.c = j1;
                a1.d = j1;
                a1.a();
                return true;
            }
              goto _L12
_L7:
            if (i2 == 0)
            {
                throw g.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short word0 = flag;
            if ((byte1 & 8) != 0)
            {
                word0 = (short)(b.f() & 0xff);
            }
            a1.a(b.h() & 0x7fffffff, a(g.a(j2 - 4, byte1, word0), word0, byte1, i2));
            return true;
_L8:
            if (j2 != 8)
            {
                throw g.a("TYPE_PING length != 8: %s", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            if (i2 != 0)
            {
                throw g.a("TYPE_PING streamId != 0", new Object[0]);
            }
            int k1 = b.h();
            i2 = b.h();
            boolean flag5 = flag6;
            if ((byte1 & 1) != 0)
            {
                flag5 = true;
            }
            a1.a(flag5, k1, i2);
            return true;
_L9:
            if (j2 < 8)
            {
                throw g.a("TYPE_GOAWAY length < 8: %s", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            if (i2 != 0)
            {
                throw g.a("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int l1 = b.h();
            i2 = b.h();
            j2 -= 8;
            if (ErrorCode.b(i2) == null)
            {
                throw g.a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(i2)
                });
            }
            ByteString bytestring = ByteString.b;
            if (j2 > 0)
            {
                bytestring = b.c(j2);
            }
            a1.a(l1, bytestring);
            return true;
_L10:
            if (j2 != 4)
            {
                throw g.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                    Integer.valueOf(j2)
                });
            }
            long l2 = (long)b.h() & 0x7fffffffL;
            if (l2 == 0L)
            {
                throw g.a("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l2)
                });
            } else
            {
                a1.a(i2, l2);
                return true;
            }
        }

        public final void close()
            throws IOException
        {
            b.close();
        }

        c(e e1, boolean flag)
        {
            b = e1;
            d = flag;
            c = new a(b);
            a = new f.a(c);
        }
    }

    static final class d
        implements com.squareup.okhttp.internal.framed.b
    {

        private final okio.d a;
        private final boolean b;
        private final okio.c c = new okio.c();
        private final f.b d;
        private int e;
        private boolean f;

        private void a(int i, int j, byte byte0, byte byte1)
            throws IOException
        {
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(false, i, j, byte0, byte1));
            }
            if (j > e)
            {
                throw g.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                    Integer.valueOf(e), Integer.valueOf(j)
                });
            }
            if ((0x80000000 & i) != 0)
            {
                throw g.b("reserved bit set: %s", new Object[] {
                    Integer.valueOf(i)
                });
            } else
            {
                g.a(a, j);
                a.h(byte0 & 0xff);
                a.h(byte1 & 0xff);
                a.f(0x7fffffff & i);
                return;
            }
        }

        private void b(int i, long l)
            throws IOException
        {
            while (l > 0L) 
            {
                int j = (int)Math.min(e, l);
                l -= j;
                byte byte0;
                if (l == 0L)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                a(i, j, (byte)9, byte0);
                a.a_(c, j);
            }
        }

        public final void a()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            boolean flag = b;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_36;
            }
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(String.format(">> CONNECTION %s", new Object[] {
                    g.a().b()
                }));
            }
            a.c(g.a().d());
            a.flush();
              goto _L1
        }

        public final void a(int i, long l)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
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
                break MISSING_BLOCK_LABEL_57;
            }
            throw g.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
                Long.valueOf(l)
            });
            a(i, 4, (byte)8, (byte)0);
            a.f((int)l);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int i, ErrorCode errorcode)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.s == -1)
            {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte)3, (byte)0);
            a.f(errorcode.s);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int i, ErrorCode errorcode, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            errorcode;
            this;
            JVM INSTR monitorexit ;
            throw errorcode;
            if (errorcode.s == -1)
            {
                throw g.b("errorCode.httpCode == -1", new Object[0]);
            }
            a(0, abyte0.length + 8, (byte)7, (byte)0);
            a.f(i);
            a.f(errorcode.s);
            if (abyte0.length > 0)
            {
                a.c(abyte0);
            }
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(m m1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            m1;
            this;
            JVM INSTR monitorexit ;
            throw m1;
            int i = e;
            if ((m1.a & 0x20) != 0)
            {
                i = m1.d[5];
            }
            e = i;
            a(0, 0, (byte)4, (byte)1);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int i, int j)
            throws IOException
        {
            byte byte0 = 0;
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_29;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
            if (flag)
            {
                byte0 = 1;
            }
            a(0, 8, (byte)6, byte0);
            a.f(i);
            a.f(j);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int i, List list)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            list;
            this;
            JVM INSTR monitorexit ;
            throw list;
            int j;
            long l;
            if (f)
            {
                throw new IOException("closed");
            }
            d.a(list);
            l = c.b;
            j = (int)Math.min(e, l);
            break MISSING_BLOCK_LABEL_71;
_L2:
            a(i, j, (byte)1, byte1);
            a.a_(c, j);
            if (l <= (long)j)
            {
                break MISSING_BLOCK_LABEL_132;
            }
            b(i, l - (long)j);
            this;
            JVM INSTR monitorexit ;
            return;
            byte byte0;
            byte byte1;
            if (l == (long)j)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            byte1 = byte0;
            if (flag)
            {
                byte1 = (byte)(byte0 | 1);
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        public final void a(boolean flag, int i, okio.c c1, int j)
            throws IOException
        {
            byte byte0 = 0;
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_27;
            c1;
            this;
            JVM INSTR monitorexit ;
            throw c1;
            if (flag)
            {
                byte0 = 1;
            }
            a(i, j, (byte)0, byte0);
            if (j <= 0)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            a.a_(c1, j);
            this;
            JVM INSTR monitorexit ;
        }

        public final void b()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
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

        public final void b(m m1)
            throws IOException
        {
            int i = 0;
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            m1;
            this;
            JVM INSTR monitorexit ;
            throw m1;
            a(0, Integer.bitCount(m1.a) * 6, (byte)4, (byte)0);
_L8:
            if (i >= 10) goto _L2; else goto _L1
_L1:
            if (!m1.a(i)) goto _L4; else goto _L3
_L3:
            if (i != 4) goto _L6; else goto _L5
_L5:
            int j = 3;
_L7:
            a.g(j);
            a.f(m1.d[i]);
              goto _L4
_L2:
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L10:
            j = i;
              goto _L7
_L4:
            i++;
              goto _L8
_L6:
            if (i != 7) goto _L10; else goto _L9
_L9:
            j = 4;
              goto _L7
        }

        public final int c()
        {
            return e;
        }

        public final void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            f = true;
            a.close();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        d(okio.d d1, boolean flag)
        {
            a = d1;
            b = flag;
            d = new f.b(c);
            e = 16384;
        }
    }


    private static final Logger a = Logger.getLogger(com/squareup/okhttp/internal/framed/g$b.getName());
    private static final ByteString b = ByteString.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public g()
    {
    }

    static int a(int i, byte byte0, short word0)
        throws IOException
    {
        int j = i;
        if ((byte0 & 8) != 0)
        {
            j = i - 1;
        }
        if (word0 > j)
        {
            throw c("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word0), Integer.valueOf(j)
            });
        } else
        {
            return (short)(j - word0);
        }
    }

    static int a(e e1)
        throws IOException
    {
        return (e1.f() & 0xff) << 16 | (e1.f() & 0xff) << 8 | e1.f() & 0xff;
    }

    static IOException a(String s, Object aobj[])
        throws IOException
    {
        return c(s, aobj);
    }

    static ByteString a()
    {
        return b;
    }

    static void a(okio.d d1, int i)
        throws IOException
    {
        d1.h(i >>> 16 & 0xff);
        d1.h(i >>> 8 & 0xff);
        d1.h(i & 0xff);
    }

    static IllegalArgumentException b(String s, Object aobj[])
    {
        throw new IllegalArgumentException(String.format(s, aobj));
    }

    static Logger b()
    {
        return a;
    }

    private static transient IOException c(String s, Object aobj[])
        throws IOException
    {
        throw new IOException(String.format(s, aobj));
    }

    public final com.squareup.okhttp.internal.framed.a a(e e1, boolean flag)
    {
        return new c(e1, flag);
    }

    public final com.squareup.okhttp.internal.framed.b a(okio.d d1, boolean flag)
    {
        return new d(d1, flag);
    }

}
