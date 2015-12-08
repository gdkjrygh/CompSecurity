// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.util.Map;
import java.util.Set;

public interface BootstrapConfiguration
{

    public abstract Set getConstraintMappingResourcePaths();

    public abstract String getConstraintValidatorFactoryClassName();

    public abstract String getDefaultProviderClassName();

    public abstract Set getDefaultValidatedExecutableTypes();

    public abstract String getMessageInterpolatorClassName();

    public abstract String getParameterNameProviderClassName();

    public abstract Map getProperties();

    public abstract String getTraversableResolverClassName();

    public abstract boolean isExecutableValidationEnabled();
}
