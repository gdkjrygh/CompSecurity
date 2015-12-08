// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.localytics.android:
//            LocalyticsProvider, Constants, DatapointHelper

class UploadHandler extends Handler
{
    private static class ProfileUploadDataPair
    {

        public JSONObject consolidatedJSON;
        public StringBuilder rowIDs;

        public ProfileUploadDataPair(JSONObject jsonobject, StringBuilder stringbuilder)
        {
            consolidatedJSON = jsonobject;
            rowIDs = stringbuilder;
        }
    }

    private static final class UploadType extends Enum
    {

        private static final UploadType $VALUES[];
        public static final UploadType PROFILES;
        public static final UploadType SESSIONS;

        public static UploadType valueOf(String s)
        {
            return (UploadType)Enum.valueOf(com/localytics/android/UploadHandler$UploadType, s);
        }

        public static UploadType[] values()
        {
            return (UploadType[])$VALUES.clone();
        }

        static 
        {
            SESSIONS = new UploadType("SESSIONS", 0);
            PROFILES = new UploadType("PROFILES", 1);
            $VALUES = (new UploadType[] {
                SESSIONS, PROFILES
            });
        }

        private UploadType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ANALYTICS_URL_HTTP = "http://%s/api/v2/applications/%s/uploads";
    private static final String ANALYTICS_URL_HTTPS = "https://%s/api/v2/uploads";
    public static final int MESSAGE_RETRY_UPLOAD_PROFILE_REQUEST = 4;
    public static final int MESSAGE_RETRY_UPLOAD_REQUEST = 2;
    public static final int MESSAGE_UPLOAD = 1;
    public static final int MESSAGE_UPLOAD_PROFILE = 3;
    private static final String PROFILE_URL = "https://%s/v1/apps/%s/profiles/%s";
    public static final String UPLOAD_CALLBACK_THREAD_NAME = "upload_callback";
    public static final String UPLOAD_PROFILE_CALLBACK_THREAD_NAME = "upload_profile_callback";
    protected final String mApiKey;
    protected final Context mContext;
    private final String mInstallId;
    protected final LocalyticsProvider mProvider;
    private final Handler mSessionHandler;

    public UploadHandler(Context context, Handler handler, String s, String s1, Looper looper)
    {
        super(looper);
        mContext = context;
        mProvider = LocalyticsProvider.getInstance(context, s);
        mSessionHandler = handler;
        mApiKey = s;
        mInstallId = s1;
    }

    static JSONObject convertAttributesToJson(LocalyticsProvider localyticsprovider, Context context, long l)
        throws JSONException
    {
        Cursor cursor;
        JSONObject jsonobject;
        jsonobject = null;
        cursor = null;
        Cursor cursor1 = localyticsprovider.query("attributes", null, String.format("%s = ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ? AND %s != ?", new Object[] {
            "events_key_ref", "attribute_key", "attribute_key", "attribute_key", "attribute_key", "attribute_key", "attribute_key", "attribute_key", "attribute_key", "attribute_key", 
            "attribute_key"
        }), new String[] {
            Long.toString(l), LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8, LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9, 
            LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10
        }, null);
        cursor = cursor1;
        int i = cursor1.getCount();
        if (i != 0) goto _L2; else goto _L1
_L1:
        localyticsprovider = jsonobject;
        if (cursor1 != null)
        {
            cursor1.close();
            localyticsprovider = jsonobject;
        }
_L6:
        return localyticsprovider;
_L2:
        cursor = cursor1;
        jsonobject = new JSONObject();
        cursor = cursor1;
        i = cursor1.getColumnIndexOrThrow("attribute_key");
        cursor = cursor1;
        int j = cursor1.getColumnIndexOrThrow("attribute_value");
_L4:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        localyticsprovider = cursor1.getString(i);
        cursor = cursor1;
        String s = cursor1.getString(j);
        cursor = cursor1;
        jsonobject.put(localyticsprovider.substring(context.getPackageName().length() + 1, localyticsprovider.length()), s);
        if (true) goto _L4; else goto _L3
        localyticsprovider;
        if (cursor != null)
        {
            cursor.close();
        }
        throw localyticsprovider;
_L3:
        localyticsprovider = jsonobject;
        if (cursor1 != null)
        {
            cursor1.close();
            return jsonobject;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static List convertDatabaseToJson(Context context, LocalyticsProvider localyticsprovider, String s)
    {
        Cursor cursor;
        LinkedList linkedlist;
        linkedlist = new LinkedList();
        cursor = null;
        Cursor cursor1 = localyticsprovider.query("upload_blobs", null, null, null, null);
        cursor = cursor1;
        long l = getApiKeyCreationTime(localyticsprovider, s);
        cursor = cursor1;
        int i = cursor1.getColumnIndexOrThrow("_id");
        cursor = cursor1;
        int j = cursor1.getColumnIndexOrThrow("uuid");
_L4:
        cursor = cursor1;
        boolean flag = cursor1.moveToNext();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        Object obj = new JSONObject();
        cursor = cursor1;
        ((JSONObject) (obj)).put("dt", "h");
        cursor = cursor1;
        ((JSONObject) (obj)).put("pa", l);
        cursor = cursor1;
        ((JSONObject) (obj)).put("seq", cursor1.getLong(i));
        cursor = cursor1;
        ((JSONObject) (obj)).put("u", cursor1.getString(j));
        cursor = cursor1;
        ((JSONObject) (obj)).put("attrs", getAttributesFromSession(localyticsprovider, s, getSessionIdForBlobId(localyticsprovider, cursor1.getLong(i))));
        cursor = cursor1;
        Object obj1 = getIdentifiers(localyticsprovider);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        cursor = cursor1;
        ((JSONObject) (obj)).put("ids", obj1);
        cursor = cursor1;
        linkedlist.add(obj);
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        cursor = cursor1;
        Log.w("Localytics", linkedlist.toString());
        cursor = null;
        obj = cursor;
        obj1 = String.format("%s = ?", new Object[] {
            "upload_blobs_key_ref"
        });
        obj = cursor;
        String s1 = Long.toString(cursor1.getLong(i));
        obj = cursor;
        obj1 = localyticsprovider.query("upload_blob_events", new String[] {
            "events_key_ref"
        }, ((String) (obj1)), new String[] {
            s1
        }, "events_key_ref");
        obj = obj1;
        int k = ((Cursor) (obj1)).getColumnIndexOrThrow("events_key_ref");
_L2:
        obj = obj1;
        if (!((Cursor) (obj1)).moveToNext())
        {
            break MISSING_BLOCK_LABEL_451;
        }
        obj = obj1;
        linkedlist.add(convertEventToJson(localyticsprovider, context, ((Cursor) (obj1)).getLong(k), cursor1.getLong(i), s));
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        cursor = cursor1;
        ((Cursor) (obj)).close();
        cursor = cursor1;
        throw obj1;
        JSONException jsonexception;
        jsonexception;
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        Log.w("Localytics", "Caught exception", jsonexception);
        continue; /* Loop/switch isn't completed */
        context;
        if (cursor != null)
        {
            cursor.close();
        }
        throw context;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        ((Cursor) (obj1)).close();
        if (true) goto _L4; else goto _L3
_L3:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("JSON result is %s", new Object[] {
                linkedlist.toString()
            }));
        }
        return linkedlist;
    }

