// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.cmcm.adsdk.b.a;
import com.cmcm.adsdk.b.e.b;
import com.cmcm.adsdk.c.c;

// Referenced classes of package com.cmcm.adsdk:
//            b, j

final class d extends BroadcastReceiver
{

    d()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (!c.a(context))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (b.d() && TextUtils.isEmpty(b.a("")))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.cmcm.adsdk.j.a("CMCMADSDK", "isSDKWork  is false or cacheJson is null ");
        if (b.l() == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        context.getApplicationContext().unregisterReceiver(b.l());
        a(null);
        return;
        context;
        context.printStackTrace();
        return;
        b.n().a(b.m());
        return;
    }
}
