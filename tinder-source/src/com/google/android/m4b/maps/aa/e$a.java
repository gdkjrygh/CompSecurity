// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            r, e

static final class a
    implements r
{

    private final Iterator a;
    private boolean b;
    private Object c;

    public final Object a()
    {
        if (!b)
        {
            c = a.next();
            b = true;
        }
        return c;
    }

    public final boolean hasNext()
    {
        return b || a.hasNext();
    }

    public final Object next()
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

    public final void remove()
    {
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, "Can't remove after you've peeked at next");
        a.remove();
    }

    public (Iterator iterator)
    {
        a = (Iterator)j.a(iterator);
    }
}
