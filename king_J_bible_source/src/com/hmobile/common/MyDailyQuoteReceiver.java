// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.hmobile.common:
//            DailyQouteService

public class MyDailyQuoteReceiver extends BroadcastReceiver
{

    public MyDailyQuoteReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(new Intent(context, com/hmobile/common/DailyQouteService));
    }
}
