// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView, m, ag

public final class l
    implements Runnable
{

    final AbsHListView a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final int g = 1;
    private int h;

    l(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
    }

    public final void a()
    {
        a.removeCallbacks(this);
    }

    final void a(int i)
    {
        boolean flag;
        flag = false;
        a();
        if (!a.aj) goto _L2; else goto _L1
_L1:
        a.O = new m(this, i);
_L4:
        return;
_L2:
        int j = a.getChildCount();
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        int k = a.V;
        int i1 = (j + k) - 1;
        j = Math.max(0, Math.min(a.s() - 1, i));
        if (j < k)
        {
            i = (k - j) + 1;
            b = 2;
        } else
        {
label0:
            {
                if (j <= i1)
                {
                    break label0;
                }
                i = (j - i1) + 1;
                b = 1;
            }
        }
        View view;
        int j1;
        if (i > 0)
        {
            f = 200 / i;
        } else
        {
            f = 200;
        }
        c = j;
        d = -1;
        e = -1;
        a.a.a(this);
        return;
        i = a.V;
        j1 = (a.getChildCount() + i) - 1;
        k = a.u.left;
        i1 = a.getWidth() - a.u.right;
        if (j < i || j > j1)
        {
            Log.w("AbsListView", (new StringBuilder("scrollToVisible called with targetPos ")).append(j).append(" not visible [").append(i).append(", ").append(j1).append("]").toString());
        }
        view = a.getChildAt(j - i);
        j = view.getLeft();
        j1 = view.getRight();
        i = ((flag) ? 1 : 0);
        if (j1 > i1)
        {
            i = j1 - i1;
        }
        if (j < k)
        {
            i = j - k;
        }
        if (i != 0)
        {
            a.d(i);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void run()
    {
        int i;
        int i1;
        int j1;
        i = 0;
        j1 = a.getWidth();
        i1 = a.V;
        b;
        JVM INSTR tableswitch 1 5: default 60
    //                   1 61
    //                   2 393
    //                   3 218
    //                   4 513
    //                   5 679;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        i = a.getChildCount() - 1;
        i1 += i;
        if (i >= 0)
        {
            if (i1 == e)
            {
                a.a.a(this);
                return;
            }
            View view = a.getChildAt(i);
            int k1 = view.getWidth();
            int k2 = view.getLeft();
            if (i1 < a.ao - 1)
            {
                i = Math.max(a.u.right, g);
            } else
            {
                i = a.u.right;
            }
            a.a(i + (k1 - (j1 - k2)), f, true);
            e = i1;
            if (i1 < c)
            {
                a.a.a(this);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i = a.getChildCount();
        if (i1 != d && i > 1 && i + i1 < a.ao)
        {
            i = i1 + 1;
            if (i == e)
            {
                a.a.a(this);
                return;
            }
            View view1 = a.getChildAt(1);
            i1 = view1.getWidth();
            j1 = view1.getLeft();
            int l1 = Math.max(a.u.right, g);
            if (i < d)
            {
                a.a(Math.max(0, (j1 + i1) - l1), f, true);
                e = i;
                a.a.a(this);
                return;
            }
            if (j1 > l1)
            {
                a.a(j1 - l1, f, true);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i1 == e)
        {
            a.a.a(this);
            return;
        }
        View view2 = a.getChildAt(0);
        if (view2 != null)
        {
            j1 = view2.getLeft();
            if (i1 > 0)
            {
                i = Math.max(g, a.u.left);
            } else
            {
                i = a.u.left;
            }
            a.a(j1 - i, f, true);
            e = i1;
            if (i1 > c)
            {
                a.a.a(this);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        int i2 = a.getChildCount() - 2;
        if (i2 >= 0)
        {
            i = i1 + i2;
            if (i == e)
            {
                a.a.a(this);
                return;
            }
            View view3 = a.getChildAt(i2);
            i1 = view3.getWidth();
            i2 = view3.getLeft();
            int l2 = Math.max(a.u.left, g);
            e = i;
            if (i > d)
            {
                a.a(-(j1 - i2 - l2), f, true);
                a.a.a(this);
                return;
            }
            i = j1 - l2;
            i1 = i2 + i1;
            if (i > i1)
            {
                a.a(-(i - i1), f, true);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        int j2;
        int i3;
        if (e == i1)
        {
            a.a.a(this);
            return;
        }
        e = i1;
        j1 = a.getChildCount();
        j2 = c;
        i3 = (i1 + j1) - 1;
        if (j2 >= i1) goto _L8; else goto _L7
_L7:
        i = (i1 - j2) + 1;
_L10:
        float f1;
        f1 = Math.min(Math.abs((float)i / (float)j1), 1.0F);
        if (j2 < i1)
        {
            i = (int)((float)(-a.getWidth()) * f1);
            i1 = (int)(f1 * (float)f);
            a.a(i, i1, true);
            a.a.a(this);
            return;
        }
        break; /* Loop/switch isn't completed */
_L8:
        if (j2 > i3)
        {
            i = j2 - i3;
        }
        if (true) goto _L10; else goto _L9
_L9:
        if (j2 > i3)
        {
            int j = (int)((float)a.getWidth() * f1);
            i1 = (int)(f1 * (float)f);
            a.a(j, i1, true);
            a.a.a(this);
            return;
        } else
        {
            int k = a.getChildAt(j2 - i1).getLeft() - h;
            i1 = (int)((float)f * ((float)Math.abs(k) / (float)a.getWidth()));
            a.a(k, i1, true);
            return;
        }
    }
}
