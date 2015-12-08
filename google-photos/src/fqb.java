// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fqb
{

    public static final String a = fps.getName();
    public static final String b = mvi.getName();
    public static final String c = fpy.getName();
    private static fqa d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fqa();
        }
        olm1.a(fps, new fps(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new fqa();
        }
        olm1.a(mvi, new mvi[] {
            new fpz()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new fqa();
        }
        olm1.a(fpy, new fpy(context));
    }

}
