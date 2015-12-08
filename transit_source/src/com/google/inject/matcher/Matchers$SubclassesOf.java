// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class heckNotNull extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Class superclass;

    public boolean equals(Object obj)
    {
        return (obj instanceof heckNotNull) && ((heckNotNull)obj).superclass.equals(superclass);
    }

    public int hashCode()
    {
        return superclass.hashCode() * 37;
    }

    public boolean matches(Class class1)
    {
        return superclass.isAssignableFrom(class1);
    }

    public volatile boolean matches(Object obj)
    {
        return matches((Class)obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append("subclassesOf(").append(superclass.getSimpleName()).append(".class)").toString();
    }

    public (Class class1)
    {
        superclass = (Class)$Preconditions.checkNotNull(class1, "superclass");
    }
}
