// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;


public final class GmsVersion
{

    public static boolean isAtLeastFenacho(int i)
    {
        return i >= 0x30d400;
    }

    public static boolean isAtLeastOlivet(int i)
    {
        return i >= 0x663be0;
    }
}
