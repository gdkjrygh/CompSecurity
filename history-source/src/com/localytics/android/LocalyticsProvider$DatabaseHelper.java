// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider, DatapointHelper, Constants

private static final class mContext extends SQLiteOpenHelper
{

    private static final String SQLITE_BOOLEAN_FALSE = "0";
    private static final String SQLITE_BOOLEAN_TRUE = "1";
    private final Context mContext;

    public void onCreate(SQLiteDatabase sqlitedatabase)
    {
        if (sqlitedatabase == null)
        {
            throw new IllegalArgumentException("db cannot be null");
        } else
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT UNIQUE NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s INTEGER NOT NULL CHECK(%s IN (%s, %s)));", new Object[] {
                "api_keys", "_id", "api_key", "uuid", "created_time", "created_time", "opt_out", "opt_out", "0", "1"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT UNIQUE NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s INTEGER NOT NULL CHECK (%s >= 0));", new Object[] {
                "sessions", "_id", "api_key_ref", "api_keys", "_id", "uuid", "session_start_wall_time", "session_start_wall_time", "localytics_library_version", "iu", 
                "app_version", "android_version", "android_sdk", "device_model", "device_manufacturer", "device_android_id_hash", "device_telephony_id", "device_telephony_id_hash", "device_serial_number_hash", "device_wifi_mac_hash", 
                "locale_language", "locale_country", "network_carrier", "network_country", "network_type", "device_country", "latitude", "longitude", "device_android_id", "device_advertising_id", 
                "elapsed", "elapsed"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL CHECK (%s >= 0), %s INTEGER NOT NULL CHECK (%s >= 0), %s INTEGER NOT NULL DEFAULT 0, %s REAL, %s REAL, %s TEXT, %s TEXT, %s TEXT);", new Object[] {
                "events", "_id", "session_key_ref", "sessions", "_id", "uuid", "event_name", "real_time", "real_time", "wall_time", 
                "wall_time", "clv_increase", "event_lat", "event_lng", "customer_id", "user_type", "ids"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT NOT NULL CHECK(%s IN (%s, %s)), %s TEXT NOT NULL, %s INTEGER);", new Object[] {
                "event_history", "_id", "session_key_ref", "sessions", "_id", "type", "type", Integer.valueOf(0), Integer.valueOf(1), "name", 
                "processed_in_blob"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL);", new Object[] {
                "attributes", "_id", "events_key_ref", "events", "_id", "attribute_key", "attribute_value"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL);", new Object[] {
                "upload_blobs", "_id", "uuid"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER REFERENCES %s(%s) NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "upload_blob_events", "_id", "upload_blobs_key_ref", "upload_blobs", "_id", "events_key_ref", "events", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s INTEGER, %s INTEGER, %s INTEGER);", new Object[] {
                "info", "_id", "fb_attribution", "play_attribution", "sender_id", "registration_id", "registration_version", "first_android_id", "first_telephony_id", "first_advertising_id", 
                "package_name", "first_run", "push_disabled", "last_session_open_time"
            }));
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("fb_attribution", DatapointHelper.getFBAttribution(mContext));
            contentvalues.put("first_run", Boolean.TRUE);
            contentvalues.put("first_android_id", DatapointHelper.getAndroidIdOrNull(mContext));
            contentvalues.put("first_telephony_id", DatapointHelper.getTelephonyDeviceIdOrNull(mContext));
            contentvalues.put("first_advertising_id", DatapointHelper.getAdvertisingIdOrNull(mContext));
            contentvalues.put("package_name", mContext.getPackageName());
            sqlitedatabase.insertOrThrow("info", null, contentvalues);
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL);", new Object[] {
                "identifiers", "_id", "key", "value"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER, %s INTEGER, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER, %s INTEGER NOT NULL, %s TEXT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL)", new Object[] {
                "amp_rules", "_id", "campaign_id", "expiration", "display_seconds", "display_session", "version", "phone_location", "phone_size_width", "phone_size_height", 
                "tablet_location", "tablet_size_width", "tablet_size_height", "time_to_display", "internet_required", "ab_test", "rule_name", "location", "devices"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_ruleevent", "_id", "event_name", "rule_id_ref", "amp_rules", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL);", new Object[] {
                "amp_displayed", "_id", "displayed", "campaign_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_conditions", "_id", "attribute_name", "operator", "rule_id_ref", "amp_rules", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_condition_values", "_id", "value", "condition_id_ref", "amp_conditions", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL);", new Object[] {
                "custom_dimensions", "_id", "custom_dimension_key", "custom_dimension_value"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s INTEGER)", new Object[] {
                "profile", "_id", "attribute", "customer_id", "action"
            }));
            return;
        }
    }

    public void onOpen(SQLiteDatabase sqlitedatabase)
    {
        super.onOpen(sqlitedatabase);
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("SQLite library version is: %s", new Object[] {
                DatabaseUtils.stringForQuery(sqlitedatabase, "select sqlite_version()", null)
            }));
        }
        if (!sqlitedatabase.isReadOnly())
        {
            sqlitedatabase.execSQL("PRAGMA foreign_keys = ON;");
        }
    }

    public void onUpgrade(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        Object obj;
        if (i < 3)
        {
            sqlitedatabase.delete("upload_blob_events", null, null);
            sqlitedatabase.delete("event_history", null, null);
            sqlitedatabase.delete("upload_blobs", null, null);
            sqlitedatabase.delete("attributes", null, null);
            sqlitedatabase.delete("events", null, null);
            sqlitedatabase.delete("sessions", null, null);
        }
        if (i < 4)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "sessions", "iu"
            }));
        }
        if (i < 5)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "sessions", "device_wifi_mac_hash"
            }));
        }
        if (i >= 6)
        {
            break MISSING_BLOCK_LABEL_371;
        }
        obj = null;
        Cursor cursor = sqlitedatabase.query("attributes", new String[] {
            "_id", "attribute_key"
        }, null, null, null, null, null);
        obj = cursor;
        j = cursor.getColumnIndexOrThrow("_id");
        obj = cursor;
        int k = cursor.getColumnIndexOrThrow("attribute_key");
        obj = cursor;
        ContentValues contentvalues = new ContentValues();
        obj = cursor;
        String s = String.format("%s = ?", new Object[] {
            "_id"
        });
        obj = cursor;
        String as[] = new String[1];
        obj = cursor;
        cursor.moveToPosition(-1);
