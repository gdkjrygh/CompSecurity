// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.model;

import android.widget.EditText;

public class EditTextModel
{

    private EditText editText;
    private int maxLength;

    public EditTextModel(EditText edittext, int i)
    {
        editText = edittext;
        maxLength = i;
    }

    public EditText getEditText()
    {
        return editText;
    }

    public int getMaxLength()
    {
        return maxLength;
    }
}
