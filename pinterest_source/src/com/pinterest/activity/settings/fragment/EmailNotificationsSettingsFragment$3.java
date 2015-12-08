// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import android.widget.CheckedTextView;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.Hashtable;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            EmailNotificationsSettingsFragment

class val.originalSetting extends ApiResponseHandler
{

    final EmailNotificationsSettingsFragment this$0;
    final CheckedTextView val$ctv;
    final boolean val$originalSetting;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        val$ctv.setChecked(val$originalSetting);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        try
        {
            apiresponse = MyUser.getJsonUserSettings();
            apiresponse.b((String)EmailNotificationsSettingsFragment.access$200().get(Integer.valueOf(val$ctv.getId())), String.valueOf(val$ctv.isChecked()));
            MyUser.saveUserSettingsMe(apiresponse);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ApiResponse apiresponse)
        {
            return;
        }
    }

    (boolean flag1)
    {
        this$0 = final_emailnotificationssettingsfragment;
        val$ctv = CheckedTextView.this;
        val$originalSetting = flag1;
        super(final_flag);
    }
}
