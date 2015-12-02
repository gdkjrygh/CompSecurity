// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface jf
    extends Collection
{

    public abstract int a(Object obj);

    public abstract int a(Object obj, int i);

    public abstract boolean add(Object obj);

    public abstract int b(Object obj, int i);

    public abstract Set b();

    public abstract boolean contains(Object obj);

    public abstract boolean containsAll(Collection collection);

    public abstract Set f();

    public abstract Iterator iterator();

    public abstract boolean remove(Object obj);
}
