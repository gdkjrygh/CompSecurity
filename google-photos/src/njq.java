// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class njq
{

    public static final String a = njn.getName();
    private static njp b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new njp();
        }
        olm1.a(njn, new njn(context));
    }

}
