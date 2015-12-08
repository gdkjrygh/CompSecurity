// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.Iterator;

public abstract class eu
{

    eu()
    {
    }

    public eu a(Iterable iterable)
    {
        for (iterable = iterable.iterator(); iterable.hasNext(); b(iterable.next())) { }
        return this;
    }

    public abstract eu b(Object obj);
}
