// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//            WindowInsetsCompatApi21, WindowInsetsCompat, OnApplyWindowInsetsListener

class ViewCompatLollipop
{

    public static WindowInsetsCompat dispatchApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        Object obj = windowinsetscompat;
        if (windowinsetscompat instanceof WindowInsetsCompatApi21)
        {
            WindowInsets windowinsets = ((WindowInsetsCompatApi21)windowinsetscompat).unwrap();
            view = view.dispatchApplyWindowInsets(windowinsets);
            obj = windowinsetscompat;
            if (view != windowinsets)
            {
                obj = new WindowInsetsCompatApi21(view);
            }
        }
        return ((WindowInsetsCompat) (obj));
    }

    public static float getElevation(View view)
    {
        return view.getElevation();
    }

    public static float getTranslationZ(View view)
    {
        return view.getTranslationZ();
    }

    public static float getZ(View view)
    {
        return view.getZ();
    }

    public static WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
    {
        Object obj = windowinsetscompat;
        if (windowinsetscompat instanceof WindowInsetsCompatApi21)
        {
            WindowInsets windowinsets = ((WindowInsetsCompatApi21)windowinsetscompat).unwrap();
            view = view.onApplyWindowInsets(windowinsets);
            obj = windowinsetscompat;
            if (view != windowinsets)
            {
                obj = new WindowInsetsCompatApi21(view);
            }
        }
        return ((WindowInsetsCompat) (obj));
    }

    public static void requestApplyInsets(View view)
    {
        view.requestApplyInsets();
    }

    public static void setElevation(View view, float f)
    {
        view.setElevation(f);
    }

    public static void setOnApplyWindowInsetsListener(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        view.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener(onapplywindowinsetslistener) {

            final OnApplyWindowInsetsListener val$listener;

            public WindowInsets onApplyWindowInsets(View view1, WindowInsets windowinsets)
            {
                windowinsets = new WindowInsetsCompatApi21(windowinsets);
                return ((WindowInsetsCompatApi21)listener.onApplyWindowInsets(view1, windowinsets)).unwrap();
            }

            
            {
                listener = onapplywindowinsetslistener;
                super();
            }
        });
    }

    public static void stopNestedScroll(View view)
    {
        view.stopNestedScroll();
    }
}
