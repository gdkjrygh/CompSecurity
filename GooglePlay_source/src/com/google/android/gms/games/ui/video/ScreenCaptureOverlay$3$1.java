// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import com.google.android.gms.games.util.VideoHandler;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class val.visibility
    implements Runnable
{

    final val.visibility this$1;
    final int val$visibility;

    public final void run()
    {
        ScreenCaptureOverlay.access$400(_fld0, val$visibility);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$visibility = I.this;
        super();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/video/ScreenCaptureOverlay$3

/* anonymous class */
    final class ScreenCaptureOverlay._cls3
        implements android.view.View.OnSystemUiVisibilityChangeListener
    {

        final ScreenCaptureOverlay this$0;

        public final void onSystemUiVisibilityChange(int i)
        {
            ScreenCaptureOverlay.access$300(ScreenCaptureOverlay.this).post("ScreenCaptureOverlay", "onSystemUiVisibilityChange", i. new ScreenCaptureOverlay._cls3._cls1());
        }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
    }

}
