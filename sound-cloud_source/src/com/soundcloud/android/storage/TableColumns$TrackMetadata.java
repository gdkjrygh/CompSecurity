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
        "_id", "user_id", "play_count", "cached", "type", "etag", "bitrate", "url_hash", "size"
    };
    public static final String BITRATE = "bitrate";
    public static final String CACHED = "cached";
    public static final String ETAG = "etag";
    public static final String PLAY_COUNT = "play_count";
    public static final String SIZE = "size";
    public static final String TYPE = "type";
    public static final String URL_HASH = "url_hash";
    public static final String USER_ID = "user_id";


    public ()
    {
    }
}
