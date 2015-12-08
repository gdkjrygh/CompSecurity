// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.provider.BaseColumns;

// Referenced classes of package com.soundcloud.android.storage:
//            TableColumns

public static class 
    implements BaseColumns
{

    public static final String ALL_FIELDS[] = {
        "track_id", "monetizable", "sub_mid_tier", "sub_high_tier", "policy", "monetization_model", "syncable", "last_updated"
    };
    public static final String LAST_UPDATED = "last_updated";
    public static final String MONETIZABLE = "monetizable";
    public static final String MONETIZATION_MODEL = "monetization_model";
    public static final String POLICY = "policy";
    public static final String SUB_HIGH_TIER = "sub_high_tier";
    public static final String SUB_MID_TIER = "sub_mid_tier";
    public static final String SYNCABLE = "syncable";
    public static final String TRACK_ID = "track_id";


    public ()
    {
    }
}
