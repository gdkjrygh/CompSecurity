// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import android.os.ResultReceiver;
import android.support.v4.f.a;
import com.jcp.JCP;
import com.jcp.http.b;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.util.Map;

public class u
{

    protected ResultReceiver a;

    public u()
    {
    }

    public void a(ResultReceiver resultreceiver)
    {
        a = resultreceiver;
    }

    public String d(String s)
    {
        a a1 = new a();
        a1.put("Content-type", "application/json");
        a1.put("Accept", "application/json");
        s = JCP.k().newCall(b.a(s, a1)).execute();
        if (s.code() == 200)
        {
            return s.body().string();
        } else
        {
            return "";
        }
    }
}
