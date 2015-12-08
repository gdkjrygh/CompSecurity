// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;

public final class imy extends nzc
{

    public pbc a;
    private final iuj b;
    private final boolean c;
    private final boolean d;
    private final pgq e;
    private final pew r[];
    private final Point s[];

    public imy(Context context, int i, iuj iuj1, boolean flag, boolean flag1, pgq pgq, pew apew[], 
            Point apoint[])
    {
        super(context, (new nyh()).a(context, i).a(), "editstory", new pbb(), new pbc());
        b = iuj1;
        c = flag;
        d = flag1;
        e = pgq;
        r = apew;
        s = apoint;
    }

    protected final void a(qlw qlw)
    {
        int j = 0;
        qlw = (pbb)qlw;
        qlw.a = new pdw();
        ((pbb) (qlw)).a.a = new pec();
        ((pbb) (qlw)).a.a.a = new pdr();
        ((pbb) (qlw)).a.a.a.b = Boolean.valueOf(true);
        ((pbb) (qlw)).a.a.d = Boolean.valueOf(true);
        ((pbb) (qlw)).a.a.a.a = new pds[s.length];
        Point apoint[] = s;
        int k = apoint.length;
        for (int i = 0; j < k; i++)
        {
            Point point = apoint[j];
            pds pds1 = new pds();
            pds1.a = Float.valueOf(point.x);
            pds1.b = Float.valueOf(point.y);
            pds1.c = Float.valueOf(g.getResources().getDisplayMetrics().density);
            ((pbb) (qlw)).a.a.a.a[i] = pds1;
            j++;
        }

        ((pbb) (qlw)).a.b = new pgp();
        ((pbb) (qlw)).a.b.b = b.a;
        ((pbb) (qlw)).a.b.c = e;
        ((pbb) (qlw)).a.c = r;
        ((pbb) (qlw)).a.d = new ped();
        ((pbb) (qlw)).a.d.a = Boolean.valueOf(c);
        ((pbb) (qlw)).a.d.b = Boolean.valueOf(d);
    }

    protected final void b(qlw qlw)
    {
        a = (pbc)qlw;
    }
}
