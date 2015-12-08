// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class description extends Enum
{

    public static final INTERNAL_ERROR INTERNAL_ERROR;
    public static final INTERNAL_ERROR INVALID_REQUEST;
    public static final INTERNAL_ERROR NETWORK_ERROR;
    public static final INTERNAL_ERROR NO_FILL;
    private static final INTERNAL_ERROR zzaH[];
    private final String description;

    public static description valueOf(String s)
    {
        return (description)Enum.valueOf(com/google/ads/AdRequest$ErrorCode, s);
    }

    public static description[] values()
    {
        return (description[])zzaH.clone();
    }

    public final String toString()
    {
        return description;
    }

    static 
    {
        INVALID_REQUEST = new <init>("INVALID_REQUEST", 0, "Invalid Ad request.");
        NO_FILL = new <init>("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 2, "A network error occurred.");
        INTERNAL_ERROR = new <init>("INTERNAL_ERROR", 3, "There was an internal error.");
        zzaH = (new zzaH[] {
            INVALID_REQUEST, NO_FILL, NETWORK_ERROR, INTERNAL_ERROR
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        description = s1;
    }
}
