// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;


// Referenced classes of package dagger.internal:
//            Modules, ModuleAdapter

public static class module
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

    (ModuleAdapter moduleadapter, Object obj)
    {
        moduleAdapter = moduleadapter;
        module = obj;
    }
}
