// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.gson.internal:
//            LinkedTreeMap

abstract class <init>
    implements Iterator
{

    private d a;
    private d b;
    private int c;
    private LinkedTreeMap d;

    final <init> a()
    {
        <init> <init>1 = a;
        if (<init>1 == d.c)
        {
            throw new NoSuchElementException();
        }
        if (d.b != c)
        {
            throw new ConcurrentModificationException();
        } else
        {
            a = <init>1.d;
            b = <init>1;
            return <init>1;
        }
    }

    public final boolean hasNext()
    {
        return a != d.c;
    }

    public final void remove()
    {
        if (b == null)
        {
            throw new IllegalStateException();
        } else
        {
            d.a(b, true);
            b = null;
            c = d.b;
            return;
        }
    }

    private (LinkedTreeMap linkedtreemap)
    {
        d = linkedtreemap;
        super();
        a = d.c.d;
        b = null;
        c = d.b;
    }

    d(LinkedTreeMap linkedtreemap, byte byte0)
    {
        this(linkedtreemap);
    }
}
