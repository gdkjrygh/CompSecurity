// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AccessToken, h

final class i extends BroadcastReceiver
{

    final h a;

    private i(h h1)
    {
        a = h1;
        super();
    }

    i(h h1, byte byte0)
    {
        this(h1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()))
        {
            intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
            context = (AccessToken)intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
            a.a(context);
        }
    }
}
