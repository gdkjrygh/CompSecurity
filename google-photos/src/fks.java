// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fks
{

    public static final String a = fkq.getName();
    public static final String b = mvi.getName();
    private static fkr c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fkr();
        }
        olm1.a(fkq, fkr.a(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new fkr();
        }
        olm1.a(mvi, fkr.a());
    }

}
