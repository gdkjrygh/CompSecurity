// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package dagger.internal:
//            ModuleAdapter, Loader

public final class Modules
{
    public static class ModuleWithAdapter
    {

        private final Object module;
        private final ModuleAdapter moduleAdapter;

        public final Object getModule()
        {
            return module;
        }

        public final ModuleAdapter getModuleAdapter()
        {
            return moduleAdapter;
        }

        ModuleWithAdapter(ModuleAdapter moduleadapter, Object obj)
        {
            moduleAdapter = moduleadapter;
            module = obj;
        }
    }


    private Modules()
    {
    }

    private static void collectIncludedModulesRecursively(Loader loader, ModuleAdapter moduleadapter, List list, HashSet hashset)
    {
        moduleadapter = moduleadapter.includes;
        int j = moduleadapter.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = moduleadapter[i];
            if (!hashset.contains(class1))
            {
                ModuleAdapter moduleadapter1 = loader.getModuleAdapter(class1);
                list.add(new ModuleWithAdapter(moduleadapter1, moduleadapter1.newModule()));
                hashset.add(class1);
                collectIncludedModulesRecursively(loader, moduleadapter1, list, hashset);
            }
        }

    }

    public static ArrayList loadModules(Loader loader, Object aobj[])
    {
        int i = aobj.length;
        ArrayList arraylist = new ArrayList(i);
        HashSet hashset = new HashSet(i);
        i--;
        while (i >= 0) 
        {
            Object obj = aobj[i];
            if (obj instanceof Class)
            {
                if (hashset.add((Class)obj))
                {
                    obj = loader.getModuleAdapter((Class)obj);
                    arraylist.add(new ModuleWithAdapter(((ModuleAdapter) (obj)), ((ModuleAdapter) (obj)).newModule()));
                }
            } else
            if (hashset.add(obj.getClass()))
            {
                arraylist.add(new ModuleWithAdapter(loader.getModuleAdapter(obj.getClass()), obj));
            }
            i--;
        }
        int k = arraylist.size();
        for (int j = 0; j < k; j++)
        {
            collectIncludedModulesRecursively(loader, ((ModuleWithAdapter)arraylist.get(j)).getModuleAdapter(), arraylist, hashset);
        }

        return arraylist;
    }
}
