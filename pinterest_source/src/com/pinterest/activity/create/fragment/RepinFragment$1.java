// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            RepinFragment

class this._cls0 extends ApiResponseHandler
{

    final RepinFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        try
        {
            Pin.make((PinterestJsonObject)apiresponse.getData(), false).getPin();
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse) { }
        Application.showToast(0x7f0701ad, DrawableUtils.tintIcon(0x7f0201d3, 0x106000b));
        Events.postSticky(new com.pinterest.events.rdsInvalidated());
    }

    ()
    {
        this$0 = RepinFragment.this;
        super();
    }
}
