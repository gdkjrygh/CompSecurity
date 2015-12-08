// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fyk
{

    public static final String a = ngs.getName();
    public static final String b = fyc.getName();
    private static fyj c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fyj();
        }
        olm1.a(ngs, new ngs[] {
            new fyi(context)
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new fyj();
        }
        olm1.a(fyc, new fyc(context));
    }

}
