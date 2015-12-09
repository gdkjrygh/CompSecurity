// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

class ViewCompatMarshmallow
{

    ViewCompatMarshmallow()
    {
    }

    public static int getScrollIndicators(View view)
    {
        return view.getScrollIndicators();
    }

    public static void setScrollIndicators(View view, int i)
    {
        view.setScrollIndicators(i);
    }

    public static void setScrollIndicators(View view, int i, int j)
    {
        view.setScrollIndicators(i, j);
    }
}
