// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0 extends com.pinterest.api.remote.ent._cls13
{

    final UpdatedAccountSettingsFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.ure(throwable, apiresponse);
        UpdatedAccountSettingsFragment.access$1200(UpdatedAccountSettingsFragment.this);
    }

    public void onSuccess(User user)
    {
        super.ess(user);
        UpdatedAccountSettingsFragment.access$1200(UpdatedAccountSettingsFragment.this);
        UpdatedAccountSettingsFragment.access$1300(UpdatedAccountSettingsFragment.this);
        UpdatedAccountSettingsFragment.access$1400(UpdatedAccountSettingsFragment.this);
    }

    (boolean flag)
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super(flag);
    }
}
