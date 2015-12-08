// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class emc
{

    public static final String a = els.getName();
    public static final String b = elw.getName();
    public static final String c = elh.getName();
    private static emb d;

    public static void a(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new emb();
        }
        olm1.a(els, new els(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new emb();
        }
        olm1.a(elw, new elw(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (d == null)
        {
            d = new emb();
        }
        olm1.a(elh, new elh(context));
    }

}
