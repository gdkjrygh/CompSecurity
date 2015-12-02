// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.common.base.Preconditions;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            c

class b
    implements c
{

    final Annotation a;

    b(Annotation annotation)
    {
        a = (Annotation)Preconditions.checkNotNull(annotation, "annotation");
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof b))
        {
            return false;
        } else
        {
            obj = (b)obj;
            return a.equals(((b) (obj)).a);
        }
    }

    public Annotation getAnnotation()
    {
        return a;
    }

    public Class getAnnotationType()
    {
        return a.annotationType();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return a.toString();
    }
}
