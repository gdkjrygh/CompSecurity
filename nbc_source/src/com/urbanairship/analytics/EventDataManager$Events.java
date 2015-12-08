// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;

import android.provider.BaseColumns;

// Referenced classes of package com.urbanairship.analytics:
//            EventDataManager

public static final class 
    implements BaseColumns
{

    public static final String ASCENDING_SORT_ORDER = "_id ASC";
    public static final String COLUMN_NAME_DATA = "data";
    public static final String COLUMN_NAME_EVENT_ID = "event_id";
    public static final String COLUMN_NAME_EVENT_SIZE = "event_size";
    public static final String COLUMN_NAME_SESSION_ID = "session_id";
    public static final String COLUMN_NAME_TIME = "time";
    public static final String COLUMN_NAME_TYPE = "type";
    public static final String TABLE_NAME = "events";

    private ()
    {
    }
}
