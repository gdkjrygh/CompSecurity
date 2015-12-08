// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.ford.syncV4.e:
//            h

public class c extends h
{

    protected String a;
    protected Hashtable b;
    protected Hashtable c;

    protected c(c c1)
    {
        this(c1.d);
    }

    protected c(h h1)
    {
        this("", "");
        b = h1.d;
    }

    public c(String s)
    {
        this(s, "request");
    }

    public c(String s, String s1)
    {
        c = new Hashtable();
        a = s1;
        d.put(s1, c);
        b = new Hashtable();
        c.put("parameters", b);
        c.put("name", s);
    }

    public c(Hashtable hashtable)
    {
        Iterator iterator;
        d = hashtable;
        a = a(hashtable.keySet());
        c = (Hashtable)hashtable.get(a);
        b = (Hashtable)c.get("parameters");
        iterator = hashtable.keySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s = (String)iterator.next();
        if (s == null || !s.equals("bulkData")) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            a((byte[])hashtable.get("bulkData"));
        }
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final String a()
    {
        return (String)c.get("name");
    }

    public final String b()
    {
        return a;
    }
}
