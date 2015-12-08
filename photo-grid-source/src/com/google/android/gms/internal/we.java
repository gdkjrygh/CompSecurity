// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class we
{

    private static Pattern a = null;

    public static int a(int i)
    {
        return i / 1000;
    }

    public static boolean a(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

}
