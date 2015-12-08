// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.TreeMap;

public final class adb extends adk
{

    private final TreeMap a = new TreeMap();

    public adb(acU acu)
    {
        super("field_ids", acu);
    }

    public final ada a(ael ael1)
    {
        if (ael1 == null)
        {
            throw new NullPointerException("field == null");
        }
        h();
        ada ada2 = (ada)a.get(ael1);
        ada ada1 = ada2;
        if (ada2 == null)
        {
            ada1 = new ada(ael1);
            a.put(ael1, ada1);
        }
        return ada1;
    }

    public final adf a(aec aec)
    {
        if (aec == null)
        {
            throw new NullPointerException("cst == null");
        }
        g();
        aec = (adf)a.get((ael)aec);
        if (aec == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return aec;
        }
    }

    public final Collection a()
    {
        return a.values();
    }

    public final void a(aeG aeg)
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

    public final int b(ael ael1)
    {
        if (ael1 == null)
        {
            throw new NullPointerException("ref == null");
        }
        g();
        ael1 = (ada)a.get(ael1);
        if (ael1 == null)
        {
            throw new IllegalArgumentException("not found");
        } else
        {
            return ael1.c();
        }
    }
}
