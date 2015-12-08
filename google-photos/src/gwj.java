// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gwj
{

    public static final String a = gvz.getName();
    public static final String b = gwe.getName();
    public static final String c = gvs.getName();
    public static final String d = gwd.getName();
    public static final String e = dis.getName();
    private static gwi f;

    public static void a(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new gwi();
        }
        olm1.a(gvz, new gvz(context));
    }

    public static void b(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new gwi();
        }
        olm1.a(gwe, new gwe(context));
    }

    public static void c(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new gwi();
        }
        olm1.a(gvs, new gvs(context));
    }

    public static void d(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new gwi();
        }
        olm1.a(gwd, new gwd(context));
    }

    public static void e(Context context, olm olm1)
    {
        if (f == null)
        {
            f = new gwi();
        }
        olm1.a(dis, new dis[] {
            new gwc(context)
        });
    }

}
