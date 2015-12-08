// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.constraints;

import java.lang.annotation.Annotation;

public interface Digits
    extends Annotation
{
    public static interface List
        extends Annotation
    {

        public abstract Digits[] value();
    }


    public abstract int fraction();

    public abstract Class[] groups();

    public abstract int integer();

    public abstract String message();

    public abstract Class[] payload();
}
