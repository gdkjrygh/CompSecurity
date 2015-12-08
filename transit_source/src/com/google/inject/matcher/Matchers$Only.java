// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class itions.checkNotNull extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object value;

    public boolean equals(Object obj)
    {
        return (obj instanceof r) && ((r)obj).value.equals(value);
    }

    public int hashCode()
    {
        return value.hashCode() * 37;
    }

    public boolean matches(Object obj)
    {
        return value.equals(obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("only(").append(value).append(")").toString();
    }

    public itions(Object obj)
    {
        value = $Preconditions.checkNotNull(obj, "value");
    }
}
