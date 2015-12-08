// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.product;

import android.content.Context;
import com.dominos.android.sdk.app.ApplicationService_;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;

// Referenced classes of package com.dominos.android.sdk.core.product:
//            ProductWizardManager

public final class ProductWizardManager_ extends ProductWizardManager
{

    private Context context_;

    private ProductWizardManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static ProductWizardManager_ getInstance_(Context context)
    {
        return new ProductWizardManager_(context);
    }

    private void init_()
    {
        prefs = new DominosPrefs_(context_);
        appService = ApplicationService_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
