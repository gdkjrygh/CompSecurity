// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$Sets;
import com.google.inject.spi.InjectionPoint;
import com.google.inject.spi.ProviderWithDependencies;
import java.util.Iterator;
import java.util.Set;

public final class Providers
{

    private Providers()
    {
    }

    public static Provider guicify(javax.inject.Provider provider)
    {
        if (provider instanceof Provider)
        {
            return (Provider)provider;
        }
        javax.inject.Provider provider1 = (javax.inject.Provider)$Preconditions.checkNotNull(provider, "provider");
        Object obj = InjectionPoint.forInstanceMethodsAndFields(provider.getClass());
        if (((Set) (obj)).isEmpty())
        {
            return new Provider(provider1) {

                final javax.inject.Provider val$delegate;

                public Object get()
                {
                    return delegate.get();
                }

                public String toString()
                {
                    return (new StringBuilder()).append("guicified(").append(delegate).append(")").toString();
                }

            
            {
                delegate = provider;
                super();
            }
            };
        }
        provider = $Sets.newHashSet();
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); provider.addAll(((InjectionPoint)((Iterator) (obj)).next()).getDependencies())) { }
        return new ProviderWithDependencies(provider1, $ImmutableSet.copyOf(provider)) {

            final javax.inject.Provider val$delegate;
            final Set val$dependencies;

            public Object get()
            {
                return delegate.get();
            }

            public Set getDependencies()
            {
                return dependencies;
            }

            void initialize(Injector injector)
            {
                injector.injectMembers(delegate);
            }

            public String toString()
            {
                return (new StringBuilder()).append("guicified(").append(delegate).append(")").toString();
            }

            
            {
                delegate = provider;
                dependencies = set;
                super();
            }
        };
    }

    public static Provider of(Object obj)
    {
        return new Provider(obj) {

            final Object val$instance;

            public Object get()
            {
                return instance;
            }

            public String toString()
            {
                return (new StringBuilder()).append("of(").append(instance).append(")").toString();
            }

            
            {
                instance = obj;
                super();
            }
        };
    }
}
