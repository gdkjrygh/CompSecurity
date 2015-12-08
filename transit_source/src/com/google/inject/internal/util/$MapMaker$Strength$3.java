// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker

static final class nit> extends nit>
{

    try copyEntry(Object obj, try try1, try try2)
    {
        try1 = ()try1;
        if (try2 == null)
        {
            return new ((() (try1)).internals, obj, (() (try1)).hash);
        } else
        {
            return new gEntry((() (try1)).internals, obj, (() (try1)).hash, try2);
        }
    }

    boolean equal(Object obj, Object obj1)
    {
        return obj.equals(obj1);
    }

    int hash(Object obj)
    {
        return obj.hashCode();
    }

    try newEntry(Map.Internals internals, Object obj, int i, try try1)
    {
        if (try1 == null)
        {
            return new (internals, obj, i);
        } else
        {
            return new gEntry(internals, obj, i, try1);
        }
    }

    nce referenceValue(try try1, Object obj)
    {
        return new Reference(obj);
    }

    nce(String s, int i)
    {
        super(s, i, null);
    }
}
