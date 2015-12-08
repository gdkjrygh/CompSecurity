// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fea
{

    public static final String a = fbv.getName();
    public static final String b = dur.getName();
    public static final String c = duq.getName();
    public static final String d = dxy.getName();
    private static fdz e;

    public static void a(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fdz();
        }
        olm1.a(fbv, new fdb(context, (duh)olm1.a(duh)));
    }

    public static void a(olm olm1)
    {
        if (e == null)
        {
            e = new fdz();
        }
        olm1.a(dxy, new dxy[] {
            new fdc()
        });
    }

    public static void b(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fdz();
        }
        olm1.a(dur, new dur[] {
            new fdi(context, (fcl)olm1.a(fcl))
        });
    }

    public static void c(Context context, olm olm1)
    {
        if (e == null)
        {
            e = new fdz();
        }
        olm1.a(duq, new duq[] {
            new fdh()
        });
    }

}
