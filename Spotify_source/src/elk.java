// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class elk
    implements Runnable
{

    private final eli._cls1 a;
    private final elb b;
    private final List c;
    private final int d;
    private final boolean e;

    private elk(eli._cls1 _pcls1, elb elb, List list, int i, boolean flag)
    {
        a = _pcls1;
        b = elb;
        c = list;
        d = i;
        e = flag;
    }

    public static Runnable a(eli._cls1 _pcls1, elb elb, List list, int i, boolean flag)
    {
        return new elk(_pcls1, elb, list, i, flag);
    }

    public final void run()
    {
        eli._cls1.a(a, b, c, d, e);
    }
}
