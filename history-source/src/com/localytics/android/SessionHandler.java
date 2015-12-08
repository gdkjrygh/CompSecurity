// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.CursorJoiner;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            UploadHandler, Constants, LocalyticsProvider, DatapointHelper

class SessionHandler extends Handler
{

    private static final String CUSTOM_DIMENSION_KEYS[];
    private static final String EVENTS_SORT_ORDER = String.format("CAST(%s as TEXT)", new Object[] {
        "_id"
    });
    private static final String JOINER_ARG_UPLOAD_EVENTS_COLUMNS[] = {
        "_id"
    };
    public static final int MESSAGE_AMP_TRIGGER = 13;
    public static final int MESSAGE_CLOSE = 2;
    public static final int MESSAGE_DELETE_AMP_RESOURCES = 19;
    public static final int MESSAGE_DISABLE_PUSH = 14;
    public static final int MESSAGE_HANDLE_PUSH_RECEIVED = 21;
    public static final int MESSAGE_HANDLE_PUSH_REGISTRATION = 20;
    public static final int MESSAGE_INIT = 0;
    public static final int MESSAGE_OPEN = 1;
    public static final int MESSAGE_OPT_OUT = 6;
    public static final int MESSAGE_REGISTER_PUSH = 9;
    public static final int MESSAGE_SET_CUSTOM_DIMENSION = 12;
    public static final int MESSAGE_SET_IDENTIFIER = 8;
    public static final int MESSAGE_SET_LOCATION = 11;
    public static final int MESSAGE_SET_PROFILE_ATTRIBUTE = 16;
    public static final int MESSAGE_SET_PUSH_REGID = 10;
    public static final int MESSAGE_SHOW_AMP_TEST = 15;
    public static final int MESSAGE_TAG_EVENT = 3;
    public static final int MESSAGE_TAG_SCREEN = 7;
    public static final int MESSAGE_UPLOAD = 4;
    public static final int MESSAGE_UPLOAD_CALLBACK = 5;
    public static final int MESSAGE_UPLOAD_PROFILE = 17;
    public static final int MESSAGE_UPLOAD_PROFILE_CALLBACK = 18;
    private static final String PROJECTION_FLOW_BLOBS[] = {
        "events_key_ref"
    };
    private static final String PROJECTION_FLOW_EVENTS[] = {
        "_id"
    };
    private static final String PROJECTION_GET_INSTALLATION_ID[] = {
        "uuid"
    };
    private static final String PROJECTION_GET_NUMBER_OF_SESSIONS[] = {
        "_id"
    };
    private static final String PROJECTION_GET_OPEN_SESSION_ID_EVENT_COUNT[] = {
        "_count"
    };
    private static final String PROJECTION_GET_OPEN_SESSION_ID_SESSION_ID[] = {
        "_id"
    };
    private static final String PROJECTION_INIT_API_KEY[] = {
        "_id", "opt_out", "created_time", "uuid"
    };
    private static final String PROJECTION_IS_OPTED_OUT[] = {
        "opt_out"
    };
    private static final String PROJECTION_OPEN_BLOB_EVENTS[] = {
        "events_key_ref"
    };
    private static final String PROJECTION_OPEN_CLOSED_SESSION[] = {
        "session_key_ref"
    };
    private static final String PROJECTION_OPEN_DELETE_EMPTIES_EVENT_ID[] = {
        "_id"
    };
    private static final String PROJECTION_OPEN_DELETE_EMPTIES_PROCESSED_IN_BLOB[] = {
        "processed_in_blob"
    };
    private static final String PROJECTION_OPEN_EVENT_ID[] = {
        "_id"
    };
    private static final String PROJECTION_OPEN_SESSIONS[] = {
        "_id", "session_start_wall_time"
    };
    private static final String PROJECTION_SET_CUSTOM_DIMENSION[] = {
        "custom_dimension_value"
    };
    private static final String PROJECTION_SET_IDENTIFIER[] = {
        "key", "value"
    };
    private static final String PROJECTION_TAG_EVENT[] = {
        "session_start_wall_time"
    };
    private static final String PROJECTION_TAG_SCREEN[] = {
        "name"
    };
    private static final String PROJECTION_UPLOAD_BLOBS[] = {
        "events_key_ref"
    };
    private static final String PROJECTION_UPLOAD_EVENTS[] = {
        "_id", "event_name", "wall_time"
    };
    private static final String SELECTION_ARGS_FLOW_EVENTS[];
    private static final String SELECTION_FLOW_EVENTS = String.format("%s = ?", new Object[] {
        "event_name"
    });
    private static final String SELECTION_GET_INSTALLATION_ID = String.format("%s = ?", new Object[] {
        "api_key"
    });
    private static final String SELECTION_GET_OPEN_SESSION_ID_EVENT_COUNT = String.format("%s = ? AND %s = ?", new Object[] {
        "session_key_ref", "event_name"
    });
    private static final String SELECTION_INIT_API_KEY = String.format("%s = ?", new Object[] {
        "api_key"
    });
    private static final String SELECTION_IS_OPTED_OUT = String.format("%s = ?", new Object[] {
        "api_key"
    });
    private static final String SELECTION_OPEN = String.format("%s = ? AND %s >= ?", new Object[] {
        "event_name", "wall_time"
    });
    private static final String SELECTION_OPEN_CLOSED_SESSION = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String SELECTION_OPEN_CLOSED_SESSION_ATTRIBUTES = String.format("%s = ?", new Object[] {
        "events_key_ref"
    });
    private static final String SELECTION_OPEN_DELETE_EMPTIES_EVENTS_SESSION_KEY_REF = String.format("%s = ?", new Object[] {
        "session_key_ref"
    });
    private static final String SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF = String.format("%s = ?", new Object[] {
        "session_key_ref"
    });
    private static final String SELECTION_OPEN_DELETE_EMPTIES_SESSIONS_ID = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String SELECTION_OPEN_DELETE_EMPTIES_UPLOAD_BLOBS_ID = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String SELECTION_OPEN_NEW_SESSION = String.format("%s = ?", new Object[] {
        "api_key"
    });
    private static final String SELECTION_OPT_IN_OUT = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String SELECTION_SET_CUSTOM_DIMENSION = String.format("%s = ?", new Object[] {
        "custom_dimension_key"
    });
    private static final String SELECTION_SET_IDENTIFIER = String.format("%s = ?", new Object[] {
        "key"
    });
    private static final String SELECTION_TAG_EVENT = String.format("%s = ?", new Object[] {
        "_id"
    });
    private static final String SELECTION_TAG_SCREEN = String.format("%s = ? AND %s = ?", new Object[] {
        "type", "session_key_ref"
    });
    private static final String SELECTION_UPLOAD_NULL_BLOBS = String.format("%s IS NULL", new Object[] {
        "processed_in_blob"
    });
    private static final String SORT_ORDER_TAG_SCREEN = String.format("%s DESC", new Object[] {
        "_id"
    });
    private static final String UPLOAD_BLOBS_EVENTS_SORT_ORDER = String.format("CAST(%s AS TEXT)", new Object[] {
        "events_key_ref"
    });
    protected static final Map sIsUploadingMap = new HashMap();
    protected static final Map sIsUploadingProfileMap = new HashMap();
    private static Location sLastLocation = null;
    protected static final HandlerThread sProfileUploadHandlerThread = getHandlerThread((new StringBuilder()).append(com/localytics/android/UploadHandler.getSimpleName()).append("_profiles").toString());
    protected static final HandlerThread sUploadHandlerThread = getHandlerThread(com/localytics/android/UploadHandler.getSimpleName());
    protected final String mApiKey;
    private long mApiKeyId;
    protected final Context mContext;
    private UploadHandler mProfileUploadHandler;
    protected LocalyticsProvider mProvider;
    private UploadHandler mUploadHandler;

