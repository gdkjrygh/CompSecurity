// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;
import java.text.DecimalFormatSymbols;

public class c extends DigitsKeyListener
{

    DecimalFormatSymbols a;
    private final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        ',', '.'
    };

    public c()
    {
        a = new DecimalFormatSymbols();
    }

    private boolean a(char c1)
    {
        return c1 == ',' || c1 == '.';
    }

    public CharSequence filter(CharSequence charsequence, int i, int j, Spanned spanned, int k, int l)
    {
        CharSequence charsequence1;
        CharSequence charsequence2;
        int i1;
        int j1;
        int k1;
        int j2;
        charsequence2 = super.filter(charsequence, i, j, spanned, k, l);
        charsequence1 = charsequence;
        j1 = i;
        k1 = j;
        if (charsequence2 != null)
        {
            j1 = 0;
            k1 = charsequence2.length();
            charsequence1 = charsequence2;
        }
        j = -1;
        i1 = -1;
        j2 = spanned.length();
        i = 0;
        while (i < k) 
        {
            char c1 = spanned.charAt(i);
            int l1;
            if (c1 == '-')
            {
                l1 = i;
            } else
            {
                l1 = j;
                if (a(c1))
                {
                    i1 = i;
                    l1 = j;
                }
            }
            i++;
            j = l1;
        }
        i = l;
_L5:
        if (i >= j2) goto _L2; else goto _L1
_L1:
        char c2 = spanned.charAt(i);
        if (c2 != '-') goto _L4; else goto _L3
_L3:
        spanned = "";
_L6:
        return spanned;
_L4:
        if (a(c2))
        {
            i1 = i;
        }
        i++;
          goto _L5
_L2:
        i = k1 - 1;
        int i2 = i1;
        charsequence = null;
        i1 = j;
        while (i >= j1) 
        {
            char c3 = charsequence1.charAt(i);
            boolean flag2 = false;
            boolean flag1 = false;
            boolean flag;
            int k2;
            if (c3 == '-')
            {
                if (i != j1 || k != 0)
                {
                    j = 1;
                    k2 = i1;
                    l = i2;
                    flag = flag1;
                } else
                if (i1 >= 0)
                {
                    j = 1;
                    flag = flag1;
                    l = i2;
                    k2 = i1;
                } else
                {
                    k2 = i;
                    flag = flag1;
                    j = ((flag2) ? 1 : 0);
                    l = i2;
                }
            } else
            {
                flag = flag1;
                j = ((flag2) ? 1 : 0);
                l = i2;
                k2 = i1;
                if (a(c3))
                {
                    if (i2 >= 0)
                    {
                        j = 1;
                        flag = flag1;
                        l = i2;
                        k2 = i1;
                    } else
                    if (c3 != a.getDecimalSeparator())
                    {
                        flag = true;
                        l = i;
                        j = ((flag2) ? 1 : 0);
                        k2 = i1;
                    } else
                    {
                        l = i;
                        flag = flag1;
                        j = ((flag2) ? 1 : 0);
                        k2 = i1;
                    }
                }
            }
            spanned = charsequence;
            if (j != 0)
            {
                if (k1 == j1 + 1)
                {
                    return "";
                }
                spanned = charsequence;
                if (charsequence == null)
                {
                    spanned = new SpannableStringBuilder(charsequence1, j1, k1);
                }
                spanned.delete(i - j1, (i + 1) - j1);
            }
            charsequence = spanned;
            if (flag)
            {
                charsequence = spanned;
                if (spanned == null)
                {
                    charsequence = new SpannableStringBuilder(charsequence1, j1, k1);
                }
                charsequence.replace(i - j1, (i + 1) - j1, Character.toString(a.getDecimalSeparator()));
            }
            i--;
            i2 = l;
            i1 = k2;
        }
        spanned = charsequence;
        if (charsequence == null)
        {
            if (charsequence2 != null)
            {
                return charsequence2;
            } else
            {
                return null;
            }
        }
          goto _L6
    }

    protected char[] getAcceptedChars()
    {
        return b;
    }

    public int getInputType()
    {
        return 8194;
    }
}
