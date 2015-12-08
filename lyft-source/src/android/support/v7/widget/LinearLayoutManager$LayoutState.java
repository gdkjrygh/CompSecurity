// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.List;

class k
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

    private View b()
    {
        int l;
        int i1;
        i1 = k.size();
        l = 0;
_L3:
        View view;
        k k1;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        view = ((k)k.get(l)).;
        k1 = ()view.getLayoutParams();
          goto _L1
_L5:
        l++;
        if (true) goto _L3; else goto _L2
_L1:
        if (k1.() || d != k1.d()) goto _L5; else goto _L4
_L4:
        a(view);
        return view;
_L2:
        return null;
    }

    View a(a a1)
    {
        if (k != null)
        {
            return b();
        } else
        {
            a1 = a1.b(d);
            d = d + e;
            return a1;
        }
    }

    public void a()
    {
        a(((View) (null)));
    }

    public void a(View view)
    {
        view = b(view);
        if (view == null)
        {
            d = -1;
            return;
        } else
        {
            d = ((d)view.getLayoutParams()).d();
            return;
        }
    }

    boolean a(d d1)
    {
        return d >= 0 && d < d1.d();
    }

    public View b(View view)
    {
        int k1 = k.size();
        View view1 = null;
        int l = 0x7fffffff;
        int i1 = 0;
        while (i1 < k1) 
        {
            View view2 = ((k)k.get(i1)).;
            d d1 = ()view2.getLayoutParams();
            if (view2 != view && !d1.())
            {
                int j1 = (d1.() - d) * e;
                if (j1 >= 0 && j1 < l)
                {
                    if (j1 == 0)
                    {
                        return view2;
                    }
                    view1 = view2;
                    l = j1;
                }
            }
            i1++;
        }
        return view1;
    }

    ()
    {
        a = true;
        h = 0;
        i = false;
        k = null;
    }
}
