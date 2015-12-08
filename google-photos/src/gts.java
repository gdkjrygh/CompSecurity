// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gts
{

    public static final String a = gtp.getName();
    public static final String b = myc.getName();
    private static gtr c;

    public static void a(Context context, olm olm1)
    {
        if (c == null)
        {
            c = new gtr();
        }
        olm1.a(gtp, new gtp(context));
    }

    public static void a(olm olm1)
    {
        if (c == null)
        {
            c = new gtr();
        }
        olm1.a(myc, new myc[] {
            gtq.a
        });
    }

}
