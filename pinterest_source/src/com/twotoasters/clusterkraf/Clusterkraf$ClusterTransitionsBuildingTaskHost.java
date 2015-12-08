// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.AsyncTask;
import com.google.android.gms.maps.Projection;

// Referenced classes of package com.twotoasters.clusterkraf:
//            ClusterTransitionsBuildingTask, Clusterkraf, Options

class b
    implements b
{

    final Clusterkraf a;
    private ClusterTransitionsBuildingTask b;

    public final void a()
    {
        b.cancel(true);
        b = null;
    }

    public final void a(Projection projection)
    {
        b b1;
label0:
        {
            if (projection != null)
            {
                b1 = new b();
                b1.b = Clusterkraf.p(a);
                b1.a = Clusterkraf.n(a);
                b1.a = projection;
                if (android.os..Argument.a < 11)
                {
                    break label0;
                }
                b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new r[] {
                    b1
                });
            }
            return;
        }
        b.execute(new b[] {
            b1
        });
    }

    public void onClusterTransitionsBuildingTaskPostExecute(b b1)
    {
        b b2 = Clusterkraf.a(a).q();
        if (b2 != null)
        {
            b2.shed();
        }
        if (b1 != null)
        {
            Clusterkraf.a(a, b1.a);
        }
        b = null;
    }

    (Clusterkraf clusterkraf)
    {
        a = clusterkraf;
        super();
        b = new ClusterTransitionsBuildingTask(this);
    }
}
