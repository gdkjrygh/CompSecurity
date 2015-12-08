// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.braintree.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.ui.text.PEditText;

public class CardPEditText extends PEditText
{

    public CardPEditText(Context context)
    {
        super(context);
    }

    public CardPEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public CardPEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void focusNextView()
    {
        View view;
        if (getImeActionId() != 2 && getImeActionId() != 5)
        {
            if ((view = focusSearch(130)) != null)
            {
                view.requestFocus();
                return;
            }
        }
    }

    protected void init()
    {
        super.init();
        setShouldApplyTint(false);
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
    }
}
