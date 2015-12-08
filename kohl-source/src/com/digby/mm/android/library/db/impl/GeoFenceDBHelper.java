// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.db.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.digby.mm.android.library.db.IGeoFenceDBHelper;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geofence.impl.GeoFence;
import com.digby.mm.android.library.utils.Logger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.db.impl:
//            DigbyDBHelper, DatabaseGuard

public class GeoFenceDBHelper
    implements IGeoFenceDBHelper
{

    public static final String GEOFENCES_TABLE_CREATE = "CREATE TABLE GeoFences(ID INTEGER PRIMARY KEY, BSSID TEXT, SSID TEXT, GeoShape TEXT, LastKnownDistance INT, IsInside INT, ValidEventTypes TEXT, Name TEXT, Description TEXT, LocationCode TEXT, Tags TEXT);";
    public static final String GEOFENCES_TABLE_NAME = "GeoFences";
    private Context mContext;
    private DigbyDBHelper mDBHelper;

    public GeoFenceDBHelper(DigbyDBHelper digbydbhelper)
    {
        try
        {
            mDBHelper = digbydbhelper;
            mContext = mDBHelper.getContext();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DigbyDBHelper digbydbhelper)
        {
            Logger.Error("GeoFenceDBHelper", digbydbhelper);
        }
    }

    private ContentValues getContentValues(JSONObject jsonobject)
    {
        ContentValues contentvalues = new ContentValues();
        try
        {
            contentvalues.put("ID", Long.valueOf(jsonobject.getLong("id")));
            contentvalues.put("BSSID", jsonobject.getString("BSSID"));
            contentvalues.put("SSID", jsonobject.getString("SSID"));
            contentvalues.put("GeoShape", jsonobject.getJSONObject("geoShape").toString());
            contentvalues.put("LastKnownDistance", Integer.valueOf(0));
            contentvalues.put("IsInside", Integer.valueOf(0));
            contentvalues.put("ValidEventTypes", jsonobject.getString("validEventTypes"));
            contentvalues.put("Name", jsonobject.getString("name"));
            contentvalues.put("Description", jsonobject.getString("description"));
            contentvalues.put("LocationCode", jsonobject.getString("locationCode"));
            contentvalues.put("Tags", jsonobject.getString("tags"));
            Logger.Debug((new StringBuilder()).append("Content values: ").append(jsonobject.toString()).toString(), mContext);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.Error("getContentValues", jsonobject);
            return contentvalues;
        }
        return contentvalues;
    }

    public void deleteAllGeoFences()
    {
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.delete("GeoFences", null, null);
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        sqlitedatabase2.close();
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        Logger.Error("deleteAllGeoFences", exception1);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
          goto _L2
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        sqlitedatabase1.close();
        throw exception;
    }

    public void deleteGeoFence(long l)
    {
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.delete("GeoFences", "id = ?", new String[] {
            (new StringBuilder()).append(l).append("").toString()
        });
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        sqlitedatabase2.close();
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        Logger.Error("deleteGeoFence", exception1);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
          goto _L2
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        sqlitedatabase1.close();
        throw exception;
    }

    public IGeoFence getGeoFence(long l)
    {
        Object obj2 = null;
        Object obj3 = null;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        Object obj;
        SQLiteDatabase sqlitedatabase1;
        Object obj1;
        GeoFence geofence;
        Cursor cursor;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        cursor = null;
        geofence = null;
        obj = geofence;
        obj1 = cursor;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getReadableDatabase();
        sqlitedatabase = sqlitedatabase2;
        obj = geofence;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        String s = (new StringBuilder()).append("").append(l).toString();
        sqlitedatabase = sqlitedatabase2;
        obj = geofence;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor = sqlitedatabase2.query("GeoFences", new String[] {
            "ID", "BSSID", "SSID", "GeoShape", "LastKnownDistance", "IsInside", "ValidEventTypes", "Name", "Description", "LocationCode", 
            "Tags"
        }, "ID=?", new String[] {
            s
        }, null, null, null);
        geofence = obj3;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        geofence = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getColumnCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        geofence = obj3;
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        if (cursor.getCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        cursor.moveToFirst();
        sqlitedatabase = sqlitedatabase2;
        obj = cursor;
        sqlitedatabase1 = sqlitedatabase2;
        obj1 = cursor;
        geofence = new GeoFence(cursor, mContext);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        cursor.close();
        obj = geofence;
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        sqlitedatabase2.close();
        obj = geofence;
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            Logger.Debug((new StringBuilder()).append("Retrieved geofence: (").append(((GeoFence) (obj)).getID()).append("; ").append(((GeoFence) (obj)).getName()).append(")").toString(), mContext);
        }
        return ((IGeoFence) (obj));
        Exception exception1;
        exception1;
        sqlitedatabase1 = sqlitedatabase;
        obj1 = obj;
        Logger.Error("getGeoFence", exception1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        ((Cursor) (obj)).close();
        obj = obj2;
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
        obj = obj2;
          goto _L2
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_451;
        }
        ((Cursor) (obj1)).close();
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_461;
        }
        sqlitedatabase1.close();
        throw exception;
    }

    public List getGeoFences()
    {
        ArrayList arraylist = new ArrayList();
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        Object obj;
        Cursor cursor;
        Object obj1;
        Cursor cursor1;
        Cursor cursor2;
        Object obj3;
        obj1 = null;
        obj = null;
        obj3 = null;
        cursor2 = null;
        cursor = cursor2;
        cursor1 = obj3;
        Object obj2 = mDBHelper.getReadableDatabase();
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = obj3;
        cursor2 = ((SQLiteDatabase) (obj2)).query("GeoFences", new String[] {
            "ID", "BSSID", "SSID", "GeoShape", "LastKnownDistance", "IsInside", "ValidEventTypes", "Name", "Description", "LocationCode", 
            "Tags"
        }, null, null, null, null, null, null);
        if (cursor2 == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        if (cursor2.getColumnCount() <= 0) goto _L2; else goto _L3
_L3:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        cursor2.moveToFirst();
_L4:
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        if (cursor2.getPosition() == cursor2.getCount())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        arraylist.add(new GeoFence(cursor2, mContext));
        obj = obj2;
        cursor = cursor2;
        obj1 = obj2;
        cursor1 = cursor2;
        cursor2.moveToNext();
        if (true) goto _L4; else goto _L2
        obj2;
        obj1 = obj;
        cursor1 = cursor;
        Logger.Error("getGeoFences", ((Exception) (obj2)));
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        cursor.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        ((SQLiteDatabase) (obj)).close();
_L8:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        if (cursor2 == null) goto _L6; else goto _L5
_L5:
        cursor2.close();
_L6:
        if (obj2 == null) goto _L8; else goto _L7
_L7:
        ((SQLiteDatabase) (obj2)).close();
          goto _L8
        Exception exception;
        exception;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        cursor1.close();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((SQLiteDatabase) (obj1)).close();
        throw exception;
    }

    public IGeoFence insertGeoFence(JSONObject jsonobject)
    {
        Object obj2 = null;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        SQLiteDatabase sqlitedatabase;
        Object obj3;
        Object obj4;
        obj3 = null;
        obj4 = null;
        sqlitedatabase = null;
        obj = obj3;
        obj1 = obj4;
        if (getGeoFence(jsonobject.getLong("id")) != null) goto _L2; else goto _L1
_L1:
        obj = obj3;
        obj1 = obj4;
        sqlitedatabase = mDBHelper.getWritableDatabase();
        obj = sqlitedatabase;
        obj1 = sqlitedatabase;
        sqlitedatabase.insert("GeoFences", "SSID", getContentValues(jsonobject));
_L3:
        obj = sqlitedatabase;
        obj1 = sqlitedatabase;
        jsonobject = getGeoFence(jsonobject.getLong("id"));
        obj = jsonobject;
        jsonobject = ((JSONObject) (obj));
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        sqlitedatabase.close();
        jsonobject = ((JSONObject) (obj));
_L5:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return jsonobject;
_L2:
        obj = obj3;
        obj1 = obj4;
        updateGeoFence(jsonobject);
          goto _L3
        jsonobject;
        obj1 = obj;
        Logger.Error("insertGeoFence", jsonobject);
        jsonobject = obj2;
        if (obj == null) goto _L5; else goto _L4
_L4:
        ((SQLiteDatabase) (obj)).close();
        jsonobject = obj2;
          goto _L5
        jsonobject;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw jsonobject;
        jsonobject;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        ((SQLiteDatabase) (obj1)).close();
        throw jsonobject;
          goto _L3
    }

    public void updateGeoFence(JSONObject jsonobject)
    {
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase;
        SQLiteDatabase sqlitedatabase1;
        sqlitedatabase1 = null;
        sqlitedatabase = null;
        SQLiteDatabase sqlitedatabase2 = mDBHelper.getWritableDatabase();
        sqlitedatabase = sqlitedatabase2;
        sqlitedatabase1 = sqlitedatabase2;
        sqlitedatabase2.update("GeoFences", getContentValues(jsonobject), "id=?", new String[] {
            (new StringBuilder()).append("").append(jsonobject.getLong("id")).toString()
        });
        if (sqlitedatabase2 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        sqlitedatabase2.close();
_L2:
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        sqlitedatabase1 = sqlitedatabase;
        Logger.Error("updateGeoFence", jsonobject);
        if (sqlitedatabase == null) goto _L2; else goto _L1
_L1:
        sqlitedatabase.close();
          goto _L2
        jsonobject;
        com/digby/mm/android/library/db/impl/DatabaseGuard;
        JVM INSTR monitorexit ;
        throw jsonobject;
        jsonobject;
        if (sqlitedatabase1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        sqlitedatabase1.close();
        throw jsonobject;
    }
}