    public SessionHandler(Context context, String s, Looper looper)
    {
        super(looper);
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("key cannot be null or empty");
        } else
        {
            mContext = context;
            mApiKey = s;
            return;
        }
    }

    private void conditionallyAddFlowEvent()
    {
        Cursor cursor;
        Cursor cursor1;
        Cursor cursor3;
        boolean flag;
        flag = false;
        cursor1 = null;
        cursor3 = null;
        cursor = cursor3;
        Cursor cursor2 = mProvider.query("events", PROJECTION_FLOW_EVENTS, SELECTION_FLOW_EVENTS, SELECTION_ARGS_FLOW_EVENTS, EVENTS_SORT_ORDER);
        cursor = cursor3;
        cursor1 = cursor2;
        cursor3 = mProvider.query("upload_blob_events", PROJECTION_FLOW_BLOBS, null, null, UPLOAD_BLOBS_EVENTS_SORT_ORDER);
        cursor = cursor3;
        cursor1 = cursor2;
        Iterator iterator = (new CursorJoiner(cursor2, PROJECTION_FLOW_EVENTS, cursor3, PROJECTION_FLOW_BLOBS)).iterator();
_L2:
        cursor = cursor3;
        cursor1 = cursor2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_165;
        }
        cursor = cursor3;
        cursor1 = cursor2;
        android.database.CursorJoiner.Result result = (android.database.CursorJoiner.Result)iterator.next();
        cursor = cursor3;
        cursor1 = cursor2;
        static class _cls17
        {

            static final int $SwitchMap$android$database$CursorJoiner$Result[];

            static 
            {
                $SwitchMap$android$database$CursorJoiner$Result = new int[android.database.CursorJoiner.Result.values().length];
                try
                {
                    $SwitchMap$android$database$CursorJoiner$Result[android.database.CursorJoiner.Result.LEFT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$database$CursorJoiner$Result[android.database.CursorJoiner.Result.BOTH.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$database$CursorJoiner$Result[android.database.CursorJoiner.Result.RIGHT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        int i = _cls17..SwitchMap.android.database.CursorJoiner.Result[result.ordinal()];
        switch (i)
        {
        case 1: // '\001'
            flag = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
        if (cursor2 != null)
        {
            cursor2.close();
        }
        if (cursor3 != null)
        {
            cursor3.close();
        }
        if (!flag)
        {
            tagEvent(Constants.FLOW_EVENT, null);
        }
        return;
        Exception exception;
        exception;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String getFBAttribution(LocalyticsProvider localyticsprovider)
    {
        LocalyticsProvider localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("info", null, null, null, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        localyticsprovider1 = localyticsprovider;
        String s = localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("fb_attribution"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return s;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return null;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    private static HandlerThread getHandlerThread(String s)
    {
        s = new HandlerThread(s, 10);
        s.start();
        return s;
    }

    static String getInstallationId(LocalyticsProvider localyticsprovider, String s)
    {
        LocalyticsProvider localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("api_keys", PROJECTION_GET_INSTALLATION_ID, SELECTION_GET_INSTALLATION_ID, new String[] {
            s
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        localyticsprovider1 = localyticsprovider;
        s = localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("uuid"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return s;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Installation ID couldn't be found");
        }
        return null;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static long getNumberOfSessions(LocalyticsProvider localyticsprovider)
    {
        LocalyticsProvider localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("sessions", PROJECTION_GET_NUMBER_OF_SESSIONS, null, null, null);
        localyticsprovider1 = localyticsprovider;
        int i = localyticsprovider.getCount();
        long l = i;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static Long getOpenSessionId(LocalyticsProvider localyticsprovider)
    {
        Object obj = null;
        Cursor cursor = localyticsprovider.query("sessions", PROJECTION_GET_OPEN_SESSION_ID_SESSION_ID, null, null, "_id");
        obj = cursor;
        if (!cursor.moveToLast())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        obj = cursor;
        Long long1 = Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        if (cursor != null)
        {
            cursor.close();
        }
        obj = null;
        localyticsprovider = localyticsprovider.query("events", PROJECTION_GET_OPEN_SESSION_ID_EVENT_COUNT, SELECTION_GET_OPEN_SESSION_ID_EVENT_COUNT, new String[] {
            long1.toString(), Constants.CLOSE_EVENT
        }, null);
        obj = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_156;
        }
        obj = localyticsprovider;
        int i = localyticsprovider.getInt(0);
        if (i == 0)
        {
            if (localyticsprovider != null)
            {
                localyticsprovider.close();
            }
            return long1;
        }
        break MISSING_BLOCK_LABEL_156;
        if (cursor != null)
        {
            cursor.close();
        }
        return null;
        localyticsprovider;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localyticsprovider;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return null;
        localyticsprovider;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localyticsprovider;
    }

    static boolean isOptedOut(LocalyticsProvider localyticsprovider, String s)
    {
        LocalyticsProvider localyticsprovider1;
        if (localyticsprovider == null)
        {
            throw new IllegalArgumentException("provider cannot be null");
        }
        if (s == null)
        {
            throw new IllegalArgumentException("apiKey cannot be null");
        }
        localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("api_keys", PROJECTION_IS_OPTED_OUT, SELECTION_IS_OPTED_OUT, new String[] {
            s
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        localyticsprovider1 = localyticsprovider;
        int i = localyticsprovider.getInt(localyticsprovider.getColumnIndexOrThrow("opt_out"));
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return flag;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return false;
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    private boolean isPushDisabled()
    {
        Cursor cursor;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        cursor = null;
        Cursor cursor1 = mProvider.query("info", new String[] {
            "push_disabled"
        }, null, null, null);
_L2:
        cursor = cursor1;
        flag1 = flag;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        flag1 = flag;
        int i = cursor1.getInt(cursor1.getColumnIndexOrThrow("push_disabled"));
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return flag;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        return flag1;
    }

    private void openClosedSession(long l)
    {
        Cursor cursor;
        String as[];
        as = new String[1];
        as[0] = Long.toString(l);
        cursor = null;
        Cursor cursor1 = mProvider.query("events", PROJECTION_OPEN_CLOSED_SESSION, SELECTION_OPEN_CLOSED_SESSION, as, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        mProvider.remove("attributes", SELECTION_OPEN_CLOSED_SESSION_ATTRIBUTES, as);
        cursor = cursor1;
        mProvider.remove("events", SELECTION_OPEN_CLOSED_SESSION, as);
_L4:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return;
_L2:
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        cursor = cursor1;
        Log.e("Localytics", "Event no longer exists");
        cursor = cursor1;
        openNewSession(null);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    private void openNewSession(Map map)
    {
        Object obj;
        TelephonyManager telephonymanager;
        long l;
        long l2;
        telephonymanager = (TelephonyManager)mContext.getSystemService("phone");
        obj = null;
        l2 = System.currentTimeMillis();
        l = 0L;
        Object obj1 = mProvider.query("info", null, null, null, null);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = obj1;
        l = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("last_session_open_time"));
        long l1 = l;
        if (l == 0L)
        {
            l1 = l2;
        }
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("api_key_ref", Long.valueOf(mApiKeyId));
        contentvalues.put("session_start_wall_time", Long.valueOf(l2));
        contentvalues.put("uuid", UUID.randomUUID().toString());
        contentvalues.put("app_version", DatapointHelper.getAppVersion(mContext));
        contentvalues.put("android_sdk", Integer.valueOf(Constants.CURRENT_API_LEVEL));
        contentvalues.put("android_version", android.os.Build.VERSION.RELEASE);
        obj1 = DatapointHelper.getAndroidIdHashOrNull(mContext);
        obj = obj1;
        if (obj1 == null)
        {
            obj = "";
        }
        contentvalues.put("device_android_id_hash", ((String) (obj)));
        contentvalues.put("device_android_id", DatapointHelper.getAndroidIdOrNull(mContext));
        contentvalues.put("device_advertising_id", DatapointHelper.getAdvertisingIdOrNull(mContext));
        contentvalues.put("device_country", telephonymanager.getSimCountryIso());
        contentvalues.put("device_manufacturer", DatapointHelper.getManufacturer());
        contentvalues.put("device_model", Build.MODEL);
        contentvalues.put("device_serial_number_hash", DatapointHelper.getSerialNumberHashOrNull());
        contentvalues.put("device_telephony_id", DatapointHelper.getTelephonyDeviceIdOrNull(mContext));
        contentvalues.putNull("device_telephony_id_hash");
        contentvalues.putNull("device_wifi_mac_hash");
        contentvalues.put("locale_country", Locale.getDefault().getCountry());
        contentvalues.put("locale_language", Locale.getDefault().getLanguage());
        contentvalues.put("localytics_library_version", "androida_2.72");
        contentvalues.put("iu", getInstallationId(mProvider, mApiKey));
        contentvalues.putNull("latitude");
        contentvalues.putNull("longitude");
        contentvalues.put("network_carrier", telephonymanager.getNetworkOperatorName());
        contentvalues.put("network_country", telephonymanager.getNetworkCountryIso());
        contentvalues.put("network_type", DatapointHelper.getNetworkType(mContext, telephonymanager));
        contentvalues.put("elapsed", Long.valueOf(l2 - l1));
        if (mProvider.insert("sessions", contentvalues) == -1L)
        {
            throw new AssertionError("session insert failed");
        } else
        {
            contentvalues.clear();
            contentvalues.put("last_session_open_time", Long.valueOf(l2));
            mProvider.update("info", contentvalues, null, null);
            setFirstAdvertisingId(DatapointHelper.getAdvertisingIdOrNull(mContext));
            tagEvent(Constants.OPEN_EVENT, map);
            LocalyticsProvider.deleteOldFiles(mContext);
            return;
        }
        map;
        if (0L != 0L);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw map;
    }

    static void preUploadBuildBlobs(LocalyticsProvider localyticsprovider)
    {
        Cursor cursor;
        Cursor cursor1;
        Cursor cursor3;
        HashSet hashset;
        hashset = new HashSet();
        cursor1 = null;
        cursor3 = null;
        cursor = cursor3;
        Cursor cursor2 = localyticsprovider.query("events", PROJECTION_UPLOAD_EVENTS, null, null, EVENTS_SORT_ORDER);
        cursor = cursor3;
        cursor1 = cursor2;
        cursor3 = localyticsprovider.query("upload_blob_events", PROJECTION_UPLOAD_BLOBS, null, null, UPLOAD_BLOBS_EVENTS_SORT_ORDER);
        cursor = cursor3;
        cursor1 = cursor2;
        int i = cursor2.getColumnIndexOrThrow("_id");
        cursor = cursor3;
        cursor1 = cursor2;
        Iterator iterator1 = (new CursorJoiner(cursor2, JOINER_ARG_UPLOAD_EVENTS_COLUMNS, cursor3, PROJECTION_UPLOAD_BLOBS)).iterator();
_L3:
        cursor = cursor3;
        cursor1 = cursor2;
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        cursor = cursor3;
        cursor1 = cursor2;
        android.database.CursorJoiner.Result result = (android.database.CursorJoiner.Result)iterator1.next();
        cursor = cursor3;
        cursor1 = cursor2;
        _cls17..SwitchMap.android.database.CursorJoiner.Result[result.ordinal()];
        JVM INSTR tableswitch 1 2: default 426
    //                   1 164
    //                   2 96;
           goto _L3 _L4 _L3
_L4:
        cursor = cursor3;
        cursor1 = cursor2;
        if (!Constants.CLOSE_EVENT.equals(cursor2.getString(cursor2.getColumnIndexOrThrow("event_name")))) goto _L6; else goto _L5
_L5:
        cursor = cursor3;
        cursor1 = cursor2;
        if (System.currentTimeMillis() - cursor2.getLong(cursor2.getColumnIndexOrThrow("wall_time")) < Constants.SESSION_EXPIRATION) goto _L3; else goto _L6
_L6:
        cursor = cursor3;
        cursor1 = cursor2;
        hashset.add(Long.valueOf(cursor2.getLong(i)));
          goto _L3
        localyticsprovider;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (cursor != null)
        {
            cursor.close();
        }
        throw localyticsprovider;
_L2:
        if (cursor2 != null)
        {
            cursor2.close();
        }
        if (cursor3 != null)
        {
            cursor3.close();
        }
        if (hashset.size() > 0)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("uuid", UUID.randomUUID().toString());
            Long long1 = Long.valueOf(localyticsprovider.insert("upload_blobs", contentvalues));
            contentvalues.clear();
            for (Iterator iterator = hashset.iterator(); iterator.hasNext(); contentvalues.clear())
            {
                Long long2 = (Long)iterator.next();
                contentvalues.put("upload_blobs_key_ref", long1);
                contentvalues.put("events_key_ref", long2);
                localyticsprovider.insert("upload_blob_events", contentvalues);
            }

            contentvalues.put("processed_in_blob", long1);
            localyticsprovider.update("event_history", contentvalues, SELECTION_UPLOAD_NULL_BLOBS, null);
            contentvalues.clear();
        }
        return;
    }

    private void setFirstAdvertisingId(String s)
    {
        Cursor cursor;
        String s1;
        s1 = null;
        cursor = null;
        Cursor cursor1 = mProvider.query("info", null, null, null, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        cursor = cursor1;
        s1 = cursor1.getString(cursor1.getColumnIndexOrThrow("first_advertising_id"));
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (!TextUtils.isEmpty(s1))
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "First advertising id has already been set before.");
            }
            return;
        } else
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("first_advertising_id", s);
            mProvider.update("info", contentvalues, null, null);
            return;
        }
        s;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
    }

    void close(Map map)
    {
        if (getOpenSessionId(mProvider) == null)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Session was not open, so close is not possible.");
            }
            return;
        } else
        {
            tagEvent(Constants.CLOSE_EVENT, map);
            return;
        }
    }

    protected UploadHandler createUploadHandler(Context context, Handler handler, String s, String s1, Looper looper)
    {
        return new UploadHandler(context, this, s, s1, looper);
    }

    String getCustomDimension(int i)
    {
        String s;
        Object obj;
        s = null;
        obj = s;
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (i <= 9) goto _L4; else goto _L3
_L3:
        obj = s;
_L2:
        return ((String) (obj));
_L4:
        Object obj1;
        s = null;
        obj1 = CUSTOM_DIMENSION_KEYS[i];
        obj = null;
        obj1 = mProvider.query("custom_dimensions", PROJECTION_SET_CUSTOM_DIMENSION, SELECTION_SET_CUSTOM_DIMENSION, new String[] {
            obj1
        }, null);
        obj = obj1;
        if (!((Cursor) (obj1)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = obj1;
        s = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("custom_dimension_value"));
        obj = s;
        if (obj1 == null) goto _L2; else goto _L5
_L5:
        ((Cursor) (obj1)).close();
        return s;
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
    }

    UploadHandler getProfileUploadHandler()
    {
        return mProfileUploadHandler;
    }

    UploadHandler getUploadHandler()
    {
        return mUploadHandler;
    }

    public void handleMessage(final Message msg)
    {
        super.handleMessage(msg);
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Handler received %s", new Object[] {
                msg
            }));
        }
        msg.what;
        JVM INSTR tableswitch 0 21: default 982
    //                   0 170
    //                   1 242
    //                   2 275
    //                   3 308
    //                   4 688
    //                   5 729
    //                   6 198
    //                   7 375
    //                   8 416
    //                   9 475
    //                   10 556
    //                   11 597
    //                   12 624
    //                   13 140
    //                   14 516
    //                   15 140
    //                   16 762
    //                   17 826
    //                   18 867
    //                   19 140
    //                   20 900
    //                   21 941;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L1 _L15 _L1 _L16 _L17 _L18 _L1 _L19 _L20
_L1:
        throw new RuntimeException("Fell through switch statement");
_L2:
        try
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.d("Localytics", "Handler received MESSAGE_INIT");
            }
            init((String)msg.obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (final Message msg)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e("Localytics", "Localytics library threw an uncaught exception", msg);
            }
            return;
        }
_L8:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_OPT_OUT");
        }
        final boolean isOptingOut;
        if (msg.arg1 == 0)
        {
            isOptingOut = false;
        } else
        {
            isOptingOut = true;
        }
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final boolean val$isOptingOut;

            public void run()
            {
                optOut(isOptingOut);
            }

            
            {
                this$0 = SessionHandler.this;
                isOptingOut = flag;
                super();
            }
        });
        return;
_L3:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_OPEN");
        }
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Message val$msg;

            public void run()
            {
                open(false, (Map)msg.obj);
            }

            
            {
                this$0 = SessionHandler.this;
                msg = message;
                super();
            }
        });
        return;
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_CLOSE");
        }
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Message val$msg;

            public void run()
            {
                close((Map)msg.obj);
            }

            
            {
                this$0 = SessionHandler.this;
                msg = message;
                super();
            }
        });
        return;
