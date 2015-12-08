// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public final class adx extends adz
{

    private final TreeMap a = new TreeMap();

    public adx(acU acu)
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
        Object obj = ((aez)aec).b;
        obj = (adf)a.get(obj);
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder("not found: ")).append(aec).toString());
        } else
        {
            return ((adf) (obj));
        }
    }

    public final adw a(aeD aed)
    {
        if (aed == null)
        {
            throw new NullPointerException("type == null");
        }
        h();
        adw adw2 = (adw)a.get(aed);
        adw adw1 = adw2;
        if (adw2 == null)
        {
            adw1 = new adw(new aez(aed));
            a.put(aed, adw1);
        }
        return adw1;
    }

    public final adw a(aez aez1)
    {
        if (aez1 == null)
        {
            throw new NullPointerException("type == null");
        }
        h();
        aeD aed = aez1.b;
        adw adw2 = (adw)a.get(aed);
        adw adw1 = adw2;
        if (adw2 == null)
        {
            adw1 = new adw(aez1);
            a.put(aed, adw1);
        }
        return adw1;
    }

    public final Collection a()
    {
        return a.values();
    }

    public final int b(aeD aed)
    {
        if (aed == null)
        {
            throw new NullPointerException("type == null");
        }
        g();
        adw adw1 = (adw)a.get(aed);
        if (adw1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("not found: ")).append(aed).toString());
        } else
        {
            return adw1.c();
        }
    }

    public final int b(aez aez1)
    {
        if (aez1 == null)
        {
            throw new NullPointerException("type == null");
        } else
        {
            return b(aez1.b);
        }
    }

    protected final void b()
    {
        Iterator iterator = a.values().iterator();
        for (int i = 0; iterator.hasNext(); i++)
        {
            ((adw)(adg)iterator.next()).a(i);
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
            throw new UnsupportedOperationException("too many type ids");
        } else
        {
            aeg.d(j);
            aeg.d(i);
            return;
        }
    }
}
