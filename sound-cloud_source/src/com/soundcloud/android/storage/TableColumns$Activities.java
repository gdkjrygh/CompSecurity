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
        "_id", "uuid", "type", "tags", "user_id", "sound_id", "sound_type", "comment_id", "created_at", "content_id", 
        "sharing_note_text", "sharing_note_created_at"
    };
    public static final String COMMENT_ID = "comment_id";
    public static final String CONTENT_ID = "content_id";
    public static final String CREATED_AT = "created_at";
    public static final String SHARING_NOTE_CREATED_AT = "sharing_note_created_at";
    public static final String SHARING_NOTE_TEXT = "sharing_note_text";
    public static final String SOUND_ID = "sound_id";
    public static final String SOUND_TYPE = "sound_type";
    public static final String TAGS = "tags";
    public static final String TYPE = "type";
    public static final String USER_ID = "user_id";
    public static final String UUID = "uuid";


    public ()
    {
    }
}
