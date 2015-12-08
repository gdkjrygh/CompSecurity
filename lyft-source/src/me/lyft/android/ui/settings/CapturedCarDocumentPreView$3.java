// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.content.res.Resources;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;

// Referenced classes of package me.lyft.android.ui.settings:
//            CapturedCarDocumentPreView

class val.analytics extends AsyncCall
{

    final CapturedCarDocumentPreView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        val$analytics.trackResponseSuccess();
        appFlow.resetTo(new rationScreen());
        dialogFlow.show(new Toast(getResources().getString(0x7f07029c)));
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    rationScreen()
    {
        this$0 = final_capturedcardocumentpreview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
