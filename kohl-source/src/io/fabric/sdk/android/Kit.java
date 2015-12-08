// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.DependsOn;
import java.io.File;
import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android:
//            InitializationTask, Fabric, FabricContext, InitializationCallback

public abstract class Kit
    implements Comparable
{

    Context context;
    Fabric fabric;
    IdManager idManager;
    InitializationCallback initializationCallback;
    InitializationTask initializationTask;

    public Kit()
    {
        initializationTask = new InitializationTask(this);
    }

    public int compareTo(Kit kit)
    {
        if (!containsAnnotatedDependency(kit))
        {
            if (kit.containsAnnotatedDependency(this))
            {
                return -1;
            }
            if (!hasAnnotatedDependency() || kit.hasAnnotatedDependency())
            {
                return hasAnnotatedDependency() || !kit.hasAnnotatedDependency() ? 0 : -1;
            }
        }
        return 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((Kit)obj);
    }

    boolean containsAnnotatedDependency(Kit kit)
    {
        DependsOn dependson = (DependsOn)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn);
        if (dependson != null)
        {
            Class aclass[] = dependson.value();
            int j = aclass.length;
            for (int i = 0; i < j; i++)
            {
                if (aclass[i].equals(kit.getClass()))
                {
                    return true;
                }
            }

        }
        return false;
    }

    protected abstract Object doInBackground();

    public Context getContext()
    {
        return context;
    }

    protected Collection getDependencies()
    {
        return initializationTask.getDependencies();
    }

    public Fabric getFabric()
    {
        return fabric;
    }

    protected IdManager getIdManager()
    {
        return idManager;
    }

    public abstract String getIdentifier();

    public String getPath()
    {
        return (new StringBuilder()).append(".Fabric").append(File.separator).append(getIdentifier()).toString();
    }

    public abstract String getVersion();

    boolean hasAnnotatedDependency()
    {
        return (DependsOn)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/DependsOn) != null;
    }

    final void initialize()
    {
        initializationTask.executeOnExecutor(fabric.getExecutorService(), new Void[] {
            (Void)null
        });
    }

    void injectParameters(Context context1, Fabric fabric1, InitializationCallback initializationcallback, IdManager idmanager)
    {
        fabric = fabric1;
        context = new FabricContext(context1, getIdentifier(), getPath());
        initializationCallback = initializationcallback;
        idManager = idmanager;
    }

    protected void onCancelled(Object obj)
    {
    }

    protected void onPostExecute(Object obj)
    {
    }

    protected boolean onPreExecute()
    {
        return true;
    }
}
