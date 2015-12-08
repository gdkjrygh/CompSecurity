// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nku
{

    public static final String a = nks.getName();
    public static final String b = nkv.getName();
    private static nkt c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new nkt();
        }
        olm1.a(nks, new nks(context, (muz)olm1.a(muz)));
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new nkt();
        }
        olm1.a(nkv, new nkv(context));
    }

}
