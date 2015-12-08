// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

public final class val.params
    implements Runnable
{

    final ScreenCaptureOverlay this$0;
    final android.view.ams val$params;

    public final void run()
    {
        ScreenCaptureOverlay.access$1100(ScreenCaptureOverlay.this, val$params, false);
        ScreenCaptureOverlay.access$1200(ScreenCaptureOverlay.this).remove(this);
    }

    public ()
    {
        this$0 = final_screencaptureoverlay;
        val$params = android.view.ams.this;
        super();
    }
}
