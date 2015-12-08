// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.binder;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.inject.binder:
//            LinkedBindingBuilder

public interface AnnotatedBindingBuilder
    extends LinkedBindingBuilder
{

    public abstract LinkedBindingBuilder annotatedWith(Class class1);

    public abstract LinkedBindingBuilder annotatedWith(Annotation annotation);
}