_L5:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_TAG_EVENT");
        }
        Object aobj1[] = (Object[])(Object[])msg.obj;
        msg = (String)aobj1[0];
        final Map attributes = (Map)aobj1[1];
        final Long clv = (Long)aobj1[2];
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Map val$attributes;
            final Long val$clv;
            final String val$event;

            public void run()
            {
                if (SessionHandler.getOpenSessionId(mProvider) != null)
                {
                    tagEvent(event, attributes, clv);
                    return;
                }
                if (attributes != null) goto _L2; else goto _L1
_L1:
                Object obj = null;
_L4:
                open(false, ((Map) (obj)));
                tagEvent(event, attributes, clv);
                close(((Map) (obj)));
                return;
_L2:
                if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9) || attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10))
                {
                    TreeMap treemap = new TreeMap();
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8));
                    }
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9));
                    }
                    obj = treemap;
                    if (attributes.containsKey(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10))
                    {
                        treemap.put(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10, attributes.get(LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10));
                        obj = treemap;
                    }
                } else
                {
                    obj = null;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = SessionHandler.this;
                event = s;
                attributes = map;
                clv = long1;
                super();
            }
        });
        return;
_L9:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_TAG_SCREEN");
        }
        msg = (String)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final String val$screen;

            public void run()
            {
                tagScreen(screen);
            }

            
            {
                this$0 = SessionHandler.this;
                screen = s;
                super();
            }
        });
        return;
