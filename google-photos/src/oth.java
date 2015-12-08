// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class oth
    implements Iterator
{

    private int a;
    private int b;

    public oth(int i)
    {
        b = 0;
        a = i;
    }

    public final boolean hasNext()
    {
        return b < a;
    }

    public final Object next()
    {
        int i = b;
        b = b + 1;
        return Integer.valueOf(i);
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
