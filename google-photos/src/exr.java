// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class exr
    implements Runnable
{

    private Map a;
    private exq b;

    exr(exq exq1, Map map)
    {
        b = exq1;
        a = map;
        super();
    }

    public final void run()
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); ((exh)exq.a(b).get(entry.getKey())).a((eyg)entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }
}