    static JSONObject convertEventToJson(LocalyticsProvider localyticsprovider, Context context, long l, long l1, String s)
        throws JSONException
    {
        Object obj;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        obj = null;
        Cursor cursor = localyticsprovider.query("events", null, String.format("%s = ?", new Object[] {
            "_id"
        }), new String[] {
            Long.toString(l)
        }, "_id");
        obj = cursor;
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        obj = cursor;
        Object obj1 = cursor.getString(cursor.getColumnIndexOrThrow("event_name"));
        obj = cursor;
        long l2 = getSessionIdForEventId(localyticsprovider, l);
        obj = cursor;
        String s1 = getSessionUuid(localyticsprovider, l2);
        obj = cursor;
        long l3 = getSessionStartTime(localyticsprovider, l2);
        obj = cursor;
        if (!Constants.OPEN_EVENT.equals(obj1)) goto _L4; else goto _L3
_L3:
        obj = cursor;
        jsonobject.put("dt", "s");
        obj = cursor;
        jsonobject.put("ct", Math.round((double)cursor.getLong(cursor.getColumnIndex("wall_time")) / 1000D));
        obj = cursor;
        jsonobject.put("u", s1);
        obj = cursor;
        l1 = getElapsedTimeSinceLastSession(localyticsprovider, l2);
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj = cursor;
        jsonobject.put("sl", Math.round(l1 / 1000L));
        obj = cursor;
        jsonobject.put("nth", l2);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lat")))
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lng")))
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj = cursor;
        double d = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lat"));
        obj = cursor;
        double d1 = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lng"));
        if (d == 0.0D || d1 == 0.0D)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        obj = cursor;
        jsonobject.put("lat", d);
        obj = cursor;
        jsonobject.put("lng", d1);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("customer_id")))
        {
            break MISSING_BLOCK_LABEL_496;
        }
        obj = cursor;
        context = cursor.getString(cursor.getColumnIndexOrThrow("customer_id"));
        obj = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("user_type"));
        obj = cursor;
        jsonobject.put("cid", context);
        obj = cursor;
        jsonobject.put("utp", s);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("ids")))
        {
            break MISSING_BLOCK_LABEL_554;
        }
        obj = cursor;
        jsonobject.put("ids", new JSONObject(cursor.getString(cursor.getColumnIndexOrThrow("ids"))));
        context = null;
        localyticsprovider = localyticsprovider.query("attributes", null, String.format("%s = ?", new Object[] {
            "events_key_ref"
        }), new String[] {
            Long.toString(l)
        }, null);
        context = localyticsprovider;
        int i = localyticsprovider.getColumnIndexOrThrow("attribute_key");
        context = localyticsprovider;
        int j = localyticsprovider.getColumnIndexOrThrow("attribute_value");
_L6:
        context = localyticsprovider;
        if (!localyticsprovider.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = localyticsprovider;
        s = localyticsprovider.getString(i);
        context = localyticsprovider;
        obj = localyticsprovider.getString(j);
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1.equals(s))
        {
            break MISSING_BLOCK_LABEL_714;
        }
        context = localyticsprovider;
        jsonobject.put("c0", obj);
        continue; /* Loop/switch isn't completed */
        localyticsprovider;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        obj = cursor;
        context.close();
        obj = cursor;
        throw localyticsprovider;
        localyticsprovider;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localyticsprovider;
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2.equals(s))
        {
            break MISSING_BLOCK_LABEL_743;
        }
        context = localyticsprovider;
        jsonobject.put("c1", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3.equals(s))
        {
            break MISSING_BLOCK_LABEL_772;
        }
        context = localyticsprovider;
        jsonobject.put("c2", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4.equals(s))
        {
            break MISSING_BLOCK_LABEL_801;
        }
        context = localyticsprovider;
        jsonobject.put("c3", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5.equals(s))
        {
            break MISSING_BLOCK_LABEL_830;
        }
        context = localyticsprovider;
        jsonobject.put("c4", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6.equals(s))
        {
            break MISSING_BLOCK_LABEL_859;
        }
        context = localyticsprovider;
        jsonobject.put("c5", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7.equals(s))
        {
            break MISSING_BLOCK_LABEL_888;
        }
        context = localyticsprovider;
        jsonobject.put("c6", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8.equals(s))
        {
            break MISSING_BLOCK_LABEL_917;
        }
        context = localyticsprovider;
        jsonobject.put("c7", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9.equals(s))
        {
            break MISSING_BLOCK_LABEL_946;
        }
        context = localyticsprovider;
        jsonobject.put("c8", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10.equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = localyticsprovider;
        jsonobject.put("c9", obj);
        if (true) goto _L6; else goto _L5
_L5:
        if (localyticsprovider == null)
        {
            break MISSING_BLOCK_LABEL_989;
        }
        obj = cursor;
        localyticsprovider.close();
_L23:
        if (cursor != null)
        {
            cursor.close();
        }
        return jsonobject;
_L4:
        obj = cursor;
        if (!Constants.CLOSE_EVENT.equals(obj1))
        {
            break MISSING_BLOCK_LABEL_2268;
        }
        obj = cursor;
        jsonobject.put("dt", "c");
        obj = cursor;
        jsonobject.put("u", cursor.getString(cursor.getColumnIndexOrThrow("uuid")));
        obj = cursor;
        jsonobject.put("su", s1);
        obj = cursor;
        jsonobject.put("ss", Math.round((double)l3 / 1000D));
        obj = cursor;
        jsonobject.put("ct", Math.round((double)cursor.getLong(cursor.getColumnIndex("wall_time")) / 1000D));
        s = null;
        context = s;
        obj = String.format("%s = ?", new Object[] {
            "_id"
        });
        context = s;
        obj1 = Long.toString(cursor.getLong(cursor.getColumnIndexOrThrow("session_key_ref")));
        context = s;
        s = localyticsprovider.query("sessions", new String[] {
            "session_start_wall_time"
        }, ((String) (obj)), new String[] {
            obj1
        }, null);
        context = s;
        if (!s.moveToFirst()) goto _L8; else goto _L7
_L7:
        context = s;
        jsonobject.put("ctl", Math.round((double)cursor.getLong(cursor.getColumnIndex("wall_time")) / 1000D) - Math.round((double)s.getLong(s.getColumnIndexOrThrow("session_start_wall_time")) / 1000D));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1311;
        }
        obj = cursor;
        s.close();
        s = null;
        context = s;
        obj = String.format("%s = ? AND %s = ?", new Object[] {
            "session_key_ref", "type"
        });
        context = s;
        obj1 = Long.toString(l2);
        context = s;
        s1 = Integer.toString(1);
        context = s;
        s = localyticsprovider.query("event_history", new String[] {
            "name"
        }, ((String) (obj)), new String[] {
            obj1, s1
        }, "_id");
        context = s;
        obj = new JSONArray();
_L10:
        context = s;
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = s;
        ((JSONArray) (obj)).put(s.getString(s.getColumnIndexOrThrow("name")));
        if (true) goto _L10; else goto _L9
        localyticsprovider;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_1469;
        }
        obj = cursor;
        context.close();
        obj = cursor;
        throw localyticsprovider;
_L8:
        context = s;
        throw new RuntimeException("Session didn't exist");
        localyticsprovider;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_1504;
        }
        obj = cursor;
        context.close();
        obj = cursor;
        throw localyticsprovider;
