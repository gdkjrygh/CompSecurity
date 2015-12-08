// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;

public final class gk
{

    public static boolean y(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
}