_L2:
        obj = cursor;
        if (!cursor.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = cursor;
        contentvalues.put("attribute_key", String.format("%s:%s", new Object[] {
            mContext.getPackageName(), cursor.getString(k)
        }));
        obj = cursor;
        as[0] = Long.toString(cursor.getLong(j));
        obj = cursor;
        sqlitedatabase.update("attributes", contentvalues, s, as);
        obj = cursor;
        contentvalues.clear();
        if (true) goto _L2; else goto _L1
        sqlitedatabase;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
_L1:
        if (cursor != null)
        {
            cursor.close();
        }
        if (i < 7)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s TEXT, %s INTEGER);", new Object[] {
                "info", "fb_attribution", "first_run"
            }));
            obj = new ContentValues();
            ((ContentValues) (obj)).putNull("fb_attribution");
            ((ContentValues) (obj)).put("first_run", Boolean.FALSE);
            sqlitedatabase.insertOrThrow("info", null, ((ContentValues) (obj)));
        }
        if (i < 8)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL);", new Object[] {
                "identifiers", "_id", "key", "value"
            }));
        }
        if (i < 9)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER NOT NULL DEFAULT 0;", new Object[] {
                "events", "clv_increase"
            }));
        }
        if (i < 10)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "play_attribution"
            }));
        }
        if (i < 11)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "registration_id"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "registration_version"
            }));
        }
        if (i < 12)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "first_android_id"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "first_telephony_id"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "package_name"
            }));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("first_android_id", DatapointHelper.getAndroidIdOrNull(mContext));
            ((ContentValues) (obj)).put("first_telephony_id", DatapointHelper.getTelephonyDeviceIdOrNull(mContext));
            ((ContentValues) (obj)).put("package_name", mContext.getPackageName());
            sqlitedatabase.update("info", ((ContentValues) (obj)), null, null);
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "sessions", "device_android_id"
            }));
        }
        if (i < 13)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s REAL;", new Object[] {
                "events", "event_lat"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s REAL;", new Object[] {
                "events", "event_lng"
            }));
        }
        if (i < 14)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER, %s INTEGER, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s TEXT NOT NULL, %s INTEGER NOT NULL, %s INTEGER NOT NULL, %s INTEGER, %s INTEGER NOT NULL, %s TEXT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL)", new Object[] {
                "amp_rules", "_id", "campaign_id", "expiration", "display_seconds", "display_session", "version", "phone_location", "phone_size_width", "phone_size_height", 
                "tablet_location", "tablet_size_width", "tablet_size_height", "time_to_display", "internet_required", "ab_test", "rule_name", "location", "devices"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_ruleevent", "_id", "event_name", "rule_id_ref", "amp_rules", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s INTEGER NOT NULL DEFAULT 0, %s INTEGER NOT NULL);", new Object[] {
                "amp_displayed", "_id", "displayed", "campaign_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_conditions", "_id", "attribute_name", "operator", "rule_id_ref", "amp_rules", "_id"
            }));
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT NOT NULL, %s INTEGER REFERENCES %s(%s) NOT NULL);", new Object[] {
                "amp_condition_values", "_id", "value", "condition_id_ref", "amp_conditions", "_id"
            }));
        }
        if (i < 15)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT UNIQUE NOT NULL, %s TEXT NOT NULL);", new Object[] {
                "custom_dimensions", "_id", "custom_dimension_key", "custom_dimension_value"
            }));
        }
        if (i < 16)
        {
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "first_advertising_id"
            }));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("first_advertising_id", DatapointHelper.getAdvertisingIdOrNull(mContext));
            sqlitedatabase.update("info", ((ContentValues) (obj)), null, null);
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "sessions", "device_advertising_id"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER;", new Object[] {
                "info", "push_disabled"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "info", "sender_id"
            }));
        }
        if (i < 17)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s INTEGER)", new Object[] {
                "profile", "_id", "attribute", "action"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "events", "customer_id"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "events", "user_type"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT;", new Object[] {
                "events", "ids"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER", new Object[] {
                "info", "last_session_open_time"
            }));
            sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s INTEGER NOT NULL CHECK (%s >= 0) DEFAULT 0", new Object[] {
                "sessions", "elapsed", "elapsed"
            }));
        }
        if (i >= 18)
        {
            break MISSING_BLOCK_LABEL_1773;
        }
        sqlitedatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s TEXT", new Object[] {
            "profile", "customer_id"
        }));
        obj = null;
        contentvalues = new ContentValues();
        cursor = sqlitedatabase.query("profile", null, null, null, null, null, null);
_L3:
        obj = cursor;
        if (!cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_1761;
        }
        obj = cursor;
        s = String.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("_id")));
        obj = cursor;
        JSONObject jsonobject = new JSONObject(cursor.getString(cursor.getColumnIndexOrThrow("attribute")));
        obj = cursor;
        contentvalues.put("attribute", jsonobject.getString("attributes"));
        obj = cursor;
        contentvalues.put("customer_id", jsonobject.getString("id"));
        obj = cursor;
        sqlitedatabase.update("profile", contentvalues, String.format("%s = %s", new Object[] {
            "_id", s
        }), null);
        obj = cursor;
        contentvalues.clear();
          goto _L3
        obj;
        obj = cursor;
        sqlitedatabase.delete("profile", String.format("%s = %s", new Object[] {
            "_id", s
        }), null);
          goto _L3
        sqlitedatabase;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw sqlitedatabase;
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public (Context context, String s, int i)
    {
        super(context, s, null, i);
        mContext = context;
    }
}
