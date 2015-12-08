// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.util.DisplayMetrics;
import android.util.TypedValue;

public final class d
{

    public static int a(float f, DisplayMetrics displaymetrics)
    {
        return Math.round(TypedValue.applyDimension(1, f, displaymetrics));
    }
}
