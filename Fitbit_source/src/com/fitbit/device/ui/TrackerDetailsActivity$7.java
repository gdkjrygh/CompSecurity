// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity, ScreenOrderSelector_, ScreenOrderSelector

class a
    implements android.view.ivity._cls7
{

    final TrackerDetailsActivity a;

    public void onClick(View view)
    {
        if (a.P())
        {
            ScreenOrderSelector_.a().a(a.q).a().show(a.getSupportFragmentManager(), null);
        }
    }

    (TrackerDetailsActivity trackerdetailsactivity)
    {
        a = trackerdetailsactivity;
        super();
    }
}
