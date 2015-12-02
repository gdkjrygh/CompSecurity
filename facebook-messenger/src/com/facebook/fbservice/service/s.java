// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;


public final class s extends Enum
{

    private static final s $VALUES[];
    public static final s CHECK_SERVER_FOR_NEW_DATA;
    public static final s DO_NOT_CHECK_SERVER;
    public static final s PREFER_CACHE_IF_UP_TO_DATE;
    public static final s STALE_DATA_OKAY;

    private s(String s1, int i)
    {
        super(s1, i);
    }

    public static s valueOf(String s1)
    {
        return (s)Enum.valueOf(com/facebook/fbservice/service/s, s1);
    }

    public static s[] values()
    {
        return (s[])$VALUES.clone();
    }

    static 
    {
        PREFER_CACHE_IF_UP_TO_DATE = new s("PREFER_CACHE_IF_UP_TO_DATE", 0);
        CHECK_SERVER_FOR_NEW_DATA = new s("CHECK_SERVER_FOR_NEW_DATA", 1);
        DO_NOT_CHECK_SERVER = new s("DO_NOT_CHECK_SERVER", 2);
        STALE_DATA_OKAY = new s("STALE_DATA_OKAY", 3);
        $VALUES = (new s[] {
            PREFER_CACHE_IF_UP_TO_DATE, CHECK_SERVER_FOR_NEW_DATA, DO_NOT_CHECK_SERVER, STALE_DATA_OKAY
        });
    }
}
