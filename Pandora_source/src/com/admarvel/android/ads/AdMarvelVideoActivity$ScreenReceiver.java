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
//            AdMarvelVideoActivity, AdMarvelVideoView

class this._cls0 extends BroadcastReceiver
{

    final AdMarvelVideoActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            Logging.log("Screen lock broadcast recieved");
            if (progressDialogReference != null)
            {
                context = (sDialog)progressDialogReference.get();
                if (context != null && context.isShowing() && !AdMarvelVideoActivity.access$21(AdMarvelVideoActivity.this))
                {
                    context.dismiss();
                    closeVideoInterstitial();
                }
            }
            if (AdMarvelVideoActivity.access$22(AdMarvelVideoActivity.this) && videoState == e.PausedBySystem && AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this) != null)
            {
                videoState = e.Playing;
                AdMarvelVideoActivity.access$23(AdMarvelVideoActivity.this, false);
            }
            if (AdMarvelVideoActivity.access$24(AdMarvelVideoActivity.this) && videoState == e.PausedBySystem && AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this) != null)
            {
                AdMarvelVideoActivity.access$0(AdMarvelVideoActivity.this).pause();
                videoState = e.Paused;
                AdMarvelVideoActivity.access$25(AdMarvelVideoActivity.this, false);
            }
        }
    }

    e()
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
    }
}
