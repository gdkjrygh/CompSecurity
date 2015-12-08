// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            cc, ek, ci, ej, 
//            bd

final class cd extends cc
{

    cd()
    {
    }

    public final ej a(View view, ej ej)
    {
        Object obj = ej;
        if (ej instanceof ek)
        {
            android.view.WindowInsets windowinsets = ((ek)ej).a;
            view = view.onApplyWindowInsets(windowinsets);
            obj = ej;
            if (view != windowinsets)
            {
                obj = new ek(view);
            }
        }
        return ((ej) (obj));
    }

    public final void a(View view, ColorStateList colorstatelist)
    {
        view.setBackgroundTintList(colorstatelist);
    }

    public final void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        view.setBackgroundTintMode(mode);
    }

    public final void a(View view, bd bd)
    {
        view.setOnApplyWindowInsetsListener(new ci(bd));
    }

    public final void e(View view, float f)
    {
        view.setElevation(f);
    }

    public final void p(View view)
    {
        view.requestApplyInsets();
    }

    public final float q(View view)
    {
        return view.getElevation();
    }

    public final boolean u(View view)
    {
        return view.isNestedScrollingEnabled();
    }

    public final void v(View view)
    {
        view.stopNestedScroll();
    }
}
