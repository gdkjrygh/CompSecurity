// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static final class k
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

    final View a(k k1)
    {
        if (k != null)
        {
            int i1 = k.size();
            for (int l = 0; l < i1; l++)
            {
                k1 = (k)k.get(l);
                if (!k1.k() && d == k1.d())
                {
                    a(((a) (k1)));
                    return ((a) (k1)).a;
                }
            }

            return null;
        } else
        {
            k1 = k1.a(d);
            d = d + e;
            return k1;
        }
    }

    public final void a(e e1)
    {
        int k1 = k.size();
        e e2 = null;
        int l = 0x7fffffff;
        for (int i1 = 0; i1 < k1; i1++)
        {
            e e3 = (k)k.get(i1);
            if (e3 == e1 || e3.k())
            {
                continue;
            }
            int j1 = (e3.k() - d) * e;
            if (j1 < 0 || j1 >= l)
            {
                continue;
            }
            e2 = e3;
            if (j1 == 0)
            {
                break;
            }
            e2 = e3;
            l = j1;
        }

        if (e2 == null)
        {
            l = -1;
        } else
        {
            l = e2.e();
        }
        d = l;
    }

    final boolean a(d d1)
    {
        return d >= 0 && d < d1.d();
    }

    ()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }
}
