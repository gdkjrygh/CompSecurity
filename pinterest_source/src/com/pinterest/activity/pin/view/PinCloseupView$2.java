// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.api.model.Comment;
import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupView

class this._cls0
    implements com.pinterest.base.criber
{

    final PinCloseupView this$0;

    public void onEventMainThread(com.pinterest.api.model.nt nt)
    {
        if (!nt.getComment().getPinUid().equals(PinCloseupView.access$300(PinCloseupView.this)))
        {
            return;
        } else
        {
            PinCloseupView.access$100(PinCloseupView.this).setCommentCount(Integer.valueOf(PinCloseupView.access$100(PinCloseupView.this).getCommentCountDisplay() + 1));
            PinCloseupView.access$400(PinCloseupView.this);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.api.model.nt nt)
    {
        if (!nt.getComment().getPinUid().equals(PinCloseupView.access$300(PinCloseupView.this)) || !nt.wasDeleted())
        {
            return;
        } else
        {
            PinCloseupView.access$100(PinCloseupView.this).setCommentCount(Integer.valueOf(PinCloseupView.access$100(PinCloseupView.this).getCommentCountDisplay() - 1));
            PinCloseupView.access$400(PinCloseupView.this);
            return;
        }
    }

    public void onEventMainThread(com.pinterest.api.model.pView._cls2 _pcls2)
    {
        if (!_pcls2.etPin().getUid().equals(PinCloseupView.access$300(PinCloseupView.this)))
        {
            return;
        } else
        {
            setPin(_pcls2.etPin());
            return;
        }
    }

    ()
    {
        this$0 = PinCloseupView.this;
        super();
    }
}
