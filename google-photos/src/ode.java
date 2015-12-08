// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ode
{

    public static final String a = mrx.getName();
    public static final String b = ocx.getName();
    public static final String c = msc.getName();
    public static final String d = mrw.getName();
    private static odd e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new odd();
        }
        olm1.a(mrx, new odb(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new odd();
        }
        olm1.a(mrw, new ocz());
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new odd();
        }
        olm1.a(ocx, new ocy(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new odd();
        }
        olm1.a(msc, new msc[] {
            new odf(context), new oda(context)
        });
    }

}
