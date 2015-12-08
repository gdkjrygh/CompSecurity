// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import android.content.res.Resources;
import android.view.View;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.landing.ILandingService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.User;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.ride:
//            AcceptTermsView

class this._cls1 extends AsyncCall
{

    final rogress this$1;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        errorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        if (isToDriverFlow)
        {
            dialogFlow.show(new Toast(getResources().getString(0x7f070364)));
            if (userProvider.getUser().isApprovedDriver())
            {
                appFlow.resetTo(new me.lyft.android.ui.en());
                return;
            } else
            {
                appFlow.replaceWith(new me.lyft.android.ui.onboarding.bApplicationStatusScreen());
                return;
            }
        } else
        {
            appFlow.goBack();
            return;
        }
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    l.binder()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/ride/AcceptTermsView$2

/* anonymous class */
    class AcceptTermsView._cls2
        implements android.view.View.OnClickListener
    {

        final AcceptTermsView this$0;
        final Binder val$binder;

        public void onClick(View view)
        {
            progressController.showProgress();
            binder.bind(landingService.setTosAcceptedAndUpdateUser(), new AcceptTermsView._cls2._cls1());
        }

            
            {
                this$0 = final_accepttermsview;
                binder = Binder.this;
                super();
            }
    }

}
