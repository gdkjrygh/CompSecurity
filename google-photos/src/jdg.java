// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jdg
{

    public static final String a = jdk.getName();
    public static final String b = jdd.getName();
    public static final String c = jdh.getName();
    private static jdf d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new jdf();
        }
        olm1.a(jdd, new jdd(context));
    }

    public static void a(olm olm1)
    {
        if (d == null)
        {
            d = new jdf();
        }
        olm1.a(jdk, new jdk());
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new jdf();
        }
        olm1.a(jdh, new jdh(context.getCacheDir(), context.getContentResolver()));
    }

}
