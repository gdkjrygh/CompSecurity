// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.content.Context;
import com.dominos.App_;

// Referenced classes of package com.dominos.notification:
//            TrackerServiceController

public final class TrackerServiceController_ extends TrackerServiceController
{

    private Context context_;

    private TrackerServiceController_(Context context)
    {
        super(context);
        context_ = context;
        init_();
    }

    public static TrackerServiceController_ getInstance_(Context context)
    {
        return new TrackerServiceController_(context);
    }

    private void init_()
    {
        app = App_.getInstance();
    }

    public final void rebind(Context context)
    {
        context_ = context;
        init_();
    }
}
