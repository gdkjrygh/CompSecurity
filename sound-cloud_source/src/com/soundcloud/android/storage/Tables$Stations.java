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

    public static final Column LAST_PLAYED_TRACK_POSITION;
    public static final Column PERMALINK;
    static final String SQL = "CREATE TABLE IF NOT EXISTS Stations (station_urn TEXT,type TEXT,title TEXT,permalink TEXT,last_played_track_position INTEGER DEFAULT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE);";
    public static final Column STATION_URN;
    public static final TABLE TABLE;
    public static final Column TITLE;
    public static final Column TYPE;

    static 
    {
        y.of of = new <init>();
        TABLE = of;
        STATION_URN = Column.create(of, "station_urn");
        TYPE = Column.create(TABLE, "type");
        TITLE = Column.create(TABLE, "title");
        PERMALINK = Column.create(TABLE, "permalink");
        LAST_PLAYED_TRACK_POSITION = Column.create(TABLE, "last_played_track_position");
    }

    protected y()
    {
        super("Stations", com.soundcloud.propeller.schema..of(new String[] {
            "station_urn"
        }));
    }
}
