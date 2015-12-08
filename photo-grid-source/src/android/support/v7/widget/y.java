// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bi, az, bf

final class y
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    int j;
    List k;

    y()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }

    final View a(az az1)
    {
        if (k != null)
        {
            int i1 = k.size();
            for (int l = 0; l < i1; l++)
            {
                az1 = (bi)k.get(l);
                if (!az1.n() && d == az1.c())
                {
                    a(((bi) (az1)));
                    return ((bi) (az1)).a;
                }
            }

            return null;
        } else
        {
            az1 = az1.b(d);
            d = d + e;
            return az1;
        }
    }

    public final void a(bi bi1)
    {
        int k1 = k.size();
        bi bi2 = null;
        int l = 0x7fffffff;
        for (int i1 = 0; i1 < k1; i1++)
        {
            bi bi3 = (bi)k.get(i1);
            if (bi3 == bi1 || bi3.n())
            {
                continue;
            }
            int j1 = (bi3.c() - d) * e;
            if (j1 < 0 || j1 >= l)
            {
                continue;
            }
            bi2 = bi3;
            if (j1 == 0)
            {
                break;
            }
            bi2 = bi3;
            l = j1;
        }

        if (bi2 == null)
        {
            l = -1;
        } else
        {
            l = bi2.c();
        }
        d = l;
    }

    final boolean a(bf bf1)
    {
        return d >= 0 && d < bf1.e();
    }
}
