// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.data.filter;


// Referenced classes of package com.cleanmaster.data.filter:
//            b

public class c
    implements b
{

    b a;
    b b;

    public c(b b1, b b2)
    {
        a = b1;
        b = b2;
    }

    public boolean a(Object obj)
    {
        return a.a(obj) || b.a(obj);
    }

    public String toString()
    {
        return String.format("(OR %s %s)", new Object[] {
            a.toString(), b.toString()
        });
    }
}
