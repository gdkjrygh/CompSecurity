// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.pandora.radio.provider:
//            StationProvider, h

static class 
    implements 
{

    public Collection a()
    {
        ArrayList arraylist = new ArrayList(5);
        arraylist.add(new ("stations", h.a()));
        arraylist.add(new ("tracks", h.b()));
        arraylist.add(new ("adData", h.c()));
        arraylist.add(new ("artistMessage", h.d()));
        arraylist.add(new ("seedsData", h.e()));
        arraylist.add(new ("extendedStationData", h.f()));
        return arraylist;
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS TrackCleanup DELETE ON stations BEGIN  DELETE FROM tracks WHERE station_id = old._id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS AdDataCleanup DELETE ON tracks BEGIN  DELETE FROM adData WHERE old.adData_id = _id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ArtistMessageCleanup DELETE ON tracks BEGIN  DELETE FROM artistMessage WHERE old.artistMessage_id = _id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS SeedDataCleanup DELETE ON stations BEGIN  DELETE FROM seedsData WHERE stationToken = old.stationToken;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ExtendedStationDataCleanup DELETE ON extendedStationData BEGIN  DELETE FROM extendedStationData WHERE stationToken = old.stationToken;  END; ");
    }

    public void a(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS TrackCleanup DELETE ON stations BEGIN  DELETE FROM tracks WHERE station_id = old._id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS AdDataCleanup DELETE ON tracks BEGIN  DELETE FROM adData WHERE old.adData_id = _id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ArtistMessageCleanup DELETE ON tracks BEGIN  DELETE FROM artistMessage WHERE old.artistMessage_id = _id;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS SeedDataCleanup DELETE ON stations BEGIN  DELETE FROM seedsData WHERE stationToken = old.stationToken;  END; ");
        sqlitedatabase.execSQL("CREATE TRIGGER IF NOT EXISTS ExtendedStationDataCleanup DELETE ON extendedStationData BEGIN  DELETE FROM extendedStationData WHERE stationToken = old.stationToken;  END; ");
    }

    ()
    {
    }
}
