// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            jr

class gq
    implements jr
{

    private final Iterator a;
    private boolean b;
    private Object c;

    public gq(Iterator iterator)
    {
        a = (Iterator)Preconditions.checkNotNull(iterator);
    }

    public Object a()
    {
        if (!b)
        {
            c = a.next();
            b = true;
        }
        return c;
    }

    public boolean hasNext()
    {
        return b || a.hasNext();
    }

    public Object next()
    {
        if (!b)
        {
            return a.next();
        } else
        {
            Object obj = c;
            b = false;
            c = null;
            return obj;
        }
    }

    public void remove()
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Can't remove after you've peeked at next");
        a.remove();
    }
}
