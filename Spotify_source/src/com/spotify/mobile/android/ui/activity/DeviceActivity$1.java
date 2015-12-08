// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import android.os.Handler;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dwx;
import fxx;
import fys;
import fyv;
import gdo;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeviceActivity

final class a
    implements dwx
{

    final DeviceActivity a;
    private boolean b;

    public final void a(Flags flags)
    {
        boolean flag = fyv.a(fys.l, DeviceActivity.a(a), flags);
        DeviceActivity.a(a, flags);
        if (!b)
        {
            b = true;
            DeviceActivity.c(a).post(DeviceActivity.b(a));
        }
        if (flag)
        {
            DeviceActivity.c(a).post(new Runnable() {

                private DeviceActivity._cls1 a;

                public final void run()
                {
                    fxx fxx1 = (fxx)a.a.a_().a("tag_device_fragment");
                    gdo.a(a.a, fxx1);
                    DeviceActivity.a(a.a, fxx1);
                }

            
            {
                a = DeviceActivity._cls1.this;
                super();
            }
            });
        }
    }

    _cls1.a(DeviceActivity deviceactivity)
    {
        a = deviceactivity;
        super();
    }
}
