// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

final class SocialSecurityFormattingTextWatcher
    implements TextWatcher
{

    private boolean isDelete;
    private boolean selfChange;

    SocialSecurityFormattingTextWatcher()
    {
        selfChange = false;
        isDelete = false;
    }

    private static String reformat(CharSequence charsequence)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < charsequence.length() && stringbuilder.length() < 11; i++)
        {
            char c = charsequence.charAt(i);
            if (!Character.isDigit(c))
            {
                continue;
            }
            if ("NNN-NN-NNNN".charAt(stringbuilder.length()) == '-')
            {
                stringbuilder.append('-');
            }
            stringbuilder.append(c);
        }

        if (stringbuilder.length() < 11 && "NNN-NN-NNNN".charAt(stringbuilder.length()) == '-')
        {
            stringbuilder.append('-');
        }
        return stringbuilder.toString();
    }

    public final void afterTextChanged(Editable editable)
    {
        if (selfChange)
        {
            return;
        }
        selfChange = true;
        int i = Selection.getSelectionEnd(editable);
        int j = editable.length();
        editable.replace(0, editable.length(), reformat(editable));
        if (isDelete && j < editable.length() && i != -1)
        {
            Selection.setSelection(editable, i);
        }
        selfChange = false;
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (selfChange)
        {
            return;
        }
        boolean flag;
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isDelete = flag;
    }
}
