// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.games.util.VideoHandler;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class this._cls0 extends BroadcastReceiver
{

    final ScreenCaptureOverlay this$0;

    public final void onReceive(Context context, Intent intent)
    {
        ScreenCaptureOverlay.access$300(ScreenCaptureOverlay.this).post("ScreenCaptureOverlay", "onConfigurationChanged", new Runnable() {

            final ScreenCaptureOverlay._cls2 this$1;

            public final void run()
            {
                ScreenCaptureOverlay.access$200(this$0);
            }

            
            {
                this$1 = ScreenCaptureOverlay._cls2.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = ScreenCaptureOverlay.this;
        super();
    }
}
