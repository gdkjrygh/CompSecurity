// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendshare;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;

// Referenced classes of package com.pinterest.activity.sendshare:
//            SendShareFragment

class this._cls0 extends ApiResponseHandler
{

    final SendShareFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (_contactsContainer == null || _emptyStateContainer == null)
        {
            return;
        }
        if (SendShareFragment.access$000(SendShareFragment.this))
        {
            SendShareFragment.access$100(SendShareFragment.this, new PinterestJsonArray());
            return;
        } else
        {
            SendShareFragment.access$200(SendShareFragment.this);
            return;
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        if (_contactsContainer == null || _emptyStateContainer == null)
        {
            return;
        }
        apiresponse = (PinterestJsonArray)apiresponse.getData();
        if (apiresponse.a() > 0 || SendShareFragment.access$000(SendShareFragment.this))
        {
            SendShareFragment.access$100(SendShareFragment.this, apiresponse);
            return;
        } else
        {
            onFailure(null, null);
            return;
        }
    }

    ()
    {
        this$0 = SendShareFragment.this;
        super();
    }
}
