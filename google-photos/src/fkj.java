// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fkj
{

    public static final String a = ekr.getName();
    public static final String b = ekv.getName();
    public static final String c = fjw.getName();
    private static fki d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fki();
        }
        olm1.a(ekr, new ekr[] {
            new fjv(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fki();
        }
        olm1.a(ekv, new ekv[] {
            new fjy(context)
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fki();
        }
        gbd gbd1 = (gbd)olm1.a(gbd);
        olm1.a(fjw, new fjw[] {
            new fjn(context), new fjm(context, gbd1), new fke(context), new fkf(), new fkg(), new fkl(), new fkk(context), new fkd(context), new fkh(context)
        });
    }

}
