// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class icu
{

    public static final String a = icr.getName();
    public static final String b = ics.getName();
    public static final String c = icp.getName();
    private static ict d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ict();
        }
        olm1.a(icr, new icr(context, (muz)olm1.a(muz)));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ict();
        }
        olm1.a(ics, new ics(context, (mmv)olm1.a(mmv), (icr)olm1.a(icr)));
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ict();
        }
        olm1.a(icp, new icq());
    }

}
