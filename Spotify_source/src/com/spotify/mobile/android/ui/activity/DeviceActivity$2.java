// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import ctz;
import dlb;
import erb;
import fxx;
import fys;

// Referenced classes of package com.spotify.mobile.android.ui.activity:
//            DeviceActivity

final class a
    implements Runnable
{

    private DeviceActivity a;

    public final void run()
    {
        if (a.g)
        {
            return;
        }
        android.support.v4.app.Fragment fragment = a.a_().a("tag_device_fragment");
        Object obj = fragment;
        if (fragment == null)
        {
            if (((Boolean)DeviceActivity.a(a).a(fys.aC)).booleanValue())
            {
                obj = erb.a(DeviceActivity.a(a));
            } else
            {
                obj = fxx.a(DeviceActivity.a(a));
            }
            a.a_().a().b(0x7f1100ff, ((android.support.v4.app.Fragment) (obj)), "tag_device_fragment").c();
        }
        ctz.b(obj instanceof dlb, "Fragment should implement RemoteVolumeObserver");
        DeviceActivity.a(a, (dlb)obj);
        a.setVisible(true);
    }

    (DeviceActivity deviceactivity)
    {
        a = deviceactivity;
        super();
    }
}
