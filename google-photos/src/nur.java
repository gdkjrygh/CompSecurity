// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class nur
{

    Map a;

    public nur()
    {
        a = new HashMap();
    }

    public final void a(nus nus1)
    {
        String s = nus1.a();
        Set set = (Set)a.get(s);
        Object obj = set;
        if (set == null)
        {
            obj = new HashSet();
            a.put(s, obj);
        }
        ((Set) (obj)).add(nus1);
    }

    public final void b(nus nus1)
    {
        String s = nus1.a();
        p.a(a.containsKey(s), "Unknown tag %s", new Object[] {
            s
        });
        Set set = (Set)a.get(s);
        p.a(set.remove(nus1), "Unknown listener for tag %s", new Object[] {
            s
        });
        if (set.isEmpty())
        {
            a.remove(s);
        }
    }
}
