// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableMap, $ImmutableSet, $ImmutableCollection

private static final class <init> extends $ImmutableMap
{

    public boolean containsKey(Object obj)
    {
        return false;
    }

    public boolean containsValue(Object obj)
    {
        return false;
    }

    public $ImmutableSet entrySet()
    {
        return $ImmutableSet.of();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Map)
        {
            return ((Map)obj).isEmpty();
        } else
        {
            return false;
        }
    }

    public Object get(Object obj)
    {
        return null;
    }

    public int hashCode()
    {
        return 0;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public $ImmutableSet keySet()
    {
        return $ImmutableSet.of();
    }

    public volatile Set keySet()
    {
        return keySet();
    }

    public int size()
    {
        return 0;
    }

    public String toString()
    {
        return "{}";
    }

    public $ImmutableCollection values()
    {
        return $ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION;
    }

    public volatile Collection values()
    {
        return values();
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
