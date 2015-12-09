// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;

final class elj
    implements Runnable
{

    private final eli._cls1 a;
    private final elb b;
    private final List c;
    private final Map d;
    private final int e;
    private final boolean f;

    private elj(eli._cls1 _pcls1, elb elb, List list, Map map, int i, boolean flag)
    {
        a = _pcls1;
        b = elb;
        c = list;
        d = map;
        e = i;
        f = flag;
    }

    public static Runnable a(eli._cls1 _pcls1, elb elb, List list, Map map, int i, boolean flag)
    {
        return new elj(_pcls1, elb, list, map, i, flag);
    }

    public final void run()
    {
        eli._cls1.a(a, b, c, d, e, f);
    }
}
