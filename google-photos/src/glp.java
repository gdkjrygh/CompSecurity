// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class glp
{

    public static final String a = glk.getName();
    public static final String b = gll.getName();
    private static glo c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new glo();
        }
        olm1.a(glk, new glk(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new glo();
        }
        olm1.a(gll, new gll(context, olm.c(context, gln)));
    }

}
