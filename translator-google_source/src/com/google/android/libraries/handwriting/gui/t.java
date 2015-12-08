// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class t
{

    public static final Character.UnicodeBlock a[];
    private static final int b[] = {
        6, 2, 5, 1, 3, 0, 4
    };

    public static RecognitionResult a(RecognitionResult recognitionresult, int i)
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_3;
        if (recognitionresult != RecognitionResult.i && (i & 0xf & 2) != 0)
        {
            int j = 0xfff000 & i;
            ArrayList arraylist;
            Object obj;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if ((j & 0x1000) == 4096 && recognitionresult.j.getPreContext().isEmpty())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((j & 0x2000) == 8192 && !recognitionresult.j.getPreContext().contains(".") && !recognitionresult.j.getPreContext().contains(","))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ((i & 0xf) == 3)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            obj = recognitionresult.e;
            arraylist = new ArrayList();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                ScoredCandidate scoredcandidate = (ScoredCandidate)((Iterator) (obj)).next();
                String s1 = a(scoredcandidate.a, flag1, flag2, flag3);
                String s2 = String.valueOf(scoredcandidate.a);
                (new StringBuilder(String.valueOf(s2).length() + 19 + String.valueOf(s1).length())).append("filtered: '").append(s2).append("' -> '").append(s1).append("'.");
                if (!s1.isEmpty())
                {
                    arraylist.add(new ScoredCandidate(s1, scoredcandidate.b));
                }
            } while (true);
            for (i = 0; i < 10; i++)
            {
                arraylist.add(new ScoredCandidate(Integer.toString(i), 0.0F));
            }

            recognitionresult.e.clear();
            obj = new TreeSet();
            i = ((flag) ? 1 : 0);
            while (i < arraylist.size()) 
            {
                String s = ((ScoredCandidate)arraylist.get(i)).a;
                if (!((TreeSet) (obj)).contains(s))
                {
                    ((TreeSet) (obj)).add(s);
                    recognitionresult.e.add(arraylist.get(i));
                }
                i++;
            }
        }
        return recognitionresult;
    }

    private static String a(String s, boolean flag, boolean flag1, boolean flag2)
    {
        Object obj;
        int i;
        boolean flag3;
        boolean flag4;
        int j;
        obj = new StringBuilder();
        s = s.toCharArray();
        j = s.length;
        i = 0;
        flag3 = false;
        flag4 = true;
_L2:
        char c1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        c1 = s[i];
        if (!flag4 || !flag || c1 != '-')
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(c1);
        flag4 = flag3;
_L3:
        i++;
        boolean flag5 = false;
        flag3 = flag4;
        flag4 = flag5;
        if (true) goto _L2; else goto _L1
_L1:
        if (flag2 && "+()/*#,.-N ;".indexOf(c1) != -1)
        {
            ((StringBuilder) (obj)).append(c1);
            flag4 = flag3;
        } else
        {
label0:
            {
                if (c1 < '0' || c1 > '9')
                {
                    break label0;
                }
                ((StringBuilder) (obj)).append(c1);
                flag4 = flag3;
            }
        }
          goto _L3
        flag4 = flag3;
        if (!flag1) goto _L3; else goto _L4
_L4:
        if (c1 == '.') goto _L6; else goto _L5
_L5:
        flag4 = flag3;
        if (c1 != ',') goto _L3; else goto _L6
_L6:
        flag4 = flag3;
        if (!flag3)
        {
            ((StringBuilder) (obj)).append(c1);
            flag4 = true;
        }
          goto _L3
        obj = ((StringBuilder) (obj)).toString();
        s = ((String) (obj));
        if (((String) (obj)).endsWith(" "))
        {
            s = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
        }
        return s;
    }

    public static boolean a(String s)
    {
        return !s.startsWith("zh") && !s.startsWith("ja") && !s.startsWith("th");
    }

    public static boolean b(String s)
    {
        return s.startsWith("ar") || s.startsWith("fa") || s.startsWith("ur") || s.startsWith("iw") || s.startsWith("he");
    }

    public static boolean c(String s)
    {
        return s.startsWith("zh") || s.startsWith("ja") || s.startsWith("ko");
    }

    public static boolean d(String s)
    {
        return s.startsWith("bn") || s.startsWith("gu") || s.startsWith("hi") || s.startsWith("kn") || s.startsWith("ml") || s.startsWith("mr") || s.startsWith("ne") || s.startsWith("or") || s.startsWith("pa") || s.startsWith("ta") || s.startsWith("te") || s.startsWith("ur");
    }

    public static boolean e(String s)
    {
        return s.startsWith("th") || s.startsWith("km") || s.startsWith("lo") || s.startsWith("universal");
    }

    public static boolean f(String s)
    {
        boolean flag1 = false;
        if (s != null && !s.isEmpty()) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        s = Character.UnicodeBlock.of(Character.valueOf(s.charAt(s.length() - 1)).charValue());
        Character.UnicodeBlock aunicodeblock[] = a;
        int j = aunicodeblock.length;
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= j)
                {
                    break label1;
                }
                flag = flag1;
                if (aunicodeblock[i] == s)
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public static boolean g(String s)
    {
        return s.contentEquals("auto") || s.contentEquals("mul");
    }

    static 
    {
        a = (new Character.UnicodeBlock[] {
            Character.UnicodeBlock.CJK_COMPATIBILITY, Character.UnicodeBlock.CJK_COMPATIBILITY_FORMS, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS, Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT, Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT, Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B, Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS, 
            Character.UnicodeBlock.HIRAGANA, Character.UnicodeBlock.KATAKANA, Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS, Character.UnicodeBlock.KHMER, Character.UnicodeBlock.KHMER_SYMBOLS, Character.UnicodeBlock.LAO, Character.UnicodeBlock.THAI
        });
    }
}
