// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public final class ci
{

    public static int a(String s)
    {
        int i1;
        boolean flag;
        i1 = 0;
        flag = false;
        byte abyte0[] = s.getBytes("UTF-8");
        s = abyte0;
_L2:
        int i;
        int j1;
        int k1;
        j1 = s.length;
        k1 = (j1 & -4) + 0;
        int j = 0;
        for (i = 0; j < k1; i = 0xe6546b64 + (i >>> 19 | i << 13) * 5)
        {
            int l1 = (s[j] & 0xff | (s[j + 1] & 0xff) << 8 | (s[j + 2] & 0xff) << 16 | s[j + 3] << 24) * 0xcc9e2d51;
            i ^= (l1 >>> 17 | l1 << 15) * 0x1b873593;
            j += 4;
        }

        break; /* Loop/switch isn't completed */
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        s = s.getBytes();
        if (true) goto _L2; else goto _L1
_L1:
        int k = ((flag) ? 1 : 0);
        j1 & 3;
        JVM INSTR tableswitch 1 3: default 168
    //                   1 231
    //                   2 214
    //                   3 200;
           goto _L3 _L4 _L5 _L6
_L3:
        i ^= j1;
        i = (i ^ i >>> 16) * 0x85ebca6b;
        i = (i ^ i >>> 13) * 0xc2b2ae35;
        return i ^ i >>> 16;
_L6:
        k = (s[k1 + 2] & 0xff) << 16;
_L5:
        i1 = k | (s[k1 + 1] & 0xff) << 8;
_L4:
        int l = (s[k1] & 0xff | i1) * 0xcc9e2d51;
        i = (l >>> 17 | l << 15) * 0x1b873593 ^ i;
        if (true) goto _L3; else goto _L7
_L7:
    }

    public static String[] b(String s)
    {
        ArrayList arraylist;
        char ac[];
        int i;
        int j;
        int k;
        int j1;
        if (s == null)
        {
            return null;
        }
        arraylist = new ArrayList();
        ac = s.toCharArray();
        j1 = s.length();
        j = 0;
        i = 0;
        k = 0;
_L3:
        int l;
        int l1;
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_385;
        }
        l1 = Character.codePointAt(ac, k);
        int k1 = Character.charCount(l1);
        if (!Character.isLetter(l1))
        {
            break MISSING_BLOCK_LABEL_304;
        }
        s = Character.UnicodeBlock.of(l1);
        if (s == Character.UnicodeBlock.BOPOMOFO || s == Character.UnicodeBlock.BOPOMOFO_EXTENDED || s == Character.UnicodeBlock.CJK_COMPATIBILITY || s == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || s == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || s == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || s == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || s == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || s == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || s == Character.UnicodeBlock.HANGUL_JAMO || s == Character.UnicodeBlock.HANGUL_SYLLABLES || s == Character.UnicodeBlock.HIRAGANA || s == Character.UnicodeBlock.KATAKANA || s == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (l == 0)
        {
            if (l1 >= 65382 && l1 <= 65437 || l1 >= 65441 && l1 <= 65500)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_304;
            }
        }
        l = 1;
_L1:
        if (l != 0)
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
        if (Character.isLetterOrDigit(l1) || Character.getType(l1) == 6 || Character.getType(l1) == 8)
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
        continue; /* Loop/switch isn't completed */
        l = 0;
          goto _L1
        if (j != 0)
        {
            arraylist.add(new String(ac, i, k - i));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
        if (true) goto _L3; else goto _L2
_L2:
    }
}
