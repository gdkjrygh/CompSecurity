// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            bx, ds, cd, dr, 
//            bi

final class by extends bx
{

    by()
    {
    }

    public final dr a(View view, dr dr)
    {
        Object obj = dr;
        if (dr instanceof ds)
        {
            android.view.WindowInsets windowinsets = ((ds)dr).e();
            view = view.onApplyWindowInsets(windowinsets);
            obj = dr;
            if (view != windowinsets)
            {
                obj = new ds(view);
            }
        }
        return ((dr) (obj));
    }

    public final void a(View view, bi bi)
    {
        view.setOnApplyWindowInsetsListener(new cd(bi));
    }

    public final void f(View view, float f1)
    {
        view.setElevation(f1);
    }

    public final void r(View view)
    {
        view.requestApplyInsets();
    }

    public final void v(View view)
    {
        view.stopNestedScroll();
    }
}
