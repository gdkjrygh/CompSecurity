// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.CSRApi;
import com.pinterest.api.remote.PinApi;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class this._cls0
    implements Runnable
{

    final PinFragment this$0;

    public void run()
    {
        if (_pin.isCSR())
        {
            CSRApi.a(PinFragment.access$2100(PinFragment.this).getId(), onRelatedPinsLoaded, getApiTag());
        } else
        {
            PinApi.a(PinFragment.access$2200(PinFragment.this).getId(), onRelatedPinsLoaded, getApiTag());
        }
        PinFragment.access$2302(PinFragment.this, false);
    }

    ()
    {
        this$0 = PinFragment.this;
        super();
    }
}
