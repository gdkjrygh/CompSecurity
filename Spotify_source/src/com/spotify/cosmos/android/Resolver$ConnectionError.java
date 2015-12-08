// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;


public final class _cls9 extends Enum
{

    private static final BIND_SERVICE_FAILED $VALUES[];
    public static final BIND_SERVICE_FAILED BIND_SERVICE_FAILED;

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/spotify/cosmos/android/Resolver$ConnectionError, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])$VALUES.clone();
    }

    static 
    {
        BIND_SERVICE_FAILED = new <init>("BIND_SERVICE_FAILED", 0);
        $VALUES = (new .VALUES[] {
            BIND_SERVICE_FAILED
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
