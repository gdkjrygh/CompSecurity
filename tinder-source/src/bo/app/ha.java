// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.NoSuchElementException;

// Referenced classes of package bo.app:
//            hv

final class ha extends hv
{

    boolean a;
    final Object b;

    ha(Object obj)
    {
        b = obj;
        super();
    }

    public final boolean hasNext()
    {
        return !a;
    }

    public final Object next()
    {
        if (a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b;
        }
    }
}
