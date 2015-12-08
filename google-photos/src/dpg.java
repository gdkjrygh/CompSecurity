// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dpg
{

    public static final String a = eru.getName();
    public static final String b = dpb.getName();
    public static final String c = dox.getName();
    public static final String d = glt.getName();
    private static dpf e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new dpf();
        }
        olm1.a(dox, new dox(context));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new dpf();
        }
        olm1.a(eru, new eru[] {
            (dox)olm1.a(dox)
        });
    }

    public static void b(olm olm1)
    {
        if (e == null)
        {
            e = new dpf();
        }
        olm1.a(dpb, new dpb());
    }

    public static void c(olm olm1)
    {
        if (e == null)
        {
            e = new dpf();
        }
        olm1.a(glt, new glt[] {
            (dpb)olm1.a(dpb)
        });
    }

}
