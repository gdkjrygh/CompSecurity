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
    public static final value MEDIA_AUDIO;
    public static final value MEDIA_AVATAR;
    public static final value MEDIA_EMOTICON;
    public static final value MEDIA_FILE;
    public static final value MEDIA_FLIK;
    public static final value MEDIA_PACK;
    public static final value MEDIA_PHOTO;
    public static final value MEDIA_PHOTO_WITH_AUDIO;
    public static final value MEDIA_TAB;
    public static final value MEDIA_UNKNOWN;
    public static final value MEDIA_URL_PREVIEW;
    public static final value MEDIA_VIDEO;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$DOCUMENT_TYPE, s);
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
        MEDIA_UNKNOWN = new <init>("MEDIA_UNKNOWN", 0, 0);
        MEDIA_VIDEO = new <init>("MEDIA_VIDEO", 1, 1);
        MEDIA_PHOTO = new <init>("MEDIA_PHOTO", 2, 2);
        MEDIA_AUDIO = new <init>("MEDIA_AUDIO", 3, 3);
        MEDIA_PHOTO_WITH_AUDIO = new <init>("MEDIA_PHOTO_WITH_AUDIO", 4, 4);
        MEDIA_AVATAR = new <init>("MEDIA_AVATAR", 5, 5);
        MEDIA_URL_PREVIEW = new <init>("MEDIA_URL_PREVIEW", 6, 6);
        MEDIA_EMOTICON = new <init>("MEDIA_EMOTICON", 7, 7);
        MEDIA_FLIK = new <init>("MEDIA_FLIK", 8, 8);
        MEDIA_PACK = new <init>("MEDIA_PACK", 9, 9);
        MEDIA_FILE = new <init>("MEDIA_FILE", 10, 10);
        MEDIA_TAB = new <init>("MEDIA_TAB", 11, 11);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 12, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            MEDIA_UNKNOWN, MEDIA_VIDEO, MEDIA_PHOTO, MEDIA_AUDIO, MEDIA_PHOTO_WITH_AUDIO, MEDIA_AVATAR, MEDIA_URL_PREVIEW, MEDIA_EMOTICON, MEDIA_FLIK, MEDIA_PACK, 
            MEDIA_FILE, MEDIA_TAB, WRAPPER_UNKNOWN_VALUE
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
