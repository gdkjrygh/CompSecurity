// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class exu
{

    public static final String a = gln.getName();
    public static final String b = exm.getName();
    public static final String c = glt.getName();
    private static ext d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ext();
        }
        olm1.a(exm, new exm(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new ext();
        }
        olm1.a(gln, new gln[] {
            new exp((exm)olm1.a(exm))
        });
    }

    public static void b(olm olm1)
    {
        if (d == null)
        {
            d = new ext();
        }
        olm1.a(glt, new glt[] {
            new exs((exm)olm1.a(exm))
        });
    }

}
