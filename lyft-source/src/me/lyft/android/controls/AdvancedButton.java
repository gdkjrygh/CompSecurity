// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.controls:
//            ViewWithErrorState

public class AdvancedButton extends TextView
    implements ViewWithErrorState
{

    private static final int STATE_ERROR[] = {
        0x7f01000f
    };
    private final Context context;
    private int originalAdvancedGreyButtonTextColor;
    private String validationErrorMessage;
    private TextView validationMessageView;

    public AdvancedButton(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        context = context1;
        originalAdvancedGreyButtonTextColor = getCurrentTextColor();
    }

    private void setValidationErrorMessage(String s)
    {
        validationErrorMessage = s;
        showValidationMessage();
        refreshDrawableState();
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

    public void resetValidationError()
    {
        validationErrorMessage = null;
        validationMessageView.setVisibility(8);
        setTextColor(originalAdvancedGreyButtonTextColor);
        refreshDrawableState();
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
        textview = textview.getText().toString().trim();
        if (!Strings.isNullOrEmpty(textview))
        {
            setValidationErrorMessage(textview);
        }
    }

    public void showValidationMessage()
    {
        if (validationMessageView != null && validationErrorMessage != null)
        {
            validationMessageView.setVisibility(0);
            validationMessageView.setText(validationErrorMessage);
            setTextColor(getResources().getColor(0x7f0c008f));
        }
    }

}
