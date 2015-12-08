// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.activity.user.fragment.UserAboutFragment;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;

public class UserAboutSetPictureView extends FrameLayout
{

    private UserAboutFragment _fragment;
    private View _setTv;
    private User _user;
    private android.view.View.OnClickListener onSetPictureClick;

    public UserAboutSetPictureView(Context context)
    {
        this(context, null);
    }

    public UserAboutSetPictureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onSetPictureClick = new _cls1();
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f03020c, this);
        _setTv = findViewById(0x7f0f04e5);
    }

    public void setFragment(UserAboutFragment useraboutfragment)
    {
        _fragment = useraboutfragment;
    }

    public void updateView(User user)
    {
        _user = user;
        int i;
        if (MyUser.isUserMe(user))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        setVisibility(i);
        _setTv.setOnClickListener(onSetPictureClick);
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final UserAboutSetPictureView this$0;

        public void onClick(View view)
        {
            UserAboutHelper.showUserPictureSource(getContext());
        }

        _cls1()
        {
            this$0 = UserAboutSetPictureView.this;
            super();
        }
    }

}
