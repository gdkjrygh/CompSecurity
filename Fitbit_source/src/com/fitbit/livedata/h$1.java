// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.livedata;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.livedata:
//            h, LiveDataState, g

class g.c extends c
{

    final h a;

    protected void a(Intent intent)
    {
label0:
        {
            if ("com.fitbit.pedometer.service.PEDOMETER_SERVICES_STATE_CHANGED".equals(intent.getAction()) && h.a(a) != null)
            {
                if (a.d() != LiveDataState.d)
                {
                    break label0;
                }
                h.a(a).h();
            }
            return;
        }
        h.a(a).j();
    }

    DataState(h h1)
    {
        a = h1;
        super();
    }
}
