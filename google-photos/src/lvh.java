// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class lvh extends lvj
{

    private lvg b;

    lvh(lvg lvg1)
    {
        b = lvg1;
        super();
    }

    protected final int a()
    {
        return b.b;
    }

    protected final int a(Object obj)
    {
        if (obj == null)
        {
            return lvg.a(b);
        } else
        {
            return lvg.a(b, obj, obj.hashCode());
        }
    }

    protected final Object a(int i)
    {
        return b.a[i];
    }

    protected final Map b()
    {
        throw new UnsupportedOperationException("not a map");
    }

    protected final void b(int i)
    {
        b.a(i);
    }

    protected final void c()
    {
        b.clear();
    }
}
