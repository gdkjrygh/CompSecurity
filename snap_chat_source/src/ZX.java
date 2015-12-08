// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ZX extends aba
    implements aaj
{

    volatile long a;
    ConditionVariable b;
    private long c;
    private ConditionVariable d;
    private ZL e;
    private aai f;
    private aai g;
    private aai h;
    private aai i;
    private String j;
    private Context k;
    private volatile boolean l;

    public ZX(Context context, ZL zl, aai aai1, aai aai2, aai aai3, aai aai4, String s)
    {
        c = System.currentTimeMillis();
        a = 10000L;
        b = new ConditionVariable(false);
        d = new ConditionVariable(false);
        l = false;
        k = context;
        f = aai1;
        g = aai2;
        h = aai3;
        i = aai4;
        e = zl;
        j = s;
        zl = f;
        synchronized (((aai) (zl)).c)
        {
            ((aai) (zl)).c.add(this);
        }
    }

    private JSONObject a(JSONArray jsonarray)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("appID", e.a());
            jsonobject1.put("deviceID", e.c());
            jsonobject1.put("crPlatform", "android");
            jsonobject1.put("crVersion", e.d());
            jsonobject1.put("deviceModel", e.j());
            jsonobject1.put("osName", "android");
            jsonobject1.put("osVersion", e.k());
            jsonobject1.put("carrier", e.f());
            jsonobject1.put("mobileCountryCode", e.g());
            jsonobject1.put("mobileNetworkCode", e.h());
            jsonobject1.put("appVersion", e.b());
            jsonobject1.put("locale", (new aan.l()).a);
            jsonobject.put("appState", jsonobject1);
            jsonobject.put("transactions", jsonarray);
            if (b(jsonarray))
            {
                jsonobject.put("breadcrumbs", (new aae(g)).a);
                jsonobject.put("endpoints", (new aae(h)).a);
                jsonobject.put("systemBreadcrumbs", (new aae(i)).a);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return null;
        }
        return jsonobject;
    }

    private static boolean b(JSONArray jsonarray)
    {
        int i1;
        boolean flag1;
        flag1 = false;
        i1 = 0;
_L1:
        JSONArray jsonarray1;
        boolean flag;
        flag = flag1;
        if (i1 >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_59;
        }
        jsonarray1 = jsonarray.optJSONArray(i1);
        if (jsonarray1 == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int j1 = (new ZV(jsonarray1)).b;
        if (j1 == 3 || j1 == 9 || j1 == 8)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = true;
        return flag;
        Object obj;
        obj;
        abk.a(((Throwable) (obj)));
_L2:
        i1++;
          goto _L1
        obj;
        abk.a(((Throwable) (obj)));
          goto _L2
    }

    public final void a()
    {
        do
        {
            do
            {
                b.block();
                d.block();
                long l1 = a - (System.currentTimeMillis() - c);
                Object obj;
                Object obj1;
                Object obj2;
                OutputStream outputstream;
                if (l1 > 0L)
                {
                    try
                    {
                        Thread.sleep(l1);
                    }
                    catch (InterruptedException interruptedexception) { }
                }
                c = System.currentTimeMillis();
                obj = f.a(k);
                f.a(((aai) (obj)));
                obj2 = (new aae(((aai) (obj)))).a;
                abn.a(((aai) (obj)).a);
            } while (((JSONArray) (obj2)).length() <= 0 || a(((JSONArray) (obj2))) == null);
            obj = a(((JSONArray) (obj2)));
            try
            {
                obj2 = (new aaU(new URL(j))).a();
                outputstream = ((HttpURLConnection) (obj2)).getOutputStream();
                outputstream.write(((JSONObject) (obj)).toString().getBytes("UTF8"));
                outputstream.close();
                ((HttpURLConnection) (obj2)).getResponseCode();
                ((HttpURLConnection) (obj2)).disconnect();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                (new StringBuilder("Request failed for ")).append(j);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                (new StringBuilder("Request failed for ")).append(j);
                abk.a(((Throwable) (obj1)));
            }
        } while (true);
    }

    public final void b()
    {
        d.open();
    }

    public final void c()
    {
        d.close();
    }
}
