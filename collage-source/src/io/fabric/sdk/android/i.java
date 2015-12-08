// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;

import android.content.Context;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.concurrency.d;
import java.io.File;
import java.util.Collection;

// Referenced classes of package io.fabric.sdk.android:
//            h, c, d, f

public abstract class i
    implements Comparable
{

    Context context;
    c fabric;
    n idManager;
    f initializationCallback;
    h initializationTask;

    public i()
    {
        initializationTask = new h(this);
    }

    public int compareTo(i j)
    {
        if (!containsAnnotatedDependency(j))
        {
            if (j.containsAnnotatedDependency(this))
            {
                return -1;
            }
            if (!hasAnnotatedDependency() || j.hasAnnotatedDependency())
            {
                return hasAnnotatedDependency() || !j.hasAnnotatedDependency() ? 0 : -1;
            }
        }
        return 1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((i)obj);
    }

    boolean containsAnnotatedDependency(i j)
    {
        d d1 = (d)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/d);
        if (d1 != null)
        {
            Class aclass[] = d1.a();
            int l = aclass.length;
            for (int k = 0; k < l; k++)
            {
                if (aclass[k].equals(j.getClass()))
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

    public c getFabric()
    {
        return fabric;
    }

    protected n getIdManager()
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
        return (d)getClass().getAnnotation(io/fabric/sdk/android/services/concurrency/d) != null;
    }

    final void initialize()
    {
        initializationTask.a(fabric.f(), new Void[] {
            (Void)null
        });
    }

    void injectParameters(Context context1, c c1, f f, n n)
    {
        fabric = c1;
        context = new io.fabric.sdk.android.d(context1, getIdentifier(), getPath());
        initializationCallback = f;
        idManager = n;
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
