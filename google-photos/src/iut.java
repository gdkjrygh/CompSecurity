// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class iut
{

    public static final String a = nkx.getName();
    public static final String b = iur.getName();
    private static ius c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new ius();
        }
        olm1.a(iur, new iur(context, (muz)olm1.a(muz)));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new ius();
        }
        olm1.a(nkx, new nkx[] {
            new iuu((iur)olm1.a(iur), (gbd)olm1.a(gbd))
        });
    }

}
