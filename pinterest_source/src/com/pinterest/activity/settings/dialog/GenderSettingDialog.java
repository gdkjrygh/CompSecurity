// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.api.RequestParams;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.MyUserApi;

// Referenced classes of package com.pinterest.activity.settings.dialog:
//            CustomGenderSettingDialog

public class GenderSettingDialog extends BaseDialog
    implements CustomGenderSettingDialog.CustomGenderListener
{

    private static final String CUSTOM_GENDER_PARAM = "custom_gender";
    private View _container;
    TextView _customBt;
    CustomGenderSettingDialog _dialog;
    TextView _femaleBt;
    TextView _maleBt;
    private String _oldGender;
    private android.view.View.OnClickListener onGenderClick;

    public GenderSettingDialog()
    {
        onGenderClick = new _cls2();
    }

    private void onSaveGenderClicked(final String genderType, String s)
    {
        RequestParams requestparams = new RequestParams();
        requestparams.a("gender", genderType);
        final User me = MyUser.get();
        if (me != null)
        {
            if (s != null)
            {
                requestparams.a("custom_gender", s);
                me.setCustomGender(s);
            }
            me.setGender(genderType);
        }
        MyUserApi.a(requestparams, new _cls1(), null);
        dismiss();
    }

    public void init()
    {
        ButterKnife.a(this, _container);
    }

    public void make(LayoutInflater layoutinflater)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            _container = LayoutInflater.from(getActivity()).inflate(0x7f030071, null);
            setContent(_container, 0);
            super.make(layoutinflater);
            init();
            _dialog = new CustomGenderSettingDialog();
            _dialog.setListener(this);
            return;
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        User user = MyUser.get();
        if (user == null)
        {
            return;
        } else
        {
            _oldGender = user.getGender();
            _femaleBt.setOnClickListener(onGenderClick);
            _maleBt.setOnClickListener(onGenderClick);
            _customBt.setOnClickListener(onGenderClick);
            setTitle(0x7f07053c);
            super.onActivityCreated(bundle);
            return;
        }
    }

    public void setCustomGender(String s)
    {
        onSaveGenderClicked("unspecified", s);
    }



    private class _cls2
        implements android.view.View.OnClickListener
    {

        final GenderSettingDialog this$0;

        public void onClick(View view)
        {
            if (view != _femaleBt) goto _L2; else goto _L1
_L1:
            if (!_oldGender.equals("female"))
            {
                onSaveGenderClicked("female", null);
            }
_L4:
            return;
_L2:
            if (view != _maleBt)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (_oldGender.equals("male")) goto _L4; else goto _L3
_L3:
            onSaveGenderClicked("male", null);
            return;
            if (view != _customBt) goto _L4; else goto _L5
_L5:
            Events.post(new DialogEvent(_dialog));
            return;
        }

        _cls2()
        {
            this$0 = GenderSettingDialog.this;
            super();
        }
    }


    private class _cls1 extends com.pinterest.api.remote.MyUserApi.SettingsApiResponse
    {

        final GenderSettingDialog this$0;
        final String val$genderType;
        final User val$me;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if (me != null)
            {
                me.setGender(genderType);
            }
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
            apiresponse.put("label", genderType);
            Pinalytics.a(EventType.USER_GENDER_CHANGED, null, apiresponse);
            Application.showToastShort(0x7f070223);
            Events.post(new DialogEvent(null));
        }

        _cls1()
        {
            this$0 = GenderSettingDialog.this;
            genderType = s;
            me = user;
            super();
        }
    }

}
