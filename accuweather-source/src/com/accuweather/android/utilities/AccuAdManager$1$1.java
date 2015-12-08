// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amobee.adsdk.AdManager;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.utilities:
//            AccuAdManager

class this._cls1 extends Handler
{

    final is._cls0 this$1;

    public void handleMessage(Message message)
    {
        AccuAdManager.access$300(_fld0).getAd(AccuAdManager.access$200(_fld0));
    }

    is._cls0(Looper looper)
    {
        this$1 = this._cls1.this;
        super(looper);
    }

    // Unreferenced inner class com/accuweather/android/utilities/AccuAdManager$1

/* anonymous class */
    class AccuAdManager._cls1 extends TimerTask
    {

        final AccuAdManager this$0;

        public void run()
        {
            AccuAdManager._cls1._cls1 _lcls1 = new AccuAdManager._cls1._cls1(AccuAdManager.access$100(AccuAdManager.this).getMainLooper());
            _lcls1.sendMessage(_lcls1.obtainMessage(0));
        }

            
            {
                this$0 = AccuAdManager.this;
                super();
            }
    }

}
