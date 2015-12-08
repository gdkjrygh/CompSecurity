// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class cux
    implements cvb
{

    private final Iterator a;
    private boolean b;
    private Object c;

    public cux(Iterator iterator)
    {
        a = (Iterator)ctz.a(iterator);
    }

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
        ctz.b(flag, "Can't remove after you've peeked at next");
        a.remove();
    }
}
