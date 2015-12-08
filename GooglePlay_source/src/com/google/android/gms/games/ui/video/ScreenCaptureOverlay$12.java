// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class this._cls0
    implements Runnable
{

    final ScreenCaptureOverlay this$0;

    public final void run()
    {
        VideoUtils.logChatty("ScreenCaptureOverlay", "Screen turned on");
        ScreenCaptureOverlay.access$2700(ScreenCaptureOverlay.this);
        if (ScreenCaptureOverlay.access$000(ScreenCaptureOverlay.this) == 3)
        {
            boolean _tmp = ScreenCaptureOverlay.access$2802$44fe56bf(ScreenCaptureOverlay.this);
            ScreenCaptureOverlay.access$002(ScreenCaptureOverlay.this, 1);
            ScreenCaptureOverlay.access$2900(ScreenCaptureOverlay.this);
            ScreenCaptureOverlay.access$100(ScreenCaptureOverlay.this, true);
            ScreenCaptureOverlay.access$600(ScreenCaptureOverlay.this).onStopClicked();
        }
    }

    tureOverlayListener()
    {
        this$0 = ScreenCaptureOverlay.this;
        super();
    }
}
