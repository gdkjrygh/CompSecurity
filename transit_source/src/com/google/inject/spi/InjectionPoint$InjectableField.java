// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.TypeLiteral;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static class field extends 
{

    final Field field;

    InjectionPoint toInjectionPoint()
    {
        return new InjectionPoint(declaringType, field, optional);
    }

    (TypeLiteral typeliteral, Field field1, Annotation annotation)
    {
        super(typeliteral, annotation);
        field = field1;
    }
}
