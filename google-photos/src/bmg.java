// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class bmg extends bmb
    implements cak
{

    private static final String e = bmg.getSimpleName();
    public final bto a = new bmh(this, this, bmk);
    final bmj b;
    private final noj f;
    private final Context g;
    private final dfb h;

    bmg(bmb bmb1, Context context, noj noj1, bmj bmj1, dfb dfb1)
    {
        super(bmb1);
        g = (Context)b.a(context, "context", null);
        f = (noj)b.a(noj1, "movieMakerProvider", null);
        b = (bmj)b.a(bmj1, "display", null);
        h = (dfb)b.a(dfb1, "asyncTaskRunner", null);
    }

    static void a(bmg bmg1)
    {
        Object obj = new caj(bmg1.g, bmg1.f);
        obj = new cai(((caj) (obj)).a, ((caj) (obj)).b, bmg1);
        bmg1.h.a(((android.os.AsyncTask) (obj)), new String[] {
            bmg1.c.b.X
        });
    }

}
