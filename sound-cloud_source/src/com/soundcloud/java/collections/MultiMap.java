// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public interface MultiMap
{

    public abstract Collection get(Object obj);

    public abstract boolean isEmpty();

    public abstract Set keySet();

    public abstract MultiMap put(Object obj, Object obj1);

    public abstract MultiMap putAll(Object obj, Iterable iterable);

    public abstract int size();

    public abstract Map toMap();
}
