// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.widget.Toast;

// Referenced classes of package com.flurry.sdk:
//            de, el, dp, dq, 
//            ei, et, ej, do, 
//            fc, dl, dj

public class dd extends de
    implements dq.a
{

    static String a;
    static String b = "http://data.flurry.com/aap.do";
    static String c = "https://data.flurry.com/aap.do";
    private static final String h = com/flurry/sdk/dd.getSimpleName();
    private boolean i;

    public dd()
    {
        this(null);
    }

    dd(de.a a1)
    {
        super("Analytics", com/flurry/sdk/dd.getSimpleName());
        g = "AnalyticsData_";
        g();
        a(a1);
    }

    static String b()
    {
        return h;
    }

    private void b(String s)
    {
        if (s != null && !s.endsWith(".do"))
        {
            el.a(5, h, "overriding analytics agent report URL without an endpoint, are you sure?");
        }
        a = s;
    }

    private void g()
    {
        dq dq1 = dp.a();
        i = ((Boolean)dq1.a("UseHttps")).booleanValue();
        dq1.a("UseHttps", this);
        el.a(4, h, (new StringBuilder("initSettings, UseHttps = ")).append(i).toString());
        String s = (String)dq1.a("ReportUrl");
        dq1.a("ReportUrl", this);
        b(s);
        el.a(4, h, (new StringBuilder("initSettings, ReportUrl = ")).append(s).toString());
    }

    String a()
    {
        if (a != null)
        {
            return a;
        }
        if (i)
        {
            return c;
        } else
        {
            return b;
        }
    }

    public void a(String s, Object obj)
    {
        if (s.equals("UseHttps"))
        {
            i = ((Boolean)obj).booleanValue();
            el.a(4, h, (new StringBuilder("onSettingUpdate, UseHttps = ")).append(i).toString());
            return;
        }
        if (s.equals("ReportUrl"))
        {
            s = (String)obj;
            b(s);
            el.a(4, h, (new StringBuilder("onSettingUpdate, ReportUrl = ")).append(s).toString());
            return;
        } else
        {
            el.a(6, h, "onSettingUpdate internal error!");
            return;
        }
    }

    protected void a(String s, String s1, int j)
    {
        a(((fc) (new fc(j) {

            final int a;
            final dd b;

            public void a()
            {
                if (a == 200)
                {
                    dj dj1 = dl.a().c();
                    if (dj1 != null)
                    {
                        dj1.b();
                    }
                }
            }

            
            {
                b = dd.this;
                a = j;
                super();
            }
        })));
        super.a(s, s1, j);
    }

    protected void a(byte abyte0[], String s, String s1)
    {
        String s2 = a();
        el.a(4, h, (new StringBuilder("FlurryDataSender: start upload data ")).append(abyte0).append(" with id = ").append(s).append(" to ").append(s2).toString());
        ei ei1 = new ei();
        ei1.a(s2);
        ei1.a(ek.a.c);
        ei1.a("Content-Type", "application/octet-stream");
        ei1.a(new et());
        ei1.a(abyte0);
        ei1.a(new ei.a(s, s1) {

            final String a;
            final String b;
            final dd c;

            public volatile void a(ei ei2, Object obj)
            {
                a(ei2, (Void)obj);
            }

            public void a(ei ei2, Void void1)
            {
                int j = ei2.e();
                if (j > 0)
                {
                    el.d(dd.b(), (new StringBuilder("FlurryDataSender: report ")).append(a).append(" sent. HTTP response: ").append(j).toString());
                    if (el.c() <= 3 && el.d())
                    {
                        com.flurry.sdk.do.a().a(new Runnable(this, j) {

                            final int a;
                            final _cls1 b;

                            public void run()
                            {
                                Toast.makeText(com.flurry.sdk.do.a().b(), (new StringBuilder("SD HTTP Response Code: ")).append(a).toString(), 0).show();
                            }

            
            {
                b = _pcls1;
                a = j;
                super();
            }
                        });
                    }
                    c.a(a, b, j);
                    c.d();
                    return;
                } else
                {
                    c.b(a, b);
                    return;
                }
            }

            
            {
                c = dd.this;
                a = s;
                b = s1;
                super();
            }
        });
        ej.a().a(this, ei1);
    }

}
