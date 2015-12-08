// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.ui.notify.DialogCheckedTextViewAdapter;
import java.util.HashMap;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment

class this._cls0 extends ApiResponseHandler
{

    final UpdatedAccountSettingsFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (UpdatedAccountSettingsFragment.access$1900(UpdatedAccountSettingsFragment.this) != null)
        {
            throwable = (DialogCheckedTextViewAdapter)UpdatedAccountSettingsFragment.access$1900(UpdatedAccountSettingsFragment.this).getAdapter();
            if (throwable != null)
            {
                throwable.notifyDataSetChanged();
            }
        }
    }

    public void onSuccess(ApiResponse apiresponse)
    {
label0:
        {
label1:
            {
                super.onSuccess(apiresponse);
                apiresponse = ((ApiResponse) (apiresponse.getData()));
                if (apiresponse instanceof PinterestJsonArray)
                {
                    UpdatedAccountSettingsFragment.access$1802(UpdatedAccountSettingsFragment.this, (PinterestJsonArray)apiresponse);
                    if (UpdatedAccountSettingsFragment.access$1900(UpdatedAccountSettingsFragment.this) != null)
                    {
                        apiresponse = (DialogCheckedTextViewAdapter)UpdatedAccountSettingsFragment.access$1900(UpdatedAccountSettingsFragment.this).getAdapter();
                        if (apiresponse != null)
                        {
                            apiresponse.updateNotifs(UpdatedAccountSettingsFragment.access$1800(UpdatedAccountSettingsFragment.this));
                        }
                    }
                    if (UpdatedAccountSettingsFragment.access$1800(UpdatedAccountSettingsFragment.this).a() != 0)
                    {
                        break label0;
                    }
                    if (UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).get(Integer.valueOf(0x7f07036c)) == null)
                    {
                        break label1;
                    }
                    UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).remove(Integer.valueOf(0x7f07036c));
                    if (_settingsFeed != null)
                    {
                        UpdatedAccountSettingsFragment.access$2000(UpdatedAccountSettingsFragment.this);
                    }
                }
                return;
            }
            UpdatedAccountSettingsFragment.access$2102(UpdatedAccountSettingsFragment.this, false);
            return;
        }
        UpdatedAccountSettingsFragment.access$2200(UpdatedAccountSettingsFragment.this);
    }

    ()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
