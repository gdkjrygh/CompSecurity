// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model;

import android.text.TextUtils;
import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.model:
//            Friend

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN ADDED_BY_ADDED_ME_BACK;
    public static final UNKNOWN ADDED_BY_NEARBY;
    public static final UNKNOWN ADDED_BY_OFFICIAL_STORY_SEARCH;
    public static final UNKNOWN ADDED_BY_PHONE;
    public static final UNKNOWN ADDED_BY_QR_CODE;
    public static final UNKNOWN ADDED_BY_SUGGESTED;
    public static final UNKNOWN ADDED_BY_USERNAME;
    public static final UNKNOWN UNKNOWN;

    public static  fromValue(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        s = valueOf(s);
        return s;
        s;
        Timber.e("Friend", (new StringBuilder("Invalid enum for AddSourceType ")).append(s).toString(), new Object[0]);
        return UNKNOWN;
    }

    public static UNKNOWN valueOf(String s)
    {
        return (UNKNOWN)Enum.valueOf(com/snapchat/android/model/Friend$AddSourceType, s);
    }

    public static UNKNOWN[] values()
    {
        return (UNKNOWN[])$VALUES.clone();
    }

    public final String getMetricName()
    {
        return name();
    }

    static 
    {
        ADDED_BY_PHONE = new <init>("ADDED_BY_PHONE", 0);
        ADDED_BY_USERNAME = new <init>("ADDED_BY_USERNAME", 1);
        ADDED_BY_QR_CODE = new <init>("ADDED_BY_QR_CODE", 2);
        ADDED_BY_ADDED_ME_BACK = new <init>("ADDED_BY_ADDED_ME_BACK", 3);
        ADDED_BY_NEARBY = new <init>("ADDED_BY_NEARBY", 4);
        ADDED_BY_SUGGESTED = new <init>("ADDED_BY_SUGGESTED", 5);
        ADDED_BY_OFFICIAL_STORY_SEARCH = new <init>("ADDED_BY_OFFICIAL_STORY_SEARCH", 6);
        UNKNOWN = new <init>("UNKNOWN", 7);
        $VALUES = (new .VALUES[] {
            ADDED_BY_PHONE, ADDED_BY_USERNAME, ADDED_BY_QR_CODE, ADDED_BY_ADDED_ME_BACK, ADDED_BY_NEARBY, ADDED_BY_SUGGESTED, ADDED_BY_OFFICIAL_STORY_SEARCH, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
