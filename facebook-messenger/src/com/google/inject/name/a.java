// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.name;

import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.inject.name:
//            Named

class a
    implements Named, Serializable
{

    private final String a;

    public a(String s)
    {
        a = (String)Preconditions.checkNotNull(s, "name");
    }

    public Class annotationType()
    {
        return com/google/inject/name/Named;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Named))
        {
            return false;
        } else
        {
            obj = (Named)obj;
            return a.equals(((Named) (obj)).value());
        }
    }

    public int hashCode()
    {
        return "value".hashCode() * 127 ^ a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("@").append(com/google/inject/name/Named.getName()).append("(value=").append(a).append(")").toString();
    }

    public String value()
    {
        return a;
    }
}
