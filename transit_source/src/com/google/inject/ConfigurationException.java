// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.Errors;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Preconditions;
import java.util.Collection;

public final class ConfigurationException extends RuntimeException
{

    private static final long serialVersionUID = 0L;
    private final $ImmutableSet messages;
    private Object partialValue;

    public ConfigurationException(Iterable iterable)
    {
        partialValue = null;
        messages = $ImmutableSet.copyOf(iterable);
        initCause(Errors.getOnlyCause(messages));
    }

    public Collection getErrorMessages()
    {
        return messages;
    }

    public String getMessage()
    {
        return Errors.format("Guice configuration errors", messages);
    }

    public Object getPartialValue()
    {
        return partialValue;
    }

    public ConfigurationException withPartialValue(Object obj)
    {
        ConfigurationException configurationexception;
        boolean flag;
        if (partialValue == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Can't clobber existing partial value %s with %s", new Object[] {
            partialValue, obj
        });
        configurationexception = new ConfigurationException(messages);
        configurationexception.partialValue = obj;
        return configurationexception;
    }
}
