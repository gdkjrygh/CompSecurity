// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;


final class IDKey
{

    private final int id;
    private final Object value;

    public IDKey(Object obj)
    {
        id = System.identityHashCode(obj);
        value = obj;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof IDKey)
        {
            if (id == ((IDKey) (obj = (IDKey)obj)).id && value == ((IDKey) (obj)).value)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return id;
    }
}