_L9:
        context = s;
        if (((JSONArray) (obj)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_1535;
        }
        context = s;
        jsonobject.put("fl", obj);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_1551;
        }
        obj = cursor;
        s.close();
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lat")))
        {
            break MISSING_BLOCK_LABEL_1689;
        }
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lng")))
        {
            break MISSING_BLOCK_LABEL_1689;
        }
        obj = cursor;
        d = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lat"));
        obj = cursor;
        d1 = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lng"));
        if (d == 0.0D || d1 == 0.0D)
        {
            break MISSING_BLOCK_LABEL_1689;
        }
        obj = cursor;
        jsonobject.put("lat", d);
        obj = cursor;
        jsonobject.put("lng", d1);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("customer_id")))
        {
            break MISSING_BLOCK_LABEL_1787;
        }
        obj = cursor;
        context = cursor.getString(cursor.getColumnIndexOrThrow("customer_id"));
        obj = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("user_type"));
        obj = cursor;
        jsonobject.put("cid", context);
        obj = cursor;
        jsonobject.put("utp", s);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("ids")))
        {
            break MISSING_BLOCK_LABEL_1845;
        }
        obj = cursor;
        jsonobject.put("ids", new JSONObject(cursor.getString(cursor.getColumnIndexOrThrow("ids"))));
        context = null;
        localyticsprovider = localyticsprovider.query("attributes", null, String.format("%s = ?", new Object[] {
            "events_key_ref"
        }), new String[] {
            Long.toString(l)
        }, null);
        context = localyticsprovider;
        i = localyticsprovider.getColumnIndexOrThrow("attribute_key");
        context = localyticsprovider;
        j = localyticsprovider.getColumnIndexOrThrow("attribute_value");
_L12:
        context = localyticsprovider;
        if (!localyticsprovider.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = localyticsprovider;
        s = localyticsprovider.getString(i);
        context = localyticsprovider;
        obj = localyticsprovider.getString(j);
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1.equals(s))
        {
            break MISSING_BLOCK_LABEL_1990;
        }
        context = localyticsprovider;
        jsonobject.put("c0", obj);
        continue; /* Loop/switch isn't completed */
        localyticsprovider;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_1984;
        }
        obj = cursor;
        context.close();
        obj = cursor;
        throw localyticsprovider;
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2.equals(s))
        {
            break MISSING_BLOCK_LABEL_2019;
        }
        context = localyticsprovider;
        jsonobject.put("c1", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3.equals(s))
        {
            break MISSING_BLOCK_LABEL_2048;
        }
        context = localyticsprovider;
        jsonobject.put("c2", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4.equals(s))
        {
            break MISSING_BLOCK_LABEL_2077;
        }
        context = localyticsprovider;
        jsonobject.put("c3", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5.equals(s))
        {
            break MISSING_BLOCK_LABEL_2106;
        }
        context = localyticsprovider;
        jsonobject.put("c4", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6.equals(s))
        {
            break MISSING_BLOCK_LABEL_2135;
        }
        context = localyticsprovider;
        jsonobject.put("c5", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7.equals(s))
        {
            break MISSING_BLOCK_LABEL_2164;
        }
        context = localyticsprovider;
        jsonobject.put("c6", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8.equals(s))
        {
            break MISSING_BLOCK_LABEL_2193;
        }
        context = localyticsprovider;
        jsonobject.put("c7", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9.equals(s))
        {
            break MISSING_BLOCK_LABEL_2222;
        }
        context = localyticsprovider;
        jsonobject.put("c8", obj);
        continue; /* Loop/switch isn't completed */
        context = localyticsprovider;
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10.equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        context = localyticsprovider;
        jsonobject.put("c9", obj);
        if (true) goto _L12; else goto _L11
_L11:
        if (localyticsprovider == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = cursor;
        localyticsprovider.close();
        continue; /* Loop/switch isn't completed */
        obj = cursor;
        if (Constants.OPT_IN_EVENT.equals(obj1)) goto _L14; else goto _L13
_L13:
        obj = cursor;
        if (!Constants.OPT_OUT_EVENT.equals(obj1)) goto _L15; else goto _L14
_L14:
        obj = cursor;
        jsonobject.put("dt", "o");
        obj = cursor;
        jsonobject.put("u", s);
        obj = cursor;
        if (!Constants.OPT_OUT_EVENT.equals(obj1)) goto _L17; else goto _L16
_L16:
        obj = cursor;
        localyticsprovider = Boolean.TRUE.toString();
_L18:
        obj = cursor;
        jsonobject.put("out", localyticsprovider);
        obj = cursor;
        jsonobject.put("ct", Math.round((double)cursor.getLong(cursor.getColumnIndex("wall_time")) / 1000D));
        continue; /* Loop/switch isn't completed */
_L17:
        obj = cursor;
        localyticsprovider = Boolean.FALSE.toString();
        if (true) goto _L18; else goto _L15
_L15:
        obj = cursor;
        if (!Constants.FLOW_EVENT.equals(obj1))
        {
            break MISSING_BLOCK_LABEL_2842;
        }
        obj = cursor;
        jsonobject.put("dt", "f");
        obj = cursor;
        jsonobject.put("u", cursor.getString(cursor.getColumnIndexOrThrow("uuid")));
        obj = cursor;
        jsonobject.put("ss", Math.round((double)l3 / 1000D));
        s = null;
        context = s;
        obj = String.format("%s = ? AND %s <= ?", new Object[] {
            "session_key_ref", "processed_in_blob"
        });
        context = s;
        obj1 = Long.toString(l2);
        context = s;
        s1 = Long.toString(l1);
        context = s;
        s = localyticsprovider.query("event_history", new String[] {
            "type", "processed_in_blob", "name"
        }, ((String) (obj)), new String[] {
            obj1, s1
        }, "_id");
        context = s;
        obj = new JSONArray();
        context = s;
        obj1 = new JSONArray();
_L20:
        context = s;
        if (!s.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        context = s;
        s1 = s.getString(s.getColumnIndexOrThrow("name"));
        context = s;
        if (s.getInt(s.getColumnIndexOrThrow("type")) == 0)
        {
            localyticsprovider = "e";
        } else
        {
            localyticsprovider = "s";
        }
        context = s;
        if (l1 != s.getLong(s.getColumnIndexOrThrow("processed_in_blob")))
        {
            break MISSING_BLOCK_LABEL_2770;
        }
        context = s;
        ((JSONArray) (obj)).put((new JSONObject()).put(localyticsprovider, s1));
        continue; /* Loop/switch isn't completed */
        localyticsprovider;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_2757;
        }
        obj = cursor;
        context.close();
        obj = cursor;
        throw localyticsprovider;
        context = s;
        ((JSONArray) (obj1)).put((new JSONObject()).put(localyticsprovider, s1));
        if (true) goto _L20; else goto _L19
_L19:
        context = s;
        jsonobject.put("nw", obj);
        context = s;
        jsonobject.put("od", obj1);
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = cursor;
        s.close();
        continue; /* Loop/switch isn't completed */
        obj = cursor;
        jsonobject.put("dt", "e");
        obj = cursor;
        jsonobject.put("ct", Math.round((double)cursor.getLong(cursor.getColumnIndex("wall_time")) / 1000D));
        obj = cursor;
        jsonobject.put("u", cursor.getString(cursor.getColumnIndexOrThrow("uuid")));
        obj = cursor;
        jsonobject.put("su", s1);
        obj = cursor;
        jsonobject.put("n", ((String) (obj1)).substring(context.getPackageName().length() + 1, ((String) (obj1)).length()));
        obj = cursor;
        l1 = cursor.getLong(cursor.getColumnIndex("clv_increase"));
        if (l1 == 0L)
        {
            break MISSING_BLOCK_LABEL_3015;
        }
        obj = cursor;
        jsonobject.put("v", l1);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lat")))
        {
            break MISSING_BLOCK_LABEL_3153;
        }
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("event_lng")))
        {
            break MISSING_BLOCK_LABEL_3153;
        }
        obj = cursor;
        d = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lat"));
        obj = cursor;
        d1 = cursor.getDouble(cursor.getColumnIndexOrThrow("event_lng"));
        if (d == 0.0D || d1 == 0.0D)
        {
            break MISSING_BLOCK_LABEL_3153;
        }
        obj = cursor;
        jsonobject.put("lat", d);
        obj = cursor;
        jsonobject.put("lng", d1);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("customer_id")))
        {
            break MISSING_BLOCK_LABEL_3253;
        }
        obj = cursor;
        s = cursor.getString(cursor.getColumnIndexOrThrow("customer_id"));
        obj = cursor;
        obj1 = cursor.getString(cursor.getColumnIndexOrThrow("user_type"));
        obj = cursor;
        jsonobject.put("cid", s);
        obj = cursor;
        jsonobject.put("utp", obj1);
        obj = cursor;
        if (cursor.isNull(cursor.getColumnIndexOrThrow("ids")))
        {
            break MISSING_BLOCK_LABEL_3311;
        }
        obj = cursor;
        jsonobject.put("ids", new JSONObject(cursor.getString(cursor.getColumnIndexOrThrow("ids"))));
        s = null;
        obj1 = localyticsprovider.query("attributes", null, String.format("%s = ?", new Object[] {
            "events_key_ref"
        }), new String[] {
            Long.toString(l)
        }, null);
        s = ((String) (obj1));
        i = ((Cursor) (obj1)).getColumnIndexOrThrow("attribute_key");
        s = ((String) (obj1));
        j = ((Cursor) (obj1)).getColumnIndexOrThrow("attribute_value");
