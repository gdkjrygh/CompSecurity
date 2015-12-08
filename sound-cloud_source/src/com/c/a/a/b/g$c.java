// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.h;
import c.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.a.b:
//            b, g, f, d, 
//            e, a, q

static final class c
    implements b
{

    final b a;
    private final h b;
    private final b c;
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
        for (obj = a; !((a) (obj)).b.c();)
        {
            j = ((b) (obj)).b.e() & 0xff;
            if (j == 128)
            {
                throw new IOException("index == 0");
            }
            if ((j & 0x80) == 128)
            {
                j = (() (obj)).a(j, 127) - 1;
                if (c(j))
                {
                    d d1 = f.a()[j];
                    ((c) (obj)).a.add(d1);
                } else
                {
                    k = (() (obj)).a(j - f.a().length);
                    if (k < 0 || k > ((a) (obj)).e.length - 1)
                    {
                        throw new IOException((new StringBuilder("Header index too large ")).append(j + 1).toString());
                    }
                    ((Builder.toString) (obj)).a.add((() (obj)).e[k]);
                }
            } else
            if (j == 64)
            {
                ((e) (obj)).a(new d(f.a(((nit>) (obj)).b()), ((b) (obj)).b()));
            } else
            if ((j & 0x40) == 64)
            {
                ((b) (obj)).a(new d(((nit>) (obj)).b(((b) (obj)).a(j, 63) - 1), ((a) (obj)).b()));
            } else
            if ((j & 0x20) == 32)
            {
                obj.d = ((d) (obj)).a(j, 31);
                if (((a) (obj)).d < 0 || ((d) (obj)).d > ((d) (obj)).c)
                {
                    throw new IOException((new StringBuilder("Invalid dynamic table size update ")).append(((Builder.append) (obj)).d).toString());
                }
                ((Builder.toString) (obj)).a();
            } else
            if (j == 16 || j == 0)
            {
                i l = f.a(((a) (obj)).b());
                i j1 = ((b) (obj)).b();
                ((b) (obj)).a.add(new d(l, j1));
            } else
            {
                i i1 = ((nit>) (obj)).b(((b) (obj)).a(j, 15) - 1);
                i k1 = ((a) (obj)).b();
                ((b) (obj)).a.add(new d(i1, k1));
            }
        }

        obj = a;
        ArrayList arraylist = new ArrayList(((tion) (obj)).a);
        ((a) (obj)).a.clear();
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

    public final boolean a( )
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
        catch ( )
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
            g.b().fine(a(true, k2, l2, byte0, byte1));
        }
        byte0;
        JVM INSTR tableswitch 0 8: default 196
    //                   0 210
    //                   1 319
    //                   2 432
    //                   3 477
    //                   4 570
    //                   5 899
    //                   6 981
    //                   7 1072
    //                   8 1206;
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
        .a(flag3, k2, b, l);
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
        .a(false, flag4, k2, a(g.a(i1, byte1, j), j, byte1, k2), e.d);
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
        a a1 = com.c.a.a.b.a.b(j1);
        if (a1 == null)
        {
            throw g.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(j1)
            });
        } else
        {
            .a(k2, a1);
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
    //                   1 772
    //                   2 739
    //                   3 769
    //                   4 793
    //                   5 813
    //                   6 772;
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
        .a(false, q1);
        if (q1.a() >= 0)
        {
             = a;
            int l1 = q1.a();
            .c = l1;
            .d = l1;
            .a();
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
        .a(b.g() & 0x7fffffff, a(g.a(l2 - 4, byte1, word0), word0, byte1, k2));
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
        .a(flag5, i2, k2);
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
        .a(j2, k);
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
            .a(k2, l3);
            return true;
        }
    }

    public final void close()
        throws IOException
    {
        b.close();
    }

    ion(h h1, boolean flag)
    {
        b = h1;
        d = flag;
        c = new <init>(b);
        a = new <init>(c);
    }
}
