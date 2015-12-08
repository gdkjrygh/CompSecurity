// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class adu extends adz
{

    private final TreeMap a = new TreeMap();

    public adu(acU acu)
    {
        super(acu);
    }

    public final adf a(aec aec)
    {
        if (aec == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        aec = (adf)a.get((aey)aec);
        if (aec == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return aec;
        }
    }

    public final adt a(aey aey1)
    {
        aey1 = new adt(aey1);
        h();
        aey aey2 = ((adt) (aey1)).a;
        adt adt1 = (adt)a.get(aey2);
        if (adt1 != null)
        {
            return adt1;
        } else
        {
            a.put(aey2, aey1);
            return aey1;
        }
    }

    public final Collection a()
    {
        return a.values();
    }

    public final int b(aey aey1)
    {
        if (aey1 == null)
        {
            throw new NullPointerException("string == null");
        }
        g();
        aey1 = (adt)a.get(aey1);
        if (aey1 == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return aey1.c();
        }
    }

    protected final void b()
    {
        Iterator iterator = a.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((adt)iterator.next()).a(i);
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
        aeg.d(j);
        aeg.d(i);
    }
}
