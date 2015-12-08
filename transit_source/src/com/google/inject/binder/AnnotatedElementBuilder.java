// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.binder;

import java.lang.annotation.Annotation;

public interface AnnotatedElementBuilder
{

    public abstract void annotatedWith(Class class1);

    public abstract void annotatedWith(Annotation annotation);
}
