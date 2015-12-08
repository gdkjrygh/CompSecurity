// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;


public class Visibility
{

    private Visibility()
    {
    }

    public static boolean hasScreenVisibilityChanged(int i, int j)
    {
        return isScreenVisible(i) != isScreenVisible(j);
    }

    public static boolean isScreenVisible(int i)
    {
        return i == 0;
    }
}
