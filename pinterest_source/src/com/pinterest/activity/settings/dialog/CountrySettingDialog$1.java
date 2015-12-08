// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.settings.Country;
import com.pinterest.adapter.CountryListAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.SettingsApi;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            CountrySettingDialog

class this._cls0
    implements android.widget.Listener
{

    final CountrySettingDialog this$0;

    public void onItemClick(final AdapterView country, View view, int i, long l)
    {
        Pinalytics.a(ElementType.COUNTRY_BUTTON, ComponentType.MODAL_DIALOG);
        country = CountrySettingDialog.access$000(CountrySettingDialog.this).getItem(i);
        class _cls1 extends ApiResponseHandler
        {

            final CountrySettingDialog._cls1 this$1;
            final Country val$country;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                super.onFailure(throwable, apiresponse);
                Events.post(new DialogEvent(null));
            }

            public void onStart()
            {
                super.onStart();
                Events.post(new DialogEvent(new LoadingDialog()));
            }

            public void onSuccess(ApiResponse apiresponse)
            {
                Application.showToastShort(String.format(Resources.string(0x7f07038c), new Object[] {
                    country.name
                }));
                super.onSuccess(apiresponse);
                Events.post(new DialogEvent(null));
                Events.post(new com.pinterest.activity.settings.UpdatedAccountSettingsFragment.AccountSettingsEvent());
            }

            _cls1()
            {
                this$1 = CountrySettingDialog._cls1.this;
                country = country1;
                super();
            }
        }

        SettingsApi.e("country", ((Country) (country)).code, new _cls1(), null);
        LocaleUtils.saveLocale(LocaleUtils.getLang(), ((Country) (country)).name);
        CountrySettingDialog.access$100(CountrySettingDialog.this).dismiss();
    }

    _cls1()
    {
        this$0 = CountrySettingDialog.this;
        super();
    }
}
