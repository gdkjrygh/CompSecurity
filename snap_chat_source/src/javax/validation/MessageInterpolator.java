// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import javax.validation.metadata.ConstraintDescriptor;

public interface MessageInterpolator
{
    public static interface Context
    {

        public abstract ConstraintDescriptor getConstraintDescriptor();

        public abstract Object getValidatedValue();

        public abstract Object unwrap$659effca();
    }


    public abstract String interpolate$13aa1267();

    public abstract String interpolate$51ff7c6e();
}
