// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

public class VariantAttrView extends FrameLayout
{

    TextView _attrTextView;

    public VariantAttrView(Context context)
    {
        super(context);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f0301b2, this);
        ButterKnife.a(this);
    }

    public void bindNonSelectedText(String s)
    {
        _attrTextView.setText(s);
        _attrTextView.setTextColor(getResources().getColor(0x7f0e0070));
    }

    public void bindSelectedText(String s)
    {
        s = new SpannableString(s);
        s.setSpan(new UnderlineSpan(), 0, s.length(), 33);
        _attrTextView.setText(s);
        _attrTextView.setTextColor(getResources().getColor(0x7f0e0024));
    }

    public void removePadding()
    {
        _attrTextView.setPadding(0, 0, 0, 0);
    }
}
