// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.content.Context;
import android.content.Intent;
import com.dominos.wear.client.WearMessageClient_;

// Referenced classes of package com.dominos.notification:
//            DismissReceiver

public final class DismissReceiver_ extends DismissReceiver
{

    public DismissReceiver_()
    {
    }

    private void init_(Context context)
    {
        mWearMessageClient = WearMessageClient_.getInstance_(context);
    }

    public final void onReceive(Context context, Intent intent)
    {
        init_(context);
        super.onReceive(context, intent);
    }
}
