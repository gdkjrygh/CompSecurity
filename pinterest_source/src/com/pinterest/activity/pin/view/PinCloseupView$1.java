// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.ExperiencesApi;
import com.pinterest.schemas.experiences.Placement;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PinCloseupView

class nit> extends com.pinterest.api.remote.onse
{

    final PinCloseupView this$0;

    public void onSuccess(Pin pin)
    {
        PinCloseupView.access$002(PinCloseupView.this, true);
        setPin(pin);
        HashMap hashmap = new HashMap();
        hashmap.put("pin_id", pin.getUid());
        class _cls1 extends com.pinterest.api.remote.ExperiencesApi.ExperienceResponseHandler
        {

            final PinCloseupView._cls1 this$1;

            public void onSuccess()
            {
                Events.post(new com.pinterest.activity.pin.fragment.PinSwipeFragment.PinSwipeProfXEvent(PinCloseupView.access$100(this$0)));
            }

            _cls1()
            {
                this$1 = PinCloseupView._cls1.this;
                super();
            }
        }

        ExperiencesApi.a(String.valueOf(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER.getValue()), hashmap, new _cls1(), PinCloseupView.access$200(PinCloseupView.this));
    }

    _cls1()
    {
        this$0 = PinCloseupView.this;
        super();
    }
}
