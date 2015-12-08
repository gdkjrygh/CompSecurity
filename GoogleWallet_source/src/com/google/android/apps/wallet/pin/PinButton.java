// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.widget.Button;
import com.google.common.base.Preconditions;

public class PinButton extends Button
{

    public PinButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initText(context, attributeset);
    }

    public PinButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initText(context, attributeset);
    }

    private void initText(Context context, AttributeSet attributeset)
    {
        attributeset = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.PinButton);
        int i = attributeset.getResourceId(com.google.android.apps.walletnfcrel.R.styleable.PinButton_letterText, -1);
        attributeset.recycle();
        Object obj;
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        attributeset = getText();
        setTag(com.google.android.apps.walletnfcrel.R.id.PinButtonDigitTag, attributeset);
        obj = getResources().getText(i);
        if (((CharSequence) (obj)).toString().isEmpty())
        {
            return;
        } else
        {
            obj = String.valueOf(obj);
            obj = new SpannableString(TextUtils.concat(new CharSequence[] {
                attributeset, (new StringBuilder(String.valueOf(obj).length() + 1)).append(" ").append(((String) (obj))).toString()
            }));
            ((SpannableString) (obj)).setSpan(new TextAppearanceSpan(context, com.google.android.apps.walletnfcrel.R.style.Text_Subtext), attributeset.length(), ((SpannableString) (obj)).length(), 33);
            setText(((CharSequence) (obj)), android.widget.TextView.BufferType.SPANNABLE);
            return;
        }
    }
}
