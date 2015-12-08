// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.Navigation;
import com.skype.android.util.permission.PermissionHandlerAdapter;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity

final class dlerAdapter extends PermissionHandlerAdapter
{

    final DialpadActivity this$0;
    final String val$normalizedNumber;
    final String val$phoneNumber;

    public final void onGranted()
    {
        if (nav.placeCall(val$normalizedNumber))
        {
            analytics.c(AnalyticsEvent.i);
            return;
        } else
        {
            DialpadActivity.access$100(DialpadActivity.this, val$phoneNumber, val$normalizedNumber);
            return;
        }
    }

    dlerAdapter()
    {
        this$0 = final_dialpadactivity;
        val$normalizedNumber = s;
        val$phoneNumber = String.this;
        super();
    }
}
