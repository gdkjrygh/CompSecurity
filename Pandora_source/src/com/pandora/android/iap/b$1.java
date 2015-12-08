// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.iap;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.j;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;

// Referenced classes of package com.pandora.android.iap:
//            b

class eiver extends BroadcastReceiver
{

    final Activity a;
    final com.pandora.android.iap.b b;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            context = intent.getAction();
            if (PandoraIntent.a("get_usage_result").equals(context))
            {
                b.a.C().a(this);
                boolean flag = intent.getBooleanExtra("intent_is_capped", false);
                com.pandora.android.iap.b.d((new StringBuilder()).append("purchaseFromAmazon: isCapped: ").append(flag).toString());
                com.pandora.android.iap.b.a(b, b.c());
                if (!flag)
                {
                    break label0;
                }
                com.pandora.android.iap.b.a(b, a);
            }
            return;
        }
        s.d(a);
    }

    (com.pandora.android.iap.b b1, Activity activity)
    {
        b = b1;
        a = activity;
        super();
    }
}
