// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.util;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Binding;
import com.google.inject.Key;
import com.google.inject.PrivateBinder;
import com.google.inject.Scope;
import com.google.inject.internal.util.$Iterables;
import com.google.inject.internal.util.$Lists;
import com.google.inject.internal.util.$Maps;
import com.google.inject.internal.util.$Sets;
import com.google.inject.spi.DefaultBindingScopingVisitor;
import com.google.inject.spi.Element;
import com.google.inject.spi.Elements;
import com.google.inject.spi.PrivateElements;
import com.google.inject.spi.ScopeBinding;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.inject.util:
//            Modules

class val.scopeInstancesInUse extends val.scopeInstancesInUse
{

    final binder this$1;
    final Set val$overridesScopeAnnotations;
    final Map val$scopeInstancesInUse;

    public volatile Object visit(ScopeBinding scopebinding)
    {
        return visit(scopebinding);
    }

    public Void visit(ScopeBinding scopebinding)
    {
        if (val$overridesScopeAnnotations.remove(scopebinding.getAnnotationType())) goto _L2; else goto _L1
_L1:
        super.overridesScopeAnnotations(scopebinding);
_L4:
        return null;
_L2:
        Object obj = val$scopeInstancesInUse.get(scopebinding.getScope());
        if (obj != null)
        {
            binder.withSource(obj).addError("The scope for @%s is bound directly and cannot be overridden.", new Object[] {
                scopebinding.getAnnotationType().getSimpleName()
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    l.overrides(Map map)
    {
        this$1 = final_overrides;
        val$overridesScopeAnnotations = Set.this;
        val$scopeInstancesInUse = map;
        super(final_binder);
    }

    // Unreferenced inner class com/google/inject/util/Modules$RealOverriddenModuleBuilder$1

/* anonymous class */
    class Modules.RealOverriddenModuleBuilder._cls1 extends AbstractModule
    {

        final Modules.RealOverriddenModuleBuilder this$0;
        final Iterable val$overrides;

        private Scope getScopeInstanceOrNull(Binding binding)
        {
            return (Scope)binding.acceptScopingVisitor(new Modules.RealOverriddenModuleBuilder._cls1._cls4());
        }

        public void configure()
        {
            final java.util.HashSet overriddenKeys = binder();
            Object obj1 = Elements.getElements(Modules.RealOverriddenModuleBuilder.access$100(Modules.RealOverriddenModuleBuilder.this));
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
            final java.util.HashMap scopeInstancesInUse = Elements.getElements(overrides);
            overriddenKeys = $Sets.newHashSet();
            obj1 = $Sets.newHashSet();
            (new Modules.RealOverriddenModuleBuilder._cls1._cls1(((Set) (obj1)))).writeAll(scopeInstancesInUse);
            scopeInstancesInUse = $Maps.newHashMap();
            java.util.ArrayList arraylist = $Lists.newArrayList();
            (new Modules.RealOverriddenModuleBuilder._cls1._cls2(arraylist)).writeAll(((Iterable) (obj)));
            (((Modules.RealOverriddenModuleBuilder._cls1._cls3) (obj1)). new Modules.RealOverriddenModuleBuilder._cls1._cls3(scopeInstancesInUse)).writeAll(arraylist);
        }


            
            {
                this$0 = final_realoverriddenmodulebuilder;
                overrides = Iterable.this;
                super();
            }

        // Unreferenced inner class com/google/inject/util/Modules$RealOverriddenModuleBuilder$1$1

/* anonymous class */
        class Modules.RealOverriddenModuleBuilder._cls1._cls1 extends Modules.ModuleWriter
        {

            final Modules.RealOverriddenModuleBuilder._cls1 this$1;
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
                        this$1 = Modules.RealOverriddenModuleBuilder._cls1.this;
                        overriddenKeys = set;
                        overridesScopeAnnotations = set1;
                        super(final_binder);
                    }
        }


        // Unreferenced inner class com/google/inject/util/Modules$RealOverriddenModuleBuilder$1$2

/* anonymous class */
        class Modules.RealOverriddenModuleBuilder._cls1._cls2 extends Modules.ModuleWriter
        {

            final Modules.RealOverriddenModuleBuilder._cls1 this$1;
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
                        this$1 = Modules.RealOverriddenModuleBuilder._cls1.this;
                        overriddenKeys = set;
                        scopeInstancesInUse = map;
                        scopeBindings = list;
                        super(final_binder);
                    }
        }


        // Unreferenced inner class com/google/inject/util/Modules$RealOverriddenModuleBuilder$1$4

/* anonymous class */
        class Modules.RealOverriddenModuleBuilder._cls1._cls4 extends DefaultBindingScopingVisitor
        {

            final Modules.RealOverriddenModuleBuilder._cls1 this$1;

            public Scope visitScope(Scope scope)
            {
                return scope;
            }

            public volatile Object visitScope(Scope scope)
            {
                return visitScope(scope);
            }

                    
                    {
                        this$1 = Modules.RealOverriddenModuleBuilder._cls1.this;
                        super();
                    }
        }

    }

}
