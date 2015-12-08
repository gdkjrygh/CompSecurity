// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class ViewCompatJellybeanMr1
{

    public static int getLayoutDirection(View view)
    {
        return view.getLayoutDirection();
    }

    public static int getPaddingEnd(View view)
    {
        return view.getPaddingEnd();
    }

    public static int getPaddingStart(View view)
    {
        return view.getPaddingStart();
    }

    public static int getWindowSystemUiVisibility(View view)
    {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean isPaddingRelative(View view)
    {
        return view.isPaddingRelative();
    }

    public static void setPaddingRelative(View view, int i, int j, int k, int l)
    {
        view.setPaddingRelative(i, j, k, l);
    }
}
