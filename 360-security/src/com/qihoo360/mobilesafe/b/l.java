// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class l
{

    public static float a(Context context, float f)
    {
        if (context == null)
        {
            return -1F;
        } else
        {
            return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()) * Float.parseFloat(context.getResources().getString(0x7f090030));
        }
    }

    public static int b(Context context, float f)
    {
        return (int)(a(context, f) + 0.5F);
    }
}
