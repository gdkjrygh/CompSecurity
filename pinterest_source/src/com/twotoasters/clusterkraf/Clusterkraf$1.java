// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.twotoasters.clusterkraf;

import android.os.Handler;

// Referenced classes of package com.twotoasters.clusterkraf:
//            Clusterkraf, ClusteringOnCameraChangeListener

class a
    implements com.google.android.gms.maps.elableCallback
{

    final Clusterkraf a;

    public void onCancel()
    {
        nerCallbackListener.a(Clusterkraf.d(a)).a(0L);
    }

    public void onFinish()
    {
        class _cls1
            implements Runnable
        {

            final Clusterkraf._cls1 a;

            public void run()
            {
                Clusterkraf.InnerCallbackListener.a(Clusterkraf.d(a.a)).a(0L);
            }

            _cls1()
            {
                a = Clusterkraf._cls1.this;
                super();
            }
        }

        nerCallbackListener.b(Clusterkraf.d(a)).post(new _cls1());
    }

    _cls1(Clusterkraf clusterkraf)
    {
        a = clusterkraf;
        super();
    }
}
