// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.NumberKeyListener;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class nit> extends NumberKeyListener
{

    private NumberPicker a;

    public final CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        CharSequence charsequence1;
        if (NumberPicker.c(a) != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        CharSequence charsequence2 = super.filter(charsequence, i, j, spanned, k, l);
        charsequence1 = charsequence2;
        if (charsequence2 == null)
        {
            charsequence1 = charsequence.subSequence(i, j);
        }
        charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(charsequence1).append(spanned.subSequence(l, spanned.length())).toString();
        if (!"".equals(charsequence)) goto _L2; else goto _L1
_L1:
        charsequence1 = charsequence;
_L4:
        return charsequence1;
_L2:
        if (NumberPicker.a(a, charsequence) <= NumberPicker.d(a)) goto _L4; else goto _L3
_L3:
        return "";
        charsequence = String.valueOf(charsequence.subSequence(i, j));
        if (TextUtils.isEmpty(charsequence))
        {
            return "";
        }
        charsequence = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(charsequence).append(spanned.subSequence(l, spanned.length())).toString();
        spanned = String.valueOf(charsequence).toLowerCase();
        String as[] = NumberPicker.c(a);
        j = as.length;
        for (i = 0; i < j; i++)
        {
            String s = as[i];
            if (s.toLowerCase().startsWith(spanned))
            {
                NumberPicker.a(a, charsequence.length(), s.length());
                return s.subSequence(k, s.length());
            }
        }

        return "";
    }

    protected final char[] getAcceptedChars()
    {
        return NumberPicker.a();
    }

    public final int getInputType()
    {
        return 1;
    }

    (NumberPicker numberpicker)
    {
        a = numberpicker;
        super();
    }
}
