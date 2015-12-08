// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.location.Location;
import com.thetransitapp.droid.model.Route;
import com.thetransitapp.droid.model.RouteDirection;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.model.TransitBundle;
import com.thetransitapp.droid.model.TransitMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransitDatabaseHelper extends SQLiteOpenHelper
{

    private static final String CACHE_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, cache_key TEXT, cache_value TEXT, date_created DATE);";
    private static final String CACHE_TABLE_NAME = "cache";
    private static final String DATABASE_NAME = "transit";
    private static final int DATABASE_VERSION = 2;
    private static final String FAVORITE_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS favorite (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, date_created DATE);";
    private static final String FAVORITE_TABLE_NAME = "favorite";
    public static final String LAST_PLAN_FETCH_KEY = "LAST_PLAN_FETCH_KEY";
    private static final String LOCATION_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS location (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, latitude FLOAT, longitude FLOAT, date_created DATE);";
    private static final String LOCATION_TABLE_NAME = "location";
    private static final String SAVED_DIRECTION_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);";
    private static final String SAVED_DIRECTION_TABLE_NAME = "saved_directions";
    private static final String TRANSIT_MODE_TABLE_CREATE = "CREATE TABLE IF NOT EXISTS transit_mode (id INTEGER PRIMARY KEY AUTOINCREMENT, bundle_id TEXT, mode_id TEXT);";
    private static final String TRANSIT_MODE_TABLE_NAME = "transit_mode";

    public TransitDatabaseHelper(Context context)
    {
        super(context, "transit", null, 2);
    }

    private Cursor getSavedDirectionCursor(Route route, Location location, SQLiteDatabase sqlitedatabase)
    {
        String s = Double.valueOf(location.getLatitude() + 0.0050000000000000001D).toString();
        String s1 = Double.valueOf(location.getLongitude() + 0.0050000000000000001D).toString();
        String s2 = Double.valueOf(location.getLatitude() - 0.0050000000000000001D).toString();
        location = Double.valueOf(location.getLongitude() - 0.0050000000000000001D).toString();
        route = route.getId();
        return sqlitedatabase.query("saved_directions", new String[] {
            "id", "direction", "direction_index"
        }, "(latitude BETWEEN ? AND ?) AND (longitude BETWEEN ? AND ?) AND route_id = ?", new String[] {
            s2, s, location, s1, route
        }, null, null, null);
    }

    public void addLocationFavorite(SimplePlacemark simpleplacemark)
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", simpleplacemark.getName());
        contentvalues.put("latitude", Double.valueOf(simpleplacemark.getLatitude()));
        contentvalues.put("longitude", Double.valueOf(simpleplacemark.getLongitude()));
        contentvalues.put("date_created", simpledateformat.format(date));
        sqlitedatabase.insert("location", null, contentvalues);
    }

    public String getCache(String s)
    {
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        Cursor cursor = sqlitedatabase.query("cache", new String[] {
            "cache_value"
        }, "cache_key = ?", new String[] {
            s
        }, null, null, null);
        s = null;
        if (cursor.moveToFirst())
        {
            s = cursor.getString(0);
        }
        cursor.close();
        sqlitedatabase.close();
        return s;
    }

    public List getLocationFavorites()
    {
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        Cursor cursor = sqlitedatabase.query("location", new String[] {
            "name, latitude, longitude"
        }, null, null, null, null, "date_created DESC");
        ArrayList arraylist = new ArrayList();
        do
        {
            if (!cursor.moveToNext())
            {
                cursor.close();
                sqlitedatabase.close();
                return arraylist;
            }
            SimplePlacemark simpleplacemark = new SimplePlacemark(cursor.getDouble(1), cursor.getDouble(2));
            simpleplacemark.setName(cursor.getString(0));
            arraylist.add(simpleplacemark);
        } while (true);
    }

    public RouteDirection getSavedDirection(Route route, Location location)
    {
        Object obj = null;
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        location = getSavedDirectionCursor(route, location, sqlitedatabase);
        route = obj;
        if (location.moveToFirst())
        {
            route = new RouteDirection();
            route.setDirection(com.thetransitapp.droid.model.Itinerary.DirectionType.values()[location.getInt(1)]);
            route.setDirectionIndex(location.getInt(2));
        }
        sqlitedatabase.close();
        return route;
    }

    public boolean isFavorite(Route route)
    {
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        route = route.getId();
        route = sqlitedatabase.query("favorite", new String[] {
            "id"
        }, "route_id = ?", new String[] {
            route
        }, null, null, null);
        boolean flag = route.moveToFirst();
        route.close();
        sqlitedatabase.close();
        return flag;
    }

    public boolean isTransitModeSlected(TransitBundle transitbundle, TransitMode transitmode)
    {
        SQLiteDatabase sqlitedatabase = super.getReadableDatabase();
        transitbundle = transitbundle.getId();
        transitmode = transitmode.getId();
        transitbundle = sqlitedatabase.query("transit_mode", new String[] {
            "id"
        }, "bundle_id = ? AND mode_id = ?", new String[] {
            transitbundle, transitmode
        }, null, null, null);
        boolean flag = transitbundle.moveToFirst();
        transitbundle.close();
        sqlitedatabase.close();
        return !flag;
    }

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS favorite (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, date_created DATE);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS cache (id INTEGER PRIMARY KEY AUTOINCREMENT, cache_key TEXT, cache_value TEXT, date_created DATE);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS location (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, latitude FLOAT, longitude FLOAT, date_created DATE);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS transit_mode (id INTEGER PRIMARY KEY AUTOINCREMENT, bundle_id TEXT, mode_id TEXT);");
        sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);");
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            sqlitedatabase.execSQL("CREATE TABLE IF NOT EXISTS saved_directions (id INTEGER PRIMARY KEY AUTOINCREMENT, route_id TEXT, latitude FLOAT, longitude FLOAT, direction INTEGER, direction_index INTEGER);");
            break;
        }
    }

    public void saveCache(String s, String s1)
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("cache_key", s);
        contentvalues.put("cache_value", s1);
        contentvalues.put("date_created", simpledateformat.format(date));
        sqlitedatabase.insert("cache", null, contentvalues);
        sqlitedatabase.close();
    }

    public void saveDirection(Route route, RouteDirection routedirection, Location location)
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        Cursor cursor = getSavedDirectionCursor(route, location, sqlitedatabase);
        if (cursor.moveToFirst())
        {
            sqlitedatabase.delete("saved_directions", "id = ?", new String[] {
                cursor.getString(0)
            });
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("route_id", route.getId());
        contentvalues.put("latitude", Double.valueOf(location.getLatitude()));
        contentvalues.put("longitude", Double.valueOf(location.getLongitude()));
        contentvalues.put("direction", Integer.valueOf(routedirection.getDirection().ordinal()));
        contentvalues.put("direction_index", Integer.valueOf(routedirection.getDirectionIndex()));
        sqlitedatabase.insert("saved_directions", null, contentvalues);
        cursor.close();
        sqlitedatabase.close();
    }

    public void saveTransitModeSelection(TransitBundle transitbundle)
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        sqlitedatabase.delete("transit_mode", "bundle_id = ?", new String[] {
            transitbundle.getId()
        });
        Iterator iterator = transitbundle.getTransitModes().iterator();
        do
        {
            TransitMode transitmode;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                transitmode = (TransitMode)iterator.next();
            } while (transitmode.isSelected());
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("bundle_id", transitbundle.getId());
            contentvalues.put("mode_id", transitmode.getId());
            sqlitedatabase.insert("transit_mode", null, contentvalues);
        } while (true);
    }

    public void toggleFavorite(Route route)
    {
        SQLiteDatabase sqlitedatabase = super.getWritableDatabase();
        Object obj = route.getId();
        obj = sqlitedatabase.query("favorite", new String[] {
            "id"
        }, "route_id = ?", new String[] {
            obj
        }, null, null, null);
        if (((Cursor) (obj)).moveToFirst())
        {
            sqlitedatabase.delete("favorite", "route_id = ?", new String[] {
                route.getId()
            });
            route.setFavorite(false);
        } else
        {
            SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("route_id", route.getId());
            contentvalues.put("date_created", simpledateformat.format(date));
            sqlitedatabase.insert("favorite", null, contentvalues);
            route.setFavorite(true);
        }
        ((Cursor) (obj)).close();
        sqlitedatabase.close();
    }
}
