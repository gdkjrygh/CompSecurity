// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.text.Html;
import android.widget.TextView;
import java.text.MessageFormat;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0 extends AsyncCall
{

    final DriverRideAcceptView this$0;

    public void onFail(Throwable throwable)
    {
        etaTextView.setVisibility(8);
    }

    public void onSuccess(Long long1)
    {
        long1 = Html.fromHtml(MessageFormat.format(getResources().getString(0x7f070147), new Object[] {
            long1
        }));
        etaTextView.setVisibility(0);
        etaTextView.setText(long1);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Long)obj);
    }

    ()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
