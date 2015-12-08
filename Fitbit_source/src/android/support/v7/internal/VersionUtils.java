// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal;


public class VersionUtils
{

    private VersionUtils()
    {
    }

    public static boolean isAtLeastL()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }
}
