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

    public static final Column COLLECTION_TYPE;
    public static final Column POSITION;
    static final String SQL = "CREATE TABLE IF NOT EXISTS StationsCollections (station_urn TEXT NOT NULL,collection_type INTEGER NOT NULL,position INTEGER,updated_locally_at INTEGER,PRIMARY KEY(station_urn, collection_type) ON CONFLICT IGNORE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));";
    public static final Column STATION_URN;
    public static final TABLE TABLE;
    public static final Column UPDATED_LOCALLY_AT;

    static 
    {
          = new <init>();
        TABLE = ;
        STATION_URN = Column.create(, "station_urn");
        COLLECTION_TYPE = Column.create(TABLE, "collection_type");
        POSITION = Column.create(TABLE, "position");
        UPDATED_LOCALLY_AT = Column.create(TABLE, "updated_locally_at");
    }

    protected ()
    {
        super("StationsCollections", com.soundcloud.propeller.schema.(new String[] {
            "station_urn, collection_type"
        }));
    }
}
