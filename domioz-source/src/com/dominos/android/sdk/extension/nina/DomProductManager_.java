// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.nina;

import android.content.Context;

// Referenced classes of package com.dominos.android.sdk.extension.nina:
//            DomProductManager

public final class DomProductManager_ extends DomProductManager
{

    private Context context_;

    private DomProductManager_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static DomProductManager_ getInstance_(Context context)
    {
        return new DomProductManager_(context);
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
