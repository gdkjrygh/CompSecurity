// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

public static final class mAddSourceType extends Enum
{

    private static final OFFICIAL_STORY_SEARCH $VALUES[];
    public static final OFFICIAL_STORY_SEARCH ADDED_BY_NEARBY;
    public static final OFFICIAL_STORY_SEARCH ADDED_BY_SUGGESTED;
    public static final OFFICIAL_STORY_SEARCH ADDED_ME_BACK;
    public static final OFFICIAL_STORY_SEARCH CONTACTS;
    public static final OFFICIAL_STORY_SEARCH OFFICIAL_STORY_SEARCH;
    public static final OFFICIAL_STORY_SEARCH QR_CODE;
    public static final OFFICIAL_STORY_SEARCH USERNAME;
    private final com.snapchat.android.model.ype mAddSourceType;

    public static mAddSourceType valueOf(String s)
    {
        return (mAddSourceType)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$AddFriendSourceType, s);
    }

    public static mAddSourceType[] values()
    {
        return (mAddSourceType[])$VALUES.clone();
    }

    public final com.snapchat.android.model.ype getAddSourceType()
    {
        return mAddSourceType;
    }

    static 
    {
        CONTACTS = new <init>("CONTACTS", 0, com.snapchat.android.model.ype);
        USERNAME = new <init>("USERNAME", 1, com.snapchat.android.model.ME);
        QR_CODE = new <init>("QR_CODE", 2, com.snapchat.android.model.E);
        ADDED_ME_BACK = new <init>("ADDED_ME_BACK", 3, com.snapchat.android.model.ME_BACK);
        ADDED_BY_NEARBY = new <init>("ADDED_BY_NEARBY", 4, com.snapchat.android.model.);
        ADDED_BY_SUGGESTED = new <init>("ADDED_BY_SUGGESTED", 5, com.snapchat.android.model.TED);
        OFFICIAL_STORY_SEARCH = new <init>("OFFICIAL_STORY_SEARCH", 6, com.snapchat.android.model.AL_STORY_SEARCH);
        $VALUES = (new .VALUES[] {
            CONTACTS, USERNAME, QR_CODE, ADDED_ME_BACK, ADDED_BY_NEARBY, ADDED_BY_SUGGESTED, OFFICIAL_STORY_SEARCH
        });
    }

    private (String s, int i, com.snapchat.android.model.ype ype)
    {
        super(s, i);
        mAddSourceType = ype;
    }
}
