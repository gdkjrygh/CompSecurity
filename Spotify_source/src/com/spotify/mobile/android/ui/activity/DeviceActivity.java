// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import ctz;
import dlb;
import dwx;
import dxc;
import erb;
import fpk;
import fxx;
import fys;
import fyv;
import fyw;
import gdo;

public class DeviceActivity extends fpk
{

    private Handler d;
    private dxc i;
    private Flags j;
    private dlb k;
    private dwx l;
    private Runnable m;

    public DeviceActivity()
    {
        d = new Handler();
        l = new dwx() {

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
                    DeviceActivity.c(a).post(new Runnable(this) {

                        private _cls1 a;

                        public final void run()
                        {
                            fxx fxx1 = (fxx)a.a.a_().a("tag_device_fragment");
                            gdo.a(a.a, fxx1);
                            DeviceActivity.a(a.a, fxx1);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }
            }

            
            {
                a = DeviceActivity.this;
                super();
            }
        };
        m = new Runnable() {

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

            
            {
                a = DeviceActivity.this;
                super();
            }
        };
    }

    public static Intent a(Context context, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/DeviceActivity);
        context.putExtra("picker_opening_source", subevent);
        return context;
    }

    static Flags a(DeviceActivity deviceactivity)
    {
        return deviceactivity.j;
    }

    static Flags a(DeviceActivity deviceactivity, Flags flags)
    {
        deviceactivity.j = flags;
        return flags;
    }

    static dlb a(DeviceActivity deviceactivity, dlb dlb1)
    {
        deviceactivity.k = dlb1;
        return dlb1;
    }

    static Runnable b(DeviceActivity deviceactivity)
    {
        return deviceactivity.m;
    }

    static Handler c(DeviceActivity deviceactivity)
    {
        return deviceactivity.d;
    }

    public final void a(float f)
    {
        if (k != null)
        {
            k.a(f);
        }
    }

    public void onCreate(Bundle bundle)
    {
        i = new dxc(this);
        super.onCreate(bundle);
        setContentView(0x7f03001e);
        if (bundle == null)
        {
            setVisible(false);
            return;
        } else
        {
            j = fyw.a(bundle);
            return;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putParcelable("FlagsArgumentHelper.Flags", j);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        i.a();
        i.a(l);
    }

    protected void onStop()
    {
        i.b(l);
        i.b();
        super.onStop();
    }
}
