// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.galileo.GalileoTracker;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.util.bv;

public class TrackerView extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected ImageView c;

    public TrackerView(Context context)
    {
        super(context);
    }

    public TrackerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrackerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void a(GalileoTracker galileotracker)
    {
        int i = galileotracker.f().a().getDeviceIcon();
        String s;
        String s1;
        if (i != 0)
        {
            c.setImageDrawable(getContext().getResources().getDrawable(i));
        } else
        {
            c.setImageDrawable(null);
        }
        s = galileotracker.a().getName();
        s1 = galileotracker.a().getAddress();
        if (s != null)
        {
            a.setText((new StringBuilder()).append(bv.a(s.toLowerCase())).append(" (").append(s1).append(")").toString());
        } else
        {
            a.setText(s1);
        }
        b.setText(String.format(getContext().getString(0x7f08061a), new Object[] {
            Integer.valueOf(galileotracker.b())
        }));
    }
}
