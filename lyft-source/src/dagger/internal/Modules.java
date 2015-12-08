// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package dagger.internal:
//            ModuleAdapter, Loader

public final class Modules
{

    private Modules()
    {
    }

    private static void collectIncludedModulesRecursively(Loader loader, ModuleAdapter moduleadapter, Map map)
    {
        moduleadapter = moduleadapter.includes;
        int j = moduleadapter.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = moduleadapter[i];
            if (!map.containsKey(class1))
            {
                ModuleAdapter moduleadapter1 = loader.getModuleAdapter(class1);
                map.put(class1, moduleadapter1);
                collectIncludedModulesRecursively(loader, moduleadapter1, map);
            }
        }

    }

    public static Map loadModules(Loader loader, Object aobj[])
    {
        Object obj = new LinkedHashMap(aobj.length);
        int i = 0;
        while (i < aobj.length) 
        {
            if (aobj[i] instanceof Class)
            {
                ModuleAdapter moduleadapter1 = loader.getModuleAdapter((Class)aobj[i]);
                ((Map) (obj)).put(moduleadapter1, moduleadapter1.newModule());
            } else
            {
                ((Map) (obj)).put(loader.getModuleAdapter(aobj[i].getClass()), aobj[i]);
            }
            i++;
        }
        aobj = new LinkedHashMap(((Map) (obj)));
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        for (obj = ((Map) (obj)).keySet().iterator(); ((Iterator) (obj)).hasNext(); collectIncludedModulesRecursively(loader, (ModuleAdapter)((Iterator) (obj)).next(), linkedhashmap)) { }
        loader = linkedhashmap.values().iterator();
        do
        {
            if (!loader.hasNext())
            {
                break;
            }
            ModuleAdapter moduleadapter = (ModuleAdapter)loader.next();
            if (!((Map) (aobj)).containsKey(moduleadapter))
            {
                ((Map) (aobj)).put(moduleadapter, moduleadapter.newModule());
            }
        } while (true);
        return ((Map) (aobj));
    }
}
