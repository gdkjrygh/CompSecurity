// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesFragment

public final class DevicesFragment_ extends DevicesFragment
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Bundle a;

        public DevicesFragment a()
        {
            DevicesFragment_ devicesfragment_ = new DevicesFragment_();
            devicesfragment_.setArguments(a);
            return devicesfragment_;
        }

        private a()
        {
            a = new Bundle();
        }

    }


    private final c f = new c();
    private View g;

    public DevicesFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
        c = com.fitbit.galileo.ui.sync.c.b(getActivity());
        d = com.fitbit.galileo.service.b.b(getActivity());
    }

    public static a e()
    {
        return new a();
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a1 = a1.findViewById(0x7f1104d7);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final DevicesFragment_ a;

                public void onClick(View view)
                {
                    a.d();
                }

            
            {
                a = DevicesFragment_.this;
                super();
            }
            });
        }
        a();
    }

    public View findViewById(int i)
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(f);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        g = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (g == null)
        {
            g = layoutinflater.inflate(0x7f040095, viewgroup, false);
        }
        return g;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        f.a(this);
    }
}
