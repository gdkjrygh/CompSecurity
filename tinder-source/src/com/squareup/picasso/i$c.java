// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;

// Referenced classes of package com.squareup.picasso:
//            i, ab

static final class a extends BroadcastReceiver
{

    final i a;

    public final void onReceive(Context context, Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        s = intent.getAction();
        if (!"android.intent.action.AIRPLANE_MODE".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!intent.hasExtra("state")) goto _L1; else goto _L3
_L3:
        context = a;
        boolean flag = intent.getBooleanExtra("state", false);
        intent = ((i) (context)).i;
        context = ((i) (context)).i;
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        intent.sendMessage(context.obtainMessage(10, j, 0));
        return;
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(s)) goto _L1; else goto _L4
_L4:
        intent = (ConnectivityManager)ab.a(context, "connectivity");
        context = a;
        intent = intent.getActiveNetworkInfo();
        ((i) (context)).i.sendMessage(((i) (context)).i.obtainMessage(9, intent));
        return;
    }

    anager(i j)
    {
        a = j;
    }
}
