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

final class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public final void run()
    {
        ScreenCaptureOverlay.access$200(_fld0);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/video/ScreenCaptureOverlay$2

/* anonymous class */
    final class ScreenCaptureOverlay._cls2 extends BroadcastReceiver
    {

        final ScreenCaptureOverlay this$0;

        public final void onReceive(Context context, Intent intent)
        {
            ScreenCaptureOverlay.access$300(ScreenCaptureOverlay.this).post("ScreenCaptureOverlay", "onConfigurationChanged", new ScreenCaptureOverlay._cls2._cls1());
        }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
    }

}
