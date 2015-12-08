// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.server;

import com.facebook.ads.internal.AdErrorType;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.dev.Debug;
import com.facebook.ads.internal.http.c;
import com.facebook.ads.internal.util.d;
import org.json.JSONException;

// Referenced classes of package com.facebook.ads.internal.server:
//            a, b, c, e

class t> extends c
{

    final a a;

    public void a()
    {
        Debug.d((new StringBuilder("Facebook Ads SDK req start delay=")).append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms").toString());
    }

    public void a(int i, String s)
    {
        d.b(com.facebook.ads.internal.server.a.e(a));
        Debug.i((new StringBuilder("Facebook Ads SDK req complete ")).append(System.currentTimeMillis() - com.facebook.ads.internal.server.a.d(a)).append("ms ").toString());
        com.facebook.ads.internal.server.a.a(a, null);
        com.facebook.ads.internal.server.a.a(a, s);
    }

    public void a(Throwable throwable, String s)
    {
        d.b(com.facebook.ads.internal.server.a.e(a));
        long l = System.currentTimeMillis();
        long l1 = com.facebook.ads.internal.server.a.d(a);
        Debug.e((new StringBuilder("Facebook Ads SDK req failed ")).append(l - l1).append("ms ").append(s).append(" ").append(throwable).toString());
        com.facebook.ads.internal.server.a.a(a, null);
        String s1;
        a a1;
        AdErrorType aderrortype;
        throwable = com.facebook.ads.internal.server.a.f(a).a(s);
        if (throwable.a() != com.facebook.ads.internal.server.b)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        s1 = ((e)throwable).b();
        a1 = a;
        aderrortype = AdErrorType.ERROR_MESSAGE;
        throwable = s1;
        if (s1 == null)
        {
            throwable = s;
        }
        try
        {
            com.facebook.ads.internal.server.a.a(a1, aderrortype.getAdErrorWrapper(throwable));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable) { }
        com.facebook.ads.internal.server.a.a(a, new b(AdErrorType.NETWORK_ERROR, s));
        return;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
