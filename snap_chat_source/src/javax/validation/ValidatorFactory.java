// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            ConstraintValidatorFactory, MessageInterpolator, ParameterNameProvider, TraversableResolver, 
//            Validator, ValidatorContext

public interface ValidatorFactory
{

    public abstract void close();

    public abstract ConstraintValidatorFactory getConstraintValidatorFactory();

    public abstract MessageInterpolator getMessageInterpolator();

    public abstract ParameterNameProvider getParameterNameProvider();

    public abstract TraversableResolver getTraversableResolver();

    public abstract Validator getValidator();

    public abstract Object unwrap$659effca();

    public abstract ValidatorContext usingContext();
}
