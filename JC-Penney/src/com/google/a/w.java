// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import java.util.Set;

// Referenced classes of package com.google.a:
//            t, v

public final class w extends t
{

    private final com.google.a.b.w a = new com.google.a.b.w();

    public w()
    {
    }

    public t a(String s)
    {
        return (t)a.get(s);
    }

    public Set a()
    {
        return a.entrySet();
    }

    public void a(String s, t t1)
    {
        Object obj = t1;
        if (t1 == null)
        {
            obj = v.a;
        }
        a.put(s, obj);
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof w) && ((w)obj).a.equals(a);
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
