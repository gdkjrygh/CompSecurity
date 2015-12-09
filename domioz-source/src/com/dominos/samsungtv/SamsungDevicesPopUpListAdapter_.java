// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.content.Context;
import com.dominos.MobileSession_;
import com.dominos.utils.AnalyticsUtil_;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungDevicesPopUpListAdapter

public final class SamsungDevicesPopUpListAdapter_ extends SamsungDevicesPopUpListAdapter
{

    private Context context_;

    private SamsungDevicesPopUpListAdapter_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static SamsungDevicesPopUpListAdapter_ getInstance_(Context context)
    {
        return new SamsungDevicesPopUpListAdapter_(context);
    }

    private void init_()
    {
        mAnalyticsUtil = AnalyticsUtil_.getInstance_(context_);
        mMobileSession = MobileSession_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
