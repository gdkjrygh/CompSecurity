// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.util.$Preconditions;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            Key

static class eckNotNull
    implements eckNotNull
{

    final Annotation annotation;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof eckNotNull))
        {
            return false;
        } else
        {
            obj = (eckNotNull)obj;
            return annotation.equals(((annotation) (obj)).annotation);
        }
    }

    public Annotation getAnnotation()
    {
        return annotation;
    }

    public Class getAnnotationType()
    {
        return annotation.annotationType();
    }

    public boolean hasAttributes()
    {
        return true;
    }

    public int hashCode()
    {
        return annotation.hashCode();
    }

    public String toString()
    {
        return annotation.toString();
    }

    public annotation withoutAttributes()
    {
        return new t>(getAnnotationType(), annotation);
    }

    (Annotation annotation1)
    {
        annotation = (Annotation)$Preconditions.checkNotNull(annotation1, "annotation");
    }
}
