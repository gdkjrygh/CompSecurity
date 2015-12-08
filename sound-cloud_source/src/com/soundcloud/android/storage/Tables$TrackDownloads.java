// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.storage:
//            Tables

public static class  extends BaseTable
{

    public static final Column DOWNLOADED_AT;
    public static final Column REMOVED_AT;
    public static final Column REQUESTED_AT;
    static final String SQL = "CREATE TABLE IF NOT EXISTS TrackDownloads (_id INTEGER PRIMARY KEY,requested_at INTEGER DEFAULT CURRENT_TIMESTAMP,downloaded_at INTEGER DEFAULT NULL,removed_at INTEGER DEFAULT NULL,unavailable_at INTEGER DEFAULT NULL);";
    public static final TABLE TABLE;
    public static final Column UNAVAILABLE_AT;
    public static final Column _ID;

    static 
    {
          = new <init>();
        TABLE = ;
        _ID = Column.create(, "_id");
        REMOVED_AT = Column.create(TABLE, "removed_at");
        REQUESTED_AT = Column.create(TABLE, "requested_at");
        DOWNLOADED_AT = Column.create(TABLE, "downloaded_at");
        UNAVAILABLE_AT = Column.create(TABLE, "unavailable_at");
    }

    protected ()
    {
        super("TrackDownloads", com.soundcloud.propeller.schema.(new String[] {
            "_id"
        }));
    }
}
