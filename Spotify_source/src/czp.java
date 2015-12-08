// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.util.ImageStore;
import com.mixpanel.android.viewcrawler.EditProtocol;
import com.mixpanel.android.viewcrawler.EditorConnection;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class czp extends Handler
{

    final Lock a = new ReentrantLock();
    private EditorConnection b;
    private czq c;
    private final Context d;
    private final String e;
    private final EditProtocol f;
    private final ImageStore g;
    private final Map h = new HashMap();
    private final List i = new ArrayList();
    private final List j = new ArrayList();
    private final List k = new ArrayList();
    private final List l = new ArrayList();
    private final List m = new ArrayList();
    private final List n = new ArrayList();
    private final Set o = new HashSet();
    private czj p;

    public czp(czj czj1, Context context, String s, Looper looper, dag dag)
    {
        p = czj1;
        super(looper);
        d = context;
        e = s;
        c = null;
        s = czj.c(czj1).r;
        czj1 = s;
        if (s == null)
        {
            czj1 = context.getPackageName();
        }
        czj1 = new cxw(czj1);
        g = new ImageStore(context, "ViewCrawler");
        f = new EditProtocol(czj1, g, dag);
        a.lock();
    }

    private void a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        boolean flag;
        flag = false;
        obj = e();
        obj2 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.changes", null);
        obj1 = ((SharedPreferences) (obj)).getString("mixpanel.viewcrawler.bindings", null);
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        int l1;
        l.clear();
        m.clear();
        obj2 = new JSONArray(((String) (obj2)));
        l1 = ((JSONArray) (obj2)).length();
        int i1 = 0;
_L12:
        if (i1 >= l1) goto _L2; else goto _L3
_L3:
        Pair pair;
        Object obj3;
        JSONArray jsonarray;
        obj3 = ((JSONArray) (obj2)).getJSONObject(i1);
        int j1 = ((JSONObject) (obj3)).getInt("id");
        pair = new Pair(Integer.valueOf(((JSONObject) (obj3)).getInt("experiment_id")), Integer.valueOf(j1));
        jsonarray = ((JSONObject) (obj3)).getJSONArray("actions");
        int k1 = 0;
_L5:
        if (k1 >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = jsonarray.getJSONObject(k1);
        obj4 = new czn(cyn.a(((JSONObject) (obj4)), "target_activity"), ((JSONObject) (obj4)), pair);
        l.add(obj4);
        k1++;
        if (true) goto _L5; else goto _L4
_L4:
        int i2;
        obj3 = ((JSONObject) (obj3)).getJSONArray("tweaks");
        i2 = ((JSONArray) (obj3)).length();
        k1 = 0;
_L7:
        if (k1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        czo czo1 = new czo(((JSONArray) (obj3)).getJSONObject(k1), pair);
        m.add(czo1);
        k1++;
        if (true) goto _L7; else goto _L6
_L2:
        if (obj1 == null) goto _L9; else goto _L8
_L8:
        obj1 = new JSONArray(((String) (obj1)));
        n.clear();
        i1 = ((flag) ? 1 : 0);
_L10:
        if (i1 >= ((JSONArray) (obj1)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(i1);
        String s = cyn.a(jsonobject, "target_activity");
        n.add(new Pair(s, jsonobject));
        i1++;
        if (true) goto _L10; else goto _L9
        JSONException jsonexception;
        jsonexception;
        Log.i("MixpanelAPI.ViewCrawler", "JSON error when initializing saved changes, clearing persistent memory", jsonexception);
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.changes");
        ((android.content.SharedPreferences.Editor) (obj)).remove("mixpanel.viewcrawler.bindings");
        ((android.content.SharedPreferences.Editor) (obj)).apply();
_L9:
        d();
        return;
_L6:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void a(String s)
    {
        if (b == null)
        {
            return;
        }
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
        s = new OutputStreamWriter(b.a());
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

    private void a(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
        int i1 = 0;
_L2:
        if (i1 >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
        String s = cyn.a(jsonobject1, "target_activity");
        String s1 = jsonobject1.getString("name");
        h.put(s1, new Pair(s, jsonobject1));
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MixpanelAPI.ViewCrawler", "Bad change request received", jsonobject);
        }
        return;
    }

    private void b()
    {
        Object obj;
        if (b == null)
        {
            return;
        }
        obj = new JsonWriter(new OutputStreamWriter(b.a()));
        ((JsonWriter) (obj)).beginObject();
        ((JsonWriter) (obj)).name("type").value("device_info_response");
        ((JsonWriter) (obj)).name("payload").beginObject();
        ((JsonWriter) (obj)).name("device_type").value("Android");
        ((JsonWriter) (obj)).name("device_name").value((new StringBuilder()).append(Build.BRAND).append("/").append(Build.MODEL).toString());
        ((JsonWriter) (obj)).name("scaled_density").value(czj.d(p));
        java.util.Map.Entry entry;
        for (Iterator iterator = czj.e(p).entrySet().iterator(); iterator.hasNext(); ((JsonWriter) (obj)).name((String)entry.getKey()).value((String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_226;
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
        obj2 = czj.f(p).a();
        ((JsonWriter) (obj)).name("tweaks").beginArray();
        obj2 = ((Map) (obj2)).entrySet().iterator();
_L7:
        cyf cyf1;
        if (!((Iterator) (obj2)).hasNext())
        {
            break MISSING_BLOCK_LABEL_592;
        }
        Object obj3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
        cyf1 = (cyf)((java.util.Map.Entry) (obj3)).getValue();
        obj3 = (String)((java.util.Map.Entry) (obj3)).getKey();
        ((JsonWriter) (obj)).beginObject();
        ((JsonWriter) (obj)).name("name").value(((String) (obj3)));
        ((JsonWriter) (obj)).name("minimum").value(null);
        ((JsonWriter) (obj)).name("maximum").value(null);
        cyf1.a;
        JVM INSTR tableswitch 1 4: default 638
    //                   1 427
    //                   2 462
    //                   3 511
    //                   4 560;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_560;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        Log.wtf("MixpanelAPI.ViewCrawler", (new StringBuilder("Unrecognized Tweak Type ")).append(cyf1.a).append(" encountered.").toString());
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
        ((JsonWriter) (obj)).name("value").value(cyf1.c().booleanValue());
          goto _L8
_L3:
        ((JsonWriter) (obj)).name("type").value("number");
        ((JsonWriter) (obj)).name("encoding").value("d");
        ((JsonWriter) (obj)).name("value").value(cyf1.b().doubleValue());
          goto _L8
_L4:
        ((JsonWriter) (obj)).name("type").value("number");
        ((JsonWriter) (obj)).name("encoding").value("l");
        ((JsonWriter) (obj)).name("value").value(cyf1.b().longValue());
          goto _L8
        ((JsonWriter) (obj)).name("type").value("string");
        ((JsonWriter) (obj)).name("value").value(cyf1.a());
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

    private void b(JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONObject("payload").getJSONArray("actions");
        int i1 = 0;
_L2:
        if (i1 >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        String s = jsonobject.getString(i1);
        h.remove(s);
        i1++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        Log.e("MixpanelAPI.ViewCrawler", "Bad clear request received", jsonobject);
_L1:
        d();
        return;
    }

    private void c()
    {
        h.clear();
        k.clear();
        c = null;
        if (cxi.a)
        {
            Log.v("MixpanelAPI.ViewCrawler", "Editor closed- freeing snapshot");
        }
        d();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = g.b(((String) (obj)));
            if (obj != null)
            {
                ((File) (obj)).delete();
            }
        } while (true);
    }

    private void c(JSONObject jsonobject)
    {
        int j1;
        i.clear();
        jsonobject = jsonobject.getJSONObject("payload").getJSONArray("tweaks");
        j1 = jsonobject.length();
        int i1 = 0;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject(i1);
        i.add(jsonobject1);
        i1++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        Log.e("MixpanelAPI.ViewCrawler", "Bad tweaks received", jsonobject);
_L1:
        d();
        return;
    }

    private void d()
    {
        boolean flag = false;
        ArrayList arraylist = new ArrayList();
        Object obj3 = new HashSet();
        int l1 = l.size();
        int i1 = 0;
        while (i1 < l1) 
        {
            czn czn1 = (czn)l.get(i1);
            try
            {
                cyt cyt1 = f.a(czn1.b);
                arraylist.add(new Pair(czn1.a, cyt1.a));
                if (!o.contains(czn1.c))
                {
                    ((Set) (obj3)).add(czn1.c);
                }
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.CantGetEditAssetsException cantgeteditassetsexception)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", cantgeteditassetsexception);
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception.getMessage());
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad persistent change request cannot be applied.", badinstructionsexception);
            }
            i1++;
        }
        l1 = m.size();
        i1 = 0;
        while (i1 < l1) 
        {
            czo czo1 = (czo)m.get(i1);
            try
            {
                Pair pair2 = EditProtocol.c(czo1.a);
                czj.f(p).a((String)pair2.first, pair2.second);
                if (!o.contains(czo1.b))
                {
                    ((Set) (obj3)).add(czo1.b);
                }
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception1)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad editor tweak cannot be applied.", badinstructionsexception1);
            }
            i1++;
        }
        for (Iterator iterator = h.values().iterator(); iterator.hasNext();)
        {
            Pair pair3 = (Pair)iterator.next();
            try
            {
                cyt cyt2 = f.a((JSONObject)pair3.second);
                arraylist.add(new Pair(pair3.first, cyt2.a));
                j.addAll(cyt2.b);
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.CantGetEditAssetsException cantgeteditassetsexception1)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Can't load assets for an edit, won't apply the change now", cantgeteditassetsexception1);
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception3)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception3.getMessage());
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception5)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad editor change request cannot be applied.", badinstructionsexception5);
            }
        }

        l1 = i.size();
        i1 = 0;
        while (i1 < l1) 
        {
            Object obj = (JSONObject)i.get(i1);
            try
            {
                obj = EditProtocol.c(((JSONObject) (obj)));
                czj.f(p).a((String)((Pair) (obj)).first, ((Pair) (obj)).second);
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception2)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Strange tweaks received", badinstructionsexception2);
            }
            i1++;
        }
        l1 = n.size();
        i1 = 0;
        while (i1 < l1) 
        {
            Pair pair = (Pair)n.get(i1);
            try
            {
                czv czv = f.a((JSONObject)pair.second, czj.g(p));
                arraylist.add(new Pair(pair.first, czv));
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception1)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception1.getMessage());
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception3)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad persistent event binding cannot be applied.", badinstructionsexception3);
            }
            i1++;
        }
        l1 = k.size();
        i1 = 0;
        while (i1 < l1) 
        {
            Pair pair1 = (Pair)k.get(i1);
            try
            {
                czv czv1 = f.a((JSONObject)pair1.second, czj.g(p));
                arraylist.add(new Pair(pair1.first, czv1));
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.InapplicableInstructionsException inapplicableinstructionsexception2)
            {
                Log.i("MixpanelAPI.ViewCrawler", inapplicableinstructionsexception2.getMessage());
            }
            catch (com.mixpanel.android.viewcrawler.EditProtocol.BadInstructionsException badinstructionsexception4)
            {
                Log.e("MixpanelAPI.ViewCrawler", "Bad editor event binding cannot be applied.", badinstructionsexception4);
            }
            i1++;
        }
        HashMap hashmap = new HashMap();
        l1 = arraylist.size();
        i1 = ((flag) ? 1 : 0);
        while (i1 < l1) 
        {
            Pair pair4 = (Pair)arraylist.get(i1);
            Object obj1;
            if (hashmap.containsKey(pair4.first))
            {
                obj1 = (List)hashmap.get(pair4.first);
            } else
            {
                obj1 = new ArrayList();
                hashmap.put(pair4.first, obj1);
            }
            ((List) (obj1)).add(pair4.second);
            i1++;
        }
        czj.b(p).a(hashmap);
        o.addAll(((Collection) (obj3)));
        if (((Set) (obj3)).size() > 0)
        {
            Object obj2 = new JSONObject();
            try
            {
                int j1;
                int k1;
                for (obj3 = ((Set) (obj3)).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONObject) (obj2)).put(Integer.toString(j1), k1))
                {
                    Object obj4 = (Pair)((Iterator) (obj3)).next();
                    j1 = ((Integer)((Pair) (obj4)).first).intValue();
                    k1 = ((Integer)((Pair) (obj4)).second).intValue();
                    obj4 = new JSONObject();
                    ((JSONObject) (obj4)).put("$experiment_id", j1);
                    ((JSONObject) (obj4)).put("$variant_id", k1);
                    czj.h(p).a("$experiment_started", ((JSONObject) (obj4)));
                }

            }
            catch (JSONException jsonexception)
            {
                Log.wtf("MixpanelAPI.ViewCrawler", "Could not build JSON for reporting experiment start", jsonexception);
            }
            czj.h(p).b.a("$experiments", ((JSONObject) (obj2)));
            jsonexception = czj.h(p);
            obj2 = new cya(((JSONObject) (obj2))) {

                private JSONObject a;

                public final JSONObject a(JSONObject jsonobject)
                {
                    try
                    {
                        jsonobject.put("$experiments", a);
                    }
                    catch (JSONException jsonexception1)
                    {
                        Log.wtf("MixpanelAPI.ViewCrawler", "Can't write $experiments super property", jsonexception1);
                        return jsonobject;
                    }
                    return jsonobject;
                }

            
            {
                a = jsonobject;
                super();
            }
            };
            ((cxk) (jsonexception)).c.a(((cya) (obj2)));
        }
    }

    private void d(JSONObject jsonobject)
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
                String s = cyn.a(jsonobject1, "target_activity");
                k.add(new Pair(s, jsonobject1));
            }
            catch (JSONException jsonexception)
            {
                Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Bad event binding received from editor in ")).append(jsonobject.toString()).toString(), jsonexception);
            }
            i1++;
        }
        d();
    }

    private SharedPreferences e()
    {
        String s = (new StringBuilder("mixpanel.viewcrawler.changes")).append(e).toString();
        return d.getSharedPreferences(s, 0);
    }

    public final void handleMessage(Message message)
    {
        int i1;
        int j1;
        j1 = 0;
        i1 = 0;
        a.lock();
        int k1 = message.what;
        k1;
        JVM INSTR tableswitch 0 12: default 88
    //                   0 98
    //                   1 257
    //                   2 545
    //                   3 1226
    //                   4 538
    //                   5 1240
    //                   6 1284
    //                   7 848
    //                   8 1326
    //                   9 1182
    //                   10 1298
    //                   11 1312
    //                   12 1017;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        break; /* Loop/switch isn't completed */
_L10:
        break MISSING_BLOCK_LABEL_1326;
_L18:
        a.unlock();
        return;
_L2:
        Object obj;
        message = e();
        obj = message.getString("mixpanel.viewcrawler.changes", null);
        if (obj == null) goto _L16; else goto _L15
_L15:
        obj = new JSONArray(((String) (obj)));
        j1 = ((JSONArray) (obj)).length();
_L17:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj2 = ((JSONArray) (obj)).getJSONObject(i1);
        int l1 = ((JSONObject) (obj2)).getInt("id");
        obj2 = new Pair(Integer.valueOf(((JSONObject) (obj2)).getInt("experiment_id")), Integer.valueOf(l1));
        o.add(obj2);
        i1++;
        if (true) goto _L17; else goto _L16
        Object obj1;
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", "Malformed variants found in persistent storage, clearing all variants", ((Throwable) (obj1)));
        message = message.edit();
        message.remove("mixpanel.viewcrawler.changes");
        message.remove("mixpanel.viewcrawler.bindings");
        message.apply();
_L16:
        a();
          goto _L18
        message;
        a.unlock();
        throw message;
_L3:
        if (cxi.a)
        {
            Log.v("MixpanelAPI.ViewCrawler", "connecting to editor");
        }
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        message = b;
        i1 = j1;
        if (((EditorConnection) (message)).a.f())
        {
            break MISSING_BLOCK_LABEL_335;
        }
        i1 = j1;
        if (((cwb) (((EditorConnection) (message)).a)).a.d())
        {
            break MISSING_BLOCK_LABEL_335;
        }
        i1 = j1;
        if (!((cwb) (((EditorConnection) (message)).a)).a.c)
        {
            i1 = 1;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        if (!cxi.a) goto _L18; else goto _L19
_L19:
        Log.v("MixpanelAPI.ViewCrawler", "There is already a valid connection to an events editor.");
          goto _L18
        obj1 = czj.c(p).a();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_391;
        }
        if (!cxi.a) goto _L18; else goto _L20
_L20:
        Log.v("MixpanelAPI.ViewCrawler", "SSL is not available on this device, no connection will be attempted to the events editor.");
          goto _L18
        message = (new StringBuilder()).append(cxi.a(d).q).append(e).toString();
        obj1 = ((SSLSocketFactory) (obj1)).createSocket();
        b = new EditorConnection(new URI(message), new czk(p, (byte)0), ((java.net.Socket) (obj1)));
          goto _L18
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Error parsing URI ")).append(message).append(" for editor websocket").toString(), ((Throwable) (obj1)));
          goto _L18
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", (new StringBuilder("Error connecting to URI ")).append(message).toString(), ((Throwable) (obj1)));
          goto _L18
        message;
        Log.i("MixpanelAPI.ViewCrawler", "Can't create SSL Socket to connect to editor service", message);
          goto _L18
_L6:
        b();
          goto _L18
_L4:
        long l2;
        message = (JSONObject)message.obj;
        l2 = System.currentTimeMillis();
        message = message.getJSONObject("payload");
        if (message.has("config"))
        {
            c = f.b(message);
            if (cxi.a)
            {
                Log.v("MixpanelAPI.ViewCrawler", "Initializing snapshot with configuration");
            }
        }
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_672;
        }
        a("No snapshot configuration (or a malformed snapshot configuration) was sent.");
        Log.w("MixpanelAPI.ViewCrawler", "Mixpanel editor is misconfigured, sent a snapshot request without a valid configuration.");
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Payload with snapshot config required with snapshot request", message);
        a("Payload with snapshot config required with snapshot request");
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Editor sent malformed message with snapshot request", message);
        a(message.getMessage());
          goto _L18
        obj1 = b.a();
        message = new OutputStreamWriter(((java.io.OutputStream) (obj1)));
        message.write("{");
        message.write("\"type\": \"snapshot_response\",");
        message.write("\"payload\": {");
        message.write("\"activities\":");
        message.flush();
        c.a(czj.b(p), ((java.io.OutputStream) (obj1)));
        long l3 = System.currentTimeMillis();
        message.write(",\"snapshot_time_millis\": ");
        message.write(Long.toString(l3 - l2));
        message.write("}");
        message.write("}");
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write snapshot request to server", ((Throwable) (obj1)));
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        message.close();
_L21:
        throw obj1;
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L21
_L9:
        obj1 = (String)message.obj;
        if (b == null) goto _L18; else goto _L22
