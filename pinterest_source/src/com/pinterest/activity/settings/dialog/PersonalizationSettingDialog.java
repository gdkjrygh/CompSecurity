// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.BaseApi;
import com.pinterest.api.remote.MyUserApi;

public class PersonalizationSettingDialog extends BaseDialog
{

    CheckedTextView _adPartnersCb;
    private View _container;
    CheckedTextView _recentSitesCb;
    private boolean _useAdPartners;
    private boolean _useRecentSites;

    public PersonalizationSettingDialog()
    {
    }

    private void save()
    {
        final User me = MyUser.get();
        if (me == null)
        {
            return;
        }
        RequestParams requestparams;
        final boolean oldPersonalizeFromOffsiteBrowsing;
        final boolean oldAdsCustomizeFromConversion;
        final boolean newPersonalizeFromOffsiteBrowsing;
        boolean flag;
        if (me.getPersonalizeFromOffsiteBrowsing() == Boolean.TRUE)
        {
            oldPersonalizeFromOffsiteBrowsing = true;
        } else
        {
            oldPersonalizeFromOffsiteBrowsing = false;
        }
        if (me.getAdsCustomizeFromConversion() == Boolean.TRUE)
        {
            oldAdsCustomizeFromConversion = true;
        } else
        {
            oldAdsCustomizeFromConversion = false;
        }
        newPersonalizeFromOffsiteBrowsing = _recentSitesCb.isChecked();
        flag = _adPartnersCb.isChecked();
        requestparams = new RequestParams();
        requestparams.a("personalize_from_offsite_browsing", BaseApi.a(newPersonalizeFromOffsiteBrowsing));
        requestparams.a("ads_customize_from_conversion", BaseApi.a(flag));
        me.setPersonalizeFromOffsiteBrowsing(Boolean.valueOf(newPersonalizeFromOffsiteBrowsing));
        me.setAdsCustomizeFromConversion(Boolean.valueOf(flag));
        MyUserApi.a(requestparams, new _cls2(), null);
        dismiss();
    }

    public void init()
    {
        boolean flag1 = true;
        ButterKnife.a(this, _container);
        User user = MyUser.get();
        if (user != null)
        {
            boolean flag;
            if (_recentSitesCb != null)
            {
                CheckedTextView checkedtextview = _recentSitesCb;
                if (user.getPersonalizeFromOffsiteBrowsing() == Boolean.TRUE)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                checkedtextview.setChecked(flag);
            }
            if (_adPartnersCb != null)
            {
                checkedtextview = _adPartnersCb;
                if (user.getAdsCustomizeFromConversion() == Boolean.TRUE)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                checkedtextview.setChecked(flag);
                return;
            }
        }
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f03007d, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(0x7f0703e5);
        setNegativeButton(getString(0x7f0700af), null);
        setPositiveButton(getString(0x7f0704be), new _cls1());
        super.onActivityCreated(bundle);
    }

    void onAdPartnersClick(View view)
    {
        view = _adPartnersCb;
        boolean flag;
        if (!_adPartnersCb.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }

    void onRecentSitesClick(View view)
    {
        view = _recentSitesCb;
        boolean flag;
        if (!_recentSitesCb.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
    }


    private class _cls2 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final PersonalizationSettingDialog this$0;
        final User val$me;
        final boolean val$newPersonalizeFromOffsiteBrowsing;
        final boolean val$oldAdsCustomizeFromConversion;
        final boolean val$oldPersonalizeFromOffsiteBrowsing;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            me.setPersonalizeFromOffsiteBrowsing(Boolean.valueOf(oldPersonalizeFromOffsiteBrowsing));
            me.setAdsCustomizeFromConversion(Boolean.valueOf(oldAdsCustomizeFromConversion));
            Events.post(new DialogEvent(null));
        }

        public void onStart()
        {
            super.onStart();
            Events.post(new DialogEvent(new LoadingDialog()));
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = new HashMap();
            apiresponse.put("label", BaseApi.a(newPersonalizeFromOffsiteBrowsing));
            Pinalytics.a(EventType.USER_PERSONALIZED_RECOMMENDATIONS_CHANGED, null, apiresponse);
            Application.showToastShort(0x7f070217);
            Events.post(new DialogEvent(null));
        }

        _cls2()
        {
            this$0 = PersonalizationSettingDialog.this;
            newPersonalizeFromOffsiteBrowsing = flag;
            me = user;
            oldPersonalizeFromOffsiteBrowsing = flag1;
            oldAdsCustomizeFromConversion = flag2;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PersonalizationSettingDialog this$0;

        public void onClick(View view)
        {
            save();
        }

        _cls1()
        {
            this$0 = PersonalizationSettingDialog.this;
            super();
        }
    }

}
