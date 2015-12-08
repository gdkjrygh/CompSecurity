// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;

// Referenced classes of package com.dominos.utils:
//            TrackerStatusUtil

public final class TrackerStatusUtil_ extends TrackerStatusUtil
{

    private Context context_;

    private TrackerStatusUtil_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static TrackerStatusUtil_ getInstance_(Context context)
    {
        return new TrackerStatusUtil_(context);
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
