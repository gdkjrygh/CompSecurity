// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.view.View;
import me.lyft.android.IUserSession;
import me.lyft.android.infrastructure.ats.DriverApplicationDataDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            BecomeLyftDriverView

class this._cls0 extends AsyncCall
{

    final BecomeLyftDriverView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        becomeDriverContainer.setVisibility(8);
        retryView.setVisibility(0);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((DriverApplicationDataDTO)obj);
    }

    public void onSuccess(DriverApplicationDataDTO driverapplicationdatadto)
    {
        super.onSuccess(driverapplicationdatadto);
        userSession.setDriverApplicationData(driverapplicationdatadto);
        BecomeLyftDriverView.access$300(BecomeLyftDriverView.this);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ataDTO()
    {
        this$0 = BecomeLyftDriverView.this;
        super();
    }
}
