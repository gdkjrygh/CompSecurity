// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ech
{

    public static final String a = ekr.getName();
    public static final String b = ebh.getName();
    public static final String c = ekv.getName();
    public static final String d = nrc.getName();
    public static final String e = ebn.getName();
    private static ecg f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ecg();
        }
        olm1.a(ekr, new ekr[] {
            new ebz(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ecg();
        }
        eci eci1 = (eci)olm1.a(eci);
        olm1.a(ebh, new ebh[] {
            new ecb(context, eci1), new ecc(eci1), new ebi(), new ece(), new ebf(), new ecl(eci1)
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ecg();
        }
        olm1.a(ekv, new ekv[] {
            new eca(context)
        });
    }

    public static void d(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ecg();
        }
        olm1.a(nrc, new nrc[] {
            new ecd(context)
        });
    }

    public static void e(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new ecg();
        }
        olm1.a(ebn, new ebn[] {
            new ebm(), new ecf(), new ebk(context), new ebj(), new ebl(), new ebo(), new ebg(), new ecn()
        });
    }

}
