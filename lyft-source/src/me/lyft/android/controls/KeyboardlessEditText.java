// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

// Referenced classes of package me.lyft.android.controls:
//            AdvancedEditText

public class KeyboardlessEditText extends AdvancedEditText
    implements NumericKeyboard.KeyPressListener
{

    private final InputMethodManager inputMethodManager;
    private boolean keyboardEnabled;

    public KeyboardlessEditText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        keyboardEnabled = false;
        inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
    }

    private void hideKeyboard()
    {
        android.os.IBinder ibinder = getApplicationWindowToken();
        if (inputMethodManager != null && ibinder != null)
        {
            inputMethodManager.hideSoftInputFromWindow(ibinder, 0);
        }
    }

    public void disableKeyboard()
    {
        keyboardEnabled = false;
    }

    public void enableKeyboard()
    {
        keyboardEnabled = true;
    }

    public void onDelLongPressed()
    {
        setText("");
    }

    public void onKeyPressed(KeyEvent keyevent)
    {
        dispatchKeyEvent(keyevent);
    }

    protected void onSelectionChanged(int i, int j)
    {
        if (keyboardEnabled)
        {
            super.onSelectionChanged(i, j);
            return;
        } else
        {
            hideKeyboard();
            clearComposingText();
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (keyboardEnabled)
        {
            return super.onTouchEvent(motionevent);
        }
        boolean flag = hasFocus();
        boolean flag1 = super.onTouchEvent(motionevent);
        if (!flag)
        {
            setSelection(getText().length());
        }
        hideKeyboard();
        return flag1;
    }
}
