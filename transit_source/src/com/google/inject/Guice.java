// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.InternalInjectorCreator;
import java.util.Arrays;

// Referenced classes of package com.google.inject:
//            Stage, Injector, Module

public final class Guice
{

    private Guice()
    {
    }

    public static Injector createInjector(Stage stage, Iterable iterable)
    {
        return (new InternalInjectorCreator()).stage(stage).addModules(iterable).build();
    }

    public static transient Injector createInjector(Stage stage, Module amodule[])
    {
        return createInjector(stage, ((Iterable) (Arrays.asList(amodule))));
    }

    public static Injector createInjector(Iterable iterable)
    {
        return createInjector(Stage.DEVELOPMENT, iterable);
    }

    public static transient Injector createInjector(Module amodule[])
    {
        return createInjector(((Iterable) (Arrays.asList(amodule))));
    }
}
