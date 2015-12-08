// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.spi;

import javax.validation.Configuration;
import javax.validation.ValidatorFactory;

public interface ValidationProvider
{

    public abstract ValidatorFactory buildValidatorFactory$1f14e60d();

    public abstract Configuration createGenericConfiguration$6e4efa3();

    public abstract Configuration createSpecializedConfiguration$6e4efa3();
}
