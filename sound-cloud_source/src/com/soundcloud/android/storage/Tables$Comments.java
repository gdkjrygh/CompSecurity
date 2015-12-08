// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;
import com.soundcloud.propeller.schema.Column;

// Referenced classes of package com.soundcloud.android.storage:
//            Tables

public static class y.of extends BaseTable
{

    public static final Column BODY;
    public static final Column CREATED_AT;
    static final String SQL = "CREATE TABLE IF NOT EXISTS Comments (_id INTEGER PRIMARY KEY,urn TEXT UNIQUE,user_id INTEGER,track_id INTEGER,timestamp INTEGER,created_at INTEGER,body TEXT);";
    public static final TABLE TABLE;
    public static final Column TIMESTAMP;
    public static final Column TRACK_ID;
    public static final Column URN;
    public static final Column USER_ID;
    public static final Column _ID;

    static 
    {
        y.of of = new <init>();
        TABLE = of;
        _ID = Column.create(of, "_id");
        URN = Column.create(TABLE, "urn");
        USER_ID = Column.create(TABLE, "user_id");
        TRACK_ID = Column.create(TABLE, "track_id");
        TIMESTAMP = Column.create(TABLE, "timestamp");
        CREATED_AT = Column.create(TABLE, "created_at");
        BODY = Column.create(TABLE, "body");
    }

    y()
    {
        super("Comments", com.soundcloud.propeller.schema..of(new String[] {
            "_id"
        }));
    }
}
