// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;

public class TopicAnnotationCell extends FrameLayout
{

    private static final int ITEM_MARGIN_HALF = (int)Device.dpToPixel(2.0F);
    TextView _topicName;
    View _topicNameWrapper;

    public TopicAnnotationCell(Context context)
    {
        this(context, null);
    }

    public TopicAnnotationCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public static TopicAnnotationCell get(View view, ViewGroup viewgroup)
    {
        if (view != null && (view instanceof TopicAnnotationCell))
        {
            return (TopicAnnotationCell)view;
        } else
        {
            return new TopicAnnotationCell(viewgroup.getContext());
        }
    }

    private void init()
    {
        inflate(getContext(), 0x7f03015d, this);
        ButterKnife.a(this);
    }

    public void setBackgroundResource(int i)
    {
        _topicNameWrapper.setBackgroundResource(i);
    }

    public void updateUI(String s, boolean flag, boolean flag1, boolean flag2)
    {
        TextView textview = _topicName;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = "";
        }
        textview.setText(s1);
        int i;
        int j;
        if (flag)
        {
            _topicName.setTextColor(Resources.color(0x7f0e00bf));
            _topicNameWrapper.setBackgroundResource(0x7f020268);
        } else
        {
            _topicName.setTextColor(Resources.color(0x7f0e007b));
            _topicNameWrapper.setBackgroundResource(0x7f020269);
        }
        i = ITEM_MARGIN_HALF;
        j = ITEM_MARGIN_HALF;
        if (flag1)
        {
            i = 0;
        }
        if (flag2)
        {
            j = 0;
        }
        setPadding(i, 0, j, 0);
    }

}
