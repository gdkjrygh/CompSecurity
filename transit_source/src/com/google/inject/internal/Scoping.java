// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.Key;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import com.google.inject.Stage;
import com.google.inject.binder.ScopedBindingBuilder;
import com.google.inject.internal.util.$Objects;
import com.google.inject.spi.BindingScopingVisitor;

// Referenced classes of package com.google.inject.internal:
//            InjectorImpl, State, Errors, InternalFactoryToProviderAdapter, 
//            ProviderToInternalFactoryAdapter, Initializables, InternalFactory

public abstract class Scoping
{

    public static final Scoping EAGER_SINGLETON = new Scoping() {

        public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
        {
            return bindingscopingvisitor.visitEagerSingleton();
        }

        public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
        {
            scopedbindingbuilder.asEagerSingleton();
        }

        public Scope getScopeInstance()
        {
            return Scopes.SINGLETON;
        }

        public String toString()
        {
            return "eager singleton";
        }

    };
    public static final Scoping SINGLETON_ANNOTATION = new Scoping() {

        public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
        {
            return bindingscopingvisitor.visitScopeAnnotation(com/google/inject/Singleton);
        }

        public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
        {
            scopedbindingbuilder.in(com/google/inject/Singleton);
        }

        public Class getScopeAnnotation()
        {
            return com/google/inject/Singleton;
        }

        public String toString()
        {
            return com/google/inject/Singleton.getName();
        }

    };
    public static final Scoping SINGLETON_INSTANCE = new Scoping() {

        public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
        {
            return bindingscopingvisitor.visitScope(Scopes.SINGLETON);
        }

        public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
        {
            scopedbindingbuilder.in(Scopes.SINGLETON);
        }

        public Scope getScopeInstance()
        {
            return Scopes.SINGLETON;
        }

        public String toString()
        {
            return Scopes.SINGLETON.toString();
        }

    };
    public static final Scoping UNSCOPED = new Scoping() {

        public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
        {
            return bindingscopingvisitor.visitNoScoping();
        }

        public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
        {
        }

        public Scope getScopeInstance()
        {
            return Scopes.NO_SCOPE;
        }

        public String toString()
        {
            return Scopes.NO_SCOPE.toString();
        }

    };

    private Scoping()
    {
    }


    public static Scoping forAnnotation(Class class1)
    {
        if (class1 == com/google/inject/Singleton || class1 == javax/inject/Singleton)
        {
            return SINGLETON_ANNOTATION;
        } else
        {
            return new Scoping(class1) {

                final Class val$scopingAnnotation;

                public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
                {
                    return bindingscopingvisitor.visitScopeAnnotation(scopingAnnotation);
                }

                public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
                {
                    scopedbindingbuilder.in(scopingAnnotation);
                }

                public Class getScopeAnnotation()
                {
                    return scopingAnnotation;
                }

                public String toString()
                {
                    return scopingAnnotation.getName();
                }

            
            {
                scopingAnnotation = class1;
                super(null);
            }
            };
        }
    }

    public static Scoping forInstance(Scope scope1)
    {
        if (scope1 == Scopes.SINGLETON)
        {
            return SINGLETON_INSTANCE;
        } else
        {
            return new Scoping(scope1) {

                final Scope val$scope;

                public Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor)
                {
                    return bindingscopingvisitor.visitScope(scope);
                }

                public void applyTo(ScopedBindingBuilder scopedbindingbuilder)
                {
                    scopedbindingbuilder.in(scope);
                }

                public Scope getScopeInstance()
                {
                    return scope;
                }

                public String toString()
                {
                    return scope.toString();
                }

            
            {
                scope = scope1;
                super(null);
            }
            };
        }
    }

    static Scoping makeInjectable(Scoping scoping, InjectorImpl injectorimpl, Errors errors)
    {
        Class class1 = scoping.getScopeAnnotation();
        if (class1 == null)
        {
            return scoping;
        }
        scoping = injectorimpl.state.getScope(class1);
        if (scoping != null)
        {
            return forInstance(scoping);
        } else
        {
            errors.scopeNotFound(class1);
            return UNSCOPED;
        }
    }

    static InternalFactory scope(Key key, InjectorImpl injectorimpl, InternalFactory internalfactory, Object obj, Scoping scoping)
    {
        if (scoping.isNoScope())
        {
            return internalfactory;
        } else
        {
            return new InternalFactoryToProviderAdapter(Initializables.of(scoping.getScopeInstance().scope(key, new ProviderToInternalFactoryAdapter(injectorimpl, internalfactory))), obj);
        }
    }

    public abstract Object acceptVisitor(BindingScopingVisitor bindingscopingvisitor);

    public abstract void applyTo(ScopedBindingBuilder scopedbindingbuilder);

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Scoping)
        {
            obj = (Scoping)obj;
            flag = flag1;
            if ($Objects.equal(getScopeAnnotation(), ((Scoping) (obj)).getScopeAnnotation()))
            {
                flag = flag1;
                if ($Objects.equal(getScopeInstance(), ((Scoping) (obj)).getScopeInstance()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Class getScopeAnnotation()
    {
        return null;
    }

    public Scope getScopeInstance()
    {
        return null;
    }

    public int hashCode()
    {
        return $Objects.hashCode(new Object[] {
            getScopeAnnotation(), getScopeInstance()
        });
    }

    public boolean isEagerSingleton(Stage stage)
    {
        boolean flag1 = false;
        if (this != EAGER_SINGLETON) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (stage != Stage.PRODUCTION) goto _L4; else goto _L3
_L3:
        if (this == SINGLETON_ANNOTATION)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (this != SINGLETON_INSTANCE) goto _L4; else goto _L5
_L5:
        return true;
    }

    public boolean isExplicitlyScoped()
    {
        return this != UNSCOPED;
    }

    public boolean isNoScope()
    {
        return getScopeInstance() == Scopes.NO_SCOPE;
    }

}
