// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.skype.android.util:
//            CheckedReceiverFilter

public abstract class CheckedBroadcastReceiver extends BroadcastReceiver
    implements CheckedReceiverFilter.IntentHandler
{

    private final CheckedReceiverFilter filter;

    public CheckedBroadcastReceiver(String as[])
    {
        filter = new CheckedReceiverFilter(as, this);
    }

    public void onReceive(Context context, Intent intent)
    {
        filter.a(context, intent);
    }

    public abstract void onReceiveFiltered(Context context, Intent intent, int i);

    public void register(Context context)
    {
        if (filter.a.size() > 0)
        {
            IntentFilter intentfilter = new IntentFilter();
            for (Iterator iterator = filter.a.keySet().iterator(); iterator.hasNext(); intentfilter.addAction((String)iterator.next())) { }
            context.registerReceiver(this, intentfilter);
        }
    }

    public void unregister(Context context)
    {
        context.unregisterReceiver(this);
    }
}
