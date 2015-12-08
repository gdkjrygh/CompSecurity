// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            x, an, am, s

static final class Mode extends Mode
{

    public final boolean D(View view)
    {
        return view.isNestedScrollingEnabled();
    }

    public final void E(View view)
    {
        view.stopNestedScroll();
    }

    public final float G(View view)
    {
        return view.getZ();
    }

    public final am a(View view, am am)
    {
        Object obj = am;
        if (am instanceof an)
        {
            android.view.WindowInsets windowinsets = ((an)am).a;
            view = view.onApplyWindowInsets(windowinsets);
            obj = am;
            if (view != windowinsets)
            {
                obj = new an(view);
            }
        }
        return ((am) (obj));
    }

    public final void a(View view, ColorStateList colorstatelist)
    {
        view.setBackgroundTintList(colorstatelist);
    }

    public final void a(View view, android.graphics.erDuff.Mode mode)
    {
        view.setBackgroundTintMode(mode);
    }

    public final void a(View view, s s)
    {
        view.setOnApplyWindowInsetsListener(new (s));
    }

    public final am b(View view, am am)
    {
        Object obj = am;
        if (am instanceof an)
        {
            android.view.WindowInsets windowinsets = ((an)am).a;
            view = view.dispatchApplyWindowInsets(windowinsets);
            obj = am;
            if (view != windowinsets)
            {
                obj = new an(view);
            }
        }
        return ((am) (obj));
    }

    public final void f(View view, float f1)
    {
        view.setElevation(f1);
    }

    public final void w(View view)
    {
        view.requestApplyInsets();
    }

    public final float x(View view)
    {
        return view.getElevation();
    }

    public final float y(View view)
    {
        return view.getTranslationZ();
    }

    Mode()
    {
    }
}
