// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class ati extends atn
{

    protected String a;
    public Hashtable b;
    protected Hashtable c;

    public ati(ati ati1)
    {
        this(ati1.e);
    }

    public ati(atn atn1)
    {
        this("", "");
        b = atn1.e;
    }

    public ati(String s)
    {
        this(s, "request");
    }

    public ati(String s, String s1)
    {
        c = new Hashtable();
        a = s1;
        e.put(s1, c);
        b = new Hashtable();
        c.put("parameters", b);
        c.put("name", s);
    }

    public ati(Hashtable hashtable)
    {
        Iterator iterator;
        e = hashtable;
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
