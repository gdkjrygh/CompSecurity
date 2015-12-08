// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.b;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            cf, gm, gl, hi

public final class cg
    implements cf
{
    static final class a
    {

        private final String a;
        private final String b;

        public final String a()
        {
            return a;
        }

        public final String b()
        {
            return b;
        }

        public a(String s, String s1)
        {
            a = s;
            b = s1;
        }
    }

    static final class b
    {

        private final String a;
        private final URL b;
        private final ArrayList c;
        private final String d;

        public final String a()
        {
            return a;
        }

        public final URL b()
        {
            return b;
        }

        public final ArrayList c()
        {
            return c;
        }

        public final String d()
        {
            return d;
        }

        public b(String s, URL url, ArrayList arraylist, String s1)
        {
            a = s;
            b = url;
            c = arraylist;
            d = s1;
        }
    }

    final class c
    {

        final cg a;
        private final d b;
        private final boolean c;
        private final String d;

        public final String a()
        {
            return d;
        }

        public final d b()
        {
            return b;
        }

        public final boolean c()
        {
            return c;
        }

        public c(boolean flag, d d1, String s)
        {
            a = cg.this;
            super();
            c = flag;
            b = d1;
            d = s;
        }
    }

    static final class d
    {

        private final String a;
        private final int b;
        private final List c;
        private final String d;

        public final String a()
        {
            return a;
        }

        public final int b()
        {
            return b;
        }

        public final Iterable c()
        {
            return c;
        }

        public final String d()
        {
            return d;
        }

        public d(String s, int i, List list, String s1)
        {
            a = s;
            b = i;
            c = list;
            d = s1;
        }
    }


    private final Context a;
    private final VersionInfoParcel b;

    public cg(Context context, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        b = versioninfoparcel;
    }

    private static b a(JSONObject jsonobject)
    {
        String s = jsonobject.optString("http_request_id");
        Object obj = jsonobject.optString("url");
        String s1 = jsonobject.optString("post_body", null);
        JSONArray jsonarray;
        ArrayList arraylist;
        try
        {
            obj = new URL(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Error constructing http request.", ((Throwable) (obj)));
            obj = null;
        }
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("headers");
        jsonobject = jsonarray;
        if (jsonarray == null)
        {
            jsonobject = new JSONArray();
        }
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i);
            if (jsonobject1 != null)
            {
                arraylist.add(new a(jsonobject1.optString("key"), jsonobject1.optString("value")));
            }
        }

        return new b(s, ((URL) (obj)), arraylist, s1);
    }

    private c a(b b1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)b1.b().openConnection();
            p.e().a(a, b.b, false, httpurlconnection);
            a a1;
            for (Iterator iterator = b1.c().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(a1.a(), a1.b()))
            {
                a1 = (a)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            return new c(false, null, b1.toString());
        }
        ArrayList arraylist;
        if (!TextUtils.isEmpty(b1.d()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = b1.d().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        arraylist = new ArrayList();
        if (httpurlconnection.getHeaderFields() != null)
        {
            for (Iterator iterator1 = httpurlconnection.getHeaderFields().entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) 
                {
                    String s = (String)iterator2.next();
                    arraylist.add(new a((String)entry.getKey(), s));
                }
            }

        }
        b1 = b1.a();
        int i = httpurlconnection.getResponseCode();
        p.e();
        b1 = new c(true, new d(b1, i, arraylist, gm.a(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return b1;
    }

    private static JSONObject a(d d1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", d1.a());
            if (d1.d() != null)
            {
                jsonobject.put("body", d1.d());
            }
            jsonarray = new JSONArray();
            a a1;
            for (Iterator iterator = d1.c().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", a1.a()).put("value", a1.b())))
            {
                a1 = (a)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            com.google.android.gms.ads.internal.util.client.b.a("Error constructing JSON for http response.", d1);
            return jsonobject;
        }
        jsonobject.put("headers", jsonarray);
        jsonobject.put("response_code", d1.b());
        return jsonobject;
    }

    public final JSONObject a(String s)
    {
        String s1;
        JSONObject jsonobject;
        Object obj;
        try
        {
            obj = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.b.a("The request is not a valid JSON.");
            try
            {
                s = (new JSONObject()).put("success", false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new JSONObject();
            }
            return s;
        }
        jsonobject = new JSONObject();
        s = "";
        try
        {
            s1 = ((JSONObject) (obj)).optString("http_request_id");
        }
        catch (Exception exception)
        {
            try
            {
                jsonobject.put("response", (new JSONObject()).put("http_request_id", s));
                jsonobject.put("success", false);
                jsonobject.put("reason", exception.toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return jsonobject;
            }
            return jsonobject;
        }
        s = s1;
        obj = a(a(((JSONObject) (obj))));
        s = s1;
        if (!((c) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s = s1;
        jsonobject.put("response", a(((c) (obj)).b()));
        s = s1;
        jsonobject.put("success", true);
        return jsonobject;
        s = s1;
        jsonobject.put("response", (new JSONObject()).put("http_request_id", s1));
        s = s1;
        jsonobject.put("success", false);
        s = s1;
        jsonobject.put("reason", ((c) (obj)).a());
        return jsonobject;
    }

    public final void a(hi hi, Map map)
    {
        gl.a(new Runnable(map, hi) {

            final Map a;
            final hi b;
            final cg c;

            public final void run()
            {
                com.google.android.gms.ads.internal.util.client.b.a(3);
                Object obj = (String)a.get("http_request");
                obj = c.a(((String) (obj)));
                if (obj == null)
                {
                    com.google.android.gms.ads.internal.util.client.b.a("Response should not be null.");
                    return;
                } else
                {
                    gm.a.post(new Runnable(this, ((JSONObject) (obj))) {

                        final JSONObject a;
                        final _cls1 b;

                        public final void run()
                        {
                            b.b.a("fetchHttpRequestCompleted", a);
                            com.google.android.gms.ads.internal.util.client.b.a(3);
                        }

            
            {
                b = _pcls1;
                a = jsonobject;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                c = cg.this;
                a = map;
                b = hi;
                super();
            }
        });
    }
}
