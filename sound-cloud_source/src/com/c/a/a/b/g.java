// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.h;
import c.i;
import c.y;
import c.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.a.b:
//            D, b, c, f, 
//            d, e, a, q

public final class g
    implements D
{
    static final class a
        implements y
    {

        int a;
        byte b;
        int c;
        int d;
        short e;
        private final h f;

        public final long a(e e1, long l)
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
            int j = c;
            int k = g.a(f);
            d = k;
            a = k;
            byte byte0 = (byte)(f.e() & 0xff);
            b = (byte)(f.e() & 0xff);
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(true, c, a, byte0, b));
            }
            c = f.g() & 0x7fffffff;
            if (byte0 != 9)
            {
                throw g.a("%s != TYPE_CONTINUATION", new Object[] {
                    Byte.valueOf(byte0)
                });
            }
            if (c != j)
            {
                throw g.a("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            l = f.a(e1, Math.min(l, d));
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

        public final z timeout()
        {
            return f.timeout();
        }

        public a(h h1)
        {
            f = h1;
        }
    }

    static final class b
    {

        private static final String a[] = {
            "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"
        };
        private static final String b[];
        private static final String c[];

        static String a(boolean flag, int j, int k, byte byte0, byte byte1)
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
                s1, Integer.valueOf(j), Integer.valueOf(k), s2, s
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
            for (int j = 0; j < c.length; j++)
            {
                c[j] = String.format("%8s", new Object[] {
                    Integer.toBinaryString(j)
                }).replace(' ', '0');
            }

            b[0] = "";
            b[1] = "END_STREAM";
            int ai[] = new int[1];
            ai[0] = 1;
            b[8] = "PADDED";
            for (int k = 0; k <= 0; k++)
            {
                int i1 = ai[k];
                b[i1 | 8] = (new StringBuilder()).append(b[i1]).append("|PADDED").toString();
            }

            b[4] = "END_HEADERS";
            b[32] = "PRIORITY";
            b[36] = "END_HEADERS|PRIORITY";
            int l = 0;
            int j1;
            do
            {
                j1 = ((flag) ? 1 : 0);
                if (l >= 3)
                {
                    break;
                }
                int k1 = (new int[] {
                    4, 32, 36
                })[l];
                for (j1 = 0; j1 <= 0; j1++)
                {
                    int l1 = ai[j1];
                    b[l1 | k1] = (new StringBuilder()).append(b[l1]).append('|').append(b[k1]).toString();
                    b[l1 | k1 | 8] = (new StringBuilder()).append(b[l1]).append('|').append(b[k1]).append("|PADDED").toString();
                }

                l++;
            } while (true);
            for (; j1 < b.length; j1++)
            {
                if (b[j1] == null)
                {
                    b[j1] = c[j1];
                }
            }

        }

        b()
        {
        }
    }

    static final class c
        implements com.c.a.a.b.b
    {

        final f.a a;
        private final h b;
        private final a c;
        private final boolean d;

        private List a(int j, short word0, byte byte0, int k)
            throws IOException
        {
            Object obj = c;
            c.d = j;
            obj.a = j;
            c.e = word0;
            c.b = byte0;
            c.c = k;
            for (obj = a; !((f.a) (obj)).b.c();)
            {
                j = ((f.a) (obj)).b.e() & 0xff;
                if (j == 128)
                {
                    throw new IOException("index == 0");
                }
                if ((j & 0x80) == 128)
                {
                    j = ((f.a) (obj)).a(j, 127) - 1;
                    if (f.a.c(j))
                    {
                        com.c.a.a.b.d d1 = f.a()[j];
                        ((f.a) (obj)).a.add(d1);
                    } else
                    {
                        k = ((f.a) (obj)).a(j - f.a().length);
                        if (k < 0 || k > ((f.a) (obj)).e.length - 1)
                        {
                            throw new IOException((new StringBuilder("Header index too large ")).append(j + 1).toString());
                        }
                        ((f.a) (obj)).a.add(((f.a) (obj)).e[k]);
                    }
                } else
                if (j == 64)
                {
                    ((f.a) (obj)).a(new com.c.a.a.b.d(f.a(((f.a) (obj)).b()), ((f.a) (obj)).b()));
                } else
                if ((j & 0x40) == 64)
                {
                    ((f.a) (obj)).a(new com.c.a.a.b.d(((f.a) (obj)).b(((f.a) (obj)).a(j, 63) - 1), ((f.a) (obj)).b()));
                } else
                if ((j & 0x20) == 32)
                {
                    obj.d = ((f.a) (obj)).a(j, 31);
                    if (((f.a) (obj)).d < 0 || ((f.a) (obj)).d > ((f.a) (obj)).c)
                    {
                        throw new IOException((new StringBuilder("Invalid dynamic table size update ")).append(((f.a) (obj)).d).toString());
                    }
                    ((f.a) (obj)).a();
                } else
                if (j == 16 || j == 0)
                {
                    i l = f.a(((f.a) (obj)).b());
                    i j1 = ((f.a) (obj)).b();
                    ((f.a) (obj)).a.add(new com.c.a.a.b.d(l, j1));
                } else
                {
                    i i1 = ((f.a) (obj)).b(((f.a) (obj)).a(j, 15) - 1);
                    i k1 = ((f.a) (obj)).b();
                    ((f.a) (obj)).a.add(new com.c.a.a.b.d(i1, k1));
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
            b.g();
            b.e();
        }

        public final void a()
            throws IOException
        {
            if (!d)
            {
                i j = b.c(g.a().c.length);
                if (g.b().isLoggable(Level.FINE))
                {
                    g.b().fine(String.format("<< CONNECTION %s", new Object[] {
                        j.b()
                    }));
                }
                if (!g.a().equals(j))
                {
                    throw g.a("Expected a connection header but was %s", new Object[] {
                        j.a()
                    });
                }
            }
        }

        public final boolean a(b.a a1)
            throws IOException
        {
            int j;
            boolean flag;
            int l2;
            boolean flag2;
            boolean flag6;
            flag2 = true;
            flag = false;
            flag6 = false;
            j = 0;
            try
            {
                b.a(9L);
                break MISSING_BLOCK_LABEL_24;
            }
            // Misplaced declaration of an exception variable
            catch (b.a a1)
            {
                flag2 = false;
            }
_L12:
            return flag2;
            byte byte0;
            byte byte1;
            int k2;
            l2 = g.a(b);
            if (l2 < 0 || l2 > 16384)
            {
                throw g.a("FRAME_SIZE_ERROR: %s", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            byte0 = (byte)(b.e() & 0xff);
            byte1 = (byte)(b.e() & 0xff);
            k2 = b.g() & 0x7fffffff;
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(true, k2, l2, byte0, byte1));
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
            b.f(l2);
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
                j = (short)(b.e() & 0xff);
            }
            int l = g.a(l2, byte1, j);
            a1.a(flag3, k2, b, l);
            b.f(j);
            return true;
_L3:
            if (k2 == 0)
            {
                throw g.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            }
            int i1;
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
                j = (short)(b.e() & 0xff);
            } else
            {
                j = 0;
            }
            i1 = l2;
            if ((byte1 & 0x20) != 0)
            {
                b();
                i1 = l2 - 5;
            }
            a1.a(false, flag4, k2, a(g.a(i1, byte1, j), j, byte1, k2), e.d);
            return true;
_L4:
            if (l2 != 5)
            {
                throw g.a("TYPE_PRIORITY length: %d != 5", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            if (k2 == 0)
            {
                throw g.a("TYPE_PRIORITY streamId == 0", new Object[0]);
            } else
            {
                b();
                return true;
            }
_L5:
            if (l2 != 4)
            {
                throw g.a("TYPE_RST_STREAM length: %d != 4", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            if (k2 == 0)
            {
                throw g.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
            int j1 = b.g();
            com.c.a.a.b.a a2 = com.c.a.a.b.a.b(j1);
            if (a2 == null)
            {
                throw g.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                    Integer.valueOf(j1)
                });
            } else
            {
                a1.a(k2, a2);
                return true;
            }
_L6:
            if (k2 != 0)
            {
                throw g.a("TYPE_SETTINGS streamId != 0", new Object[0]);
            }
            if ((byte1 & 1) == 0)
            {
                break; /* Loop/switch isn't completed */
            }
            if (l2 != 0)
            {
                throw g.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            if (true) goto _L12; else goto _L11
_L11:
            q q1;
            int k1;
            if (l2 % 6 != 0)
            {
                throw g.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            q1 = new q();
            k1 = 0;
_L21:
            if (k1 >= l2) goto _L14; else goto _L13
_L13:
            int i3;
            j = b.f();
            i3 = b.g();
            k2 = j;
            j;
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
                Short.valueOf(j)
            });
_L17:
            k2 = j;
            if (i3 != 0)
            {
                k2 = j;
                if (i3 != 1)
                {
                    throw g.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            }
            break; /* Loop/switch isn't completed */
_L18:
            k2 = 4;
_L23:
            q1.a(k2, 0, i3);
            k1 += 6;
              goto _L21
_L19:
            k2 = 7;
            if (i3 >= 0) goto _L23; else goto _L22
_L22:
            throw g.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L20:
            if (i3 < 16384)
            {
                break; /* Loop/switch isn't completed */
            }
            k2 = j;
            if (i3 <= 0xffffff) goto _L23; else goto _L24
_L24:
            throw g.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
                Integer.valueOf(i3)
            });
_L14:
            a1.a(false, q1);
            if (q1.a() >= 0)
            {
                a1 = a;
                int l1 = q1.a();
                a1.c = l1;
                a1.d = l1;
                a1.a();
                return true;
            }
              goto _L12
_L7:
            if (k2 == 0)
            {
                throw g.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            }
            short word0 = flag;
            if ((byte1 & 8) != 0)
            {
                word0 = (short)(b.e() & 0xff);
            }
            a1.a(b.g() & 0x7fffffff, a(g.a(l2 - 4, byte1, word0), word0, byte1, k2));
            return true;
_L8:
            if (l2 != 8)
            {
                throw g.a("TYPE_PING length != 8: %s", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            if (k2 != 0)
            {
                throw g.a("TYPE_PING streamId != 0", new Object[0]);
            }
            int i2 = b.g();
            k2 = b.g();
            boolean flag5 = flag6;
            if ((byte1 & 1) != 0)
            {
                flag5 = true;
            }
            a1.a(flag5, i2, k2);
            return true;
_L9:
            if (l2 < 8)
            {
                throw g.a("TYPE_GOAWAY length < 8: %s", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            if (k2 != 0)
            {
                throw g.a("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
            int j2 = b.g();
            k2 = b.g();
            l2 -= 8;
            if (com.c.a.a.b.a.b(k2) == null)
            {
                throw g.a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                    Integer.valueOf(k2)
                });
            }
            i k = i.b;
            if (l2 > 0)
            {
                k = b.c(l2);
            }
            a1.a(j2, k);
            return true;
_L10:
            if (l2 != 4)
            {
                throw g.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                    Integer.valueOf(l2)
                });
            }
            long l3 = (long)b.g() & 0x7fffffffL;
            if (l3 == 0L)
            {
                throw g.a("windowSizeIncrement was 0", new Object[] {
                    Long.valueOf(l3)
                });
            } else
            {
                a1.a(k2, l3);
                return true;
            }
        }

        public final void close()
            throws IOException
        {
            b.close();
        }

        c(h h1, boolean flag)
        {
            b = h1;
            d = flag;
            c = new a(b);
            a = new f.a(c);
        }
    }

    static final class d
        implements com.c.a.a.b.c
    {

        private final c.g a;
        private final boolean b;
        private final e c = new e();
        private final f.b d;
        private int e;
        private boolean f;

        private void a(int j, int k, byte byte0, byte byte1)
            throws IOException
        {
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(b.a(false, j, k, byte0, byte1));
            }
            if (k > e)
            {
                throw g.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                    Integer.valueOf(e), Integer.valueOf(k)
                });
            }
            if ((0x80000000 & j) != 0)
            {
                throw g.b("reserved bit set: %s", new Object[] {
                    Integer.valueOf(j)
                });
            } else
            {
                g.a(a, k);
                a.g(byte0 & 0xff);
                a.g(byte1 & 0xff);
                a.e(0x7fffffff & j);
                return;
            }
        }

        private void b(int j, long l)
            throws IOException
        {
            while (l > 0L) 
            {
                int k = (int)Math.min(e, l);
                l -= k;
                byte byte0;
                if (l == 0L)
                {
                    byte0 = 4;
                } else
                {
                    byte0 = 0;
                }
                a(j, k, (byte)9, byte0);
                a.write(c, k);
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
            a.b(g.a().d());
            a.flush();
              goto _L1
        }

        public final void a(int j, long l)
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
            a(j, 4, (byte)8, (byte)0);
            a.e((int)l);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int j, com.c.a.a.b.a a1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
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
            a(j, 4, (byte)3, (byte)0);
            a.e(a1.s);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(int j, com.c.a.a.b.a a1, byte abyte0[])
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            a1;
            this;
            JVM INSTR monitorexit ;
            throw a1;
            if (a1.s == -1)
            {
                throw g.b("errorCode.httpCode == -1", new Object[0]);
            }
            a(0, abyte0.length + 8, (byte)7, (byte)0);
            a.e(j);
            a.e(a1.s);
            if (abyte0.length > 0)
            {
                a.b(abyte0);
            }
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(q q1)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_24;
            q1;
            this;
            JVM INSTR monitorexit ;
            throw q1;
            int j = e;
            if ((q1.a & 0x20) != 0)
            {
                j = q1.d[5];
            }
            e = j;
            a(0, 0, (byte)4, (byte)1);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int j, int k)
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
            a.e(j);
            a.e(k);
            a.flush();
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int j, e e1, int k)
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
            e1;
            this;
            JVM INSTR monitorexit ;
            throw e1;
            if (flag)
            {
                byte0 = 1;
            }
            a(j, k, (byte)0, byte0);
            if (k <= 0)
            {
                break MISSING_BLOCK_LABEL_62;
            }
            a.write(e1, k);
            this;
            JVM INSTR monitorexit ;
        }

        public final void a(boolean flag, int j, List list)
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
            int k;
            long l;
            if (f)
            {
                throw new IOException("closed");
            }
            if (c.b != 0L)
            {
                throw new IllegalStateException();
            }
            d.a(list);
            l = c.b;
            k = (int)Math.min(e, l);
            break MISSING_BLOCK_LABEL_91;
_L2:
            a(j, k, (byte)1, byte1);
            a.write(c, k);
            if (l <= (long)k)
            {
                break MISSING_BLOCK_LABEL_152;
            }
            b(j, l - (long)k);
            this;
            JVM INSTR monitorexit ;
            return;
            byte byte0;
            byte byte1;
            if (l == (long)k)
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

        public final void b(q q1)
            throws IOException
        {
            int j = 0;
            this;
            JVM INSTR monitorenter ;
            if (f)
            {
                throw new IOException("closed");
            }
            break MISSING_BLOCK_LABEL_26;
            q1;
            this;
            JVM INSTR monitorexit ;
            throw q1;
            a(0, Integer.bitCount(q1.a) * 6, (byte)4, (byte)0);
_L8:
            if (j >= 10) goto _L2; else goto _L1
_L1:
            if (!q1.a(j)) goto _L4; else goto _L3
_L3:
            if (j != 4) goto _L6; else goto _L5
_L5:
            int k = 3;
_L7:
            a.f(k);
            a.e(q1.d[j]);
              goto _L4
_L2:
            a.flush();
            this;
            JVM INSTR monitorexit ;
            return;
_L10:
            k = j;
              goto _L7
_L4:
            j++;
              goto _L8
_L6:
            if (j != 7) goto _L10; else goto _L9
_L9:
            k = 4;
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

        d(c.g g1, boolean flag)
        {
            a = g1;
            b = flag;
            d = new f.b(c);
            e = 16384;
        }
    }


    private static final Logger a = Logger.getLogger(com/c/a/a/b/g$b.getName());
    private static final i b = i.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    public g()
    {
    }

    static int a(int j, byte byte0, short word0)
        throws IOException
    {
        int k = j;
        if ((byte0 & 8) != 0)
        {
            k = j - 1;
        }
        if (word0 > k)
        {
            throw c("PROTOCOL_ERROR padding %s > remaining length %s", new Object[] {
                Short.valueOf(word0), Integer.valueOf(k)
            });
        } else
        {
            return (short)(k - word0);
        }
    }

    static int a(h h1)
        throws IOException
    {
        return (h1.e() & 0xff) << 16 | (h1.e() & 0xff) << 8 | h1.e() & 0xff;
    }

    static i a()
    {
        return b;
    }

    static IOException a(String s, Object aobj[])
        throws IOException
    {
        return c(s, aobj);
    }

    static void a(c.g g1, int j)
        throws IOException
    {
        g1.g(j >>> 16 & 0xff);
        g1.g(j >>> 8 & 0xff);
        g1.g(j & 0xff);
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

    public final com.c.a.a.b.b a(h h1, boolean flag)
    {
        return new c(h1, flag);
    }

    public final com.c.a.a.b.c a(c.g g1, boolean flag)
    {
        return new d(g1, flag);
    }

}
