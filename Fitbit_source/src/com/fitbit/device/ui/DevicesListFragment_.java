// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesListFragment, d

public final class DevicesListFragment_ extends DevicesListFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public DevicesListFragment a()
        {
            DevicesListFragment_ deviceslistfragment_ = new DevicesListFragment_();
            deviceslistfragment_.setArguments(a);
            return deviceslistfragment_;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    private final c d = new c();
    private View e;
    private Handler f;

    public DevicesListFragment_()
    {
        f = new Handler(Looper.getMainLooper());
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        a = com.fitbit.device.ui.d.a(getActivity());
        a();
    }

    static void a(DevicesListFragment_ deviceslistfragment_)
    {
        deviceslistfragment_.DevicesListFragment.d();
    }

    public static a e()
    {
        return new a();
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = a1.findViewById(0x7f110254);
        c = a1.findViewById(0x102000a);
        b();
    }

    public void d()
    {
        f.post(new Runnable() {

            final DevicesListFragment_ a;

            public void run()
            {
                com.fitbit.device.ui.DevicesListFragment_.a(a);
            }

            
            {
                a = DevicesListFragment_.this;
                super();
            }
        });
    }

    public View findViewById(int i)
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(d);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        e = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (e == null)
        {
            e = layoutinflater.inflate(0x7f040146, viewgroup, false);
        }
        return e;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d.a(this);
    }
}
