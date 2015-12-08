// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.text.Html;
import android.widget.TextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

class this._cls0
    implements Action1
{

    final PromoBannerView this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        bannerTextView.setText(Html.fromHtml(s));
    }

    ()
    {
        this$0 = PromoBannerView.this;
        super();
    }
}