_L10:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_SET_IDENTIFIER");
        }
        Object aobj[] = (Object[])(Object[])msg.obj;
        msg = (String)aobj[0];
        final String value = (String)aobj[1];
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final String val$key;
            final String val$value;

            public void run()
            {
                setIdentifier(key, value);
            }

            
            {
                this$0 = SessionHandler.this;
                key = s;
                value = s1;
                super();
            }
        });
        return;
_L11:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_REGISTER_PUSH");
        }
        msg = (String)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final String val$newSenderId;

            public void run()
            {
                if (!isPushDisabled()) goto _L2; else goto _L1
_L1:
                if (Constants.IS_LOGGABLE)
                {
                    Log.d("Localytics", "Push has been disabled");
                }
_L4:
                return;
_L2:
                String s;
                Object obj;
                String s1;
                String s2;
                obj = null;
                s2 = null;
                s = null;
                s1 = null;
                Cursor cursor = mProvider.query("info", null, null, null, null);
                obj = cursor;
                if (!cursor.moveToFirst())
                {
                    break MISSING_BLOCK_LABEL_126;
                }
                obj = cursor;
                s2 = cursor.getString(cursor.getColumnIndexOrThrow("sender_id"));
                obj = cursor;
                s1 = cursor.getString(cursor.getColumnIndexOrThrow("registration_version"));
                obj = cursor;
                s = cursor.getString(cursor.getColumnIndexOrThrow("registration_id"));
                if (cursor != null)
                {
                    cursor.close();
                }
                if (!newSenderId.equals(s2))
                {
                    s = null;
                    obj = new ContentValues();
                    ((ContentValues) (obj)).put("sender_id", newSenderId);
                    ((ContentValues) (obj)).put("registration_id", null);
                    mProvider.update("info", ((ContentValues) (obj)), null, null);
                }
                obj = DatapointHelper.getAppVersion(mContext);
                if (!TextUtils.isEmpty(s) && ((String) (obj)).equals(s1)) goto _L4; else goto _L3
_L3:
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.putExtra("app", PendingIntent.getBroadcast(mContext, 0, new Intent(), 0));
                intent.putExtra("sender", newSenderId);
                intent.setPackage("com.google.android.gms");
                mContext.startService(intent);
                return;
                Exception exception;
                exception;
                if (obj != null)
                {
                    ((Cursor) (obj)).close();
                }
                throw exception;
            }

            
            {
                this$0 = SessionHandler.this;
                newSenderId = s;
                super();
            }
        });
        return;
_L15:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_DISABLE_PUSH");
        }
        final int disabled = msg.arg1;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final int val$disabled;

            public void run()
            {
                setPushDisabled(disabled);
            }

            
            {
                this$0 = SessionHandler.this;
                disabled = i;
                super();
            }
        });
        return;
_L12:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_SET_PUSH_REGID");
        }
        msg = (String)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final String val$pushRegId;

            public void run()
            {
                setPushRegistrationId(pushRegId);
            }

            
            {
                this$0 = SessionHandler.this;
                pushRegId = s;
                super();
            }
        });
        return;
_L13:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_SET_LOCATION");
        }
        sLastLocation = (Location)msg.obj;
        return;
