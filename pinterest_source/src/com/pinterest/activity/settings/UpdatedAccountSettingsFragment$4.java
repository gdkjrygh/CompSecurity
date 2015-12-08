// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0 extends ApiResponseHandler
{

    final UpdatedAccountSettingsFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        DiskCache.setJsonObject("COUNTRIES", (PinterestJsonObject)apiresponse.getData());
        if (isActive())
        {
            UpdatedAccountSettingsFragment.access$900(UpdatedAccountSettingsFragment.this);
        }
    }

    ()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
