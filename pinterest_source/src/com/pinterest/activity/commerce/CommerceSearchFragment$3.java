// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.activity.commerce.view.PricePickerIcon;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSearchFragment

class this._cls0
    implements com.pinterest.base.chFragment._cls3
{

    final CommerceSearchFragment this$0;

    public void onEventMainThread(UpdatedEvent updatedevent)
    {
        updatedevent = updatedevent.getPrice();
        if (updatedevent == null || !updatedevent.equals(_pricePicker.getPrice()))
        {
            _pricePicker.setPrice(updatedevent);
            refresh();
        }
    }

    UpdatedEvent()
    {
        this$0 = CommerceSearchFragment.this;
        super();
    }
}
