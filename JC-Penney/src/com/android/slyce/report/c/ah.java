// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.android.slyce.report.b.c;
import com.android.slyce.report.mpmetrics.ab;
import com.android.slyce.report.mpmetrics.bl;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce.report.c:
//            ac, m, h, g, 
//            ai, q, ae, i, 
//            j

class ah extends Handler
{

    final ac a;
    private m b;
    private ai c;
    private final Context d;
    private final String e;

    public ah(ac ac1, Context context, String s, Looper looper)
    {
        a = ac1;
        super(looper);
        d = context;
        e = s;
        c = null;
    }

    private void a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        obj = f();
        obj2 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
        obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.bindings", null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        JSONArray jsonarray = new JSONArray(((String) (obj2)));
        obj2 = ac.d(a);
        obj2;
        JVM INSTR monitorenter ;
        ac.d(a).clear();
        int k = 0;
_L4:
        if (k >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1 = jsonarray.getJSONObject(k);
        String s = com.android.slyce.report.b.c.a(jsonobject1, "target");
        jsonobject1 = jsonobject1.getJSONObject("change");
        ac.d(a).add(new Pair(s, jsonobject1));
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        JVM INSTR monitorexit ;
_L2:
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        obj2 = new JSONArray(((String) (obj1)));
        obj1 = ac.e(a);
        obj1;
        JVM INSTR monitorenter ;
        ac.e(a).clear();
        k = ((flag) ? 1 : 0);
_L8:
        if (k >= ((JSONArray) (obj2)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = ((JSONArray) (obj2)).getJSONObject(k);
        String s1 = com.android.slyce.report.b.c.a(jsonobject, "target_activity");
        ac.e(a).add(new Pair(s1, jsonobject));
        k++;
        if (true) goto _L8; else goto _L7
        obj1;
        obj2;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            Log.i("MixpanelAPI.ViewCrawler", "JSON error when initializing saved changes, clearing persistent memory", ((Throwable) (obj1)));
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
        ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
        ((android.content.SharedPreferences.Editor) (obj)).apply();
_L6:
        e();
        return;
_L7:
        obj1;
        JVM INSTR monitorexit ;
        if (true) goto _L6; else goto _L9
_L9:
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("error_message", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Apparently impossible JSONException", s);
        }
        s = new OutputStreamWriter(b.b());
        s.write("{\"type\": \"error\", ");
        s.write("\"payload\": ");
        s.write(jsonobject.toString());
        s.write("}");
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
        }
        return;
        Object obj;
        obj;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write error message to editor", ((Throwable) (obj)));
        try
        {
            s.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
        }
        return;
        obj;
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Could not close output writer to editor", s);
        }
        throw obj;
    }

    private void a(JSONArray jsonarray)
    {
        android.content.SharedPreferences.Editor editor = f().edit();
        editor.putString("mixpanel.viewcrawler.bindings", jsonarray.toString());
        editor.apply();
        a();
    }

    private void a(JSONObject jsonobject)
    {
        java.io.BufferedOutputStream bufferedoutputstream;
        long l;
        l = System.currentTimeMillis();
        try
        {
            jsonobject = jsonobject.getJSONObject("payload");
            if (jsonobject.has("config"))
            {
                c = ac.i(a).b(jsonobject);
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
        c.a(ac.b(a), bufferedoutputstream);
        long l1 = System.currentTimeMillis();
        jsonobject.write(",\"snapshot_time_millis\": ");
        jsonobject.write(Long.toString(l1 - l));
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
        if (ab.a)
        {
            Log.v("MixpanelAPI.ViewCrawler", "connecting to editor");
        }
        if (b != null && b.a())
        {
            if (ab.a)
            {
                Log.v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
            }
        } else
        if (ac.f(a) == null)
        {
            if (ab.a)
            {
                Log.v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
                return;
            }
        } else
        {
            String s = (new StringBuilder()).append(ab.a(d).p()).append(e).toString();
            try
            {
                java.net.Socket socket = ac.f(a).createSocket();
                b = new m(new URI(s), new ae(a, null), socket);
                return;
            }
            catch (URISyntaxException urisyntaxexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Error parsing URI ").append(s).append(" for editor websocket").toString(), urisyntaxexception);
                return;
            }
            catch (q q1)
            {
                Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Error connecting to URI ").append(s).toString(), q1);
                return;
            }
            catch (IOException ioexception)
            {
                Log.i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", ioexception);
            }
            return;
        }
    }

    private void b(String s)
    {
        JsonWriter jsonwriter;
        if (b == null || !b.a())
        {
            return;
        }
        jsonwriter = new JsonWriter(new OutputStreamWriter(b.b()));
        jsonwriter.beginObject();
        jsonwriter.name("type").value("track_message");
        jsonwriter.name("payload");
        jsonwriter.beginObject();
        jsonwriter.name("event_name").value(s);
        jsonwriter.endObject();
        jsonwriter.endObject();
        jsonwriter.flush();
        try
        {
            jsonwriter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s);
        }
        return;
        s;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", s);
        try
        {
            jsonwriter.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", s);
        }
        return;
        s;
        try
        {
            jsonwriter.close();
        }
        catch (IOException ioexception)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", ioexception);
        }
        throw s;
    }

