// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class cxt
{

    private static boolean j = true;
    private static final Object k = new Object();
    private final Future a;
    private final Future b;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener c = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() {

        private cxt a;

        public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
        {
            synchronized (cxt.e())
            {
                cxt.a(a);
                cxt.f();
            }
            return;
            s;
            sharedpreferences;
            JVM INSTR monitorexit ;
            throw s;
        }

            
            {
                a = cxt.this;
                super();
            }
    };
    private JSONObject d;
    private Map e;
    private boolean f;
    private String g;
    private String h;
    private JSONArray i;

    public cxt(Future future, Future future1)
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
                Log.e("MixpanelAPI.PIdentity", "Unparsable object found in waiting people records", jsonexception);
            }
            l++;
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

    static void a(cxt cxt1)
    {
        cxt1.h();
    }

    static Object e()
    {
        return k;
    }

    static boolean f()
    {
        j = false;
        return false;
    }

    private JSONObject g()
    {
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        String s = ((SharedPreferences)a.get()).getString("super_properties", "{}");
        if (cxi.a)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder("Loading Super Properties ")).append(s).toString());
        }
        d = new JSONObject(s);
        if (d == null)
        {
            d = new JSONObject();
        }
_L2:
        return d;
        Object obj;
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((ExecutionException) (obj)).getCause());
        if (d == null)
        {
            d = new JSONObject();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot load superProperties from SharedPreferences.", ((Throwable) (obj)));
        if (d == null)
        {
            d = new JSONObject();
        }
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("MixpanelAPI.PIdentity", "Cannot parse stored superProperties");
        i();
        if (d == null)
        {
            d = new JSONObject();
        }
        if (true) goto _L2; else goto _L1
_L1:
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
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", executionexception.getCause());
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("MixpanelAPI.PIdentity", "Cannot load referrer properties from shared preferences.", interruptedexception);
            return;
        }
    }

    private void i()
    {
        if (d == null)
        {
            Log.e("MixpanelAPI.PIdentity", "storeSuperProperties should not be called with uninitialized superPropertiesCache.");
            return;
        }
        String s = d.toString();
        if (cxi.a)
        {
            Log.v("MixpanelAPI.PIdentity", (new StringBuilder("Storing Super Properties ")).append(s).toString());
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
                Log.e("MixpanelAPI.PIdentity", (new StringBuilder("Could not interpret waiting people JSON record ")).append(((String) (obj))).toString());
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

    public final Map a()
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

    public final void a(cya cya1)
    {
        this;
        JVM INSTR monitorenter ;
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = g();
        jsonobject1 = new JSONObject();
        String s;
        for (Iterator iterator = jsonobject.keys(); iterator.hasNext(); jsonobject1.put(s, jsonobject.get(s)))
        {
            s = (String)iterator.next();
        }

          goto _L1
        cya1;
        Log.wtf("MixpanelAPI.PIdentity", "Can't copy from one JSONObject to another", cya1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        cya1 = cya1.a(jsonobject1);
        if (cya1 != null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Log.w("MixpanelAPI.PIdentity", "An update to Mixpanel's super properties returned null, and will have no effect.");
          goto _L2
        cya1;
        throw cya1;
        d = cya1;
        i();
          goto _L2
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
        JSONObject jsonobject1;
        Iterator iterator;
        jsonobject1 = g();
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

    public final String b()
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

    public final void b(String s)
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

    public final void b(JSONObject jsonobject)
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

    public final String c()
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

    public final void c(String s)
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

    public final JSONArray d()
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

}
