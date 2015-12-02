// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.common.base.Preconditions;
import com.google.inject.a.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

// Referenced classes of package com.google.inject:
//            e, f, d, b, 
//            c

public class a
{

    private final c a;
    private final f b;
    private final int c;

    private a()
    {
        a = e.INSTANCE;
        b = f.b(getClass());
        c = d();
    }

    private a(f f1, c c1)
    {
        a = c1;
        b = com.google.inject.a.d.a(f1);
        c = d();
    }

    private a(Type type, c c1)
    {
        a = c1;
        b = com.google.inject.a.d.a(f.a(type));
        c = d();
    }

    public static a a(f f1)
    {
        return new a(f1, e.INSTANCE);
    }

    public static a a(f f1, Class class1)
    {
        return new a(f1, b(class1));
    }

    public static a a(f f1, Annotation annotation)
    {
        return new a(f1, a(annotation));
    }

    public static a a(Class class1)
    {
        return new a(class1, e.INSTANCE);
    }

    public static a a(Class class1, Class class2)
    {
        return new a(class1, b(class2));
    }

    public static a a(Type type)
    {
        return new a(type, e.INSTANCE);
    }

    public static a a(Type type, Class class1)
    {
        return new a(type, b(class1));
    }

    public static a a(Type type, Annotation annotation)
    {
        return new a(type, a(annotation));
    }

    static c a(Annotation annotation)
    {
        Preconditions.checkNotNull(annotation, "annotation");
        Class class1 = annotation.annotationType();
        if (com.google.inject.a.a.a(class1))
        {
            return new com.google.inject.d(class1, annotation);
        } else
        {
            return new b(com.google.inject.a.a.a(annotation));
        }
    }

    static c b(Class class1)
    {
        Preconditions.checkNotNull(class1, "annotation type");
        return new com.google.inject.d(com.google.inject.a.a.c(class1), null);
    }

    private int d()
    {
        return b.hashCode() * 31 + a.hashCode();
    }

    public final f a()
    {
        return b;
    }

    public final Class b()
    {
        return a.getAnnotationType();
    }

    public final Annotation c()
    {
        return a.getAnnotation();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            obj = (a)obj;
            if (!a.equals(((a) (obj)).a) || !b.equals(((a) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return c;
    }

    public final String toString()
    {
        return (new StringBuilder()).append("Key[type=").append(b).append(", annotation=").append(a).append("]").toString();
    }
}
