// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
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
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.addFlags(0x10000000);
        getContext().startActivity(s);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = WebApplicationStatusView.this;
        super();
    }
}
