// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            PinFeed, Pin

class this._cls0
    implements com.pinterest.base.ntsSubscriber
{

    final PinFeed this$0;

    public void onEventMainThread(Event event)
    {
        Pin pin;
        pin = event.getPin();
        break MISSING_BLOCK_LABEL_5;
        if (pin != null && _items != null && _items.size() > 0)
        {
            int i = _ids.indexOf(pin.getUid());
            if (i >= 0 && i < _items.size())
            {
                boolean flag = false;
                if (event.wasDeleted() || _onlyLikedByMe && pin.getLiked() != Boolean.TRUE)
                {
                    _ids.remove(i);
                    _items.remove(i);
                    flag = true;
                } else
                {
                    _items.set(i, pin);
                }
                if (_dataListener != null)
                {
                    _dataListener.onChange(i, flag);
                    return;
                }
            }
        }
        return;
    }

    Event()
    {
        this$0 = PinFeed.this;
        super();
    }
}
