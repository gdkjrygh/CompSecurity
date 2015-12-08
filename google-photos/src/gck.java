// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;

final class gck
    implements Runnable
{

    private gcq a;
    private ds b;
    private geu c;
    private boolean d;
    private gcx e;
    private boolean f;
    private int g;
    private gcj h;

    gck(gcj gcj1, gcq gcq1, ds ds, geu geu, boolean flag, gcx gcx, boolean flag1, 
            int i)
    {
        h = gcj1;
        a = gcq1;
        b = ds;
        c = geu;
        d = flag;
        e = gcx;
        f = flag1;
        g = i;
        super();
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        a.a(b, c, d, e);
        gcj.a(h, a, b, f, g, d, e);
    }
}
