// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.widget.LinearLayout;
import me.lyft.android.IUserSession;
import me.lyft.android.common.AppFlow;
import me.lyft.android.infrastructure.ats.ATSException;
import me.lyft.android.infrastructure.ats.DriverApplicationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.onboarding:
//            WebApplicationStatusView

class this._cls0 extends AsyncCall
{

    final WebApplicationStatusView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        if ((throwable instanceof ATSException) && ((ATSException)throwable).getStatusCode() == 404)
        {
            appFlow.replaceWith(new tDriver());
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((DriverApplicationDTO)obj);
    }

    public void onSuccess(DriverApplicationDTO driverapplicationdto)
    {
        super.onSuccess(driverapplicationdto);
        userSession.setDriverApplication(driverapplicationdto);
        WebApplicationStatusView.access$000(WebApplicationStatusView.this, driverapplicationdto);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        contentLayout.setVisibility(0);
        progressController.hideProgress();
    }

    tDriver()
    {
        this$0 = WebApplicationStatusView.this;
        super();
    }
}