_L22:
        message = new JsonWriter(new OutputStreamWriter(b.a()));
        message.beginObject();
        message.name("type").value("track_message");
        message.name("payload");
        message.beginObject();
        message.name("event_name").value(((String) (obj1)));
        message.endObject();
        message.endObject();
        message.flush();
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", ((Throwable) (obj1)));
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        message.close();
_L23:
        throw obj1;
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L23
_L14:
        obj1 = (dac)message.obj;
        if (b == null) goto _L18; else goto _L24
_L24:
        message = new JsonWriter(new OutputStreamWriter(b.a()));
        message.beginObject();
        message.name("type").value("layout_error");
        message.name("exception_type").value(((dac) (obj1)).a);
        message.name("cid").value(((dac) (obj1)).b);
        message.endObject();
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        Log.e("MixpanelAPI.ViewCrawler", "Can't write track_message to server", ((Throwable) (obj1)));
        message.close();
          goto _L18
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L18
        obj1;
        message.close();
_L25:
        throw obj1;
        message;
        Log.e("MixpanelAPI.ViewCrawler", "Can't close writer.", message);
          goto _L25
_L11:
        message = (JSONArray)message.obj;
        android.content.SharedPreferences.Editor editor = e().edit();
        editor.putString("mixpanel.viewcrawler.changes", message.toString());
        editor.apply();
        a();
          goto _L18
_L5:
        a((JSONObject)message.obj);
          goto _L18
_L7:
        message = (JSONArray)message.obj;
        android.content.SharedPreferences.Editor editor1 = e().edit();
        editor1.putString("mixpanel.viewcrawler.bindings", message.toString());
        editor1.apply();
        a();
          goto _L18
_L8:
        d((JSONObject)message.obj);
          goto _L18
_L12:
        b((JSONObject)message.obj);
          goto _L18
_L13:
        c((JSONObject)message.obj);
          goto _L18
        c();
          goto _L18
    }
}
