// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bd;

import java.util.Hashtable;

// Referenced classes of package p.bd:
//            h

public class c extends h
{

    protected String a;
    protected Hashtable b;
    protected Hashtable c;

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
        d = hashtable;
        a = a(hashtable.keySet());
        c = (Hashtable)hashtable.get(a);
        b = (Hashtable)c.get("parameters");
        if (a(hashtable.keySet(), "bulkData"))
        {
            a((byte[])(byte[])hashtable.get("bulkData"));
        }
    }

    protected c(c c1)
    {
        this(c1.d);
    }

    protected c(h h1)
    {
        this("", "");
        b = h1.d;
    }

    public String a()
    {
        return (String)c.get("name");
    }

    public String b()
    {
        return a;
    }
}
