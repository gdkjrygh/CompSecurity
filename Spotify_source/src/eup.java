// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.Maps;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class eup
{

    public Map a;
    protected Set b;

    public eup()
    {
        a = Maps.b();
        b = new HashSet();
    }

    public void a()
    {
        a.clear();
    }

    public void a(String s, euo euo1)
    {
        if (!a.containsKey(s))
        {
            a.put(s, new HashSet());
        }
        ((Set)a.get(s)).add(euo1);
        if (a(s))
        {
            euo1.a(b(s), b.contains(s));
        }
    }

    public abstract void a(String s, boolean flag);

    public abstract boolean a(String s);

    protected abstract boolean b(String s);

    public final void c(String s)
    {
        if (a.containsKey(s))
        {
            for (Iterator iterator = ((Set)a.get(s)).iterator(); iterator.hasNext(); ((euo)iterator.next()).a(b(s), b.contains(s))) { }
        }
    }
}
