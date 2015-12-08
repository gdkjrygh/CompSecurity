// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.errorinfo;

import android.util.Log;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package com.arist.model.errorinfo:
//            b, e, d

public final class c
{

    public static c c;
    public e a;
    public int b;
    public b d;

    public c()
    {
    }

    public static c a()
    {
        if (c == null)
        {
            c = new c();
        }
        return c;
    }

    private static boolean a(String s)
    {
        boolean flag = true;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length() > 0) goto _L3; else goto _L2
_L3:
        s = new JSONObject(s);
        if (!s.has("code")) goto _L5; else goto _L4
_L4:
        int i = s.getInt("code");
_L7:
        if (i != 1)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        return false;
_L5:
        i = 0;
        if (true) goto _L7; else goto _L6
_L2:
        flag = false;
_L6:
        return flag;
    }

    private static String b(String s, b b1)
    {
        if (s != null && b1 != null) goto _L2; else goto _L1
_L1:
        return "";
_L2:
        s = new HttpPost(s);
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicNameValuePair("request", "ERRORINFO"));
        arraylist.add(new BasicNameValuePair("errorType", b1.a()));
        arraylist.add(new BasicNameValuePair("errorPhone", b1.b()));
        arraylist.add(new BasicNameValuePair("errorInfo", b1.d()));
        arraylist.add(new BasicNameValuePair("errorTime", b1.c()));
        arraylist.add(new BasicNameValuePair("errorPath", b1.e()));
        s.setEntity(new UrlEncodedFormEntity(arraylist, "UTF-8"));
        s = (new DefaultHttpClient()).execute(s);
        if (s.getStatusLine().getStatusCode() != 200) goto _L1; else goto _L3
_L3:
        s = EntityUtils.toString(s.getEntity());
        return s;
        s;
        s.printStackTrace();
        return "";
        s;
        s.printStackTrace();
        return "";
    }

    public final void a(e e1, b b1)
    {
        a = e1;
        b = 0;
        d = b1;
    }

    public final void a(String s, b b1)
    {
        s = b(s, b1);
        if (s == null || s.equals("")) goto _L2; else goto _L1
_L1:
        Log.e("eeeeeee", (new StringBuilder("result:")).append(s).toString());
        if (!a(s)) goto _L4; else goto _L3
_L3:
        if (a != null)
        {
            b1 = a;
            int i = b;
            b1.a(s);
        }
_L6:
        return;
_L4:
        if (a != null)
        {
            s = a;
            int j = b;
            s.b(b1.e());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (a != null)
        {
            s = a;
            int k = b;
            s.b(b1.e());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b()
    {
        if (d == null)
        {
            return;
        } else
        {
            (new Thread(new d(this))).start();
            return;
        }
    }
}
