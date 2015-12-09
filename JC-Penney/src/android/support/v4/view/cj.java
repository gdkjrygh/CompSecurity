// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.res.ColorStateList;
import android.view.View;

class cj
{

    public static void a(View view)
    {
        view.requestApplyInsets();
    }

    public static void a(View view, float f)
    {
        view.setElevation(f);
    }

    static void a(View view, ColorStateList colorstatelist)
    {
        view.setBackgroundTintList(colorstatelist);
    }

    static void a(View view, android.graphics.PorterDuff.Mode mode)
    {
        view.setBackgroundTintMode(mode);
    }

    public static float b(View view)
    {
        return view.getElevation();
    }
}
