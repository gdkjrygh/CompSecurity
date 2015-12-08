// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.NoSuchElementException;

// Referenced classes of package bo.app:
//            hw

final class gy extends hw
{

    gy()
    {
    }

    public final boolean hasNext()
    {
        return false;
    }

    public final boolean hasPrevious()
    {
        return false;
    }

    public final Object next()
    {
        throw new NoSuchElementException();
    }

    public final int nextIndex()
    {
        return 0;
    }

    public final Object previous()
    {
        throw new NoSuchElementException();
    }

    public final int previousIndex()
    {
        return -1;
    }
}
