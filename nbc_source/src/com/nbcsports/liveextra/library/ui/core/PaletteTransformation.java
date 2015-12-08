// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui.core;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

public class PaletteTransformation
    implements Transformation
{

    private static final PaletteTransformation INSTANCE = new PaletteTransformation();

    PaletteTransformation()
    {
    }

    public static PaletteTransformation instance()
    {
        return INSTANCE;
    }

    public String key()
    {
        return "";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        return null;
    }

}
