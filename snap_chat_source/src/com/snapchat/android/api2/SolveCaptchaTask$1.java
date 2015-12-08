// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import UD;
import pi;

// Referenced classes of package com.snapchat.android.api2:
//            SolveCaptchaTask

final class val.networkResult
    implements Runnable
{

    final SolveCaptchaTask this$0;
    final pi val$networkResult;
    final UD val$responsePayload;

    public final void run()
    {
        onJsonResultMainThread(val$responsePayload, val$networkResult);
    }

    ()
    {
        this$0 = final_solvecaptchatask;
        val$responsePayload = ud;
        val$networkResult = pi.this;
        super();
    }
}
