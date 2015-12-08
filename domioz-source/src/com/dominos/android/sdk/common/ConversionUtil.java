// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class ConversionUtil
{

    private Context mContext;

    public ConversionUtil(Context context)
    {
        mContext = context;
    }

    public int dpToPixels(int i)
    {
        return (int)((double)(mContext.getResources().getDisplayMetrics().density * (float)i) + 0.5D);
    }
}
