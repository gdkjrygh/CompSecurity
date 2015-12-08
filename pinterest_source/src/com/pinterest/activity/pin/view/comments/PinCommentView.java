// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.api.model.Comment;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.kit.time.FuzzyDateFormatter;
import com.pinterest.kit.time.TimeDifference;
import com.pinterest.kit.time.TimeUnit;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.NoUnderlineClickSpan;
import java.util.Date;

public class PinCommentView extends FrameLayout
{

    private Comment _comment;
    protected TextView _commentTv;
    protected TextView _dateTv;
    protected WebImageView _iconIv;
    private TextView _nameTv;
    protected Pin _pin;

    public PinCommentView(Context context)
    {
        this(context, null);
    }

    public PinCommentView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PinCommentView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    protected void init()
    {
        setMinimumHeight(getResources().getDimensionPixelSize(0x7f0a0155));
        setBackgroundResource(0x7f020283);
        LayoutInflater.from(getContext()).inflate(0x7f030165, this, true);
        _iconIv = (WebImageView)findViewById(0x7f0f0325);
        _iconIv.setOval(true);
        _nameTv = (TextView)findViewById(0x7f0f01e9);
        _dateTv = (TextView)findViewById(0x7f0f037a);
        _commentTv = (TextView)findViewById(0x7f0f0379);
        _commentTv.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setCommentDate(Date date)
    {
        if (_comment != null && _pin != null && _pin.getUserUid() != null)
        {
            TimeDifference timedifference = TimeDifference.a(date);
            String s = FuzzyDateFormatter.a(timedifference);
            date = s;
            if (_comment.getUserUid().equals(_pin.getUserUid()))
            {
                if (TimeUnit.a.equals(timedifference.a()))
                {
                    date = com.pinterest.kit.application.Resources.string(0x7f07041f);
                } else
                {
                    date = com.pinterest.kit.application.Resources.string(0x7f070421, new Object[] {
                        s
                    });
                }
            }
            _dateTv.setText(Html.fromHtml(date));
        }
    }

    public void setCommentText(String s)
    {
        if (ModelHelper.isValid(s))
        {
            s = new SpannableString(Html.fromHtml(s));
            s.setSpan(new NoUnderlineClickSpan(), 0, s.length(), 33);
            _commentTv.setVisibility(0);
            _commentTv.setText(s);
            return;
        } else
        {
            _commentTv.setVisibility(8);
            return;
        }
    }

    public void setData(Comment comment, Pin pin)
    {
        _pin = pin;
        _comment = comment;
        updateView();
    }

    public void setNameText(String s)
    {
        _nameTv.setText(s);
    }

    public void setUserImageUrl(String s)
    {
        _iconIv.loadUrl(s);
    }

    protected void updateView()
    {
        if (_comment != null)
        {
            User user = _comment.getUser();
            if (user != null)
            {
                setNameText(user.getFullName());
                setUserImageUrl(user.getImageMediumUrl());
            }
            setCommentText(_comment.getText());
            if (_comment.getCreatedAt() != null)
            {
                setCommentDate(_comment.getCreatedAt());
                return;
            }
        }
    }
}
