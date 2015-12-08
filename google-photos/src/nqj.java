// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nqj
{

    public static final String a = nqg.getName();
    private static nqi b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new nqi();
        }
        olm1.a(nqg, new nqh(context));
    }

}
