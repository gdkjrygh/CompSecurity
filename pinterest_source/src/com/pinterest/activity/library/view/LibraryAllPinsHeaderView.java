// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.User;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.SquareImageView;

public class LibraryAllPinsHeaderView extends RelativeLayout
{

    SquareImageView _libraryHeaderPhoto;
    TextView _libraryHeaderPinCount;
    private User _user;

    public LibraryAllPinsHeaderView(Context context)
    {
        this(context, null);
    }

    public LibraryAllPinsHeaderView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LibraryAllPinsHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void updateUser()
    {
        if (_user != null)
        {
            _libraryHeaderPhoto.loadUrl(_user.getImageLargeUrl());
            _libraryHeaderPhoto.setOval(Boolean.TRUE.booleanValue());
            int i = _user.getPinCountDisplay();
            instantiateTextView(_libraryHeaderPinCount, Resources.stringPluralShort(0x7f090017, Integer.valueOf(i)));
        }
    }

    public void init()
    {
        inflate(getContext(), 0x7f0301e1, this);
        ButterKnife.a(this);
    }

    public void instantiateTextView(TextView textview, String s)
    {
        if (TextUtils.isEmpty(s))
        {
            textview.setVisibility(8);
            return;
        } else
        {
            textview.setText(s);
            return;
        }
    }

    public void setUser(User user)
    {
        _user = user;
        updateUser();
    }
}
