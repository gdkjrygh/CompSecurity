// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.TypeLiteral;
import java.lang.annotation.Annotation;
import javax.inject.Inject;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static abstract class optional
{

    final TypeLiteral declaringType;
    final boolean jsr330;
    optional next;
    final boolean optional;
    optional previous;

    abstract InjectionPoint toInjectionPoint();

    (TypeLiteral typeliteral, Annotation annotation)
    {
        declaringType = typeliteral;
        if (annotation.annotationType() == javax/inject/Inject)
        {
            optional = false;
            jsr330 = true;
            return;
        } else
        {
            jsr330 = false;
            optional = ((com.google.inject.Inject)annotation).optional();
            return;
        }
    }
}
