// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            UpdatedDeactivateAccountSettingsFragment

class this._cls0 extends ApiResponseHandler
{

    final UpdatedDeactivateAccountSettingsFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        ActivityHelper.doLogout(getActivity(), false);
        UpdatedDeactivateAccountSettingsFragment.access$1300(UpdatedDeactivateAccountSettingsFragment.this);
        class _cls1
            implements Runnable
        {

            final UpdatedDeactivateAccountSettingsFragment._cls7 this$1;

            public void run()
            {
                BaseDialog basedialog = new BaseDialog();
                basedialog.setTitle(Resources.string(0x7f0700ed));
                basedialog.setMessage(Resources.string(0x7f0700ec));
                basedialog.setPositiveButton(Resources.string(0x7f0703d3), null);
                Events.postSticky(new DialogEvent(basedialog));
            }

            _cls1()
            {
                this$1 = UpdatedDeactivateAccountSettingsFragment._cls7.this;
                super();
            }
        }

        if (getView() != null)
        {
            getView().postDelayed(new _cls1(), 100L);
        }
    }

    _cls1()
    {
        this$0 = UpdatedDeactivateAccountSettingsFragment.this;
        super();
    }
}
