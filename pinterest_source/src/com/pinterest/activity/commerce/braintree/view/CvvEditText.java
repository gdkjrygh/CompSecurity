// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.braintree.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.braintreepayments.cardform.utils.CardType;

// Referenced classes of package com.pinterest.activity.commerce.braintree.view:
//            CardPEditText

public class CvvEditText extends CardPEditText
    implements TextWatcher
{

    private static final int DEFAULT_MAX_LENGTH = 3;
    private boolean mAlwaysDisplayHint;
    private CardType mCardType;

    public CvvEditText(Context context)
    {
        super(context);
        mAlwaysDisplayHint = false;
        init();
    }

    public CvvEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAlwaysDisplayHint = false;
        init();
    }

    public CvvEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAlwaysDisplayHint = false;
        init();
    }

    private int getSecurityCodeLength()
    {
        if (mCardType == null)
        {
            return 3;
        } else
        {
            return mCardType.c();
        }
    }

    public void afterTextChanged(Editable editable)
    {
        while (mCardType == null || mCardType.c() != editable.length() || getSelectionStart() != editable.length() || !isValid()) 
        {
            return;
        }
        focusNextView();
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void init()
    {
        super.init();
        setInputType(18);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(3)
        });
        addTextChangedListener(this);
    }

    public boolean isValid()
    {
        return getText().toString().length() == getSecurityCodeLength();
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag || mAlwaysDisplayHint)
        {
            if (mCardType == null)
            {
                i = 0x7f02004e;
            } else
            {
                i = mCardType.b();
            }
        } else
        {
            i = 0;
        }
        setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public void setAlwaysDisplayHint(boolean flag)
    {
        mAlwaysDisplayHint = flag;
        invalidate();
    }

    public void setCardType(CardType cardtype)
    {
        mCardType = cardtype;
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(cardtype.c())
        });
        invalidate();
    }
}
