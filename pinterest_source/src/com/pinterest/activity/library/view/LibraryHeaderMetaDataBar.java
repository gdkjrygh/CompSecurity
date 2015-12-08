// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.User;
import com.pinterest.kit.utils.NumberUtils;

public class LibraryHeaderMetaDataBar extends LinearLayout
{

    TextView _followersCount;
    TextView _followingCount;
    private User _user;

    public LibraryHeaderMetaDataBar(Context context)
    {
        this(context, null);
    }

    public LibraryHeaderMetaDataBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void initListeners()
    {
        _followersCount.setOnClickListener(new _cls1());
        _followingCount.setOnClickListener(new _cls2());
    }

    protected void init()
    {
        inflate(getContext(), 0x7f030136, this);
        ButterKnife.a(this);
        initListeners();
    }

    public void setUser(User user)
    {
        _user = user;
        _followersCount.setText(NumberUtils.getFormattedNumber(_user.getFollowersCountDisplay()));
        _followingCount.setText(NumberUtils.getFormattedNumber(_user.getFollowingCountDisplay()));
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final LibraryHeaderMetaDataBar this$0;

        public void onClick(View view)
        {
            if (_user != null)
            {
                Events.post(new Navigation(Location.USER_LIBRARY_FOLLOWERS, _user.getUid()));
            }
        }

        _cls1()
        {
            this$0 = LibraryHeaderMetaDataBar.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final LibraryHeaderMetaDataBar this$0;

        public void onClick(View view)
        {
            if (_user != null)
            {
                Events.post(new Navigation(Location.USER_LIBRARY_FOLLOWING, _user.getUid()));
            }
        }

        _cls2()
        {
            this$0 = LibraryHeaderMetaDataBar.this;
            super();
        }
    }

}
