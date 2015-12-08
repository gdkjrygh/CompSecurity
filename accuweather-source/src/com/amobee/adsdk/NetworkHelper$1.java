// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.amobee.adsdk:
//            NetworkHelper, Log

class val.myUrl
    implements Runnable
{

    private final String val$myUrl;

    public void run()
    {
        try
        {
            if (val$myUrl != null && !val$myUrl.equals("") && (new DefaultHttpClient()).execute(new HttpGet(val$myUrl)).getEntity() != null)
            {
                Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("Notification sent: ")).append(val$myUrl).toString());
            }
            return;
        }
        catch (Exception exception)
        {
            Log.d("[a\u2022mo\u2022bee]", "sendNotification error");
        }
    }

    ()
    {
        val$myUrl = s;
        super();
    }
}
