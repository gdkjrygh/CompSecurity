// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import android.os.Handler;
import com.nuance.a.a.a.c.c.f;
import com.nuance.dragon.toolkit.audio.c.a;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            k, m, ag, af

final class l extends a
    implements f
{

    static final boolean b;
    protected final Handler a;
    private final e c;
    private final List d;
    private boolean e;
    private boolean f;

    l(e e1)
    {
        if (!b && e1 == null)
        {
            throw new AssertionError();
        } else
        {
            d = new LinkedList();
            c = e1;
            e = false;
            a = new Handler();
            return;
        }
    }

    static List a(l l1)
    {
        return l1.d;
    }

    private void a(g g1)
    {
        a.post(new m(this, g1));
    }

    static void b(l l1)
    {
        l1.f();
    }

    static void c(l l1)
    {
        l1.g();
    }

    static boolean d(l l1)
    {
        l1.f = true;
        return true;
    }

    public final e a()
    {
        return c;
    }

    public final void a(byte abyte0[], int i, int j, boolean flag)
    {
        int i1 = 0;
        if (!e) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (flag)
        {
            e = true;
        }
        if (abyte0 != null && j > 0)
        {
            if (c.m != com.nuance.dragon.toolkit.audio.f.a)
            {
                break; /* Loop/switch isn't completed */
            }
            short aword0[] = new short[j / 2];
            for (; i1 < j / 2; i1++)
            {
                aword0[i1] = (short)((short)abyte0[i1 * 2 + i] & 0xff | (short)abyte0[i1 * 2 + i + 1] << 8 & 0xff00);
            }

            a(new g(c, aword0));
        }
_L4:
        if (flag)
        {
            a.post(new ag(this));
            a.post(new af(this));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (c.m == com.nuance.dragon.toolkit.audio.f.b)
        {
            byte abyte1[] = new byte[j];
            System.arraycopy(abyte0, i, abyte1, 0, j);
            a(new g(c, abyte1));
        } else
        if (c.m == com.nuance.dragon.toolkit.audio.f.c)
        {
            byte abyte2[] = new byte[j];
            System.arraycopy(abyte0, i, abyte2, 0, j);
            a(new g(c, abyte2));
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final int b()
    {
        return d.size();
    }

    public final boolean c()
    {
        if (f)
        {
            int i = b();
            if (i == 0)
            {
                return false;
            }
            (new StringBuilder("still active: ")).append(i).append(" available audio chunks left");
        }
        return true;
    }

    protected final h d()
    {
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return (g)d.remove(0);
        }
    }

    static 
    {
        boolean flag;
        if (!com/nuance/dragon/toolkit/a/k.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
