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
import com.pandora.android.activity.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.provider.f;

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
label1:
            {
label2:
                {
                    context = intent.getAction();
                    if (PandoraIntent.a("can_subscribe_result").equals(context))
                    {
                        b.a.C().a(this);
                        boolean flag = intent.getBooleanExtra("intent_can_susbscribe", true);
                        boolean flag1 = intent.getBooleanExtra("intent_is_end_of_month", false);
                        com.pandora.android.iap.b.d((new StringBuilder()).append("subscribeUsingAmazon: canSubscribe ").append(flag).append(", hasAmazonSubscription ").append(b.d()).append(", isEndOfMonth ").append(flag1).toString());
                        if (flag1)
                        {
                            context = com.pandora.android.iap.b.b(b);
                        } else
                        {
                            context = com.pandora.android.iap.b.c(b);
                        }
                        if (!flag)
                        {
                            break label0;
                        }
                        if (!com.pandora.android.iap.b.d(b))
                        {
                            break label1;
                        }
                        intent = com.pandora.android.iap.b.e(b).b("AMAZON_PURCHASED_TOKEN");
                        if (!s.a(a))
                        {
                            break label2;
                        }
                        com.pandora.android.activity.a.a(a, com.pandora.android.iap.b.f(b), intent, context);
                    }
                    return;
                }
                b.a(com.pandora.android.iap.b.f(b), intent, context);
                return;
            }
            b.a(context);
            return;
        }
        com.pandora.android.iap.b.c("subscriptions unavailable");
        s.e(com.pandora.android.iap.b.g(b));
    }

    .a(com.pandora.android.iap.b b1, Activity activity)
    {
        b = b1;
        a = activity;
        super();
    }
}
