// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            Validator

public interface ValidatorContext
{

    public abstract ValidatorContext constraintValidatorFactory$27f4de11();

    public abstract Validator getValidator();

    public abstract ValidatorContext messageInterpolator$41a10a96();

    public abstract ValidatorContext parameterNameProvider$7637bfed();

    public abstract ValidatorContext traversableResolver$ed9415b();
}
