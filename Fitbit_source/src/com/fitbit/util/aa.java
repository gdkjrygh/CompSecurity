// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import java.util.Locale;

// Referenced classes of package com.fitbit.util:
//            al

public class aa
    implements Comparable
{

    private final Locale a;
    private final boolean b;
    private final int c;

    public aa(Locale locale)
    {
        this(locale, true, 0);
    }

    public aa(Locale locale, boolean flag, int i)
    {
        a = locale;
        b = flag;
        c = i;
    }

    public int a(aa aa1)
    {
        if (aa1.b() == b())
        {
            return toString().compareTo(aa1.toString());
        }
        return !b() ? 1 : -1;
    }

    public Locale a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public int compareTo(Object obj)
    {
        return a((aa)obj);
    }

    public String toString()
    {
        return a.getDisplayCountry(al.a());
    }
}
