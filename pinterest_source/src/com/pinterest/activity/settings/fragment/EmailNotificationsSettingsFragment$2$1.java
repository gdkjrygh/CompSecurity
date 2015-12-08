// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.view.View;
import android.widget.CheckedTextView;
import com.pinterest.api.remote.SettingsApi;
import java.util.Hashtable;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            EmailNotificationsSettingsFragment

class this._cls1
    implements android.view.cationsSettingsFragment._cls2._cls1
{

    final smiss this$1;

    public void onClick(View view)
    {
        view = ctv;
        class _cls1 extends ApiResponseHandler
        {

            final EmailNotificationsSettingsFragment._cls2._cls1 this$2;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                super.onFailure(throwable, apiresponse);
                ctv.setChecked(originalSetting);
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                super.onSuccess(apiresponse);
                try
                {
                    apiresponse = MyUser.getJsonUserSettings();
                    apiresponse.b((String)EmailNotificationsSettingsFragment.access$200().get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()));
                    MyUser.saveUserSettingsMe(apiresponse);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (ApiResponse apiresponse)
                {
                    return;
                }
            }

            _cls1(boolean flag)
            {
                this$2 = EmailNotificationsSettingsFragment._cls2._cls1.this;
                super(flag);
            }
        }

        boolean flag;
        if (!ctv.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        EmailNotificationsSettingsFragment.access$100(_fld0);
        SettingsApi.e((String)EmailNotificationsSettingsFragment.access$200().get(Integer.valueOf(ctv.getId())), String.valueOf(ctv.isChecked()), new _cls1(false), tApiTag());
        smiss();
    }

    _cls1()
    {
        this$1 = this._cls1.this;
        super();
    }
}
