// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.common.base.Preconditions;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject:
//            c

class d
    implements c
{

    final Class a;
    final Annotation b;

    d(Class class1, Annotation annotation)
    {
        a = (Class)Preconditions.checkNotNull(class1, "annotation type");
        b = annotation;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof d))
        {
            return false;
        } else
        {
            obj = (d)obj;
            return a.equals(((d) (obj)).a);
        }
    }

    public Annotation getAnnotation()
    {
        return b;
    }

    public Class getAnnotationType()
    {
        return a;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("@").append(a.getName()).toString();
    }
}
