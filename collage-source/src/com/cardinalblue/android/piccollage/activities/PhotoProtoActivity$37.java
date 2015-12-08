// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

class a
    implements Callable
{

    final String a;
    final PhotoProtoActivity b;

    public Integer a()
        throws Exception
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(a)).openConnection();
        httpurlconnection.setRequestMethod("GET");
        httpurlconnection.setDoInput(true);
        httpurlconnection.connect();
        return Integer.valueOf(httpurlconnection.getResponseCode());
    }

    public Object call()
        throws Exception
    {
        return a();
    }

    (PhotoProtoActivity photoprotoactivity, String s)
    {
        b = photoprotoactivity;
        a = s;
        super();
    }
}