_L22:
        s = ((String) (obj1));
        if (!((Cursor) (obj1)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = ((String) (obj1));
        obj = ((Cursor) (obj1)).getString(i);
        s = ((String) (obj1));
        s1 = ((Cursor) (obj1)).getString(j);
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_1.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3479;
        }
        s = ((String) (obj1));
        jsonobject.put("c0", s1);
        continue; /* Loop/switch isn't completed */
        localyticsprovider;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_3473;
        }
        obj = cursor;
        s.close();
        obj = cursor;
        throw localyticsprovider;
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_2.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3512;
        }
        s = ((String) (obj1));
        jsonobject.put("c1", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_3.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3545;
        }
        s = ((String) (obj1));
        jsonobject.put("c2", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_4.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3578;
        }
        s = ((String) (obj1));
        jsonobject.put("c3", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_5.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3611;
        }
        s = ((String) (obj1));
        jsonobject.put("c4", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_6.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3644;
        }
        s = ((String) (obj1));
        jsonobject.put("c5", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_7.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3677;
        }
        s = ((String) (obj1));
        jsonobject.put("c6", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_8.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3710;
        }
        s = ((String) (obj1));
        jsonobject.put("c7", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_9.equals(obj))
        {
            break MISSING_BLOCK_LABEL_3743;
        }
        s = ((String) (obj1));
        jsonobject.put("c8", s1);
        continue; /* Loop/switch isn't completed */
        s = ((String) (obj1));
        if (!LocalyticsProvider.AttributesDbColumns.ATTRIBUTE_CUSTOM_DIMENSION_10.equals(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = ((String) (obj1));
        jsonobject.put("c9", s1);
        if (true) goto _L22; else goto _L21
_L21:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_3792;
        }
        obj = cursor;
        ((Cursor) (obj1)).close();
        obj = cursor;
        localyticsprovider = convertAttributesToJson(localyticsprovider, context, l);
        if (localyticsprovider == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = cursor;
        jsonobject.put("attrs", localyticsprovider);
        if (true) goto _L23; else goto _L2
_L2:
        obj = cursor;
        throw new RuntimeException();
    }

    static void deleteBlobsAndSessions(LocalyticsProvider localyticsprovider)
    {
        Cursor cursor1;
        LinkedList linkedlist;
        HashSet hashset;
        linkedlist = new LinkedList();
        hashset = new HashSet();
        cursor1 = null;
        Cursor cursor2 = localyticsprovider.query("upload_blob_events", new String[] {
            "_id", "events_key_ref", "upload_blobs_key_ref"
        }, null, null, null);
        cursor1 = cursor2;
        int i = cursor2.getColumnIndexOrThrow("upload_blobs_key_ref");
        cursor1 = cursor2;
        int j = cursor2.getColumnIndexOrThrow("_id");
        cursor1 = cursor2;
        int k = cursor2.getColumnIndexOrThrow("events_key_ref");
_L2:
        cursor1 = cursor2;
        if (!cursor2.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor1 = cursor2;
        long l3 = cursor2.getLong(i);
        cursor1 = cursor2;
        long l4 = cursor2.getLong(j);
        cursor1 = cursor2;
        long l = cursor2.getLong(k);
        cursor1 = cursor2;
        localyticsprovider.remove("upload_blob_events", String.format("%s = ?", new Object[] {
            "_id"
        }), new String[] {
            Long.toString(l4)
        });
        cursor1 = cursor2;
        hashset.add(Long.valueOf(l3));
        cursor1 = cursor2;
        localyticsprovider.remove("attributes", String.format("%s = ?", new Object[] {
            "events_key_ref"
        }), new String[] {
            Long.toString(l)
        });
        Cursor cursor;
        cursor1 = null;
        cursor = cursor1;
        Object obj = String.format("%s = ? AND %s = ?", new Object[] {
            "_id", "event_name"
        });
        cursor = cursor1;
        String s = Long.toString(l);
        cursor = cursor1;
        String s1 = Constants.CLOSE_EVENT;
        cursor = cursor1;
        obj = localyticsprovider.query("events", new String[] {
            "session_key_ref"
        }, ((String) (obj)), new String[] {
            s, s1
        }, null);
        cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_398;
        }
        cursor = ((Cursor) (obj));
        l3 = ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("session_key_ref"));
        cursor = ((Cursor) (obj));
        localyticsprovider.remove("event_history", String.format("%s = ?", new Object[] {
            "session_key_ref"
        }), new String[] {
            Long.toString(l3)
        });
        cursor = ((Cursor) (obj));
        linkedlist.add(Long.valueOf(((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndexOrThrow("session_key_ref"))));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        cursor1 = cursor2;
        ((Cursor) (obj)).close();
        cursor1 = cursor2;
        localyticsprovider.remove("events", String.format("%s = ?", new Object[] {
            "_id"
        }), new String[] {
            Long.toString(l)
        });
        if (true) goto _L2; else goto _L1
        localyticsprovider;
        if (cursor1 != null)
        {
            cursor1.close();
        }
        throw localyticsprovider;
        localyticsprovider;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_477;
        }
        cursor1 = cursor2;
        cursor.close();
        cursor1 = cursor2;
        throw localyticsprovider;
_L1:
        if (cursor2 != null)
        {
            cursor2.close();
        }
        long l1;
        for (Iterator iterator = hashset.iterator(); iterator.hasNext(); localyticsprovider.remove("upload_blobs", String.format("%s = ?", new Object[] {
    "_id"
}), new String[] {
    Long.toString(l1)
}))
        {
            l1 = ((Long)iterator.next()).longValue();
        }

        long l2;
        for (Iterator iterator1 = linkedlist.iterator(); iterator1.hasNext(); localyticsprovider.remove("sessions", String.format("%s = ?", new Object[] {
    "_id"
}), new String[] {
    Long.toString(l2)
}))
        {
            l2 = ((Long)iterator1.next()).longValue();
        }

        return;
    }

    static void deleteProfileAttribute(LocalyticsProvider localyticsprovider, StringBuilder stringbuilder)
    {
        localyticsprovider.remove("profile", String.format("%s IN (%s)", new Object[] {
            "_id", stringbuilder.toString()
        }), null);
    }

    private String getApiKey()
    {
        String s1 = mApiKey;
        String s2 = DatapointHelper.getLocalyticsRollupKeyOrNull(mContext);
        String s = s1;
        if (s2 != null)
        {
            s = s1;
            if (!TextUtils.isEmpty(s2))
            {
                s = s2;
            }
        }
        return s;
    }

    static long getApiKeyCreationTime(LocalyticsProvider localyticsprovider, String s)
    {
        LocalyticsProvider localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("api_keys", null, String.format("%s = ?", new Object[] {
            "api_key"
        }), new String[] {
            s
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        localyticsprovider1 = localyticsprovider;
        int i = Math.round((float)localyticsprovider.getLong(localyticsprovider.getColumnIndexOrThrow("created_time")) / 1000F);
        long l = i;
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        localyticsprovider1 = localyticsprovider;
        throw new RuntimeException("API key entry couldn't be found");
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static JSONObject getAttributesFromSession(LocalyticsProvider localyticsprovider, String s, long l)
        throws JSONException
    {
        Cursor cursor = null;
        Cursor cursor1 = localyticsprovider.query("sessions", null, String.format("%s = ?", new Object[] {
            "_id"
        }), new String[] {
            Long.toString(l)
        }, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst()) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        JSONObject jsonobject = new JSONObject();
        cursor = cursor1;
        jsonobject.put("av", cursor1.getString(cursor1.getColumnIndexOrThrow("app_version")));
        cursor = cursor1;
        jsonobject.put("dac", cursor1.getString(cursor1.getColumnIndexOrThrow("network_type")));
        cursor = cursor1;
        Object obj = cursor1.getString(cursor1.getColumnIndexOrThrow("device_android_id_hash"));
        cursor = cursor1;
        if ("".equals(obj))
        {
            break MISSING_BLOCK_LABEL_179;
        }
        cursor = cursor1;
        jsonobject.put("du", obj);
        cursor = cursor1;
        jsonobject.put("dc", cursor1.getString(cursor1.getColumnIndexOrThrow("device_country")));
        cursor = cursor1;
        jsonobject.put("dma", cursor1.getString(cursor1.getColumnIndexOrThrow("device_manufacturer")));
        cursor = cursor1;
        jsonobject.put("dmo", cursor1.getString(cursor1.getColumnIndexOrThrow("device_model")));
        cursor = cursor1;
        jsonobject.put("dov", cursor1.getString(cursor1.getColumnIndexOrThrow("android_version")));
        cursor = cursor1;
        jsonobject.put("dp", "Android");
        cursor = cursor1;
        if (!cursor1.isNull(cursor1.getColumnIndexOrThrow("device_serial_number_hash"))) goto _L4; else goto _L3
_L3:
        cursor = cursor1;
        obj = JSONObject.NULL;
_L12:
        cursor = cursor1;
        jsonobject.put("dms", obj);
        cursor = cursor1;
        jsonobject.put("dsdk", cursor1.getString(cursor1.getColumnIndexOrThrow("android_sdk")));
        cursor = cursor1;
        jsonobject.put("au", s);
        cursor = cursor1;
        jsonobject.put("lv", cursor1.getString(cursor1.getColumnIndexOrThrow("localytics_library_version")));
        cursor = cursor1;
        jsonobject.put("dt", "a");
        cursor = cursor1;
        if (!cursor1.isNull(cursor1.getColumnIndexOrThrow("device_android_id"))) goto _L6; else goto _L5
_L5:
        cursor = cursor1;
        s = ((String) (JSONObject.NULL));
_L9:
        cursor = cursor1;
        jsonobject.put("caid", s);
        cursor = cursor1;
        if (!cursor1.isNull(cursor1.getColumnIndexOrThrow("device_advertising_id"))) goto _L8; else goto _L7
_L7:
        cursor = cursor1;
        s = ((String) (JSONObject.NULL));
_L10:
        cursor = cursor1;
        jsonobject.put("gcadid", s);
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndexOrThrow("iu"));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        cursor = cursor1;
        jsonobject.put("iu", s);
        cursor = cursor1;
        jsonobject.put("dlc", cursor1.getString(cursor1.getColumnIndexOrThrow("locale_country")));
        cursor = cursor1;
        jsonobject.put("dll", cursor1.getString(cursor1.getColumnIndexOrThrow("locale_language")));
        cursor = cursor1;
        jsonobject.put("nca", cursor1.getString(cursor1.getColumnIndexOrThrow("network_carrier")));
        cursor = cursor1;
        jsonobject.put("nc", cursor1.getString(cursor1.getColumnIndexOrThrow("network_country")));
        cursor = cursor1;
        s = getStringFromAppInfo(localyticsprovider, "fb_attribution");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_734;
        }
        cursor = cursor1;
        jsonobject.put("fbat", s);
        cursor = cursor1;
        s = getStringFromAppInfo(localyticsprovider, "play_attribution");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_764;
        }
        cursor = cursor1;
        jsonobject.put("aurl", s);
        cursor = cursor1;
        s = getStringFromAppInfo(localyticsprovider, "registration_id");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_794;
        }
        cursor = cursor1;
        jsonobject.put("push", s);
        cursor = cursor1;
        s = getStringFromAppInfo(localyticsprovider, "first_android_id");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        cursor = cursor1;
        jsonobject.put("aid", s);
        cursor = cursor1;
        s = getStringFromAppInfo(localyticsprovider, "first_advertising_id");
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_854;
        }
        cursor = cursor1;
        jsonobject.put("gadid", s);
        cursor = cursor1;
        localyticsprovider = getStringFromAppInfo(localyticsprovider, "package_name");
        if (localyticsprovider == null)
        {
            break MISSING_BLOCK_LABEL_884;
        }
        cursor = cursor1;
        jsonobject.put("pkg", localyticsprovider);
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return jsonobject;
_L4:
        cursor = cursor1;
        obj = cursor1.getString(cursor1.getColumnIndexOrThrow("device_serial_number_hash"));
        continue; /* Loop/switch isn't completed */
