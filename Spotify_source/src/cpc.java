// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class cpc
{

    public final cpe a;
    public final cnp b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    final Map h;
    public final List i;
    private long j;
    private long k;

    private cpc(cpc cpc1)
    {
        a = cpc1.a;
        b = cpc1.b;
        d = cpc1.d;
        e = cpc1.e;
        f = cpc1.f;
        j = cpc1.j;
        k = cpc1.k;
        i = new ArrayList(cpc1.i);
        h = new HashMap(cpc1.h.size());
        java.util.Map.Entry entry;
        cpd cpd1;
        for (cpc1 = cpc1.h.entrySet().iterator(); cpc1.hasNext(); h.put(entry.getKey(), cpd1))
        {
            entry = (java.util.Map.Entry)cpc1.next();
            cpd1 = c((Class)entry.getKey());
            ((cpd)entry.getValue()).a(cpd1);
        }

    }

    cpc(cpe cpe, cnp cnp)
    {
        btl.a(cpe);
        btl.a(cnp);
        a = cpe;
        b = cnp;
        j = 0x1b7740L;
        k = 0xb43e9400L;
        h = new HashMap();
        i = new ArrayList();
    }

    private static cpd c(Class class1)
    {
        try
        {
            class1 = (cpd)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType doesn't have default constructor", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType default constructor is not accessible", class1);
        }
        return class1;
    }

    public final cpc a()
    {
        return new cpc(this);
    }

    public final cpd a(Class class1)
    {
        return (cpd)h.get(class1);
    }

    public final void a(cpd cpd1)
    {
        btl.a(cpd1);
        Class class1 = cpd1.getClass();
        if (class1.getSuperclass() != cpd)
        {
            throw new IllegalArgumentException();
        } else
        {
            cpd1.a(b(class1));
            return;
        }
    }

    public final cpd b(Class class1)
    {
        cpd cpd2 = (cpd)h.get(class1);
        cpd cpd1 = cpd2;
        if (cpd2 == null)
        {
            cpd1 = c(class1);
            h.put(class1, cpd1);
        }
        return cpd1;
    }
}
