// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;


public final class  extends Enum
{

    public static final UNSPECIFIED BAD_BODY;
    public static final UNSPECIFIED BAD_HEADER_DATA;
    public static final UNSPECIFIED NO_FILL;
    public static final UNSPECIFIED TRACKING_FAILURE;
    public static final UNSPECIFIED UNSPECIFIED;
    public static final UNSPECIFIED WARMING_UP;
    private static final UNSPECIFIED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/mopub/network/MoPubNetworkError$Reason, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        WARMING_UP = new <init>("WARMING_UP", 0);
        NO_FILL = new <init>("NO_FILL", 1);
        BAD_HEADER_DATA = new <init>("BAD_HEADER_DATA", 2);
        BAD_BODY = new <init>("BAD_BODY", 3);
        TRACKING_FAILURE = new <init>("TRACKING_FAILURE", 4);
        UNSPECIFIED = new <init>("UNSPECIFIED", 5);
        a = (new a[] {
            WARMING_UP, NO_FILL, BAD_HEADER_DATA, BAD_BODY, TRACKING_FAILURE, UNSPECIFIED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
