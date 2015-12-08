// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.infrastructure.lyft.work.OrganizationDTO;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksMainView

class val.analytics extends AsyncCall
{

    final WorkPerksMainView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((UserOrganizationDTO)obj);
    }

    public void onSuccess(UserOrganizationDTO userorganizationdto)
    {
        String s;
        if (userorganizationdto.getOrganization() != null)
        {
            s = userorganizationdto.getOrganization().getName();
        } else
        {
            s = "";
        }
        val$analytics.trackResponseSuccess(s);
        userOrganization = userorganizationdto;
        WorkPerksMainView.access$000(WorkPerksMainView.this);
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
        progressController.hideProgress();
    }

    izationDTO()
    {
        this$0 = final_workperksmainview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
