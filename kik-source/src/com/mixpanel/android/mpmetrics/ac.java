// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
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

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ad, t

final class ac
{

    private static boolean j = true;
    private static final Object k = new Object();
    private final Future a;
    private final Future b;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener c = new ad(this);
    private JSONObject d;
    private Map e;
    private boolean f;
    private String g;
    private String h;
    private JSONArray i;

    public ac(Future future, Future future1)
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
                Log.e("MixpanelAPI PersistentIdentity", "Unparsable object found in waiting people records", jsonexception);
            }
            l++;
        }
        break MISSING_BLOCK_LABEL_116;
        sharedpreferences;
        Log.e("MixpanelAPI PersistentIdentity", "Waiting people records were unreadable.");
        return null;
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.remove("waiting_array");
        a(((android.content.SharedPreferences.Editor) (sharedpreferences)));
        return ((JSONArray) (obj));
    }

    public static void a(Context context, String s, Map map)
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        context = context.getSharedPreferences(s, 0).edit();
        context.clear();
        for (s = map.entrySet().iterator(); s.hasNext(); context.putString((String)map.getKey(), (String)map.getValue()))
        {
            map = (java.util.Map.Entry)s.next();
        }

        break MISSING_BLOCK_LABEL_89;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
        a(((android.content.SharedPreferences.Editor) (context)));
        j = true;
        obj;
        JVM INSTR monitorexit ;
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

    static void a(ac ac1)
    {
        ac1.h();
    }

    static Object f()
    {
        return k;
    }

    static boolean g()
    {
        j = false;
        return false;
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
            Log.e("MixpanelAPI PersistentIdentity", "Cannot load referrer properties from shared preferences.", executionexception.getCause());
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI PersistentIdentity", "Cannot load referrer properties from shared preferences.", interruptedexception);
            return;
        }
    }

    private void i()
    {
        if (d == null)
        {
            Log.e("MixpanelAPI PersistentIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String s = d.toString();
        boolean flag = t.a;
        try
        {
            android.content.SharedPreferences.Editor editor = ((SharedPreferences)a.get()).edit();
            editor.putString("super_properties", s);
            a(editor);
            return;
        }
        catch (ExecutionException executionexception)
        {
            Log.e("MixpanelAPI PersistentIdentity", "Cannot store superProperties in shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI PersistentIdentity", "Cannot store superProperties in shared preferences.", interruptedexception);
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
            Log.e("MixpanelAPI PersistentIdentity", "Cannot read distinct ids from sharedPreferences.", ((ExecutionException) (obj)).getCause());
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI PersistentIdentity", "Cannot read distinct ids from sharedPreferences.", ((Throwable) (obj)));
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
                Log.e("MixpanelAPI PersistentIdentity", (new StringBuilder("Could not interpret waiting people JSON record ")).append(((String) (obj))).toString());
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
            Log.e("MixpanelAPI PersistentIdentity", "Can't write distinct ids to shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI PersistentIdentity", "Can't write distinct ids to shared preferences.", interruptedexception);
            return;
        }
          goto _L1
    }

    public final JSONObject a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = d;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        obj = ((SharedPreferences)a.get()).getString("super_properties", "{}");
        boolean flag = t.a;
        d = new JSONObject(((String) (obj)));
        if (d == null)
        {
            d = new JSONObject();
        }
_L2:
        obj = d;
        this;
        JVM INSTR monitorexit ;
        return ((JSONObject) (obj));
        Object obj1;
        obj1;
        Log.e("MixpanelAPI PersistentIdentity", "Cannot load superProperties from SharedPreferences.", ((ExecutionException) (obj1)).getCause());
        if (d != null) goto _L2; else goto _L1
_L1:
        d = new JSONObject();
          goto _L2
        obj1;
        throw obj1;
        obj1;
        Log.e("MixpanelAPI PersistentIdentity", "Cannot load superProperties from SharedPreferences.", ((Throwable) (obj1)));
        if (d != null) goto _L2; else goto _L3
_L3:
        d = new JSONObject();
          goto _L2
        obj1;
        Log.e("MixpanelAPI PersistentIdentity", "Cannot parse stored superProperties");
        i();
        if (d != null) goto _L2; else goto _L4
_L4:
        d = new JSONObject();
          goto _L2
        obj1;
        if (d == null)
        {
            d = new JSONObject();
        }
        throw obj1;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            j();
        }
        g = s;
        k();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(JSONObject jsonobject)
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

    public final Map b()
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

    public final void b(String s)
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
        Log.e("MixpanelAPI PersistentIdentity", "Can't write push id to shared preferences", s.getCause());
          goto _L1
        s;
        throw s;
        s;
        Log.e("MixpanelAPI PersistentIdentity", "Can't write push id to shared preferences", s);
          goto _L1
    }

    public final void b(JSONObject jsonobject)
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
        Log.e("MixpanelAPI PersistentIdentity", "Exception registering super property.", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        i();
        this;
        JVM INSTR monitorexit ;
    }

    public final String c()
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

    public final void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a().remove(s);
        i();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final String d()
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

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)a.get()).edit();
        editor.remove("push_id");
        a(editor);
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("MixpanelAPI PersistentIdentity", "Can't write push id to shared preferences", ((ExecutionException) (obj)).getCause());
          goto _L1
        obj;
        throw obj;
        obj;
        Log.e("MixpanelAPI PersistentIdentity", "Can't write push id to shared preferences", ((Throwable) (obj)));
          goto _L1
    }

}
