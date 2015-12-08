// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.content.Context;
import android.graphics.Typeface;

public final class FontUtility
{

    private static Typeface INTERSTATE_BOLD;

    private FontUtility()
    {
    }

    public static Typeface getInterstateBold(Context context)
    {
        if (INTERSTATE_BOLD == null)
        {
            INTERSTATE_BOLD = Typeface.createFromAsset(context.getAssets(), "fbxBO6Oqt4.ttf");
        }
        return INTERSTATE_BOLD;
    }
}
