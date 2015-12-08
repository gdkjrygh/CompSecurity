// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.content.SharedPreferences;
import com.vungle.log.Logger;
import com.vungle.publisher.env.SdkConfig;
import com.vungle.publisher.event.EventBus;
import com.vungle.publisher.net.http.HttpResponse;
import com.vungle.publisher.net.http.HttpTransaction;
import com.vungle.publisher.net.http.InfiniteRetryHttpResponseHandler;
import com.vungle.publisher.protocol.RequestConfigAsync;
import com.vungle.publisher.protocol.message.RequestConfigResponse;
import java.io.IOException;
import javax.inject.Provider;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher:
//            cq, co

public class cy extends InfiniteRetryHttpResponseHandler
{

    public com.vungle.publisher.protocol.message.RequestConfigResponse.Factory a;
    public SdkConfig b;
    public EventBus c;
    public Provider d;

    public cy()
    {
    }

    protected final void a(HttpTransaction httptransaction, HttpResponse httpresponse)
        throws IOException, JSONException
    {
        httpresponse = (RequestConfigResponse)a.a(a(httpresponse.a));
        httptransaction = ((RequestConfigResponse) (httpresponse)).b;
        if (httptransaction != null && httptransaction.intValue() > 0)
        {
            ((RequestConfigAsync)d.get()).a(httptransaction.intValue() * 1000);
        }
        httptransaction = ((RequestConfigResponse) (httpresponse)).d;
        if (httptransaction == null) goto _L2; else goto _L1
_L1:
    /* anonymous class not found */
    class _anm1 {}

        _cls1.a[httptransaction.ordinal()];
        JVM INSTR tableswitch 1 2: default 100
    //                   1 344
    //                   2 357;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_357;
_L3:
        Logger.w("VungleNetwork", (new StringBuilder("unhandled streaming connectivity type ")).append(httptransaction).toString());
_L2:
        SdkConfig sdkconfig = b;
        boolean flag = Boolean.TRUE.equals(((RequestConfigResponse) (httpresponse)).a);
        StringBuilder stringbuilder = new StringBuilder();
        if (flag)
        {
            httptransaction = "enabling";
        } else
        {
            httptransaction = "disabling";
        }
        Logger.d("VungleConfig", stringbuilder.append(httptransaction).append(" ad streaming").toString());
        sdkconfig.b = flag;
        httptransaction = b;
        flag = Boolean.TRUE.equals(((RequestConfigResponse) (httpresponse)).e);
        Logger.d("VungleConfig", (new StringBuilder("setting exception reporting enabled: ")).append(flag).toString());
        ((SdkConfig) (httptransaction)).j.edit().putBoolean(((SdkConfig) (httptransaction)).e, flag).commit();
        httptransaction = ((RequestConfigResponse) (httpresponse)).c;
        if (httptransaction == null)
        {
            Logger.w("VungleNetwork", "null request streaming ad timeout millis");
        } else
        {
            SdkConfig sdkconfig2 = b;
            int i = httptransaction.intValue();
            Logger.d("VungleConfig", (new StringBuilder("setting streaming response timeout ")).append(i).append(" ms").toString());
            sdkconfig2.d = i;
        }
        httptransaction = ((RequestConfigResponse) (httpresponse)).f;
        httpresponse = ((RequestConfigResponse) (httpresponse)).g;
        if (httpresponse != null)
        {
            SdkConfig sdkconfig1 = b;
            long l = httpresponse.longValue();
            Logger.d("VungleConfig", (new StringBuilder("setting app fingerprint frequency to ")).append(l).toString());
            sdkconfig1.g = l;
        }
        if (httptransaction != null)
        {
            b.a(httptransaction.longValue());
        }
        c.a(new cq());
        return;
_L4:
        b.a(co.values());
          goto _L2
        b.a(new co[] {
            co.b
        });
          goto _L2
    }
}
