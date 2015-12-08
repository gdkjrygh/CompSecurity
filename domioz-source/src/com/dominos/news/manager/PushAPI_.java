// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.news.manager;

import android.content.Context;
import com.dominos.android.sdk.core.setup.ConfigurationManager_;

// Referenced classes of package com.dominos.news.manager:
//            PushAPI

public final class PushAPI_ extends PushAPI
{

    private Context context_;

    private PushAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static PushAPI_ getInstance_(Context context)
    {
        return new PushAPI_(context);
    }

    private void init_()
    {
        mConfigurationManager = ConfigurationManager_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
