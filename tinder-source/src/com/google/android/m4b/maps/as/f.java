// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.as;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class f
{

    private static final Set a;

    public static String a(String s)
    {
        StringBuilder stringbuilder = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L5:
        return s;
_L2:
        int i;
        int j;
        j = s.length();
        i = 0;
_L3:
        StringBuilder stringbuilder1;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        int k = s.codePointAt(i);
        boolean flag;
        if (k >= 0 && k <= 127)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            stringbuilder1 = stringbuilder;
            if (stringbuilder == null)
            {
                break MISSING_BLOCK_LABEL_185;
            }
            stringbuilder.append((char)k);
        } else
        {
            Object obj = Character.UnicodeBlock.of(k);
            if (!a.contains(obj))
            {
                obj = stringbuilder;
                if (stringbuilder == null)
                {
                    obj = new StringBuilder();
                    ((StringBuilder) (obj)).append(s.substring(0, i));
                }
                ((StringBuilder) (obj)).append(' ');
            } else
            {
                obj = stringbuilder;
                if (stringbuilder != null)
                {
                    stringbuilder.append(Character.toChars(k));
                    obj = stringbuilder;
                }
            }
            stringbuilder1 = ((StringBuilder) (obj));
            if (!Character.isSupplementaryCodePoint(k))
            {
                break MISSING_BLOCK_LABEL_185;
            }
            stringbuilder = ((StringBuilder) (obj));
            i++;
        }
_L6:
        i++;
          goto _L3
        if (stringbuilder == null) goto _L5; else goto _L4
_L4:
        return stringbuilder.toString();
        stringbuilder = stringbuilder1;
          goto _L6
    }

    static 
    {
        HashSet hashset = new HashSet();
        hashset.add(Character.UnicodeBlock.ARABIC);
        hashset.add(Character.UnicodeBlock.BASIC_LATIN);
        hashset.add(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
        hashset.add(Character.UnicodeBlock.CYRILLIC);
        hashset.add(Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS);
        hashset.add(Character.UnicodeBlock.GENERAL_PUNCTUATION);
        hashset.add(Character.UnicodeBlock.GEOMETRIC_SHAPES);
        hashset.add(Character.UnicodeBlock.GREEK);
        hashset.add(Character.UnicodeBlock.HEBREW);
        hashset.add(Character.UnicodeBlock.IPA_EXTENSIONS);
        hashset.add(Character.UnicodeBlock.LATIN_EXTENDED_A);
        hashset.add(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL);
        hashset.add(Character.UnicodeBlock.LATIN_EXTENDED_B);
        hashset.add(Character.UnicodeBlock.LATIN_1_SUPPLEMENT);
        hashset.add(Character.UnicodeBlock.LETTERLIKE_SYMBOLS);
        hashset.add(Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS);
        hashset.add(Character.UnicodeBlock.NUMBER_FORMS);
        hashset.add(Character.UnicodeBlock.SPACING_MODIFIER_LETTERS);
        hashset.add(Character.UnicodeBlock.THAI);
        hashset.add(Character.UnicodeBlock.HANGUL_JAMO);
        hashset.add(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT);
        hashset.add(Character.UnicodeBlock.KANGXI_RADICALS);
        hashset.add(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        hashset.add(Character.UnicodeBlock.HIRAGANA);
        hashset.add(Character.UnicodeBlock.KATAKANA);
        hashset.add(Character.UnicodeBlock.BOPOMOFO);
        hashset.add(Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO);
        hashset.add(Character.UnicodeBlock.KANBUN);
        hashset.add(Character.UnicodeBlock.BOPOMOFO_EXTENDED);
        hashset.add(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS);
        hashset.add(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS);
        hashset.add(Character.UnicodeBlock.CJK_COMPATIBILITY);
        hashset.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A);
        hashset.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
        hashset.add(Character.UnicodeBlock.HANGUL_SYLLABLES);
        hashset.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS);
        hashset.add(Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS);
        hashset.add(Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS);
        hashset.add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B);
        hashset.add(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
        a = Collections.unmodifiableSet(hashset);
    }
}
