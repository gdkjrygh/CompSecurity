// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.storelocator;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.core.storelocator:
//            CampusLocatorManager, CampusLocatorAPI_

public final class CampusLocatorManager_ extends CampusLocatorManager
{

    private Context context_;

    private CampusLocatorManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static CampusLocatorManager_ getInstance_(Context context)
    {
        return new CampusLocatorManager_(context);
    }

    private void init_()
    {
        mCampusLocatorAPI = CampusLocatorAPI_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
