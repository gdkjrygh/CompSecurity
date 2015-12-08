// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.g;
import com.mixpanel.android.mpmetrics.h;
import com.mixpanel.android.mpmetrics.o;
import com.mixpanel.android.mpmetrics.t;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            g, i, c, b, 
//            d, ImageStore, EditProtocol, EditorConnection, 
//            k

public class j
    implements com.mixpanel.android.viewcrawler.g, i, l.i
{
    private class a
        implements EditorConnection.a
    {

        final j a;

        public void a()
        {
            Message message = j.a(a).obtainMessage(4);
            j.a(a).sendMessage(message);
        }

        public void a(JSONObject jsonobject)
        {
            Message message = j.a(a).obtainMessage(2);
            message.obj = jsonobject;
            j.a(a).sendMessage(message);
        }

        public void b()
        {
            Message message = j.a(a).obtainMessage(8);
            j.a(a).sendMessage(message);
        }

        public void b(JSONObject jsonobject)
        {
            Message message = j.a(a).obtainMessage(3);
            message.obj = jsonobject;
            j.a(a).sendMessage(message);
        }

        public void c(JSONObject jsonobject)
        {
            Message message = j.a(a).obtainMessage(10);
            message.obj = jsonobject;
            j.a(a).sendMessage(message);
        }

        public void d(JSONObject jsonobject)
        {
            Message message = j.a(a).obtainMessage(6);
            message.obj = jsonobject;
            j.a(a).sendMessage(message);
        }

        public void e(JSONObject jsonobject)
        {
            Message message = j.a(a).obtainMessage(11);
            message.obj = jsonobject;
            j.a(a).sendMessage(message);
        }

        private a()
        {
            a = j.this;
            super();
        }

    }

    private class b
        implements Runnable
    {

        final j a;
        private volatile boolean b;

        public void a()
        {
            b = false;
            j.a(a).post(this);
        }

        public void b()
        {
            b = true;
            j.a(a).removeCallbacks(this);
        }

        public void run()
        {
            if (!b)
            {
                Message message = j.a(a).obtainMessage(1);
                j.a(a).sendMessage(message);
            }
            j.a(a).postDelayed(this, 30000L);
        }

        public b()
        {
            a = j.this;
            super();
            b = true;
        }
    }

    private class c
        implements android.app.Application.ActivityLifecycleCallbacks, d.a
    {

        final j a;
        private final com.mixpanel.android.viewcrawler.d b = new com.mixpanel.android.viewcrawler.d(this);
        private final b c;

        private void a(Activity activity)
        {
            if (b() && !j.c(a).g())
            {
                c.a();
            } else
            if (!j.c(a).f())
            {
                activity = (SensorManager)activity.getSystemService("sensor");
                android.hardware.Sensor sensor = activity.getDefaultSensor(1);
                activity.registerListener(b, sensor, 3);
                return;
            }
        }

        private void b(Activity activity)
        {
            if (b() && !j.c(a).g())
            {
                c.b();
            } else
            if (!j.c(a).f())
            {
                ((SensorManager)activity.getSystemService("sensor")).unregisterListener(b);
                return;
            }
        }

        private boolean b()
        {
            while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) 
            {
                return false;
            }
            return true;
        }

        public void a()
        {
            Message message = j.a(a).obtainMessage(1);
            j.a(a).sendMessage(message);
        }

        public void onActivityCreated(Activity activity, Bundle bundle)
        {
        }

        public void onActivityDestroyed(Activity activity)
        {
        }

        public void onActivityPaused(Activity activity)
        {
            j.b(a).b(activity);
            if (j.b(a).b())
            {
                b(activity);
            }
        }

        public void onActivityResumed(Activity activity)
        {
            a(activity);
            j.b(a).a(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
        {
        }

        public void onActivityStarted(Activity activity)
        {
        }

        public void onActivityStopped(Activity activity)
        {
        }

        public c()
        {
            a = j.this;
            super();
            c = new b();
        }
    }

    public static interface d
        extends Annotation
    {
    }

    private static class e
    {

        public final String a;
        public final JSONObject b;
        public final Pair c;

        public e(String s1, JSONObject jsonobject, Pair pair)
        {
            a = s1;
            b = jsonobject;
            c = pair;
        }
    }

    private static class f
    {

        private final h a;

        public void a(Set set)
        {
            if (set.size() == 0)
            {
                return;
            }
            JSONObject jsonobject = new JSONObject();
            try
            {
                int i1;
                int j1;
                for (set = set.iterator(); set.hasNext(); jsonobject.put(Integer.toString(i1), j1))
                {
                    Object obj = (Pair)set.next();
                    i1 = ((Integer)((Pair) (obj)).first).intValue();
                    j1 = ((Integer)((Pair) (obj)).second).intValue();
                    obj = new JSONObject();
                    ((JSONObject) (obj)).put("$experiment_id", i1);
                    ((JSONObject) (obj)).put("$variant_id", j1);
                    a.a("$experiment_started", ((JSONObject) (obj)));
                }

            }
            // Misplaced declaration of an exception variable
            catch (Set set)
            {
                Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", set);
            }
            a.e().a("$experiments", jsonobject);
            a.a(new o(this, jsonobject) {

                final JSONObject a;
                final f b;

                public JSONObject a(JSONObject jsonobject)
                {
                    try
                    {
                        jsonobject.put("$experiments", a);
                    }
                    catch (JSONException jsonexception)
                    {
                        Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception);
                        return jsonobject;
                    }
                    return jsonobject;
                }

            
            {
                b = f1;
                a = jsonobject;
                super();
            }
            });
        }

        public f(h h1)
        {
            a = h1;
        }
    }

    private class g extends Handler
    {

        final j a;
        private EditorConnection b;
        private k c;
        private final Context d;
        private final String e;
        private final Lock f = new ReentrantLock();
        private final EditProtocol g;
        private final ImageStore h;
        private final Map i = new HashMap();
        private final List j = new ArrayList();
        private final List k = new ArrayList();
        private final List l = new ArrayList();
        private final List m = new ArrayList();
        private final Set n = new HashSet();

        private void a(l.e e1)
        {
            JsonWriter jsonwriter;
            if (b == null)
            {
                return;
            }
            jsonwriter = new JsonWriter(new OutputStreamWriter(b.b()));
            jsonwriter.beginObject();
            jsonwriter.name("type").value("layout_error");
            jsonwriter.name("exception_type").value(e1.a());
            jsonwriter.name("cid").value(e1.b());
            jsonwriter.endObject();
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (l.e e1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", e1);
            }
            return;
            e1;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", e1);
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (l.e e1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", e1);
            }
            return;
            e1;
            try
            {
                jsonwriter.close();
            }
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ioexception);
            }
            throw e1;
        }

        private void a(String s1)
        {
            if (b == null)
            {
                return;
            }
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("error_message", s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", s1);
            }
            s1 = new OutputStreamWriter(b.b());
            s1.write("{\"type\": \"error\", ");
            s1.write("\"payload\": ");
            s1.write(jsonobject.toString());
            s1.write("}");
            try
            {
                s1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s1);
            }
            return;
            Object obj;
            obj;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", ((Throwable) (obj)));
            try
            {
                s1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s1);
            }
            return;
            obj;
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s1);
            }
            throw obj;
        }

        private void a(JSONArray jsonarray)
        {
            android.content.SharedPreferences.Editor editor = h().edit();
            editor.putString("mixpanel.viewcrawler.changes", jsonarray.toString());
            editor.apply();
            c();
        }

        private void a(JSONObject jsonobject)
        {
            java.io.BufferedOutputStream bufferedoutputstream;
            long l1;
            l1 = System.currentTimeMillis();
            try
            {
                jsonobject = jsonobject.getJSONObject("payload");
                if (jsonobject.has("config"))
                {
                    c = g.b(jsonobject);
                    if (com.mixpanel.android.mpmetrics.g.b)
                    {
                        Log.v("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", jsonobject);
                a("Payload with snapshot config required with snapshot request");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", jsonobject);
                a(jsonobject.getMessage());
                return;
            }
            if (c == null)
            {
                a("No snapshot configuration (or a malformed snapshot configuration) was sent.");
                Log.w("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
                return;
            }
            bufferedoutputstream = b.b();
            jsonobject = new OutputStreamWriter(bufferedoutputstream);
            jsonobject.write("{");
            jsonobject.write("\"type\": \"snapshot_response\",");
            jsonobject.write("\"payload\": {");
            jsonobject.write("\"activities\":");
            jsonobject.flush();
            c.a(j.b(a), bufferedoutputstream);
            long l2 = System.currentTimeMillis();
            jsonobject.write(",\"snapshot_time_millis\": ");
            jsonobject.write(Long.toString(l2 - l1));
            jsonobject.write("}");
            jsonobject.write("}");
            try
            {
                jsonobject.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            return;
            Object obj;
            obj;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", ((Throwable) (obj)));
            try
            {
                jsonobject.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            return;
            obj;
            try
            {
                jsonobject.close();
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", jsonobject);
            }
            throw obj;
        }

        private void b()
        {
            Object obj;
            Object obj1;
            obj = h();
            obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            int j1;
            obj1 = new JSONArray(((String) (obj1)));
            j1 = ((JSONArray) (obj1)).length();
            int i1 = 0;
_L3:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj2 = ((JSONArray) (obj1)).getJSONObject(i1);
            int k1 = ((JSONObject) (obj2)).getInt("id");
            obj2 = new Pair(Integer.valueOf(((JSONObject) (obj2)).getInt("experiment")), Integer.valueOf(k1));
            n.add(obj2);
            i1++;
            if (true) goto _L3; else goto _L2
            JSONException jsonexception;
            jsonexception;
            Log.e("MixpanelAPI.ViewCrawler", "Malformed variants found in persistent storage, clearing all variants", jsonexception);
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
_L2:
        }

        private void b(String s1)
        {
            JsonWriter jsonwriter;
            if (b == null)
            {
                return;
            }
            jsonwriter = new JsonWriter(new OutputStreamWriter(b.b()));
            jsonwriter.beginObject();
            jsonwriter.name("type").value("track_message");
            jsonwriter.name("payload");
            jsonwriter.beginObject();
            jsonwriter.name("event_name").value(s1);
            jsonwriter.endObject();
            jsonwriter.endObject();
            jsonwriter.flush();
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s1);
            }
            return;
            s1;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", s1);
            try
            {
                jsonwriter.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s1);
            }
            return;
            s1;
            try
            {
                jsonwriter.close();
            }
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ioexception);
            }
            throw s1;
        }

        private void b(JSONArray jsonarray)
        {
            android.content.SharedPreferences.Editor editor = h().edit();
            editor.putString("mixpanel.viewcrawler.bindings", jsonarray.toString());
            editor.apply();
            c();
        }

        private void b(JSONObject jsonobject)
        {
            jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
            int i1 = 0;
_L2:
            if (i1 >= jsonobject.length())
            {
                break; /* Loop/switch isn't completed */
            }
            JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
            String s1 = com.mixpanel.android.util.d.a(jsonobject1, "target_activity");
            String s2 = jsonobject1.getString("name");
            i.put(s2, new Pair(s1, jsonobject1));
            i1++;
            if (true) goto _L2; else goto _L1
_L1:
            try
            {
                g();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad change request received", jsonobject);
            }
            return;
        }

        private void c()
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj = h();
            obj3 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
            obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.bindings", null);
            if (obj3 == null) goto _L2; else goto _L1
