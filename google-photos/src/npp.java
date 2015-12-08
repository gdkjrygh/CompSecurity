// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class npp
{

    public static final String a = npx.getName();
    public static final String b = npk.getName();
    public static final String c = npr.getName();
    public static final String d = myc.getName();
    private static npo e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new npo();
        }
        olm1.a(npk, new npn(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new npo();
        }
        olm1.a(npx, new npx[] {
            (npr)olm1.a(npr)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new npo();
        }
        olm1.a(npr, new npr(context));
    }

    public static void b(olm olm1)
    {
        if (e == null)
        {
            e = new npo();
        }
        olm1.a(myc, new myc[] {
            npm.a, npm.b
        });
    }

}