_L14:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_SET_CUSTOM_DIMENSION");
        }
        msg = ((Message) ((Object[])(Object[])msg.obj));
        final int dimension = ((Integer)msg[0]).intValue();
        msg = (String)msg[1];
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final int val$dimension;
            final String val$value;

            public void run()
            {
                setCustomDimension(dimension, value);
            }

            
            {
                this$0 = SessionHandler.this;
                dimension = i;
                value = s;
                super();
            }
        });
        return;
_L6:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "SessionHandler received MESSAGE_UPLOAD");
        }
        msg = (Runnable)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Runnable val$callback;

            public void run()
            {
                upload(callback);
            }

            
            {
                this$0 = SessionHandler.this;
                callback = runnable;
                super();
            }
        });
        return;
_L7:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_UPLOAD_CALLBACK");
        }
        sIsUploadingMap.put(mApiKey, Boolean.FALSE);
        return;
_L16:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_SET_PROFILE_ATTRIBUTE");
        }
        msg = ((Message) ((Object[])(Object[])msg.obj));
        final JSONObject attributeJSON = (JSONObject)msg[0];
        final int action = ((Integer)msg[1]).intValue();
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final int val$action;
            final JSONObject val$attributeJSON;

            public void run()
            {
                String s = (String)mProvider.getUserIdAndType().get("id");
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("attribute", attributeJSON.toString());
                contentvalues.put("action", Integer.valueOf(action));
                contentvalues.put("customer_id", s);
                mProvider.insert("profile", contentvalues);
            }

            
            {
                this$0 = SessionHandler.this;
                attributeJSON = jsonobject;
                action = i;
                super();
            }
        });
        return;
_L17:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "SessionHandler received MESSAGE_UPLOAD_PROFILE");
        }
        msg = (Runnable)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Runnable val$callback;

            public void run()
            {
                uploadProfile(callback);
            }

            
            {
                this$0 = SessionHandler.this;
                callback = runnable;
                super();
            }
        });
        return;
_L18:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_UPLOAD_PROFILE_CALLBACK");
        }
        sIsUploadingProfileMap.put(mApiKey, Boolean.FALSE);
        return;
_L19:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_HANDLE_PUSH_REGISTRATION");
        }
        msg = (Intent)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Intent val$intent;

            public void run()
            {
                String s = intent.getStringExtra("registration_id");
                if (!isPushDisabled()) goto _L2; else goto _L1
_L1:
                if (Constants.IS_LOGGABLE)
                {
                    Log.v("Localytics", "GCM registered but push disabled: removing id");
                }
                setPushRegistrationId(null);
_L4:
                return;
_L2:
                if (intent.getStringExtra("error") == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                if (Constants.IS_LOGGABLE)
                {
                    Log.v("Localytics", "GCM registration failed");
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                if (intent.getStringExtra("unregistered") != null)
                {
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.v("Localytics", "GCM unregistered: removing id");
                    }
                    setPushRegistrationId(null);
                    return;
                }
                if (s != null)
                {
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.v("Localytics", String.format("GCM registered, new id: %s", new Object[] {
                            s
                        }));
                    }
                    setPushRegistrationId(s);
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
            }

            
            {
                this$0 = SessionHandler.this;
                intent = intent1;
                super();
            }
        });
        return;
