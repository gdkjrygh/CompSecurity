// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;


final class  extends Enum
{

    private static final DISCONNECTED $VALUES[];
    public static final DISCONNECTED CONNECTED;
    public static final DISCONNECTED CONNECTING;
    public static final DISCONNECTED DISCONNECTED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/cosmos/android/Resolver$State, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CONNECTED = new <init>("CONNECTED", 0);
        CONNECTING = new <init>("CONNECTING", 1);
        DISCONNECTED = new <init>("DISCONNECTED", 2);
        $VALUES = (new .VALUES[] {
            CONNECTED, CONNECTING, DISCONNECTED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
