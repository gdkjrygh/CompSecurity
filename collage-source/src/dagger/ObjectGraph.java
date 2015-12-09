// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger;

import dagger.internal.FailoverLoader;
import dagger.internal.Loader;

public abstract class ObjectGraph
{

    ObjectGraph()
    {
    }

    public static transient ObjectGraph create(Object aobj[])
    {
    /* block-local class not found */
    class DaggerObjectGraph {}

        return DaggerObjectGraph.access._mth000(null, new FailoverLoader(), aobj);
    }

    static transient ObjectGraph createWith(Loader loader, Object aobj[])
    {
        return DaggerObjectGraph.access._mth000(null, loader, aobj);
    }

    public abstract Object get(Class class1);

    public abstract Object inject(Object obj);

    public abstract void injectStatics();

    public transient abstract ObjectGraph plus(Object aobj[]);

    public abstract void validate();

    // Unreferenced inner class dagger/ObjectGraph$OverridesBindings
    /* block-local class not found */
    class OverridesBindings {}


    // Unreferenced inner class dagger/ObjectGraph$StandardBindings
    /* block-local class not found */
    class StandardBindings {}

}
