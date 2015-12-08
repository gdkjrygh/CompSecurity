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
        "id", "kind", "text", "icon_url", "permalink_url", "suggest_text_1", "suggest_text_2", "suggest_icon_1", "suggest_intent_data"
    };
    public static final String COLUMN_ICON = "suggest_icon_1";
    public static final String COLUMN_TEXT1 = "suggest_text_1";
    public static final String COLUMN_TEXT2 = "suggest_text_2";
    public static final String ICON_URL = "icon_url";
    public static final String ID = "id";
    public static final String INTENT_DATA = "suggest_intent_data";
    public static final String KIND = "kind";
    public static final String PERMALINK_URL = "permalink_url";
    public static final String TEXT = "text";


    public ()
    {
    }
}
