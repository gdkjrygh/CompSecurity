// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.util.Log;
import java.util.Map;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils, TDHttpClient, TDURLConnection, HttpParameterMap, 
//            THMStatusCode, TrustDefenderMobile, CancelState

class HttpRunner
    implements Runnable
{

    private static final String h = StringUtils.a(com/threatmetrix/TrustDefenderMobile/HttpRunner);
    private final HttpRunnerType a;
    final TDURLConnection b;
    final String c;
    final HttpParameterMap d;
    private Context e;
    private final TrustDefenderMobile f;
    private CancelState g;

    public HttpRunner(TDHttpClient tdhttpclient, HttpRunnerType httprunnertype, String s, HttpParameterMap httpparametermap, Map map, TrustDefenderMobile trustdefendermobile, Context context, 
            CancelState cancelstate)
    {
        e = null;
        g = null;
        g = cancelstate;
        b = tdhttpclient.a(cancelstate);
        b.a(map);
        a = httprunnertype;
        c = s;
        d = httpparametermap;
        f = trustdefendermobile;
        e = context;
    }

    public THMStatusCode a()
    {
        return b.g();
    }

    public int b()
    {
        return b.e();
    }

    public void c()
    {
        b.c();
    }

    public void run()
    {
        long l;
        long l1;
        l1 = System.nanoTime();
        Log.d(h, (new StringBuilder()).append("starting retrieval: ").append(c).toString());
        l = -1L;
        if (a != HttpRunnerType.a && a != HttpRunnerType.b) goto _L2; else goto _L1
_L1:
        l = b.a((new StringBuilder()).append(c).append("?").append(d.b()).toString());
_L9:
        l1 = (System.nanoTime() - l1) / 0xf4240L;
        if (l >= 0L) goto _L4; else goto _L3
_L3:
        Log.w(h, (new StringBuilder()).append("failed to retrieve from ").append(b.b()).append(" with ").append(b.g().toString()).append(" in ").append(l1).append("ms").toString());
        if (f != null)
        {
            f.a(b.g());
        }
_L6:
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        if (g != null && g.a())
        {
            Log.d(h, "interrupted due to cancel");
        } else
        {
            Log.e(h, "interrupted, aborting connection", interruptedexception);
        }
        if (f == null) goto _L6; else goto _L5
_L5:
        f.a(THMStatusCode.h);
        return;
_L2:
        if (a == HttpRunnerType.c || a == HttpRunnerType.d)
        {
            l = b.a(c, d);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        Log.d(h, (new StringBuilder()).append("retrieved: ").append(b.a()).append(" in ").append(l1).append("ms").toString());
        if (l != 200L)
        {
            Log.w(h, (new StringBuilder()).append("error (").append(l).append(") status on request to ").append(b.b()).toString());
            return;
        }
        if (a != HttpRunnerType.b && a != HttpRunnerType.d) goto _L6; else goto _L7
_L7:
        Log.d(h, "consuming content");
        b.f();
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }


    private class HttpRunnerType extends Enum
    {

        public static final HttpRunnerType a;
        public static final HttpRunnerType b;
        public static final HttpRunnerType c;
        public static final HttpRunnerType d;
        private static final HttpRunnerType e[];

        public static HttpRunnerType valueOf(String s)
        {
            return (HttpRunnerType)Enum.valueOf(com/threatmetrix/TrustDefenderMobile/HttpRunner$HttpRunnerType, s);
        }

        public static HttpRunnerType[] values()
        {
            return (HttpRunnerType[])e.clone();
        }

        static 
        {
            a = new HttpRunnerType("GET", 0);
            b = new HttpRunnerType("GET_CONSUME", 1);
            c = new HttpRunnerType("POST", 2);
            d = new HttpRunnerType("POST_CONSUME", 3);
            e = (new HttpRunnerType[] {
                a, b, c, d
            });
        }

        private HttpRunnerType(String s, int i)
        {
            super(s, i);
        }
    }

}
