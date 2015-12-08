// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.security.InvalidParameterException;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartCollection, ab

public final class ChartNamedCollection extends ChartCollection
{

    private static final long serialVersionUID = 0xbf42e9c5bea9e2eeL;
    private final String a;

    protected ChartNamedCollection(ChartCollection.a a1, String s)
    {
        super(a1);
        a = s;
    }

    public final ab a(String s)
    {
        if (s != null)
        {
            int j = size();
            for (int i = 0; i < j; i++)
            {
                ab ab1 = (ab)get(i);
                if (s.equalsIgnoreCase(ab1.a()))
                {
                    return ab1;
                }
            }

        }
        return null;
    }

    protected final void a(ab ab1)
    {
        int i;
        if (contains(ab1))
        {
            throw new InvalidParameterException("This series already presents");
        }
        String s = ab1.a();
        if (s == null || s.length() == 0)
        {
            i = size();
            break MISSING_BLOCK_LABEL_41;
        } else
        {
            c(s);
            return;
        }
        do
        {
            s = (new StringBuilder()).append(a).append(i).toString();
            if (!b(s))
            {
                ab1.a(s);
                return;
            }
            i++;
        } while (true);
    }

    protected final volatile void a(Object obj)
    {
        a((ab)obj);
    }

    public final boolean b(String s)
    {
        return a(s) != null;
    }

    protected final void c(String s)
    {
        if (b(s))
        {
            throw new InvalidParameterException("This name already presents");
        } else
        {
            return;
        }
    }
}
