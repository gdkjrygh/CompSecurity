// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, OrientationHelper

class d
{

    int a;
    int b;
    boolean c;
    final LinearLayoutManager d;

    static boolean a(d d1, View view, d d2)
    {
        return d1.a(view, d2);
    }

    private boolean a(View view, a a1)
    {
        view = (a)view.getLayoutParams();
        return !view.a() && view.a() >= 0 && view.a() < a1.a();
    }

    void a()
    {
        a = -1;
        b = 0x80000000;
        c = false;
    }

    public void a(View view)
    {
        int k = d.b.b();
        if (k < 0) goto _L2; else goto _L1
_L1:
        b(view);
_L4:
        return;
_L2:
        a = d.d(view);
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        int i = d.b.d() - k - d.b.b(view);
        b = d.b.d() - i;
        if (i > 0)
        {
            k = d.b.c(view);
            int l = b;
            int k1 = d.b.c();
            k = l - k - (k1 + Math.min(d.b.a(view) - k1, 0));
            if (k < 0)
            {
                int i1 = b;
                b = Math.min(i, -k) + i1;
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        int j1 = d.b.a(view);
        int j = j1 - d.b.c();
        b = j1;
        if (j > 0)
        {
            int l1 = d.b.c(view);
            int i2 = d.b.d();
            int j2 = d.b.b(view);
            k = d.b.d() - Math.min(0, i2 - k - j2) - (j1 + l1);
            if (k < 0)
            {
                b = b - Math.min(j, -k);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    void b()
    {
        int i;
        if (c)
        {
            i = d.b.d();
        } else
        {
            i = d.b.c();
        }
        b = i;
    }

    public void b(View view)
    {
        if (c)
        {
            b = d.b.b(view) + d.b.b();
        } else
        {
            b = d.b.a(view);
        }
        a = d.d(view);
    }

    public String toString()
    {
        return (new StringBuilder()).append("AnchorInfo{mPosition=").append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
    }

    (LinearLayoutManager linearlayoutmanager)
    {
        d = linearlayoutmanager;
        super();
    }
}
