// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.pin.adapter:
//            PinActivityAdapter

class _pin
    implements android.view.r.PinActivityListener
{

    private Pin _pin;
    final PinActivityAdapter this$0;

    public void onClick(View view)
    {
        Object obj = null;
        view.getId();
        JVM INSTR lookupswitch 9: default 88
    //                   2131690431: 159
    //                   2131690432: 159
    //                   2131690433: 159
    //                   2131690436: 109
    //                   2131690437: 109
    //                   2131690683: 184
    //                   2131690684: 184
    //                   2131690685: 134
    //                   2131690686: 134;
           goto _L1 _L2 _L2 _L2 _L3 _L3 _L4 _L4 _L5 _L5
_L1:
        Navigation navigation;
        navigation = null;
        view = obj;
_L7:
        if (view != null)
        {
            Pinalytics.a(view);
        }
        if (navigation != null)
        {
            Events.post(navigation);
        }
        return;
_L3:
        navigation = new Navigation(Location.USER, _pin.getUser());
        view = ElementType.PIN_USER;
        continue; /* Loop/switch isn't completed */
_L5:
        navigation = new Navigation(Location.USER, _pin.getUser());
        view = ElementType.PIN_DESCRIPTION;
        continue; /* Loop/switch isn't completed */
_L2:
        navigation = new Navigation(Location.BOARD, _pin.getBoard());
        view = ElementType.PIN_BOARD;
        continue; /* Loop/switch isn't completed */
_L4:
        navigation = new Navigation(Location.PIN_COMMENTS, _pin);
        view = ElementType.PIN_COMMENT_BUTTON;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public (Pin pin)
    {
        this$0 = PinActivityAdapter.this;
        super();
        _pin = pin;
    }
}
