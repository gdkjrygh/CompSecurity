// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import com.fitbit.data.domain.device.Device;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity, GuideActivity_

class a
    implements android.view.vity._cls20
{

    final Device a;
    final TrackerDetailsActivity b;

    public void onClick(View view)
    {
        if (b.P())
        {
            GuideActivity_.a(b).b(a.z()).a();
        }
    }

    (TrackerDetailsActivity trackerdetailsactivity, Device device)
    {
        b = trackerdetailsactivity;
        a = device;
        super();
    }
}
