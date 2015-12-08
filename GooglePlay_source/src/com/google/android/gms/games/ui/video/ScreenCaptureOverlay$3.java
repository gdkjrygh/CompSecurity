// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import com.google.android.gms.games.util.VideoHandler;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class this._cls0
    implements android.view.tyChangeListener
{

    final ScreenCaptureOverlay this$0;

    public final void onSystemUiVisibilityChange(final int visibility)
    {
        ScreenCaptureOverlay.access$300(ScreenCaptureOverlay.this).post("ScreenCaptureOverlay", "onSystemUiVisibilityChange", new Runnable() {

            final ScreenCaptureOverlay._cls3 this$1;
            final int val$visibility;

            public final void run()
            {
                ScreenCaptureOverlay.access$400(this$0, visibility);
            }

            
            {
                this$1 = ScreenCaptureOverlay._cls3.this;
                visibility = i;
                super();
            }
        });
    }

    _cls1.val.visibility()
    {
        this$0 = ScreenCaptureOverlay.this;
        super();
    }
}
