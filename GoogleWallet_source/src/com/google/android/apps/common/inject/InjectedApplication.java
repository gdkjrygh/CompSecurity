// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.app.Application;
import dagger.ObjectGraph;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.common.inject:
//            ApplicationModule

public abstract class InjectedApplication extends Application
{

    private volatile ObjectGraph mApplicationGraph;

    public InjectedApplication()
    {
    }

    private static transient ObjectGraph createGraph(Object aobj[])
    {
        return ObjectGraph.create(aobj);
    }

    public final Object get(Class class1)
    {
        return mApplicationGraph.get(class1);
    }

    protected final ObjectGraph getApplicationObjectGraph()
    {
        return mApplicationGraph;
    }

    protected abstract List getModules();

    protected final ObjectGraph initGraph()
    {
        this;
        JVM INSTR monitorenter ;
        ObjectGraph objectgraph;
        if (mApplicationGraph == null)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(new ApplicationModule(this));
            arraylist.addAll(getModules());
            mApplicationGraph = createGraph(arraylist.toArray());
        }
        objectgraph = mApplicationGraph;
        this;
        JVM INSTR monitorexit ;
        return objectgraph;
        Exception exception;
        exception;
        throw exception;
    }

    public final void inject(Object obj)
    {
        mApplicationGraph.inject(obj);
    }
}
