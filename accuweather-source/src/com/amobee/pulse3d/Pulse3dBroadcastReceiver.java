// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.amobee.pulse3d:
//            Log, Pulse3DWebView

public class Pulse3dBroadcastReceiver extends BroadcastReceiver
{

    private Pulse3DWebView mWebview;

    public Pulse3dBroadcastReceiver(Pulse3DWebView pulse3dwebview)
    {
        mWebview = pulse3dwebview;
    }

    public void SetWebView(Pulse3DWebView pulse3dwebview)
    {
        mWebview = pulse3dwebview;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            Log.d("Pulse3dBroadcastReceiver", "SCREEN_OFF");
            if (mWebview != null)
            {
                mWebview.injectJS("AdKitNative.NativeCallbacks.willEnterBackground()");
            }
        } else
        if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
            Log.d("Pulse3dBroadcastReceiver", "SCREEN_ON");
            if (mWebview != null)
            {
                mWebview.injectJS("AdKitNative.NativeCallbacks.willEnterForeground()");
                return;
            }
        }
    }
}
