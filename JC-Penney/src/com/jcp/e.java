// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp;

import com.jcp.activities.MainActivity;
import com.jcp.http.b;
import com.jcp.util.ae;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

// Referenced classes of package com.jcp:
//            h, f, JCP, g

public class e
    implements Runnable
{

    private final String a;
    private final String b;
    private MainActivity c;

    public e(MainActivity mainactivity, String s, String s1)
    {
        c = mainactivity;
        a = s;
        b = s1;
    }

    static MainActivity a(e e1)
    {
        return e1.c;
    }

    private void a()
    {
        c.runOnUiThread(new h(this));
    }

    static String b(e e1)
    {
        return e1.b;
    }

    static String c(e e1)
    {
        return e1.a;
    }

    public void run()
    {
        String s;
        s = null;
        c.runOnUiThread(new f(this));
        Object obj;
        obj = JCP.k();
        boolean flag = ((OkHttpClient) (obj)).getFollowRedirects();
        ((OkHttpClient) (obj)).setFollowRedirects(false);
        Response response = ((OkHttpClient) (obj)).newCall(com.jcp.http.b.a(a)).execute();
        ((OkHttpClient) (obj)).setFollowRedirects(flag);
        obj = response.header("Location", null);
        s = ((String) (obj));
        a();
_L2:
        c.runOnUiThread(new g(this, s));
        return;
        Exception exception1;
        exception1;
        ae.a(MainActivity.i, "Exception getting URL: ", exception1);
        a();
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        a();
        throw exception;
    }
}
