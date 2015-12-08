// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class ViewCompatICS
{

    public static boolean canScrollHorizontally(View view, int i)
    {
        return view.canScrollHorizontally(i);
    }

    public static boolean canScrollVertically(View view, int i)
    {
        return view.canScrollVertically(i);
    }

    public static void setAccessibilityDelegate(View view, Object obj)
    {
        view.setAccessibilityDelegate((android.view.View.AccessibilityDelegate)obj);
    }
}
