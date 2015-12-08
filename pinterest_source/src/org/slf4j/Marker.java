// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

public interface Marker
    extends Serializable
{

    public static final String ANY_MARKER = "*";
    public static final String ANY_NON_NULL_MARKER = "+";

    public abstract void add(Marker marker);

    public abstract boolean contains(String s);

    public abstract boolean contains(Marker marker);

    public abstract boolean equals(Object obj);

    public abstract String getName();

    public abstract boolean hasChildren();

    public abstract boolean hasReferences();

    public abstract int hashCode();

    public abstract Iterator iterator();

    public abstract boolean remove(Marker marker);
}
