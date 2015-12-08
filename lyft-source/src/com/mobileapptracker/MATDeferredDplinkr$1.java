// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;


// Referenced classes of package com.mobileapptracker:
//            MATDeferredDplinkr, MATDeeplinkListener, MATUrlRequester

class a
    implements Runnable
{

    final MATUrlRequester a;
    final MATDeferredDplinkr b;

    public void run()
    {
        if ((MATDeferredDplinkr.a(MATDeferredDplinkr.j()) == null || MATDeferredDplinkr.b(MATDeferredDplinkr.j()) == null || MATDeferredDplinkr.c(MATDeferredDplinkr.j()) == null) && MATDeferredDplinkr.d(b) != null)
        {
            MATDeferredDplinkr.d(b).b("Advertiser ID, conversion key, or package name not set");
        }
        if (MATDeferredDplinkr.e(MATDeferredDplinkr.j()) == null && MATDeferredDplinkr.f(MATDeferredDplinkr.j()) == null && MATDeferredDplinkr.d(b) != null)
        {
            MATDeferredDplinkr.d(b).b("No device identifiers collected");
        }
        a.a(MATDeferredDplinkr.j());
    }

    (MATDeferredDplinkr matdeferreddplinkr, MATUrlRequester maturlrequester)
    {
        b = matdeferreddplinkr;
        a = maturlrequester;
        super();
    }
}
