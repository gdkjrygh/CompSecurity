// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.user.fragment.UserAboutHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.kit.network.image.ImageCache;
import com.pinterest.ui.imageview.GrayWebImageView;

public class UserImageView extends ScrollView
{

    View _divider;
    TextView _updatePictureTv;
    private User _user;
    GrayWebImageView _userIv;
    TextView _usernameTv;

    public UserImageView(Context context)
    {
        this(context, null);
    }

    public UserImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public UserImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f0301b1, this);
        ButterKnife.a(this);
    }

    private void updateView()
    {
        _usernameTv.setText(_user.getFullName());
        ImageCache.loadImage(_userIv, _user.getImageLargeUrl());
        if (MyUser.isUserMe(_user))
        {
            _divider.setVisibility(0);
            _updatePictureTv.setVisibility(0);
            return;
        } else
        {
            _divider.setVisibility(8);
            _updatePictureTv.setVisibility(8);
            return;
        }
    }

    void onUpdatePictureClicked(View view)
    {
        UserAboutHelper.showUserPictureSource(getContext());
    }

    public void setUser(User user)
    {
        _user = user;
        updateView();
    }
}
