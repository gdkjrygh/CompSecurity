// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.view.View;

final class mu extends mt
{

    mu()
    {
    }

    public final or a(View view, or or)
    {
        Object obj = or;
        if (or instanceof os)
        {
            android.view.WindowInsets windowinsets = ((os)or).a;
            view = view.onApplyWindowInsets(windowinsets);
            obj = or;
            if (view != windowinsets)
            {
                obj = new os(view);
            }
        }
        return ((or) (obj));
    }

    public final void a(View view, ColorStateList colorstatelist)
    {
        view.setBackgroundTintList(colorstatelist);
    }

    public final void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        view.setBackgroundTintMode(mode);
    }

    public final void a(View view, mc mc)
    {
        view.setOnApplyWindowInsetsListener(new mw(mc));
    }

    public final void d(View view, float f)
    {
        view.setElevation(f);
    }

    public final void u(View view)
    {
        view.requestApplyInsets();
    }

    public final float v(View view)
    {
        return view.getElevation();
    }

    public final void y(View view)
    {
        view.stopNestedScroll();
    }
}
