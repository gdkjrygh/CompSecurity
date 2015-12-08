// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout, u

final class a
    implements Runnable
{

    final elChildViewTouch a;

    public final void run()
    {
        int i = 0;
        a a1 = a;
        int j = a1.a.i;
        View view;
        boolean flag;
        if (a1.a == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = a1.a.findDrawerWithGravity(3);
            if (view != null)
            {
                i = -view.getWidth();
            }
            i += j;
        } else
        {
            view = a1.DrawerWithGravity.findDrawerWithGravity(5);
            i = a1.DrawerWithGravity.getWidth();
            i -= j;
        }
        if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && a1.idth.getDrawerLockMode(view) == 0)
        {
            a a2 = (rawerLockMode)view.getLayoutParams();
            a1.rawerLockMode.a(view, i, view.getTop());
            a2.rawerLockMode = true;
            a1.rawerLockMode.invalidate();
            a1.lidate();
            a1.lidate.cancelChildViewTouch();
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
