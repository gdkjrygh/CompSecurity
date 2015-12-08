// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dta
{

    public static final String a = omg.getName();
    public static final String b = dst.getName();
    private static dsz c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new dsz();
        }
        olm1.a(dst, new dst(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new dsz();
        }
        olm1.a(omg, new omg[] {
            new dsy()
        });
    }

}
