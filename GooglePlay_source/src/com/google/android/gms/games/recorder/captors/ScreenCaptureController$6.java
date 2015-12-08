// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

final class this._cls0
    implements com.google.android.gms.games.recorder.encode.
{

    final ScreenCaptureController this$0;

    public final void onError$1d13998f(int i)
    {
        GamesLog.e("ScreenCaptureController", (new StringBuilder("Encoder error: ")).append(GamesStatusCodes.getStatusString(i)).toString());
        notifyErrorStatus(i);
    }

    ()
    {
        this$0 = ScreenCaptureController.this;
        super();
    }
}
