// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;

public class FacebookBroadcastReceiver extends BroadcastReceiver
{

    public FacebookBroadcastReceiver()
    {
    }

    protected void onFailedAppCall(String s, String s1, Bundle bundle)
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        Bundle bundle;
label0:
        {
            context = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            s = intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION");
            if (context != null && s != null)
            {
                bundle = intent.getExtras();
                if (!NativeProtocol.isErrorResult(intent))
                {
                    break label0;
                }
                onFailedAppCall(context, s, bundle);
            }
            return;
        }
        onSuccessfulAppCall(context, s, bundle);
    }

    protected void onSuccessfulAppCall(String s, String s1, Bundle bundle)
    {
    }
}
