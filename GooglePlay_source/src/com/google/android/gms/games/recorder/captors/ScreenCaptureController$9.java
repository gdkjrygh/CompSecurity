// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.net.Uri;
import com.google.android.gms.games.util.VideoUtils;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0
    implements com.google.android.gms.games.recorder.encode.
{

    final ScreenCaptureController this$0;

    public final void onResultAvailable(Uri uri)
    {
        VideoUtils.logChatty("ScreenCaptureController", "MediaMux.ResultCallback#onResultAvailable - muxer stopped");
        mCaptureStateCallback.onCaptureStopped(uri);
    }

    ptureStateCallback()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
