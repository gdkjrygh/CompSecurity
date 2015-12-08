// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import android.widget.TextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.payment:
//            BaseCreditCardView

class this._cls0
    implements Action1
{

    final BaseCreditCardView this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        selectedLabelTxt.setText(s);
    }

    ()
    {
        this$0 = BaseCreditCardView.this;
        super();
    }
}
