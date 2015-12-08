// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.c.b:
//            b, az, av, f, 
//            g, aq

public static abstract class ject
    implements 
{

    private static void a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            if (iterable.next() == null)
            {
                throw new NullPointerException();
            }
        }

    }

    protected static void a(Iterable iterable, Collection collection)
    {
        if (iterable == null)
        {
            throw new NullPointerException();
        }
        if (iterable instanceof az)
        {
            a(((Iterable) (((az)iterable).d())));
            collection.addAll((Collection)iterable);
        } else
        {
            if (iterable instanceof Collection)
            {
                a(iterable);
                collection.addAll((Collection)iterable);
                return;
            }
            iterable = iterable.iterator();
            while (iterable.hasNext()) 
            {
                Object obj = iterable.next();
                if (obj == null)
                {
                    throw new NullPointerException();
                }
                collection.add(obj);
            }
        }
    }

    public ject a(f f1, aq aq)
    {
        try
        {
            f1 = f1.h();
            b(f1, aq);
            f1.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw f1;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", f1);
        }
        return this;
    }

    public abstract ring b(g g1, aq aq);

    public abstract ring c();

    public  c(g g1, aq aq)
    {
        return b(g1, aq);
    }

    public Object clone()
    {
        return c();
    }

    public ject()
    {
    }
}
