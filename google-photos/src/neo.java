// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class neo
    implements Iterator
{

    private List a;
    private int b;

    neo(List list)
    {
        a = list;
    }

    public final Object a()
    {
        return a.get(b);
    }

    public final boolean hasNext()
    {
        return b < a.size();
    }

    public final Object next()
    {
        List list = a;
        int i = b;
        b = i + 1;
        return list.get(i);
    }

    public final void remove()
    {
        a.remove(b);
    }
}
