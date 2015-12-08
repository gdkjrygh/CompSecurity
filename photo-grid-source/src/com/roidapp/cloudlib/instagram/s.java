// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.cloudlib.al;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            r, m, h, InstagramPhotoFragment

public final class s
    implements Runnable
{

    private final String a = "LoadPublicPhotoTask";
    private WeakReference b;
    private boolean c;
    private String d;
    private int e;
    private WeakReference f;

    public s(InstagramPhotoFragment instagramphotofragment, Handler handler, boolean flag, String s1)
    {
        c = true;
        e = 20;
        b = new WeakReference(instagramphotofragment);
        f = new WeakReference(handler);
        c = flag;
        d = s1;
    }

    private r a(String s1)
    {
        Object obj;
        r r1;
        if (s1 != null)
        {
            r.a(null);
        }
        r1 = new r();
        obj = (new StringBuilder()).append(s1).append("&count=").append(e).toString();
        s1 = ((String) (obj));
        if (r.a() != null)
        {
            s1 = ((String) (obj));
            if (!"".equals(r.a()))
            {
                if (r.a().equals("false"))
                {
                    return r1;
                }
                s1 = r.a();
            }
        }
        s1 = b(s1);
        if (s1 == null)
        {
            return null;
        }
        obj = new JSONObject(s1);
        s1 = ((JSONObject) (obj)).getJSONArray("data");
        obj = ((JSONObject) (obj)).getJSONObject("pagination");
        obj = ((JSONObject) (obj)).getString("next_url");
        int i;
        if (obj != null)
        {
            try
            {
                if (!"".equals(obj))
                {
                    r.a(((String) (obj)));
                }
            }
            catch (Exception exception)
            {
                r.a("false");
            }
        }
        for (i = 0; i < s1.length(); i++)
        {
            JSONObject jsonobject = s1.getJSONObject(i);
            jsonobject.getLong("created_time");
            jsonobject = jsonobject.getJSONObject("images");
            m m1 = new m();
            m1.b(jsonobject.getJSONObject("standard_resolution").getString("url"));
            m1.a(jsonobject.getJSONObject("thumbnail").getString("url"));
            r1.a.add(m1);
        }

        return r1;
    }

    private static String b(String s1)
    {
        s1 = (new URL(s1)).openConnection();
        s1.setConnectTimeout(10000);
        s1.setReadTimeout(10000);
        if (((HttpURLConnection)s1).getResponseCode() == 503)
        {
            throw new IOException("503");
        }
          goto _L1
        Exception exception;
        exception;
        s1 = null;
_L4:
        Object obj;
        BufferedReader bufferedreader;
        StringBuffer stringbuffer;
        String s2;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
        }
        throw exception;
_L1:
        s1 = s1.getInputStream();
        obj = new InputStreamReader(s1, "UTF-8");
        bufferedreader = new BufferedReader(((java.io.Reader) (obj)));
        stringbuffer = new StringBuffer();
_L2:
        s2 = bufferedreader.readLine();
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        stringbuffer.append(s2);
          goto _L2
        bufferedreader.close();
        ((InputStreamReader) (obj)).close();
        s1.close();
        obj = stringbuffer.toString();
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                return ((String) (obj));
            }
        }
        return ((String) (obj));
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void run()
    {
        Object obj2 = null;
        if (!c) goto _L2; else goto _L1
_L1:
        Object obj = obj2;
        if (b == null) goto _L4; else goto _L3
_L3:
        obj = obj2;
        if (b.get() == null) goto _L4; else goto _L5
_L5:
        obj = (h)al.g().b("Instagram");
        obj = (new StringBuilder("https://api.instagram.com/v1/media/popular?client_id=")).append(((h) (obj)).f).toString();
        obj2 = new r();
        obj = b(((String) (obj)));
        if (obj != null) goto _L7; else goto _L6
_L6:
        obj = null;
_L9:
        int i = 0;
_L11:
        obj2 = (Handler)f.get();
        if (obj2 != null)
        {
            ((Handler) (obj2)).sendMessage(Message.obtain(((Handler) (obj2)), 512, i, 0, obj));
        }
        return;
_L7:
        JSONArray jsonarray;
        Log.i("LoadPublicPhotoTask", ((String) (obj)));
        jsonarray = (new JSONObject(((String) (obj)))).getJSONArray("data");
        i = 0;
_L10:
        obj = obj2;
        if (i >= jsonarray.length()) goto _L9; else goto _L8
_L8:
        obj = jsonarray.getJSONObject(i).getJSONObject("images");
        m m1 = new m();
        m1.b(((JSONObject) (obj)).getJSONObject("low_resolution").getString("url"));
        m1.a(((JSONObject) (obj)).getJSONObject("thumbnail").getString("url"));
        ((r) (obj2)).a.add(m1);
        i++;
          goto _L10
_L2:
        obj = a(d);
_L4:
        i = 0;
          goto _L11
        Object obj1;
        obj1;
label0:
        {
            ((IOException) (obj1)).printStackTrace();
            obj1 = ((IOException) (obj1)).getMessage();
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (!((String) (obj1)).equals("503"))
            {
                break label0;
            }
            obj1 = null;
            i = 503;
        }
          goto _L11
        if (!((String) (obj1)).contains("validate certificate") || !((String) (obj1)).contains("time"))
        {
            break MISSING_BLOCK_LABEL_329;
        }
        i = -1;
_L12:
        obj1 = null;
          goto _L11
        obj1;
        InstagramPhotoFragment instagramphotofragment = (InstagramPhotoFragment)b.get();
        if (instagramphotofragment != null)
        {
            instagramphotofragment.a(((Exception) (obj1)));
        }
        obj1 = null;
        i = 0;
          goto _L11
        i = 0;
          goto _L12
    }
}
