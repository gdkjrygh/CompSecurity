// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.atmention;

import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

class <init>
    implements android.widget.onTokenizer
{

    public int findTokenEnd(CharSequence charsequence, int i)
    {
        int j;
        for (j = charsequence.length(); i < j; i++)
        {
            if (charsequence.charAt(i) == ' ')
            {
                return i;
            }
        }

        return j;
    }

    public int findTokenStart(CharSequence charsequence, int i)
    {
        if (charsequence.length() != 0)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        i = 0;
_L4:
        return i;
_L2:
        int j;
        j--;
_L5:
        if (j <= 0 || charsequence.charAt(j - 1) == '@')
        {
            continue; /* Loop/switch isn't completed */
        }
        if (charsequence.charAt(j - 1) != ' ') goto _L2; else goto _L1
_L1:
        return i;
        if (j == 0 && charsequence.charAt(0) != '@') goto _L4; else goto _L3
_L3:
        return j;
        j = i;
          goto _L5
    }

    public CharSequence terminateToken(CharSequence charsequence)
    {
        int i;
        for (i = charsequence.length(); i > 0 && charsequence.charAt(i - 1) == ' '; i--) { }
        if (i > 0 && charsequence.charAt(i - 1) == '@')
        {
            return charsequence;
        }
        Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION, ComponentType.MODAL_DIALOG);
        if (charsequence instanceof Spanned)
        {
            SpannableString spannablestring = new SpannableString((new StringBuilder()).append(charsequence).append(" ").toString());
            TextUtils.copySpansFrom((Spanned)charsequence, 0, charsequence.length(), java/lang/Object, spannablestring, 0);
            return spannablestring;
        } else
        {
            return (new StringBuilder()).append(charsequence).append(" ").toString();
        }
    }

    private I()
    {
    }

    I(I i)
    {
        this();
    }
}
