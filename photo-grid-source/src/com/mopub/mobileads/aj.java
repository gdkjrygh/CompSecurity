// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.view.View;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mraid.MraidController;

// Referenced classes of package com.mopub.mobileads:
//            MraidActivity, n, EventForwardingBroadcastReceiver

final class aj
    implements com.mopub.mraid.MraidController.MraidListener
{

    final MraidActivity a;

    aj(MraidActivity mraidactivity)
    {
        a = mraidactivity;
        super();
    }

    public final void onClose()
    {
        MraidActivity.a(a).loadJavascript(n.WEB_VIEW_DID_CLOSE.a());
        a.finish();
    }

    public final void onExpand()
    {
    }

    public final void onFailedToLoad()
    {
        MoPubLog.d("MraidActivity failed to load. Finishing the activity");
        EventForwardingBroadcastReceiver.a(a, a.a().longValue(), "com.mopub.action.interstitial.fail");
        a.finish();
    }

    public final void onLoaded(View view)
    {
        MraidActivity.a(a).loadJavascript(n.WEB_VIEW_DID_APPEAR.a());
    }

    public final void onOpen()
    {
        EventForwardingBroadcastReceiver.a(a, a.a().longValue(), "com.mopub.action.interstitial.click");
    }
}
