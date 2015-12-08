// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.os.CountDownTimer;
import android.widget.TextView;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class this._cls0 extends CountDownTimer
{

    final ScreenCaptureOverlay this$0;

    public final void onFinish()
    {
        ScreenCaptureOverlay.access$1500(ScreenCaptureOverlay.this);
        if (ScreenCaptureOverlay.access$600(ScreenCaptureOverlay.this) != null)
        {
            ScreenCaptureOverlay.access$600(ScreenCaptureOverlay.this).onStartClicked();
        }
        ScreenCaptureOverlay.access$002(ScreenCaptureOverlay.this, 3);
    }

    public final void onTick(long l)
    {
        ScreenCaptureOverlay.access$1400(ScreenCaptureOverlay.this).setText(Long.toString((999L + l) / 1000L));
    }

    tureOverlayListener()
    {
        this$0 = ScreenCaptureOverlay.this;
        super(3000L, 500L);
    }
}
