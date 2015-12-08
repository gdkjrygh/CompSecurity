// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayDialogView

class val.targetUrl extends AsyncCall
{

    final ExpressPayDialogView this$0;
    final String val$targetUrl;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        WebBrowser.open(getContext(), val$targetUrl);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        WebBrowser.open(getContext(), s);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        dialogFlow.dismiss();
    }

    A()
    {
        this$0 = final_expresspaydialogview;
        val$targetUrl = String.this;
        super();
    }
}
