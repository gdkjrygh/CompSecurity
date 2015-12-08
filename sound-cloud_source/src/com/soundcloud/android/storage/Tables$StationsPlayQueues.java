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

    public static final Column POSITION;
    static final String SQL = "CREATE TABLE IF NOT EXISTS StationsPlayQueues (station_urn TEXT,track_urn TEXT,position INTEGER DEFAULT 0,PRIMARY KEY(station_urn, track_urn, position) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));";
    public static final Column STATION_URN;
    public static final TABLE TABLE;
    public static final Column TRACK_URN;

    static 
    {
          = new <init>();
        TABLE = ;
        STATION_URN = Column.create(, "station_urn");
        TRACK_URN = Column.create(TABLE, "track_urn");
        POSITION = Column.create(TABLE, "position");
    }

    protected ()
    {
        super("StationsPlayQueues", com.soundcloud.propeller.schema.(new String[] {
            "station_urn", "track_urn", "position"
        }));
    }
}
