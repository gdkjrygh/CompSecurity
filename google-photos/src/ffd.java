// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ffd
{

    public static final String a = gcb.getName();
    public static final String b = ngs.getName();
    public static final String c = mvi.getName();
    private static ffc d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ffc();
        }
        olm1.a(gcb, new fez(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new ffc();
        }
        olm1.a(mvi, new mvi[] {
            new fff()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new ffc();
        }
        olm1.a(ngs, new ngs[] {
            new ffa(context)
        });
    }

}
