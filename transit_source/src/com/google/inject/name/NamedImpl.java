// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.name;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.inject.name:
//            Named

class NamedImpl
    implements Named, Serializable
{

    private static final long serialVersionUID = 0L;
    private final String value;

    public NamedImpl(String s)
    {
        value = (String)$Preconditions.checkNotNull(s, "name");
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
            return value.equals(((Named) (obj)).value());
        }
    }

    public int hashCode()
    {
        return "value".hashCode() * 127 ^ value.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("@").append(com/google/inject/name/Named.getName()).append("(value=").append(value).append(")").toString();
    }

    public String value()
    {
        return value;
    }
}
