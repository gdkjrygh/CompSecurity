// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            Annotated, AnnotationMap

public abstract class AnnotatedMember extends Annotated
    implements Serializable
{

    protected final transient AnnotationMap _annotations;

    protected AnnotatedMember(AnnotationMap annotationmap)
    {
        _annotations = annotationmap;
    }

    public final void addIfNotPresent(Annotation annotation)
    {
        _annotations.addIfNotPresent(annotation);
    }

    public final void addOrOverride(Annotation annotation)
    {
        _annotations.add(annotation);
    }

    public final void fixAccess()
    {
        ClassUtil.checkAndFixAccess(getMember());
    }

    protected AnnotationMap getAllAnnotations()
    {
        return _annotations;
    }

    public abstract Class getDeclaringClass();

    public abstract Member getMember();

    public abstract Object getValue(Object obj)
        throws UnsupportedOperationException, IllegalArgumentException;

    public abstract void setValue(Object obj, Object obj1)
        throws UnsupportedOperationException, IllegalArgumentException;
}
