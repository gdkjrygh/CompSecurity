// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ore
    implements Iterator
{

    private final int a[];
    private final int b;
    private int c;

    public ore(int ai[])
    {
        this(ai, 0, ai.length);
    }

    public ore(int ai[], int i, int j)
    {
        a = (int[])p.a(ai);
        c = p.b(i, ai.length);
        b = p.b(i + j, ai.length);
    }

    public boolean hasNext()
    {
        return c < b;
    }

    public Object next()
    {
        if (hasNext())
        {
            int ai[] = a;
            int i = c;
            c = i + 1;
            return Integer.valueOf(ai[i]);
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
