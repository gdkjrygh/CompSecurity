// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.os.Bundle;
import android.widget.EditText;
import com.pinterest.activity.task.dialog.OneFieldBaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.schemas.event.ElementType;

public class UserEditImpressumDialog extends OneFieldBaseDialog
{

    private com.pinterest.api.remote.MyUserApi.SettingsApiResponse _responseHandler;
    protected User _user;
    protected String _userUid;

    public UserEditImpressumDialog()
    {
    }

    public void addUserUidToArguments(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.pinterest.EXTRA_USER_ID", s);
        setArguments(bundle);
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070224);
    }

    protected String getHint()
    {
        return Resources.string(0x7f070042);
    }

    protected String getInitialValue()
    {
        return _user.getImpressumUrl();
    }

    protected void logSubmitAction()
    {
        Pinalytics.a(ElementType.USER_URL_EDIT_BUTTON);
    }

    public void onActivityCreated(Bundle bundle)
    {
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            _userUid = bundle1.getString("com.pinterest.EXTRA_USER_ID");
            _user = ModelHelper.getUser(_userUid);
        }
        super.onActivityCreated(bundle);
        _et.setInputType(16);
    }

    public void setResponseHandler(com.pinterest.api.remote.MyUserApi.SettingsApiResponse settingsapiresponse)
    {
        _responseHandler = settingsapiresponse;
    }

    protected void submit(String s, String s1)
    {
        s = new RequestParams();
        s.a("impressum_url", s1);
        MyUserApi.a(s, _responseHandler, null);
    }
}
