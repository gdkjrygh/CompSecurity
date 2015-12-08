// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.Collections;

final class jlo extends jlp
{

    private final jnk b = new jnk(new byte[7]);
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public jlo(jkq jkq1)
    {
        super(jkq1);
        c = 0;
    }

    public final void a()
    {
        c = 0;
        d = 0;
        e = false;
    }

    public final void a(jnl jnl1, long l, boolean flag)
    {
        if (flag)
        {
            j = l;
        }
_L12:
        if (jnl1.b() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        c;
        JVM INSTR tableswitch 0 2: default 48
    //                   0 51
    //                   1 227
    //                   2 520;
           goto _L1 _L2 _L3 _L4
_L1:
        continue; /* Loop/switch isn't completed */
_L2:
        byte abyte0[];
        int k;
        int i2;
        abyte0 = jnl1.a;
        k = jnl1.b;
        i2 = jnl1.c;
_L9:
        if (k >= i2) goto _L6; else goto _L5
_L5:
        boolean flag1;
        if ((abyte0[k] & 0xff) == 255)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e && !flag && (abyte0[k] & 0xf0) == 240)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        e = flag;
        if (!flag1) goto _L8; else goto _L7
_L7:
        if ((abyte0[k] & 1) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        jnl1.b(k + 1);
        e = false;
        k = 1;
_L10:
        if (k != 0)
        {
            d = 0;
            c = 1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        k++;
          goto _L9
_L6:
        jnl1.b(i2);
        k = 0;
          goto _L10
_L3:
        byte abyte1[];
        int i1;
        int k1;
        if (f)
        {
            i1 = 7;
        } else
        {
            i1 = 5;
        }
        abyte1 = b.a;
        k1 = Math.min(jnl1.b(), i1 - d);
        jnl1.a(abyte1, d, k1);
        d = d + k1;
        if (d == i1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            b.a(0);
            if (!g)
            {
                i1 = b.c(2);
                int l1 = b.c(4);
                b.b(1);
                byte abyte2[] = jnf.a(i1 + 1, l1, b.c(3));
                Pair pair = jnf.a(abyte2);
                jjh jjh1 = jjh.a(-1, "audio/mp4a-latm", -1, -1, -1L, ((Integer)pair.second).intValue(), ((Integer)pair.first).intValue(), Collections.singletonList(abyte2), null);
                h = 0x3d090000L / (long)jjh1.n;
                a.a(jjh1);
                g = true;
            } else
            {
                b.b(10);
            }
            b.b(4);
            i = b.c(13) - 2 - 5;
            if (f)
            {
                i = i - 2;
            }
            d = 0;
            c = 2;
        }
        continue; /* Loop/switch isn't completed */
          goto _L9
_L4:
        int j1 = Math.min(jnl1.b(), i - d);
        a.a(jnl1, j1);
        d = j1 + d;
        if (d == i)
        {
            a.a(j, 1, i, 0, null);
            j = j + h;
            d = 0;
            c = 0;
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void b()
    {
    }
}
