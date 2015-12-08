// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;

public class a
{

    public a()
    {
    }

    public static void a(Activity activity)
    {
        activity.overridePendingTransition(0x10a0000, 0x10a0001);
    }

    public static void a(Context context, View view, View view1)
    {
        a(context, view, view1, 0x10a0000, 0x10a0001);
    }

    public static void a(Context context, View view, View view1, int i, int j)
    {
        if (view1.getVisibility() == 0)
        {
            view1.setVisibility(8);
            view1.setAnimation(AnimationUtils.loadAnimation(context, j));
        }
        if (view.getVisibility() != 0)
        {
            view.setVisibility(0);
            view.setAnimation(AnimationUtils.loadAnimation(context, i));
        }
    }

    public static void b(Context context, View view, View view1)
    {
        if (view.getVisibility() != 0)
        {
            view.setAnimation(AnimationUtils.loadAnimation(context, 0x7f050009));
            view.setVisibility(0);
        }
        view1.setVisibility(8);
    }
}
