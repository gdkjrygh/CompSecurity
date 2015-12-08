// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.inputfilters;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import com.dominos.App;

public class NameInputFilter
    implements InputFilter
{

    private static final char DASH = 45;
    private static final char DOT = 46;
    private Context mContext;

    public NameInputFilter(Context context)
    {
        mContext = context;
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        for (; i < j; i++)
        {
            char c = charsequence.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c) && c != '-' && c != '.')
            {
                App.displayWarningToast(mContext.getString(0x7f0801f3), mContext);
                return "";
            }
        }

        return null;
    }
}
