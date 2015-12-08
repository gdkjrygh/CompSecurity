// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static final class j
{

    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    List j;

    final View a(j j1)
    {
        if (j != null)
        {
            int l = j.size();
            for (int k = 0; k < l; k++)
            {
                j1 = (j)j.get(k);
                if (!j1.j() && d == j1.d())
                {
                    a(((a) (j1)));
                    return ((a) (j1)).a;
                }
            }

            return null;
        } else
        {
            j1 = j1.a(d);
            d = d + e;
            return j1;
        }
    }

    public final void a(e e1)
    {
        int j1 = j.size();
        e e2 = null;
        int k = 0x7fffffff;
        for (int l = 0; l < j1; l++)
        {
            e e3 = (j)j.get(l);
            if (e3 == e1 || e3.j())
            {
                continue;
            }
            int i1 = (e3.j() - d) * e;
            if (i1 < 0 || i1 >= k)
            {
                continue;
            }
            e2 = e3;
            if (i1 == 0)
            {
                break;
            }
            e2 = e3;
            k = i1;
        }

        if (e2 == null)
        {
            k = -1;
        } else
        {
            k = e2.e();
        }
        d = k;
    }

    final boolean a(d d1)
    {
        return d >= 0 && d < d1.d();
    }

    ()
    {
        a = true;
        h = 0;
        j = null;
    }
}
