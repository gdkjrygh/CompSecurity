// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            MediaDocument

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CACHE_ONLY;
    public static final value CACHE_THEN_DOWNLOAD;
    public static final value CACHE_THEN_LINK;
    public static final value CANCEL_DOWNLOAD;
    public static final value DOWNLOAD_ONLY;
    public static final value DOWNLOAD_TO_FILE;
    public static final value LINK_ONLY;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$MEDIA_GET_POLICY, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        CACHE_ONLY = new <init>("CACHE_ONLY", 0, 0);
        CACHE_THEN_LINK = new <init>("CACHE_THEN_LINK", 1, 1);
        CACHE_THEN_DOWNLOAD = new <init>("CACHE_THEN_DOWNLOAD", 2, 2);
        LINK_ONLY = new <init>("LINK_ONLY", 3, 3);
        DOWNLOAD_ONLY = new <init>("DOWNLOAD_ONLY", 4, 4);
        CANCEL_DOWNLOAD = new <init>("CANCEL_DOWNLOAD", 5, 5);
        DOWNLOAD_TO_FILE = new <init>("DOWNLOAD_TO_FILE", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CACHE_ONLY, CACHE_THEN_LINK, CACHE_THEN_DOWNLOAD, LINK_ONLY, DOWNLOAD_ONLY, CANCEL_DOWNLOAD, DOWNLOAD_TO_FILE, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
