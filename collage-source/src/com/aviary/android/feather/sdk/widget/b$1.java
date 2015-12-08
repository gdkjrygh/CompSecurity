// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            b

class a extends BroadcastReceiver
{

    final b a;

    public void onReceive(Context context, Intent intent)
    {
        b.a.c("downloadStatusReceiver::onReceive: %s", new Object[] {
            intent
        });
        if (intent != null && a.d())
        {
            context = intent.getStringExtra("packType");
            long l = intent.getLongExtra("packId", -1L);
            int i = intent.getIntExtra("status", -1);
            b.a(a).a(l, context, i);
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
