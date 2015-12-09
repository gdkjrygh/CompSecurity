// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.a;

// Referenced classes of package com.fitbit.device.ui:
//            DeviceViewWithMultipleDevicesSupport

private class <init>
{

    final DeviceViewWithMultipleDevicesSupport a;
    private a b;

    private void a()
    {
        a.f.setVisibility(0);
        if (a.h.getVisibility() == 0)
        {
            a.h.setVisibility(8);
        }
    }

    private void b()
    {
        a.f.setSelected(true);
        a();
    }

    private void c()
    {
        a.f.setSelected(false);
        a();
    }

    private void d()
    {
        a.f.setSelected(false);
        if (a.h.getVisibility() == 8)
        {
            a.f.setVisibility(0);
            return;
        } else
        {
            a.f.setVisibility(8);
            return;
        }
    }

    private void e()
    {
        a.h.setVisibility(8);
        a.g.setVisibility(0);
    }

    private void f()
    {
        a.f.setVisibility(8);
        a.f.setSelected(false);
        a.g.setVisibility(8);
    }

    void a(SyncUICase syncuicase, a a1, boolean flag)
    {
        b = a1;
        a.b.setText(String.format(a.getContext().getString(0x7f080316), new Object[] {
            b.b
        }));
        if (!flag)
        {
            return;
        }
        f();
        switch (com.fitbit.device.ui.a[syncuicase.ordinal()])
        {
        default:
            d();
            return;

        case 1: // '\001'
            e();
            return;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
            b();
            return;

        case 12: // '\f'
            c();
            break;
        }
    }

    private A(DeviceViewWithMultipleDevicesSupport deviceviewwithmultipledevicessupport)
    {
        a = deviceviewwithmultipledevicessupport;
        super();
    }

    a(DeviceViewWithMultipleDevicesSupport deviceviewwithmultipledevicessupport, a a1)
    {
        this(deviceviewwithmultipledevicessupport);
    }
}
