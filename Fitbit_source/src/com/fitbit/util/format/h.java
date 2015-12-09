// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class h
{

    public static final char a = 39;
    public static final char b = 97;
    public static final char c = 65;
    public static final char d = 100;
    public static final char e = 69;
    public static final char f = 104;
    public static final char g = 107;
    public static final char h = 109;
    public static final char i = 77;
    public static final char j = 76;
    public static final char k = 115;
    public static final char l = 122;
    public static final char m = 121;

    public h()
    {
    }

    private static int a(SpannableStringBuilder spannablestringbuilder, int i1, int j1)
    {
        if (i1 + 1 >= j1 || spannablestringbuilder.charAt(i1 + 1) != '\'') goto _L2; else goto _L1
_L1:
        int l1;
        spannablestringbuilder.delete(i1, i1 + 1);
        l1 = 1;
_L4:
        return l1;
_L2:
        int k1;
        l1 = 0;
        spannablestringbuilder.delete(i1, i1 + 1);
        j1--;
        k1 = i1;
        i1 = l1;
_L7:
        l1 = i1;
        if (k1 >= j1) goto _L4; else goto _L3
_L3:
        if (spannablestringbuilder.charAt(k1) != '\'')
        {
            break MISSING_BLOCK_LABEL_139;
        }
        if (k1 + 1 >= j1 || spannablestringbuilder.charAt(k1 + 1) != '\'') goto _L6; else goto _L5
_L5:
        spannablestringbuilder.delete(k1, k1 + 1);
        int i2 = j1 - 1;
        i1++;
        j1 = k1 + 1;
        k1 = i2;
_L8:
        int j2 = j1;
        j1 = k1;
        k1 = j2;
          goto _L7
_L6:
        spannablestringbuilder.delete(k1, k1 + 1);
        return i1;
        int k2 = k1 + 1;
        i1++;
        k1 = j1;
        j1 = k2;
          goto _L8
    }

    public static CharSequence a(CharSequence charsequence, Calendar calendar, Locale locale)
    {
        SpannableStringBuilder spannablestringbuilder;
        DateFormatSymbols dateformatsymbols;
        int i1;
        int k1;
        spannablestringbuilder = new SpannableStringBuilder(charsequence);
        dateformatsymbols = DateFormatSymbols.getInstance(locale);
        i1 = charsequence.length();
        k1 = 0;
_L2:
        int j1;
        char c1;
        if (k1 >= i1)
        {
            break MISSING_BLOCK_LABEL_484;
        }
        j1 = 1;
        c1 = spannablestringbuilder.charAt(k1);
        if (c1 != '\'')
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = a(spannablestringbuilder, k1, i1);
        i1 = spannablestringbuilder.length();
_L14:
        k1 = j1 + k1;
        if (true) goto _L2; else goto _L1
_L1:
        for (; k1 + j1 < i1 && spannablestringbuilder.charAt(k1 + j1) == c1; j1++) { }
        c1;
        JVM INSTR lookupswitch 12: default 224
    //                   65: 260
    //                   69: 291
    //                   76: 389
    //                   77: 389
    //                   97: 260
    //                   100: 276
    //                   104: 324
    //                   107: 357
    //                   109: 373
    //                   115: 446
    //                   121: 473
    //                   122: 462;
           goto _L3 _L4 _L5 _L6 _L6 _L4 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L12:
        break MISSING_BLOCK_LABEL_473;
_L3:
        Object obj = null;
_L15:
        if (obj != null)
        {
            spannablestringbuilder.replace(k1, k1 + j1, ((CharSequence) (obj)));
            j1 = ((String) (obj)).length();
            i1 = spannablestringbuilder.length();
        }
          goto _L14
_L4:
        obj = dateformatsymbols.getAmPmStrings()[calendar.get(9)];
          goto _L15
_L7:
        obj = b(locale, calendar.get(5), j1);
          goto _L15
_L5:
        if (j1 < 4)
        {
            obj = dateformatsymbols.getShortWeekdays();
        } else
        {
            obj = dateformatsymbols.getWeekdays();
        }
        obj = obj[calendar.get(7)];
          goto _L15
_L8:
        int j2 = calendar.get(10);
        int l1 = j2;
        if (j2 == 0)
        {
            l1 = 12;
        }
        obj = b(locale, l1, j1);
          goto _L15
_L9:
        obj = b(locale, calendar.get(11), j1);
          goto _L15
_L10:
        obj = b(locale, calendar.get(12), j1);
          goto _L15
_L6:
        int i2 = calendar.get(2);
        if (j1 >= 4)
        {
            obj = dateformatsymbols.getMonths()[i2];
        } else
        if (j1 == 3)
        {
            obj = dateformatsymbols.getShortMonths()[i2];
        } else
        {
            obj = b(locale, i2 + 1, j1);
        }
          goto _L15
_L11:
        obj = b(locale, calendar.get(13), j1);
          goto _L15
_L13:
        obj = b(locale, calendar, j1);
          goto _L15
        obj = a(locale, calendar, j1);
          goto _L15
        if (charsequence instanceof Spanned)
        {
            return new SpannedString(spannablestringbuilder);
        }
        return spannablestringbuilder.toString();
          goto _L14
    }

    private static String a(Locale locale, int i1, int j1)
    {
        i1 /= 1000;
        StringBuilder stringbuilder = new StringBuilder();
        if (i1 < 0)
        {
            stringbuilder.insert(0, "-");
            i1 = -i1;
        } else
        {
            stringbuilder.insert(0, "+");
        }
        j1 = i1 / 3600;
        i1 = (i1 % 3600) / 60;
        stringbuilder.append(b(locale, j1, 2));
        stringbuilder.append(b(locale, i1, 2));
        return stringbuilder.toString();
    }

    private static String a(Locale locale, Calendar calendar, int i1)
    {
        int j1 = calendar.get(1);
        if (i1 <= 2)
        {
            return b(locale, j1 % 100, 2);
        } else
        {
            return String.format(Locale.getDefault(), "%d", new Object[] {
                Integer.valueOf(j1)
            });
        }
    }

    private static String b(Locale locale, int i1, int j1)
    {
        return String.format(locale, (new StringBuilder()).append("%0").append(j1).append("d").toString(), new Object[] {
            Integer.valueOf(i1)
        });
    }

    private static String b(Locale locale, Calendar calendar, int i1)
    {
        TimeZone timezone = calendar.getTimeZone();
        if (i1 < 2)
        {
            return a(locale, calendar.get(16) + calendar.get(15), i1);
        }
        boolean flag;
        if (calendar.get(16) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return timezone.getDisplayName(flag, 0, locale);
    }
}
