// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            dd, dm, ea, ek, 
//            cf, dn, dj, cd, 
//            z, dh, eh, dg, 
//            db, ak

public final class df extends dd
{

    private static final Object a = new Object();
    private static df b;
    private final Context c;
    private final ak d;

    private df(Context context, ak ak)
    {
        c = context;
        d = ak;
    }

    public static cf a(Context context, String s, String s1)
    {
        HttpURLConnection httpurlconnection;
        dm dm1;
        Map map;
        int i;
        int j;
        long l;
        try
        {
            dm1 = new dm();
            s1 = new URL(s1);
            l = SystemClock.elapsedRealtime();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ek.d((new StringBuilder("Error while connecting to ad server: ")).append(context.getMessage()).toString());
            return new cf(2);
        }
        i = 0;
        httpurlconnection = (HttpURLConnection)s1.openConnection();
        ea.a(context, s, false, httpurlconnection);
        j = httpurlconnection.getResponseCode();
        map = httpurlconnection.getHeaderFields();
        if (j < 200 || j >= 300)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        context = s1.toString();
        s = ea.a(new InputStreamReader(httpurlconnection.getInputStream()));
        a(((String) (context)), map, s, j);
        dm1.a(context, map, s);
        context = dm1.a(l);
        httpurlconnection.disconnect();
        return context;
        a(s1.toString(), map, null, j);
        if (j < 300 || j >= 400)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        s1 = httpurlconnection.getHeaderField("Location");
        if (!TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_183;
        }
        ek.d("No location header to follow redirect.");
        context = new cf(0);
        httpurlconnection.disconnect();
        return context;
        s1 = new URL(s1);
        i++;
        if (i <= 5)
        {
            break MISSING_BLOCK_LABEL_259;
        }
        ek.d("Too many redirects.");
        context = new cf(0);
        httpurlconnection.disconnect();
        return context;
        ek.d((new StringBuilder("Received error HTTP response code: ")).append(j).toString());
        context = new cf(0);
        httpurlconnection.disconnect();
        return context;
        dm1.a(map);
        httpurlconnection.disconnect();
        break MISSING_BLOCK_LABEL_26;
        context;
        httpurlconnection.disconnect();
        throw context;
    }

    public static df a(Context context, ak ak)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new df(context.getApplicationContext(), ak);
            }
            context = b;
        }
        return context;
    }

    private static void a(String s, Map map, String s1, int i)
    {
        if (ek.a(2))
        {
            ek.c((new StringBuilder("Http Response: {\n  URL:\n    ")).append(s).append("\n  Headers:").toString());
            if (map != null)
            {
                for (s = map.keySet().iterator(); s.hasNext();)
                {
                    Object obj = (String)s.next();
                    ek.c((new StringBuilder("    ")).append(((String) (obj))).append(":").toString());
                    obj = ((List)map.get(obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        String s2 = (String)((Iterator) (obj)).next();
                        ek.c((new StringBuilder("      ")).append(s2).toString());
                    }
                }

            }
            ek.c("  Body:");
            if (s1 != null)
            {
                for (int j = 0; j < Math.min(s1.length(), 0x186a0); j += 1000)
                {
                    ek.c(s1.substring(j, Math.min(s1.length(), j + 1000)));
                }

            } else
            {
                ek.c("    null");
            }
            ek.c((new StringBuilder("  Response Code:\n    ")).append(i).append("\n}").toString());
        }
    }

    public final cf a(cd cd1)
    {
        Context context = c;
        Object obj = d;
        ek.a("Starting ad request from service.");
        Object obj1 = new dn(context);
        if (((dn) (obj1)).l == -1)
        {
            ek.a("Device is offline.");
            return new cf(2);
        }
        obj = new dj(cd1.g.packageName);
        if (cd1.d.d != null)
        {
            String s = cd1.d.d.getString("_ad");
            if (s != null)
            {
                return dh.a(context, cd1, s);
            }
        }
        obj1 = dh.a(cd1, ((dn) (obj1)));
        if (obj1 == null)
        {
            return new cf(0);
        }
        eh.a.post(new dg(context, cd1, ((dj) (obj)), ((String) (obj1))));
        obj1 = ((dj) (obj)).b();
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            return new cf(((dj) (obj)).a());
        } else
        {
            return a(context, cd1.l.c, ((String) (obj1)));
        }
    }

}
