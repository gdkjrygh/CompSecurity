// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.FailoverLoader;
import dagger.internal.Keys;
import dagger.internal.Linker;
import dagger.internal.Loader;
import dagger.internal.ModuleAdapter;
import dagger.internal.Modules;
import dagger.internal.SetBinding;
import dagger.internal.StaticInjection;
import dagger.internal.ThrowingErrorHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public abstract class ObjectGraph
{
    static final class ComponentObjectGraph extends ObjectGraph
    {

        private final Object component;
        private final MethodIndex methodIndex;

        private static StringBuilder appendMembersInjectionMethod(StringBuilder stringbuilder, Method method)
        {
            return stringbuilder.append(method.getParameterTypes()[0].getCanonicalName()).append("->").append(method.getName());
        }

        private static StringBuilder appendProvisionMethod(StringBuilder stringbuilder, Method method)
        {
            return stringbuilder.append(method.getName()).append("->").append(method.getReturnType().getCanonicalName());
        }

        public final Object get(Class class1)
        {
            if (class1 == null)
            {
                throw new NullPointerException();
            }
            Method method = (Method)methodIndex.provisionMethodIndex.get(class1);
            if (method == null)
            {
                throw new IllegalArgumentException(String.format("%s was not the return type of a provision method on %s; only %s", new Object[] {
                    class1.getName(), component.getClass().getName(), methodIndex.provisionMethodIndex.keySet()
                }));
            }
            try
            {
                class1 = ((Class) (class1.cast(method.invoke(component, new Object[0]))));
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException(class1);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                throw new RuntimeException(java/lang/reflect/InvocationTargetException.getCanonicalName(), class1);
            }
            return class1;
        }

        public final Object inject(Object obj)
        {
            if (obj == null)
            {
                throw new NullPointerException();
            }
            Method method = (Method)methodIndex.membersInjectionMethodIndex.get(obj.getClass());
            if (method == null)
            {
                throw new IllegalArgumentException(String.format("No injection methods for %s were found on %s; only %s", new Object[] {
                    obj.getClass().getName(), component.getClass().getName(), methodIndex.membersInjectionMethodIndex.keySet()
                }));
            }
            try
            {
                method.invoke(component, new Object[] {
                    obj
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new RuntimeException(java/lang/reflect/InvocationTargetException.getCanonicalName(), ((Throwable) (obj)));
            }
            return obj;
        }

        public final transient ObjectGraph plus(Object aobj[])
        {
            throw new UnsupportedOperationException("Object graphs made from components do not support plus(). To compose component-based graphs, compose the components and use the resultwith ObjectGraph.forComponent().");
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder("ComponentObjectGraph(")).append(component.getClass().getCanonicalName()).append("){provisionMethods=[");
            Iterator iterator = methodIndex.provisionMethodIndex.values().iterator();
            if (iterator.hasNext())
            {
                appendProvisionMethod(stringbuilder, (Method)iterator.next());
            }
            for (; iterator.hasNext(); appendProvisionMethod(stringbuilder, (Method)iterator.next()))
            {
                stringbuilder.append(", ");
            }

            stringbuilder.append("], membersInjectionMethods=[");
            iterator = methodIndex.membersInjectionMethodIndex.values().iterator();
            if (iterator.hasNext())
            {
                appendMembersInjectionMethod(stringbuilder, (Method)iterator.next());
            }
            for (; iterator.hasNext(); appendMembersInjectionMethod(stringbuilder, (Method)iterator.next()))
            {
                stringbuilder.append(", ");
            }

            return stringbuilder.append("]}").toString();
        }
    }

    static final class ComponentObjectGraph.MethodIndex
    {

        static final Map methodIndexes = new WeakHashMap();
        final Map membersInjectionMethodIndex;
        final Map provisionMethodIndex;

    }

    static class DaggerObjectGraph extends ObjectGraph
    {

        private final DaggerObjectGraph base;
        private final Map injectableTypes;
        private final Linker linker;
        private final Loader plugin;
        private final List setBindings;
        private final Map staticInjections;

        private static Object checkNotNull(Object obj, String s)
        {
            if (obj == null)
            {
                throw new NullPointerException(s);
            } else
            {
                return obj;
            }
        }

        private Binding getInjectableTypeBinding(ClassLoader classloader, String s, String s1)
        {
            Class class1;
            class1 = getModuleClassDeclaringInjects(s);
            if (class1 == null)
            {
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 101)).append("No inject registered for ").append(s).append(". You must explicitly add it to the 'injects' option in one of your modules.").toString());
            }
            Linker linker1 = linker;
            linker1;
            JVM INSTR monitorenter ;
            Binding binding = linker.requestBinding(s1, class1, classloader, false, true);
            if (binding == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            s = binding;
            if (binding.isLinked())
            {
                break MISSING_BLOCK_LABEL_115;
            }
            linker.linkRequested();
            s = linker.requestBinding(s1, class1, classloader, false, true);
            linker1;
            JVM INSTR monitorexit ;
            return s;
            classloader;
            linker1;
            JVM INSTR monitorexit ;
            throw classloader;
        }

        private Class getModuleClassDeclaringInjects(String s)
        {
            Class class1 = null;
            DaggerObjectGraph daggerobjectgraph = this;
            Class class2;
            do
            {
                class2 = class1;
                if (daggerobjectgraph == null)
                {
                    break;
                }
                class1 = (Class)daggerobjectgraph.injectableTypes.get(s);
                class2 = class1;
                if (class1 != null)
                {
                    break;
                }
                daggerobjectgraph = daggerobjectgraph.base;
            } while (true);
            return class2;
        }

        private Map linkEverything()
        {
            Map map = linker.fullyLinkedBindings();
            if (map != null)
            {
                return map;
            }
            Linker linker1 = linker;
            linker1;
            JVM INSTR monitorenter ;
            Map map1 = linker.fullyLinkedBindings();
            if (map1 == null)
            {
                break MISSING_BLOCK_LABEL_37;
            }
            linker1;
            JVM INSTR monitorexit ;
            return map1;
            linkStaticInjections();
            linkInjectableTypes();
            map1 = linker.linkAll();
            linker1;
            JVM INSTR monitorexit ;
            return map1;
            Exception exception;
            exception;
            linker1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private void linkInjectableTypes()
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = injectableTypes.entrySet().iterator(); iterator.hasNext(); linker.requestBinding((String)entry.getKey(), entry.getValue(), ((Class)entry.getValue()).getClassLoader(), false, true))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }

        private void linkStaticInjections()
        {
            StaticInjection staticinjection;
            for (Iterator iterator = staticInjections.entrySet().iterator(); iterator.hasNext(); staticinjection.attach(linker))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                StaticInjection staticinjection1 = (StaticInjection)entry.getValue();
                staticinjection = staticinjection1;
                if (staticinjection1 == null)
                {
                    staticinjection = plugin.getStaticInjection((Class)entry.getKey());
                    entry.setValue(staticinjection);
                }
            }

        }

        private static transient ObjectGraph makeGraph(DaggerObjectGraph daggerobjectgraph, Loader loader, Object aobj[])
        {
            StandardBindings standardbindings;
            OverridesBindings overridesbindings;
            LinkedHashMap linkedhashmap;
            LinkedHashMap linkedhashmap1;
            ModuleAdapter moduleadapter;
            dagger.internal.Modules.ModuleWithAdapter modulewithadapter;
            int i;
            linkedhashmap = new LinkedHashMap();
            linkedhashmap1 = new LinkedHashMap();
            ArrayList arraylist;
            int j;
            int l;
            if (daggerobjectgraph == null)
            {
                standardbindings = new StandardBindings();
            } else
            {
                standardbindings = new StandardBindings(daggerobjectgraph.setBindings);
            }
            overridesbindings = new OverridesBindings();
            arraylist = Modules.loadModules(loader, aobj);
            l = arraylist.size();
            i = 0;
_L2:
            if (i >= l)
            {
                break; /* Loop/switch isn't completed */
            }
            modulewithadapter = (dagger.internal.Modules.ModuleWithAdapter)arraylist.get(i);
            moduleadapter = modulewithadapter.getModuleAdapter();
            for (j = 0; j < moduleadapter.injectableTypes.length; j++)
            {
                linkedhashmap.put(moduleadapter.injectableTypes[j], moduleadapter.moduleClass);
            }

            for (int k = 0; k < moduleadapter.staticInjections.length; k++)
            {
                linkedhashmap1.put(moduleadapter.staticInjections[k], null);
            }

            if (moduleadapter.overrides)
            {
                aobj = overridesbindings;
            } else
            {
                aobj = standardbindings;
            }
            try
            {
                moduleadapter.getBindings(((BindingsGroup) (aobj)), modulewithadapter.getModule());
            }
            // Misplaced declaration of an exception variable
            catch (DaggerObjectGraph daggerobjectgraph)
            {
                loader = String.valueOf(moduleadapter.moduleClass.getSimpleName());
                aobj = String.valueOf(daggerobjectgraph.getMessage());
                throw new IllegalArgumentException((new StringBuilder(String.valueOf(loader).length() + 2 + String.valueOf(((Object) (aobj))).length())).append(loader).append(": ").append(((String) (aobj))).toString(), daggerobjectgraph);
            }
            i++;
            if (true) goto _L2; else goto _L1
_L1:
            if (daggerobjectgraph != null)
            {
                aobj = daggerobjectgraph.linker;
            } else
            {
                aobj = null;
            }
            aobj = new Linker(((Linker) (aobj)), loader, new ThrowingErrorHandler());
            ((Linker) (aobj)).installBindings(standardbindings);
            ((Linker) (aobj)).installBindings(overridesbindings);
            return new DaggerObjectGraph(daggerobjectgraph, ((Linker) (aobj)), loader, linkedhashmap1, linkedhashmap, standardbindings.setBindings);
        }

        public final Object get(Class class1)
        {
            String s1 = Keys.get(class1);
            String s;
            if (class1.isInterface())
            {
                s = s1;
            } else
            {
                s = Keys.getMembersKey(class1);
            }
            return getInjectableTypeBinding(class1.getClassLoader(), s, s1).get();
        }

        public final Object inject(Object obj)
        {
            String s = Keys.getMembersKey(obj.getClass());
            getInjectableTypeBinding(obj.getClass().getClassLoader(), s, s).injectMembers(obj);
            return obj;
        }

        public final transient ObjectGraph plus(Object aobj[])
        {
            linkEverything();
            return makeGraph(this, plugin, aobj);
        }


        private DaggerObjectGraph(DaggerObjectGraph daggerobjectgraph, Linker linker1, Loader loader, Map map, Map map1, List list)
        {
            base = daggerobjectgraph;
            linker = (Linker)checkNotNull(linker1, "linker");
            plugin = (Loader)checkNotNull(loader, "plugin");
            staticInjections = (Map)checkNotNull(map, "staticInjections");
            injectableTypes = (Map)checkNotNull(map1, "injectableTypes");
            setBindings = (List)checkNotNull(list, "setBindings");
        }
    }

    static final class OverridesBindings extends BindingsGroup
    {

        public final Binding contributeSetBinding(String s, SetBinding setbinding)
        {
            throw new IllegalArgumentException("Module overrides cannot contribute set bindings.");
        }

        OverridesBindings()
        {
        }
    }

    static final class StandardBindings extends BindingsGroup
    {

        private final List setBindings;

        public final Binding contributeSetBinding(String s, SetBinding setbinding)
        {
            setBindings.add(setbinding);
            return super.put(s, setbinding);
        }


        public StandardBindings()
        {
            setBindings = new ArrayList();
        }

        public StandardBindings(List list)
        {
            setBindings = new ArrayList(list.size());
            SetBinding setbinding;
            for (list = list.iterator(); list.hasNext(); put(setbinding.provideKey, setbinding))
            {
                setbinding = new SetBinding((SetBinding)list.next());
                setBindings.add(setbinding);
            }

        }
    }


    ObjectGraph()
    {
    }

    public static transient ObjectGraph create(Object aobj[])
    {
        return DaggerObjectGraph.makeGraph(null, new FailoverLoader(), aobj);
    }

    public abstract Object get(Class class1);

    public abstract Object inject(Object obj);

    public transient abstract ObjectGraph plus(Object aobj[]);
}
