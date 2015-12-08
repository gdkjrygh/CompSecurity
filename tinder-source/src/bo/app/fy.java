// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;

public abstract class fy
{

    fy()
    {
    }

    public fy a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b(iterable.next())) { }
        return this;
    }

    public abstract fy b(Object obj);
}
