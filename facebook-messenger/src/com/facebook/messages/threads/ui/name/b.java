// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;

import com.google.common.a.gg;
import com.google.common.a.jr;
import java.util.Collection;

class b
    implements jr
{

    private final jr a;
    private int b;

    private b(Collection collection)
    {
        a = gg.g(collection.iterator());
        b = collection.size();
    }

    public static b a(Collection collection)
    {
        return new b(collection);
    }

    public Object a()
    {
        return a.a();
    }

    public int b()
    {
        return b;
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        Object obj = a.next();
        b = b - 1;
        return obj;
    }

    public void remove()
    {
        a.remove();
    }
}
