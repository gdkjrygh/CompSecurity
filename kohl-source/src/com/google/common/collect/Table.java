// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface Table
{
    public static interface Cell
    {

        public abstract boolean equals(Object obj);

        public abstract Object getColumnKey();

        public abstract Object getRowKey();

        public abstract Object getValue();

        public abstract int hashCode();
    }


    public abstract Set cellSet();

    public abstract void clear();

    public abstract Map column(Object obj);

    public abstract Set columnKeySet();

    public abstract Map columnMap();

    public abstract boolean contains(Object obj, Object obj1);

    public abstract boolean containsColumn(Object obj);

    public abstract boolean containsRow(Object obj);

    public abstract boolean containsValue(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object get(Object obj, Object obj1);

    public abstract int hashCode();

    public abstract boolean isEmpty();

    public abstract Object put(Object obj, Object obj1, Object obj2);

    public abstract void putAll(Table table);

    public abstract Object remove(Object obj, Object obj1);

    public abstract Map row(Object obj);

    public abstract Set rowKeySet();

    public abstract Map rowMap();

    public abstract int size();

    public abstract Collection values();
}
