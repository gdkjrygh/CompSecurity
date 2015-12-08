// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings;

import com.pinterest.activity.settings.model.AccountSettings;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.settings:
//            UpdatedAccountSettingsFragment, AccountSettingsAdapter

class this._cls0 extends ApiResponseHandler
{

    final UpdatedAccountSettingsFragment this$0;

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        Object obj = apiresponse.a("country", "");
        String s = LocaleUtils.getCountryFromCode(((String) (obj)));
        PLog.info("Country code: %s| name: %s", new Object[] {
            obj, s
        });
        if (UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).get(Integer.valueOf(0x7f070190)) != null)
        {
            ((AccountSettings)UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).get(Integer.valueOf(0x7f070190))).setValue(s);
            ((AccountSettingsAdapter)UpdatedAccountSettingsFragment.access$1600(UpdatedAccountSettingsFragment.this)).notifyDataSetChanged();
        }
        obj = MyUser.get();
        if (obj == null)
        {
            return;
        }
        if (UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).get(Integer.valueOf(0x7f07053c)) != null)
        {
            AccountSettings accountsettings = (AccountSettings)UpdatedAccountSettingsFragment.access$1500(UpdatedAccountSettingsFragment.this).get(Integer.valueOf(0x7f07053c));
            String s1 = apiresponse.a("custom_gender", "");
            String s2 = ((User) (obj)).getGender();
            if (StringUtils.isNotEmpty(s1) && s2.equals("unspecified"))
            {
                accountsettings.setValue(s1);
                ((User) (obj)).setCustomGender(s1);
                ((AccountSettingsAdapter)UpdatedAccountSettingsFragment.access$1700(UpdatedAccountSettingsFragment.this)).notifyDataSetChanged();
            }
        }
        ((User) (obj)).setPersonalizeFromOffsiteBrowsing(apiresponse.a("personalize_from_offsite_browsing"));
        ((User) (obj)).setAdsCustomizeFromConversion(apiresponse.a("ads_customize_from_conversion"));
        ((User) (obj)).setExcludeFromSearch(apiresponse.a("exclude_from_search"));
        ((User) (obj)).setHideFromNews(apiresponse.a("hide_from_news"));
        LocaleUtils.saveLocale(LocaleUtils.getLang(), s);
        MyUser.saveUserSettingsMe(apiresponse);
    }

    ()
    {
        this$0 = UpdatedAccountSettingsFragment.this;
        super();
    }
}
