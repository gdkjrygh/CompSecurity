// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import com.google.android.apps.common.csi.lib.Timer;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycCaptureIdActivity

final class <init>
    implements Timer
{

    long elapsedTime;
    final KycCaptureIdActivity this$0;

    public final long elapsedRealtime()
    {
        return elapsedTime;
    }

    private I()
    {
        this$0 = KycCaptureIdActivity.this;
        super();
        elapsedTime = 0L;
    }

    elapsedTime(elapsedTime elapsedtime)
    {
        this();
    }
}
