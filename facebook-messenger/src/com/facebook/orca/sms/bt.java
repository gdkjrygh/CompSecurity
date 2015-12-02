// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook.orca.sms:
//            br, af

class bt extends BroadcastReceiver
{

    final String a;
    final br b;

    bt(br br1, String s)
    {
        b = br1;
        a = s;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        int i = getResultCode();
        br.a(b).a(a, i);
    }
}
