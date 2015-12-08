// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.e.a;
import com.fitbit.pedometer.service.PedometerServicesStateListener;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.livedata:
//            f, LiveDataSource, LiveDataState, g

public class h
    implements f
{

    public static final LiveDataSource a;
    private static final String b = "PedometerLiveDataManager";
    private final g c;
    private LiveDataState d;
    private final c e = new c() {

        final h a;

        protected void a(Intent intent)
        {
label0:
            {
                if ("com.fitbit.pedometer.service.PEDOMETER_SERVICES_STATE_CHANGED".equals(intent.getAction()) && com.fitbit.livedata.h.a(a) != null)
                {
                    if (a.d() != LiveDataState.d)
                    {
                        break label0;
                    }
                    com.fitbit.livedata.h.a(a).h();
                }
                return;
            }
            com.fitbit.livedata.h.a(a).j();
        }

            
            {
                a = h.this;
                super();
            }
    };

    public h(g g)
    {
        d = com.fitbit.livedata.LiveDataState.a;
        c = g;
        e.a(new IntentFilter("com.fitbit.pedometer.service.PEDOMETER_SERVICES_STATE_CHANGED"));
    }

    static g a(h h1)
    {
        return h1.c;
    }

    public boolean a()
    {
        com.fitbit.e.a.a("PedometerLiveDataManager", "startStreaming()", new Object[0]);
        com.fitbit.pedometer.service.a.d();
        return true;
    }

    public boolean b()
    {
        com.fitbit.e.a.a("PedometerLiveDataManager", "stopStreaming()", new Object[0]);
        com.fitbit.pedometer.service.a.c();
        return true;
    }

    public LiveDataSource c()
    {
        return a;
    }

    public LiveDataState d()
    {
        if (PedometerServicesStateListener.a().b())
        {
            return LiveDataState.d;
        } else
        {
            return com.fitbit.livedata.LiveDataState.a;
        }
    }

    public void e()
    {
        com.fitbit.e.a.a("PedometerLiveDataManager", "enable()", new Object[0]);
    }

    public void f()
    {
        com.fitbit.e.a.a("PedometerLiveDataManager", "disable()", new Object[0]);
    }

    static 
    {
        a = LiveDataSource.b;
    }
}
