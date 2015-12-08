// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.util.Arrays;

// Referenced classes of package com.c.a.a:
//            u, c

final class o extends c.a
{

    o(String s)
    {
        super(s);
    }

    public final int a(CharSequence charsequence, int i)
    {
        int k = charsequence.length();
        u.b(i, k);
        int j = i;
        if (i == k)
        {
            j = -1;
        }
        return j;
    }

    public final c a()
    {
        return m;
    }

    public final c a(c c1)
    {
        u.a(c1);
        return this;
    }

    public final boolean b(CharSequence charsequence)
    {
        u.a(charsequence);
        return true;
    }

    public final boolean c(char c1)
    {
        return true;
    }

    public final boolean c(CharSequence charsequence)
    {
        return charsequence.length() == 0;
    }

    public final int d(CharSequence charsequence)
    {
        return charsequence.length() != 0 ? 0 : -1;
    }

    public final String e(CharSequence charsequence)
    {
        u.a(charsequence);
        return "";
    }

    public final String f(CharSequence charsequence)
    {
        charsequence = new char[charsequence.length()];
        Arrays.fill(charsequence, '.');
        return new String(charsequence);
    }
}
