// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.Binding;
import dagger.internal.Keys;
import dagger.internal.Linker;
import dagger.internal.Loader;
import dagger.internal.ModuleAdapter;
import dagger.internal.Modules;
import dagger.internal.StaticInjection;
import dagger.internal.ThrowingErrorHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package dagger:
//            ObjectGraph

static class checkNotNull extends ObjectGraph
{

    private final plugin base;
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
          = this;
        Class class2;
        do
        {
            class2 = class1;
            if ( == null)
            {
                break;
            }
            class1 = (Class).injectableTypes.get(s);
            class2 = class1;
            if (class1 != null)
            {
                break;
            }
             = .base;
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
        java.util.ker ker;
        for (Iterator iterator = injectableTypes.entrySet().iterator(); iterator.hasNext(); linker.requestBinding((String)ker.ker(), ker.ker(), ((Class)ker.ker()).getClassLoader(), false, true))
        {
            ker = (java.util.ker)iterator.next();
        }

    }

    private void linkStaticInjections()
    {
        StaticInjection staticinjection;
        for (Iterator iterator = staticInjections.entrySet().iterator(); iterator.hasNext(); staticinjection.attach(linker))
        {
            java.util.ker ker = (java.util.ker)iterator.next();
            StaticInjection staticinjection1 = (StaticInjection)ker.ker();
            staticinjection = staticinjection1;
            if (staticinjection1 == null)
            {
                staticinjection = plugin.getStaticInjection((Class)ker.n());
                ker.n(staticinjection);
            }
        }

    }

    private static transient ObjectGraph makeGraph(tion tion, Loader loader, Object aobj[])
    {
        tion tion1;
        tion tion2;
        LinkedHashMap linkedhashmap;
        LinkedHashMap linkedhashmap1;
        ModuleAdapter moduleadapter;
        dagger.internal.ections ections;
        int i;
        linkedhashmap = new LinkedHashMap();
        linkedhashmap1 = new LinkedHashMap();
        ArrayList arraylist;
        int j;
        int l;
        if (tion == null)
        {
            tion1 = new init>();
        } else
        {
            tion1 = new init>(tion.setBindings);
        }
        tion2 = new <init>();
        arraylist = Modules.loadModules(loader, aobj);
        l = arraylist.size();
        i = 0;
_L2:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        ections = (dagger.internal.gs)arraylist.get(i);
        moduleadapter = ections.oduleAdapter();
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
            aobj = tion2;
        } else
        {
            aobj = tion1;
        }
        try
        {
            moduleadapter.getBindings(((dagger.internal.BindingsGroup) (aobj)), ections.odule());
        }
        // Misplaced declaration of an exception variable
        catch (tion tion)
        {
            loader = String.valueOf(moduleadapter.moduleClass.getSimpleName());
            aobj = String.valueOf(tion.getMessage());
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(loader).length() + 2 + String.valueOf(((Object) (aobj))).length())).append(loader).append(": ").append(((String) (aobj))).toString(), tion);
        }
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (tion != null)
        {
            aobj = tion.linker;
        } else
        {
            aobj = null;
        }
        aobj = new Linker(((Linker) (aobj)), loader, new ThrowingErrorHandler());
        ((Linker) (aobj)).installBindings(tion1);
        ((Linker) (aobj)).installBindings(tion2);
        return new <init>(tion, ((Linker) (aobj)), loader, linkedhashmap1, linkedhashmap, ccess._mth100(tion1));
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


    private pter(pter pter, Linker linker1, Loader loader, Map map, Map map1, List list)
    {
        base = pter;
        linker = (Linker)checkNotNull(linker1, "linker");
        plugin = (Loader)checkNotNull(loader, "plugin");
        staticInjections = (Map)checkNotNull(map, "staticInjections");
        injectableTypes = (Map)checkNotNull(map1, "injectableTypes");
        setBindings = (List)checkNotNull(list, "setBindings");
    }
}
