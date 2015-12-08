// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x, e

static final class nit> extends x
{

    private boolean a;
    private Object b;

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

    (Object obj)
    {
        b = obj;
        super();
    }
}
