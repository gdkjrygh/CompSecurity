// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nqf
{

    public static final String a = npx.getName();
    private static nqe b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new nqe();
        }
        olm1.a(npx, new npx[] {
            new nqc(context)
        });
    }

}
