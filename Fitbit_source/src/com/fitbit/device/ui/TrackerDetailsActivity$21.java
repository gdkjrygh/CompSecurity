// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.support.v7.widget.SwitchCompat;
import android.view.View;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

class a
    implements android.view.vity._cls21
{

    final TrackerDetailsActivity a;

    public void onClick(View view)
    {
        if (TrackerDetailsActivity.d(a) != null && !TrackerDetailsActivity.d(a).())
        {
            view = TrackerDetailsActivity.d(a).();
            TrackerDetailsActivity trackerdetailsactivity = a;
            boolean flag;
            if (!view.isChecked())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            TrackerDetailsActivity.a(trackerdetailsactivity, flag);
        }
    }

    (TrackerDetailsActivity trackerdetailsactivity)
    {
        a = trackerdetailsactivity;
        super();
    }
}
