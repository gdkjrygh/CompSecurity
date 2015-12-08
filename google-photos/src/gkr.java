// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class gkr
    implements Runnable
{

    private final noz a;
    private ehr b;
    private int c;
    private final gks d;
    private final gly e;

    public gkr(Context context, ehr ehr, int i, gks gks1, gly gly1)
    {
        b = ehr;
        c = i;
        d = gks1;
        e = gly1;
        a = noz.a(context, 3, "MediaPage", new String[] {
            "perf"
        });
    }

    public final void run()
    {
        long l = noy.a();
        long l1 = e.a(b);
        d.a(b, l1, c);
        if (a.a())
        {
            noy.a("count", Long.valueOf(l1));
            noy.a("key", b);
            noy.a("duration", l);
        }
    }
}
