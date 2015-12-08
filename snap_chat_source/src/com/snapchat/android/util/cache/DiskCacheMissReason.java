// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.cache;


public final class DiskCacheMissReason extends Enum
{

    private static final DiskCacheMissReason $VALUES[];
    public static final DiskCacheMissReason DECODING_ERROR;
    public static final DiskCacheMissReason EMPTY_FILE;
    public static final DiskCacheMissReason EXPIRED;
    public static final DiskCacheMissReason FILE_NOT_EXIST;
    public static final DiskCacheMissReason NULL_KEY;
    public static final DiskCacheMissReason UNKNOWN;

    private DiskCacheMissReason(String s, int i)
    {
        super(s, i);
    }

    public static DiskCacheMissReason valueOf(String s)
    {
        return (DiskCacheMissReason)Enum.valueOf(com/snapchat/android/util/cache/DiskCacheMissReason, s);
    }

    public static DiskCacheMissReason[] values()
    {
        return (DiskCacheMissReason[])$VALUES.clone();
    }

    static 
    {
        FILE_NOT_EXIST = new DiskCacheMissReason("FILE_NOT_EXIST", 0);
        EXPIRED = new DiskCacheMissReason("EXPIRED", 1);
        DECODING_ERROR = new DiskCacheMissReason("DECODING_ERROR", 2);
        EMPTY_FILE = new DiskCacheMissReason("EMPTY_FILE", 3);
        UNKNOWN = new DiskCacheMissReason("UNKNOWN", 4);
        NULL_KEY = new DiskCacheMissReason("NULL_KEY", 5);
        $VALUES = (new DiskCacheMissReason[] {
            FILE_NOT_EXIST, EXPIRED, DECODING_ERROR, EMPTY_FILE, UNKNOWN, NULL_KEY
        });
    }
}
