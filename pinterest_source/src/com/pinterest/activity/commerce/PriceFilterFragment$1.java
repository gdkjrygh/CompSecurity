// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.ViewTreeObserver;
import com.pinterest.activity.commerce.view.PriceSliderView;

// Referenced classes of package com.pinterest.activity.commerce:
//            PriceFilterFragment

class this._cls0
    implements android.view.balLayoutListener
{

    final PriceFilterFragment this$0;

    public void onGlobalLayout()
    {
        PriceFilterFragment.access$000(PriceFilterFragment.this);
        _draggerVw.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    ()
    {
        this$0 = PriceFilterFragment.this;
        super();
    }
}
