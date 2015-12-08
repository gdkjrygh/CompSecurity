// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.core.store:
//            StoreAPI

public final class StoreAPI_ extends StoreAPI
{

    private Context context_;

    private StoreAPI_(Context context)
    {
        context_ = context;
        init_();
    }

    public static StoreAPI_ getInstance_(Context context)
    {
        return new StoreAPI_(context);
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
