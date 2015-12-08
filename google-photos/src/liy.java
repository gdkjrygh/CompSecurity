// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class liy
{

    final lja a;
    public final kdh b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public boolean g;
    final Map h;
    public final List i;
    private long j;
    private long k;

    private liy(liy liy1)
    {
        a = liy1.a;
        b = liy1.b;
        d = liy1.d;
        e = liy1.e;
        f = liy1.f;
        j = liy1.j;
        k = liy1.k;
        i = new ArrayList(liy1.i);
        h = new HashMap(liy1.h.size());
        java.util.Map.Entry entry;
        liz liz1;
        for (liy1 = liy1.h.entrySet().iterator(); liy1.hasNext(); h.put(entry.getKey(), liz1))
        {
            entry = (java.util.Map.Entry)liy1.next();
            liz1 = c((Class)entry.getKey());
            ((liz)entry.getValue()).a(liz1);
        }

    }

    liy(lja lja1, kdh kdh)
    {
        b.d(lja1);
        b.d(kdh);
        a = lja1;
        b = kdh;
        j = 0x1b7740L;
        k = 0xb43e9400L;
        h = new HashMap();
        i = new ArrayList();
    }

    private static liz c(Class class1)
    {
        try
        {
            class1 = (liz)class1.newInstance();
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

    public final liy a()
    {
        return new liy(this);
    }

    public final liz a(Class class1)
    {
        return (liz)h.get(class1);
    }

    public final void a(liz liz1)
    {
        b.d(liz1);
        Class class1 = liz1.getClass();
        if (class1.getSuperclass() != liz)
        {
            throw new IllegalArgumentException();
        } else
        {
            liz1.a(b(class1));
            return;
        }
    }

    public final liz b(Class class1)
    {
        liz liz2 = (liz)h.get(class1);
        liz liz1 = liz2;
        if (liz2 == null)
        {
            liz1 = c(class1);
            h.put(class1, liz1);
        }
        return liz1;
    }

    public final ljb b()
    {
        return a.g;
    }
}
