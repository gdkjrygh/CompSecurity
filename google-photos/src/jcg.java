// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jcg
{

    public static final String a = hqf.getName();
    public static final String b = jch.getName();
    private static jcf c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new jcf();
        }
        olm1.a(hqf, new hqf[] {
            new hqi(context, (muz)olm1.a(muz), new jce(context))
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new jcf();
        }
        olm1.a(jch, new jch(context));
    }

}
