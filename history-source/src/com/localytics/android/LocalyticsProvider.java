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
import android.database.sqlite.SQLiteQueryBuilder;
import android.provider.BaseColumns;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            DatapointHelper, Constants

class LocalyticsProvider
{
    public static final class AmpConditionValuesDbColumns
        implements BaseColumns
    {

        public static final String CONDITION_ID_REF = "condition_id_ref";
        public static final String TABLE_NAME = "amp_condition_values";
        public static final String VALUE = "value";

        private AmpConditionValuesDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class AmpConditionsDbColumns
        implements BaseColumns
    {

        public static final String ATTRIBUTE_NAME = "attribute_name";
        public static final String OPERATOR = "operator";
        public static final String RULE_ID_REF = "rule_id_ref";
        public static final String TABLE_NAME = "amp_conditions";

        private AmpConditionsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class AmpDisplayedDbColumns
        implements BaseColumns
    {

        public static final String CAMPAIGN_ID = "campaign_id";
        public static final String DISPLAYED = "displayed";
        public static final String TABLE_NAME = "amp_displayed";

        private AmpDisplayedDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class AmpRuleEventDbColumns
        implements BaseColumns
    {

        public static final String EVENT_NAME = "event_name";
        public static final String RULE_ID_REF = "rule_id_ref";
        public static final String TABLE_NAME = "amp_ruleevent";

        private AmpRuleEventDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class AmpRulesDbColumns
        implements BaseColumns
    {

        public static final String AB_TEST = "ab_test";
        public static final String CAMPAIGN_ID = "campaign_id";
        public static final String DEVICES = "devices";
        public static final String DISPLAY_SECONDS = "display_seconds";
        public static final String DISPLAY_SESSION = "display_session";
        public static final String EXPIRATION = "expiration";
        public static final String INTERNET_REQUIRED = "internet_required";
        public static final String LOCATION = "location";
        public static final String PHONE_LOCATION = "phone_location";
        public static final String PHONE_SIZE_HEIGHT = "phone_size_height";
        public static final String PHONE_SIZE_WIDTH = "phone_size_width";
        public static final String RULE_NAME = "rule_name";
        public static final String TABLET_LOCATION = "tablet_location";
        public static final String TABLET_SIZE_HEIGHT = "tablet_size_height";
        public static final String TABLET_SIZE_WIDTH = "tablet_size_width";
        public static final String TABLE_NAME = "amp_rules";
        public static final String TIME_TO_DISPLAY = "time_to_display";
        public static final String VERSION = "version";

        private AmpRulesDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class ApiKeysDbColumns
        implements BaseColumns
    {

        public static final String API_KEY = "api_key";
        public static final String CREATED_TIME = "created_time";
        public static final String OPT_OUT = "opt_out";
        public static final String TABLE_NAME = "api_keys";
        public static final String UUID = "uuid";

        private ApiKeysDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class AttributesDbColumns
        implements BaseColumns
    {

        static final String ATTRIBUTE_CUSTOM_DIMENSION_1 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_0"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_10 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_9"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_2 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_1"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_3 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_2"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_4 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_3"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_5 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_4"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_6 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_5"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_7 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_6"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_8 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_7"
        });
        static final String ATTRIBUTE_CUSTOM_DIMENSION_9 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_8"
        });
        static final String ATTRIBUTE_FORMAT = "%s:%s";
        public static final String ATTRIBUTE_KEY = "attribute_key";
        public static final String ATTRIBUTE_VALUE = "attribute_value";
        public static final String EVENTS_KEY_REF = "events_key_ref";
        public static final String TABLE_NAME = "attributes";


        private AttributesDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class CustomDimensionsDbColumns
        implements BaseColumns
    {

        static final String CUSTOM_DIMENSION_1 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_0"
        });
        static final String CUSTOM_DIMENSION_10 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_9"
        });
        static final String CUSTOM_DIMENSION_2 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_1"
        });
        static final String CUSTOM_DIMENSION_3 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_2"
        });
        static final String CUSTOM_DIMENSION_4 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_3"
        });
        static final String CUSTOM_DIMENSION_5 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_4"
        });
        static final String CUSTOM_DIMENSION_6 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_5"
        });
        static final String CUSTOM_DIMENSION_7 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_6"
        });
        static final String CUSTOM_DIMENSION_8 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_7"
        });
        static final String CUSTOM_DIMENSION_9 = String.format("%s:%s", new Object[] {
            "com.localytics.android", "custom_dimension_8"
        });
        static final String CUSTOM_DIMENSION_FORMAT = "%s:%s";
        public static final String CUSTOM_DIMENSION_KEY = "custom_dimension_key";
        public static final String CUSTOM_DIMENSION_VALUE = "custom_dimension_value";
        public static final String TABLE_NAME = "custom_dimensions";


        private CustomDimensionsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    private static final class DatabaseHelper extends SQLiteOpenHelper
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

        public DatabaseHelper(Context context, String s, int i)
        {
            super(context, s, null, i);
            mContext = context;
        }
    }

    public static final class EventHistoryDbColumns
        implements BaseColumns
    {

        public static final String NAME = "name";
        public static final String PROCESSED_IN_BLOB = "processed_in_blob";
        public static final String SESSION_KEY_REF = "session_key_ref";
        public static final String TABLE_NAME = "event_history";
        public static final String TYPE = "type";
        public static final int TYPE_EVENT = 0;
        public static final int TYPE_SCREEN = 1;

        private EventHistoryDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class EventsDbColumns
        implements BaseColumns
    {

        public static final String CLV_INCREASE = "clv_increase";
        public static final String CUST_ID = "customer_id";
        public static final String EVENT_NAME = "event_name";
        public static final String IDENTIFIERS = "ids";
        public static final String LAT_NAME = "event_lat";
        public static final String LNG_NAME = "event_lng";
        public static final String REAL_TIME = "real_time";
        public static final String SESSION_KEY_REF = "session_key_ref";
        public static final String TABLE_NAME = "events";
        public static final String USER_TYPE = "user_type";
        public static final String UUID = "uuid";
        public static final String WALL_TIME = "wall_time";

        private EventsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class IdentifiersDbColumns
        implements BaseColumns
    {

        public static final String KEY = "key";
        public static final String TABLE_NAME = "identifiers";
        public static final String VALUE = "value";

        private IdentifiersDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class InfoDbColumns
        implements BaseColumns
    {

        public static final String FB_ATTRIBUTION = "fb_attribution";
        public static final String FIRST_ADVERTISING_ID = "first_advertising_id";
        public static final String FIRST_ANDROID_ID = "first_android_id";
        public static final String FIRST_RUN = "first_run";
        public static final String FIRST_TELEPHONY_ID = "first_telephony_id";
        public static final String LAST_SESSION_OPEN_TIME = "last_session_open_time";
        public static final String PACKAGE_NAME = "package_name";
        public static final String PLAY_ATTRIBUTION = "play_attribution";
        public static final String PUSH_DISABLED = "push_disabled";
        public static final String REGISTRATION_ID = "registration_id";
        public static final String REGISTRATION_VERSION = "registration_version";
        public static final String SENDER_ID = "sender_id";
        public static final String TABLE_NAME = "info";

        private InfoDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class ProfileDbColumns
        implements BaseColumns
    {

        public static final String ACTION = "action";
        public static final String ATTRIBUTE = "attribute";
        public static final String CUSTOMER_ID = "customer_id";
        public static final String TABLE_NAME = "profile";

        private ProfileDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class SessionsDbColumns
        implements BaseColumns
    {

        public static final String ANDROID_SDK = "android_sdk";
        public static final String ANDROID_VERSION = "android_version";
        public static final String API_KEY_REF = "api_key_ref";
        public static final String APP_VERSION = "app_version";
        public static final String DEVICE_ADVERTISING_ID = "device_advertising_id";
        public static final String DEVICE_ANDROID_ID = "device_android_id";
        public static final String DEVICE_ANDROID_ID_HASH = "device_android_id_hash";
        public static final String DEVICE_COUNTRY = "device_country";
        public static final String DEVICE_MANUFACTURER = "device_manufacturer";
        public static final String DEVICE_MODEL = "device_model";
        public static final String DEVICE_SERIAL_NUMBER_HASH = "device_serial_number_hash";
        public static final String DEVICE_TELEPHONY_ID = "device_telephony_id";
        public static final String DEVICE_TELEPHONY_ID_HASH = "device_telephony_id_hash";
        public static final String DEVICE_WIFI_MAC_HASH = "device_wifi_mac_hash";
        public static final String ELAPSED_TIME_SINCE_LAST_SESSION = "elapsed";
        public static final String LATITUDE = "latitude";
        public static final String LOCALE_COUNTRY = "locale_country";
        public static final String LOCALE_LANGUAGE = "locale_language";
        public static final String LOCALYTICS_INSTALLATION_ID = "iu";
        public static final String LOCALYTICS_LIBRARY_VERSION = "localytics_library_version";
        public static final String LONGITUDE = "longitude";
        public static final String NETWORK_CARRIER = "network_carrier";
        public static final String NETWORK_COUNTRY = "network_country";
        public static final String NETWORK_TYPE = "network_type";
        public static final String SESSION_START_WALL_TIME = "session_start_wall_time";
        public static final String TABLE_NAME = "sessions";
        public static final String UUID = "uuid";

        private SessionsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class UploadBlobEventsDbColumns
        implements BaseColumns
    {

        public static final String EVENTS_KEY_REF = "events_key_ref";
        public static final String TABLE_NAME = "upload_blob_events";
        public static final String UPLOAD_BLOBS_KEY_REF = "upload_blobs_key_ref";

        private UploadBlobEventsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }

    public static final class UploadBlobsDbColumns
        implements BaseColumns
    {

        public static final String TABLE_NAME = "upload_blobs";
        public static final String UUID = "uuid";

        private UploadBlobsDbColumns()
        {
            throw new UnsupportedOperationException("This class is non-instantiable");
        }
    }


    static final String DATABASE_FILE = "com.localytics.android.%s.sqlite";
    private static final int DATABASE_VERSION = 18;
    static final String USER_ID = "id";
    static final String USER_TYPE = "type";
    private static final String USER_TYPE_ANONYMOUS = "anonymous";
    private static final String USER_TYPE_KNOWN = "known";
    private static final Map sCountProjectionMap = Collections.unmodifiableMap(getCountProjectionMap());
    private static final Object sLocalyticsProviderIntrinsicLock[] = new Object[0];
    private static final Map sLocalyticsProviderMap = new HashMap();
    private static final Set sValidTables = Collections.unmodifiableSet(getValidTables());
    private final SQLiteDatabase mDb;

    protected LocalyticsProvider(Context context, String s)
    {
        mDb = (new DatabaseHelper(context, String.format("com.localytics.android.%s.sqlite", new Object[] {
            DatapointHelper.getSha256_buggy(s)
        }), 18)).getWritableDatabase();
    }

    private static boolean deleteDirectory(File file)
    {
        if (file.exists() && file.isDirectory())
        {
            String as[] = file.list();
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                if (!deleteDirectory(new File(file, as[i])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    static void deleteOldFiles(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            deleteDirectory(new File(context.getFilesDir(), "localytics"));
            return;
        }
    }

    private static HashMap getCountProjectionMap()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("_count", "COUNT(*)");
        return hashmap;
    }

    public static LocalyticsProvider getInstance(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        }
        if (context.getClass().getName().equals("android.test.RenamingDelegatingContext"))
        {
            return new LocalyticsProvider(context, s);
        }
        Object aobj[] = sLocalyticsProviderIntrinsicLock;
        aobj;
        JVM INSTR monitorenter ;
        LocalyticsProvider localyticsprovider1 = (LocalyticsProvider)sLocalyticsProviderMap.get(s);
        LocalyticsProvider localyticsprovider;
        localyticsprovider = localyticsprovider1;
        if (localyticsprovider1 != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        localyticsprovider = new LocalyticsProvider(context, s);
        sLocalyticsProviderMap.put(s, localyticsprovider);
        aobj;
        JVM INSTR monitorexit ;
        return localyticsprovider;
        context;
        aobj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static Set getValidTables()
    {
        HashSet hashset = new HashSet();
        hashset.add("api_keys");
        hashset.add("attributes");
        hashset.add("events");
        hashset.add("event_history");
        hashset.add("sessions");
        hashset.add("upload_blobs");
        hashset.add("upload_blob_events");
        hashset.add("info");
        hashset.add("identifiers");
        hashset.add("amp_rules");
        hashset.add("amp_ruleevent");
        hashset.add("amp_conditions");
        hashset.add("amp_condition_values");
        hashset.add("amp_displayed");
        hashset.add("custom_dimensions");
        hashset.add("profile");
        return hashset;
    }

    private static boolean isValidTable(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return sValidTables.contains(s);
        }
    }

    void close()
    {
        Object aobj[] = sLocalyticsProviderIntrinsicLock;
        aobj;
        JVM INSTR monitorenter ;
        Object obj1 = null;
        Iterator iterator = sLocalyticsProviderMap.entrySet().iterator();
_L2:
        Object obj = obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (java.util.Map.Entry)iterator.next();
        if (this != ((java.util.Map.Entry) (obj)).getValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (String)((java.util.Map.Entry) (obj)).getKey();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        sLocalyticsProviderMap.remove(obj);
        aobj;
        JVM INSTR monitorexit ;
        mDb.close();
        return;
        Exception exception;
        exception;
        aobj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    Map getUserIdAndType()
    {
        String s;
        Object obj1;
        boolean flag;
        s = "";
        flag = false;
        obj1 = null;
        Object obj2 = query("identifiers", null, "key = \"customer_id\"", null, null);
        obj1 = obj2;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj1 = obj2;
        s = ((Cursor) (obj2)).getString(((Cursor) (obj2)).getColumnIndexOrThrow("value"));
        flag = true;
        obj1 = obj2;
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
            obj1 = null;
        }
        obj2 = s;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        Cursor cursor = query("api_keys", new String[] {
            "uuid"
        }, null, null, null);
        obj1 = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_130;
        }
        obj1 = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("uuid"));
        obj2 = s;
        if (cursor != null)
        {
            cursor.close();
            obj2 = s;
        }
        obj1 = new HashMap();
        ((HashMap) (obj1)).put("id", obj2);
        Object obj;
        if (flag)
        {
            obj = "known";
        } else
        {
            obj = "anonymous";
        }
        ((HashMap) (obj1)).put("type", obj);
        return ((Map) (obj1));
        obj;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
        obj;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw obj;
    }

    public long insert(String s, ContentValues contentvalues)
    {
        if (!isValidTable(s))
        {
            throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[] {
                s
            }));
        }
        if (contentvalues == null)
        {
            throw new IllegalArgumentException("values cannot be null");
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Insert table: %s, values: %s", new Object[] {
                s, contentvalues.toString()
            }));
        }
        long l = mDb.insertOrThrow(s, null, contentvalues);
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Inserted row with new id %d", new Object[] {
                Long.valueOf(l)
            }));
        }
        return l;
    }

    public Cursor query(String s, String as[], String s1, String as1[], String s2)
    {
        if (!isValidTable(s))
        {
            throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[] {
                s
            }));
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Query table: %s, projection: %s, selection: %s, selectionArgs: %s", new Object[] {
                s, Arrays.toString(as), s1, Arrays.toString(as1)
            }));
        }
        SQLiteQueryBuilder sqlitequerybuilder = new SQLiteQueryBuilder();
        sqlitequerybuilder.setTables(s);
        if (as != null && 1 == as.length && "_count".equals(as[0]))
        {
            sqlitequerybuilder.setProjectionMap(sCountProjectionMap);
        }
        s = sqlitequerybuilder.query(mDb, as, s1, as1, null, null, s2);
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", (new StringBuilder()).append("Query result is: ").append(DatabaseUtils.dumpCursorToString(s)).toString());
        }
        return s;
    }

    public int remove(String s, String s1, String as[])
    {
        if (!isValidTable(s))
        {
            throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[] {
                s
            }));
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Delete table: %s, selection: %s, selectionArgs: %s", new Object[] {
                s, s1, Arrays.toString(as)
            }));
        }
        int i;
        if (s1 == null)
        {
            i = mDb.delete(s, "1", null);
        } else
        {
            i = mDb.delete(s, s1, as);
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Deleted %d rows", new Object[] {
                Integer.valueOf(i)
            }));
        }
        return i;
    }

    public Object runBatchTransaction(Callable callable)
    {
        if (callable == null)
        {
            throw new IllegalArgumentException("callable cannot be null");
        }
        mDb.beginTransaction();
        callable = ((Callable) (callable.call()));
        mDb.setTransactionSuccessful();
        mDb.endTransaction();
        return callable;
        callable;
        throw new RuntimeException("Database batch transaction failed");
        callable;
        mDb.endTransaction();
        throw callable;
    }

    public void runBatchTransaction(Runnable runnable)
    {
        if (runnable == null)
        {
            throw new IllegalArgumentException("runnable cannot be null");
        }
        mDb.beginTransaction();
        runnable.run();
        mDb.setTransactionSuccessful();
        mDb.endTransaction();
        return;
        runnable;
        mDb.endTransaction();
        throw runnable;
    }

    public int update(String s, ContentValues contentvalues, String s1, String as[])
    {
        if (!isValidTable(s))
        {
            throw new IllegalArgumentException(String.format("tableName %s is invalid", new Object[] {
                s
            }));
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Update table: %s, values: %s, selection: %s, selectionArgs: %s", new Object[] {
                s, contentvalues.toString(), s1, Arrays.toString(as)
            }));
        }
        return mDb.update(s, contentvalues, s1, as);
    }

}
