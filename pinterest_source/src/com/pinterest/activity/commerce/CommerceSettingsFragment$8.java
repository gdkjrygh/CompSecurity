// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.model.api.ApiResponse;
import java.util.List;
import retrofit.client.Response;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

class ttingsApiCallback extends ttingsApiCallback
{

    final CommerceSettingsFragment this$0;

    public void success(ApiResponse apiresponse, Response response)
    {
        CommerceSettingsFragment.access$300(CommerceSettingsFragment.this).appendItem((List)apiresponse.getData());
        response = CommerceSettingsFragment.this;
        boolean flag;
        if (!((List)apiresponse.getData()).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CommerceSettingsFragment.access$400(response, apiresponse, flag);
    }

    public volatile void success(Object obj, Response response)
    {
        success((ApiResponse)obj, response);
    }

    apter()
    {
        this$0 = CommerceSettingsFragment.this;
        super(CommerceSettingsFragment.this, null);
    }
}
