// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;

public final class kdi
{

    public static int a(int i)
    {
        return i / 1000;
    }

    public static boolean a(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean b(int i)
    {
        return (i % 1000) / 100 == 3;
    }
}
