// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.Context;

// Referenced classes of package com.mobileapptracker:
//            MATDeeplinkListener, MATUrlRequester

class MATDeferredDplinkr
{

    private static volatile MATDeferredDplinkr j;
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private MATDeeplinkListener h;
    private boolean i;

    private MATDeferredDplinkr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = 0;
        f = null;
        g = null;
        h = null;
    }

    public static MATDeferredDplinkr a(String s, String s1, String s2)
    {
        com/mobileapptracker/MATDeferredDplinkr;
        JVM INSTR monitorenter ;
        j = new MATDeferredDplinkr();
        j.a = s;
        j.b = s1;
        j.c = s2;
        s = j;
        com/mobileapptracker/MATDeferredDplinkr;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    static String a(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.a;
    }

    static String b(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.b;
    }

    static String c(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.c;
    }

    static MATDeeplinkListener d(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.h;
    }

    static String e(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.d;
    }

    static String f(MATDeferredDplinkr matdeferreddplinkr)
    {
        return matdeferreddplinkr.f;
    }

    static MATDeferredDplinkr j()
    {
        return j;
    }

    public String a()
    {
        return j.a;
    }

    public void a(Context context, MATUrlRequester maturlrequester)
    {
        (new Thread(new Runnable(maturlrequester) {

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

            
            {
                b = MATDeferredDplinkr.this;
                a = maturlrequester;
                super();
            }
        })).start();
    }

    public void a(String s)
    {
        j.g = s;
    }

    public void a(String s, int k)
    {
        j.d = s;
        j.e = k;
    }

    public String b()
    {
        return j.b;
    }

    public void b(String s)
    {
        j.f = s;
    }

    public String c()
    {
        return j.c;
    }

    public String d()
    {
        return j.g;
    }

    public String e()
    {
        return j.d;
    }

    public int f()
    {
        return j.e;
    }

    public String g()
    {
        return j.f;
    }

    public MATDeeplinkListener h()
    {
        return j.h;
    }

    public boolean i()
    {
        return i;
    }
}