_L1:
            int l1;
            l.clear();
            obj3 = new JSONArray(((String) (obj3)));
            l1 = ((JSONArray) (obj3)).length();
            int i1 = 0;
_L12:
            if (i1 >= l1) goto _L2; else goto _L3
_L3:
            Object obj4;
            Pair pair;
            JSONArray jsonarray;
            obj4 = ((JSONArray) (obj3)).getJSONObject(i1);
            int j1 = ((JSONObject) (obj4)).getInt("id");
            pair = new Pair(Integer.valueOf(((JSONObject) (obj4)).getInt("experiment_id")), Integer.valueOf(j1));
            jsonarray = ((JSONObject) (obj4)).getJSONArray("actions");
            int k1 = 0;
_L5:
            if (k1 >= jsonarray.length())
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj6 = jsonarray.getJSONObject(k1);
            obj6 = new e(com.mixpanel.android.util.d.a(((JSONObject) (obj6)), "target_activity"), ((JSONObject) (obj6)), pair);
            l.add(obj6);
            k1++;
            if (true) goto _L5; else goto _L4
_L4:
            int i2;
            obj4 = ((JSONObject) (obj4)).getJSONArray("tweaks");
            i2 = ((JSONArray) (obj4)).length();
            k1 = 0;
_L7:
            if (k1 >= i2)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj5 = ((JSONArray) (obj4)).getJSONObject(k1);
            obj5 = g.c(((JSONObject) (obj5)));
            j.d(a).a((String)((Pair) (obj5)).first, ((Pair) (obj5)).second);
            k1++;
            if (true) goto _L7; else goto _L6
