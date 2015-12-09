// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN PARSING;
    public static final UNKNOWN RESOLVING;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/spotify/mobile/android/cosmos/ParsingCallbackReceiver$ErrorCause, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RESOLVING = new <init>("RESOLVING", 0);
        PARSING = new <init>("PARSING", 1);
        UNKNOWN = new <init>("UNKNOWN", 2);
        $VALUES = (new .VALUES[] {
            RESOLVING, PARSING, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
