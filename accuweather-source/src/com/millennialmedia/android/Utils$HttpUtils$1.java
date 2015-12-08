// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.millennialmedia.android:
//            Utils, MMLog

static final class val.url
    implements Runnable
{

    final String val$url;

    public void run()
    {
        try
        {
            (new DefaultHttpClient()).execute(new HttpGet(val$url));
            MMLog.d("Utils", (new StringBuilder()).append("Executed Url :\"").append(val$url).append("\"").toString());
            return;
        }
        catch (IOException ioexception)
        {
            MMLog.e("Utils", "Exception with HttpUtils: ", ioexception);
        }
    }

    (String s)
    {
        val$url = s;
        super();
    }
}
