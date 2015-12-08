// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.config;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class b
{

    private float a;

    public b(Context context)
    {
        a = 1.0F;
        a = context.getResources().getDisplayMetrics().density;
    }
}
