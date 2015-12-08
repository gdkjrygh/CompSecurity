// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.db.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.digby.mm.android.library.utils.Logger;

public class DigbyDBHelper extends SQLiteOpenHelper
{

    private static final String mCreateStatements[] = {
        "CREATE TABLE GeoFences(ID INTEGER PRIMARY KEY, BSSID TEXT, SSID TEXT, GeoShape TEXT, LastKnownDistance INT, IsInside INT, ValidEventTypes TEXT, Name TEXT, Description TEXT, LocationCode TEXT, Tags TEXT);", "CREATE TABLE Messages(ID INTEGER PRIMARY KEY, CampaignID INTEGER, Title TEXT, Message TEXT, ExpirationDate TEXT, IsRead INTEGER );", "CREATE TABLE MessageMetadata (Key TEXT, Value TEXT, MessageID INTEGER, FOREIGN KEY(MessageID) REFERENCES Messages(ID));", "CREATE TABLE GeoFenceActivity(GeoFenceID INT, Action TEXT, ActionDate INTEGER);", "CREATE TABLE ProximityAlerts(GeoFenceID INT, IntentAction TEXT);"
    };
    private static final String mDBName = "DigbyLMMDB";
    private static final int mDBVersion = 3;
    private Context mContext;

    public DigbyDBHelper(Context context)
    {
        super(context, "DigbyLMMDB", null, 3);
        mContext = context;
    }

    private void createTables(SQLiteDatabase sqlitedatabase)
    {
        int i = 0;
_L2:
        if (i >= mCreateStatements.length)
        {
            break; /* Loop/switch isn't completed */
        }
        sqlitedatabase.execSQL(mCreateStatements[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            Logger.Debug("Done creating tables", mContext);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Logger.Error("createTables", sqlitedatabase);
        }
        return;
    }

    public Context getContext()
    {
        return mContext;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        try
        {
            Logger.Debug("DigbyDBHelper.onCreate", mContext);
            createTables(sqlitedatabase);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Logger.Error("DigbyDBHelper_onCreate", sqlitedatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Logger.Debug((new StringBuilder()).append("Upgrade Digby.sqlite from version ").append(i).append(" to version ").append(j).toString());
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        try
        {
            Logger.Debug("CREATE TABLE MessageMetadata (Key TEXT, Value TEXT, MessageID INTEGER, FOREIGN KEY(MessageID) REFERENCES Messages(ID));");
            sqlitedatabase.execSQL("CREATE TABLE MessageMetadata (Key TEXT, Value TEXT, MessageID INTEGER, FOREIGN KEY(MessageID) REFERENCES Messages(ID));");
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            Logger.Error("DigbyDBHelper_onUpgrade", sqlitedatabase);
            return;
        }
        if (i >= 2)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        Logger.Debug("Add Tags and LocationCode columns to GeoFences table");
        sqlitedatabase.execSQL("DELETE FROM GeoFences;");
        sqlitedatabase.execSQL("ALTER TABLE GeoFences ADD LocationCode TEXT;");
        sqlitedatabase.execSQL("ALTER TABLE GeoFences ADD Tags TEXT;");
    }

}
