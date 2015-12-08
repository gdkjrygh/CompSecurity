// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.settings;

import android.widget.Button;
import me.lyft.android.common.Strings;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.settings:
//            SettingsView

class val.notSignedUrl extends AsyncCall
{

    final SettingsView this$0;
    final String val$notSignedUrl;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        WebBrowser.open(getContext(), val$notSignedUrl);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        android.content.Context context = getContext();
        String s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = val$notSignedUrl;
        }
        WebBrowser.open(context, s1);
    }

    public void onUnsubscribe()
    {
        driverDashboardButton.setEnabled(true);
    }

    ()
    {
        this$0 = final_settingsview;
        val$notSignedUrl = String.this;
        super();
    }
}
