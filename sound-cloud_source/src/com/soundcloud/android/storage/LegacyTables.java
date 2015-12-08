// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import com.soundcloud.propeller.schema.BaseTable;

interface LegacyTables
{
    public static class RecentStations extends BaseTable
    {

        static final String SQL = "CREATE TABLE IF NOT EXISTS RecentStations (station_urn TEXT,position INTEGER NOT NULL,PRIMARY KEY(station_urn) ON CONFLICT REPLACE,FOREIGN KEY(station_urn) REFERENCES Stations(station_urn));";
        public static final RecentStations TABLE = new RecentStations();


        protected RecentStations()
        {
            super("RecentStations", com.soundcloud.propeller.schema.Table.PrimaryKey.of(new String[] {
                "station_urn"
            }));
        }
    }

}
