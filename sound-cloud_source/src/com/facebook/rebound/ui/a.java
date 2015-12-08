// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound.ui;

import android.content.res.Resources;
import android.util.TypedValue;

public abstract class a
{

    public static final int a(float f, Resources resources)
    {
        return (int)TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public static final android.widget.FrameLayout.LayoutParams a(int i, int j)
    {
        return new android.widget.FrameLayout.LayoutParams(i, j);
    }
}
