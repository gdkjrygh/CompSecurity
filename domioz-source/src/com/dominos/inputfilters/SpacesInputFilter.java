// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.inputfilters;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import com.dominos.App;

public class SpacesInputFilter
    implements InputFilter
{

    Context context;

    public SpacesInputFilter(Context context1)
    {
        context = context1;
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        for (; i < j; i++)
        {
            if (Character.isWhitespace(charsequence.charAt(i)))
            {
                App.displayWarningToast(context.getString(0x7f0802b5), context);
                return "";
            }
        }

        return null;
    }
}
