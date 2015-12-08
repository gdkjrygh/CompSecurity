// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinActivityFragment

class this._cls0 extends BaseApiResponseHandler
{

    final PinActivityFragment this$0;

    public void onSuccess(PinterestJsonObject pinterestjsonobject)
    {
        super.onSuccess(pinterestjsonobject);
        PinActivityFragment.access$000(PinActivityFragment.this, pinterestjsonobject);
    }

    ()
    {
        this$0 = PinActivityFragment.this;
        super();
    }
}
