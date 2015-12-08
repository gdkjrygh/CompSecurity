// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ReplaceMotionbitView_

class ReplaceMotionbitView extends RelativeLayout
{

    protected TextView a;
    protected TextView b;
    protected LoadablePicassoImageView c;

    public ReplaceMotionbitView(Context context)
    {
        super(context);
    }

    public ReplaceMotionbitView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ReplaceMotionbitView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ReplaceMotionbitView a(Context context)
    {
        return ReplaceMotionbitView_.b(context);
    }

    protected void a()
    {
        if (b != null)
        {
            b.setVisibility(8);
        }
    }

    protected void a(Device device)
    {
        String s1 = "";
        int j = 0x106000d;
        int i = j;
        String s = s1;
        if (device != null)
        {
            i = j;
            s = s1;
            if (device.h() == DeviceVersion.MOTIONBIT)
            {
                s = device.i();
                i = device.h().getDeviceIcon();
            }
        }
        if (a != null)
        {
            a.setText(String.format(getContext().getString(0x7f080151), new Object[] {
                s
            }));
        }
        if (c != null)
        {
            c.setImageResource(i);
        }
    }
}
