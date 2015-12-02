// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.os.AsyncTask;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.facebook.ads.internal.util:
//            t, h, c

public class p extends AsyncTask
{

    private static final String a = com/facebook/ads/internal/util/p.getSimpleName();
    private Map b;

    public p()
    {
        b = null;
    }

    public p(Map map)
    {
        b = map;
    }

    private String a(String s, String s1, String s2)
    {
        if (t.a(s) || t.a(s1) || t.a(s2))
        {
            return s;
        }
        String s3;
        if (s.contains("?"))
        {
            s3 = "&";
        } else
        {
            s3 = "?";
        }
        return (new StringBuilder()).append(s).append(s3).append(s1).append("=").append(URLEncoder.encode(s2)).toString();
    }

    private boolean a(String s)
    {
        boolean flag = false;
        HttpClient httpclient = h.b();
        HttpGet httpget = new HttpGet(s);
        int i;
        try
        {
            i = httpclient.execute(httpget).getStatusLine().getStatusCode();
        }
        catch (Exception exception)
        {
            Log.e(a, (new StringBuilder()).append("Error opening url: ").append(s).toString(), exception);
            return false;
        }
        if (i == 200)
        {
            flag = true;
        }
        return flag;
    }

    private String b(String s)
    {
        String s1;
        try
        {
            s1 = a(s, "analog", h.a(c.a()));
        }
        catch (Exception exception)
        {
            return s;
        }
        return s1;
    }

    protected transient Void a(String as[])
    {
        as = as[0];
        if (!t.a(as) && !as.equals("#"))
        {
            as = b(as);
            Object obj = as;
            if (b != null)
            {
                obj = as;
                if (!b.isEmpty())
                {
                    for (obj = b.entrySet().iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                        as = a(((String) (as)), (String)entry.getKey(), (String)entry.getValue());
                    }

                    obj = as;
                }
            }
            int i = 1;
            while (i <= 2 && !a(((String) (obj)))) 
            {
                i++;
            }
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

}