_L20:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Handler received MESSAGE_HANDLE_PUSH_RECEIVED");
        }
        msg = (Intent)msg.obj;
        mProvider.runBatchTransaction(new Runnable() {

            final SessionHandler this$0;
            final Intent val$intent;

            public void run()
            {
                if (!isPushDisabled()) goto _L2; else goto _L1
_L1:
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Got push notification while push is disabled.");
                }
_L4:
                return;
_L2:
                Object obj;
                obj = null;
                if (intent.getExtras() != null)
                {
                    obj = intent.getExtras().getString("ll");
                }
                if (obj == null)
                {
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", "Ignoring message that aren't from Localytics.");
                        return;
                    }
                    continue; /* Loop/switch isn't completed */
                }
                int i = (new JSONObject(((String) (obj)))).getInt("ca");
                Object obj1;
                Object obj3;
                String s;
                int j;
                s = intent.getExtras().getString("message");
                obj1 = "";
                j = DatapointHelper.getLocalyticsNotificationIcon(mContext);
                obj3 = null;
                obj = obj1;
                android.content.pm.ApplicationInfo applicationinfo = mContext.getPackageManager().getApplicationInfo(mContext.getPackageName(), 0);
                obj = obj1;
                obj1 = mContext.getPackageManager().getApplicationLabel(applicationinfo);
                obj = obj1;
                Object obj2;
                try
                {
                    obj2 = mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName());
                }
                catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
                {
                    namenotfoundexception = ((android.content.pm.PackageManager.NameNotFoundException) (obj));
                    obj2 = obj3;
                    if (Constants.IS_LOGGABLE)
                    {
                        Log.w("Localytics", "Failed to get application name, icon, or launch intent");
                        namenotfoundexception = ((android.content.pm.PackageManager.NameNotFoundException) (obj));
                        obj2 = obj3;
                    }
                }
                obj = new Notification(j, s, System.currentTimeMillis());
                if (obj2 != null)
                {
                    ((Intent) (obj2)).putExtras(intent);
                    obj2 = PendingIntent.getActivity(mContext, 0, ((Intent) (obj2)), 0x8000000);
                    ((Notification) (obj)).setLatestEventInfo(mContext, ((CharSequence) (obj1)), s, ((PendingIntent) (obj2)));
                }
                obj.flags = ((Notification) (obj)).flags | 0x10;
                ((NotificationManager)mContext.getSystemService("notification")).notify(i, ((Notification) (obj)));
                return;
                obj;
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Failed to get campaign id from payload, ignoring message");
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = SessionHandler.this;
                intent = intent1;
                super();
            }
        });
        return;
    }

    void init(String s)
    {
        Cursor cursor;
        mProvider = LocalyticsProvider.getInstance(mContext, mApiKey);
        cursor = null;
        Cursor cursor1 = mProvider.query("api_keys", PROJECTION_INIT_API_KEY, SELECTION_INIT_API_KEY, new String[] {
            mApiKey
        }, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        cursor = cursor1;
        Log.v("Localytics", String.format("Loading details for API key %s", new Object[] {
            mApiKey
        }));
        cursor = cursor1;
        mApiKeyId = cursor1.getLong(cursor1.getColumnIndexOrThrow("_id"));
        cursor = cursor1;
        if (cursor1.getLong(cursor1.getColumnIndexOrThrow("created_time")) != 0L)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        cursor = cursor1;
        ContentValues contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("created_time", Long.valueOf(System.currentTimeMillis()));
        cursor = cursor1;
        mProvider.update("api_keys", contentvalues, SELECTION_INIT_API_KEY, new String[] {
            mApiKey
        });
_L8:
        cursor = cursor1;
        if (cursor1 != null)
        {
            cursor1.close();
            cursor = null;
        }
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_315;
        }
        cursor1 = mProvider.query("info", new String[] {
            "play_attribution"
        }, null, null, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_305;
        }
        cursor = cursor1;
        if (!TextUtils.isEmpty(cursor1.getString(cursor1.getColumnIndexOrThrow("play_attribution"))))
        {
            break MISSING_BLOCK_LABEL_305;
        }
        cursor = cursor1;
        contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("play_attribution", s);
        cursor = cursor1;
        mProvider.update("info", contentvalues, null, null);
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (!sIsUploadingMap.containsKey(mApiKey))
        {
            sIsUploadingMap.put(mApiKey, Boolean.FALSE);
        }
        if (!sIsUploadingProfileMap.containsKey(mApiKey))
        {
            sIsUploadingProfileMap.put(mApiKey, Boolean.FALSE);
        }
        s = getInstallationId(mProvider, mApiKey);
        mUploadHandler = createUploadHandler(mContext, this, mApiKey, s, sUploadHandlerThread.getLooper());
        mProfileUploadHandler = createUploadHandler(mContext, this, mApiKey, s, sProfileUploadHandlerThread.getLooper());
        return;
_L2:
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        cursor = cursor1;
        Log.v("Localytics", String.format("Performing first-time initialization for new API key %s", new Object[] {
            mApiKey
        }));
        cursor = cursor1;
        contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("api_key", mApiKey);
        cursor = cursor1;
        contentvalues.put("uuid", UUID.randomUUID().toString());
        cursor = cursor1;
        contentvalues.put("opt_out", Boolean.FALSE);
        if (s != null) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        long l = System.currentTimeMillis();
_L6:
        cursor = cursor1;
        contentvalues.put("created_time", Long.valueOf(l));
        cursor = cursor1;
        mApiKeyId = mProvider.insert("api_keys", contentvalues);
        continue; /* Loop/switch isn't completed */
        s;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
_L4:
        l = 0L;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    void open(boolean flag, Map map)
    {
        if (getOpenSessionId(mProvider) == null) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Session was already open");
        }
_L4:
        return;
_L2:
        if (!isOptedOut(mProvider, mApiKey))
        {
            break; /* Loop/switch isn't completed */
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Data collection is opted out");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Cursor cursor;
        Object obj;
        Cursor cursor1;
        Object obj1;
        long l;
        l = -1L;
        obj1 = null;
        cursor1 = null;
        cursor = cursor1;
        obj = obj1;
        Object obj2 = mProvider;
        cursor = cursor1;
        obj = obj1;
        String as[] = PROJECTION_OPEN_EVENT_ID;
        cursor = cursor1;
        obj = obj1;
        Object obj3 = SELECTION_OPEN;
        cursor = cursor1;
        obj = obj1;
        String s = Constants.CLOSE_EVENT;
        cursor = cursor1;
        obj = obj1;
        String s1 = Long.toString(System.currentTimeMillis() - Constants.SESSION_EXPIRATION);
        cursor = cursor1;
        obj = obj1;
        String s2 = EVENTS_SORT_ORDER;
        cursor = cursor1;
        obj = obj1;
        obj1 = ((LocalyticsProvider) (obj2)).query("events", as, ((String) (obj3)), new String[] {
            s, s1
        }, s2);
        cursor = cursor1;
        obj = obj1;
        cursor1 = mProvider.query("upload_blob_events", PROJECTION_OPEN_BLOB_EVENTS, null, null, UPLOAD_BLOBS_EVENTS_SORT_ORDER);
        cursor = cursor1;
        obj = obj1;
        int i = ((Cursor) (obj1)).getColumnIndexOrThrow("_id");
        cursor = cursor1;
        obj = obj1;
        obj2 = (new CursorJoiner(((Cursor) (obj1)), PROJECTION_OPEN_EVENT_ID, cursor1, PROJECTION_OPEN_BLOB_EVENTS)).iterator();
_L12:
        cursor = cursor1;
        obj = obj1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        obj = obj1;
        android.database.CursorJoiner.Result result = (android.database.CursorJoiner.Result)((Iterator) (obj2)).next();
        cursor = cursor1;
        obj = obj1;
        _cls17..SwitchMap.android.database.CursorJoiner.Result[result.ordinal()];
        JVM INSTR tableswitch 1 2: default 1073
    //                   1 336
    //                   2 260;
           goto _L5 _L6 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L6:
        long l1 = l;
        if (-1L == l) goto _L8; else goto _L7
_L7:
        cursor = cursor1;
        obj = obj1;
        if (!Constants.IS_LOGGABLE) goto _L10; else goto _L9
_L9:
        cursor = cursor1;
        obj = obj1;
        Log.w("Localytics", "There were multiple close events within SESSION_EXPIRATION");
_L10:
        cursor = cursor1;
        obj = obj1;
        long l2 = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("_id"));
        l1 = l;
        if (l2 > l)
        {
            l1 = l2;
        }
_L8:
        l = l1;
        if (-1L != l1)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        obj = obj1;
        l = ((Cursor) (obj1)).getLong(i);
        if (true) goto _L12; else goto _L11
        map;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        if (cursor != null)
        {
            cursor.close();
        }
        throw map;
_L11:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (-1L != l)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "Opening old closed session and reconnecting");
            }
            openClosedSession(l);
            return;
        }
        obj = null;
        cursor1 = mProvider.query("sessions", PROJECTION_OPEN_SESSIONS, null, null, "_id");
        obj = cursor1;
        if (!cursor1.moveToLast())
        {
            break MISSING_BLOCK_LABEL_1004;
        }
        obj = cursor1;
        if (cursor1.getLong(cursor1.getColumnIndexOrThrow("session_start_wall_time")) < System.currentTimeMillis() - Constants.SESSION_EXPIRATION) goto _L14; else goto _L13
_L13:
        obj = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = cursor1;
        Log.v("Localytics", "Opening old unclosed session and reconnecting");
        if (cursor1 == null) goto _L4; else goto _L15
_L15:
        cursor1.close();
        return;
_L14:
        obj = null;
        cursor = ((Cursor) (obj));
        obj1 = Long.toString(cursor1.getLong(cursor1.getColumnIndexOrThrow("_id")));
        cursor = ((Cursor) (obj));
        result = new String[1];
        result[0] = ((String) (obj1));
        cursor = ((Cursor) (obj));
        obj1 = mProvider.query("events", PROJECTION_OPEN_DELETE_EMPTIES_EVENT_ID, SELECTION_OPEN_DELETE_EMPTIES_EVENTS_SESSION_KEY_REF, result, null);
        cursor = ((Cursor) (obj1));
        if (((Cursor) (obj1)).getCount() != 0) goto _L17; else goto _L16
_L16:
        cursor = ((Cursor) (obj1));
        obj3 = new LinkedList();
        obj = null;
        obj2 = mProvider.query("event_history", PROJECTION_OPEN_DELETE_EMPTIES_PROCESSED_IN_BLOB, SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF, result, null);
