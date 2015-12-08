// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.spi;

import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.MessageInterpolator;
import javax.validation.ParameterNameProvider;
import javax.validation.TraversableResolver;

public interface ConfigurationState
{

    public abstract ConstraintValidatorFactory getConstraintValidatorFactory();

    public abstract Set getMappingStreams();

    public abstract MessageInterpolator getMessageInterpolator();

    public abstract ParameterNameProvider getParameterNameProvider();

    public abstract Map getProperties();

    public abstract TraversableResolver getTraversableResolver();

    public abstract boolean isIgnoreXmlConfiguration();
}
