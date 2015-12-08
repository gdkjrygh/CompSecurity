// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.storage:
//            Tables

public static class .of extends BaseTable
{

    public static final Column RELATED_ENTITY;
    public static final Column REPOSTER_ID;
    public static final Column SOURCE;
    public static final Column SOURCE_VERSION;
    static final String SQL = "CREATE TABLE IF NOT EXISTS PlayQueue (_id INTEGER PRIMARY KEY AUTOINCREMENT,track_id INTEGER,reposter_id INTEGER,related_entity TEXT,source VARCHAR(255),source_version VARCHAR(255));";
    public static final TABLE TABLE;
    public static final Column TRACK_ID;

    static 
    {
        .of of = new <init>();
        TABLE = of;
        TRACK_ID = Column.create(of, "track_id");
        REPOSTER_ID = Column.create(TABLE, "reposter_id");
        RELATED_ENTITY = Column.create(TABLE, "related_entity");
        SOURCE = Column.create(TABLE, "source");
        SOURCE_VERSION = Column.create(TABLE, "source_version");
    }

    protected ()
    {
        super("PlayQueue", com.soundcloud.propeller.schema.of(new String[] {
            "_id"
        }));
    }
}
