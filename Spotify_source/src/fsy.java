// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.mobile.android.service.ConnectDevice;
import java.util.ArrayList;
import java.util.List;

public final class fsy extends BaseAdapter
{

    public List a;
    public boolean b;
    private ConnectDevice c;
    private boolean d;
    private gan e;

    public fsy()
    {
        a = new ArrayList(0);
        e = new gan() {

            private fsy a;

            public final void a()
            {
                fsy.a(a);
            }

            
            {
                a = fsy.this;
                super();
            }
        };
    }

    static boolean a(fsy fsy1)
    {
        fsy1.d = true;
        return true;
    }

    public final void a(ConnectDevice connectdevice)
    {
        d = cty.a(connectdevice, c);
        c = connectdevice;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((ConnectDevice)a.get(i)).b.hashCode();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = (gam)view;
        view = ((View) (obj));
        if (obj == null)
        {
            view = new gam(viewgroup.getContext());
            obj = dhv.d(viewgroup.getContext(), null);
            ((dhu) (obj)).e(true);
            if (((gam) (view)).a != null)
            {
                view.removeView(((gam) (view)).a.v());
            }
            view.a = ((dhu) (obj));
            view.addView(((dhu) (obj)).v());
        }
        obj = (ConnectDevice)a.get(i);
        viewgroup = viewgroup.getContext();
        dia dia1;
        com.spotify.mobile.android.service.ConnectDevice.DeviceState devicestate;
        Object obj1;
        int j;
        if (((ConnectDevice) (obj)).equals(c) && !d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj1 = ((gam) (view)).a;
        dia1 = (dia)((dhu) (obj1)).u();
        view.setTag(obj);
        devicestate = ((ConnectDevice) (obj)).o;
        dia1.a(((ConnectDevice) (obj)).d);
        ((dhu) (obj1)).b(((ConnectDevice) (obj)).g);
        ((dhu) (obj1)).c(((ConnectDevice) (obj)).e);
        obj1 = dia1.b();
        if (((ConnectDevice) (obj)).f || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.a || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.d || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.c || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.e || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.b || ((ConnectDevice) (obj)).o == com.spotify.mobile.android.service.ConnectDevice.DeviceState.f)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((TextView) (obj1)).setVisibility(j);
        if (((ConnectDevice) (obj)).f)
        {
            dia1.b(viewgroup.getString(0x7f0801be));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.a)
        {
            dia1.b(viewgroup.getString(0x7f0801bb));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.d)
        {
            dia1.b(viewgroup.getString(0x7f0801c6));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.c)
        {
            dia1.b(viewgroup.getString(0x7f0801c3));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.e)
        {
            dia1.b(viewgroup.getString(0x7f0801c0));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.b)
        {
            dia1.b(viewgroup.getString(0x7f0801bd));
        } else
        if (devicestate == com.spotify.mobile.android.service.ConnectDevice.DeviceState.f)
        {
            dia1.b(viewgroup.getString(0x7f0801c5));
        }
        if (i != 0)
        {
            view.a(String.format(viewgroup.getString(0x7f0801e0), new Object[] {
                viewgroup.getString(gci.a(((ConnectDevice) (obj)).l))
            }));
        } else
        {
            view.a(null);
        }
        view.b = e;
        if (b)
        {
            view.setEnabled(false);
        }
        return view;
    }
}
