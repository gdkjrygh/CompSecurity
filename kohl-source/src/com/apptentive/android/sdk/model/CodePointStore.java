// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.apptentive.android.sdk.Log;
import com.apptentive.android.sdk.util.Util;
import org.json.JSONException;
import org.json.JSONObject;

public class CodePointStore extends JSONObject
{

    public static final String KEY_BUILD = "build";
    public static final String KEY_CODE_POINT = "code_point";
    public static final String KEY_INTERACTIONS = "interactions";
    public static final String KEY_LAST = "last";
    public static final String KEY_TOTAL = "total";
    public static final String KEY_VERSION = "version";
    private static CodePointStore instance;

    private CodePointStore()
    {
    }

    private CodePointStore(String s)
        throws JSONException
    {
        super(s);
    }

    public static void clear(Context context)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().remove("codePointStore").commit();
        instance = null;
    }

    public static Long getBuildInvokes(Context context, boolean flag, String s, String s1)
    {
        context = getRecord(context, flag, s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        long l;
        if (!context.has("build"))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context = context.getJSONObject("build");
        if (!context.has(s1))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        l = context.getLong(s1);
        return Long.valueOf(l);
        context;
        return Long.valueOf(0L);
    }

    private static CodePointStore getInstance(Context context)
    {
        if (instance == null)
        {
            instance = load(context);
        }
        return instance;
    }

    public static Double getLastInvoke(Context context, boolean flag, String s)
    {
        context = getRecord(context, flag, s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        double d;
        if (!context.has("last"))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        d = context.getDouble("last");
        return Double.valueOf(d);
        context;
        return Double.valueOf(0.0D);
    }

    public static JSONObject getRecord(Context context, boolean flag, String s)
    {
        CodePointStore codepointstore = getInstance(context);
        if (flag)
        {
            context = "interactions";
        } else
        {
            context = "code_point";
        }
        if (codepointstore.isNull(context) || !codepointstore.has(context))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context = codepointstore.getJSONObject(context);
        if (!context.has(s))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context = context.getJSONObject(s);
        return context;
        context;
        Log.w("Error loading code point record for \"%s\"", new Object[] {
            s
        });
        return null;
    }

    public static Long getTotalInvokes(Context context, boolean flag, String s)
    {
        context = getRecord(context, flag, s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        long l;
        if (!context.has("total"))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        l = context.getLong("total");
        return Long.valueOf(l);
        context;
        return Long.valueOf(0L);
    }

    public static Long getVersionInvokes(Context context, boolean flag, String s, String s1)
    {
        context = getRecord(context, flag, s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        long l;
        if (!context.has("version"))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        context = context.getJSONObject("version");
        if (!context.has(s1))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        l = context.getLong(s1);
        return Long.valueOf(l);
        context;
        return Long.valueOf(0L);
    }

    private static CodePointStore load(Context context)
    {
        return load(context.getSharedPreferences("APPTENTIVE", 0));
    }

    private static CodePointStore load(SharedPreferences sharedpreferences)
    {
        sharedpreferences = sharedpreferences.getString("codePointStore", null);
        if (sharedpreferences == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        sharedpreferences = new CodePointStore(sharedpreferences);
        return sharedpreferences;
        sharedpreferences;
        Log.e("Error loading CodePointStore from SharedPreferences.", sharedpreferences, new Object[0]);
        return new CodePointStore();
    }

    private static void save(Context context)
    {
        context.getSharedPreferences("APPTENTIVE", 0).edit().putString("codePointStore", instance.toString()).commit();
    }

    public static void storeCodePointForCurrentAppVersion(Context context, String s)
    {
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorenter ;
        storeRecordForCurrentAppVersion(context, false, s);
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void storeInteractionForCurrentAppVersion(Context context, String s)
    {
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorenter ;
        storeRecordForCurrentAppVersion(context, true, s);
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void storeRecord(Context context, boolean flag, String s, String s1, int i)
    {
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorenter ;
        storeRecord(context, flag, s, s1, i, Util.currentTimeSeconds());
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void storeRecord(Context context, boolean flag, String s, String s1, int i, double d)
    {
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorenter ;
        String s2;
        CodePointStore codepointstore;
        s2 = String.valueOf(i);
        codepointstore = getInstance(context);
        if (codepointstore == null || s == null || s1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        JSONObject jsonobject;
        if (flag)
        {
            obj = "interactions";
        } else
        {
            obj = "code_point";
        }
        if (codepointstore.isNull(((String) (obj)))) goto _L4; else goto _L3
_L3:
        obj = codepointstore.getJSONObject(((String) (obj)));
_L9:
        if (((JSONObject) (obj)).isNull(s)) goto _L6; else goto _L5
_L5:
        obj = ((JSONObject) (obj)).getJSONObject(s);
_L10:
        ((JSONObject) (obj)).put("last", d);
        i = 0;
        if (((JSONObject) (obj)).has("total"))
        {
            i = ((JSONObject) (obj)).getInt("total");
        }
        ((JSONObject) (obj)).put("total", i + 1);
        if (((JSONObject) (obj)).isNull("version")) goto _L8; else goto _L7
_L7:
        jsonobject = ((JSONObject) (obj)).getJSONObject("version");
_L11:
        i = 0;
        if (!jsonobject.isNull(s1))
        {
            i = jsonobject.getInt(s1);
        }
        jsonobject.put(s1, i + 1);
        if (((JSONObject) (obj)).isNull("build"))
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s1 = ((JSONObject) (obj)).getJSONObject("build");
_L12:
        i = 0;
        if (!s1.isNull(s2))
        {
            i = s1.getInt(s2);
        }
        s1.put(s2, i + 1);
        save(context);
_L2:
        com/apptentive/android/sdk/model/CodePointStore;
        JVM INSTR monitorexit ;
        return;
_L4:
        jsonobject = new JSONObject();
        codepointstore.put(((String) (obj)), jsonobject);
        obj = jsonobject;
          goto _L9
        context;
        Log.w("Unable to store code point %s.", context, new Object[] {
            s
        });
          goto _L2
        context;
        throw context;
_L6:
        jsonobject = new JSONObject();
        ((JSONObject) (obj)).put(s, jsonobject);
        obj = jsonobject;
          goto _L10
_L8:
        jsonobject = new JSONObject();
        ((JSONObject) (obj)).put("version", jsonobject);
          goto _L11
        s1 = new JSONObject();
        ((JSONObject) (obj)).put("build", s1);
          goto _L12
    }

    private static void storeRecordForCurrentAppVersion(Context context, boolean flag, String s)
    {
        storeRecord(context, flag, s, Util.getAppVersionName(context), Util.getAppVersionCode(context));
    }

    public static String toString(Context context)
    {
        return (new StringBuilder()).append("CodePointStore:  ").append(getInstance(context).toString()).toString();
    }
}
