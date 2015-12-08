// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nav
{

    public static final String a = nat.getName();
    public static final String b = nal.getName();
    public static final String c = nam.getName();
    private static nau d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new nau();
        }
        olm1.a(nat, new nat(context, (mmv)olm1.a(mmv), (nym)olm1.a(nym), (nam)olm1.a(nam)));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new nau();
        }
        olm1.a(nam, new nas());
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new nau();
        }
        olm1.a(nal, new nar(context, (nat)olm1.a(nat), (nam)olm1.a(nam), true));
    }

}
