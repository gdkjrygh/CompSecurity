// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Binder;
import com.google.inject.ConfigurationException;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.internal.util.$Classes;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$ToStringBuilder;
import com.google.inject.spi.BindingTargetVisitor;
import com.google.inject.spi.ConstructorBinding;
import com.google.inject.spi.Dependency;
import com.google.inject.spi.InjectionPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Set;

// Referenced classes of package com.google.inject.internal:
//            BindingImpl, DefaultConstructionProxyFactory, ConstructorInjector, ErrorsException, 
//            Errors, Scoping, Annotations, ConstructionProxy, 
//            InjectorImpl, ConstructorInjectorStore, InternalFactory, InternalContext

final class ConstructorBindingImpl extends BindingImpl
    implements ConstructorBinding
{
    private static class Factory
        implements InternalFactory
    {

        private boolean allowCircularProxy;
        private ConstructorInjector constructorInjector;
        private final boolean failIfNotLinked;
        private final Key key;

        public Object get(Errors errors, InternalContext internalcontext, Dependency dependency, boolean flag)
            throws ErrorsException
        {
            boolean flag1;
            if (constructorInjector != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            $Preconditions.checkState(flag1, "Constructor not ready");
            if (failIfNotLinked && !flag)
            {
                throw errors.jitDisabled(key).toException();
            } else
            {
                return constructorInjector.construct(errors, internalcontext, dependency.getKey().getTypeLiteral().getRawType(), allowCircularProxy);
            }
        }



/*
        static ConstructorInjector access$002(Factory factory1, ConstructorInjector constructorinjector)
        {
            factory1.constructorInjector = constructorinjector;
            return constructorinjector;
        }

*/


/*
        static boolean access$102(Factory factory1, boolean flag)
        {
            factory1.allowCircularProxy = flag;
            return flag;
        }

*/

        Factory(boolean flag, Key key1)
        {
            failIfNotLinked = flag;
            key = key1;
        }
    }


    private final InjectionPoint constructorInjectionPoint;
    private final Factory factory;

    public ConstructorBindingImpl(Key key, Object obj, Scoping scoping, InjectionPoint injectionpoint, Set set)
    {
        super(obj, key, scoping);
        factory = new Factory(false, key);
        key = (new DefaultConstructionProxyFactory(injectionpoint)).create();
        constructorInjectionPoint = injectionpoint;
        factory.constructorInjector = new ConstructorInjector(set, key, null, null);
    }

    private ConstructorBindingImpl(InjectorImpl injectorimpl, Key key, Object obj, InternalFactory internalfactory, Scoping scoping, Factory factory1, InjectionPoint injectionpoint)
    {
        super(injectorimpl, key, obj, internalfactory, scoping);
        factory = factory1;
        constructorInjectionPoint = injectionpoint;
    }

    static ConstructorBindingImpl create(InjectorImpl injectorimpl, Key key, InjectionPoint injectionpoint, Object obj, Scoping scoping, Errors errors, boolean flag)
        throws ErrorsException
    {
        int i = errors.size();
        Class class1;
        InjectionPoint injectionpoint1;
        if (injectionpoint == null)
        {
            class1 = key.getTypeLiteral().getRawType();
        } else
        {
            class1 = injectionpoint.getDeclaringType().getRawType();
        }
        if (Modifier.isAbstract(class1.getModifiers()))
        {
            errors.missingImplementation(key);
        }
        if ($Classes.isInnerClass(class1))
        {
            errors.cannotInjectInnerClass(class1);
        }
        errors.throwIfNewErrors(i);
        injectionpoint1 = injectionpoint;
        if (injectionpoint == null)
        {
            try
            {
                injectionpoint1 = InjectionPoint.forConstructorOf(key.getTypeLiteral());
            }
            // Misplaced declaration of an exception variable
            catch (InjectorImpl injectorimpl)
            {
                throw errors.merge(injectorimpl.getErrorMessages()).toException();
            }
        }
        injectionpoint = scoping;
        if (!scoping.isExplicitlyScoped())
        {
            Class class2 = Annotations.findScopeAnnotation(errors, injectionpoint1.getMember().getDeclaringClass());
            injectionpoint = scoping;
            if (class2 != null)
            {
                injectionpoint = Scoping.makeInjectable(Scoping.forAnnotation(class2), injectorimpl, errors.withSource(class1));
            }
        }
        errors.throwIfNewErrors(i);
        scoping = new Factory(flag, key);
        return new ConstructorBindingImpl(injectorimpl, key, obj, Scoping.scope(key, injectorimpl, scoping, obj, injectionpoint), injectionpoint, scoping, injectionpoint1);
    }

    public Object acceptTargetVisitor(BindingTargetVisitor bindingtargetvisitor)
    {
        boolean flag;
        if (factory.constructorInjector != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "not initialized");
        return bindingtargetvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        InjectionPoint injectionpoint = getConstructor();
        getScoping().applyTo(binder.withSource(getSource()).bind(getKey()).toConstructor((Constructor)getConstructor().getMember(), injectionpoint.getDeclaringType()));
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ConstructorBindingImpl)
        {
            obj = (ConstructorBindingImpl)obj;
            flag = flag1;
            if (getKey().equals(((ConstructorBindingImpl) (obj)).getKey()))
            {
                flag = flag1;
                if (getScoping().equals(((ConstructorBindingImpl) (obj)).getScoping()))
                {
                    flag = flag1;
                    if ($Objects.equal(constructorInjectionPoint, ((ConstructorBindingImpl) (obj)).constructorInjectionPoint))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public InjectionPoint getConstructor()
    {
        boolean flag;
        if (factory.constructorInjector != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Binding is not ready");
        return factory.constructorInjector.getConstructionProxy().getInjectionPoint();
    }

    public Set getDependencies()
    {
        return Dependency.forInjectionPoints((new com.google.inject.internal.util..ImmutableSet.Builder()).add(getConstructor()).addAll(getInjectableMembers()).build());
    }

    public Set getInjectableMembers()
    {
        boolean flag;
        if (factory.constructorInjector != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkState(flag, "Binding is not ready");
        return factory.constructorInjector.getInjectableMembers();
    }

    InjectionPoint getInternalConstructor()
    {
        if (factory.constructorInjector != null)
        {
            return factory.constructorInjector.getConstructionProxy().getInjectionPoint();
        } else
        {
            return constructorInjectionPoint;
        }
    }

    Set getInternalDependencies()
    {
        com.google.inject.internal.util..ImmutableSet.Builder builder = $ImmutableSet.builder();
        if (factory.constructorInjector == null)
        {
            builder.add(constructorInjectionPoint);
            try
            {
                builder.addAll(InjectionPoint.forInstanceMethodsAndFields(constructorInjectionPoint.getDeclaringType()));
            }
            catch (ConfigurationException configurationexception) { }
        } else
        {
            builder.add(getConstructor()).addAll(getInjectableMembers());
        }
        return Dependency.forInjectionPoints(builder.build());
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getKey(), getScoping(), constructorInjectionPoint
        });
    }

    public void initialize(InjectorImpl injectorimpl, Errors errors)
        throws ErrorsException
    {
        Factory factory1 = factory;
        boolean flag;
        if (!injectorimpl.options.disableCircularProxies)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        factory1.allowCircularProxy = flag;
        factory.constructorInjector = injectorimpl.constructors.get(constructorInjectionPoint, errors);
    }

    boolean isInitialized()
    {
        return factory.constructorInjector != null;
    }

    public String toString()
    {
        return (new $ToStringBuilder(com/google/inject/spi/ConstructorBinding)).add("key", getKey()).add("source", getSource()).add("scope", getScoping()).toString();
    }

    protected BindingImpl withKey(Key key)
    {
        return new ConstructorBindingImpl(null, key, getSource(), factory, getScoping(), factory, constructorInjectionPoint);
    }

    protected BindingImpl withScoping(Scoping scoping)
    {
        return new ConstructorBindingImpl(null, getKey(), getSource(), factory, scoping, factory, constructorInjectionPoint);
    }
}
