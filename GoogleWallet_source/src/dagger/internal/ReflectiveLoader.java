// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.internal.loaders.ReflectiveAtInjectBinding;
import dagger.internal.loaders.ReflectiveModuleAdapter;
import dagger.internal.loaders.ReflectiveStaticInjection;

// Referenced classes of package dagger.internal:
//            Loader, Binding, ModuleAdapter, StaticInjection

public final class ReflectiveLoader extends Loader
{

    public ReflectiveLoader()
    {
    }

    public final Binding getAtInjectBinding(String s, String s1, ClassLoader classloader, boolean flag)
    {
        classloader = loadClass(classloader, s1);
        if (classloader.equals(java/lang/Void))
        {
            throw new IllegalStateException(String.format("Could not load class %s needed for binding %s", new Object[] {
                s1, s
            }));
        }
        if (classloader.isInterface())
        {
            return null;
        } else
        {
            return ReflectiveAtInjectBinding.createFactory(classloader).create(flag);
        }
    }

    public final ModuleAdapter getModuleAdapter(Class class1)
    {
        return ReflectiveModuleAdapter.create(class1);
    }

    public final StaticInjection getStaticInjection(Class class1)
    {
        return ReflectiveStaticInjection.create(class1);
    }
}
