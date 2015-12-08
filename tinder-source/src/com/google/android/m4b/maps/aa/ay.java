// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x

public abstract class ay extends x
{

    private Object a;

    public ay(Object obj)
    {
        a = obj;
    }

    public abstract Object a(Object obj);

    public final boolean hasNext()
    {
        return a != null;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object obj = a;
        a = a(a);
        return obj;
        Exception exception;
        exception;
        a = a(a);
        throw exception;
    }
}
