// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;

final class hax
    implements Runnable
{

    private Point a;
    private int b;
    private hbn c;
    private boolean d;
    private jho e;
    private haw f;

    hax(haw haw1, Point point, int i, hbn hbn1, boolean flag, jho jho1)
    {
        f = haw1;
        a = point;
        b = i;
        c = hbn1;
        d = flag;
        e = jho1;
        super();
    }

    public final void run()
    {
        f.a(a, b);
        c.a(f.a, c.b, f.a.b);
        f.b(d);
        e.aA_();
    }
}
