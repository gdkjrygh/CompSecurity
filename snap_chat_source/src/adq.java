// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class adq extends adz
{

    private final TreeMap a = new TreeMap();

    public adq(acU acu)
    {
        super(acu);
    }

    public final adp a(aeB aeb)
    {
        if (aeb == null)
        {
            throw new NullPointerException("prototype == null");
        }
        h();
        adp adp2 = (adp)a.get(aeb);
        adp adp1 = adp2;
        if (adp2 == null)
        {
            adp1 = new adp(aeb);
            a.put(aeb, adp1);
        }
        return adp1;
    }

    public final Collection a()
    {
        return a.values();
    }

    public final int b(aeB aeb)
    {
        if (aeb == null)
        {
            throw new NullPointerException("prototype == null");
        }
        g();
        aeb = (adp)a.get(aeb);
        if (aeb == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return aeb.c();
        }
    }

    protected final void b()
    {
        Iterator iterator = a.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((adp)(adg)iterator.next()).a(i);
        }

    }

    public final void b(aeG aeg)
    {
        g();
        int j = a.size();
        int i;
        if (j == 0)
        {
            i = 0;
        } else
        {
            i = e();
        }
        if (j > 0x10000)
        {
            throw new UnsupportedOperationException("too many proto ids");
        } else
        {
            aeg.d(j);
            aeg.d(i);
            return;
        }
    }
}
