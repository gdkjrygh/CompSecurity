// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            qa

final class qc extends BroadcastReceiver
{

    final qa a;

    private qc(qa qa1)
    {
        a = qa1;
        super();
    }

    qc(qa qa1, byte byte0)
    {
        this(qa1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        {
            qa.a(a, true);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            qa.a(a, false);
            return;
        }
    }
}
