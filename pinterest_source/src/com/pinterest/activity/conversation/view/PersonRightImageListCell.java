// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class PersonRightImageListCell extends PeoplePickerPersonCell
{

    private WebImageView _rightImageView;

    public PersonRightImageListCell(Context context)
    {
        this(context, null);
    }

    public PersonRightImageListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0f0374);
        _rightImageView = new WebImageView(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        _rightImageView.setLayoutParams(layoutparams);
        viewgroup.addView(_rightImageView);
        _rightImageView.setImageResource(0x7f0201cd);
    }

    public void setChecked(boolean flag)
    {
        WebImageView webimageview = _rightImageView;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ViewHelper.setVisibility(webimageview, i);
    }
}
