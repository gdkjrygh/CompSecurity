// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotationMap, AnnotatedParameter

public abstract class AnnotatedWithParams extends AnnotatedMember
{

    protected final AnnotationMap _paramAnnotations[];

    protected AnnotatedWithParams(AnnotationMap annotationmap, AnnotationMap aannotationmap[])
    {
        super(annotationmap);
        _paramAnnotations = aannotationmap;
    }

    public final void addOrOverrideParam(int i, Annotation annotation)
    {
        AnnotationMap annotationmap1 = _paramAnnotations[i];
        AnnotationMap annotationmap = annotationmap1;
        if (annotationmap1 == null)
        {
            annotationmap = new AnnotationMap();
            _paramAnnotations[i] = annotationmap;
        }
        annotationmap.add(annotation);
    }

    public abstract Object call()
        throws Exception;

    public abstract Object call(Object aobj[])
        throws Exception;

    public abstract Object call1(Object obj)
        throws Exception;

    public final Annotation getAnnotation(Class class1)
    {
        return _annotations.get(class1);
    }

    public abstract Type getGenericParameterType(int i);

    public final AnnotatedParameter getParameter(int i)
    {
        return new AnnotatedParameter(this, getGenericParameterType(i), getParameterAnnotations(i), i);
    }

    public final AnnotationMap getParameterAnnotations(int i)
    {
        if (_paramAnnotations != null && i >= 0 && i <= _paramAnnotations.length)
        {
            return _paramAnnotations[i];
        } else
        {
            return null;
        }
    }

    protected JavaType getType(TypeBindings typebindings, TypeVariable atypevariable[])
    {
        Object obj = typebindings;
        if (atypevariable != null)
        {
            obj = typebindings;
            if (atypevariable.length > 0)
            {
                TypeBindings typebindings1 = typebindings.childInstance();
                int j = atypevariable.length;
                int i = 0;
                do
                {
                    obj = typebindings1;
                    if (i >= j)
                    {
                        break;
                    }
                    obj = atypevariable[i];
                    typebindings1._addPlaceholder(((TypeVariable) (obj)).getName());
                    typebindings = ((TypeVariable) (obj)).getBounds()[0];
                    if (typebindings == null)
                    {
                        typebindings = TypeFactory.unknownType();
                    } else
                    {
                        typebindings = typebindings1.resolveType(typebindings);
                    }
                    typebindings1.addBinding(((TypeVariable) (obj)).getName(), typebindings);
                    i++;
                } while (true);
            }
        }
        return ((TypeBindings) (obj)).resolveType(getGenericType());
    }

    protected AnnotatedParameter replaceParameterAnnotations(int i, AnnotationMap annotationmap)
    {
        _paramAnnotations[i] = annotationmap;
        return getParameter(i);
    }
}
