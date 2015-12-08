// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            kp, kc, lg, lh, 
//            kj, kt, jm

public class iv extends kp
    implements lh.a
{

    private static final String e = com/flurry/sdk/iv.getSimpleName();
    private static String f = "http://data.flurry.com/aap.do";
    private static String g = "https://data.flurry.com/aap.do";
    private String h;
    private boolean i;

    public iv()
    {
        this(null);
    }

    public iv(kp.a a1)
    {
        super("Analytics", com/flurry/sdk/iv.getSimpleName());
        d = "AnalyticsData_";
        h();
        a(a1);
    }

    static void a(iv iv1)
    {
        iv1.e();
    }

    static void a(iv iv1, String s, String s1)
    {
        iv1.b(s, s1);
    }

    private void b(String s)
    {
        if (s != null && !s.endsWith(".do"))
        {
            kc.a(5, e, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        h = s;
    }

    static String c()
    {
        return e;
    }

    private void h()
    {
        lg lg1 = lg.a();
        i = ((Boolean)lg1.a("UseHttps")).booleanValue();
        lg1.a("UseHttps", this);
        kc.a(4, e, (new StringBuilder("initSettings, UseHttps = ")).append(i).toString());
        String s = (String)lg1.a("ReportUrl");
        lg1.a("ReportUrl", this);
        b(s);
        kc.a(4, e, (new StringBuilder("initSettings, ReportUrl = ")).append(s).toString());
    }

    public void a()
    {
        lg.a().b("UseHttps", this);
        lg.a().b("ReportUrl", this);
    }

    public void a(String s, Object obj)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 32
    //                   -239660092: 67
    //                   1650629499: 81;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_81;
_L4:
        switch (byte0)
        {
        default:
            kc.a(6, e, "onSettingUpdate internal error!");
            return;

        case 0: // '\0'
            i = ((Boolean)obj).booleanValue();
            kc.a(4, e, (new StringBuilder("onSettingUpdate, UseHttps = ")).append(i).toString());
            return;

        case 1: // '\001'
            s = (String)obj;
            break;
        }
        break MISSING_BLOCK_LABEL_138;
_L2:
        if (s.equals("UseHttps"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("ReportUrl"))
        {
            byte0 = 1;
        }
          goto _L4
        b(s);
        kc.a(4, e, (new StringBuilder("onSettingUpdate, ReportUrl = ")).append(s).toString());
        return;
    }

    protected void a(String s, String s1, int j)
    {
        a(((lr) (new _cls2(j))));
        super.a(s, s1, j);
    }

    protected void a(byte abyte0[], String s, String s1)
    {
        String s2 = b();
        kc.a(4, e, (new StringBuilder("FlurryDataSender: start upload data ")).append(abyte0).append(" with id = ").append(s).append(" to ").append(s2).toString());
        kj kj1 = new kj();
        kj1.a(s2);
        kj1.d(0x186a0);
        kj1.a(kl.a.c);
        kj1.a("Content-Type", "application/octet-stream");
        kj1.a(new kt());
        kj1.a(abyte0);
        kj1.a(new _cls1(s, s1));
        jm.a().a(this, kj1);
    }

    String b()
    {
        if (h != null)
        {
            return h;
        }
        if (i)
        {
            return g;
        } else
        {
            return f;
        }
    }


    private class _cls2 extends lr
    {

        final int a;
        final iv b;

        public void a()
        {
            if (a == 200)
            {
                hi.a().f();
            }
        }

        _cls2(int j)
        {
            b = iv.this;
            a = j;
            super();
        }
    }


    private class _cls1
        implements kj.a
    {

        final String a;
        final String b;
        final iv c;

        public volatile void a(kj kj1, Object obj)
        {
            a(kj1, (Void)obj);
        }

        public void a(kj kj1, Void void1)
        {
            int j = kj1.h();
            if (j > 0)
            {
                kc.e(iv.c(), "Analytics report sent.");
                kc.a(3, iv.c(), (new StringBuilder("FlurryDataSender: report ")).append(a).append(" sent. HTTP response: ").append(j).toString());
                class _cls1
                    implements Runnable
                {

                    final int a;
                    final _cls1 b;

                    public void run()
                    {
                        Toast.makeText(jo.a().c(), (new StringBuilder("SD HTTP Response Code: ")).append(a).toString(), 0).show();
                    }

                _cls1(int j)
                {
                    b = _cls1.this;
                    a = j;
                    super();
                }
                }

                if (kc.c() <= 3 && kc.d())
                {
                    jo.a().a(new _cls1(j));
                }
                c.a(a, b, j);
                iv.a(c);
                return;
            } else
            {
                iv.a(c, a, b);
                return;
            }
        }

        _cls1(String s, String s1)
        {
            c = iv.this;
            a = s;
            b = s1;
            super();
        }
    }

}
