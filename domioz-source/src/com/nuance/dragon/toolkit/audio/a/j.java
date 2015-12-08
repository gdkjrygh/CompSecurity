// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import android.os.Handler;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.i;
import com.nuance.dragon.toolkit.audio.k;
import java.util.LinkedList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            i

final class j
    implements Runnable
{

    final com.nuance.dragon.toolkit.audio.a.i a;

    j(com.nuance.dragon.toolkit.audio.a.i l)
    {
        a = l;
        super();
    }

    public final void run()
    {
        long l1 = 0L;
        boolean flag = false;
        int i1 = 0;
        if (i.a(a).size() <= 0)
        {
            return;
        }
        g g1 = (g)i.a(a).remove();
        long l2;
        if (g1.c != null)
        {
            short aword0[] = g1.c;
            do
            {
                l2 = l1;
                if (i1 >= aword0.length)
                {
                    break;
                }
                l2 = aword0[i1];
                l1 += l2 * l2 >> 9;
                i1++;
            } while (true);
        } else
        {
            byte abyte0[] = g1.b;
            int j1 = ((flag) ? 1 : 0);
            do
            {
                l2 = l1;
                if (j1 >= abyte0.length)
                {
                    break;
                }
                l2 = abyte0[j1];
                l1 += l2 * l2 >> 9;
                j1++;
            } while (true);
        }
        double d = (double)l2 / 1073741824D;
        float f;
        k k1;
        i l;
        if (d < 1.0000000000000001E-09D)
        {
            d = -90D;
        } else
        {
            double d1 = Math.log10(d) * 10D;
            d = d1;
            if (d1 > 0.0D)
            {
                d = 0.0D;
            }
        }
        f = (float)d;
        k1 = i.b(a);
        l = i.c;
        k1.a(90F + f);
        if (i.c(a))
        {
            i.d(a);
            i.e(a).post(this);
            return;
        } else
        {
            i.e(a).postDelayed(this, g1.d);
            return;
        }
    }
}
