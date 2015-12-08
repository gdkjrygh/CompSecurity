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
import com.pinterest.base.Constants;

public class SearchPrivacyDialog extends BaseDialog
{

    private View _container;
    private boolean _isChecked;
    CheckedTextView _searchPrivacyCb;
    private android.view.View.OnClickListener onSearchPrivacyClick;

    public SearchPrivacyDialog()
    {
        onSearchPrivacyClick = new _cls2();
    }

    private void onSaveSearchPrivacyClicked(final boolean checked)
    {
        final User me = MyUser.get();
        if (me == null || checked == _isChecked)
        {
            dismiss();
            return;
        } else
        {
            RequestParams requestparams = new RequestParams();
            requestparams.a("exclude_from_search", BaseApi.a(checked));
            final boolean oldCheck = _isChecked;
            _isChecked = checked;
            me.setExcludeFromSearch(Boolean.valueOf(checked));
            MyUserApi.a(requestparams, new _cls3(), null);
            dismiss();
            return;
        }
    }

    public void init()
    {
        ButterKnife.a(this, _container);
        User user = MyUser.get();
        if (user != null)
        {
            _isChecked = Constants.isTrue(user.getExcludeFromSearch());
            _searchPrivacyCb.setChecked(_isChecked);
            _searchPrivacyCb.setOnClickListener(onSearchPrivacyClick);
        }
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030081, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        setTitle(0x7f0704e1);
        setNegativeButton(getString(0x7f0700af), null);
        setPositiveButton(getString(0x7f0704be), new _cls1());
        super.onActivityCreated(bundle);
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SearchPrivacyDialog this$0;

        public void onClick(View view)
        {
            ((CheckedTextView)view).toggle();
        }

        _cls2()
        {
            this$0 = SearchPrivacyDialog.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final SearchPrivacyDialog this$0;
        final boolean val$checked;
        final User val$me;
        final boolean val$oldCheck;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            Events.post(new DialogEvent(null));
            me.setExcludeFromSearch(Boolean.valueOf(oldCheck));
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
            apiresponse.put("label", BaseApi.a(checked));
            Pinalytics.a(EventType.USER_SEARCH_PRIVACY_CHANGED, null, apiresponse);
            me.setExcludeFromSearch(Boolean.valueOf(checked));
            Application.showToastShort(0x7f07021c);
            Events.post(new DialogEvent(null));
        }

        _cls3()
        {
            this$0 = SearchPrivacyDialog.this;
            checked = flag;
            me = user;
            oldCheck = flag1;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SearchPrivacyDialog this$0;

        public void onClick(View view)
        {
            onSaveSearchPrivacyClicked(_searchPrivacyCb.isChecked());
        }

        _cls1()
        {
            this$0 = SearchPrivacyDialog.this;
            super();
        }
    }

}
