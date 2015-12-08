// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.util.Log;
import android.util.TimingLogger;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            CompleteProfile, TrustDefenderMobile, TDDefaults, TrustDefenderMobileCore, 
//            BrowserInfoGatherer, Config, OkHttpClientImpl, TDHttpClient, 
//            StringUtils, NativeGatherer, ProfileState, AndroidHttpClientImpl

class  extends CompleteProfile
{

    final Config a;
    final TrustDefenderMobile b;

    public void run()
    {
        boolean flag = true;
        Log.d(TrustDefenderMobile.h(), "Doing slow init stuff");
        if (TrustDefenderMobile.a(b) != null)
        {
            Log.d(TrustDefenderMobile.h(), (new StringBuilder()).append("applying saved options (").append(TrustDefenderMobile.a(b).a()).append(" / ").append(TrustDefenderMobile.a(b).b()).append(") to ").append(TrustDefenderMobile.b(b)).toString());
            TrustDefenderMobile.a(b, TrustDefenderMobile.b(b) ^ TrustDefenderMobile.a(b).b() & 38L | TrustDefenderMobile.a(b).a() & 768L);
        }
        b.a.b(TrustDefenderMobile.b(b));
        Object obj;
        String s;
        StringBuilder stringbuilder;
        if ((TrustDefenderMobile.b(b) & 38L) == 0L)
        {
            flag = false;
        }
        TrustDefenderMobile.a(b, new BrowserInfoGatherer());
        TrustDefenderMobile.d(b).a(TrustDefenderMobile.c(b), flag, TrustDefenderMobile.b(b));
        if (TrustDefenderMobile.e(b) != null)
        {
            TrustDefenderMobile.e(b).addSplit("init - initJSExecutor");
        }
        obj = TrustDefenderMobile.d(b).d();
        if (TrustDefenderMobile.e(b) != null)
        {
            TrustDefenderMobile.e(b).addSplit("getUserAgent");
        }
        Log.d(TrustDefenderMobile.h(), "Creating HTTP Client");
        if (!a.a())
        {
            break MISSING_BLOCK_LABEL_492;
        }
        b.c = new OkHttpClientImpl();
_L1:
        b.c.a(TrustDefenderMobile.c(b), TrustDefenderMobile.f(b), ((String) (obj)), true);
        if (TrustDefenderMobile.e(b) != null)
        {
            TrustDefenderMobile.e(b).addSplit("create AndroidHttpClient");
        }
        Log.d(TrustDefenderMobile.h(), "HTTP Client created and user agent set");
        try
        {
            StringUtils.b(null);
        }
        catch (InterruptedException interruptedexception) { }
        NativeGatherer.a().a(TrustDefenderMobile.c(b));
        s = TrustDefenderMobile.h();
        stringbuilder = (new StringBuilder()).append("Native libs: ");
        if (NativeGatherer.a().b())
        {
            obj = "available";
        } else
        {
            obj = "unavailable";
        }
        Log.d(s, stringbuilder.append(((String) (obj))).toString());
        b.b();
        if (!a.c())
        {
            b.a(TrustDefenderMobile.g(b), false, false, ckageScanCallSource.c);
        }
        b.b.o();
        b.b.f();
        Log.d(TrustDefenderMobile.h(), "init completed");
        return;
        b.c = new AndroidHttpClientImpl();
          goto _L1
        obj;
        b.b.o();
        b.b.f();
        Log.d(TrustDefenderMobile.h(), "init completed");
        throw obj;
    }

    ckageScanCallSource(TrustDefenderMobile trustdefendermobile, TrustDefenderMobile trustdefendermobile1, Config config)
    {
        b = trustdefendermobile;
        a = config;
        super(trustdefendermobile1);
    }
}
