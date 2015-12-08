// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class gri
{

    public final List a = new ArrayList(20);

    public gri()
    {
    }

    private gri c(String s, String s1)
    {
        a.add(s);
        a.add(s1.trim());
        return this;
    }

    private static void d(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("name == null");
        }
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("name is empty");
        }
        int k = s.length();
        for (int i = 0; i < k; i++)
        {
            char c1 = s.charAt(i);
            if (c1 <= '\037' || c1 >= '\177')
            {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[] {
                    Integer.valueOf(c1), Integer.valueOf(i), s
                }));
            }
        }

        if (s1 == null)
        {
            throw new IllegalArgumentException("value == null");
        }
        k = s1.length();
        for (int j = 0; j < k; j++)
        {
            char c2 = s1.charAt(j);
            if (c2 <= '\037' || c2 >= '\177')
            {
                throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", new Object[] {
                    Integer.valueOf(c2), Integer.valueOf(j), s1
                }));
            }
        }

    }

    public final grh a()
    {
        return new grh(this, (byte)0);
    }

    final gri a(String s)
    {
        int i = s.indexOf(":", 1);
        if (i != -1)
        {
            return c(s.substring(0, i), s.substring(i + 1));
        }
        if (s.startsWith(":"))
        {
            return c("", s.substring(1));
        } else
        {
            return c("", s);
        }
    }

    public final gri a(String s, String s1)
    {
        d(s, s1);
        return c(s, s1);
    }

    public final gri b(String s)
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

    public final gri b(String s, String s1)
    {
        d(s, s1);
        b(s);
        c(s, s1);
        return this;
    }
}
