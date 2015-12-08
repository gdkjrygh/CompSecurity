// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class jbb
{

    public static final String a = izq.getName();
    public static final String b = jaz.getName();
    private static jba c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new jba();
        }
        olm1.a(jaz, new jaz(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new jba();
        }
        olm1.a(izq, new izq[] {
            (jaz)olm1.a(jaz)
        });
    }

}
