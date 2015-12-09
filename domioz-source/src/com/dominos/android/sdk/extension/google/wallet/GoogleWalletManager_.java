// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.google.wallet;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.common.ConfigProvider_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;

// Referenced classes of package com.dominos.android.sdk.extension.google.wallet:
//            GoogleWalletManager

public final class GoogleWalletManager_ extends GoogleWalletManager
{

    private Context context_;

    private GoogleWalletManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static GoogleWalletManager_ getInstance_(Context context)
    {
        return new GoogleWalletManager_(context);
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        mConfigProvider = ConfigProvider_.getInstance_(context_);
        appService = ApplicationService_.getInstance_(context_);
        setup();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
