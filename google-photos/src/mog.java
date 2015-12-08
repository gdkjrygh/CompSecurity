// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class mog
{

    private static final onh a = new onh(".login.accountsource");

    public mog()
    {
    }

    public static mmv a(Context context)
    {
        return new mnn(context);
    }

    static mnl a(mmv mmv)
    {
        return new mnl(mmv);
    }

    public static mng[] a(Context context, lww lww)
    {
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            return (new mng[] {
                new mom(lww)
            });
        } else
        {
            return (new mng[] {
                new mon(context)
            });
        }
    }

    public static onc[] a(mnl mnl1)
    {
        return new onc[0];
    }

    public static mnh b(Context context)
    {
        return new moi(context);
    }

    public static mvx[] b(mnl mnl1)
    {
        return new mvx[0];
    }

}
