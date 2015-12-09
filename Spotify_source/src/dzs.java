// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class dzs
{

    private int a;
    private HashMap b;

    public dzs()
    {
        b = new HashMap();
    }

    public final void a()
    {
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ((dzt)iterator.next()).a()) { }
        b.clear();
    }

    public final void a(an an)
    {
        dzt dzt2 = (dzt)b.get(an);
        dzt dzt1 = dzt2;
        if (dzt2 == null)
        {
            int i = a;
            a = i + 1;
            dzt1 = new dzt(i, an, (byte)0);
            b.put(an, dzt1);
        }
        if (!dzt1.c)
        {
            dzt1.c = true;
            if (!dzt1.d)
            {
                dzt1.b.a(dzt1.a, dzt1);
                dzt1.d = true;
            }
            dzt1.b.l();
        }
    }

    public final void b(an an)
    {
        an = (dzt)b.remove(an);
        if (an == null)
        {
            return;
        } else
        {
            an.a();
            return;
        }
    }
}
