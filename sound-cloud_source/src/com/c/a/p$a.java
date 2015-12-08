// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.c.a:
//            p

public static final class ring
{

    final List a = new ArrayList(20);

    public final ring a(String s)
    {
        int j;
        for (int i = 0; i < a.size(); i = j + 2)
        {
            j = i;
            if (s.equalsIgnoreCase((String)a.get(i)))
            {
                a.remove(i);
                a.remove(i);
                j = i - 2;
            }
        }

        return this;
    }

    public final ring a(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("name == null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("value == null");
        }
        if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
        {
            throw new IllegalArgumentException((new StringBuilder("Unexpected header: ")).append(s).append(": ").append(s1).toString());
        } else
        {
            return b(s, s1);
        }
    }

    public final p a()
    {
        return new p(this, (byte)0);
    }

    final ring b(String s, String s1)
    {
        a.add(s);
        a.add(s1.trim());
        return this;
    }

    public final ring c(String s, String s1)
    {
        a(s);
        a(s, s1);
        return this;
    }

    public ring()
    {
    }
}
