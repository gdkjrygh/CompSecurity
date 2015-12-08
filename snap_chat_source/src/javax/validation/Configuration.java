// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            ValidatorFactory, BootstrapConfiguration, ConstraintValidatorFactory, MessageInterpolator, 
//            ParameterNameProvider, TraversableResolver

public interface Configuration
{

    public abstract Configuration addMapping$76789b8e();

    public abstract Configuration addProperty$4bfc3d9d();

    public abstract ValidatorFactory buildValidatorFactory();

    public abstract Configuration constraintValidatorFactory$5c1d114e();

    public abstract BootstrapConfiguration getBootstrapConfiguration();

    public abstract ConstraintValidatorFactory getDefaultConstraintValidatorFactory();

    public abstract MessageInterpolator getDefaultMessageInterpolator();

    public abstract ParameterNameProvider getDefaultParameterNameProvider();

    public abstract TraversableResolver getDefaultTraversableResolver();

    public abstract Configuration ignoreXmlConfiguration();

    public abstract Configuration messageInterpolator$3ead4207();

    public abstract Configuration parameterNameProvider$5e4f6410();

    public abstract Configuration traversableResolver$7ab50962();
}
