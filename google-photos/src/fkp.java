// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fkp
{

    public static final String a = fkm.getName();
    public static final String b = hqf.getName();
    private static fko c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fko();
        }
        olm1.a(fkm, fko.a(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fko();
        }
        olm1.a(hqf, fko.a(context, (muz)olm1.a(muz)));
    }

}
