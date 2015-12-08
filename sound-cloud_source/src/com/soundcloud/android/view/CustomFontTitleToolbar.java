// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.view:
//            CustomFontLoader

public class CustomFontTitleToolbar extends Toolbar
{

    private TextView titleText;

    public CustomFontTitleToolbar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context, attributeset);
    }

    public CustomFontTitleToolbar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset);
    }

    private void init(Context context, AttributeSet attributeset)
    {
        titleText = (TextView)LayoutInflater.from(context).inflate(0x7f0300c4, this, false);
        addView(titleText);
        CustomFontLoader.applyCustomFont(context, titleText, attributeset);
    }

    public void setTitle(CharSequence charsequence)
    {
        titleText.setText(charsequence);
    }
}
