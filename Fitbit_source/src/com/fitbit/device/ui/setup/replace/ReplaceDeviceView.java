// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractTrackerListItem;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ReplaceDeviceView_

class ReplaceDeviceView extends AbstractTrackerListItem
{

    public ReplaceDeviceView(Context context)
    {
        super(context);
    }

    public ReplaceDeviceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ReplaceDeviceView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ReplaceDeviceView a(Context context)
    {
        return ReplaceDeviceView_.b(context);
    }

    protected void a()
    {
        if (b != null)
        {
            b.setVisibility(8);
        }
    }

    protected void b(TrackerType trackertype)
    {
        a.setText(String.format(getContext().getString(0x7f080151), new Object[] {
            trackertype.a()
        }));
    }

    protected void c(TrackerType trackertype)
    {
    }
}
