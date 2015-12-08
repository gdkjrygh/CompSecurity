// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class gpw
    implements Runnable
{

    private Set a;
    private ds b;

    gpw(gpu gpu, Set set, ds ds)
    {
        a = set;
        b = ds;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gpy)iterator.next()).a()) { }
    }
}
