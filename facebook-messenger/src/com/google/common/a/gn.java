// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            gg

final class gn
    implements Iterator
{

    Iterator a;
    Iterator b;
    final Iterator c;

    gn(Iterator iterator)
    {
        c = iterator;
        super();
        a = gg.a();
    }

    public boolean hasNext()
    {
        do
        {
            boolean flag = ((Iterator)Preconditions.checkNotNull(a)).hasNext();
            if (!flag && c.hasNext())
            {
                a = (Iterator)c.next();
            } else
            {
                return flag;
            }
        } while (true);
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            b = a;
            return a.next();
        }
    }

    public void remove()
    {
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "no calls to next() since last call to remove()");
        b.remove();
        b = null;
    }
}
