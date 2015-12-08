// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;

public abstract class Annotated
{

    protected Annotated()
    {
    }

    public abstract AnnotatedElement getAnnotated();

    public abstract Annotation getAnnotation(Class class1);

    public abstract Type getGenericType();

    public abstract String getName();

    public abstract Class getRawType();

    public JavaType getType(TypeBindings typebindings)
    {
        return typebindings.resolveType(getGenericType());
    }

    public final boolean hasAnnotation(Class class1)
    {
        return getAnnotation(class1) != null;
    }
}
