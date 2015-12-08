// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinActivityFragment

class this._cls1 extends BaseApiResponseHandler
{

    final is._cls0 this$1;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        PinActivityFragment.access$000(_fld0, pinterestjsonobject);
        PinActivityFragment.access$302(_fld0, false);
    }

    A()
    {
        this$1 = this._cls1.this;
        super();
    }
}
