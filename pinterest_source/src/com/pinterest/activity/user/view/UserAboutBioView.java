// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.user.dialog.EditUserDialog;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;

public class UserAboutBioView extends LinearLayout
{

    private static final int ABOUT_BOTTOM_PADDING = (int)Resources.dimension(0x7f0a015f);
    private com.pinterest.api.remote.MyUserApi.SettingsApiResponse _aboutUpdateListener;
    private TextView _addTv;
    private String _apiTag;
    private View _btContainer;
    private View _info;
    private User _user;
    private TextView _userBio;
    private TextView _userLocation;
    private android.view.View.OnClickListener onClickListener;

    public UserAboutBioView(Context context)
    {
        this(context, null);
    }

    public UserAboutBioView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onClickListener = new _cls1();
        init();
    }

    public UserAboutBioView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        onClickListener = new _cls1();
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f030206, this);
        _info = findViewById(0x7f0f0183);
        _userBio = (TextView)findViewById(0x7f0f04d1);
        _userLocation = (TextView)findViewById(0x7f0f04d2);
        _btContainer = findViewById(0x7f0f0202);
        _addTv = (TextView)findViewById(0x7f0f04d3);
    }

    private void showEditUserDialog()
    {
        if (_user == null)
        {
            return;
        } else
        {
            EditUserDialog edituserdialog = EditUserDialog.newInstance(_user.getAbout(), _user.getLocation());
            edituserdialog.setOnChangedListener(new _cls2());
            Events.post(new DialogEvent(edituserdialog));
            return;
        }
    }

    public boolean isEmpty()
    {
        return !MyUser.isUserMe(_user) && _info.getVisibility() == 8;
    }

    public void setAboutUpdateListener(com.pinterest.api.remote.MyUserApi.SettingsApiResponse settingsapiresponse)
    {
        _aboutUpdateListener = settingsapiresponse;
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void updateBio(User user)
    {
        _user = user;
        if (_user != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag = ModelHelper.isValid(user.getAbout());
        boolean flag1 = ModelHelper.isValid(user.getLocation());
        if (flag)
        {
            _userBio.setText(user.getAbout());
            _userBio.setVisibility(0);
        } else
        {
            _userBio.setVisibility(8);
        }
        if (flag1)
        {
            _userLocation.setText(user.getLocation());
            _userLocation.setVisibility(0);
            _userBio.setPadding(0, 0, 0, ABOUT_BOTTOM_PADDING);
        } else
        {
            _userBio.setPadding(0, 0, 0, 0);
            _userLocation.setVisibility(8);
        }
        if (!flag && !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        _info.setVisibility(0);
        _addTv.setVisibility(8);
        if (MyUser.isUserMe(user.getUid()))
        {
            ViewHelper.showIconForLongText((TextView)findViewById(0x7f0f0203), 0x7f020186);
            _btContainer.setVisibility(0);
            _btContainer.setOnClickListener(onClickListener);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        _info.setVisibility(8);
        _btContainer.setVisibility(8);
        if (MyUser.isUserMe(user.getUid()))
        {
            _addTv.setText(Constants.appendEllipsis(0x7f07060d));
            _addTv.setVisibility(0);
            _addTv.setOnClickListener(onClickListener);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }





    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserAboutBioView this$0;

        public void onClick(View view)
        {
            showEditUserDialog();
        }

        _cls1()
        {
            this$0 = UserAboutBioView.this;
            super();
        }
    }


    private class _cls2
        implements com.pinterest.activity.user.dialog.EditUserDialog.OnChangedListener
    {

        final UserAboutBioView this$0;

        public void onChanged(String s, String s1)
        {
            RequestParams requestparams = new RequestParams();
            requestparams.a("about", s);
            requestparams.a("location", s1);
            MyUserApi.a(requestparams, _aboutUpdateListener, _apiTag);
        }

        _cls2()
        {
            this$0 = UserAboutBioView.this;
            super();
        }
    }

}
