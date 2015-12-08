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

class this._cls2 extends ApiResponseHandler
{

    final ctv this$2;

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

    (boolean flag)
    {
        this$2 = this._cls2.this;
        super(flag);
    }
}
