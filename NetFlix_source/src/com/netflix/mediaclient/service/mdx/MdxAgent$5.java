// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxAgent

class this._cls0 extends BroadcastReceiver
{

    final MdxAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            Log.v("nf_mdx_agent", "Null intent");
        } else
        {
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
            {
                Log.d("nf_mdx_agent", "useprofile is active");
                notifyIsUserLogin(true);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(context))
            {
                Log.d("nf_mdx_agent", "useprofile is not active");
                notifyIsUserLogin(false);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE".equals(context))
            {
                Log.d("nf_mdx_agent", "user account is activated");
                return;
            }
            if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(context))
            {
                Log.d("nf_mdx_agent", "user account is deactivated");
                return;
            }
        }
    }

    ()
    {
        this$0 = MdxAgent.this;
        super();
    }
}
