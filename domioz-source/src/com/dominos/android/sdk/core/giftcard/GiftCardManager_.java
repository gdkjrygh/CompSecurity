// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.giftcard;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.core.giftcard:
//            GiftCardManager

public final class GiftCardManager_ extends GiftCardManager
{

    private Context context_;

    private GiftCardManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static GiftCardManager_ getInstance_(Context context)
    {
        return new GiftCardManager_(context);
    }

    private void init_()
    {
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
