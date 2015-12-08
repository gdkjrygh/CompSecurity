// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dte
{

    public static final String a = dtc.getName();
    private static dtd b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new dtd();
        }
        olm1.a(dtc, new dtc(context));
    }

}
