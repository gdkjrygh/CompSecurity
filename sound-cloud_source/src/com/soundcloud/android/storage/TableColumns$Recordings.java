// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.provider.BaseColumns;

// Referenced classes of package com.soundcloud.android.storage:
//            TableColumns

public static final class 
    implements BaseColumns
{

    public static final String ALL_FIELDS[] = {
        "_id", "user_id", "timestamp", "longitude", "latitude", "what_text", "where_text", "audio_path", "duration", "description", 
        "artwork_path", "shared_emails", "shared_ids", "private_user_id", "tip_key", "service_ids", "is_private", "external_upload", "upload_status", "four_square_venue_id", 
        "trim_left", "trim_right", "filters", "optimize", "fading"
    };
    public static final String ARTWORK_PATH = "artwork_path";
    public static final String AUDIO_PATH = "audio_path";
    public static final String DESCRIPTION = "description";
    public static final String DURATION = "duration";
    public static final String EXTERNAL_UPLOAD = "external_upload";
    public static final String FADING = "fading";
    public static final String FILTERS = "filters";
    public static final String FOUR_SQUARE_VENUE_ID = "four_square_venue_id";
    public static final String IS_PRIVATE = "is_private";
    public static final String LATITUDE = "latitude";
    public static final String LONGITUDE = "longitude";
    public static final String OPTIMIZE = "optimize";
    public static final String PRIVATE_USER_ID = "private_user_id";
    public static final String SERVICE_IDS = "service_ids";
    public static final String SHARED_EMAILS = "shared_emails";
    public static final String SHARED_IDS = "shared_ids";
    public static final String TIMESTAMP = "timestamp";
    public static final String TIP_KEY = "tip_key";
    public static final String TRIM_LEFT = "trim_left";
    public static final String TRIM_RIGHT = "trim_right";
    public static final String UPLOAD_STATUS = "upload_status";
    public static final String USER_ID = "user_id";
    public static final String WHAT_TEXT = "what_text";
    public static final String WHERE_TEXT = "where_text";


    public ()
    {
    }
}
