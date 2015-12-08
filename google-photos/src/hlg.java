// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hlg
{

    public static final String a = omg.getName();
    public static final String b = dis.getName();
    private static hlf c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new hlf();
        }
        olm1.a(omg, new omg[] {
            new hkx(), new hld()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new hlf();
        }
        olm1.a(dis, new dis[] {
            new hla(context)
        });
    }

}
