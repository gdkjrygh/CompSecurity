// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hxz
{

    public static final String a = dia.getName();
    public static final String b = dis.getName();
    private static hxy c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new hxy();
        }
        olm1.a(dis, new dis[] {
            new hxm(context)
        });
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new hxy();
        }
        olm1.a(dia, new dia[] {
            new hxf()
        });
    }

}
