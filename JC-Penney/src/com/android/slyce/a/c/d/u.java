// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.ao;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c.d:
//            i, v, w, q, 
//            j, s, o, h, 
//            ab, g

final class u
    implements i
{

    final q a;
    int b;
    int c;
    byte d;
    byte e;
    short f;
    int g;
    byte h;
    int i;
    int j;
    private final am k;
    private final boolean l;
    private final j m;
    private final ao n = new ao();
    private final e o = new v(this);
    private final e p = new w(this);

    u(am am1, j j1, int i1, boolean flag)
    {
        k = am1;
        l = flag;
        a = new q(i1);
        m = j1;
        a();
    }

    static e a(u u1)
    {
        return u1.p;
    }

    private void a()
    {
        k.a(n);
        n.a(8, o);
    }

    private void a(aj aj1, int i1)
    {
        int j1 = aj1.f();
        byte byte0;
        boolean flag;
        if ((0x80000000 & j1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        byte0 = aj1.i();
        m.a(i1, j1 & 0x7fffffff, (byte0 & 0xff) + 1, flag);
    }

    private void a(aj aj1, short word0, byte byte0, int i1)
    {
        short word1 = 0;
        if (i1 == 0)
        {
            throw s.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            word1 = (short)(aj1.i() & 0xff);
        }
        short word2 = word0;
        if ((byte0 & 0x20) != 0)
        {
            a(aj1, i1);
            word2 = (short)(word0 - 5);
        }
        word0 = s.a(word2, byte0, word1);
        h = e;
        a(aj1, word0, word1, byte0, i1);
    }

    private void a(aj aj1, short word0, short word1, byte byte0, int i1)
    {
        boolean flag = true;
        aj1.b(word1);
        a.a(aj1);
        a.a();
        a.b();
        if ((byte0 & 4) != 0)
        {
            if (h == 1)
            {
                if ((byte0 & 1) == 0)
                {
                    flag = false;
                }
                m.a(false, flag, i1, -1, a.c(), o.d);
                return;
            }
            if (h == 5)
            {
                m.a(i1, j, a.c());
                return;
            } else
            {
                throw new AssertionError("unknown header type");
            }
        } else
        {
            i = i1;
            return;
        }
    }

    static void a(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.c(aj1, word0, byte0, i1);
    }

    static ao b(u u1)
    {
        return u1.n;
    }

    private void b(aj aj1, short word0, byte byte0, int i1)
    {
        if (i1 != i)
        {
            throw new IOException("continuation stream id mismatch");
        } else
        {
            a(aj1, word0, (short)0, byte0, i1);
            return;
        }
    }

    static void b(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.a(aj1, word0, byte0, i1);
    }

    private void c(aj aj1, short word0, byte byte0, int i1)
    {
        boolean flag = true;
        short word1 = 0;
        boolean flag1;
        if ((byte0 & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((byte0 & 0x20) == 0)
        {
            flag = false;
        }
        if (flag)
        {
            throw s.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            word1 = (short)(aj1.i() & 0xff);
        }
        s.a(word0, byte0, word1);
        m.a(flag1, i1, aj1);
        aj1.b(word1);
    }

    static void c(u u1)
    {
        u1.a();
    }

    static void c(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.d(aj1, word0, byte0, i1);
    }

    static j d(u u1)
    {
        return u1.m;
    }

    private void d(aj aj1, short word0, byte byte0, int i1)
    {
        if (word0 != 5)
        {
            throw s.a("TYPE_PRIORITY length: %d != 5", new Object[] {
                Short.valueOf(word0)
            });
        }
        if (i1 == 0)
        {
            throw s.a("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            a(aj1, i1);
            return;
        }
    }

    static void d(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.e(aj1, word0, byte0, i1);
    }

    private void e(aj aj1, short word0, byte byte0, int i1)
    {
        if (word0 != 4)
        {
            throw s.a("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Short.valueOf(word0)
            });
        }
        if (i1 == 0)
        {
            throw s.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        byte0 = aj1.f();
        aj1 = com.android.slyce.a.c.d.h.b(byte0);
        if (aj1 == null)
        {
            throw s.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(byte0)
            });
        } else
        {
            m.a(i1, aj1);
            return;
        }
    }

    static void e(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.f(aj1, word0, byte0, i1);
    }

    private void f(aj aj1, short word0, byte byte0, int i1)
    {
        if (i1 != 0)
        {
            throw s.a("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((byte0 & 1) == 0) goto _L2; else goto _L1
_L1:
        if (word0 != 0)
        {
            throw s.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        }
        m.b();
_L8:
        return;
_L2:
        ab ab1;
        if (word0 % 6 != 0)
        {
            throw s.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                Short.valueOf(word0)
            });
        }
        ab1 = new ab();
        byte0 = 0;
_L4:
        int j1;
        if (byte0 >= word0)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        short word1 = aj1.h();
        j1 = aj1.f();
        i1 = word1;
        switch (word1)
        {
        default:
            throw s.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
                Short.valueOf(word1)
            });

        case 1: // '\001'
        case 5: // '\005'
            break;

        case 4: // '\004'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            i1 = word1;
            if (j1 != 0)
            {
                i1 = word1;
                if (j1 != 1)
                {
                    throw s.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
            }
            break;

        case 3: // '\003'
            i1 = 4;
            break;
        }
_L6:
        ab1.a(i1, 0, j1);
        byte0 += 6;
        if (true) goto _L4; else goto _L3
_L3:
        i1 = 7;
        if (j1 >= 0) goto _L6; else goto _L5
_L5:
        throw s.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
        m.a(false, ab1);
        if (ab1.c() >= 0)
        {
            a.a(ab1.c());
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static void f(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.g(aj1, word0, byte0, i1);
    }

    private void g(aj aj1, short word0, byte byte0, int i1)
    {
        short word1 = 0;
        if (i1 == 0)
        {
            throw s.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            word1 = (short)(aj1.i() & 0xff);
        }
        j = aj1.f() & 0x7fffffff;
        short word2 = s.a((short)(word0 - 4), byte0, word1);
        h = 5;
        a(aj1, word2, word1, byte0, i1);
    }

    static void g(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.h(aj1, word0, byte0, i1);
    }

    private void h(aj aj1, short word0, byte byte0, int i1)
    {
        boolean flag = true;
        if (word0 != 8)
        {
            throw s.a("TYPE_PING length != 8: %s", new Object[] {
                Short.valueOf(word0)
            });
        }
        if (i1 != 0)
        {
            throw s.a("TYPE_PING streamId != 0", new Object[0]);
        }
        i1 = aj1.f();
        int j1 = aj1.f();
        if ((byte0 & 1) == 0)
        {
            flag = false;
        }
        m.a(flag, i1, j1);
    }

    static void h(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.i(aj1, word0, byte0, i1);
    }

    private void i(aj aj1, short word0, byte byte0, int i1)
    {
        if (word0 < 8)
        {
            throw s.a("TYPE_GOAWAY length < 8: %s", new Object[] {
                Short.valueOf(word0)
            });
        }
        if (i1 != 0)
        {
            throw s.a("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        byte0 = aj1.f();
        i1 = aj1.f();
        int j1 = word0 - 8;
        h h1 = com.android.slyce.a.c.d.h.b(i1);
        if (h1 == null)
        {
            throw s.a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(i1)
            });
        }
        g g1 = g.a;
        if (j1 > 0)
        {
            g1 = com.android.slyce.a.c.d.g.a(aj1.a(j1));
        }
        m.a(byte0, h1, g1);
    }

    static void i(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.j(aj1, word0, byte0, i1);
    }

    private void j(aj aj1, short word0, byte byte0, int i1)
    {
        if (word0 != 4)
        {
            throw s.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                Short.valueOf(word0)
            });
        }
        long l1 = (long)aj1.f() & 0x7fffffffL;
        if (l1 == 0L)
        {
            throw s.a("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l1)
            });
        } else
        {
            m.a(i1, l1);
            return;
        }
    }

    static void j(u u1, aj aj1, short word0, byte byte0, int i1)
    {
        u1.b(aj1, word0, byte0, i1);
    }
}
