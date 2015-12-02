// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.a.a.a:
//            d

class dcastReceiver extends BroadcastReceiver
{

    final d a;

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !"android.intent.action.SCREEN_ON".equals(intent.getAction())) 
        {
            return;
        }
        d.a(a);
    }

    nt(d d1)
    {
        a = d1;
        super();
    }
}
