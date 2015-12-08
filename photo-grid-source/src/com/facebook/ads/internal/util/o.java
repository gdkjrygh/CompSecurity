// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.os.AsyncTask;
import android.util.Log;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.facebook.ads.internal.util:
//            s, g, a

public class o extends AsyncTask
{

    private static final String a = com/facebook/ads/internal/util/o.getSimpleName();
    private static final Set b;
    private Map c;
    private Map d;

    public o()
    {
        this(null, null);
    }

    public o(Map map)
    {
        this(map, null);
    }

    public o(Map map, Map map1)
    {
        c = map;
        d = map1;
    }

    private String a(String s1, String s2, String s3)
    {
        if (s.a(s1) || s.a(s2) || s.a(s3))
        {
            return s1;
        }
        String s4;
        if (s1.contains("?"))
        {
            s4 = "&";
        } else
        {
            s4 = "?";
        }
        return (new StringBuilder()).append(s1).append(s4).append(s2).append("=").append(URLEncoder.encode(s3)).toString();
    }

    private boolean a(String s1)
    {
        Object obj = g.b();
        HttpPost httppost;
        ArrayList arraylist;
        int i;
        if (d == null || d.size() == 0)
        {
            return ((HttpClient) (obj)).execute(new HttpGet(s1)).getStatusLine().getStatusCode() == 200;
        }
        try
        {
            httppost = new HttpPost(s1);
            arraylist = new ArrayList(1);
            java.util.Map.Entry entry;
            for (Iterator iterator = d.entrySet().iterator(); iterator.hasNext(); arraylist.add(new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(a, (new StringBuilder("Error opening url: ")).append(s1).toString(), ((Throwable) (obj)));
            return false;
        }
        httppost.setEntity(new UrlEncodedFormEntity(arraylist));
        i = ((HttpClient) (obj)).execute(httppost).getStatusLine().getStatusCode();
        return i == 200;
    }

    private String b(String s1)
    {
        String s2;
        try
        {
            s2 = a(s1, "analog", g.a(com.facebook.ads.internal.util.a.a()));
        }
        catch (Exception exception)
        {
            return s1;
        }
        return s2;
    }

    protected transient Void a(String as[])
    {
        as = as[0];
        if (!s.a(as) && !b.contains(as))
        {
            as = b(as);
            Object obj = as;
            if (c != null)
            {
                obj = as;
                if (!c.isEmpty())
                {
                    for (obj = c.entrySet().iterator(); ((Iterator) (obj)).hasNext();)
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

    static 
    {
        HashSet hashset = new HashSet();
        b = hashset;
        hashset.add("#");
        b.add("null");
    }
}
