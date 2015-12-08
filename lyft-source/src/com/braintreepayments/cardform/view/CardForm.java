// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.cardform.view;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.braintreepayments.cardform.OnCardFormFieldFocusedListener;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.OnCardFormValidListener;
import com.braintreepayments.cardform.utils.CardType;

// Referenced classes of package com.braintreepayments.cardform.view:
//            CardEditText, MonthYearEditText, CvvEditText, PostalCodeEditText

public class CardForm extends LinearLayout
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, CardEditText.OnCardTypeChangedListener, FloatingLabelEditText.OnTextChangedListener
{

    private static final String EXTRA_CARD_NUMBER_TEXT = "com.braintreepayments.cardform.EXTRA_CARD_NUMBER_TEXT";
    private static final String EXTRA_CVV_TEXT = "com.braintreepayments.cardform.EXTRA_CVV_TEXT";
    private static final String EXTRA_EXPIRATION_TEXT = "com.braintreepayments.cardform.EXTRA_EXPIRATION_TEXT";
    private static final String EXTRA_POSTAL_CODE_TEXT = "com.braintreepayments.cardform.EXTRA_POSTAL_CODE_TEXT";
    private CardEditText mCardNumber;
    private boolean mCardNumberRequired;
    private boolean mCvvRequired;
    private CvvEditText mCvvView;
    private boolean mExpirationRequired;
    private MonthYearEditText mExpirationView;
    private OnCardFormFieldFocusedListener mOnCardFormFieldFocusedListener;
    private OnCardFormSubmitListener mOnCardFormSubmitListener;
    private OnCardFormValidListener mOnCardFormValidListener;
    private PostalCodeEditText mPostalCode;
    private boolean mPostalCodeRequired;
    private boolean mValid;

    public CardForm(Context context)
    {
        super(context);
        mValid = false;
        init();
    }

    public CardForm(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mValid = false;
        init();
    }

    public CardForm(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mValid = false;
        init();
    }

    public CardForm(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mValid = false;
        init();
    }

    private void init()
    {
        inflate(getContext(), com.braintreepayments.cardform.R.layout.bt_card_form_fields, this);
        mCardNumber = (CardEditText)findViewById(com.braintreepayments.cardform.R.id.bt_card_form_card_number);
        mExpirationView = (MonthYearEditText)findViewById(com.braintreepayments.cardform.R.id.bt_card_form_expiration);
        mCvvView = (CvvEditText)findViewById(com.braintreepayments.cardform.R.id.bt_card_form_cvv);
        mPostalCode = (PostalCodeEditText)findViewById(com.braintreepayments.cardform.R.id.bt_card_form_postal_code);
        mCardNumber.setFocusChangeListener(this);
        mExpirationView.setFocusChangeListener(this);
        mCvvView.setFocusChangeListener(this);
        mPostalCode.setFocusChangeListener(this);
        mCardNumber.setOnClickListener(this);
        mExpirationView.setOnClickListener(this);
        mCvvView.setOnClickListener(this);
        mPostalCode.setOnClickListener(this);
        mCardNumber.setOnCardTypeChangedListener(this);
        setRequiredFields(true, true, true, true, getContext().getString(com.braintreepayments.cardform.R.string.bt_default_action_label));
    }

    private void requestEditTextFocus(EditText edittext)
    {
        edittext.requestFocus();
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(edittext, 1);
    }

    private void restoreText(Bundle bundle, TextView textview, String s)
    {
        if (bundle.containsKey(s))
        {
            textview.setText(bundle.getCharSequence(s));
        }
    }

    private void setIMEOptionsForLastEditTestField(EditText edittext, String s)
    {
        edittext.setImeOptions(2);
        edittext.setImeActionLabel(s, 2);
        edittext.setOnEditorActionListener(this);
    }

    public void closeSoftKeyboard()
    {
        ((InputMethodManager)getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public String getCardNumber()
    {
        return mCardNumber.getText().toString();
    }

    public String getCvv()
    {
        return mCvvView.getText().toString();
    }

    public String getExpirationMonth()
    {
        return mExpirationView.getMonth();
    }

    public String getExpirationYear()
    {
        return mExpirationView.getYear();
    }

    public String getPostalCode()
    {
        return mPostalCode.getText().toString();
    }

    public boolean isValid()
    {
        boolean flag;
        boolean flag1;
        if (mCardNumberRequired)
        {
            if (mCardNumber.isValid())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        } else
        {
            flag1 = true;
        }
        flag = flag1;
        if (mExpirationRequired)
        {
            if (flag1 && mExpirationView.isValid())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        flag1 = flag;
        if (mCvvRequired)
        {
            if (flag && mCvvView.isValid())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (mPostalCodeRequired)
        {
            return flag1 && mPostalCode.isValid();
        } else
        {
            return flag1;
        }
    }

    public void onCardTypeChanged(CardType cardtype)
    {
        mCvvView.setCardType(cardtype);
    }

    public void onClick(View view)
    {
        if (mOnCardFormFieldFocusedListener != null)
        {
            mOnCardFormFieldFocusedListener.onCardFormFieldFocused(view);
        }
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2 && mOnCardFormSubmitListener != null)
        {
            mOnCardFormSubmitListener.onCardFormSubmit();
            return true;
        } else
        {
            return false;
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (flag && mOnCardFormFieldFocusedListener != null)
        {
            mOnCardFormFieldFocusedListener.onCardFormFieldFocused(view);
        }
    }

    public void onRestoreInstanceState(Bundle bundle)
    {
        if (bundle != null)
        {
            restoreText(bundle, mCardNumber, "com.braintreepayments.cardform.EXTRA_CARD_NUMBER_TEXT");
            restoreText(bundle, mCvvView, "com.braintreepayments.cardform.EXTRA_CVV_TEXT");
            restoreText(bundle, mExpirationView, "com.braintreepayments.cardform.EXTRA_EXPIRATION_TEXT");
            restoreText(bundle, mPostalCode, "com.braintreepayments.cardform.EXTRA_POSTAL_CODE_TEXT");
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putCharSequence("com.braintreepayments.cardform.EXTRA_CARD_NUMBER_TEXT", mCardNumber.getText());
        bundle.putCharSequence("com.braintreepayments.cardform.EXTRA_CVV_TEXT", mCvvView.getText());
        bundle.putCharSequence("com.braintreepayments.cardform.EXTRA_EXPIRATION_TEXT", mExpirationView.getText());
        bundle.putCharSequence("com.braintreepayments.cardform.EXTRA_POSTAL_CODE_TEXT", mPostalCode.getText());
    }

    public void onTextChanged(Editable editable)
    {
        boolean flag = isValid();
        if (mValid != flag)
        {
            mValid = flag;
            if (mOnCardFormValidListener != null)
            {
                mOnCardFormValidListener.onCardFormValid(flag);
            }
        }
    }

    public void setCardNumberError()
    {
        if (mCardNumberRequired)
        {
            mCardNumber.setError();
            requestEditTextFocus(mCardNumber);
        }
    }

    public void setCvvError()
    {
        if (mCvvRequired)
        {
            mCvvView.setError();
            if (!mCardNumberRequired && !mExpirationRequired || !mCardNumber.isFocused() && !mExpirationView.isFocused())
            {
                requestEditTextFocus(mCvvView);
            }
        }
    }

    public void setEnabled(boolean flag)
    {
        mCardNumber.setEnabled(flag);
        mExpirationView.setEnabled(flag);
        mCvvView.setEnabled(flag);
        mPostalCode.setEnabled(flag);
    }

    public void setExpirationError()
    {
        if (mExpirationRequired)
        {
            mExpirationView.setError();
            if (!mCardNumberRequired || !mCardNumber.isFocused())
            {
                requestEditTextFocus(mExpirationView);
            }
        }
    }

    public void setOnCardFormSubmitListener(OnCardFormSubmitListener oncardformsubmitlistener)
    {
        mOnCardFormSubmitListener = oncardformsubmitlistener;
    }

    public void setOnCardFormValidListener(OnCardFormValidListener oncardformvalidlistener)
    {
        mOnCardFormValidListener = oncardformvalidlistener;
    }

    public void setOnFormFieldFocusedListener(OnCardFormFieldFocusedListener oncardformfieldfocusedlistener)
    {
        mOnCardFormFieldFocusedListener = oncardformfieldfocusedlistener;
    }

    public void setPostalCodeError()
    {
        if (mPostalCodeRequired)
        {
            mPostalCode.setError();
            if (!mCardNumberRequired && !mExpirationRequired && !mCvvRequired || !mCardNumber.isFocused() && !mExpirationView.isFocused() && !mCvvView.isFocused())
            {
                requestEditTextFocus(mPostalCode);
            }
        }
    }

    public void setRequiredFields(boolean flag, boolean flag1, boolean flag2, boolean flag3, String s)
    {
        mCardNumberRequired = flag;
        mExpirationRequired = flag1;
        mCvvRequired = flag2;
        mPostalCodeRequired = flag3;
        if (flag)
        {
            mCardNumber.setTextChangedListener(this);
        } else
        {
            mCardNumber.setVisibility(8);
        }
        if (flag1)
        {
            mExpirationView.setTextChangedListener(this);
        } else
        {
            mExpirationView.setVisibility(8);
        }
        if (flag2 || flag3)
        {
            mExpirationView.setImeOptions(5);
        } else
        {
            setIMEOptionsForLastEditTestField(mExpirationView, s);
        }
        if (flag2)
        {
            mCvvView.setTextChangedListener(this);
            if (flag3)
            {
                mCvvView.setImeOptions(5);
            } else
            {
                setIMEOptionsForLastEditTestField(mCvvView, s);
            }
        } else
        {
            mCvvView.setVisibility(8);
        }
        if (flag3)
        {
            mPostalCode.setTextChangedListener(this);
            setIMEOptionsForLastEditTestField(mPostalCode, s);
        } else
        {
            mPostalCode.setVisibility(8);
        }
        mCardNumber.setOnCardTypeChangedListener(this);
    }

    public void validate()
    {
        if (mCardNumberRequired)
        {
            mCardNumber.validate();
        }
        if (mExpirationRequired)
        {
            mExpirationView.validate();
        }
        if (mCvvRequired)
        {
            mCvvView.validate();
        }
        if (mPostalCodeRequired)
        {
            mPostalCode.validate();
        }
    }
}
