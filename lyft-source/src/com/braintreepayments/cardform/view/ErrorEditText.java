// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class ErrorEditText extends EditText
{

    private boolean mError;

    public ErrorEditText(Context context)
    {
        super(context);
        mError = false;
    }

    public ErrorEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mError = false;
    }

    public ErrorEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mError = false;
    }

    private void setBackground(int i)
    {
        int j = getPaddingBottom();
        int k = getPaddingLeft();
        int l = getPaddingRight();
        int i1 = getPaddingTop();
        setBackgroundResource(i);
        setPadding(k, i1, l, j);
    }

    public void clearError()
    {
        mError = false;
        setBackground(com.braintreepayments.cardform.R.drawable.bt_field_selector);
    }

    public boolean isError()
    {
        return mError;
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        clearError();
    }

    public void setError()
    {
        mError = true;
        setBackground(com.braintreepayments.cardform.R.drawable.bt_field_error_selector);
    }
}
