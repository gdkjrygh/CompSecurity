// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;

// Referenced classes of package android.support.design.widget:
//            m, CoordinatorLayout

class l extends CoordinatorLayout.b
{

    private m a;
    private int b;
    private int c;

    public int a()
    {
        if (a != null)
        {
            return a.d;
        } else
        {
            return 0;
        }
    }

    public boolean a(int i)
    {
        if (a != null)
        {
            return a.a(i);
        } else
        {
            b = i;
            return false;
        }
    }

    public boolean a(CoordinatorLayout coordinatorlayout, View view, int i)
    {
        coordinatorlayout.onLayoutChild(view, i);
        if (a == null)
        {
            a = new m(view);
        }
        coordinatorlayout = a;
        coordinatorlayout.b = ((m) (coordinatorlayout)).a.getTop();
        coordinatorlayout.c = ((m) (coordinatorlayout)).a.getLeft();
        coordinatorlayout.a();
        if (b != 0)
        {
            a.a(b);
            b = 0;
        }
        if (c != 0)
        {
            coordinatorlayout = a;
            i = c;
            if (((m) (coordinatorlayout)).e != i)
            {
                coordinatorlayout.e = i;
                coordinatorlayout.a();
            }
            c = 0;
        }
        return true;
    }
}
