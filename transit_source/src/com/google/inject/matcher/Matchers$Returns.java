// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers, Matcher

private static class ons.checkNotNull extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Matcher returnType;

    public boolean equals(Object obj)
    {
        return (obj instanceof ons.checkNotNull) && ((ons.checkNotNull)obj).returnType.equals(returnType);
    }

    public int hashCode()
    {
        return returnType.hashCode() * 37;
    }

    public volatile boolean matches(Object obj)
    {
        return matches((Method)obj);
    }

    public boolean matches(Method method)
    {
        return returnType.matches(method.getReturnType());
    }

    public String toString()
    {
        return (new StringBuilder()).append("returns(").append(returnType).append(")").toString();
    }

    public ons(Matcher matcher)
    {
        returnType = (Matcher)$Preconditions.checkNotNull(matcher, "return type matcher");
    }
}
