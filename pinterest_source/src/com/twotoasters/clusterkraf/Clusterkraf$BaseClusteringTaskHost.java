// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.AsyncTask;
import com.google.android.gms.maps.GoogleMap;
import java.lang.ref.WeakReference;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusteringTask, Clusterkraf, Options

abstract class b
    implements b
{

    final Clusterkraf a;
    private ClusteringTask b;

    public final void a()
    {
        b b1 = Clusterkraf.a(a).q();
        if (b1 != null)
        {
            b1.usteringFinished();
        }
        b.cancel(true);
        b = null;
    }

    protected abstract void a(b b1);

    public final void b()
    {
        Object obj;
label0:
        {
            GoogleMap googlemap = (GoogleMap)Clusterkraf.b(a).get();
            if (googlemap != null)
            {
                obj = Clusterkraf.a(a).q();
                if (obj != null)
                {
                    ((a) (obj)).usteringStarted();
                }
                obj = new usteringStarted();
                obj.usteringStarted = googlemap.getProjection();
                obj.usteringStarted = Clusterkraf.a(a);
                obj.a = Clusterkraf.m(a);
                obj.a = Clusterkraf.n(a);
                if (android.os.usteringTaskHost.a < 11)
                {
                    break label0;
                }
                b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new b[] {
                    obj
                });
            }
            return;
        }
        b.execute(new b[] {
            obj
        });
    }

    public void onClusteringTaskPostExecute(b b1)
    {
        Clusterkraf.a(a, b1.a);
        a(b1);
        b = null;
    }

    (Clusterkraf clusterkraf)
    {
        a = clusterkraf;
        super();
        b = new ClusteringTask(this);
    }
}
