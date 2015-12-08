// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class ViewCompatLollipop
{

    public static float a(View view)
    {
        return view.getElevation();
    }

    public static void a(View view, float f)
    {
        view.setElevation(f);
    }

    public static boolean b(View view)
    {
        return view.isNestedScrollingEnabled();
    }

    public static void c(View view)
    {
        view.stopNestedScroll();
    }
}
