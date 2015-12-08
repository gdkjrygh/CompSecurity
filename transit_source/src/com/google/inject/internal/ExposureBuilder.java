// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.binder.AnnotatedElementBuilder;
import com.google.inject.internal.util.$Preconditions;
import java.lang.annotation.Annotation;

public class ExposureBuilder
    implements AnnotatedElementBuilder
{

    private final Binder binder;
    private Key key;
    private final Object source;

    public ExposureBuilder(Binder binder1, Object obj, Key key1)
    {
        binder = binder1;
        source = obj;
        key = key1;
    }

    public void annotatedWith(Class class1)
    {
        $Preconditions.checkNotNull(class1, "annotationType");
        checkNotAnnotated();
        key = Key.get(key.getTypeLiteral(), class1);
    }

    public void annotatedWith(Annotation annotation)
    {
        $Preconditions.checkNotNull(annotation, "annotation");
        checkNotAnnotated();
        key = Key.get(key.getTypeLiteral(), annotation);
    }

    protected void checkNotAnnotated()
    {
        if (key.getAnnotationType() != null)
        {
            binder.addError("More than one annotation is specified for this binding.", new Object[0]);
        }
    }

    public Key getKey()
    {
        return key;
    }

    public Object getSource()
    {
        return source;
    }

    public String toString()
    {
        return "AnnotatedElementBuilder";
    }
}
