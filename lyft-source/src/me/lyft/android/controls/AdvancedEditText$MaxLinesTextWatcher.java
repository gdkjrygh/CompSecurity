// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.text.Editable;

// Referenced classes of package me.lyft.android.controls:
//            SimpleTextWatcher, AdvancedEditText

public class beforeCursorPosition extends SimpleTextWatcher
{

    private int beforeCursorPosition;
    private String text;
    final AdvancedEditText this$0;

    public void afterTextChanged(Editable editable)
    {
        removeTextChangedListener(this);
        if (getLineCount() > AdvancedEditText.access$000(AdvancedEditText.this))
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

    public ()
    {
        this$0 = AdvancedEditText.this;
        super();
        beforeCursorPosition = 0;
    }
}
