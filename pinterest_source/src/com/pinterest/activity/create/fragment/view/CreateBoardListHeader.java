// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Device;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.notify.DialogTitleView;

public class CreateBoardListHeader extends RelativeLayout
{

    private CheckBox _facebookCb;
    android.view.View.OnClickListener _facebookClicked;
    private View _shim;
    private DialogTitleView _titleCell;

    public CreateBoardListHeader(Context context)
    {
        this(context, null);
    }

    public CreateBoardListHeader(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _facebookClicked = new _cls1();
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f03014e, this);
        _titleCell = (DialogTitleView)findViewById(0x7f0f034f);
        _titleCell.titleTv.setText(0x7f0701b1);
        _titleCell.setHeight((int)getResources().getDimension(0x7f0a0009));
        _titleCell.titleDivider.setVisibility(8);
        _titleCell.setVisibility(0);
        _facebookCb = (CheckBox)findViewById(0x7f0f0350);
        if (MyUser.isConnectedToFacebook())
        {
            _facebookCb.setOnClickListener(_facebookClicked);
            _facebookCb.setChecked(MyUser.isConnectedToFacebookSt());
        } else
        {
            ViewHelper.setVisibility(_facebookCb, false);
        }
        _shim = findViewById(0x7f0f034e);
        updateShimHeight();
        invalidate();
        requestLayout();
    }

    private void updateShimHeight()
    {
        if (_shim != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, (int)(Device.getScreenHeight() * 0.5F));
            _shim.setLayoutParams(layoutparams);
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        updateShimHeight();
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CreateBoardListHeader this$0;

        public void onClick(View view)
        {
            MyUser.setFacebookSt(_facebookCb.isChecked());
            if (_facebookCb.isChecked())
            {
                Events.post(new com.pinterest.base.Social.RequestConnectEvent(com.pinterest.base.Social.Network.FACEBOOK, Social.FB_STREAM_PERMISSIONS));
            }
        }

        _cls1()
        {
            this$0 = CreateBoardListHeader.this;
            super();
        }
    }

}
