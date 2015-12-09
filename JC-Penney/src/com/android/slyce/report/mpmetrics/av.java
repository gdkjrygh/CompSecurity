// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            aw, ab

class av
{

    private static boolean j = true;
    private static final Object k = new Object();
    private final Future a;
    private final Future b;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener c = new aw(this);
    private JSONObject d;
    private Map e;
    private boolean f;
    private String g;
    private String h;
    private JSONArray i;

    public av(Future future, Future future1)
    {
        b = future;
        a = future1;
        d = null;
        e = null;
        f = false;
    }

    public static JSONArray a(SharedPreferences sharedpreferences)
    {
        String s;
        Object obj;
        s = sharedpreferences.getString("people_distinct_id", null);
        obj = sharedpreferences.getString("waiting_array", null);
        if (obj == null || s == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        JSONArray jsonarray = new JSONArray(((String) (obj)));
        obj = new JSONArray();
        int l = 0;
        while (l < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(l);
                jsonobject.put("$distinct_id", s);
                ((JSONArray) (obj)).put(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.PersistentIdentity", "Unparsable object found in waiting people records", jsonexception);
            }
            l++;
        }
        break MISSING_BLOCK_LABEL_116;
        sharedpreferences;
        Log.e("MixpanelAPI.PersistentIdentity", "Waiting people records were unreadable.");
        return null;
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.remove("waiting_array");
        a(((android.content.SharedPreferences.Editor) (sharedpreferences)));
        return ((JSONArray) (obj));
    }

    private static void a(android.content.SharedPreferences.Editor editor)
    {
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    static void a(av av1)
    {
        av1.h();
    }

    static boolean a(boolean flag)
    {
        j = flag;
        return flag;
    }

    static Object f()
    {
        return k;
    }

    private void g()
    {
        String s = ((SharedPreferences)a.get()).getString("super_properties", "{}");
        if (ab.a)
        {
            Log.v("MixpanelAPI.PersistentIdentity", (new StringBuilder()).append("Loading Super Properties ").append(s).toString());
        }
        d = new JSONObject(s);
        if (d == null)
        {
            d = new JSONObject();
        }
_L2:
        return;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PersistentIdentity", "Cannot load superProperties from SharedPreferences.", ((ExecutionException) (obj)).getCause());
        if (d != null) goto _L2; else goto _L1
_L1:
        d = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PersistentIdentity", "Cannot load superProperties from SharedPreferences.", ((Throwable) (obj)));
        if (d != null) goto _L2; else goto _L3
_L3:
        d = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PersistentIdentity", "Cannot parse stored superProperties");
        i();
        if (d != null) goto _L2; else goto _L4
_L4:
        d = new JSONObject();
        return;
        obj;
        if (d == null)
        {
            d = new JSONObject();
        }
        throw obj;
    }

    private void h()
    {
        e = new HashMap();
        try
        {
            Object obj = (SharedPreferences)b.get();
            ((SharedPreferences) (obj)).unregisterOnSharedPreferenceChangeListener(c);
            ((SharedPreferences) (obj)).registerOnSharedPreferenceChangeListener(c);
            String s;
            Object obj1;
            for (obj = ((SharedPreferences) (obj)).getAll().entrySet().iterator(); ((Iterator) (obj)).hasNext(); e.put(s, obj1.toString()))
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                s = (String)((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
            }

        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot load referrer properties from shared preferences.", executionexception.getCause());
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot load referrer properties from shared preferences.", interruptedexception);
            return;
        }
    }

    private void i()
    {
        if (d == null)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String s = d.toString();
        if (ab.a)
        {
            Log.v("MixpanelAPI.PersistentIdentity", (new StringBuilder()).append("Storing Super Properties ").append(s).toString());
        }
        try
        {
            android.content.SharedPreferences.Editor editor = ((SharedPreferences)a.get()).edit();
            editor.putString("super_properties", s);
            a(editor);
            return;
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot store superProperties in shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot store superProperties in shared preferences.", interruptedexception);
        }
    }

    private void j()
    {
        Object obj;
        try
        {
            obj = (SharedPreferences)a.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot read distinct ids from sharedPreferences.", ((ExecutionException) (obj)).getCause());
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Cannot read distinct ids from sharedPreferences.", ((Throwable) (obj)));
            obj = null;
        }
        if (obj == null)
        {
            return;
        }
        g = ((SharedPreferences) (obj)).getString("events_distinct_id", null);
        h = ((SharedPreferences) (obj)).getString("people_distinct_id", null);
        i = null;
        obj = ((SharedPreferences) (obj)).getString("waiting_array", null);
        if (obj != null)
        {
            try
            {
                i = new JSONArray(((String) (obj)));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.PersistentIdentity", (new StringBuilder()).append("Could not interpret waiting people JSON record ").append(((String) (obj))).toString());
            }
        }
        if (g == null)
        {
            g = UUID.randomUUID().toString();
            k();
        }
        f = true;
    }

    private void k()
    {
        android.content.SharedPreferences.Editor editor;
        editor = ((SharedPreferences)a.get()).edit();
        editor.putString("events_distinct_id", g);
        editor.putString("people_distinct_id", h);
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        editor.remove("waiting_array");
_L1:
        a(editor);
        return;
        try
        {
            editor.putString("waiting_array", i.toString());
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Can't write distinct ids to shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PersistentIdentity", "Can't write distinct ids to shared preferences.", interruptedexception);
            return;
        }
          goto _L1
    }

    public JSONObject a()
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject;
        if (d == null)
        {
            g();
        }
        jsonobject = d;
        this;
        JVM INSTR monitorexit ;
        return jsonobject;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            j();
        }
        h = s;
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void a(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            j();
        }
        if (i == null)
        {
            i = new JSONArray();
        }
        i.put(jsonobject);
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public Map b()
    {
        synchronized (k)
        {
            if (j || e == null)
            {
                h();
                j = false;
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)a.get()).edit();
        editor.putString("push_id", s);
        a(editor);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        Log.e("MixpanelAPI.PersistentIdentity", "Can't write push id to shared preferences", s.getCause());
          goto _L1
        s;
        throw s;
        s;
        Log.e("MixpanelAPI.PersistentIdentity", "Can't write push id to shared preferences", s);
          goto _L1
    }

    public void b(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = a();
        iterator = jsonobject.keys();
_L1:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s = (String)iterator.next();
        jsonobject1.put(s, jsonobject.get(s));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.PersistentIdentity", "Exception registering super property.", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        i();
        this;
        JVM INSTR monitorexit ;
    }

    public String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!f)
        {
            j();
        }
        s = g;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = a();
        iterator = jsonobject.keys();
_L1:
        String s;
        boolean flag;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_82;
            }
            s = (String)iterator.next();
            flag = jsonobject1.has(s);
        } while (flag);
        jsonobject1.put(s, jsonobject.get(s));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.PersistentIdentity", "Exception registering super property.", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        i();
        this;
        JVM INSTR monitorexit ;
    }

    public String d()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!f)
        {
            j();
        }
        s = h;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public JSONArray e()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a((SharedPreferences)a.get());
        j();
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((JSONArray) (obj));
        Object obj1;
        obj1;
        obj = null;
_L3:
        Log.e("MixpanelAPI.PersistentIdentity", "Couldn't read waiting people records from shared preferences.", ((ExecutionException) (obj1)).getCause());
          goto _L1
        obj;
        throw obj;
        obj1;
        obj = null;
_L2:
        Log.e("MixpanelAPI.PersistentIdentity", "Couldn't read waiting people records from shared preferences.", ((Throwable) (obj1)));
          goto _L1
        obj1;
          goto _L2
        obj1;
          goto _L3
    }

}
