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
                k1 = ((k)k.get(l)).w;
                k k2 = (w)k1.getLayoutParams();
                if (!k2.w.ed() && d == k2.d.utPosition())
                {
                    a(((View) (k1)));
                    return k1;
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

    public final void a(View view)
    {
_L2:
        if (view2 == null)
        {
            d = -1;
            return;
        } else
        {
            d = ((d)view2.getLayoutParams()).d.utPosition();
            return;
        }
        int k1 = k.size();
        View view1 = null;
        int l = 0x7fffffff;
        View view2;
        for (int i1 = 0; i1 < k1; i1++)
        {
            view2 = ((k)k.get(i1)).w;
            e e1 = (w)view2.getLayoutParams();
            if (view2 != view && !e1.w.ed())
            {
                int j1 = (e1.ed.utPosition() - d) * e;
                if (j1 >= 0 && j1 < l)
                {
                    if (j1 == 0)
                    {
                        break MISSING_BLOCK_LABEL_122;
                    }
                    view1 = view2;
                    l = j1;
                }
            }
        }

        view2 = view1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    final boolean a(e e1)
    {
        return d >= 0 && d < e1.d();
    }

    ()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }
}
