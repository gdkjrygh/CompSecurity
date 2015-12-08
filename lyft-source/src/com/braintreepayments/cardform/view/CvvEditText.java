// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import com.braintreepayments.cardform.utils.CardType;

// Referenced classes of package com.braintreepayments.cardform.view:
//            FloatingLabelEditText

public class CvvEditText extends FloatingLabelEditText
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
            return mCardType.getSecurityCodeLength();
        }
    }

    private void init()
    {
        setInputType(2);
        setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(3)
        });
    }

    public void afterTextChanged(Editable editable)
    {
        super.afterTextChanged(editable);
        break MISSING_BLOCK_LABEL_5;
        if (mCardType != null && mCardType.getSecurityCodeLength() == editable.length() && getSelectionStart() == editable.length())
        {
            validate();
            if (isValid())
            {
                focusNext();
                return;
            }
        }
        return;
    }

    public boolean isValid()
    {
        return getText().toString().length() == getSecurityCodeLength();
    }

    public void onFocusChange(View view, boolean flag)
    {
        super.onFocusChange(view, flag);
        int i;
        if (flag || mAlwaysDisplayHint)
        {
            if (mCardType == null)
            {
                i = com.braintreepayments.cardform.R.drawable.bt_cvv_highlighted;
            } else
            {
                i = mCardType.getSecurityCodeResource();
            }
        } else
        {
            i = 0;
        }
        if (mRightToLeftLanguage)
        {
            setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            return;
        } else
        {
            setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            return;
        }
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
            new android.text.InputFilter.LengthFilter(cardtype.getSecurityCodeLength())
        });
        invalidate();
    }
}