_L6:
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndexOrThrow("device_android_id"));
          goto _L9
_L8:
        cursor = cursor1;
        s = cursor1.getString(cursor1.getColumnIndexOrThrow("device_advertising_id"));
          goto _L10
_L2:
        cursor = cursor1;
        throw new RuntimeException("No session exists");
        localyticsprovider;
        if (cursor != null)
        {
            cursor.close();
        }
        throw localyticsprovider;
        if (true) goto _L12; else goto _L11
_L11:
    }

    static String getCustomerID(LocalyticsProvider localyticsprovider)
    {
        return (String)localyticsprovider.getUserIdAndType().get("id");
    }

    static long getElapsedTimeSinceLastSession(LocalyticsProvider localyticsprovider, long l)
    {
        LocalyticsProvider localyticsprovider1;
        Object obj;
        obj = null;
        localyticsprovider1 = obj;
        String s = String.format("%s = ?", new Object[] {
            "_id"
        });
        localyticsprovider1 = obj;
        String s1 = Long.toString(l);
        localyticsprovider1 = obj;
        localyticsprovider = localyticsprovider.query("sessions", new String[] {
            "elapsed"
        }, s, new String[] {
            s1
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        localyticsprovider1 = localyticsprovider;
        l = localyticsprovider.getLong(localyticsprovider.getColumnIndexOrThrow("elapsed"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        localyticsprovider1 = localyticsprovider;
        throw new RuntimeException();
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static JSONObject getIdentifiers(LocalyticsProvider localyticsprovider)
        throws JSONException
    {
        Cursor cursor = null;
        Cursor cursor1 = localyticsprovider.query("identifiers", null, null, null, null);
        localyticsprovider = null;
_L2:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj;
        obj = localyticsprovider;
        if (localyticsprovider != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        cursor = cursor1;
        obj = new JSONObject();
        cursor = cursor1;
        ((JSONObject) (obj)).put(cursor1.getString(cursor1.getColumnIndexOrThrow("key")), cursor1.getString(cursor1.getColumnIndexOrThrow("value")));
        localyticsprovider = ((LocalyticsProvider) (obj));
        if (true) goto _L2; else goto _L1
        localyticsprovider;
        if (cursor != null)
        {
            cursor.close();
        }
        throw localyticsprovider;
_L1:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return localyticsprovider;
    }

    static TreeMap getProfileAttributes(LocalyticsProvider localyticsprovider)
    {
        Cursor cursor;
        TreeMap treemap;
        treemap = new TreeMap();
        cursor = null;
        Cursor cursor1 = localyticsprovider.query("profile", null, null, null, "_id ASC");
_L4:
        cursor = cursor1;
        if (!cursor1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        if (cursor1.getInt(cursor1.getColumnIndexOrThrow("action")) != LocalyticsSession.ProfileDbAction.SET_ATTRIBUTE.ordinal())
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        String s = cursor1.getString(cursor1.getColumnIndexOrThrow("customer_id"));
        cursor = cursor1;
        localyticsprovider = cursor1.getString(cursor1.getColumnIndexOrThrow("attribute"));
        cursor = cursor1;
        String s1 = String.valueOf(cursor1.getInt(cursor1.getColumnIndexOrThrow("_id")));
        cursor = cursor1;
        ProfileUploadDataPair profileuploaddatapair = (ProfileUploadDataPair)treemap.get(s);
        cursor = cursor1;
        localyticsprovider = new JSONObject(localyticsprovider);
_L2:
        if (profileuploaddatapair != null)
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        treemap.put(s, new ProfileUploadDataPair(localyticsprovider, new StringBuilder(s1)));
        continue; /* Loop/switch isn't completed */
        localyticsprovider;
        cursor = cursor1;
        Object obj = new JSONObject();
        localyticsprovider = ((LocalyticsProvider) (obj));
        cursor = cursor1;
        if (!Constants.IS_LOGGABLE)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = cursor1;
        Log.w("Localytics", "Profile attribute is unreadable; data will not be uploaded but will be deleted.");
        localyticsprovider = ((LocalyticsProvider) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        cursor = cursor1;
        profileuploaddatapair.rowIDs.append(", ").append(s1);
        cursor = cursor1;
        obj = (String)localyticsprovider.keys().next();
        cursor = cursor1;
        try
        {
            profileuploaddatapair.consolidatedJSON.put(((String) (obj)), localyticsprovider.get(((String) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (LocalyticsProvider localyticsprovider) { }
        finally
        {
            if (cursor != null)
            {
                cursor.close();
            }
            throw localyticsprovider;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (cursor1 != null)
        {
            cursor1.close();
        }
        return treemap;
    }

    static long getSessionIdForBlobId(LocalyticsProvider localyticsprovider, long l)
    {
        Object obj;
        Cursor cursor;
        cursor = null;
        obj = cursor;
        String s = String.format("%s = ?", new Object[] {
            "upload_blobs_key_ref"
        });
        obj = cursor;
        String s1 = Long.toString(l);
        obj = cursor;
        cursor = localyticsprovider.query("upload_blob_events", new String[] {
            "events_key_ref"
        }, s, new String[] {
            s1
        }, null);
        obj = cursor;
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = cursor;
        l = cursor.getLong(cursor.getColumnIndexOrThrow("events_key_ref"));
        if (cursor != null)
        {
            cursor.close();
        }
        cursor = null;
        obj = cursor;
        s = String.format("%s = ?", new Object[] {
            "_id"
        });
        obj = cursor;
        s1 = Long.toString(l);
        obj = cursor;
        localyticsprovider = localyticsprovider.query("events", new String[] {
            "session_key_ref"
        }, s, new String[] {
            s1
        }, null);
        obj = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj = localyticsprovider;
        l = localyticsprovider.getLong(localyticsprovider.getColumnIndexOrThrow("session_key_ref"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        obj = cursor;
        throw new RuntimeException("No events associated with blob");
        localyticsprovider;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localyticsprovider;
        obj = localyticsprovider;
        throw new RuntimeException("No session associated with event");
        localyticsprovider;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw localyticsprovider;
    }

    static long getSessionIdForEventId(LocalyticsProvider localyticsprovider, long l)
    {
        LocalyticsProvider localyticsprovider1;
        Object obj;
        obj = null;
        localyticsprovider1 = obj;
        String s = String.format("%s = ?", new Object[] {
            "_id"
        });
        localyticsprovider1 = obj;
        String s1 = Long.toString(l);
        localyticsprovider1 = obj;
        localyticsprovider = localyticsprovider.query("events", new String[] {
            "session_key_ref"
        }, s, new String[] {
            s1
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        localyticsprovider1 = localyticsprovider;
        l = localyticsprovider.getLong(localyticsprovider.getColumnIndexOrThrow("session_key_ref"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        localyticsprovider1 = localyticsprovider;
        throw new RuntimeException();
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static long getSessionStartTime(LocalyticsProvider localyticsprovider, long l)
    {
        LocalyticsProvider localyticsprovider1;
        Object obj;
        obj = null;
        localyticsprovider1 = obj;
        String s = String.format("%s = ?", new Object[] {
            "_id"
        });
        localyticsprovider1 = obj;
        String s1 = Long.toString(l);
        localyticsprovider1 = obj;
        localyticsprovider = localyticsprovider.query("sessions", new String[] {
            "session_start_wall_time"
        }, s, new String[] {
            s1
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        localyticsprovider1 = localyticsprovider;
        l = localyticsprovider.getLong(localyticsprovider.getColumnIndexOrThrow("session_start_wall_time"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return l;
        localyticsprovider1 = localyticsprovider;
        throw new RuntimeException();
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static String getSessionUuid(LocalyticsProvider localyticsprovider, long l)
    {
        LocalyticsProvider localyticsprovider1;
        String s;
        s = null;
        localyticsprovider1 = s;
        String s1 = String.format("%s = ?", new Object[] {
            "_id"
        });
        localyticsprovider1 = s;
        String s2 = Long.toString(l);
        localyticsprovider1 = s;
        localyticsprovider = localyticsprovider.query("sessions", new String[] {
            "uuid"
        }, s1, new String[] {
            s2
        }, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_105;
        }
        localyticsprovider1 = localyticsprovider;
        s = localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow("uuid"));
        if (localyticsprovider != null)
        {
            localyticsprovider.close();
        }
        return s;
        localyticsprovider1 = localyticsprovider;
        throw new RuntimeException();
        localyticsprovider;
        if (localyticsprovider1 != null)
        {
            localyticsprovider1.close();
        }
        throw localyticsprovider;
    }

    static String getStringFromAppInfo(LocalyticsProvider localyticsprovider, String s)
    {
        LocalyticsProvider localyticsprovider1 = null;
        localyticsprovider = localyticsprovider.query("info", null, null, null, null);
        localyticsprovider1 = localyticsprovider;
        if (!localyticsprovider.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        localyticsprovider1 = localyticsprovider;
        s = localyticsprovider.getString(localyticsprovider.getColumnIndexOrThrow(s));
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

    private boolean isUploadTooBig(String s)
    {
        boolean flag;
        if (s.getBytes().length >= 50000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "Attempting to upload too much data. Abandoning upload and deleting data.");
        }
        return flag;
    }

    private void retrieveHttpResponse(UploadType uploadtype, InputStream inputstream)
        throws IOException
    {
        inputstream = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
        Object obj = new StringBuilder();
        do
        {
            String s = inputstream.readLine();
            if (s == null)
            {
                break;
            }
            ((StringBuilder) (obj)).append(s);
        } while (true);
        obj = ((StringBuilder) (obj)).toString();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            if (uploadtype == UploadType.SESSIONS)
            {
                onUploadResponded(((String) (obj)));
            } else
            {
                onProfileUploadResponded(((String) (obj)));
            }
        }
        inputstream.close();
    }

    private boolean upload(UploadType uploadtype, String s, String s1, String s2, String s3, String s4)
    {
        Object obj;
        String s5;
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        int i;
        boolean flag;
        if (s == null)
        {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("body cannot be null");
        }
        Object obj1;
        boolean flag1;
        if (Constants.IS_LOGGABLE)
        {
            if (uploadtype == UploadType.SESSIONS)
            {
                Log.v("Localytics", String.format("Upload body before compression is: %s", new Object[] {
                    s1
                }));
            } else
            {
                Log.v("Localytics", String.format("Profile upload body is: %s", new Object[] {
                    s1
                }));
            }
        }
        s5 = null;
        abyte0 = null;
        obj1 = null;
        bytearrayoutputstream = null;
        obj = obj1;
        abyte1 = s1.getBytes("UTF-8");
        obj = obj1;
        if (uploadtype != UploadType.SESSIONS) goto _L2; else goto _L1
_L1:
        obj = obj1;
        bytearrayoutputstream = new ByteArrayOutputStream(abyte1.length);
        obj = obj1;
        s1 = new GZIPOutputStream(bytearrayoutputstream);
        s1.write(abyte1);
        s1.finish();
        if (DatapointHelper.getApiLevel() < 19)
        {
            s1.flush();
        }
        abyte0 = bytearrayoutputstream.toByteArray();
_L11:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (UploadType uploadtype)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught exception", uploadtype);
                }
                return false;
            }
        }
        if (DatapointHelper.getApiLevel() < 9) goto _L4; else goto _L3
_L3:
        s5 = null;
        s1 = null;
        obj = null;
        s = (HttpURLConnection)(new URL(s)).openConnection();
        obj = s;
        s5 = s;
        s1 = s;
        s.setConnectTimeout(60000);
        obj = s;
        s5 = s;
        s1 = s;
        s.setReadTimeout(60000);
        obj = s;
        s5 = s;
        s1 = s;
        s.setDoOutput(true);
        obj = s;
        s5 = s;
        s1 = s;
        if (uploadtype != UploadType.SESSIONS) goto _L6; else goto _L5
_L5:
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("Content-Type", "application/x-gzip");
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("Content-Encoding", "gzip");
_L15:
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("Accept-Encoding", "");
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-upload-time", Long.toString(Math.round((double)System.currentTimeMillis() / 1000D)));
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-install-id", s2);
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-app-id", s3);
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-client-version", "androida_2.72");
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-app-version", DatapointHelper.getAppVersion(mContext));
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("x-customer-id", s4);
        obj = s;
        s5 = s;
        s1 = s;
        s.setFixedLengthStreamingMode(abyte0.length);
        s2 = null;
        s3 = s.getOutputStream();
        s2 = s3;
        s3.write(abyte0);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_495;
        }
        obj = s;
        s5 = s;
        s1 = s;
        s3.flush();
        obj = s;
        s5 = s;
        s1 = s;
        s3.close();
        obj = s;
        s5 = s;
        s1 = s;
        i = s.getResponseCode();
        obj = s;
        s5 = s;
        s1 = s;
        if (!Constants.IS_LOGGABLE) goto _L8; else goto _L7
_L7:
        obj = s;
        s5 = s;
        s1 = s;
        if (uploadtype != UploadType.SESSIONS) goto _L10; else goto _L9
_L9:
        obj = s;
        s5 = s;
        s1 = s;
        Log.v("Localytics", String.format("Upload complete with status %d", new Object[] {
            Integer.valueOf(i)
        }));
_L8:
        if (i >= 400 && i <= 499)
        {
            flag1 = true;
            flag = flag1;
            if (s != null)
            {
                s.disconnect();
                flag = flag1;
            }
        } else
        {
label0:
            {
                if (i < 500 || i > 599)
                {
                    break label0;
                }
                flag = false;
                if (s != null)
                {
                    s.disconnect();
                    return false;
                }
            }
        }
_L13:
        return flag;
_L2:
        abyte0 = abyte1;
        s1 = bytearrayoutputstream;
          goto _L11
        s;
        uploadtype = s5;
_L27:
        obj = uploadtype;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_686;
        }
        obj = uploadtype;
        Log.w("Localytics", "UnsupportedEncodingException", s);
        flag = false;
        if (uploadtype == null) goto _L13; else goto _L12
_L12:
        try
        {
            uploadtype.close();
        }
        // Misplaced declaration of an exception variable
        catch (UploadType uploadtype)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Caught exception", uploadtype);
            }
            return false;
        }
        return false;
        s;
        uploadtype = abyte0;
_L26:
        obj = uploadtype;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_744;
        }
        obj = uploadtype;
        Log.w("Localytics", "IOException", s);
        flag = false;
        if (uploadtype == null) goto _L13; else goto _L14
_L14:
        try
        {
            uploadtype.close();
        }
        // Misplaced declaration of an exception variable
        catch (UploadType uploadtype)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "Caught exception", uploadtype);
            }
            return false;
        }
        return false;
        uploadtype;
_L25:
        if (obj != null)
        {
            try
            {
                ((GZIPOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (UploadType uploadtype)
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", "Caught exception", uploadtype);
                }
                return false;
            }
        }
        throw uploadtype;
_L6:
        obj = s;
        s5 = s;
        s1 = s;
        s.setRequestProperty("Content-Type", "application/json; charset=utf-8");
          goto _L15
        uploadtype;
        s1 = ((String) (obj));
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_852;
        }
        s1 = ((String) (obj));
        Log.w("Localytics", "ClientProtocolException", uploadtype);
        flag = false;
        if (obj == null) goto _L13; else goto _L16
_L16:
        ((HttpURLConnection) (obj)).disconnect();
        return false;
        uploadtype;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_899;
        }
        obj = s;
        s5 = s;
        s1 = s;
        s2.flush();
        obj = s;
        s5 = s;
        s1 = s;
        s2.close();
        obj = s;
        s5 = s;
        s1 = s;
        throw uploadtype;
        uploadtype;
        s1 = s5;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_932;
        }
        s1 = s5;
        Log.w("Localytics", "ClientProtocolException", uploadtype);
        flag = false;
        if (s5 == null) goto _L13; else goto _L17
_L17:
        s5.disconnect();
        return false;
_L10:
        obj = s;
        s5 = s;
        s1 = s;
        Log.v("Localytics", String.format("Profile upload complete with status %d", new Object[] {
            Integer.valueOf(i)
        }));
          goto _L8
        uploadtype;
        if (s1 != null)
        {
            s1.disconnect();
        }
        throw uploadtype;
        obj = s;
        s5 = s;
        s1 = s;
        retrieveHttpResponse(uploadtype, s.getInputStream());
        if (s != null)
        {
            s.disconnect();
        }
_L24:
        return true;
_L4:
        s1 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(s1, 60000);
        HttpConnectionParams.setSoTimeout(s1, 60000);
        s1 = new DefaultHttpClient(s1);
        s = new HttpPost(s);
        if (uploadtype == UploadType.SESSIONS)
        {
            s.addHeader("Content-Type", "application/x-gzip");
            s.addHeader("Content-Encoding", "gzip");
        } else
        {
            s.addHeader("Content-Type", "application/json; charset=utf-8");
        }
        s.addHeader("x-upload-time", Long.toString(Math.round((double)System.currentTimeMillis() / 1000D)));
        s.addHeader("x-install-id", s2);
        s.addHeader("x-app-id", s3);
        s.addHeader("x-client-version", "androida_2.72");
        s.addHeader("x-app-version", DatapointHelper.getAppVersion(mContext));
        s.addHeader("x-customer-id", s4);
        s.setEntity(new ByteArrayEntity(abyte0));
        s = s1.execute(s);
        i = s.getStatusLine().getStatusCode();
        if (!Constants.IS_LOGGABLE) goto _L19; else goto _L18
_L18:
        if (uploadtype != UploadType.SESSIONS) goto _L21; else goto _L20
_L20:
        Log.v("Localytics", String.format("Upload complete with status %d", new Object[] {
            Integer.valueOf(i)
        }));
_L19:
        if (i >= 400 && i <= 499)
        {
            return true;
        }
          goto _L22
_L21:
        try
        {
            Log.v("Localytics", String.format("Profile upload complete with status %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (UploadType uploadtype)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "ClientProtocolException", uploadtype);
            }
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (UploadType uploadtype)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "IOException", uploadtype);
            }
            return false;
        }
        if (true) goto _L19; else goto _L22
_L22:
        if (i >= 500 && i <= 599)
        {
            return false;
        }
        s = s.getEntity();
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        retrieveHttpResponse(uploadtype, s.getContent());
        if (true) goto _L24; else goto _L23
_L23:
        uploadtype;
        obj = s1;
          goto _L25
        s;
        uploadtype = s1;
          goto _L26
        s;
        uploadtype = s1;
          goto _L27
    }

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR tableswitch 1 4: default 629
    //                   1 69
    //                   2 327
    //                   3 363
    //                   4 592;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        throw new RuntimeException("Fell through switch statement");
_L2:
        Runnable runnable;
        try
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.d("Localytics", "UploadHandler received MESSAGE_UPLOAD");
            }
            runnable = (Runnable)message.obj;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.e("Localytics", "Localytics library threw an uncaught exception", message);
            }
            return;
        }
        message = convertDatabaseToJson(mContext, mProvider, mApiKey);
        if (message.isEmpty()) goto _L7; else goto _L6
_L6:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        for (message = message.iterator(); message.hasNext(); stringbuilder.append('\n'))
        {
            stringbuilder.append(((JSONObject)message.next()).toString());
        }

          goto _L8
        message;
        if (runnable == null) goto _L10; else goto _L9
_L9:
        (new Thread(runnable, "upload_callback")).start();
_L10:
        mSessionHandler.sendEmptyMessage(5);
        throw message;
_L8:
        String s1;
        String s3;
        UploadType uploadtype;
        s1 = getApiKey();
        s3 = getCustomerID(mProvider);
        uploadtype = UploadType.SESSIONS;
        if (!Constants.USE_HTTPS) goto _L12; else goto _L11
_L11:
        message = String.format("https://%s/api/v2/uploads", new Object[] {
            Constants.ANALYTICS_URL
        });
_L15:
        if (upload(uploadtype, message, stringbuilder.toString(), mInstallId, s1, s3))
        {
            mProvider.runBatchTransaction(new Runnable() {

                final UploadHandler this$0;

                public void run()
                {
                    UploadHandler.deleteBlobsAndSessions(mProvider);
                }

            
            {
                this$0 = UploadHandler.this;
                super();
            }
            });
        }
_L7:
        if (runnable == null) goto _L14; else goto _L13
_L13:
        (new Thread(runnable, "upload_callback")).start();
_L14:
        mSessionHandler.sendEmptyMessage(5);
        return;
_L12:
        message = String.format("http://%s/api/v2/applications/%s/uploads", new Object[] {
            Constants.ANALYTICS_URL, s1
        });
          goto _L15
_L3:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Received MESSAGE_RETRY_UPLOAD_REQUEST");
        }
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(4, message.obj));
        return;
_L4:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "UploadHandler received MESSAGE_UPLOAD_PROFILE");
        }
        message = (Runnable)message.obj;
        String s = getApiKey();
        Iterator iterator = getProfileAttributes(mProvider).entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            final StringBuilder rows = (java.util.Map.Entry)iterator.next();
            String s2 = (String)rows.getKey();
            JSONObject jsonobject = ((ProfileUploadDataPair)rows.getValue()).consolidatedJSON;
            Object obj = new JSONObject();
            ((JSONObject) (obj)).put("attributes", jsonobject);
            rows = ((ProfileUploadDataPair)rows.getValue()).rowIDs;
            obj = ((JSONObject) (obj)).toString();
            if (upload(UploadType.PROFILES, String.format("https://%s/v1/apps/%s/profiles/%s", new Object[] {
    Constants.PROFILES_URL, s, URLEncoder.encode(s2, "UTF-8")
}), ((String) (obj)), mInstallId, s, s2))
            {
                mProvider.runBatchTransaction(new Runnable() {

                    final UploadHandler this$0;
                    final StringBuilder val$rows;

                    public void run()
                    {
                        UploadHandler.deleteProfileAttribute(mProvider, rows);
                    }

            
            {
                this$0 = UploadHandler.this;
                rows = stringbuilder;
                super();
            }
                });
            }
        } while (true);
        if (message == null) goto _L17; else goto _L16
_L16:
        (new Thread(message, "upload_profile_callback")).start();
_L17:
        mSessionHandler.sendEmptyMessage(18);
        return;
_L5:
        if (Constants.IS_LOGGABLE)
        {
            Log.d("Localytics", "Received MESSAGE_RETRY_UPLOAD_PROFILE_REQUEST");
        }
        mSessionHandler.sendMessage(mSessionHandler.obtainMessage(17, message.obj));
        return;
    }

    protected void onProfileUploadResponded(String s)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.v("Localytics", String.format("Profile response is: %s", new Object[] {
                s
            }));
        }
    }

    protected void onUploadResponded(String s)
    {
    }
}
