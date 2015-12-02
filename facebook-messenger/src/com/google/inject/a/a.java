// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.inject.BindingAnnotation;
import com.google.inject.ScopeAnnotation;
import com.google.inject.name.b;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Scope;

// Referenced classes of package com.google.inject.a:
//            b

public class a
{

    private static final com.google.inject.a.b a = new com.google.inject.a.b(Arrays.asList(new Class[] {
        com/google/inject/ScopeAnnotation, javax/inject/Scope
    }));
    private static final com.google.inject.a.b b = new com.google.inject.a.b(Arrays.asList(new Class[] {
        com/google/inject/BindingAnnotation, javax/inject/Qualifier
    }));

    public a()
    {
    }

    public static Annotation a(Annotation annotation)
    {
        Object obj = annotation;
        if (annotation instanceof Named)
        {
            obj = com.google.inject.name.b.a(((Named)annotation).value());
        }
        return ((Annotation) (obj));
    }

    public static boolean a(Class class1)
    {
        return class1.getDeclaredMethods().length == 0;
    }

    public static boolean b(Class class1)
    {
        return b.a(class1);
    }

    public static Class c(Class class1)
    {
        Object obj = class1;
        if (class1 == javax/inject/Named)
        {
            obj = com/google/inject/name/Named;
        }
        return ((Class) (obj));
    }

}
