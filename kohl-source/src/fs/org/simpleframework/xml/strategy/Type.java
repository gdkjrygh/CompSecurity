// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.strategy;

import java.lang.annotation.Annotation;

public interface Type
{

    public abstract Annotation getAnnotation(Class class1);

    public abstract Class getType();
}
