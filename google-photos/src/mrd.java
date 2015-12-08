// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractList;
import java.util.List;

final class mrd extends AbstractList
{

    private List a;
    private int b;

    public mrd(List list, int i)
    {
        a = list;
        b = 500;
    }

    public final Object get(int i)
    {
        p.a(i, size());
        i = b * i;
        int j = Math.min(b + i, a.size());
        return a.subList(i, j);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final int size()
    {
        return (int)Math.ceil((double)a.size() / (double)b);
    }
}
