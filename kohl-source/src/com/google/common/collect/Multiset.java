// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public interface Multiset
    extends Collection
{
    public static interface Entry
    {

        public abstract boolean equals(Object obj);

        public abstract int getCount();

        public abstract Object getElement();

        public abstract int hashCode();

        public abstract String toString();
    }


    public abstract int add(Object obj, int i);

    public abstract boolean add(Object obj);

    public abstract boolean contains(Object obj);

    public abstract boolean containsAll(Collection collection);

    public abstract int count(Object obj);

    public abstract Set elementSet();

    public abstract Set entrySet();

    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    public abstract Iterator iterator();

    public abstract int remove(Object obj, int i);

    public abstract boolean remove(Object obj);

    public abstract boolean removeAll(Collection collection);

    public abstract boolean retainAll(Collection collection);

    public abstract int setCount(Object obj, int i);

    public abstract boolean setCount(Object obj, int i, int j);

    public abstract String toString();
}
