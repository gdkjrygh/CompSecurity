// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.device.BatteryLevel;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.e.a;
import com.fitbit.home.ui.i;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

public class DeviceView extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected LoadablePicassoImageView c;
    protected TextView d;
    private String e;
    private i f;

    public DeviceView(Context context)
    {
        super(context);
        e = com/fitbit/device/ui/DeviceView.getSimpleName();
        f = new i();
    }

    public DeviceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = com/fitbit/device/ui/DeviceView.getSimpleName();
        f = new i();
    }

    public DeviceView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        e = com/fitbit/device/ui/DeviceView.getSimpleName();
        f = new i();
    }

    public static void a(Device device, TextView textview)
    {
        if (device == null)
        {
            throw new IllegalArgumentException("Device can not be null");
        }
        if (textview == null)
        {
            throw new IllegalArgumentException("batteryLevel can not be null");
        }
        String s = com/fitbit/device/ui/DeviceView.getSimpleName();
        switch (device.f().getSmallImageInt())
        {
        default:
            com.fitbit.e.a.b(s, "Device battery was set to something unknown", new Object[0]);
            return;

        case 0: // '\0'
            com.fitbit.e.a.b(s, "Device battery empty, setting text to empty", new Object[0]);
            textview.setText(0x7f080084);
            return;

        case 2130837608: 
            com.fitbit.e.a.b(s, "Device battery low, setting text to low", new Object[0]);
            textview.setText(0x7f080086);
            return;

        case 2130837609: 
            com.fitbit.e.a.b(s, "Device battery medium, setting text to medium", new Object[0]);
            textview.setText(0x7f080087);
            return;

        case 2130837607: 
            com.fitbit.e.a.b(s, "Device battery full, setting text to full", new Object[0]);
            textview.setText(0x7f080085);
            return;
        }
    }

    public void a(Device device)
    {
        a.setText(device.i());
        String s;
        if (device.h() == DeviceVersion.MOTIONBIT || device.h() == DeviceVersion.ULTRA || device.h() == DeviceVersion.CLASSIC || device.h() == DeviceVersion.ARIA)
        {
            c.setImageResource(device.h().getDeviceIcon());
        } else
        if (device.a() != null)
        {
            c.a(device.a());
        }
        s = f.a(device.e(), getContext(), 0x7f080157);
        b.setText(String.format(getContext().getString(0x7f080316), new Object[] {
            s
        }));
        if (device.h() == DeviceVersion.MOTIONBIT)
        {
            d.setVisibility(8);
            return;
        } else
        {
            d.setVisibility(0);
            a(device, d);
            return;
        }
    }
}