_L2:
            if (obj1 == null) goto _L9; else goto _L8
_L8:
            obj1 = new JSONArray(((String) (obj1)));
            m.clear();
            i1 = 0;
_L10:
            if (i1 >= ((JSONArray) (obj1)).length())
            {
                break; /* Loop/switch isn't completed */
            }
            JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(i1);
            String s1 = com.mixpanel.android.util.d.a(jsonobject, "target_activity");
            m.add(new Pair(s1, jsonobject));
            i1++;
            if (true) goto _L10; else goto _L9
            Object obj2;
            obj2;
            Log.i("MixpanelAPI.ViewCrawler", "JSON error when initializing saved changes, clearing persistent memory", ((Throwable) (obj2)));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
_L9:
            g();
            return;
            obj2;
            Log.i("MixpanelAPI.ViewCrawler", "Bad instructions in saved changes, clearing persistent memory", ((Throwable) (obj2)));
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
            ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
            ((android.content.SharedPreferences.Editor) (obj)).apply();
            if (true) goto _L9; else goto _L6
_L6:
            i1++;
            if (true) goto _L12; else goto _L11
_L11:
        }

        private void c(JSONObject jsonobject)
        {
            jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
            int i1 = 0;
_L2:
            if (i1 >= jsonobject.length())
            {
                break; /* Loop/switch isn't completed */
            }
            String s1 = jsonobject.getString(i1);
            i.remove(s1);
            i1++;
            if (true) goto _L2; else goto _L1
            jsonobject;
            Log.e("MixpanelAPI.ViewCrawler", "Bad clear request received", jsonobject);
_L1:
            g();
            return;
        }

        private void d()
        {
            if (com.mixpanel.android.mpmetrics.g.b)
            {
                Log.v("MixpanelAPI.ViewCrawler", "connecting to editor");
            }
            if (b != null && b.a())
            {
                if (com.mixpanel.android.mpmetrics.g.b)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
                }
            } else
            if (j.e(a) == null)
            {
                if (com.mixpanel.android.mpmetrics.g.b)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
                    return;
                }
            } else
            {
                String s1 = (new StringBuilder()).append(com.mixpanel.android.mpmetrics.g.a(d).q()).append(e).toString();
                try
                {
                    java.net.Socket socket = j.e(a).createSocket();
                    b = new EditorConnection(new URI(s1), a. new a(), socket);
                    return;
                }
                catch (URISyntaxException urisyntaxexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Error parsing URI ").append(s1).append(" for editor websocket").toString(), urisyntaxexception);
                    return;
                }
                catch (EditorConnection.EditorConnectionException editorconnectionexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Error connecting to URI ").append(s1).toString(), editorconnectionexception);
                    return;
                }
                catch (IOException ioexception)
                {
                    Log.i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", ioexception);
                }
                return;
            }
        }

        private void d(JSONObject jsonobject)
        {
            int j1;
            jsonobject = jsonobject.getJSONObject("payload").getJSONArray("tweaks");
            j1 = jsonobject.length();
            int i1 = 0;
_L2:
            if (i1 >= j1)
            {
                break; /* Loop/switch isn't completed */
            }
            Object obj = jsonobject.getJSONObject(i1);
            obj = g.c(((JSONObject) (obj)));
            j.d(a).a((String)((Pair) (obj)).first, ((Pair) (obj)).second);
            i1++;
            if (true) goto _L2; else goto _L1
            jsonobject;
            Log.e("MixpanelAPI.ViewCrawler", "Bad tweaks received", jsonobject);
_L1:
            return;
            jsonobject;
            Log.e("MixpanelAPI.ViewCrawler", "Strange tweaks received", jsonobject);
            return;
        }

        private void e()
        {
            Object obj;
            if (b == null)
            {
                return;
            }
            obj = new JsonWriter(new OutputStreamWriter(b.b()));
            ((JsonWriter) (obj)).beginObject();
            ((JsonWriter) (obj)).name("type").value("device_info_response");
            ((JsonWriter) (obj)).name("payload").beginObject();
            ((JsonWriter) (obj)).name("device_type").value("Android");
            ((JsonWriter) (obj)).name("device_name").value((new StringBuilder()).append(Build.BRAND).append("/").append(Build.MODEL).toString());
            ((JsonWriter) (obj)).name("scaled_density").value(j.f(a));
            java.util.Map.Entry entry;
            for (Iterator iterator = com.mixpanel.android.viewcrawler.j.g(a).entrySet().iterator(); iterator.hasNext(); ((JsonWriter) (obj)).name((String)entry.getKey()).value((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            break MISSING_BLOCK_LABEL_224;
            Object obj1;
            obj1;
            Log.e("MixpanelAPI.ViewCrawler", "Can't write device_info to server", ((Throwable) (obj1)));
            try
            {
                ((JsonWriter) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
            }
            return;
            Object obj2;
            obj2 = j.d(a).a();
            ((JsonWriter) (obj)).name("tweaks").beginArray();
            obj2 = ((Map) (obj2)).entrySet().iterator();
_L7:
            com.mixpanel.android.mpmetrics.t.b b1;
            if (!((Iterator) (obj2)).hasNext())
            {
                break MISSING_BLOCK_LABEL_595;
            }
            Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
            b1 = (com.mixpanel.android.mpmetrics.t.b)((java.util.Map.Entry) (obj3)).getValue();
            obj3 = (String)((java.util.Map.Entry) (obj3)).getKey();
            ((JsonWriter) (obj)).beginObject();
            ((JsonWriter) (obj)).name("name").value(((String) (obj3)));
            ((JsonWriter) (obj)).name("minimum").value((Number)null);
            ((JsonWriter) (obj)).name("maximum").value((Number)null);
            b1.a;
            JVM INSTR tableswitch 1 4: default 641
        //                       1 434
        //                       2 468
        //                       3 516
        //                       4 564;
               goto _L1 _L2 _L3 _L4 _L5
_L5:
            break MISSING_BLOCK_LABEL_564;
_L2:
            break; /* Loop/switch isn't completed */
_L1:
            Log.wtf("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Unrecognized Tweak Type ").append(b1.a).append(" encountered.").toString());
_L8:
            ((JsonWriter) (obj)).endObject();
            if (true) goto _L7; else goto _L6
            obj2;
            IOException ioexception;
            try
            {
                ((JsonWriter) (obj)).close();
            }
            catch (IOException ioexception1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ioexception1);
            }
            throw obj2;
_L6:
            ((JsonWriter) (obj)).name("type").value("boolean");
            ((JsonWriter) (obj)).name("value").value(b1.c().booleanValue());
              goto _L8
_L3:
            ((JsonWriter) (obj)).name("type").value("number");
            ((JsonWriter) (obj)).name("encoding").value("d");
            ((JsonWriter) (obj)).name("value").value(b1.b().doubleValue());
              goto _L8
_L4:
            ((JsonWriter) (obj)).name("type").value("number");
            ((JsonWriter) (obj)).name("encoding").value("l");
            ((JsonWriter) (obj)).name("value").value(b1.b().longValue());
              goto _L8
            ((JsonWriter) (obj)).name("type").value("string");
            ((JsonWriter) (obj)).name("value").value(b1.a());
              goto _L8
            ((JsonWriter) (obj)).endArray();
            ((JsonWriter) (obj)).endObject();
            ((JsonWriter) (obj)).endObject();
            try
            {
                ((JsonWriter) (obj)).close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ioexception);
            }
            return;
        }

        private void e(JSONObject jsonobject)
        {
            int i1;
            int j1;
            try
            {
                jsonobject = jsonobject.getJSONObject("payload").getJSONArray("events");
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad event bindings received", jsonobject);
                return;
            }
            j1 = jsonobject.length();
            k.clear();
            i1 = 0;
            while (i1 < j1) 
            {
                try
                {
                    JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
                    String s1 = com.mixpanel.android.util.d.a(jsonobject1, "target_activity");
                    k.add(new Pair(s1, jsonobject1));
                }
                catch (JSONException jsonexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Bad event binding received from editor in ").append(jsonobject.toString()).toString(), jsonexception);
                }
                i1++;
            }
            g();
        }

        private void f()
        {
            i.clear();
            k.clear();
            c = null;
            if (com.mixpanel.android.mpmetrics.g.b)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
            }
            g();
            String s1;
            for (Iterator iterator = j.iterator(); iterator.hasNext(); h.b(s1))
            {
                s1 = (String)iterator.next();
            }

        }

        private void g()
        {
            boolean flag = false;
            ArrayList arraylist = new ArrayList();
            HashSet hashset = new HashSet();
            int j1 = l.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                e e1 = (e)l.get(i1);
                try
                {
                    EditProtocol.a a1 = g.a(e1.b);
                    arraylist.add(new Pair(e1.a, a1.a));
                    if (!n.contains(e1.c))
                    {
                        hashset.add(e1.c);
                    }
                }
                catch (EditProtocol.CantGetEditAssetsException cantgeteditassetsexception)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", cantgeteditassetsexception);
                }
                catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception)
                {
                    Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception.getMessage());
                }
                catch (EditProtocol.BadInstructionsException badinstructionsexception)
                {
                    Log.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", badinstructionsexception);
                }
                i1++;
            }
            for (Iterator iterator = i.values().iterator(); iterator.hasNext();)
            {
                Pair pair2 = (Pair)iterator.next();
                try
                {
                    EditProtocol.a a2 = g.a((JSONObject)pair2.second);
                    arraylist.add(new Pair(pair2.first, a2.a));
                    j.addAll(a2.b);
                }
                catch (EditProtocol.CantGetEditAssetsException cantgeteditassetsexception1)
                {
                    Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", cantgeteditassetsexception1);
                }
                catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception3)
                {
                    Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception3.getMessage());
                }
                catch (EditProtocol.BadInstructionsException badinstructionsexception3)
                {
                    Log.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", badinstructionsexception3);
                }
            }

            j1 = m.size();
            i1 = 0;
            while (i1 < j1) 
            {
                Pair pair = (Pair)m.get(i1);
                try
                {
                    l l1 = g.a((JSONObject)pair.second, com.mixpanel.android.viewcrawler.j.h(a));
                    arraylist.add(new Pair(pair.first, l1));
                }
                catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception1)
                {
                    Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception1.getMessage());
                }
                catch (EditProtocol.BadInstructionsException badinstructionsexception1)
                {
                    Log.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", badinstructionsexception1);
                }
                i1++;
            }
            j1 = k.size();
            i1 = 0;
            while (i1 < j1) 
            {
                Pair pair1 = (Pair)k.get(i1);
                try
                {
                    l l2 = g.a((JSONObject)pair1.second, com.mixpanel.android.viewcrawler.j.h(a));
                    arraylist.add(new Pair(pair1.first, l2));
                }
                catch (EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception2)
                {
                    Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception2.getMessage());
                }
                catch (EditProtocol.BadInstructionsException badinstructionsexception2)
                {
                    Log.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", badinstructionsexception2);
                }
                i1++;
            }
            HashMap hashmap = new HashMap();
            j1 = arraylist.size();
            i1 = ((flag) ? 1 : 0);
            while (i1 < j1) 
            {
                Pair pair3 = (Pair)arraylist.get(i1);
                Object obj;
                if (hashmap.containsKey(pair3.first))
                {
                    obj = (List)hashmap.get(pair3.first);
                } else
                {
                    obj = new ArrayList();
                    hashmap.put(pair3.first, obj);
                }
                ((List) (obj)).add(pair3.second);
                i1++;
            }
            j.b(a).a(hashmap);
            n.addAll(hashset);
            j.i(a).a(hashset);
        }

        private SharedPreferences h()
        {
            String s1 = (new StringBuilder()).append("mixpanel.viewcrawler.changes").append(e).toString();
            return d.getSharedPreferences(s1, 0);
        }

        public void a()
        {
            f.unlock();
        }

        public void handleMessage(Message message)
        {
            f.lock();
            int i1 = message.what;
            i1;
            JVM INSTR tableswitch 0 12: default 80
        //                       0 90
        //                       1 113
        //                       2 127
        //                       3 183
        //                       4 120
        //                       5 197
        //                       6 211
        //                       7 141
        //                       8 253
        //                       9 169
        //                       10 225
        //                       11 239
        //                       12 155;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
            break; /* Loop/switch isn't completed */
_L10:
            break MISSING_BLOCK_LABEL_253;
_L15:
            f.unlock();
            return;
_L2:
            b();
            c();
              goto _L15
            message;
            f.unlock();
            throw message;
_L3:
            d();
              goto _L15
_L6:
            e();
              goto _L15
_L4:
            a((JSONObject)message.obj);
              goto _L15
_L9:
            b((String)message.obj);
              goto _L15
_L14:
            a((l.e)message.obj);
              goto _L15
_L11:
            a((JSONArray)message.obj);
              goto _L15
_L5:
            b((JSONObject)message.obj);
              goto _L15
_L7:
            b((JSONArray)message.obj);
              goto _L15
_L8:
            e((JSONObject)message.obj);
              goto _L15
_L12:
            c((JSONObject)message.obj);
              goto _L15
_L13:
            d((JSONObject)message.obj);
              goto _L15
            f();
              goto _L15
        }

        public g(Context context, String s1, Looper looper, l.i i1)
        {
            a = j.this;
            super(looper);
            d = context;
            e = s1;
            c = null;
            s1 = j.c(j.this).r();
            j1 = s1;
            if (s1 == null)
            {
                j1 = context.getPackageName();
            }
            j1 = new com.mixpanel.android.mpmetrics.m.b(j.this, context);
            h = new ImageStore(context);
            g = new EditProtocol(j.this, h, i1);
            f.lock();
        }
    }


    private static final String A = "MixpanelAPI.ViewCrawler";
    private static final String j = "mixpanel.viewcrawler.changes";
    private static final String k = "mixpanel.viewcrawler.changes";
    private static final String l = "mixpanel.viewcrawler.bindings";
    private static final int m = 0;
    private static final int n = 1;
    private static final int o = 2;
    private static final int p = 3;
    private static final int q = 4;
    private static final int r = 5;
    private static final int s = 6;
    private static final int t = 7;
    private static final int u = 8;
    private static final int v = 9;
    private static final int w = 10;
    private static final int x = 11;
    private static final int y = 12;
    private static final int z = 30000;
    private final com.mixpanel.android.mpmetrics.g a;
    private final com.mixpanel.android.viewcrawler.b b;
    private final SSLSocketFactory c;
    private final com.mixpanel.android.viewcrawler.c d = new com.mixpanel.android.viewcrawler.c();
    private final t e;
    private final Map f;
    private final g g;
    private final f h;
    private final float i;

    public j(Context context, String s1, h h1, t t1)
    {
        a = com.mixpanel.android.mpmetrics.g.a(context);
        e = t1;
        f = h1.g();
        i = Resources.getSystem().getDisplayMetrics().scaledDensity;
        ((Application)context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
        t1 = new HandlerThread(com/mixpanel/android/viewcrawler/j.getCanonicalName());
        t1.setPriority(10);
        t1.start();
        g = new g(context, s1, t1.getLooper(), this);
        b = new com.mixpanel.android.viewcrawler.b(h1, g);
        h = new f(h1);
        try
        {
            context = SSLContext.getInstance("TLS");
            context.init(null, null, null);
            context = context.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.i("MixpanelAPI.ViewCrawler", "System has no SSL support. Built-in events editor will not be available", context);
            context = null;
        }
        c = context;
        e.a(new com.mixpanel.android.mpmetrics.t.a() {

            final j a;

            public void a()
            {
                Message message = j.a(a).obtainMessage(4);
                j.a(a).sendMessage(message);
            }

            
            {
                a = j.this;
                super();
            }
        });
    }

    static g a(j j1)
    {
        return j1.g;
    }

    static com.mixpanel.android.viewcrawler.c b(j j1)
    {
        return j1.d;
    }

    static com.mixpanel.android.mpmetrics.g c(j j1)
    {
        return j1.a;
    }

    static t d(j j1)
    {
        return j1.e;
    }

    static SSLSocketFactory e(j j1)
    {
        return j1.c;
    }

    static float f(j j1)
    {
        return j1.i;
    }

    static Map g(j j1)
    {
        return j1.f;
    }

    static com.mixpanel.android.viewcrawler.b h(j j1)
    {
        return j1.b;
    }

    static f i(j j1)
    {
        return j1.h;
    }

    public void a()
    {
        g.a();
        g.sendMessage(g.obtainMessage(0));
    }

    public void a(l.e e1)
    {
        Message message = g.obtainMessage();
        message.what = 12;
        message.obj = e1;
        g.sendMessage(message);
    }

    public void a(String s1)
    {
        Message message = g.obtainMessage();
        message.what = 7;
        message.obj = s1;
        g.sendMessage(message);
    }

    public void a(JSONArray jsonarray)
    {
        Message message = g.obtainMessage(5);
        message.obj = jsonarray;
        g.sendMessage(message);
    }

    public t b()
    {
        return e;
    }

    public void b(JSONArray jsonarray)
    {
        Message message = g.obtainMessage(9);
        message.obj = jsonarray;
        g.sendMessage(message);
    }
}
