// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class nxy
{

    final jk a = new jk();
    nxz b;
    long c;
    long d;
    long e;
    long f;

    public nxy()
    {
    }

    public final void a(String s, String s1)
    {
        s = new ArrayList(a.keySet());
        Collections.sort(s);
        String s2;
        for (s = s.iterator(); s.hasNext(); (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s2).length())).append(s1).append(s2))
        {
            s2 = (String)s.next();
            s2 = String.valueOf(a.get(s2));
        }

    }

    public final String[] a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); Collections.addAll(arraylist, ((nxz)iterator.next()).j)) { }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public final long b()
    {
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        String s;
        long l;
        for (l = 0L; iterator.hasNext(); l = ((nxz)a.get(s)).e + l)
        {
            s = (String)iterator.next();
        }

        return l;
    }

    public final long c()
    {
        Iterator iterator = (new ArrayList(a.keySet())).iterator();
        String s;
        long l;
        for (l = 0L; iterator.hasNext(); l = ((nxz)a.get(s)).f + l)
        {
            s = (String)iterator.next();
        }

        return l;
    }
}
