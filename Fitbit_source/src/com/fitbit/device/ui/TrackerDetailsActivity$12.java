// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.ei;
import com.fitbit.data.domain.device.Device;
import com.fitbit.util.bj;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

class a extends bj
{

    final TrackerDetailsActivity a;

    public Device b()
    {
        return an.a().a(a.q);
    }

    protected Intent f()
    {
        return ei.a(getContext(), true);
    }

    public Object f_()
    {
        return b();
    }

    (TrackerDetailsActivity trackerdetailsactivity, Context context, IntentFilter intentfilter)
    {
        a = trackerdetailsactivity;
        super(context, intentfilter);
    }
}
