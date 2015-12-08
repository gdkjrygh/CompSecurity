// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

static class zzNj extends BroadcastReceiver
{

    private WeakReference zzNj;

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getData();
        context = null;
        if (intent != null)
        {
            context = intent.getSchemeSpecificPart();
        }
        if (context != null && context.equals("com.google.android.gms"))
        {
            if ((context = (zzd)zzNj.get()) != null)
            {
                com.google.android.gms.common.api.zzd.zzk(context);
                return;
            }
        }
    }

    (zzd zzd1)
    {
        zzNj = new WeakReference(zzd1);
    }
}
