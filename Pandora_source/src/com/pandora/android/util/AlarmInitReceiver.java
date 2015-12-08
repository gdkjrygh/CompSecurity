// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p.df.a;

// Referenced classes of package com.pandora.android.util:
//            e

public class AlarmInitReceiver extends BroadcastReceiver
{

    public AlarmInitReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getAction();
        a.a("AlarmInitReceiver", (new StringBuilder()).append("AlarmInitReceiver triggered with action: ").append(intent).toString());
        intent = com.pandora.android.util.e.a(context);
        intent.b(context);
        intent.a();
    }
}
