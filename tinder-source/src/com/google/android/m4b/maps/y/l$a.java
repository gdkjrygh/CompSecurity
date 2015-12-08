// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package com.google.android.m4b.maps.y:
//            k, l, j

static final class <init>
    implements k, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Collection a;

    public final boolean a(Object obj)
    {
        boolean flag;
        try
        {
            flag = a.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof a)
        {
            obj = (a)obj;
            return a.equals(((a) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("Predicates.in(")).append(a).append(")").toString();
    }

    private (Collection collection)
    {
        a = (Collection)j.a(collection);
    }

    a(Collection collection, byte byte0)
    {
        this(collection);
    }
}
