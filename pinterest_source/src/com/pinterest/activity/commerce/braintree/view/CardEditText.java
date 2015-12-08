// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.braintree.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.braintreepayments.cardform.utils.CardType;
import com.braintreepayments.cardform.view.SpaceSpan;

// Referenced classes of package com.pinterest.activity.commerce.braintree.view:
//            CardPEditText

public class CardEditText extends CardPEditText
    implements TextWatcher
{

    private CardType mCardType;
    private OnCardTypeChangedListener mOnCardTypeChangedListener;

    public CardEditText(Context context)
    {
        super(context);
        mCardType = CardType.i;
        init();
    }

    public CardEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCardType = CardType.i;
        init();
    }

    public CardEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mCardType = CardType.i;
        init();
    }

    private void addSpans(Editable editable, int ai[])
    {
        int j = editable.length();
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            int l = ai[i];
            if (l <= j)
            {
                editable.setSpan(new SpaceSpan(), l - 1, l, 33);
            }
        }

    }

    private android.view.View.OnTouchListener getRightDrawableOnTouchListener()
    {
        return new _cls1();
    }

    private void setCardIcon(int i)
    {
        setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    private void updateCardType()
    {
        CardType cardtype = CardType.b(getText().toString());
        if (mCardType != cardtype)
        {
            mCardType = cardtype;
            setFilters(new InputFilter[] {
                new android.text.InputFilter.LengthFilter(mCardType.d())
            });
            invalidate();
            if (mOnCardTypeChangedListener != null)
            {
                mOnCardTypeChangedListener.onCardTypeChanged(mCardType);
            }
        }
    }

    public void afterTextChanged(Editable editable)
    {
        int i = 0;
        Object aobj[] = editable.getSpans(0, editable.length(), com/braintreepayments/cardform/view/SpaceSpan);
        for (int j = aobj.length; i < j; i++)
        {
            editable.removeSpan(aobj[i]);
        }

        updateCardType();
        if (mCardType == CardType.i && editable.length() == 0)
        {
            setCardIcon(0x7f020102);
        } else
        {
            setCardIcon(mCardType.a());
        }
        addSpans(editable, mCardType.e());
        if (mCardType.d() == getSelectionStart() && isValid())
        {
            focusNextView();
        }
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public CardType getCardType()
    {
        return mCardType;
    }

    public void init()
    {
        super.init();
        setInputType(2);
        setCardIcon(0x7f020102);
        addTextChangedListener(this);
        setOnTouchListener(getRightDrawableOnTouchListener());
    }

    public boolean isValid()
    {
        return mCardType.a(getText().toString());
    }

    public void setOnCardTypeChangedListener(OnCardTypeChangedListener oncardtypechangedlistener)
    {
        mOnCardTypeChangedListener = oncardtypechangedlistener;
    }

    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final CardEditText this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0 && getText().length() == 0)
            {
                Drawable adrawable[] = getCompoundDrawables();
                if (adrawable != null && adrawable.length == 4)
                {
                    Drawable drawable = adrawable[2];
                    int i = view.getWidth();
                    int j = view.getPaddingRight();
                    int k = drawable.getIntrinsicWidth();
                    if (motionevent.getX() > (float)(i - j - k))
                    {
                        motionevent.setAction(3);
                        ActivityHelper.goCardScan((BaseActivity)getContext());
                        return true;
                    }
                }
            }
            return false;
        }

        _cls1()
        {
            this$0 = CardEditText.this;
            super();
        }
    }


    private class OnCardTypeChangedListener
    {

        public abstract void onCardTypeChanged(CardType cardtype);
    }

}
