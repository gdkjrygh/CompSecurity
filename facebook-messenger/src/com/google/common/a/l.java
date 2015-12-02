// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            mh, n, m

public abstract class l extends mh
{

    private n a;
    private Object b;

    protected l()
    {
        a = n.NOT_READY;
    }

    private boolean c()
    {
        a = n.FAILED;
        b = a();
        if (a != n.DONE)
        {
            a = n.READY;
            return true;
        } else
        {
            return false;
        }
    }

    protected abstract Object a();

    protected final Object b()
    {
        a = n.DONE;
        return null;
    }

    public final boolean hasNext()
    {
        boolean flag1 = false;
        boolean flag;
        if (a != n.FAILED)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        flag = flag1;
        switch (m.a[a.ordinal()])
        {
        default:
            flag = c();
            // fall through

        case 1: // '\001'
            return flag;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = n.NOT_READY;
            return b;
        }
    }
}
