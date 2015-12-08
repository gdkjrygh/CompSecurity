// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            FastRepinFragment

class this._cls0 extends com.pinterest.api.remote.e
{

    final FastRepinFragment this$0;

    public void onSuccess(Pin pin)
    {
        super.onSuccess(pin);
        setPin(pin);
        if (isAdded())
        {
            FastRepinFragment.access$300(FastRepinFragment.this, pin.isDuplicated());
        }
    }

    ()
    {
        this$0 = FastRepinFragment.this;
        super();
    }
}
