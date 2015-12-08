// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.pin.view.modules.util.VerifiedDomainUtil;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.toast.PinnedToast;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            FastRepinFragment

class this._cls0 extends ApiResponseHandler
{

    final FastRepinFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        apiresponse = ((PinterestJsonObject)apiresponse.getData()).c(String.format("POST:/v3/pins/%s/repin/", new Object[] {
            _pin.getUid()
        }));
        if ((new ApiResponse(apiresponse)).getCode() != 0)
        {
            onFailure(null, apiresponse);
            StopWatch.get().invalidate("repin_submit");
            return;
        }
        apiresponse = FastRepinFragment.access$100(FastRepinFragment.this, apiresponse);
        if (apiresponse == null)
        {
            StopWatch.get().invalidate("repin_submit");
            return;
        } else
        {
            StopWatch.get().complete("repin_submit");
            Events.post(new ToastEvent(new PinnedToast(apiresponse)));
            VerifiedDomainUtil.showToastIfNecessary(_pin);
            return;
        }
    }

    Util()
    {
        this$0 = FastRepinFragment.this;
        super();
    }
}
