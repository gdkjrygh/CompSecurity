// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.content.Context;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungTVManager

public final class SamsungTVManager_ extends SamsungTVManager
{

    private Context context_;

    private SamsungTVManager_(Context context)
    {
        context_ = context;
        init_();
    }

    public static SamsungTVManager_ getInstance_(Context context)
    {
        return new SamsungTVManager_(context);
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
