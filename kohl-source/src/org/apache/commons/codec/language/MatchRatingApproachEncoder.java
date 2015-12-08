// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

public class MatchRatingApproachEncoder
    implements StringEncoder
{

    private static final String DOUBLE_CONSONANT[] = {
        "BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", 
        "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", 
        "ZZ"
    };
    private static final int EIGHT = 8;
    private static final int ELEVEN = 11;
    private static final String EMPTY = "";
    private static final int FIVE = 5;
    private static final int FOUR = 4;
    private static final int ONE = 1;
    private static final String PLAIN_ASCII = "AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu";
    private static final int SEVEN = 7;
    private static final int SIX = 6;
    private static final String SPACE = " ";
    private static final int THREE = 3;
    private static final int TWELVE = 12;
    private static final int TWO = 2;
    private static final String UNICODE = "\300\340\310\350\314\354\322\362\331\371\301\341\311\351\315\355\323\363\332\372\335\375\302\342\312\352\316\356\324\364\333\373\u0176\u0177\303\343\325\365\321\361\304\344\313\353\317\357\326\366\334\374\u0178\377\305\345\307\347\u0150\u0151\u0170\u0171";

    public MatchRatingApproachEncoder()
    {
    }

    String cleanName(String s)
    {
        s = s.toUpperCase(Locale.ENGLISH);
        String as[] = new String[5];
        as[0] = "\\-";
        as[1] = "[&]";
        as[2] = "\\'";
        as[3] = "\\.";
        as[4] = "[\\,]";
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s = s.replaceAll(as[i], "");
        }

        return removeAccents(s).replaceAll("\\s+", "");
    }

    public final Object encode(Object obj)
        throws EncoderException
    {
        if (!(obj instanceof String))
        {
            throw new EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
        } else
        {
            return encode((String)obj);
        }
    }

    public final String encode(String s)
    {
        if (s == null || "".equalsIgnoreCase(s) || " ".equalsIgnoreCase(s) || s.length() == 1)
        {
            return "";
        } else
        {
            return getFirst3Last3(removeDoubleConsonants(removeVowels(cleanName(s))));
        }
    }

    String getFirst3Last3(String s)
    {
        int i = s.length();
        String s1 = s;
        if (i > 6)
        {
            s1 = s.substring(0, 3);
            s = s.substring(i - 3, i);
            s1 = (new StringBuilder()).append(s1).append(s).toString();
        }
        return s1;
    }

    int getMinRating(int i)
    {
        if (i <= 4)
        {
            return 5;
        }
        if (i >= 5 && i <= 7)
        {
            return 4;
        }
        if (i >= 8 && i <= 11)
        {
            return 3;
        }
        return i != 12 ? 1 : 2;
    }

    public boolean isEncodeEquals(String s, String s1)
    {
        boolean flag;
        flag = true;
        break MISSING_BLOCK_LABEL_3;
        if (s != null && !"".equalsIgnoreCase(s) && !" ".equalsIgnoreCase(s) && s1 != null && !"".equalsIgnoreCase(s1) && !" ".equalsIgnoreCase(s1) && s.length() != 1 && s1.length() != 1)
        {
            if (s.equalsIgnoreCase(s1))
            {
                return true;
            }
            s = cleanName(s);
            s1 = cleanName(s1);
            s = removeVowels(s);
            s1 = removeVowels(s1);
            s = removeDoubleConsonants(s);
            s1 = removeDoubleConsonants(s1);
            s = getFirst3Last3(s);
            s1 = getFirst3Last3(s1);
            if (Math.abs(s.length() - s1.length()) < 3)
            {
                int i = getMinRating(Math.abs(s.length() + s1.length()));
                if (leftToRightThenRightToLeftProcessing(s, s1) < i)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    boolean isVowel(String s)
    {
        return s.equalsIgnoreCase("E") || s.equalsIgnoreCase("A") || s.equalsIgnoreCase("O") || s.equalsIgnoreCase("I") || s.equalsIgnoreCase("U");
    }

    int leftToRightThenRightToLeftProcessing(String s, String s1)
    {
        char ac1[] = s.toCharArray();
        char ac[] = s1.toCharArray();
        int j = s.length() - 1;
        int k = s1.length() - 1;
        int i = 0;
        do
        {
            if (i >= ac1.length || i > k)
            {
                s = (new String(ac1)).replaceAll("\\s+", "");
                s1 = (new String(ac)).replaceAll("\\s+", "");
                String s2;
                String s3;
                String s4;
                String s5;
                if (s.length() > s1.length())
                {
                    return Math.abs(6 - s.length());
                } else
                {
                    return Math.abs(6 - s1.length());
                }
            }
            s2 = s.substring(i, i + 1);
            s3 = s.substring(j - i, (j - i) + 1);
            s4 = s1.substring(i, i + 1);
            s5 = s1.substring(k - i, (k - i) + 1);
            if (s2.equals(s4))
            {
                ac1[i] = ' ';
                ac[i] = ' ';
            }
            if (s3.equals(s5))
            {
                ac1[j - i] = ' ';
                ac[k - i] = ' ';
            }
            i++;
        } while (true);
    }

    String removeAccents(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length();
        int i = 0;
        while (i < j) 
        {
            char c = s.charAt(i);
            int k = "\300\340\310\350\314\354\322\362\331\371\301\341\311\351\315\355\323\363\332\372\335\375\302\342\312\352\316\356\324\364\333\373\u0176\u0177\303\343\325\365\321\361\304\344\313\353\317\357\326\366\334\374\u0178\377\305\345\307\347\u0150\u0151\u0170\u0171".indexOf(c);
            if (k > -1)
            {
                stringbuilder.append("AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu".charAt(k));
            } else
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    String removeDoubleConsonants(String s)
    {
        s = s.toUpperCase();
        String as[] = DOUBLE_CONSONANT;
        int j = as.length;
        for (int i = 0; i < j;)
        {
            String s2 = as[i];
            String s1 = s;
            if (s.contains(s2))
            {
                s1 = s.replace(s2, s2.substring(0, 1));
            }
            i++;
            s = s1;
        }

        return s;
    }

    String removeVowels(String s)
    {
        String s2 = s.substring(0, 1);
        String s1 = s.replaceAll("A", "").replaceAll("E", "").replaceAll("I", "").replaceAll("O", "").replaceAll("U", "").replaceAll("\\s{2,}\\b", " ");
        s = s1;
        if (isVowel(s2))
        {
            s = (new StringBuilder()).append(s2).append(s1).toString();
        }
        return s;
    }

}
