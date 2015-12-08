// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

final class iql
    implements InputFilter
{

    iql()
    {
    }

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        for (k = i; k < j; k++)
        {
            if (charsequence.charAt(k) == '\n')
            {
                spanned = new char[j - i];
                TextUtils.getChars(charsequence, i, j, spanned, 0);
                spanned = (new String(spanned)).replace('\n', ' ');
                if (charsequence instanceof Spanned)
                {
                    spanned = new SpannableString(spanned);
                    TextUtils.copySpansFrom((Spanned)charsequence, i, j, null, spanned, 0);
                    return spanned;
                } else
                {
                    return spanned;
                }
            }
        }

        return null;
    }
}
