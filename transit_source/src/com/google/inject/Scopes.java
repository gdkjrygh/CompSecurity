// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.CircularDependencyProxy;
import com.google.inject.internal.InternalInjectorCreator;
import com.google.inject.internal.LinkedBindingImpl;
import com.google.inject.spi.BindingScopingVisitor;
import com.google.inject.spi.ExposedBinding;
import com.google.inject.spi.PrivateElements;
import javax.inject.Singleton;

// Referenced classes of package com.google.inject:
//            Binding, Injector, Scope, Key, 
//            Provider, ProvisionException, Singleton

public class Scopes
{

    public static final Scope NO_SCOPE = new Scope() {

        public Provider scope(Key key, Provider provider)
        {
            return provider;
        }

        public String toString()
        {
            return "Scopes.NO_SCOPE";
        }

    };
    private static final Object NULL = new Object();
    public static final Scope SINGLETON = new Scope() {

        public Provider scope(Key key, Provider provider)
        {
            return provider. new Provider() {

                private volatile Object instance;
                final _cls1 this$0;
                final Provider val$creator;

                public Object get()
                {
                    if (instance != null) goto _L2; else goto _L1
_L1:
                    com/google/inject/internal/InternalInjectorCreator;
                    JVM INSTR monitorenter ;
                    Object obj;
                    if (instance != null)
                    {
                        break MISSING_BLOCK_LABEL_86;
                    }
                    obj = creator.get();
                    if (!(obj instanceof CircularDependencyProxy))
                    {
                        break MISSING_BLOCK_LABEL_39;
                    }
                    com/google/inject/internal/InternalInjectorCreator;
                    JVM INSTR monitorexit ;
                    return obj;
                    if (obj != null)
                    {
                        break MISSING_BLOCK_LABEL_47;
                    }
                    obj = Scopes.NULL;
                    if (instance != null && instance != obj)
                    {
                        throw new ProvisionException("Provider was reentrant while creating a singleton");
                    }
                    break MISSING_BLOCK_LABEL_81;
                    obj;
                    com/google/inject/internal/InternalInjectorCreator;
                    JVM INSTR monitorexit ;
                    throw obj;
                    instance = obj;
                    com/google/inject/internal/InternalInjectorCreator;
                    JVM INSTR monitorexit ;
_L2:
                    Object obj1 = instance;
                    if (obj1 == Scopes.NULL)
                    {
                        obj1 = null;
                    }
                    return obj1;
                }

                public String toString()
                {
                    return String.format("%s[%s]", new Object[] {
                        creator, Scopes.SINGLETON
                    });
                }

            
            {
                this$0 = final__pcls1;
                creator = Provider.this;
                super();
            }
            };
        }

        public String toString()
        {
            return "Scopes.SINGLETON";
        }

    };

    private Scopes()
    {
    }

    public static boolean isSingleton(Binding binding)
    {
        do
        {
            if (((Boolean)binding.acceptScopingVisitor(new BindingScopingVisitor() {

        public Boolean visitEagerSingleton()
        {
            return Boolean.valueOf(true);
        }

        public volatile Object visitEagerSingleton()
        {
            return visitEagerSingleton();
        }

        public Boolean visitNoScoping()
        {
            return Boolean.valueOf(false);
        }

        public volatile Object visitNoScoping()
        {
            return visitNoScoping();
        }

        public Boolean visitScope(Scope scope)
        {
            boolean flag;
            if (scope == Scopes.SINGLETON)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object visitScope(Scope scope)
        {
            return visitScope(scope);
        }

        public Boolean visitScopeAnnotation(Class class1)
        {
            boolean flag;
            if (class1 == com/google/inject/Singleton || class1 == javax/inject/Singleton)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public volatile Object visitScopeAnnotation(Class class1)
        {
            return visitScopeAnnotation(class1);
        }

    })).booleanValue())
            {
                return true;
            }
            if (binding instanceof LinkedBindingImpl)
            {
                binding = (LinkedBindingImpl)binding;
                com.google.inject.internal.InjectorImpl injectorimpl = binding.getInjector();
                if (injectorimpl == null)
                {
                    break;
                }
                binding = injectorimpl.getBinding(binding.getLinkedKey());
                continue;
            }
            if (!(binding instanceof ExposedBinding))
            {
                break;
            }
            binding = (ExposedBinding)binding;
            Injector injector = binding.getPrivateElements().getInjector();
            if (injector == null)
            {
                break;
            }
            binding = injector.getBinding(binding.getKey());
        } while (true);
        return false;
    }


}
