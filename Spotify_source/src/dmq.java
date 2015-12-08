// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

final class dmq extends Thread
{

    private final Set a;

    dmq(Set set)
    {
        a = set;
    }

    public final void run()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.remove())
        {
            gqs gqs1 = (gqs)iterator.next();
            if (!gqs1.c())
            {
                gqs1.b();
            }
        }

    }
}
