// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.fitbit.util.b.a;

public class b
{

    public b()
    {
    }

    public static void a(View view, int i)
    {
        com.fitbit.util.b.a.a(view.getContext().getResources().getDrawable(i), view);
    }

    public static void a(View view, int i, int j)
    {
        com.fitbit.util.b.a.a(new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            i, j
        }), view);
    }
}
