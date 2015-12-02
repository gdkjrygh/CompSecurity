// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            mh

final class gk extends mh
{

    boolean a;
    final Object b;

    gk(Object obj)
    {
        b = obj;
        super();
    }

    public boolean hasNext()
    {
        return !a;
    }

    public Object next()
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
