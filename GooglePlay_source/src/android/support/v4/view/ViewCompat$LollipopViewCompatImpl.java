// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompat, WindowInsetsCompatApi21, WindowInsetsCompat, OnApplyWindowInsetsListener

static final class  extends 
{

    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        Object obj = windowinsetscompat;
        if (windowinsetscompat instanceof WindowInsetsCompatApi21)
        {
            android.view.WindowInsets windowinsets = ((WindowInsetsCompatApi21)windowinsetscompat).mSource;
            view = view.onApplyWindowInsets(windowinsets);
            obj = windowinsetscompat;
            if (view != windowinsets)
            {
                obj = new WindowInsetsCompatApi21(view);
            }
        }
        return ((WindowInsetsCompat) (obj));
    }

    public final void requestApplyInsets(View view)
    {
        view.requestApplyInsets();
    }

    public final void setElevation(View view, float f)
    {
        view.setElevation(f);
    }

    public final void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        view.setOnApplyWindowInsetsListener(new (onapplywindowinsetslistener));
    }

    public final void stopNestedScroll(View view)
    {
        view.stopNestedScroll();
    }

    ()
    {
    }
}
