// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.User;
import com.pinterest.base.Colors;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.GrayWebImageView;
import com.pinterest.ui.text.PTextView;

public class UserHeaderView extends FrameLayout
{

    private User _user;
    GrayWebImageView _userHeaderIv;
    PTextView _userHeaderNameTv;
    PTextView _userHeaderSubtitleTv;

    public UserHeaderView(Context context)
    {
        this(context, null);
    }

    public UserHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f03020a, this);
        ButterKnife.a(this);
        _userHeaderNameTv.setIconTint(Colors.RED);
        _userHeaderSubtitleTv.setIconTint(Colors.RED);
    }

    public void setUser(User user)
    {
        if (user == null)
        {
            return;
        }
        _user = user;
        _userHeaderIv.setOval(true);
        _userHeaderIv.loadUrl(_user.getImageMediumUrl());
        _userHeaderNameTv.setText(_user.getFullName());
        PTextView ptextview;
        int i;
        boolean flag;
        if (ModelHelper.isValid(_user.getWebsiteHost()))
        {
            user = _user.getWebsiteHost();
        } else
        if (ModelHelper.isValid(_user.getLocation()))
        {
            user = _user.getLocation();
        } else
        {
            user = null;
        }
        if (_user.getVerifiedIdentity() == Boolean.TRUE)
        {
            i = 0x7f020201;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            DrawableUtils.setTextViewRightDrawable(_userHeaderNameTv, i);
        }
        _userHeaderSubtitleTv.setText(user);
        ptextview = _userHeaderSubtitleTv;
        if (user != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ViewHelper.setVisibility(ptextview, flag);
    }
}
