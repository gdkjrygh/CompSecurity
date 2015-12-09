// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.text.clearable;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

public class ClearableEditText extends LinearLayout
{

    private final ImageButton clearButton;
    private final EditText editText;

    public ClearableEditText(Context context)
    {
        this(context, null, 0);
    }

    public ClearableEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ClearableEditText(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.google.android.apps.walletnfcrel.R.layout.clearable_edit_text, this, true);
        editText = (EditText)findViewById(com.google.android.apps.walletnfcrel.R.id.field_edit);
        clearButton = (ImageButton)findViewById(com.google.android.apps.walletnfcrel.R.id.field_clear);
        initStyle(context, attributeset);
        clearButton.setVisibility(8);
        editText.addTextChangedListener(new DefaultTextWatcher() {

            final ClearableEditText this$0;

            public final void afterTextChanged(Editable editable)
            {
                ImageButton imagebutton = clearButton;
                int j;
                if (editable.length() > 0)
                {
                    j = 0;
                } else
                {
                    j = 8;
                }
                imagebutton.setVisibility(j);
            }

            
            {
                this$0 = ClearableEditText.this;
                super();
            }
        });
        clearButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ClearableEditText this$0;

            public final void onClick(View view)
            {
                editText.setText("");
                editText.clearComposingText();
                editText.requestFocus();
            }

            
            {
                this$0 = ClearableEditText.this;
                super();
            }
        });
    }

    private void initStyle(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText);
        if (context.hasValue(com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText_hint))
        {
            editText.setHint(context.getString(com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText_hint));
        }
        if (context.hasValue(com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText_android_inputType))
        {
            int i = context.getInt(com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText_android_inputType, 1);
            editText.setInputType(i);
        }
        int j = context.getInt(com.google.android.apps.walletnfcrel.R.styleable.ClearableEditText_android_imeOptions, -1);
        if (j != -1)
        {
            editText.setImeOptions(j);
        }
        context.recycle();
    }

    public final void addTextChangedListener(TextWatcher textwatcher)
    {
        editText.addTextChangedListener(textwatcher);
    }

    public final EditText getEditText()
    {
        return editText;
    }

    public final Editable getText()
    {
        return editText.getText();
    }

    public void setFocusable(boolean flag)
    {
        editText.setFocusable(flag);
    }

    public void setFocusableInTouchMode(boolean flag)
    {
        editText.setFocusableInTouchMode(flag);
    }

    public void setHint(int i)
    {
        editText.setHint(i);
    }

    public void setHint(CharSequence charsequence)
    {
        editText.setHint(charsequence);
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener oneditoractionlistener)
    {
        editText.setOnEditorActionListener(oneditoractionlistener);
    }

    public void setSelection(int i)
    {
        editText.setSelection(i);
    }

    public void setText(int i)
    {
        editText.setText(i);
    }

    public void setText(CharSequence charsequence)
    {
        editText.setText(charsequence);
    }


}
