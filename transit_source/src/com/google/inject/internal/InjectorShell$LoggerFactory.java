// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Provider;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Member;
import java.util.logging.Logger;

// Referenced classes of package com.google.inject.internal:
//            InternalFactory, InjectorShell, ErrorsException, Errors, 
//            InternalContext

private static class <init>
    implements InternalFactory, Provider
{

    public volatile Object get()
    {
        return get();
    }

    public volatile Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
        throws ErrorsException
    {
        return get(errors, internalcontext, dependency, flag);
    }

    public Logger get()
    {
        return Logger.getAnonymousLogger();
    }

    public Logger get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
    {
        errors = dependency.getInjectionPoint();
        if (errors == null)
        {
            return Logger.getAnonymousLogger();
        } else
        {
            return Logger.getLogger(errors.getMember().getDeclaringClass().getName());
        }
    }

    public String toString()
    {
        return "Provider<Logger>";
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
