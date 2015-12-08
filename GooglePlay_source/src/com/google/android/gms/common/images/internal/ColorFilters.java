// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images.internal;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;

public final class ColorFilters
{

    public static final ColorFilter COLOR_FILTER_BW;
    private static final ColorMatrix COLOR_MATRIX_WB;

    static 
    {
        ColorMatrix colormatrix = new ColorMatrix();
        COLOR_MATRIX_WB = colormatrix;
        colormatrix.setSaturation(0.0F);
        COLOR_FILTER_BW = new ColorMatrixColorFilter(COLOR_MATRIX_WB);
    }
}
