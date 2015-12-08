// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Function, Functions, Objects

private static class value
    implements Function, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object value;

    public Object apply(Object obj)
    {
        return value;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof value)
        {
            obj = (value)obj;
            return Objects.equal(value, ((value) (obj)).value);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        if (value == null)
        {
            return 0;
        } else
        {
            return value.hashCode();
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("constant(").append(value).append(")").toString();
    }

    public (Object obj)
    {
        value = obj;
    }
}
