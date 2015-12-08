// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import javax.validation.metadata.ConstraintDescriptor;

// Referenced classes of package javax.validation:
//            Path

public interface ConstraintViolation
{

    public abstract ConstraintDescriptor getConstraintDescriptor();

    public abstract Object[] getExecutableParameters();

    public abstract Object getExecutableReturnValue();

    public abstract Object getInvalidValue();

    public abstract Object getLeafBean();

    public abstract String getMessage();

    public abstract String getMessageTemplate();

    public abstract Path getPropertyPath();

    public abstract Object getRootBean();

    public abstract Class getRootBeanClass();

    public abstract Object unwrap$659effca();
}
