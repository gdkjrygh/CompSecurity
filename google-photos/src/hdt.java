// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hdt
{

    public static final String a = hdu.getName();
    public static final String b = hdo.getName();
    public static final String c = nkq.getName();
    private static hds d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new hds();
        }
        olm1.a(hdu, new hdu(context, (erj)olm1.a(erj)));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new hds();
        }
        olm1.a(hdo, new hdo((ivi)olm1.a(ivi)));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new hds();
        }
        olm1.a(nkq, new nkq[] {
            new hdn(context)
        });
    }

}
