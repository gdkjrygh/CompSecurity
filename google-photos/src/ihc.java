// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ihc
{

    public static final String a = igz.getName();
    public static final String b = igx.getName();
    private static ihb c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new ihb();
        }
        olm1.a(igz, new igz(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new ihb();
        }
        olm1.a(igx, new igx(20));
    }

}
