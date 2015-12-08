// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            lk

public class aq
{

    private static boolean a(Character.UnicodeBlock unicodeblock)
    {
        return unicodeblock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || unicodeblock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || unicodeblock == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || unicodeblock == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || unicodeblock == Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT || unicodeblock == Character.UnicodeBlock.CJK_COMPATIBILITY || unicodeblock == Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS || unicodeblock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || unicodeblock == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || unicodeblock == Character.UnicodeBlock.BOPOMOFO || unicodeblock == Character.UnicodeBlock.HIRAGANA || unicodeblock == Character.UnicodeBlock.KATAKANA || unicodeblock == Character.UnicodeBlock.HANGUL_SYLLABLES || unicodeblock == Character.UnicodeBlock.HANGUL_JAMO;
    }

    static boolean d(int i)
    {
        return Character.isLetter(i) && a(Character.UnicodeBlock.of(i));
    }

    public static int o(String s)
    {
        byte abyte0[] = s.getBytes("UTF-8");
        s = abyte0;
_L2:
        return lk.a(s, 0, s.length, 0);
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        s = s.getBytes();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String[] p(String s)
    {
        if (s == null)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        char ac[] = s.toCharArray();
        int j1 = s.length();
        int j = 0;
        int i = 0;
        int k = 0;
        while (k < j1) 
        {
            int l = Character.codePointAt(ac, k);
            int k1 = Character.charCount(l);
            if (d(l))
            {
                if (j != 0)
                {
                    arraylist.add(new String(ac, i, k - i));
                }
                arraylist.add(new String(ac, k, k1));
                l = 0;
                j = i;
                i = l;
            } else
            if (Character.isLetterOrDigit(l))
            {
                if (j == 0)
                {
                    i = k;
                }
                j = i;
                i = 1;
            } else
            if (j != 0)
            {
                arraylist.add(new String(ac, i, k - i));
                j = i;
                i = 0;
            } else
            {
                int i1 = i;
                i = j;
                j = i1;
            }
            l = k + k1;
            k = j;
            j = i;
            i = k;
            k = l;
        }
        if (j != 0)
        {
            arraylist.add(new String(ac, i, k - i));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }
}
