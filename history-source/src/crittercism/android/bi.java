// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.os.ConditionVariable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            di, bs, br, au, 
//            bn, bg, dx, dc

public final class bi extends di
    implements bs
{

    private long a;
    private volatile long b;
    private ConditionVariable c;
    private ConditionVariable d;
    private au e;
    private br f;
    private br g;
    private br h;
    private br i;
    private String j;
    private Context k;
    private volatile boolean l;

    public bi(Context context, au au1, br br1, br br2, br br3, br br4, String s)
    {
        a = System.currentTimeMillis();
        b = 10000L;
        c = new ConditionVariable(false);
        d = new ConditionVariable(false);
        l = false;
        k = context;
        f = br1;
        g = br2;
        h = br3;
        i = br4;
        e = au1;
        j = s;
        f.a(this);
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
            jsonobject1.put("locale", (new bw.k()).a);
            jsonobject.put("appState", jsonobject1);
            jsonobject.put("transactions", jsonarray);
            if (b(jsonarray))
            {
                jsonobject.put("breadcrumbs", (new bn(g)).a);
                jsonobject.put("endpoints", (new bn(h)).a);
                jsonobject.put("systemBreadcrumbs", (new bn(i)).a);
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
        bg.a a1;
        obj = (new bg(((JSONArray) (obj)))).k();
        if (obj == bg.a.c || obj == bg.a.i)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        a1 = bg.a.h;
        if (obj == a1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = true;
        return flag;
        Object obj1;
        obj1;
        dx.a(((Throwable) (obj1)));
_L2:
        i1++;
          goto _L1
        obj1;
        dx.a(((Throwable) (obj1)));
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
            br br1;
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
            br1 = f.a(k);
            f.b(br1);
            jsonarray = (new bn(br1)).a;
            br.a(br1);
            if (jsonarray.length() > 0 && a(jsonarray) != null)
            {
                JSONObject jsonobject = a(jsonarray);
                try
                {
                    HttpURLConnection httpurlconnection = (new dc(new URL(j))).a();
                    OutputStream outputstream = httpurlconnection.getOutputStream();
                    outputstream.write(jsonobject.toString().getBytes("UTF8"));
                    outputstream.close();
                    httpurlconnection.getResponseCode();
                    httpurlconnection.disconnect();
                }
                catch (IOException ioexception)
                {
                    dx.c();
                }
                catch (GeneralSecurityException generalsecurityexception)
                {
                    dx.a(generalsecurityexception);
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
        br br1 = f;
        d.open();
    }

    public final void d()
    {
        br br1 = f;
        d.close();
    }
}
