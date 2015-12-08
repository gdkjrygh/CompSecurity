// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;

// Referenced classes of package com.google.inject.matcher:
//            AbstractMatcher, Matchers

private static class otNull extends AbstractMatcher
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Class annotationType;

    public boolean equals(Object obj)
    {
        return (obj instanceof otNull) && ((otNull)obj).annotationType.equals(annotationType);
    }

    public int hashCode()
    {
        return annotationType.hashCode() * 37;
    }

    public volatile boolean matches(Object obj)
    {
        return matches((AnnotatedElement)obj);
    }

    public boolean matches(AnnotatedElement annotatedelement)
    {
        return annotatedelement.getAnnotation(annotationType) != null;
    }

    public String toString()
    {
        return (new StringBuilder()).append("annotatedWith(").append(annotationType.getSimpleName()).append(".class)").toString();
    }

    public (Class class1)
    {
        annotationType = (Class)$Preconditions.checkNotNull(class1, "annotation type");
        Matchers.access$200(class1);
    }
}
