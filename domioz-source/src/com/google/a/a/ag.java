// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package com.google.a.a:
//            ae, ad

final class ag
    implements ae, Serializable
{

    private final Collection a;

    private ag(Collection collection)
    {
        a = (Collection)ad.a(collection);
    }

    ag(Collection collection, byte byte0)
    {
        this(collection);
    }

    public final boolean apply(Object obj)
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
        if (obj instanceof ag)
        {
            obj = (ag)obj;
            return a.equals(((ag) (obj)).a);
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
        String s = String.valueOf(String.valueOf(a));
        return (new StringBuilder(s.length() + 15)).append("Predicates.in(").append(s).append(")").toString();
    }
}
