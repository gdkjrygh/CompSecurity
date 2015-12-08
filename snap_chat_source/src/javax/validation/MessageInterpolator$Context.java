// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import javax.validation.metadata.ConstraintDescriptor;

// Referenced classes of package javax.validation:
//            MessageInterpolator

public static interface r
{

    public abstract ConstraintDescriptor getConstraintDescriptor();

    public abstract Object getValidatedValue();

    public abstract Object unwrap$659effca();
}
