// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

// Referenced classes of package com.kik.cards.web:
//            bb

final class bc extends BroadcastReceiver
{

    final bb a;

    bc(bb bb1)
    {
        a = bb1;
        super();
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            context = (NetworkInfo)intent.getParcelableExtra("networkInfo");
            bb.a(a, context.isAvailable());
        }
    }
}
