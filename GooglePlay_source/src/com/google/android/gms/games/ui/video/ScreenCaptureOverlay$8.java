// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class val.view
    implements Runnable
{

    final ScreenCaptureOverlay this$0;
    final View val$view;

    public final void run()
    {
        ScreenCaptureOverlay.access$1300(ScreenCaptureOverlay.this).removeViewImmediate(val$view);
        ScreenCaptureOverlay.access$1200(ScreenCaptureOverlay.this).remove(this);
    }

    ()
    {
        this$0 = final_screencaptureoverlay;
        val$view = View.this;
        super();
    }
}