_L19:
        obj = obj2;
        if (!((Cursor) (obj2)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj2;
        ((List) (obj3)).add(Long.valueOf(((Cursor) (obj2)).getLong(((Cursor) (obj2)).getColumnIndexOrThrow("processed_in_blob"))));
        if (true) goto _L19; else goto _L18
        map;
        if (obj == null) goto _L21; else goto _L20
_L20:
        cursor = ((Cursor) (obj1));
        ((Cursor) (obj)).close();
_L21:
        cursor = ((Cursor) (obj1));
        throw map;
        map;
        if (cursor == null) goto _L23; else goto _L22
_L22:
        obj = cursor1;
        cursor.close();
_L23:
        obj = cursor1;
        throw map;
        map;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw map;
_L18:
        if (obj2 == null) goto _L25; else goto _L24
_L24:
        cursor = ((Cursor) (obj1));
        ((Cursor) (obj2)).close();
_L25:
        cursor = ((Cursor) (obj1));
        mProvider.remove("event_history", SELECTION_OPEN_DELETE_EMPTIES_EVENT_HISTORY_SESSION_KEY_REF, result);
        cursor = ((Cursor) (obj1));
        obj = ((List) (obj3)).iterator();
_L27:
        cursor = ((Cursor) (obj1));
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = ((Cursor) (obj1));
        l = ((Long)((Iterator) (obj)).next()).longValue();
        cursor = ((Cursor) (obj1));
        mProvider.remove("upload_blobs", SELECTION_OPEN_DELETE_EMPTIES_UPLOAD_BLOBS_ID, new String[] {
            Long.toString(l)
        });
        if (true) goto _L27; else goto _L26
_L26:
        cursor = ((Cursor) (obj1));
        mProvider.remove("sessions", SELECTION_OPEN_DELETE_EMPTIES_SESSIONS_ID, result);
_L17:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1004;
        }
        obj = cursor1;
        ((Cursor) (obj1)).close();
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (!flag && getNumberOfSessions(mProvider) >= 10L)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Maximum number of sessions are already on disk--not writing any new sessions until old sessions are cleared out.  Try calling upload() to store more sessions.");
                return;
            }
        } else
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.v("Localytics", "Opening new session");
            }
            openNewSession(map);
            return;
        }
        if (true) goto _L4; else goto _L28
