// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            c

final class q extends c.a
{

    final char q;

    q(String s, char c1)
    {
        q = c1;
        super(s);
    }

    public final c a()
    {
        return b(q);
    }

    public final c a(c c1)
    {
        if (c1.c(q))
        {
            return c1;
        } else
        {
            return super.a(c1);
        }
    }

    public final boolean c(char c1)
    {
        return c1 == q;
    }

    public final String f(CharSequence charsequence)
    {
        return charsequence.toString().replace(q, '.');
    }
}
