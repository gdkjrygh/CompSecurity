// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.lang.annotation.Annotation;

public interface OverridesAttribute
    extends Annotation
{
    public static interface List
        extends Annotation
    {

        public abstract OverridesAttribute[] value();
    }


    public abstract Class constraint();

    public abstract int constraintIndex();

    public abstract String name();
}
