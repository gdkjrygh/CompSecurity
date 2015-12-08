// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.common.Strings;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PromoBannerView

class this._cls0
    implements Action1
{

    final PromoBannerView this$0;

    public void call(Boolean boolean1)
    {
        String s = (String)PromoBannerView.access$300(PromoBannerView.this).get();
        String s1 = (String)PromoBannerView.access$200(PromoBannerView.this).get();
        setClickable(boolean1.booleanValue());
        if (Strings.isNullOrEmpty(s) && !Strings.isNullOrEmpty(s1))
        {
            bannerTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, getResources().getDrawable(0x7f020198), null);
            return;
        } else
        {
            bannerTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            return;
        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = PromoBannerView.this;
        super();
    }
}
