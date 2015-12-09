// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.text.InputFilter;
import android.text.Spanned;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

// Referenced classes of package com.fitbit.ui:
//            DecimalEditText

public class a
    implements InputFilter
{

    final DecimalEditText a;

    private CharSequence a(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (a.h)
        {
            return charsequence;
        }
        if (String.valueOf(charsequence.subSequence(i, j)).length() == 0 && k - l != 0)
        {
            return spanned.subSequence(k, l);
        } else
        {
            return "";
        }
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        if (!a.g && !a.h) goto _L2; else goto _L1
_L1:
        return charsequence;
_L2:
        char c;
        String s;
        s = String.valueOf(charsequence.subSequence(i, j));
        s = (new StringBuilder()).append(String.valueOf(spanned.subSequence(0, k))).append(s).append(spanned.subSequence(l, spanned.length())).toString();
        c = a.d.getDecimalFormatSymbols().getDecimalSeparator();
        s = s.replace(String.valueOf(a.d.getDecimalFormatSymbols().getGroupingSeparator()), "");
        if (s.length() != 0) goto _L4; else goto _L3
_L3:
        double d = 0.0D;
_L6:
        if (d > a.f())
        {
            return a(charsequence, i, j, spanned, k, l);
        }
        break; /* Loop/switch isn't completed */
_L4:
        d = a.d.parse(s).doubleValue();
        if (true) goto _L6; else goto _L5
_L5:
        Object obj = DecimalEditText.a(s, c);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).length() <= a.g())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = a(charsequence, i, j, spanned, k, l);
        return ((CharSequence) (obj));
        ParseException parseexception;
        parseexception;
        if (!s.equals(String.valueOf(c)))
        {
            return a(charsequence, i, j, spanned, k, l);
        }
        if (true) goto _L1; else goto _L7
_L7:
    }

    public (DecimalEditText decimaledittext)
    {
        a = decimaledittext;
        super();
    }
}
