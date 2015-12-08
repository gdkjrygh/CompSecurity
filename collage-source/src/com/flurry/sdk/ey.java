// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            gp, gd, hg, hh, 
//            gk, gt, fn, fp, 
//            hq, eq

public class ey extends gp
    implements hh.a
{

    static String a = "http://data.flurry.com/aap.do";
    static String b = "https://data.flurry.com/aap.do";
    private static final String g = com/flurry/sdk/ey.getSimpleName();
    private String h;
    private boolean i;

    public ey()
    {
        this(null);
    }

    public ey(gp.a a1)
    {
        super("Analytics", com/flurry/sdk/ey.getSimpleName());
        f = "AnalyticsData_";
        h();
        a(a1);
    }

    static void a(ey ey1)
    {
        ey1.e();
    }

    static void a(ey ey1, String s, String s1)
    {
        ey1.b(s, s1);
    }

    private void b(String s)
    {
        if (s != null && !s.endsWith(".do"))
        {
            gd.a(5, g, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        h = s;
    }

    static String c()
    {
        return g;
    }

    private void h()
    {
        hg hg1 = hg.a();
        i = ((Boolean)hg1.a("UseHttps")).booleanValue();
        hg1.a("UseHttps", this);
        gd.a(4, g, (new StringBuilder()).append("initSettings, UseHttps = ").append(i).toString());
        String s = (String)hg1.a("ReportUrl");
        hg1.a("ReportUrl", this);
        b(s);
        gd.a(4, g, (new StringBuilder()).append("initSettings, ReportUrl = ").append(s).toString());
    }

    public void a()
    {
        hg.a().b("UseHttps", this);
        hg.a().b("ReportUrl", this);
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
            gd.a(6, g, "onSettingUpdate internal error!");
            return;

        case 0: // '\0'
            i = ((Boolean)obj).booleanValue();
            gd.a(4, g, (new StringBuilder()).append("onSettingUpdate, UseHttps = ").append(i).toString());
            return;

        case 1: // '\001'
            s = (String)obj;
            break;
        }
        break MISSING_BLOCK_LABEL_141;
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
        gd.a(4, g, (new StringBuilder()).append("onSettingUpdate, ReportUrl = ").append(s).toString());
        return;
    }

    protected void a(String s, String s1, int j)
    {
        a(((hq) (new hq(j) {

            final int a;
            final ey b;

            public void safeRun()
            {
                if (a == 200)
                {
                    eq.a().d();
                }
            }

            
            {
                b = ey.this;
                a = j;
                super();
            }
        })));
        super.a(s, s1, j);
    }

    protected void a(byte abyte0[], String s, String s1)
    {
        String s2 = b();
        gd.a(4, g, (new StringBuilder()).append("FlurryDataSender: start upload data ").append(abyte0).append(" with id = ").append(s).append(" to ").append(s2).toString());
        gk gk1 = new gk();
        gk1.a(s2);
        gk1.a(0x186a0);
        gk1.a(gl.a.c);
        gk1.a("Content-Type", "application/octet-stream");
        gk1.a(new gt());
        gk1.a(abyte0);
        gk1.a(new gk.a(s, s1) {

            final String a;
            final String b;
            final ey c;

            public volatile void a(gk gk2, Object obj)
            {
                a(gk2, (Void)obj);
            }

            public void a(gk gk2, Void void1)
            {
                int j = gk2.e();
                if (j > 0)
                {
                    gd.e(ey.c(), "Analytics report sent.");
                    gd.a(3, ey.c(), (new StringBuilder()).append("FlurryDataSender: report ").append(a).append(" sent. HTTP response: ").append(j).toString());
                    if (gd.c() <= 3 && gd.d())
                    {
                        fp.a().a(new Runnable(this, j) {

                            final int a;
                            final _cls1 b;

                            public void run()
                            {
                                Toast.makeText(fp.a().c(), (new StringBuilder()).append("SD HTTP Response Code: ").append(a).toString(), 0).show();
                            }

            
            {
                b = _pcls1;
                a = j;
                super();
            }
                        });
                    }
                    c.a(a, b, j);
                    ey.a(c);
                    return;
                } else
                {
                    ey.a(c, a, b);
                    return;
                }
            }

            
            {
                c = ey.this;
                a = s;
                b = s1;
                super();
            }
        });
        fn.a().a(this, gk1);
    }

    String b()
    {
        if (h != null)
        {
            return h;
        }
        if (i)
        {
            return b;
        } else
        {
            return a;
        }
    }

}
