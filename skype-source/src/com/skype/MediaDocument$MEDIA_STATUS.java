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
    public static final value MEDIA_AVAILABLE_ONLINE;
    public static final value MEDIA_BAD_CONTENT;
    public static final value MEDIA_LOADED;
    public static final value MEDIA_LOADING;
    public static final value MEDIA_NOT_AVAILABLE;
    public static final value MEDIA_PROCESSING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$MEDIA_STATUS, s);
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
        MEDIA_LOADING = new <init>("MEDIA_LOADING", 0, 0);
        MEDIA_LOADED = new <init>("MEDIA_LOADED", 1, 1);
        MEDIA_AVAILABLE_ONLINE = new <init>("MEDIA_AVAILABLE_ONLINE", 2, 2);
        MEDIA_NOT_AVAILABLE = new <init>("MEDIA_NOT_AVAILABLE", 3, 3);
        MEDIA_PROCESSING = new <init>("MEDIA_PROCESSING", 4, 4);
        MEDIA_BAD_CONTENT = new <init>("MEDIA_BAD_CONTENT", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            MEDIA_LOADING, MEDIA_LOADED, MEDIA_AVAILABLE_ONLINE, MEDIA_NOT_AVAILABLE, MEDIA_PROCESSING, MEDIA_BAD_CONTENT, WRAPPER_UNKNOWN_VALUE
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
