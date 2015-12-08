// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.util.$Preconditions;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            Key

static class annotation
    implements annotation
{

    final Annotation annotation;
    final Class annotationType;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof annotation))
        {
            return false;
        } else
        {
            obj = (annotation)obj;
            return annotationType.equals(((annotationType) (obj)).annotationType);
        }
    }

    public Annotation getAnnotation()
    {
        return annotation;
    }

    public Class getAnnotationType()
    {
        return annotationType;
    }

    public boolean hasAttributes()
    {
        return false;
    }

    public int hashCode()
    {
        return annotationType.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("@").append(annotationType.getName()).toString();
    }

    public annotationType withoutAttributes()
    {
        throw new UnsupportedOperationException("Key already has no attributes.");
    }

    s(Class class1, Annotation annotation1)
    {
        annotationType = (Class)$Preconditions.checkNotNull(class1, "annotation type");
        annotation = annotation1;
    }
}
