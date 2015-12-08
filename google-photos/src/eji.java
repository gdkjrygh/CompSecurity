// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class eji
{

    public static final String a = eis.getName();
    public static final String b = ejc.getName();
    public static final String c = eir.getName();
    public static final String d = eiu.getName();
    public static final String e = eiv.getName();
    public static final String f = ejg.getName();
    public static final String g = eje.getName();
    public static final String h = ejn.getName();
    public static final String i = eip.getName();
    private static ejh j;

    public static void a(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(ejc, new ejc(context, context.getContentResolver()));
    }

    public static void a(olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eis, new eis());
    }

    public static void b(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eir, new eir(context));
    }

    public static void b(olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eiv, new eiv((flk)olm1.a(flk)));
    }

    public static void c(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eiu, new eiu(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(ejg, new ejg(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eje, new eje(context));
    }

    public static void f(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(ejn, new ejf(context));
    }

    public static void g(Context context, olm olm1)
    {
        if (j == null)
        {
            j = new ejh();
        }
        olm1.a(eip, new eiq(context));
    }

}
