// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.os.ConditionVariable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            ek, bg, be, l, 
//            bw, ba, ag, ao, 
//            eu, ez, ec

public final class ar extends ek
    implements bg
{

    private long a;
    private volatile long b;
    private ConditionVariable c;
    private ConditionVariable d;
    private l e;
    private be f;
    private be g;
    private be h;
    private be i;
    private URL j;
    private Context k;
    private volatile boolean l;

    public ar(Context context, l l1, be be1, be be2, be be3, be be4, URL url)
    {
        a = System.currentTimeMillis();
        b = 10000L;
        c = new ConditionVariable(false);
        d = new ConditionVariable(false);
        l = false;
        k = context;
        f = be1;
        g = be2;
        h = be3;
        i = be4;
        e = l1;
        j = url;
        l1 = f;
        if (this != null)
        {
            synchronized (((be) (l1)).c)
            {
                ((be) (l1)).c.add(this);
            }
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
            jsonobject1.put("locale", (new bw()).a);
            jsonobject.put("appState", jsonobject1);
            jsonobject.put("transactions", jsonarray);
            if (b(jsonarray))
            {
                jsonobject.put("breadcrumbs", (new ba(g)).a);
                jsonobject.put("endpoints", (new ba(h)).a);
                jsonobject.put("systemBreadcrumbs", (new ba(i)).a);
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
        Object obj;
        boolean flag;
        flag = flag1;
        if (i1 >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        obj = jsonarray.optJSONArray(i1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ao ao1;
        obj = (new ag(((JSONArray) (obj)))).k();
        if (obj == ao.c || obj == ao.i)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ao1 = ao.h;
        if (obj == ao1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = true;
        return flag;
        Object obj1;
        obj1;
        eu.a(((Throwable) (obj1)));
_L2:
        i1++;
          goto _L1
        obj1;
        eu.a(((Throwable) (obj1)));
          goto _L2
    }

    public final void a()
    {
        do
        {
label0:
            {
                if (!l)
                {
                    c.block();
                    d.block();
                    if (!l)
                    {
                        break label0;
                    }
                }
                return;
            }
            long l1 = b - (System.currentTimeMillis() - a);
            be be1;
            JSONArray jsonarray;
            if (l1 > 0L)
            {
                try
                {
                    Thread.sleep(l1);
                }
                catch (InterruptedException interruptedexception) { }
            }
            a = System.currentTimeMillis();
            be1 = f.a(k);
            f.a(be1);
            jsonarray = (new ba(be1)).a;
            ez.a(be1.a);
            if (jsonarray.length() > 0 && a(jsonarray) != null)
            {
                JSONObject jsonobject = a(jsonarray);
                try
                {
                    HttpURLConnection httpurlconnection = (new ec(j)).a();
                    OutputStream outputstream = httpurlconnection.getOutputStream();
                    outputstream.write(jsonobject.toString().getBytes("UTF8"));
                    outputstream.close();
                    httpurlconnection.getResponseCode();
                    httpurlconnection.disconnect();
                }
                catch (IOException ioexception)
                {
                    (new StringBuilder("Request failed for ")).append(j);
                    eu.a();
                }
                catch (GeneralSecurityException generalsecurityexception)
                {
                    (new StringBuilder("Request failed for ")).append(j);
                    eu.a();
                    eu.a(generalsecurityexception);
                }
            }
        } while (true);
    }

    public final void a(int i1, TimeUnit timeunit)
    {
        b = timeunit.toMillis(i1);
    }

    public final void b()
    {
        c.open();
    }

    public final void c()
    {
        be be1 = f;
        d.open();
    }

    public final void d()
    {
        be be1 = f;
        d.close();
    }
}
