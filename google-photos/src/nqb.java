// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nqb
{

    public static final String a = npw.getName();
    private static nqa b;

    public static void a(Context context, olm olm1)
    {
        if (b == null)
        {
            b = new nqa();
        }
        olm1.a(npw, new npz(context));
    }

}
