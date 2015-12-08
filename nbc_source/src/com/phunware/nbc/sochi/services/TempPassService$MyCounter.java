// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.services;

import android.os.CountDownTimer;
import android.os.Handler;
import com.phunware.nbc.sochi.system.NBCSystem;

// Referenced classes of package com.phunware.nbc.sochi.services:
//            TempPassService

private class this._cls0 extends CountDownTimer
{

    final TempPassService this$0;

    public void onFinish()
    {
        NBCSystem.debugLog("TempPassService", "CountDownTimer onFinish(");
        TempPassService.access$402(TempPassService.this, 0L);
        NBCSystem.debugLog("Timer", (new StringBuilder()).append("").append(TempPassService.access$400(TempPassService.this)).toString());
        TempPassService.access$600(TempPassService.this).post(TempPassService.access$500(TempPassService.this));
        stopSelf();
    }

    public void onTick(long l)
    {
        TempPassService.access$402(TempPassService.this, l / 1000L);
        TempPassService.access$600(TempPassService.this).removeCallbacks(TempPassService.access$700(TempPassService.this));
        TempPassService.access$600(TempPassService.this).post(TempPassService.access$700(TempPassService.this));
    }

    public (long l, long l1)
    {
        this$0 = TempPassService.this;
        super(l, l1);
    }
}
