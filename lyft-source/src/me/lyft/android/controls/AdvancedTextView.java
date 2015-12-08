// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.controls:
//            ViewWithErrorState

public class AdvancedTextView extends TextView
    implements ViewWithErrorState
{

    private static final int STATE_ERROR[] = {
        0x7f01000f
    };
    private final Context context;
    private int originalValidationViewColor;
    private String originalValidationViewMessage;
    private String validationErrorMessage;
    private TextView validationMessageView;

    public AdvancedTextView(Context context1)
    {
        super(context1);
        context = context1;
    }

    public AdvancedTextView(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        context = context1;
    }

    public AdvancedTextView(Context context1, AttributeSet attributeset, int i)
    {
        super(context1, attributeset, i);
        context = context1;
    }

    public boolean hasValidationError()
    {
        return validationErrorMessage != null;
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
        validationErrorMessage = null;
        showValidationMessage();
        refreshDrawableState();
    }

    public void setValidationErrorId(Integer integer)
    {
        if (integer == null)
        {
            setValidationErrorMessage(null);
            return;
        } else
        {
            setValidationErrorMessage(context.getString(integer.intValue()));
            return;
        }
    }

    public void setValidationErrorMessage(String s)
    {
        validationErrorMessage = s;
        if (hasFocus())
        {
            showValidationMessage();
        }
        refreshDrawableState();
    }

    public void setValidationMessageView(TextView textview)
    {
        validationMessageView = textview;
        originalValidationViewMessage = textview.getText().toString();
        originalValidationViewColor = textview.getCurrentTextColor();
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
                validationMessageView.setText(validationErrorMessage);
                validationMessageView.setTextColor(getContext().getResources().getColor(0x7f0c008f));
            }
            return;
        }
        validationMessageView.setText(originalValidationViewMessage);
        validationMessageView.setTextColor(originalValidationViewColor);
    }

}
