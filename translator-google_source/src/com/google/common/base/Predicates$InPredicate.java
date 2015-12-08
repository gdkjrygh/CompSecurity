// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package com.google.common.base:
//            q, p, r

class <init>
    implements q, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Collection target;

    public boolean apply(Object obj)
    {
        boolean flag;
        try
        {
            flag = target.contains(obj);
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

    public boolean equals(Object obj)
    {
        if (obj instanceof target)
        {
            obj = (target)obj;
            return target.equals(((target) (obj)).target);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return target.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Predicates.in(")).append(target).append(")").toString();
    }

    private (Collection collection)
    {
        target = (Collection)p.a(collection);
    }

    target(Collection collection, r r)
    {
        this(collection);
    }
}
