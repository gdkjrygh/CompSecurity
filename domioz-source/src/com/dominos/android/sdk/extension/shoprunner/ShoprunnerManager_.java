// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.shoprunner;

import android.content.Context;
import com.dominos.android.sdk.data.http.shoprunner.ShopRunnerRestClient_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.android.sdk.extension.shoprunner:
//            ShoprunnerManager

public final class ShoprunnerManager_ extends ShoprunnerManager
{

    private static ShoprunnerManager_ instance_;
    private Context context_;

    private ShoprunnerManager_(Context context)
    {
        context_ = context;
    }

    public static ShoprunnerManager_ getInstance_(Context context)
    {
        if (instance_ == null)
        {
            c c1 = c.a(null);
            context = new ShoprunnerManager_(context.getApplicationContext());
            instance_ = context;
            context.init_();
            c.a(c1);
        }
        return instance_;
    }

    private void init_()
    {
        mPrefs = new DominosPrefs_(context_);
        mShopRunnerAPI = ShopRunnerRestClient_.getInstance_(context_);
    }
}