    private void b(JSONObject jsonobject)
    {
        String s;
        JSONObject jsonobject1;
        s = com.android.slyce.report.b.c.a(jsonobject, "target");
        jsonobject1 = jsonobject.getJSONObject("change");
        synchronized (ac.j(a))
        {
            ac.j(a).add(new Pair(s, jsonobject1));
        }
        try
        {
            e();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Bad change request received", jsonobject);
        }
        break MISSING_BLOCK_LABEL_69;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void c()
    {
        Object obj = new OutputStreamWriter(b.b());
        ((OutputStreamWriter) (obj)).write("{\"type\": \"device_info_response\",");
        ((OutputStreamWriter) (obj)).write("\"payload\": {");
        ((OutputStreamWriter) (obj)).write("\"device_type\": \"Android\",");
        ((OutputStreamWriter) (obj)).write("\"device_name\":");
        ((OutputStreamWriter) (obj)).write(JSONObject.quote((new StringBuilder()).append(Build.BRAND).append("/").append(Build.MODEL).toString()));
        ((OutputStreamWriter) (obj)).write(",");
        ((OutputStreamWriter) (obj)).write("\"tweaks\":");
        ((OutputStreamWriter) (obj)).write((new JSONObject(ac.g(a).a())).toString());
        java.util.Map.Entry entry;
        for (Iterator iterator = ac.h(a).entrySet().iterator(); iterator.hasNext(); ((OutputStreamWriter) (obj)).write(JSONObject.quote((String)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            ((OutputStreamWriter) (obj)).write(",");
            ((OutputStreamWriter) (obj)).write(JSONObject.quote((String)entry.getKey()));
            ((OutputStreamWriter) (obj)).write(":");
        }

        break MISSING_BLOCK_LABEL_217;
        Object obj1;
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write device_info to server", ((Throwable) (obj1)));
        try
        {
            ((OutputStreamWriter) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_257;
        ((OutputStreamWriter) (obj)).write("}");
        ((OutputStreamWriter) (obj)).write("}");
        try
        {
            ((OutputStreamWriter) (obj)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ((Throwable) (obj)));
        }
        return;
        return;
        obj1;
        try
        {
            ((OutputStreamWriter) (obj)).close();
        }
        catch (IOException ioexception)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Can't close websocket writer", ioexception);
        }
        throw obj1;
    }

    private void c(JSONObject jsonobject)
    {
        JSONArray jsonarray;
        JSONObject jsonobject1;
        String s;
        int k;
        int l;
        try
        {
            jsonarray = jsonobject.getJSONObject("payload").getJSONArray("events");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Bad event bindings received", jsonobject);
            return;
        }
        l = jsonarray.length();
        jsonobject = ac.k(a);
        jsonobject;
        JVM INSTR monitorenter ;
        ac.k(a).clear();
        k = 0;
_L2:
        if (k >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = jsonarray.getJSONObject(k);
        s = com.android.slyce.report.b.c.a(jsonobject1, "target_activity");
        ac.k(a).add(new Pair(s, jsonobject1));
_L3:
        k++;
        if (true) goto _L2; else goto _L1
        JSONException jsonexception;
        jsonexception;
        Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder()).append("Bad event binding received from editor in ").append(jsonarray.toString()).toString(), jsonexception);
          goto _L3
        Exception exception;
        exception;
        jsonobject;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        jsonobject;
        JVM INSTR monitorexit ;
        e();
        return;
    }

    private void d()
    {
        synchronized (ac.j(a))
        {
            ac.j(a).clear();
        }
        synchronized (ac.k(a))
        {
            ac.k(a).clear();
        }
        c = null;
        e();
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        list;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void e()
    {
        Object obj1;
        boolean flag;
        flag = false;
        obj1 = new ArrayList();
        List list = ac.d(a);
        list;
        JVM INSTR monitorenter ;
        int i1 = ac.d(a).size();
        int k = 0;
_L2:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        Pair pair = (Pair)ac.d(a).get(k);
        an an = ac.i(a).a((JSONObject)pair.second);
        ((List) (obj1)).add(new Pair(pair.first, an));
_L3:
        k++;
        if (true) goto _L2; else goto _L1
        Object obj2;
        obj2;
        Log.i("MixpanelAPI.ViewCrawler", ((i) (obj2)).getMessage());
          goto _L3
        obj1;
        list;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        Log.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", ((Throwable) (obj2)));
          goto _L3
_L1:
        list;
        JVM INSTR monitorexit ;
        list = ac.j(a);
        list;
        JVM INSTR monitorenter ;
        i1 = ac.j(a).size();
        k = 0;
_L5:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Pair)ac.j(a).get(k);
        an an1 = ac.i(a).a((JSONObject)((Pair) (obj2)).second);
        ((List) (obj1)).add(new Pair(((Pair) (obj2)).first, an1));
_L6:
        k++;
        if (true) goto _L5; else goto _L4
        obj2;
        Log.i("MixpanelAPI.ViewCrawler", ((i) (obj2)).getMessage());
          goto _L6
        obj1;
        list;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        Log.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", ((Throwable) (obj2)));
          goto _L6
_L4:
        list;
        JVM INSTR monitorexit ;
        list = ac.e(a);
        list;
        JVM INSTR monitorenter ;
        i1 = ac.e(a).size();
        k = 0;
_L8:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Pair)ac.e(a).get(k);
        an an2 = ac.i(a).a((JSONObject)((Pair) (obj2)).second, ac.l(a));
        ((List) (obj1)).add(new Pair(((Pair) (obj2)).first, an2));
_L9:
        k++;
        if (true) goto _L8; else goto _L7
        obj2;
        Log.i("MixpanelAPI.ViewCrawler", ((i) (obj2)).getMessage());
          goto _L9
        obj1;
        list;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        Log.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", ((Throwable) (obj2)));
          goto _L9
_L7:
        list;
        JVM INSTR monitorexit ;
        list = ac.k(a);
        list;
        JVM INSTR monitorenter ;
        i1 = ac.k(a).size();
        k = 0;
_L11:
        if (k >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (Pair)ac.k(a).get(k);
        an an3 = ac.i(a).a((JSONObject)((Pair) (obj2)).second, ac.l(a));
        ((List) (obj1)).add(new Pair(((Pair) (obj2)).first, an3));
_L12:
        k++;
        if (true) goto _L11; else goto _L10
        obj2;
        Log.i("MixpanelAPI.ViewCrawler", ((i) (obj2)).getMessage());
          goto _L12
        obj1;
        list;
        JVM INSTR monitorexit ;
        throw obj1;
        obj2;
        Log.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", ((Throwable) (obj2)));
          goto _L12
_L10:
        list;
        JVM INSTR monitorexit ;
        HashMap hashmap = new HashMap();
        int j1 = ((List) (obj1)).size();
        int l = ((flag) ? 1 : 0);
        while (l < j1) 
        {
            Pair pair1 = (Pair)((List) (obj1)).get(l);
            Object obj;
            if (hashmap.containsKey(pair1.first))
            {
                obj = (List)hashmap.get(pair1.first);
            } else
            {
                obj = new ArrayList();
                hashmap.put(pair1.first, obj);
            }
            ((List) (obj)).add(pair1.second);
            l++;
        }
        ac.b(a).a(hashmap);
        return;
    }

    private SharedPreferences f()
    {
        String s = (new StringBuilder()).append("mixpanel.viewcrawler.changes").append(e).toString();
        return d.getSharedPreferences(s, 0);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        case 5: // '\005'
        case 7: // '\007'
        default:
            return;

        case 0: // '\0'
            a();
            return;

        case 1: // '\001'
            b();
            return;

        case 4: // '\004'
            c();
            return;

        case 2: // '\002'
            a((JSONObject)message.obj);
            return;

        case 9: // '\t'
            b((String)message.obj);
            return;

        case 3: // '\003'
            b((JSONObject)message.obj);
            return;

        case 6: // '\006'
            a((JSONArray)message.obj);
            return;

        case 8: // '\b'
            c((JSONObject)message.obj);
            return;

        case 10: // '\n'
            d();
            break;
        }
    }
}
