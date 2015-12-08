// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;

abstract class aql
{

    private final Queue a = bag.a(20);

    aql()
    {
    }

    protected abstract aqy a();

    public final void a(aqy aqy1)
    {
        if (a.size() < 20)
        {
            a.offer(aqy1);
        }
    }

    protected final aqy b()
    {
        aqy aqy2 = (aqy)a.poll();
        aqy aqy1 = aqy2;
        if (aqy2 == null)
        {
            aqy1 = a();
        }
        return aqy1;
    }
}
