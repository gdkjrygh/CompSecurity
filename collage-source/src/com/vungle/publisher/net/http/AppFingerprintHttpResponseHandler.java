// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;

import com.vungle.log.Logger;
import com.vungle.publisher.env.SdkConfig;
import java.io.IOException;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.net.http:
//            FireAndForgetHttpResponseHandler, HttpTransaction, HttpResponse

public class AppFingerprintHttpResponseHandler extends FireAndForgetHttpResponseHandler
{

    SdkConfig a;

    public AppFingerprintHttpResponseHandler()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        super.a(httptransaction, httpresponse);
        long l = System.currentTimeMillis();
        Logger.d("VungleData", (new StringBuilder("sent fingerprint at time: ")).append(l).toString());
        a.a(l);
    }
}
