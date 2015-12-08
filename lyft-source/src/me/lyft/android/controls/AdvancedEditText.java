// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import me.lyft.android.utils.EditTextUtils;

// Referenced classes of package me.lyft.android.controls:
//            CrashLessEditText, ViewWithErrorState

public class AdvancedEditText extends CrashLessEditText
    implements ViewWithErrorState
{

    private static final int DEFAULT_MAX_INPUT_LINES = 0;
    private static final int STATE_ERROR[] = {
        0x7f01000f
    };
    private final Context context;
    private int maxInputLines;
    private int originalHintTextColor;
    private int originalValidationViewColor;
    private String originalValidationViewMessage;
    private MaxLinesTextWatcher textWatcher;
    private String validationErrorMessage;
    private TextView validationMessageView;

    public AdvancedEditText(Context context1)
    {
        super(context1);
        context = context1;
    }

    public AdvancedEditText(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        context = context1;
        init(attributeset);
    }

    public AdvancedEditText(Context context1, AttributeSet attributeset, int i)
    {
        super(context1, attributeset, i);
        context = context1;
    }

    private void init(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, me.lyft.android.R.styleable.EditText);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        j = attributeset.getIndexCount();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        attributeset.getIndex(i);
        JVM INSTR tableswitch 1 1: default 52
    //                   1 59;
           goto _L4 _L5
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        maxInputLines = attributeset.getInt(1, 0);
        if (true) goto _L4; else goto _L2
_L2:
        attributeset.recycle();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void setValidationErrorMessage(String s)
    {
        validationErrorMessage = s;
        if (hasFocus())
        {
            showValidationMessage();
        }
        refreshDrawableState();
    }

    public boolean hasValidationError()
    {
        return validationErrorMessage != null;
    }

    public boolean isCursorAtStart()
    {
        return getSelectionStart() == 0 && getSelectionEnd() == 0;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (maxInputLines > 0)
        {
            textWatcher = new MaxLinesTextWatcher();
            addTextChangedListener(textWatcher);
        }
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (hasValidationError())
        {
            mergeDrawableStates(ai, STATE_ERROR);
        }
        return ai;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorinfo)
    {
        editorinfo = super.onCreateInputConnection(editorinfo);
        if (editorinfo == null)
        {
            return null;
        } else
        {
            return new CustomInputConnectionWrapper(editorinfo, true);
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (textWatcher != null)
        {
            removeTextChangedListener(textWatcher);
        }
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag)
        {
            showValidationMessage();
        }
    }

    protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        super.onTextChanged(charsequence, i, j, k);
        resetValidationError();
    }

    public void requestFocusAndMoverCursor()
    {
        requestFocus();
        setSelection(getText().length());
    }

    public void resetValidationError()
    {
        validationErrorMessage = null;
        showValidationMessage();
        refreshDrawableState();
    }

    public void setTextAndMoveCursor(String s)
    {
        EditTextUtils.setTextAndMoveCursor(this, s);
    }

    public void setValidationErrorId(Integer integer)
    {
        if (integer == null)
        {
            setValidationErrorMessage("");
            return;
        } else
        {
            setValidationErrorMessage(context.getString(integer.intValue()));
            return;
        }
    }

    public void setValidationMessageView(TextView textview)
    {
        validationMessageView = textview;
        originalValidationViewMessage = textview.getText().toString();
        originalValidationViewColor = textview.getCurrentTextColor();
        originalHintTextColor = getCurrentHintTextColor();
    }

    public void showValidationMessage()
    {
label0:
        {
            if (validationMessageView != null)
            {
                if (validationErrorMessage == null)
                {
                    break label0;
                }
                int i = getContext().getResources().getColor(0x7f0c008f);
                setHintTextColor(i);
                validationMessageView.setText(validationErrorMessage);
                validationMessageView.setTextColor(i);
            }
            return;
        }
        setHintTextColor(originalHintTextColor);
        validationMessageView.setText(originalValidationViewMessage);
        validationMessageView.setTextColor(originalValidationViewColor);
    }



    private class MaxLinesTextWatcher extends SimpleTextWatcher
    {

        private int beforeCursorPosition;
        private String text;
        final AdvancedEditText this$0;

        public void afterTextChanged(Editable editable)
        {
            removeTextChangedListener(this);
            if (getLineCount() > maxInputLines)
            {
                setText(text);
                setSelection(beforeCursorPosition);
            }
            addTextChangedListener(this);
        }

        public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
        {
            text = charsequence.toString();
            beforeCursorPosition = i;
        }

        public MaxLinesTextWatcher()
        {
            this$0 = AdvancedEditText.this;
            super();
            beforeCursorPosition = 0;
        }
    }


    private class CustomInputConnectionWrapper extends InputConnectionWrapper
    {

        final AdvancedEditText this$0;

        public boolean deleteSurroundingText(int i, int j)
        {
            boolean flag = super.deleteSurroundingText(i, j);
            if (flag && isCursorAtStart())
            {
                sendKeyEvent(new KeyEvent(0, 67));
            }
            return flag;
        }

        public CustomInputConnectionWrapper(InputConnection inputconnection, boolean flag)
        {
            this$0 = AdvancedEditText.this;
            super(inputconnection, flag);
        }
    }

}
