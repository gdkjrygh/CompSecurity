// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matcher

private static class b extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Matcher a;
    private final Matcher b;

    public boolean equals(Object obj)
    {
        return (obj instanceof b) && ((b)obj).a.equals(a) && ((a)obj).b.equals(b);
    }

    public int hashCode()
    {
        return (a.hashCode() ^ b.hashCode()) * 37;
    }

    public boolean matches(Object obj)
    {
        return a.matches(obj) || b.matches(obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("or(").append(a).append(", ").append(b).append(")").toString();
    }

    public _cls9(Matcher matcher, Matcher matcher1)
    {
        a = matcher;
        b = matcher1;
    }
}
