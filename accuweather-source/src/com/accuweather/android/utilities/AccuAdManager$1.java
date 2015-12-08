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

class this._cls0 extends TimerTask
{

    final AccuAdManager this$0;

    public void run()
    {
        Handler handler = new Handler(AccuAdManager.access$100(AccuAdManager.this).getMainLooper()) {

            final AccuAdManager._cls1 this$1;

            public void handleMessage(Message message)
            {
                AccuAdManager.access$300(this$0).getAd(AccuAdManager.access$200(this$0));
            }

            
            {
                this$1 = AccuAdManager._cls1.this;
                super(looper);
            }
        };
        handler.sendMessage(handler.obtainMessage(0));
    }

    _cls1.this._cls1()
    {
        this$0 = AccuAdManager.this;
        super();
    }
}
