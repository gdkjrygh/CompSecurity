// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.provider;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

public class LayoutContextParametersModule
{

    public LayoutContextParametersModule()
    {
    }

    static com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters provideContextParameters(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        int i = (int)TypedValue.applyDimension(1, Math.min(displaymetrics.widthPixels, displaymetrics.heightPixels), displaymetrics);
        context = new com.google.wallet.proto.NanoWalletWobl.LayoutContextParameters();
        context.orientation = Integer.valueOf(2);
        context.woblVersion = Integer.valueOf(2);
        context.minimumDimension = Integer.valueOf(i);
        context.theme = Integer.valueOf(1);
        return context;
    }
}
