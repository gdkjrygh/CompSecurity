// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupView

class esponseHandler extends com.pinterest.api.remote.rienceResponseHandler
{

    final is._cls0 this$1;

    public void onSuccess()
    {
        Events.post(new com.pinterest.activity.pin.fragment.nSwipeProfXEvent(PinCloseupView.access$100(_fld0)));
    }

    t.PinSwipeProfXEvent()
    {
        this$1 = this._cls1.this;
        super();
    }
}
