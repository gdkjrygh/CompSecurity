// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.PrivateBinder;
import com.google.inject.Scope;
import com.google.inject.internal.util.$ImmutableSet;
import com.google.inject.internal.util.$Iterables;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Sets;
import com.google.inject.spi.DefaultBindingScopingVisitor;
import com.google.inject.spi.DefaultElementVisitor;
import com.google.inject.spi.Element;
import com.google.inject.spi.Elements;
import com.google.inject.spi.PrivateElements;
import com.google.inject.spi.ScopeBinding;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Modules
{
    private static class ModuleWriter extends DefaultElementVisitor
    {

        protected final Binder binder;

        protected volatile Object visitOther(Element element)
        {
            return visitOther(element);
        }

        protected Void visitOther(Element element)
        {
            element.applyTo(binder);
            return null;
        }

        void writeAll(Iterable iterable)
        {
            for (iterable = iterable.iterator(); iterable.hasNext(); ((Element)iterable.next()).acceptVisitor(this)) { }
        }

        ModuleWriter(Binder binder1)
        {
            binder = binder1;
        }
    }

    public static interface OverriddenModuleBuilder
    {

        public abstract Module with(Iterable iterable);

        public transient abstract Module with(Module amodule[]);
    }

    private static final class RealOverriddenModuleBuilder
        implements OverriddenModuleBuilder
    {

        private final $ImmutableSet baseModules;

        public Module with(Iterable iterable)
        {
            return iterable. new AbstractModule() {

                final RealOverriddenModuleBuilder this$0;
                final Iterable val$overrides;

                private Scope getScopeInstanceOrNull(Binding binding)
                {
                    return (Scope)binding.acceptScopingVisitor(new DefaultBindingScopingVisitor() {

                        final RealOverriddenModuleBuilder._cls1 this$1;

                        public Scope visitScope(Scope scope)
                        {
                            return scope;
                        }

                        public volatile Object visitScope(Scope scope)
                        {
                            return visitScope(scope);
                        }

            
            {
                this$1 = RealOverriddenModuleBuilder._cls1.this;
                super();
            }
                    });
                }

                public void configure()
                {
                    final java.util.HashSet overriddenKeys = binder();
                    Object obj1 = Elements.getElements(baseModules);
                    final Object final_binder = overriddenKeys;
                    Object obj = obj1;
                    if (((List) (obj1)).size() == 1)
                    {
                        Element element = (Element)$Iterables.getOnlyElement(((Iterable) (obj1)));
                        final_binder = overriddenKeys;
                        obj = obj1;
                        if (element instanceof PrivateElements)
                        {
                            obj = (PrivateElements)element;
                            final_binder = overriddenKeys.newPrivateBinder().withSource(((PrivateElements) (obj)).getSource());
                            for (overriddenKeys = ((PrivateElements) (obj)).getExposedKeys().iterator(); overriddenKeys.hasNext(); ((PrivateBinder) (final_binder)).withSource(((PrivateElements) (obj)).getExposedSource(((Key) (obj1)))).expose(((Key) (obj1))))
                            {
                                obj1 = (Key)overriddenKeys.next();
                            }

                            obj = ((PrivateElements) (obj)).getElements();
                        }
                    }
                    obj = new LinkedHashSet(((java.util.Collection) (obj)));
                    Object obj2 = Elements.getElements(overrides);
                    overriddenKeys = $Sets.newHashSet();
                    obj1 = $Sets.newHashSet();
                    (overriddenKeys. new ModuleWriter(((Set) (obj1))) {

                        final RealOverriddenModuleBuilder._cls1 this$1;
                        final Set val$overriddenKeys;
                        final Set val$overridesScopeAnnotations;

                        public volatile Object visit(Binding binding)
                        {
                            return visit(binding);
                        }

                        public volatile Object visit(PrivateElements privateelements)
                        {
                            return visit(privateelements);
                        }

                        public volatile Object visit(ScopeBinding scopebinding)
                        {
                            return visit(scopebinding);
                        }

                        public Void visit(Binding binding)
                        {
                            overriddenKeys.add(binding.getKey());
                            return (Void)super.visit(binding);
                        }

                        public Void visit(PrivateElements privateelements)
                        {
                            overriddenKeys.addAll(privateelements.getExposedKeys());
                            return (Void)super.visit(privateelements);
                        }

                        public Void visit(ScopeBinding scopebinding)
                        {
                            overridesScopeAnnotations.add(scopebinding.getAnnotationType());
                            return (Void)super.visit(scopebinding);
                        }

            
            {
                this$1 = final__pcls1;
                overriddenKeys = Set.this;
                overridesScopeAnnotations = set1;
                super(final_binder);
            }
                    }).writeAll(((Iterable) (obj2)));
                    obj2 = $Maps.newHashMap();
                    java.util.ArrayList arraylist = $Lists.newArrayList();
                    (((_cls2) (obj2)). new ModuleWriter(arraylist) {

                        final RealOverriddenModuleBuilder._cls1 this$1;
                        final Set val$overriddenKeys;
                        final List val$scopeBindings;
                        final Map val$scopeInstancesInUse;

                        void rewrite(Binder binder, PrivateElements privateelements, Set set)
                        {
                            binder = binder.withSource(privateelements.getSource()).newPrivateBinder();
                            java.util.HashSet hashset = $Sets.newHashSet();
                            for (Iterator iterator = privateelements.getExposedKeys().iterator(); iterator.hasNext();)
                            {
                                Key key = (Key)iterator.next();
                                if (set.remove(key))
                                {
                                    hashset.add(key);
                                } else
                                {
                                    binder.withSource(privateelements.getExposedSource(key)).expose(key);
                                }
                            }

                            privateelements = privateelements.getElements().iterator();
                            do
                            {
                                if (!privateelements.hasNext())
                                {
                                    break;
                                }
                                set = (Element)privateelements.next();
                                if (!(set instanceof Binding) || !hashset.remove(((Binding)set).getKey()))
                                {
                                    if (set instanceof PrivateElements)
                                    {
                                        rewrite(binder, (PrivateElements)set, ((Set) (hashset)));
                                    } else
                                    {
                                        set.applyTo(binder);
                                    }
                                }
                            } while (true);
                        }

                        public volatile Object visit(Binding binding)
                        {
                            return visit(binding);
                        }

                        public volatile Object visit(PrivateElements privateelements)
                        {
                            return visit(privateelements);
                        }

                        public volatile Object visit(ScopeBinding scopebinding)
                        {
                            return visit(scopebinding);
                        }

                        public Void visit(Binding binding)
                        {
                            if (!overriddenKeys.remove(binding.getKey()))
                            {
                                super.visit(binding);
                                Scope scope = getScopeInstanceOrNull(binding);
                                if (scope != null)
                                {
                                    scopeInstancesInUse.put(scope, binding.getSource());
                                }
                            }
                            return null;
                        }

                        public Void visit(PrivateElements privateelements)
                        {
                            rewrite(binder, privateelements, overriddenKeys);
                            return null;
                        }

                        public Void visit(ScopeBinding scopebinding)
                        {
                            scopeBindings.add(scopebinding);
                            return null;
                        }

            
            {
                this$1 = final__pcls1;
                overriddenKeys = set;
                scopeInstancesInUse = Map.this;
                scopeBindings = list;
                super(final_binder);
            }
                    }).writeAll(((Iterable) (obj)));
                    (((_cls3) (obj1)). new ModuleWriter(((Map) (obj2))) {

                        final RealOverriddenModuleBuilder._cls1 this$1;
                        final Set val$overridesScopeAnnotations;
                        final Map val$scopeInstancesInUse;

                        public volatile Object visit(ScopeBinding scopebinding)
                        {
                            return visit(scopebinding);
                        }

                        public Void visit(ScopeBinding scopebinding)
                        {
                            if (overridesScopeAnnotations.remove(scopebinding.getAnnotationType())) goto _L2; else goto _L1
_L1:
                            super.visit(scopebinding);
_L4:
                            return null;
_L2:
                            Object obj = scopeInstancesInUse.get(scopebinding.getScope());
                            if (obj != null)
                            {
                                binder.withSource(obj).addError("The scope for @%s is bound directly and cannot be overridden.", new Object[] {
                                    scopebinding.getAnnotationType().getSimpleName()
                                });
                            }
                            if (true) goto _L4; else goto _L3
_L3:
                        }

            
            {
                this$1 = final__pcls1;
                overridesScopeAnnotations = Set.this;
                scopeInstancesInUse = map;
                super(final_binder);
            }
                    }).writeAll(arraylist);
                }


            
            {
                this$0 = final_realoverriddenmodulebuilder;
                overrides = Iterable.this;
                super();
            }
            };
        }

        public transient Module with(Module amodule[])
        {
            return with(((Iterable) (Arrays.asList(amodule))));
        }


        private RealOverriddenModuleBuilder(Iterable iterable)
        {
            baseModules = $ImmutableSet.copyOf(iterable);
        }

    }


    public static final Module EMPTY_MODULE = new Module() {

        public void configure(Binder binder)
        {
        }

    };

    private Modules()
    {
    }

    public static Module combine(Iterable iterable)
    {
        return new Module($ImmutableSet.copyOf(iterable)) {

            final Set val$modulesSet;

            public void configure(Binder binder)
            {
                binder = binder.skipSources(new Class[] {
                    getClass()
                });
                for (Iterator iterator = modulesSet.iterator(); iterator.hasNext(); binder.install((Module)iterator.next())) { }
            }

            
            {
                modulesSet = set;
                super();
            }
        };
    }

    public static transient Module combine(Module amodule[])
    {
        return combine(((Iterable) ($ImmutableSet.of(amodule))));
    }

    public static OverriddenModuleBuilder override(Iterable iterable)
    {
        return new RealOverriddenModuleBuilder(iterable);
    }

    public static transient OverriddenModuleBuilder override(Module amodule[])
    {
        return new RealOverriddenModuleBuilder(Arrays.asList(amodule));
    }

}
