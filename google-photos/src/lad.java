// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class lad extends lam
    implements Map
{

    private lag d;

    public lad()
    {
    }

    private lag b()
    {
        if (d == null)
        {
            d = new lae(this);
        }
        return d;
    }

    public Set entrySet()
    {
        lag lag1 = b();
        if (lag1.a == null)
        {
            lag1.a = new lai(lag1);
        }
        return lag1.a;
    }

    public Set keySet()
    {
        lag lag1 = b();
        if (lag1.b == null)
        {
            lag1.b = new laj(lag1);
        }
        return lag1.b;
    }

    public void putAll(Map map)
    {
        int i = c + map.size();
        if (super.a.length < i)
        {
            int ai[] = super.a;
            Object aobj[] = super.b;
            super.a(i);
            if (super.c > 0)
            {
                System.arraycopy(ai, 0, super.a, 0, super.c);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (super.b)), 0, super.c << 1);
            }
            lam.a(ai, aobj, super.c);
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        lag lag1 = b();
        if (lag1.c == null)
        {
            lag1.c = new lal(lag1);
        }
        return lag1.c;
    }
}
