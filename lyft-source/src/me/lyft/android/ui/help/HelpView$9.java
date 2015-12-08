// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpView

class  extends AsyncCall
{

    final HelpView this$0;
    final String val$helpUrl;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        WebBrowser.open(getContext(), val$helpUrl);
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
        progressController.hideProgress();
    }

    ler()
    {
        this$0 = final_helpview;
        val$helpUrl = String.this;
        super();
    }
}
