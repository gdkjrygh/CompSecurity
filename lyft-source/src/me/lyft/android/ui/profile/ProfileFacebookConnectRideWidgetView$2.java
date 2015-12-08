// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.widget.LinearLayout;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.profile:
//            ProfileFacebookConnectRideWidgetView

class this._cls0 extends AsyncCall
{

    final ProfileFacebookConnectRideWidgetView this$0;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        fbConnectContainer.setVisibility(4);
        unit = ProfileFacebookConnectRideWidgetView.access$100(ProfileFacebookConnectRideWidgetView.this);
        if (unit.hasMutualFriends())
        {
            ProfileFacebookConnectRideWidgetView.access$200(ProfileFacebookConnectRideWidgetView.this, unit);
            return;
        } else
        {
            dialogFlow.show(new Toast(getContext().getString(0x7f0702c8)));
            return;
        }
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = ProfileFacebookConnectRideWidgetView.this;
        super();
    }
}
