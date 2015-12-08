// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public final class ik
{

    public static boolean a()
    {
        return a(11);
    }

    private static boolean a(int i)
    {
        return android.os.Build.VERSION.SDK_INT >= i;
    }

    public static boolean b()
    {
        return a(17);
    }
}
