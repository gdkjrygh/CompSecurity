// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.roidapp.baselib.c.c;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.roidapp.photogrid.c:
//            g, a, c, b

public final class h extends c
{

    private boolean a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private Context g;
    private com.roidapp.photogrid.c.c h;
    private boolean i;
    private String j;
    private boolean k;
    private boolean l;

    public h(Context context, com.roidapp.photogrid.c.c c1, boolean flag, boolean flag1)
    {
        a = true;
        i = false;
        g = context;
        h = c1;
        k = flag;
        l = flag1;
    }

    private boolean a(String s)
    {
        String s2 = "";
_L6:
        Object obj;
        String s1;
        obj = s2;
        s1 = s2;
        if (i) goto _L2; else goto _L1
_L1:
        obj = s2;
        s1 = s2;
        Object obj1 = new BasicHttpParams();
        obj = s2;
        s1 = s2;
        HttpGet httpget = new HttpGet(s);
        obj = s2;
        s1 = s2;
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 15000);
        obj = s2;
        s1 = s2;
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 27000);
        obj = s2;
        s1 = s2;
        HttpConnectionParams.setSocketBufferSize(((org.apache.http.params.HttpParams) (obj1)), 1024);
        obj = s2;
        s1 = s2;
        HttpClientParams.setRedirecting(((org.apache.http.params.HttpParams) (obj1)), true);
        obj = s2;
        s1 = s2;
        obj1 = (new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)))).execute(httpget);
        obj = s2;
        s1 = s2;
        if (((HttpResponse) (obj1)).getStatusLine().getStatusCode() != 200) goto _L4; else goto _L3
_L3:
        obj = s2;
        s1 = s2;
        obj1 = ((HttpResponse) (obj1)).getEntity();
        if (obj1 == null) goto _L6; else goto _L5
_L5:
        obj = s2;
        s1 = s2;
        s = EntityUtils.toString(((org.apache.http.HttpEntity) (obj1)), "utf-8");
        obj = s;
        s1 = s;
        com.roidapp.photogrid.c.g.a("XmlAsyncTask", s);
_L7:
        if (i || !a)
        {
            break MISSING_BLOCK_LABEL_399;
        }
        obj = (new JSONTokener(com.roidapp.photogrid.c.a.b(s))).nextValue();
        if (obj instanceof JSONObject)
        {
            break MISSING_BLOCK_LABEL_344;
        }
        a = false;
        Log.e("Error Object:", obj.getClass().getCanonicalName());
        return false;
_L4:
        obj = s2;
        s1 = s2;
        a = false;
        obj = s2;
        s1 = s2;
        j = "404!";
        s = "";
          goto _L7
_L2:
        s = "";
          goto _L7
        s;
        com.roidapp.photogrid.c.g.b("XmlAsyncTask", s.toString());
        a = false;
        j = s.toString();
        s = ((String) (obj));
          goto _L7
        s;
        com.roidapp.photogrid.c.g.b("XmlAsyncTask", s.toString());
        a = false;
        j = s.toString();
        s = s1;
          goto _L7
        s;
        throw s;
        try
        {
            obj = (JSONObject)obj;
            b = ((JSONObject) (obj)).getString("latest_version");
            c = ((JSONObject) (obj)).getString("latest_md5");
            d = ((JSONObject) (obj)).getString("message");
            f = ((JSONObject) (obj)).getInt("size");
            e = ((JSONObject) (obj)).getInt("versionCode");
        }
        catch (JSONException jsonexception)
        {
            Log.e("result:", s);
            jsonexception.printStackTrace();
            a = false;
            j = jsonexception.toString();
        }
        return a;
    }

    public final void a()
    {
        i = true;
        a = false;
        Log.i("XmlAsyncTask", "oncancel");
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (String[])aobj;
        j = "";
        a(((String) (aobj[0])));
        return Boolean.valueOf(a);
    }

    protected final void onPostExecute(Object obj)
    {
        if (((Boolean)obj).booleanValue())
        {
            PreferenceManager.getDefaultSharedPreferences(g).edit().putString("update_md5", c).putInt("size", f).apply();
            h.a(b, e, d);
        } else
        if (!i && !k)
        {
            h.a(b.b, j);
            return;
        }
    }

    protected final void onPreExecute()
    {
        if (!l)
        {
            h.e();
        }
    }
}
