// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            HttpRunner, StringUtils, TDURLConnection, THMStatusCode, 
//            TDConfiguration, HttpParameterMap, CancelState, TDHttpClient, 
//            TrustDefenderMobile

class HttpConfigRunner extends HttpRunner
{

    private static final String f = StringUtils.a(com/threatmetrix/TrustDefenderMobile/HttpConfigRunner);
    public TDConfiguration a;
    private CancelState e;

    public HttpConfigRunner(TDHttpClient tdhttpclient, String s, HttpParameterMap httpparametermap, Map map, TrustDefenderMobile trustdefendermobile, CancelState cancelstate)
    {
        super(tdhttpclient, HttpRunner.HttpRunnerType.a, s, httpparametermap, map, trustdefendermobile, null, cancelstate);
        a = null;
        e = null;
        e = cancelstate;
    }

    public THMStatusCode a()
    {
        if (b.g() == THMStatusCode.b)
        {
            if (a != null && a.a())
            {
                return THMStatusCode.b;
            } else
            {
                return THMStatusCode.j;
            }
        } else
        {
            return super.a();
        }
    }

    public void run()
    {
        a = null;
        java.io.InputStream inputstream;
        try
        {
            Log.d(f, (new StringBuilder()).append("starting retrieval: ").append(c).append("?").append(d.b()).toString());
        }
        catch (InterruptedException interruptedexception)
        {
            if (e != null && e.a())
            {
                Log.d(f, (new StringBuilder()).append("starting retrieval: ").append(c).append(" but interrupted by cancel").toString());
                return;
            } else
            {
                Log.e(f, (new StringBuilder()).append("starting retrieval: ").append(c).append(" but interrupted").toString(), interruptedexception);
                return;
            }
        }
        super.run();
        if (b() != 200)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        a = new TDConfiguration();
        inputstream = b.d();
        a.a(inputstream);
        b.f();
        return;
        Object obj;
        obj;
        if (e == null || !e.a()) goto _L2; else goto _L1
_L1:
        Log.d(f, "IO Error, probably due to cancel");
_L4:
        b.f();
        return;
_L2:
        Log.e(f, "IO Error", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        b.f();
        throw obj;
    }

}