_L28:
    }

    void optOut(boolean flag)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Requested opt-out state is %b", new Object[] {
                Boolean.valueOf(flag)
            }));
        }
        if (isOptedOut(mProvider, mApiKey) == flag)
        {
            return;
        }
        if (getOpenSessionId(mProvider) == null)
        {
            open(true, null);
            Object obj;
            if (flag)
            {
                obj = Constants.OPT_OUT_EVENT;
            } else
            {
                obj = Constants.OPT_IN_EVENT;
            }
            tagEvent(((String) (obj)), null);
            close(null);
        } else
        {
            String s;
            if (flag)
            {
                s = Constants.OPT_OUT_EVENT;
            } else
            {
                s = Constants.OPT_IN_EVENT;
            }
            tagEvent(s, null);
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("opt_out", Boolean.valueOf(flag));
        mProvider.update("api_keys", ((ContentValues) (obj)), SELECTION_OPT_IN_OUT, new String[] {
            Long.toString(mApiKeyId)
        });
    }

    void setCustomDimension(int i, final String value)
    {
        if (i < 0 || i > 9)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Only valid dimensions are 0 - 9");
            }
            return;
        } else
        {
            final String key = CUSTOM_DIMENSION_KEYS[i];
            mProvider.runBatchTransaction(new Runnable() {

                final SessionHandler this$0;
                final String val$key;
                final String val$value;

                public void run()
                {
                    Object obj = null;
                    Object obj1 = mProvider.query("custom_dimensions", SessionHandler.PROJECTION_SET_CUSTOM_DIMENSION, SessionHandler.SELECTION_SET_CUSTOM_DIMENSION, new String[] {
                        key
                    }, null);
                    obj = obj1;
                    if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L1
_L1:
                    obj = obj1;
                    if (value != null) goto _L4; else goto _L3
_L3:
                    obj = obj1;
                    mProvider.remove("custom_dimensions", String.format("%s = ?", new Object[] {
                        "custom_dimension_key"
                    }), new String[] {
                        key
                    });
_L5:
                    if (obj1 != null)
                    {
                        ((Cursor) (obj1)).close();
                    }
                    return;
_L4:
                    obj = obj1;
                    ContentValues contentvalues = new ContentValues();
                    obj = obj1;
                    contentvalues.put("custom_dimension_key", key);
                    obj = obj1;
                    contentvalues.put("custom_dimension_value", value);
                    obj = obj1;
                    mProvider.update("custom_dimensions", contentvalues, SessionHandler.SELECTION_SET_CUSTOM_DIMENSION, new String[] {
                        key
                    });
                      goto _L5
                    obj1;
                    if (obj != null)
                    {
                        ((Cursor) (obj)).close();
                    }
                    throw obj1;
_L2:
                    obj = obj1;
                    if (value == null) goto _L5; else goto _L6
_L6:
                    obj = obj1;
                    contentvalues = new ContentValues();
                    obj = obj1;
                    contentvalues.put("custom_dimension_key", key);
                    obj = obj1;
                    contentvalues.put("custom_dimension_value", value);
                    obj = obj1;
                    mProvider.insert("custom_dimensions", contentvalues);
                      goto _L5
                }

            
            {
                this$0 = SessionHandler.this;
                key = s;
                value = s1;
                super();
            }
            });
            return;
        }
    }

    void setIdentifier(String s, String s1)
    {
        Cursor cursor = null;
        Cursor cursor1 = mProvider.query("identifiers", PROJECTION_SET_IDENTIFIER, SELECTION_SET_IDENTIFIER, new String[] {
            s
        }, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        if (s1 != null) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        mProvider.remove("identifiers", String.format("%s = ?", new Object[] {
            "key"
        }), new String[] {
            cursor1.getString(cursor1.getColumnIndexOrThrow("key"))
        });
_L6:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return;
_L4:
        cursor = cursor1;
        if (s1.equals(cursor1.getString(cursor1.getColumnIndexOrThrow("value")))) goto _L6; else goto _L5
_L5:
        cursor = cursor1;
        ContentValues contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("key", s);
        cursor = cursor1;
        contentvalues.put("value", s1);
        cursor = cursor1;
        mProvider.update("identifiers", contentvalues, SELECTION_SET_IDENTIFIER, new String[] {
            s
        });
          goto _L6
        s;
        if (cursor != null)
        {
            cursor.close();
        }
        throw s;
_L2:
        if (s1 == null) goto _L6; else goto _L7
_L7:
        cursor = cursor1;
        contentvalues = new ContentValues();
        cursor = cursor1;
        contentvalues.put("key", s);
        cursor = cursor1;
        contentvalues.put("value", s1);
        cursor = cursor1;
        mProvider.insert("identifiers", contentvalues);
          goto _L6
    }

    void setPushDisabled(int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("push_disabled", Integer.valueOf(i));
        mProvider.update("info", contentvalues, null, null);
    }

    void setPushRegistrationId(String s)
    {
        ContentValues contentvalues = new ContentValues();
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        contentvalues.put("registration_id", s1);
        contentvalues.put("registration_version", DatapointHelper.getAppVersion(mContext));
        mProvider.update("info", contentvalues, null, null);
    }

    void tagEvent(String s, Map map)
    {
        tagEvent(s, map, null);
    }

    void tagEvent(String s, Map map, Long long1)
    {
        Long long2 = getOpenSessionId(mProvider);
        if (long2 != null) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Event not written because a session is not open");
        }
_L10:
        return;
_L2:
        Object obj;
        long l;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("session_key_ref", long2);
        contentvalues.put("uuid", UUID.randomUUID().toString());
        contentvalues.put("event_name", s);
        contentvalues.put("real_time", Long.valueOf(SystemClock.elapsedRealtime()));
        contentvalues.put("wall_time", Long.valueOf(System.currentTimeMillis()));
        if (long1 != null)
        {
            contentvalues.put("clv_increase", long1);
        } else
        {
            contentvalues.put("clv_increase", Integer.valueOf(0));
        }
        if (sLastLocation != null)
        {
            contentvalues.put("event_lat", Double.valueOf(sLastLocation.getLatitude()));
            contentvalues.put("event_lng", Double.valueOf(sLastLocation.getLongitude()));
        }
        if (!Constants.OPEN_EVENT.equals(s)) goto _L4; else goto _L3
_L3:
        long1 = null;
        obj = mProvider.query("sessions", PROJECTION_TAG_EVENT, SELECTION_TAG_EVENT, new String[] {
            long2.toString()
        }, null);
        long1 = ((Long) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L6; else goto _L5
_L5:
        long1 = ((Long) (obj));
        contentvalues.put("wall_time", Long.valueOf(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("session_start_wall_time"))));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
_L4:
        obj = mProvider.getUserIdAndType();
        long1 = (String)((Map) (obj)).get("id");
        obj = (String)((Map) (obj)).get("type");
        contentvalues.put("customer_id", long1);
        contentvalues.put("user_type", ((String) (obj)));
        long1 = UploadHandler.getIdentifiers(mProvider);
        if (long1 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        contentvalues.put("ids", long1.toString());
_L8:
        l = mProvider.insert("events", contentvalues);
        if (-1L == l)
        {
            throw new RuntimeException("Inserting event failed");
        }
        break; /* Loop/switch isn't completed */
_L6:
        long1 = ((Long) (obj));
        throw new AssertionError("During tag of open event, session didn't exist");
        s;
        if (long1 != null)
        {
            long1.close();
        }
        throw s;
        long1;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Caught exception", long1);
        }
        if (true) goto _L8; else goto _L7
_L7:
        for (int i = 0; i < 10;)
        {
            String s2 = CUSTOM_DIMENSION_KEYS[i];
            String s3 = getCustomDimension(i);
            Object obj1 = map;
            if (s3 != null)
            {
                long1 = map;
                if (map == null)
                {
                    long1 = new TreeMap();
                }
                obj1 = long1;
                if (long1.get(s2) == null)
                {
                    long1.put(s2, s3);
                    obj1 = long1;
                }
            }
            i++;
            map = ((Map) (obj1));
        }

        if (map != null)
        {
            long1 = new ContentValues();
            String s1 = String.format("%s:%s", new Object[] {
                mContext.getPackageName(), ""
            });
            int j = 0;
            map = map.entrySet().iterator();
            do
            {
                if (!map.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                int k = j;
                if (((String)entry.getKey()).startsWith(s1))
                {
                    k = j + 1;
                    j = k;
                    if (k > 50)
                    {
                        continue;
                    }
                }
                long1.put("events_key_ref", Long.valueOf(l));
                long1.put("attribute_key", (String)entry.getKey());
                long1.put("attribute_value", (String)entry.getValue());
                if (-1L == mProvider.insert("attributes", long1))
                {
                    throw new AssertionError("Inserting attribute failed");
                }
                long1.clear();
                j = k;
            } while (true);
        }
        if (!Constants.OPEN_EVENT.equals(s) && !Constants.CLOSE_EVENT.equals(s) && !Constants.OPT_IN_EVENT.equals(s) && !Constants.OPT_OUT_EVENT.equals(s) && !Constants.FLOW_EVENT.equals(s))
        {
            map = new ContentValues();
            map.put("name", s.substring(mContext.getPackageName().length() + 1, s.length()));
            map.put("type", Integer.valueOf(0));
            map.put("session_key_ref", long2);
            map.putNull("processed_in_blob");
            mProvider.insert("event_history", map);
            conditionallyAddFlowEvent();
            return;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    void tagScreen(String s)
    {
        Long long1 = getOpenSessionId(mProvider);
        if (long1 != null) goto _L2; else goto _L1
_L1:
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Tag not written because the session was not open");
        }
_L4:
        return;
_L2:
        Object obj;
        Cursor cursor;
        cursor = null;
        obj = cursor;
        LocalyticsProvider localyticsprovider = mProvider;
        obj = cursor;
        String as[] = PROJECTION_TAG_SCREEN;
        obj = cursor;
        String s1 = SELECTION_TAG_SCREEN;
        obj = cursor;
        String s2 = Integer.toString(1);
        obj = cursor;
        String s3 = long1.toString();
        obj = cursor;
        String s4 = SORT_ORDER_TAG_SCREEN;
        obj = cursor;
        cursor = localyticsprovider.query("event_history", as, s1, new String[] {
            s2, s3
        }, s4);
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = cursor;
        if (!s.equals(cursor.getString(cursor.getColumnIndexOrThrow("name"))))
        {
            break MISSING_BLOCK_LABEL_187;
        }
        obj = cursor;
        if (!Constants.IS_LOGGABLE)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = cursor;
        Log.v("Localytics", String.format("Suppressed duplicate screen %s", new Object[] {
            s
        }));
        if (cursor == null) goto _L4; else goto _L3
_L3:
        cursor.close();
        return;
        if (cursor != null)
        {
            cursor.close();
        }
        obj = new ContentValues();
        ((ContentValues) (obj)).put("name", s);
        ((ContentValues) (obj)).put("type", Integer.valueOf(1));
        ((ContentValues) (obj)).put("session_key_ref", long1);
        ((ContentValues) (obj)).putNull("processed_in_blob");
        mProvider.insert("event_history", ((ContentValues) (obj)));
        conditionallyAddFlowEvent();
        return;
        s;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw s;
    }

    void upload(Runnable runnable)
    {
        if (((Boolean)sIsUploadingMap.get(mApiKey)).booleanValue())
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.d("Localytics", "Already uploading");
            }
            mUploadHandler.sendMessage(mUploadHandler.obtainMessage(2, runnable));
        } else
        {
            try
            {
                preUploadBuildBlobs(mProvider);
                sIsUploadingMap.put(mApiKey, Boolean.TRUE);
                mUploadHandler.sendMessage(mUploadHandler.obtainMessage(1, runnable));
                return;
            }
            catch (Exception exception)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Error occurred during upload", exception);
                }
            }
            sIsUploadingMap.put(mApiKey, Boolean.FALSE);
            if (runnable != null)
            {
                (new Thread(runnable, "upload_callback")).start();
                return;
            }
        }
    }

    void uploadProfile(Runnable runnable)
    {
        if (((Boolean)sIsUploadingProfileMap.get(mApiKey)).booleanValue())
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.d("Localytics", "Already uploading profile");
            }
            mProfileUploadHandler.sendMessage(mProfileUploadHandler.obtainMessage(4, runnable));
        } else
        {
            try
            {
                sIsUploadingProfileMap.put(mApiKey, Boolean.TRUE);
                mProfileUploadHandler.sendMessage(mProfileUploadHandler.obtainMessage(3, runnable));
                return;
            }
            catch (Exception exception)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Error occurred during profile upload", exception);
                }
            }
            sIsUploadingProfileMap.put(mApiKey, Boolean.FALSE);
            if (runnable != null)
            {
                (new Thread(runnable, "upload_profile_callback")).start();
                return;
            }
        }
    }

    static 
    {
        CUSTOM_DIMENSION_KEYS = (new String[] {
            LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_1, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_2, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_3, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_4, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_5, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_6, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_7, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_8, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_9, LocalyticsProvider.CustomDimensionsDbColumns.CUSTOM_DIMENSION_10
        });
        SELECTION_ARGS_FLOW_EVENTS = (new String[] {
            Constants.FLOW_EVENT
        });
    }



}
