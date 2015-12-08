// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.f.a;
import com.jcp.JCP;
import com.jcp.http.b;
import com.jcp.util.ae;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import java.util.Map;

public class ag extends AsyncTask
{

    private static final String a = com/jcp/c/ag.getName();
    private Context b;

    public ag(Context context)
    {
        b = context;
    }

    protected transient Integer a(String as[])
    {
        int i = -1;
        int j;
        OkHttpClient okhttpclient = JCP.k();
        a a1 = new a();
        a1.put("Content-type", "application/json");
        a1.put("Accept", "application/json");
        j = okhttpclient.newCall(com.jcp.http.b.a(as[0], a1)).execute().code();
        i = j;
_L2:
        return Integer.valueOf(i);
        as;
        ae.d(a, as.getLocalizedMessage());
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(Integer integer)
    {
        if (integer.intValue() == 200);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((String[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Integer)obj);
    }

}
