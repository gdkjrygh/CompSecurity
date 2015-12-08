// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class imb
{

    public static final String a = ekr.getName();
    public static final String b = ekv.getName();
    public static final String c = ilq.getName();
    private static ima d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ima();
        }
        olm1.a(ekr, new ekr[] {
            new ilp(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ima();
        }
        olm1.a(ekv, new ekv[] {
            new ilx(context)
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ima();
        }
        olm1.a(ilq, new ilq[] {
            new ill(), new ilo(), new imc(context), new iln()
        });
    }

}
