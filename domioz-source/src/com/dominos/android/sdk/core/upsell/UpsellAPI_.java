// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.upsell;

import android.content.Context;
import com.dominos.android.sdk.data.http.cdn.ContentRestClient_;

// Referenced classes of package com.dominos.android.sdk.core.upsell:
//            UpsellAPI

public final class UpsellAPI_ extends UpsellAPI
{

    private Context context_;

    private UpsellAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static UpsellAPI_ getInstance_(Context context)
    {
        return new UpsellAPI_(context);
    }

    private void init_()
    {
        mContentRestClient = ContentRestClient_.getInstance_(context_);
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
