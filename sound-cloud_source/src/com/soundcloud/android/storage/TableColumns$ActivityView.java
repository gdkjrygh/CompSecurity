// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;


// Referenced classes of package com.soundcloud.android.storage:
//            TableColumns

public static final class  extends 
{

    public static final String ALL_FIELDS[];
    public static final String ALL_VIEW_FIELDS[] = {
        "comment_body", "comment_timestamp", "comment_created_at", "activity_user_username", "activity_user_permalink", "activity_user_avatar_url"
    };
    public static final String COMMENT_BODY = "comment_body";
    public static final String COMMENT_CREATED_AT = "comment_created_at";
    public static final String COMMENT_TIMESTAMP = "comment_timestamp";
    public static final String USER_AVATAR_URL = "activity_user_avatar_url";
    public static final String USER_PERMALINK = "activity_user_permalink";
    public static final String USER_USERNAME = "activity_user_username";

    static 
    {
        ALL_FIELDS = new String[L_FIELDS.length + ALL_VIEW_FIELDS.length + _FIELDS.length];
        System.arraycopy(L_FIELDS, 0, ALL_FIELDS, 0, L_FIELDS.length);
        System.arraycopy(ALL_VIEW_FIELDS, 0, ALL_FIELDS, L_FIELDS.length, ALL_VIEW_FIELDS.length);
        System.arraycopy(_FIELDS, 0, ALL_FIELDS, L_FIELDS.length + ALL_VIEW_FIELDS.length, _FIELDS.length);
    }

    public ()
    {
    }
}
