// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public final class p
{

    public static int a(float f, Context context)
    {
        return (int)(context.getResources().getDisplayMetrics().density * f + 0.5F);
    }
}
