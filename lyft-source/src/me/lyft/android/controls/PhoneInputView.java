// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

// Referenced classes of package me.lyft.android.controls:
//            ViewWithErrorState, PhoneFormattingTextWatcher, KeyboardlessEditText

public class PhoneInputView extends FrameLayout
    implements NumericKeyboard.KeyPressListener, ViewWithErrorState
{

    private static final int STATE_ERROR[] = {
        0x7f01000f
    };
    private static final int STATE_FOCUSED[] = {
        0x101009c
    };
    KeyboardlessEditText phoneEditText;
    private final TextWatcher phoneFormattingTextWatcher = new PhoneFormattingTextWatcher(null);
    private final TextWatcher textWatcher = new TextWatcher() {

        final PhoneInputView this$0;

        public void afterTextChanged(Editable editable)
        {
            if (editable.length() > 0)
            {
                phoneEditText.setGravity(17);
            } else
            {
                phoneEditText.setGravity(3);
            }
            requestEditTextFocus();
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

        public void onTextChanged(CharSequence charsequence, int i, int j, int k)
        {
        }

            
            {
                this$0 = PhoneInputView.this;
                super();
            }
    };

    public PhoneInputView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        LayoutInflater.from(getContext()).inflate(0x7f0300eb, this, true);
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            phoneEditText.addTextChangedListener(phoneFormattingTextWatcher);
            return;
        }
    }

    public String getText()
    {
        return phoneEditText.getText().toString();
    }

    public boolean hasValidationError()
    {
        if (isInEditMode())
        {
            return false;
        } else
        {
            return phoneEditText.hasValidationError();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            phoneEditText.addTextChangedListener(textWatcher);
            return;
        }
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[];
        if (isInEditMode())
        {
            ai = new int[0];
        } else
        {
            int ai1[] = super.onCreateDrawableState(i + 1);
            if (hasValidationError())
            {
                mergeDrawableStates(ai1, STATE_ERROR);
                return ai1;
            }
            ai = ai1;
            if (phoneEditText.isFocused())
            {
                mergeDrawableStates(ai1, STATE_FOCUSED);
                return ai1;
            }
        }
        return ai;
    }

    public void onDelLongPressed()
    {
        phoneEditText.onDelLongPressed();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        phoneEditText.removeTextChangedListener(textWatcher);
        phoneEditText.removeTextChangedListener(phoneFormattingTextWatcher);
    }

    public void onKeyPressed(KeyEvent keyevent)
    {
        phoneEditText.onKeyPressed(keyevent);
    }

    public void requestEditTextFocus()
    {
        phoneEditText.requestFocus();
        refreshDrawableState();
    }

    public void setTextAndMoveCursor(String s)
    {
        phoneEditText.setTextAndMoveCursor(s);
    }

    public void setValidationErrorId(Integer integer)
    {
        phoneEditText.setValidationErrorId(integer);
    }

    public void setValidationMessageView(TextView textview)
    {
        phoneEditText.setValidationMessageView(textview);
    }

    public void showValidationMessage()
    {
        phoneEditText.showValidationMessage();
        refreshDrawableState();
    }

}
