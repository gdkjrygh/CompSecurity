// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.List;
import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            c

final class <init> extends <init>
    implements ListIterator
{

    private b b;

    private ListIterator b()
    {
        a();
        return (ListIterator)super.a;
    }

    public final void add(Object obj)
    {
        boolean flag = b.Empty();
        b().add(obj);
        c.c(b.b);
        if (flag)
        {
            b.b();
        }
    }

    public final boolean hasPrevious()
    {
        return b().hasPrevious();
    }

    public final int nextIndex()
    {
        return b().nextIndex();
    }

    public final Object previous()
    {
        return b().previous();
    }

    public final int previousIndex()
    {
        return b().previousIndex();
    }

    public final void set(Object obj)
    {
        b().set(obj);
    }

    ( )
    {
        b = ;
        super();
    }

    public <init>(<init> <init>1, int i)
    {
        b = <init>1;
        super(<init>1, ((List)((<init>) (<init>1)).<init>).listIterator(i));
    }
}
