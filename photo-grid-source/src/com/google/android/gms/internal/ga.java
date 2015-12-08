// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
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
//            fz, gd, ge, qa, 
//            gf, gg, gb, pu, 
//            ry

public final class ga
    implements fz
{

    private final Context a;
    private final VersionInfoParcel b;

    public ga(Context context, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        b = versioninfoparcel;
    }

    private static ge a(JSONObject jsonobject)
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
            zzb.zzb("Error constructing http request.", ((Throwable) (obj)));
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
                arraylist.add(new gd(jsonobject1.optString("key"), jsonobject1.optString("value")));
            }
        }

        return new ge(s, ((URL) (obj)), arraylist, s1);
    }

    private gf a(ge ge1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)ge1.b().openConnection();
            zzp.zzbv().a(a, b.zzJu, false, httpurlconnection);
            gd gd1;
            for (Iterator iterator = ge1.c().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(gd1.a(), gd1.b()))
            {
                gd1 = (gd)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (ge ge1)
        {
            return new gf(this, false, null, ge1.toString());
        }
        ArrayList arraylist;
        if (!TextUtils.isEmpty(ge1.d()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = ge1.d().getBytes();
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
                    arraylist.add(new gd((String)entry.getKey(), s));
                }
            }

        }
        ge1 = ge1.a();
        int i = httpurlconnection.getResponseCode();
        zzp.zzbv();
        ge1 = new gf(this, true, new gg(ge1, i, arraylist, qa.a(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return ge1;
    }

    private static JSONObject a(gg gg1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", gg1.a());
            if (gg1.d() != null)
            {
                jsonobject.put("body", gg1.d());
            }
            jsonarray = new JSONArray();
            gd gd1;
            for (Iterator iterator = gg1.c().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", gd1.a()).put("value", gd1.b())))
            {
                gd1 = (gd)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (gg gg1)
        {
            zzb.zzb("Error constructing JSON for http response.", gg1);
            return jsonobject;
        }
        jsonobject.put("headers", jsonarray);
        jsonobject.put("response_code", gg1.b());
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
            zzb.e("The request is not a valid JSON.");
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
        if (!((gf) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s = s1;
        jsonobject.put("response", a(((gf) (obj)).b()));
        s = s1;
        jsonobject.put("success", true);
        return jsonobject;
        s = s1;
        jsonobject.put("response", (new JSONObject()).put("http_request_id", s1));
        s = s1;
        jsonobject.put("success", false);
        s = s1;
        jsonobject.put("reason", ((gf) (obj)).a());
        return jsonobject;
    }

    public final void zza(ry ry, Map map)
    {
        pu.a(new gb(this, map, ry));
    }
}
