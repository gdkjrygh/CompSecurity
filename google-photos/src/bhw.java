// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;

public final class bhw
{

    public static final String a = nou.getName();
    public static final String b = ckf.getName();
    public static final String c = bjq.getName();
    public static final String d = nnr.getName();
    public static final String e = cmg.getName();
    public static final String f = clm.getName();
    public static final String g = nov.getName();
    public static final String h = cit.getName();
    public static final String i = android/os/PowerManager.getName();
    public static final String j = chq.getName();
    public static final String k = now.getName();
    public static final String l = clx.getName();
    public static final String m = bju.getName();
    public static final String n = cwn.getName();
    public static final String o = bnl.getName();
    private static bhu p;

    public static void a(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(nou, new nou[] {
            new clo(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(ckf, new ckf(context.getContentResolver()));
    }

    public static void c(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(bjq, new bjq(context, (cmg)olm1.a(cmg), (dfj)olm1.a(dfj), (noj)olm1.a(noj), (chq)olm1.a(chq), (clm)olm1.a(clm), (ckf)olm1.a(ckf)));
    }

    public static void d(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        context = (bnl)olm1.a(bnl);
        cit cit1 = (cit)olm1.a(cit);
        if (lvd.a(((bnl) (context)).a, "moviemaker:aam_events_logging_enabled", false))
        {
            if (lvd.a(((bnl) (context)).a, "moviemaker:aam_events_logcat_logging_enabled", false))
            {
                context = new bud(new nff[] {
                    new nfe("AamEvents"), cit1.a("AamEventsLog")
                });
            } else
            {
                context = new bud(new nff[] {
                    cit1.a("AamEventsLog")
                });
            }
        } else
        {
            context = new nnv();
        }
        olm1.a(nnr, context);
    }

    public static void e(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(cmg, new cmg());
    }

    public static void f(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        context = p;
        bnl bnl1 = (bnl)olm1.a(bnl);
        chq chq1 = (chq)olm1.a(chq);
        java.util.concurrent.ExecutorService executorservice = ((dfk)olm1.a(dfk)).a(ckw, "VideoDecoderBackgroundExecutor");
        olm1.a(clm, new clm(new bhv(context, bnl1), new ckw(chq1, bnl1, executorservice)));
    }

    public static void g(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(nov, new nov[] {
            new clt()
        });
    }

    public static void h(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(cit, new cit(context));
    }

    public static void i(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(android/os/PowerManager, (PowerManager)context.getSystemService("power"));
    }

    public static void j(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(chq, new chq((dfk)olm1.a(dfk)));
    }

    public static void k(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(now, new now(context));
    }

    public static void l(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(clx, new clx((bju)olm1.a(bju)));
    }

    public static void m(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(bju, new bjj(context, "metrics.db", context.getCacheDir(), 20));
    }

    public static void n(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(cwn, new cwp(context, (PowerManager)olm1.a(android/os/PowerManager), (bnl)olm1.a(bnl), (noj)olm1.a(noj)));
    }

    public static void o(Context context, olm olm1)
    {
        if (p == null)
        {
            p = new bhu();
        }
        olm1.a(bnl, new bnl(context.getContentResolver(), context.getResources()));
    }

}
