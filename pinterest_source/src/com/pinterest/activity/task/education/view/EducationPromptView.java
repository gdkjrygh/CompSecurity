// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.education.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.pinterest.ui.text.PTextView;

public class EducationPromptView extends RelativeLayout
{

    PTextView _title;

    public EducationPromptView(Context context)
    {
        this(context, null);
    }

    public EducationPromptView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EducationPromptView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        LayoutInflater.from(context).inflate(0x7f0301ca, this, true);
        ButterKnife.a(this);
        setVisibility(8);
    }

    public void hidePrompt()
    {
        setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        ButterKnife.a(this);
        super.onDetachedFromWindow();
    }

    public void setTitle(String s)
    {
        _title.setTypefaceId(com.pinterest.kit.utils.FontUtils.TypefaceId.BOLD);
        _title.setText(s);
        setVisibility(0);
    }
}
