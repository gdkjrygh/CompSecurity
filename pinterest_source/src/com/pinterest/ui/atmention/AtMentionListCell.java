// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.pinterest.api.model.AtMention;
import com.pinterest.ui.imageview.WebImageView;

public class AtMentionListCell extends RelativeLayout
{

    private AtMention _atMention;
    private TextView _nameTv;
    private WebImageView _profileIv;

    public AtMentionListCell(Context context)
    {
        this(context, null);
    }

    public AtMentionListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void updateUi()
    {
        if (_profileIv == null || _nameTv == null || _atMention == null)
        {
            return;
        } else
        {
            _profileIv.loadUrl(_atMention.getImageUrl());
            _nameTv.setText(_atMention.getDisplaySpan());
            return;
        }
    }

    public AtMention getAtMention()
    {
        return _atMention;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _profileIv = (WebImageView)findViewById(0x7f0f0329);
        _nameTv = (TextView)findViewById(0x7f0f01e9);
        updateUi();
    }

    public void setAtMention(AtMention atmention)
    {
        _atMention = atmention;
        updateUi();
    }
}
