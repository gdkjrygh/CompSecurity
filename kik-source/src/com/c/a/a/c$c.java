// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            c

private static class q extends c
{

    final c q;

    public final c a()
    {
        return q;
    }

    c a(String s)
    {
        return new <init>(s, q);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public final boolean b(CharSequence charsequence)
    {
        return q.c(charsequence);
    }

    public final boolean c(char c1)
    {
        return !q.c(c1);
    }

    public final boolean c(CharSequence charsequence)
    {
        return q.b(charsequence);
    }

    ng(c c1)
    {
        String s = String.valueOf(String.valueOf(c1));
        this((new StringBuilder(s.length() + 9)).append(s).append(".negate()").toString(), c1);
    }

    ng(String s, c c1)
    {
        super(s);
        q = c1;
    }
}
