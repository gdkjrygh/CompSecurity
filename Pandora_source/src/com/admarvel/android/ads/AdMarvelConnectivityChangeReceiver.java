// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, AdMarvelInternalWebView

public class AdMarvelConnectivityChangeReceiver extends BroadcastReceiver
{

    private static WeakReference adMarvelInternalWebViewReference;
    private static String eventchangeCallback = null;

    public AdMarvelConnectivityChangeReceiver()
    {
    }

    public static void registerCallback(AdMarvelInternalWebView admarvelinternalwebview, String s)
    {
        adMarvelInternalWebViewReference = new WeakReference(admarvelinternalwebview);
        if (s != null)
        {
            eventchangeCallback = s;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = Utils.getDeviceConnectivitiy(context);
        if (!intent.equals("mobile") && !intent.equals("wifi"))
        {
            break MISSING_BLOCK_LABEL_147;
        }
        context = Boolean.valueOf(true);
_L4:
        if (adMarvelInternalWebViewReference == null) goto _L2; else goto _L1
_L1:
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)adMarvelInternalWebViewReference.get();
        if (admarvelinternalwebview == null) goto _L2; else goto _L3
_L3:
        if (eventchangeCallback != null)
        {
            admarvelinternalwebview.loadUrl((new StringBuilder("javascript:")).append(eventchangeCallback).append("(").append("'").append(context).append("'").append(",").append("'").append(intent).append("'").append(")").toString());
        }
_L2:
        return;
        context;
        Logging.log((new StringBuilder(String.valueOf(context.getMessage()))).append(" Exception in AdMarvelConnectivityChangeReceiver ").toString());
        return;
        context = Boolean.valueOf(false);
          goto _L4
    }

}
