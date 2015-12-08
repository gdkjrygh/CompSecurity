// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.b;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AlphaAnimation;

public class a
{

    public a()
    {
    }

    public static void a(float f, View view)
    {
        AlphaAnimation alphaanimation = new AlphaAnimation(f, f);
        alphaanimation.setDuration(0L);
        alphaanimation.setFillAfter(true);
        view.startAnimation(alphaanimation);
    }

    public static void a(Drawable drawable, View view)
    {
        if (a(16))
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static boolean a(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean b(int i)
    {
        return android.os.Build.VERSION.SDK_INT == i;
    }
}
