// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class iko
{

    public static final String a = ekr.getName();
    public static final String b = iiv.getName();
    public static final String c = ekv.getName();
    public static final String d = ikf.getName();
    public static final String e = ikj.getName();
    private static ikn f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ikn();
        }
        olm1.a(ekr, new ekr[] {
            new iki(context)
        });
    }

    public static void a(olm olm1)
    {
        if (f == null)
        {
            f = new ikn();
        }
        jdr jdr1 = (jdr)olm1.a(jdr);
        eto eto1 = (eto)olm1.a(eto);
        iiv iiv1 = (iiv)olm1.a(iiv);
        olm1.a(ikj, new ikj[] {
            new ikp(jdr1), new ijx(), new ijs(), new ika(), new ijy(), new ijb(), new ijr(), new iju(), new ijw(eto1), new ijp(iiv1), 
            new ijk()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ikn();
        }
        olm1.a(iiv, new iiv(context, (dja)olm1.a(dja)));
    }

    public static void c(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ikn();
        }
        olm1.a(ekv, new ekv[] {
            new ikl(context, (est)olm1.a(est))
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ikn();
        }
        mmv mmv1 = (mmv)olm1.a(mmv);
        ifj ifj1 = (ifj)olm1.a(ifj);
        iiv iiv1 = (iiv)olm1.a(iiv);
        est est1 = (est)olm1.a(est);
        erz erz1 = (erz)olm1.a(erz);
        olm1.a(ikf, new ikf[] {
            new ijc(), new iji(), new ijh(est1), new ijd(ifj1), new ijf(est1), new ijg(context), new ijj(iiv1), new ijn(est1), new ijz(), new ijo(), 
            new ijq(context), new ije(), new ijv(), new ija(), new ijl(iiv1, mmv1), new ikm(), new iiy(erz1), new iiz(), new ijt()
        });
    }

}
