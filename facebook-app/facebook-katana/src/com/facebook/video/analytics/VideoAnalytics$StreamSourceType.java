// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public final class value extends Enum
{

    private static final FROM_LOCAL_STORAGE $VALUES[];
    public static final FROM_LOCAL_STORAGE FROM_CACHE;
    public static final FROM_LOCAL_STORAGE FROM_LOCAL_STORAGE;
    public static final FROM_LOCAL_STORAGE FROM_STREAM;
    public final String value;

    public static value valueOf(String s)
    {
        return (value)Enum.valueOf(com/facebook/video/analytics/VideoAnalytics$StreamSourceType, s);
    }

    public static value[] values()
    {
        return (value[])$VALUES.clone();
    }

    static 
    {
        FROM_STREAM = new <init>("FROM_STREAM", 0, "stream");
        FROM_CACHE = new <init>("FROM_CACHE", 1, "from_cache");
        FROM_LOCAL_STORAGE = new <init>("FROM_LOCAL_STORAGE", 2, "local_storage");
        $VALUES = (new .VALUES[] {
            FROM_STREAM, FROM_CACHE, FROM_LOCAL_STORAGE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }
}
