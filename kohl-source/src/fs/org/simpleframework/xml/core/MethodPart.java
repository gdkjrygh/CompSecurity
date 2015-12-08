// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            MethodType

interface MethodPart
{

    public abstract Annotation getAnnotation();

    public abstract Annotation getAnnotation(Class class1);

    public abstract Class getDependent();

    public abstract Class[] getDependents();

    public abstract Method getMethod();

    public abstract MethodType getMethodType();

    public abstract String getName();

    public abstract Class getType();
}
