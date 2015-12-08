// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.text.Editable;
import android.widget.EditText;

public class EditTextUtils
{

    public EditTextUtils()
    {
    }

    public static void setTextAndMoveCursor(EditText edittext, String s)
    {
        edittext.setText(s);
        edittext.setSelection(edittext.getText().length());
    }
}
