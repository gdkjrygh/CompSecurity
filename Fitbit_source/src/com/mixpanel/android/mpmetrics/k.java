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
//            g, o

class k
{

    private static boolean j = false;
    private static final Object k = new Object();
    private static final String l = "MixpanelAPI.PIdentity";
    private final Future a;
    private final Future b;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener c = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {

        final k a;

        public void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            synchronized (k.i())
            {
                k.a(a);
                k.a(false);
            }
            return;
            s;
            sharedpreferences;
            JVM INSTR monitorexit ;
            throw s;
        }

            
            {
                a = k.this;
                super();
            }
    };
    private JSONObject d;
    private Map e;
    private boolean f;
    private String g;
    private String h;
    private JSONArray i;

    public k(Future future, Future future1)
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
        int i1 = 0;
        while (i1 < jsonarray.length()) 
        {
            try
            {
                JSONObject jsonobject = jsonarray.getJSONObject(i1);
                jsonobject.put("$distinct_id", s);
                ((JSONArray) (obj)).put(jsonobject);
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.PIdentity", "Unparsable object found in waiting people records", jsonexception);
            }
            i1++;
        }
        break MISSING_BLOCK_LABEL_116;
        sharedpreferences;
        Log.e("MixpanelAPI.PIdentity", "Waiting people records were unreadable.");
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

    static void a(k k1)
    {
        k1.l();
    }

    static boolean a(boolean flag)
    {
        j = flag;
        return flag;
    }

    static Object i()
    {
        return k;
    }

    private JSONObject j()
    {
        if (d == null)
        {
            k();
        }
        return d;
    }

    private void k()
    {
        String s = ((SharedPreferences)a.get()).getString("super_properties", "{}");
        if (g.b)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder()).append("Loading Super Properties ").append(s).toString());
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
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((ExecutionException) (obj)).getCause());
        if (d != null) goto _L2; else goto _L1
_L1:
        d = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((Throwable) (obj)));
        if (d != null) goto _L2; else goto _L3
_L3:
        d = new JSONObject();
        return;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
        m();
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

    private void l()
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
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", executionexception.getCause());
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", interruptedexception);
            return;
        }
    }

    private void m()
    {
        if (d == null)
        {
            Log.e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String s = d.toString();
        if (g.b)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder()).append("Storing Super Properties ").append(s).toString());
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
            Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot store superProperties in shared preferences.", interruptedexception);
        }
    }

    private void n()
    {
        Object obj;
        try
        {
            obj = (SharedPreferences)a.get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", ((ExecutionException) (obj)).getCause());
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot read distinct ids from sharedPreferences.", ((Throwable) (obj)));
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
                Log.e("MixpanelAPI.PIdentity", (new StringBuilder()).append("Could not interpret waiting people JSON record ").append(((String) (obj))).toString());
            }
        }
        if (g == null)
        {
            g = UUID.randomUUID().toString();
            o();
        }
        f = true;
    }

    private void o()
    {
        android.content.SharedPreferences.Editor editor;
        editor = ((SharedPreferences)a.get()).edit();
        editor.putString("events_distinct_id", g);
        editor.putString("people_distinct_id", h);
        if (i != null)
        {
            break MISSING_BLOCK_LABEL_66;
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
            Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", executionexception.getCause());
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Can't write distinct ids to shared preferences.", interruptedexception);
            return;
        }
          goto _L1
    }

    public Map a()
    {
        synchronized (k)
        {
            if (j || e == null)
            {
                l();
                j = false;
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(o o1)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = j();
        jsonobject1 = new JSONObject();
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s, jsonobject.get(s)))
        {
            s = (String)iterator.next();
        }

          goto _L1
        o1;
        Log.wtf("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", o1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        o1 = o1.a(jsonobject1);
        if (o1 != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Log.w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
          goto _L2
        o1;
        throw o1;
        d = o1;
        m();
          goto _L2
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            n();
        }
        g = s;
        o();
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
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = j();
        iterator = jsonobject1.keys();
_L1:
        String s;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s = (String)iterator.next();
        jsonobject.put(s, jsonobject1.get(s));
          goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.wtf("MixpanelAPI.PIdentity", "Object read from one JSON Object cannot be written to another", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        this;
        JVM INSTR monitorexit ;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!f)
        {
            n();
        }
        s = g;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            n();
        }
        h = s;
        o();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void b(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            n();
        }
        if (i == null)
        {
            i = new JSONArray();
        }
        i.put(jsonobject);
        o();
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    public String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s;
        if (!f)
        {
            n();
        }
        s = h;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(String s)
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
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", s.getCause());
          goto _L1
        s;
        throw s;
        s;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", s);
          goto _L1
    }

    public void c(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = j();
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
        Log.e("MixpanelAPI.PIdentity", "Exception registering super property.", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        m();
        this;
        JVM INSTR monitorexit ;
    }

    public JSONArray d()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a((SharedPreferences)a.get());
        n();
_L1:
        this;
        JVM INSTR monitorexit ;
        return ((JSONArray) (obj));
        Object obj1;
        obj1;
        obj = null;
_L3:
        Log.e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", ((ExecutionException) (obj1)).getCause());
          goto _L1
        obj;
        throw obj;
        obj1;
        obj = null;
_L2:
        Log.e("MixpanelAPI.PIdentity", "Couldn't read waiting people records from shared preferences.", ((Throwable) (obj1)));
          goto _L1
        obj1;
          goto _L2
        obj1;
          goto _L3
    }

    public void d(String s)
    {
        this;
        JVM INSTR monitorenter ;
        j().remove(s);
        m();
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void d(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = j();
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
        Log.e("MixpanelAPI.PIdentity", "Exception registering super property.", jsonexception);
          goto _L1
        jsonobject;
        throw jsonobject;
        m();
        this;
        JVM INSTR monitorexit ;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = ((SharedPreferences)a.get()).edit();
        editor.clear();
        a(editor);
        k();
        n();
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw new RuntimeException(((ExecutionException) (obj)).getCause());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new RuntimeException(((InterruptedException) (obj)).getCause());
    }

    public void f()
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
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((ExecutionException) (obj)).getCause());
          goto _L1
        obj;
        throw obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((Throwable) (obj)));
          goto _L1
    }

    public String g()
    {
        this;
        JVM INSTR monitorenter ;
        String s = ((SharedPreferences)a.get()).getString("push_id", null);
_L2:
        this;
        JVM INSTR monitorexit ;
        return s;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((ExecutionException) (obj)).getCause());
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("MixpanelAPI.PIdentity", "Can't write push id to shared preferences", ((Throwable) (obj)));
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public void h()
    {
        this;
        JVM INSTR monitorenter ;
        d = new JSONObject();
        m();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        j = true;
    }
}
