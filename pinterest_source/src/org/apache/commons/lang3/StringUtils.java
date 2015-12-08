// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.commons.lang3:
//            CharSequenceUtils, ArrayUtils, CharUtils, ObjectUtils

public class StringUtils
{

    public static final String CR = "\r";
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    public static final String LF = "\n";
    private static final int PAD_LIMIT = 8192;
    public static final String SPACE = " ";

    public StringUtils()
    {
    }

    public static String abbreviate(String s, int i)
    {
        return abbreviate(s, 0, i);
    }

    public static String abbreviate(String s, int i, int j)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (j < 4)
            {
                throw new IllegalArgumentException("Minimum abbreviation width is 4");
            }
            s1 = s;
            if (s.length() > j)
            {
                int k = i;
                if (i > s.length())
                {
                    k = s.length();
                }
                i = k;
                if (s.length() - k < j - 3)
                {
                    i = s.length() - (j - 3);
                }
                if (i <= 4)
                {
                    return (new StringBuilder()).append(s.substring(0, j - 3)).append("...").toString();
                }
                if (j < 7)
                {
                    throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
                }
                if ((i + j) - 3 < s.length())
                {
                    return (new StringBuilder("...")).append(abbreviate(s.substring(i), j - 3)).toString();
                } else
                {
                    return (new StringBuilder("...")).append(s.substring(s.length() - (j - 3))).toString();
                }
            }
        }
        return s1;
    }

    public static String abbreviateMiddle(String s, String s1, int i)
    {
        while (isEmpty(s) || isEmpty(s1) || i >= s.length() || i < s1.length() + 2) 
        {
            return s;
        }
        int j = i - s1.length();
        int k = j / 2;
        int l = s.length();
        int i1 = j / 2;
        StringBuilder stringbuilder = new StringBuilder(i);
        stringbuilder.append(s.substring(0, k + j % 2));
        stringbuilder.append(s1);
        stringbuilder.append(s.substring(l - i1));
        return stringbuilder.toString();
    }

    private static transient String appendIfMissing(String s, CharSequence charsequence, boolean flag, CharSequence acharsequence[])
    {
        if (s != null && !isEmpty(charsequence) && !endsWith(s, charsequence, flag)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
label0:
        {
            if (acharsequence == null || acharsequence.length <= 0)
            {
                break label0;
            }
            int j = acharsequence.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                if (endsWith(s, acharsequence[i], flag))
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return (new StringBuilder()).append(s).append(charsequence.toString()).toString();
    }

    public static transient String appendIfMissing(String s, CharSequence charsequence, CharSequence acharsequence[])
    {
        return appendIfMissing(s, charsequence, false, acharsequence);
    }

    public static transient String appendIfMissingIgnoreCase(String s, CharSequence charsequence, CharSequence acharsequence[])
    {
        return appendIfMissing(s, charsequence, true, acharsequence);
    }

    public static String capitalize(String s)
    {
        if (s != null)
        {
            int i = s.length();
            char c;
            if (i != 0)
            {
                if (!Character.isTitleCase(c = s.charAt(0)))
                {
                    return (new StringBuilder(i)).append(Character.toTitleCase(c)).append(s.substring(1)).toString();
                }
            }
        }
        return s;
    }

    public static String center(String s, int i)
    {
        return center(s, i, ' ');
    }

    public static String center(String s, int i, char c)
    {
        if (s != null && i > 0)
        {
            int j = s.length();
            int k = i - j;
            if (k > 0)
            {
                return rightPad(leftPad(s, j + k / 2, c), i, c);
            }
        }
        return s;
    }

    public static String center(String s, int i, String s1)
    {
        if (s != null && i > 0)
        {
            String s2 = s1;
            if (isEmpty(s1))
            {
                s2 = " ";
            }
            int j = s.length();
            int k = i - j;
            if (k > 0)
            {
                return rightPad(leftPad(s, j + k / 2, s2), i, s2);
            }
        }
        return s;
    }

    public static String chomp(String s)
    {
        if (!isEmpty(s)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        char c;
        if (s.length() != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((c = s.charAt(0)) == '\r' || c == '\n')
        {
            return "";
        }
        if (true) goto _L1; else goto _L3
_L3:
        int j;
        char c1;
        j = s.length() - 1;
        c1 = s.charAt(j);
        if (c1 != '\n') goto _L5; else goto _L4
_L4:
        int i;
        i = j;
        if (s.charAt(j - 1) == '\r')
        {
            i = j - 1;
        }
_L7:
        return s.substring(0, i);
_L5:
        i = j;
        if (c1 != '\r')
        {
            i = j + 1;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String chomp(String s, String s1)
    {
        return removeEnd(s, s1);
    }

    public static String chop(String s)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int i = s.length();
            if (i < 2)
            {
                return "";
            }
            i--;
            String s2 = s.substring(0, i);
            s1 = s2;
            if (s.charAt(i) == '\n')
            {
                s1 = s2;
                if (s2.charAt(i - 1) == '\r')
                {
                    return s2.substring(0, i - 1);
                }
            }
        }
        return s1;
    }

    private static int commonPrefixLength(CharSequence charsequence, CharSequence charsequence1)
    {
        int i = getCommonPrefix(new String[] {
            charsequence.toString(), charsequence1.toString()
        }).length();
        if (i > 4)
        {
            return 4;
        } else
        {
            return i;
        }
    }

    public static boolean contains(CharSequence charsequence, int i)
    {
        while (isEmpty(charsequence) || CharSequenceUtils.indexOf(charsequence, i, 0) < 0) 
        {
            return false;
        }
        return true;
    }

    public static boolean contains(CharSequence charsequence, CharSequence charsequence1)
    {
        while (charsequence == null || charsequence1 == null || CharSequenceUtils.indexOf(charsequence, charsequence1, 0) < 0) 
        {
            return false;
        }
        return true;
    }

    public static boolean containsAny(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence1 == null)
        {
            return false;
        } else
        {
            return containsAny(charsequence, CharSequenceUtils.toCharArray(charsequence1));
        }
    }

    public static transient boolean containsAny(CharSequence charsequence, char ac[])
    {
        boolean flag1 = true;
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(ac)) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        int i;
        int k;
        int l;
        k = charsequence.length();
        l = ac.length;
        i = 0;
_L10:
        char c;
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        c = charsequence.charAt(i);
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        if (ac[j] != c)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!Character.isHighSurrogate(c)) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (j == l - 1) goto _L6; else goto _L7
_L7:
        if (i >= k - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ac[j + 1] == charsequence.charAt(i + 1)) goto _L6; else goto _L8
_L8:
        j++;
          goto _L9
_L4:
        i++;
          goto _L10
        return false;
    }

    public static transient boolean containsAny(CharSequence charsequence, CharSequence acharsequence[])
    {
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(acharsequence))
        {
            int j = acharsequence.length;
            int i = 0;
            while (i < j) 
            {
                if (contains(charsequence, acharsequence[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean containsIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence != null && charsequence1 != null)
        {
            int j = charsequence1.length();
            int k = charsequence.length();
            int i = 0;
            while (i <= k - j) 
            {
                if (CharSequenceUtils.regionMatches(charsequence, true, i, charsequence1, 0, j))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean containsNone(CharSequence charsequence, String s)
    {
        if (charsequence == null || s == null)
        {
            return true;
        } else
        {
            return containsNone(charsequence, s.toCharArray());
        }
    }

    public static transient boolean containsNone(CharSequence charsequence, char ac[])
    {
        boolean flag1 = false;
        if (charsequence != null && ac != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L6:
        return flag;
_L2:
        int i;
        int k;
        int l;
        k = charsequence.length();
        l = ac.length;
        i = 0;
_L10:
        char c;
        int j;
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        c = charsequence.charAt(i);
        j = 0;
_L9:
        if (j >= l) goto _L4; else goto _L3
_L3:
        if (ac[j] != c)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!Character.isHighSurrogate(c)) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (j == l - 1) goto _L6; else goto _L7
_L7:
        if (i >= k - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ac[j + 1] == charsequence.charAt(i + 1)) goto _L6; else goto _L8
_L8:
        j++;
          goto _L9
_L4:
        i++;
          goto _L10
        return true;
    }

    public static boolean containsOnly(CharSequence charsequence, String s)
    {
        if (charsequence == null || s == null)
        {
            return false;
        } else
        {
            return containsOnly(charsequence, s.toCharArray());
        }
    }

    public static transient boolean containsOnly(CharSequence charsequence, char ac[])
    {
        boolean flag1 = true;
        boolean flag;
        if (ac == null || charsequence == null)
        {
            flag = false;
        } else
        {
            flag = flag1;
            if (charsequence.length() != 0)
            {
                if (ac.length == 0)
                {
                    return false;
                }
                flag = flag1;
                if (indexOfAnyBut(charsequence, ac) != -1)
                {
                    return false;
                }
            }
        }
        return flag;
    }

    public static boolean containsWhitespace(CharSequence charsequence)
    {
        if (!isEmpty(charsequence))
        {
            int j = charsequence.length();
            int i = 0;
            while (i < j) 
            {
                if (Character.isWhitespace(charsequence.charAt(i)))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static int countMatches(CharSequence charsequence, char c)
    {
        int i = 0;
        if (isEmpty(charsequence))
        {
            return 0;
        }
        int j;
        int k;
        for (j = 0; i < charsequence.length(); j = k)
        {
            k = j;
            if (c == charsequence.charAt(i))
            {
                k = j + 1;
            }
            i++;
        }

        return j;
    }

    public static int countMatches(CharSequence charsequence, CharSequence charsequence1)
    {
        int j = 0;
        if (!isEmpty(charsequence) && !isEmpty(charsequence1)) goto _L2; else goto _L1
_L1:
        j = 0;
_L4:
        return j;
_L2:
        int i = 0;
        do
        {
            int k = CharSequenceUtils.indexOf(charsequence, charsequence1, j);
            j = i;
            if (k == -1)
            {
                continue;
            }
            i++;
            j = k + charsequence1.length();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static CharSequence defaultIfBlank(CharSequence charsequence, CharSequence charsequence1)
    {
        if (isBlank(charsequence))
        {
            return charsequence1;
        } else
        {
            return charsequence;
        }
    }

    public static CharSequence defaultIfEmpty(CharSequence charsequence, CharSequence charsequence1)
    {
        if (isEmpty(charsequence))
        {
            return charsequence1;
        } else
        {
            return charsequence;
        }
    }

    public static String defaultString(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static String defaultString(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public static String deleteWhitespace(String s)
    {
        if (!isEmpty(s))
        {
            int l = s.length();
            char ac[] = new char[l];
            int j = 0;
            int i = 0;
            for (; j < l; j++)
            {
                if (!Character.isWhitespace(s.charAt(j)))
                {
                    int k = i + 1;
                    ac[i] = s.charAt(j);
                    i = k;
                }
            }

            if (i != l)
            {
                return new String(ac, 0, i);
            }
        }
        return s;
    }

    public static String difference(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        }
        if (s1 == null)
        {
            return s;
        }
        int i = indexOfDifference(s, s1);
        if (i == -1)
        {
            return "";
        } else
        {
            return s1.substring(i);
        }
    }

    public static boolean endsWith(CharSequence charsequence, CharSequence charsequence1)
    {
        return endsWith(charsequence, charsequence1, false);
    }

    private static boolean endsWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (charsequence == null || charsequence1 == null)
        {
            flag1 = flag2;
            if (charsequence == null)
            {
                flag1 = flag2;
                if (charsequence1 == null)
                {
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = flag2;
            if (charsequence1.length() <= charsequence.length())
            {
                return CharSequenceUtils.regionMatches(charsequence, flag, charsequence.length() - charsequence1.length(), charsequence1, 0, charsequence1.length());
            }
        }
        return flag1;
    }

    public static transient boolean endsWithAny(CharSequence charsequence, CharSequence acharsequence[])
    {
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(acharsequence))
        {
            int j = acharsequence.length;
            int i = 0;
            while (i < j) 
            {
                if (endsWith(charsequence, acharsequence[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean endsWithIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        return endsWith(charsequence, charsequence1, true);
    }

    public static boolean equals(CharSequence charsequence, CharSequence charsequence1)
    {
        boolean flag1 = false;
        boolean flag;
        if (charsequence == charsequence1)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (charsequence != null)
            {
                flag = flag1;
                if (charsequence1 != null)
                {
                    if ((charsequence instanceof String) && (charsequence1 instanceof String))
                    {
                        return charsequence.equals(charsequence1);
                    } else
                    {
                        return CharSequenceUtils.regionMatches(charsequence, false, 0, charsequence1, 0, Math.max(charsequence.length(), charsequence1.length()));
                    }
                }
            }
        }
        return flag;
    }

    public static boolean equalsIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence != null && charsequence1 != null) goto _L2; else goto _L1
_L1:
        if (charsequence != charsequence1) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (charsequence != charsequence1)
        {
            if (charsequence.length() != charsequence1.length())
            {
                return false;
            } else
            {
                return CharSequenceUtils.regionMatches(charsequence, true, 0, charsequence1, 0, charsequence.length());
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public static transient String getCommonPrefix(String as[])
    {
        if (as == null || as.length == 0)
        {
            return "";
        }
        int i = indexOfDifference(as);
        if (i == -1)
        {
            if (as[0] == null)
            {
                return "";
            } else
            {
                return as[0];
            }
        }
        if (i == 0)
        {
            return "";
        } else
        {
            return as[0].substring(0, i);
        }
    }

    public static int getFuzzyDistance(CharSequence charsequence, CharSequence charsequence1, Locale locale)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (locale == null)
        {
            throw new IllegalArgumentException("Locale must not be null");
        }
        charsequence = charsequence.toString().toLowerCase(locale);
        charsequence1 = charsequence1.toString().toLowerCase(locale);
        int j = 0x80000000;
        int i = 0;
        int l = 0;
        int i1 = 0;
        while (i1 < charsequence1.length()) 
        {
            char c = charsequence1.charAt(i1);
            int k = 0;
            while (i < charsequence.length() && k == 0) 
            {
                if (c == charsequence.charAt(i))
                {
                    k = l + 1;
                    int j1;
                    if (j + 1 == i)
                    {
                        j = k + 2;
                    } else
                    {
                        j = k;
                    }
                    l = i;
                    j1 = 1;
                    k = j;
                    j = j1;
                } else
                {
                    int k1 = l;
                    l = j;
                    j = k;
                    k = k1;
                }
                i++;
                j1 = j;
                j = l;
                l = k;
                k = j1;
            }
            i1++;
        }
        return l;
    }

    public static double getJaroWinklerDistance(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        } else
        {
            double d = score(charsequence, charsequence1);
            return (double)Math.round((d + (double)commonPrefixLength(charsequence, charsequence1) * 0.10000000000000001D * (1.0D - d)) * 100D) / 100D;
        }
    }

    public static int getLevenshteinDistance(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int k = charsequence.length();
        int j = charsequence1.length();
        if (k == 0)
        {
            return j;
        }
        if (j == 0)
        {
            return k;
        }
        CharSequence charsequence2;
        CharSequence charsequence3;
        int i;
        if (k > j)
        {
            i = charsequence.length();
            charsequence3 = charsequence1;
            charsequence2 = charsequence;
        } else
        {
            i = j;
            j = k;
            charsequence2 = charsequence1;
            charsequence3 = charsequence;
        }
        charsequence1 = new int[j + 1];
        charsequence = new int[j + 1];
        for (k = 0; k <= j; k++)
        {
            charsequence1[k] = k;
        }

        k = 1;
        do
        {
            CharSequence charsequence4 = charsequence1;
            if (k <= i)
            {
                char c = charsequence2.charAt(k - 1);
                charsequence[0] = k;
                int l = 1;
                while (l <= j) 
                {
                    int i1;
                    if (charsequence3.charAt(l - 1) == c)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 1;
                    }
                    charsequence[l] = Math.min(Math.min(charsequence[l - 1] + 1, charsequence4[l] + 1), i1 + charsequence4[l - 1]);
                    l++;
                }
                k++;
                charsequence1 = charsequence;
                charsequence = charsequence4;
            } else
            {
                return charsequence4[j];
            }
        } while (true);
    }

    public static int getLevenshteinDistance(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i < 0)
        {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int l = charsequence.length();
        int j = charsequence1.length();
        if (l == 0)
        {
            if (j <= i)
            {
                return j;
            } else
            {
                return -1;
            }
        }
        if (j == 0)
        {
            if (l <= i)
            {
                return l;
            } else
            {
                return -1;
            }
        }
        CharSequence charsequence2;
        CharSequence charsequence3;
        CharSequence charsequence4;
        int k;
        int i1;
        if (l > j)
        {
            k = charsequence.length();
            charsequence3 = charsequence1;
            charsequence2 = charsequence;
        } else
        {
            k = j;
            j = l;
            charsequence2 = charsequence1;
            charsequence3 = charsequence;
        }
        charsequence1 = new int[j + 1];
        charsequence = new int[j + 1];
        i1 = Math.min(j, i) + 1;
        for (l = 0; l < i1; l++)
        {
            charsequence1[l] = l;
        }

        Arrays.fill(charsequence1, i1, charsequence1.length, 0x7fffffff);
        Arrays.fill(charsequence, 0x7fffffff);
        l = 1;
        do
        {
            charsequence4 = charsequence1;
            if (l > k)
            {
                break;
            }
            char c = charsequence2.charAt(l - 1);
            charsequence[0] = l;
            int l1 = Math.max(1, l - i);
            int j1;
            if (l > 0x7fffffff - i)
            {
                j1 = j;
            } else
            {
                j1 = Math.min(j, l + i);
            }
            if (l1 > j1)
            {
                return -1;
            }
            int k1 = l1;
            if (l1 > 1)
            {
                charsequence[l1 - 1] = 0x7fffffff;
                k1 = l1;
            }
            while (k1 <= j1) 
            {
                if (charsequence3.charAt(k1 - 1) == c)
                {
                    charsequence[k1] = charsequence4[k1 - 1];
                } else
                {
                    charsequence[k1] = Math.min(Math.min(charsequence[k1 - 1], charsequence4[k1]), charsequence4[k1 - 1]) + 1;
                }
                k1++;
            }
            l++;
            charsequence1 = charsequence;
            charsequence = charsequence4;
        } while (true);
        if (charsequence4[j] <= i)
        {
            return charsequence4[j];
        } else
        {
            return -1;
        }
    }

    private static String getSetOfMatchingCharacterWithin(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder(charsequence1);
        for (int j = 0; j < charsequence.length(); j++)
        {
            char c = charsequence.charAt(j);
            int k = Math.max(0, j - i);
            for (boolean flag = false; !flag && k < Math.min(j + i, charsequence1.length()); k++)
            {
                if (stringbuilder1.charAt(k) == c)
                {
                    flag = true;
                    stringbuilder.append(c);
                    stringbuilder1.setCharAt(k, '*');
                }
            }

        }

        return stringbuilder.toString();
    }

    public static int indexOf(CharSequence charsequence, int i)
    {
        if (isEmpty(charsequence))
        {
            return -1;
        } else
        {
            return CharSequenceUtils.indexOf(charsequence, i, 0);
        }
    }

    public static int indexOf(CharSequence charsequence, int i, int j)
    {
        if (isEmpty(charsequence))
        {
            return -1;
        } else
        {
            return CharSequenceUtils.indexOf(charsequence, i, j);
        }
    }

    public static int indexOf(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return -1;
        } else
        {
            return CharSequenceUtils.indexOf(charsequence, charsequence1, 0);
        }
    }

    public static int indexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return -1;
        } else
        {
            return CharSequenceUtils.indexOf(charsequence, charsequence1, i);
        }
    }

    public static int indexOfAny(CharSequence charsequence, String s)
    {
        if (isEmpty(charsequence) || isEmpty(s))
        {
            return -1;
        } else
        {
            return indexOfAny(charsequence, s.toCharArray());
        }
    }

    public static transient int indexOfAny(CharSequence charsequence, char ac[])
    {
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(ac)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        int i;
        int l;
        int i1;
        l = charsequence.length();
        i1 = ac.length;
        i = 0;
_L11:
        char c;
        int k;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        c = charsequence.charAt(i);
        k = 0;
_L10:
        if (k >= i1) goto _L4; else goto _L3
_L3:
        if (ac[k] != c)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i;
        if (i >= l - 1) goto _L6; else goto _L5
_L5:
        j = i;
        if (k >= i1 - 1) goto _L6; else goto _L7
_L7:
        j = i;
        if (!Character.isHighSurrogate(c)) goto _L6; else goto _L8
_L8:
        j = i;
        if (ac[k + 1] == charsequence.charAt(i + 1)) goto _L6; else goto _L9
_L9:
        k++;
          goto _L10
_L4:
        i++;
          goto _L11
        return -1;
    }

    public static transient int indexOfAny(CharSequence charsequence, CharSequence acharsequence[])
    {
        int j;
        if (charsequence == null || acharsequence == null)
        {
            j = -1;
        } else
        {
            int l = acharsequence.length;
            j = 0;
            int i = 0x7fffffff;
            for (; j < l; j++)
            {
                CharSequence charsequence1 = acharsequence[j];
                if (charsequence1 == null)
                {
                    continue;
                }
                int k = CharSequenceUtils.indexOf(charsequence, charsequence1, 0);
                if (k != -1 && k < i)
                {
                    i = k;
                }
            }

            j = i;
            if (i == 0x7fffffff)
            {
                return -1;
            }
        }
        return j;
    }

    public static int indexOfAnyBut(CharSequence charsequence, CharSequence charsequence1)
    {
        if (!isEmpty(charsequence) && !isEmpty(charsequence1)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        int i;
        int k;
        k = charsequence.length();
        i = 0;
_L7:
        if (i >= k)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        char c = charsequence.charAt(i);
        char c1;
        if (CharSequenceUtils.indexOf(charsequence1, c, 0) >= 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i + 1 >= k || !Character.isHighSurrogate(c)) goto _L4; else goto _L3
_L3:
        c1 = charsequence.charAt(i + 1);
        if (j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (CharSequenceUtils.indexOf(charsequence1, c1, 0) < 0) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L4:
        if (j != 0) goto _L5; else goto _L8
_L8:
        return i;
        return -1;
    }

    public static transient int indexOfAnyBut(CharSequence charsequence, char ac[])
    {
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(ac)) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        int i;
        int l;
        int i1;
        l = charsequence.length();
        i1 = ac.length;
        i = 0;
_L4:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        char c = charsequence.charAt(i);
        int k = 0;
        do
        {
            j = i;
            if (k >= i1)
            {
                continue; /* Loop/switch isn't completed */
            }
label0:
            {
                if (ac[k] == c && (i >= l - 1 || k >= i1 - 1 || !Character.isHighSurrogate(c) || ac[k + 1] == charsequence.charAt(i + 1)))
                {
                    break label0;
                }
                k++;
            }
        } while (true);
        continue; /* Loop/switch isn't completed */
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int indexOfDifference(CharSequence charsequence, CharSequence charsequence1)
    {
        boolean flag1 = false;
        boolean flag = false;
        int i;
        if (charsequence == charsequence1)
        {
            i = -1;
        } else
        {
            i = ((flag) ? 1 : 0);
            if (charsequence != null)
            {
                i = ((flag) ? 1 : 0);
                if (charsequence1 != null)
                {
                    int j;
                    for (j = ((flag1) ? 1 : 0); j < charsequence.length() && j < charsequence1.length() && charsequence.charAt(j) == charsequence1.charAt(j); j++) { }
                    i = j;
                    if (j >= charsequence1.length())
                    {
                        i = j;
                        if (j >= charsequence.length())
                        {
                            return -1;
                        }
                    }
                }
            }
        }
        return i;
    }

    public static transient int indexOfDifference(CharSequence acharsequence[])
    {
        boolean flag = false;
        if (acharsequence != null && acharsequence.length > 1) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int i1;
        int j1;
        int k1;
        int i2 = acharsequence.length;
        k1 = 0x7fffffff;
        i1 = 0;
        j1 = 0;
        int j = 1;
        i = 0;
        while (i1 < i2) 
        {
            int k;
            int l1;
            if (acharsequence[i1] == null)
            {
                k = j;
                j = 1;
                i = 0;
            } else
            {
                k = Math.min(acharsequence[i1].length(), k1);
                j1 = Math.max(acharsequence[i1].length(), j1);
                j = i;
                k1 = 0;
                i = k;
                k = k1;
            }
            l1 = i1 + 1;
            i1 = j;
            k1 = i;
            j = k;
            i = i1;
            i1 = l1;
        }
        if (j != 0 || j1 == 0 && i == 0)
        {
            return -1;
        }
        i = ((flag) ? 1 : 0);
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = -1;
        i = 0;
        do
        {
label0:
            {
                i1 = j;
                if (i >= k1)
                {
                    break label0;
                }
                char c = acharsequence[0].charAt(i);
                i1 = 1;
                do
                {
label1:
                    {
                        int l = j;
                        if (i1 < i2)
                        {
                            if (acharsequence[i1].charAt(i) == c)
                            {
                                break label1;
                            }
                            l = i;
                        }
                        i1 = l;
                        if (l != -1)
                        {
                            break label0;
                        }
                        i++;
                        j = l;
                    }
                    if (true)
                    {
                        break;
                    }
                    i1++;
                } while (true);
            }
        } while (true);
        i = i1;
        if (i1 == -1)
        {
            i = i1;
            if (k1 != j1)
            {
                return k1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int indexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        return indexOfIgnoreCase(charsequence, charsequence1, 0);
    }

    public static int indexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence == null || charsequence1 == null)
        {
            i = -1;
        } else
        {
            int j = i;
            if (i < 0)
            {
                j = 0;
            }
            int k = (charsequence.length() - charsequence1.length()) + 1;
            if (j > k)
            {
                return -1;
            }
            i = j;
            if (charsequence1.length() != 0)
            {
                for (; j < k; j++)
                {
                    if (CharSequenceUtils.regionMatches(charsequence, true, j, charsequence1, 0, charsequence1.length()))
                    {
                        return j;
                    }
                }

                return -1;
            }
        }
        return i;
    }

    public static boolean isAllLowerCase(CharSequence charsequence)
    {
        if (charsequence != null && !isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isLowerCase(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isAllUpperCase(CharSequence charsequence)
    {
        if (charsequence != null && !isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isUpperCase(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isAlpha(CharSequence charsequence)
    {
        if (!isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isLetter(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isAlphaSpace(CharSequence charsequence)
    {
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isLetter(charsequence.charAt(i)) && charsequence.charAt(i) != ' ')
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isAlphanumeric(CharSequence charsequence)
    {
        if (!isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isLetterOrDigit(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isAlphanumericSpace(CharSequence charsequence)
    {
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isLetterOrDigit(charsequence.charAt(i)) && charsequence.charAt(i) != ' ')
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static transient boolean isAnyBlank(CharSequence acharsequence[])
    {
        if (!ArrayUtils.isEmpty(acharsequence)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j = acharsequence.length;
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
                if (isBlank(acharsequence[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static transient boolean isAnyEmpty(CharSequence acharsequence[])
    {
        if (!ArrayUtils.isEmpty(acharsequence)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int j = acharsequence.length;
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
                if (isEmpty(acharsequence[i]))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return false;
    }

    public static boolean isAsciiPrintable(CharSequence charsequence)
    {
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!CharUtils.isAsciiPrintable(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isBlank(CharSequence charsequence)
    {
        boolean flag1 = false;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        int j = charsequence.length();
        if (j != 0) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        return flag;
_L3:
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
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static transient boolean isNoneBlank(CharSequence acharsequence[])
    {
        return !isAnyBlank(acharsequence);
    }

    public static transient boolean isNoneEmpty(CharSequence acharsequence[])
    {
        return !isAnyEmpty(acharsequence);
    }

    public static boolean isNotBlank(CharSequence charsequence)
    {
        return !isBlank(charsequence);
    }

    public static boolean isNotEmpty(CharSequence charsequence)
    {
        return !isEmpty(charsequence);
    }

    public static boolean isNumeric(CharSequence charsequence)
    {
        if (!isEmpty(charsequence)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isDigit(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isNumericSpace(CharSequence charsequence)
    {
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isDigit(charsequence.charAt(i)) && charsequence.charAt(i) != ' ')
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean isWhitespace(CharSequence charsequence)
    {
        if (charsequence != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = charsequence.length();
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
                if (!Character.isWhitespace(charsequence.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static String join(Iterable iterable, char c)
    {
        if (iterable == null)
        {
            return null;
        } else
        {
            return join(iterable.iterator(), c);
        }
    }

    public static String join(Iterable iterable, String s)
    {
        if (iterable == null)
        {
            return null;
        } else
        {
            return join(iterable.iterator(), s);
        }
    }

    public static String join(Iterator iterator, char c)
    {
        if (iterator == null)
        {
            return null;
        }
        if (!iterator.hasNext())
        {
            return "";
        }
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return ObjectUtils.toString(obj);
        }
        StringBuilder stringbuilder = new StringBuilder(256);
        if (obj != null)
        {
            stringbuilder.append(obj);
        }
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            stringbuilder.append(c);
            Object obj1 = iterator.next();
            if (obj1 != null)
            {
                stringbuilder.append(obj1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String join(Iterator iterator, String s)
    {
        if (iterator == null)
        {
            return null;
        }
        if (!iterator.hasNext())
        {
            return "";
        }
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return ObjectUtils.toString(obj);
        }
        StringBuilder stringbuilder = new StringBuilder(256);
        if (obj != null)
        {
            stringbuilder.append(obj);
        }
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (s != null)
            {
                stringbuilder.append(s);
            }
            Object obj1 = iterator.next();
            if (obj1 != null)
            {
                stringbuilder.append(obj1);
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String join(byte abyte0[], char c)
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            return join(abyte0, c, 0, abyte0.length);
        }
    }

    public static String join(byte abyte0[], char c, int i, int j)
    {
        if (abyte0 == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(abyte0[l]);
        }

        return stringbuilder.toString();
    }

    public static String join(char ac[], char c)
    {
        if (ac == null)
        {
            return null;
        } else
        {
            return join(ac, c, 0, ac.length);
        }
    }

    public static String join(char ac[], char c, int i, int j)
    {
        if (ac == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(ac[l]);
        }

        return stringbuilder.toString();
    }

    public static String join(double ad[], char c)
    {
        if (ad == null)
        {
            return null;
        } else
        {
            return join(ad, c, 0, ad.length);
        }
    }

    public static String join(double ad[], char c, int i, int j)
    {
        if (ad == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(ad[l]);
        }

        return stringbuilder.toString();
    }

    public static String join(float af[], char c)
    {
        if (af == null)
        {
            return null;
        } else
        {
            return join(af, c, 0, af.length);
        }
    }

    public static String join(float af[], char c, int i, int j)
    {
        if (af == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(af[l]);
        }

        return stringbuilder.toString();
    }

    public static String join(int ai[], char c)
    {
        if (ai == null)
        {
            return null;
        } else
        {
            return join(ai, c, 0, ai.length);
        }
    }

    public static String join(int ai[], char c, int i, int j)
    {
        if (ai == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(ai[l]);
        }

        return stringbuilder.toString();
    }

    public static String join(long al[], char c)
    {
        if (al == null)
        {
            return null;
        } else
        {
            return join(al, c, 0, al.length);
        }
    }

    public static String join(long al[], char c, int i, int j)
    {
        if (al == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(al[l]);
        }

        return stringbuilder.toString();
    }

    public static transient String join(Object aobj[])
    {
        return join(aobj, ((String) (null)));
    }

    public static String join(Object aobj[], char c)
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return join(aobj, c, 0, aobj.length);
        }
    }

    public static String join(Object aobj[], char c, int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            if (aobj[l] != null)
            {
                stringbuilder.append(aobj[l]);
            }
        }

        return stringbuilder.toString();
    }

    public static String join(Object aobj[], String s)
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return join(aobj, s, 0, aobj.length);
        }
    }

    public static String join(Object aobj[], String s, int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        s = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                s.append(s1);
            }
            if (aobj[l] != null)
            {
                s.append(aobj[l]);
            }
        }

        return s.toString();
    }

    public static String join(short aword0[], char c)
    {
        if (aword0 == null)
        {
            return null;
        } else
        {
            return join(aword0, c, 0, aword0.length);
        }
    }

    public static String join(short aword0[], char c, int i, int j)
    {
        if (aword0 == null)
        {
            return null;
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                stringbuilder.append(c);
            }
            stringbuilder.append(aword0[l]);
        }

        return stringbuilder.toString();
    }

    public static int lastIndexOf(CharSequence charsequence, int i)
    {
        if (isEmpty(charsequence))
        {
            return -1;
        } else
        {
            return CharSequenceUtils.lastIndexOf(charsequence, i, charsequence.length());
        }
    }

    public static int lastIndexOf(CharSequence charsequence, int i, int j)
    {
        if (isEmpty(charsequence))
        {
            return -1;
        } else
        {
            return CharSequenceUtils.lastIndexOf(charsequence, i, j);
        }
    }

    public static int lastIndexOf(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return -1;
        } else
        {
            return CharSequenceUtils.lastIndexOf(charsequence, charsequence1, charsequence.length());
        }
    }

    public static int lastIndexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return -1;
        } else
        {
            return CharSequenceUtils.lastIndexOf(charsequence, charsequence1, i);
        }
    }

    public static transient int lastIndexOfAny(CharSequence charsequence, CharSequence acharsequence[])
    {
        int i;
        byte byte0;
        i = -1;
        byte0 = i;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        if (acharsequence != null) goto _L4; else goto _L3
_L3:
        byte0 = i;
_L2:
        return byte0;
_L4:
        int l = acharsequence.length;
        int j = 0;
        do
        {
            byte0 = i;
            if (j >= l)
            {
                continue;
            }
            CharSequence charsequence1 = acharsequence[j];
            if (charsequence1 != null)
            {
                int k = CharSequenceUtils.lastIndexOf(charsequence, charsequence1, charsequence.length());
                if (k > i)
                {
                    i = k;
                }
            }
            j++;
        } while (true);
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static int lastIndexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return -1;
        } else
        {
            return lastIndexOfIgnoreCase(charsequence, charsequence1, charsequence.length());
        }
    }

    public static int lastIndexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence != null && charsequence1 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        if (i > charsequence.length() - charsequence1.length())
        {
            i = charsequence.length() - charsequence1.length();
        }
        if (i < 0)
        {
            return -1;
        }
        j = i;
        if (charsequence1.length() != 0)
        {
label0:
            do
            {
label1:
                {
                    if (i < 0)
                    {
                        break label1;
                    }
                    j = i;
                    if (CharSequenceUtils.regionMatches(charsequence, true, i, charsequence1, 0, charsequence1.length()))
                    {
                        break label0;
                    }
                    i--;
                }
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static int lastOrdinalIndexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return ordinalIndexOf(charsequence, charsequence1, i, true);
    }

    public static String left(String s, int i)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (i < 0)
            {
                return "";
            }
            s1 = s;
            if (s.length() > i)
            {
                return s.substring(0, i);
            }
        }
        return s1;
    }

    public static String leftPad(String s, int i)
    {
        return leftPad(s, i, ' ');
    }

    public static String leftPad(String s, int i, char c)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int j = i - s.length();
            s1 = s;
            if (j > 0)
            {
                if (j > 8192)
                {
                    return leftPad(s, i, String.valueOf(c));
                } else
                {
                    return repeat(c, j).concat(s);
                }
            }
        }
        return s1;
    }

    public static String leftPad(String s, int i, String s1)
    {
        boolean flag = false;
        if (s == null)
        {
            s1 = null;
        } else
        {
            String s2 = s1;
            if (isEmpty(s1))
            {
                s2 = " ";
            }
            int j = s2.length();
            int k = i - s.length();
            s1 = s;
            if (k > 0)
            {
                if (j == 1 && k <= 8192)
                {
                    return leftPad(s, i, s2.charAt(0));
                }
                if (k == j)
                {
                    return s2.concat(s);
                }
                if (k < j)
                {
                    return s2.substring(0, k).concat(s);
                }
                s1 = new char[k];
                char ac[] = s2.toCharArray();
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    s1[i] = ac[i % j];
                }

                return (new String(s1)).concat(s);
            }
        }
        return s1;
    }

    public static int length(CharSequence charsequence)
    {
        if (charsequence == null)
        {
            return 0;
        } else
        {
            return charsequence.length();
        }
    }

    public static String lowerCase(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toLowerCase();
        }
    }

    public static String lowerCase(String s, Locale locale)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toLowerCase(locale);
        }
    }

    public static String mid(String s, int i, int j)
    {
        if (s == null)
        {
            return null;
        }
        if (j < 0 || i > s.length())
        {
            return "";
        }
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        if (s.length() <= k + j)
        {
            return s.substring(k);
        } else
        {
            return s.substring(k, k + j);
        }
    }

    public static String normalizeSpace(String s)
    {
        if (isEmpty(s))
        {
            return s;
        }
        int l1 = s.length();
        char ac[] = new char[l1];
        int l = 0;
        int j = 1;
        int k = 0;
        int i = 0;
        while (l < l1) 
        {
            char c1 = s.charAt(l);
            int i1;
            if (!Character.isWhitespace(c1))
            {
                j = i + 1;
                char c = c1;
                if (c1 == '\240')
                {
                    c = ' ';
                }
                ac[i] = c;
                i = 0;
                k = 0;
            } else
            {
                if (k == 0 && j == 0)
                {
                    int j1 = i + 1;
                    ac[i] = " ".charAt(0);
                    i = j1;
                }
                k++;
                int k1 = i;
                i = j;
                j = k1;
            }
            i1 = l + 1;
            l = i;
            i = j;
            j = l;
            l = i1;
        }
        if (j != 0)
        {
            return "";
        }
        if (k > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return new String(ac, 0, i - j);
    }

    public static int ordinalIndexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return ordinalIndexOf(charsequence, charsequence1, i, false);
    }

    private static int ordinalIndexOf(CharSequence charsequence, CharSequence charsequence1, int i, boolean flag)
    {
        byte byte0;
        int k;
        boolean flag1;
        flag1 = false;
        byte0 = -1;
        k = byte0;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        k = byte0;
        if (charsequence1 == null) goto _L2; else goto _L3
_L3:
        if (i > 0) goto _L5; else goto _L4
_L4:
        k = byte0;
_L2:
        return k;
_L5:
        int l;
        if (charsequence1.length() == 0)
        {
            if (flag)
            {
                return charsequence.length();
            } else
            {
                return 0;
            }
        }
        k = byte0;
        l = ((flag1) ? 1 : 0);
        if (flag)
        {
            k = charsequence.length();
            l = ((flag1) ? 1 : 0);
        }
_L7:
        int j;
        int i1;
        if (flag)
        {
            j = CharSequenceUtils.lastIndexOf(charsequence, charsequence1, k - charsequence1.length());
        } else
        {
            j = CharSequenceUtils.indexOf(charsequence, charsequence1, k + charsequence1.length());
        }
        k = j;
        if (j < 0) goto _L2; else goto _L6
_L6:
        i1 = l + 1;
        k = j;
        l = i1;
        if (i1 >= i)
        {
            return j;
        }
          goto _L7
    }

    public static String overlay(String s, String s1, int i, int j)
    {
        if (s == null)
        {
            return null;
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        int l = s.length();
        int k;
        if (i < 0)
        {
            k = 0;
        } else
        {
            k = i;
        }
        i = k;
        if (k > l)
        {
            i = l;
        }
        if (j < 0)
        {
            k = 0;
        } else
        {
            k = j;
        }
        j = k;
        if (k > l)
        {
            j = l;
        }
        if (i > j)
        {
            k = j;
            j = i;
        } else
        {
            k = i;
        }
        return (new StringBuilder(((l + k) - j) + s2.length() + 1)).append(s.substring(0, k)).append(s2).append(s.substring(j)).toString();
    }

    private static transient String prependIfMissing(String s, CharSequence charsequence, boolean flag, CharSequence acharsequence[])
    {
        if (s != null && !isEmpty(charsequence) && !startsWith(s, charsequence, flag)) goto _L2; else goto _L1
_L1:
        return s;
_L2:
label0:
        {
            if (acharsequence == null || acharsequence.length <= 0)
            {
                break label0;
            }
            int j = acharsequence.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                if (startsWith(s, acharsequence[i], flag))
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return (new StringBuilder()).append(charsequence.toString()).append(s).toString();
    }

    public static transient String prependIfMissing(String s, CharSequence charsequence, CharSequence acharsequence[])
    {
        return prependIfMissing(s, charsequence, false, acharsequence);
    }

    public static transient String prependIfMissingIgnoreCase(String s, CharSequence charsequence, CharSequence acharsequence[])
    {
        return prependIfMissing(s, charsequence, true, acharsequence);
    }

    public static String remove(String s, char c)
    {
        if (isEmpty(s) || s.indexOf(c) == -1)
        {
            return s;
        }
        s = s.toCharArray();
        int i = 0;
        int j;
        int k;
        for (j = 0; i < s.length; j = k)
        {
            k = j;
            if (s[i] != c)
            {
                s[j] = s[i];
                k = j + 1;
            }
            i++;
        }

        return new String(s, 0, j);
    }

    public static String remove(String s, String s1)
    {
        if (isEmpty(s) || isEmpty(s1))
        {
            return s;
        } else
        {
            return replace(s, s1, "", -1);
        }
    }

    public static String removeEnd(String s, String s1)
    {
        while (isEmpty(s) || isEmpty(s1) || !s.endsWith(s1)) 
        {
            return s;
        }
        return s.substring(0, s.length() - s1.length());
    }

    public static String removeEndIgnoreCase(String s, String s1)
    {
        while (isEmpty(s) || isEmpty(s1) || !endsWithIgnoreCase(s, s1)) 
        {
            return s;
        }
        return s.substring(0, s.length() - s1.length());
    }

    public static String removePattern(String s, String s1)
    {
        return replacePattern(s, s1, "");
    }

    public static String removeStart(String s, String s1)
    {
        while (isEmpty(s) || isEmpty(s1) || !s.startsWith(s1)) 
        {
            return s;
        }
        return s.substring(s1.length());
    }

    public static String removeStartIgnoreCase(String s, String s1)
    {
        while (isEmpty(s) || isEmpty(s1) || !startsWithIgnoreCase(s, s1)) 
        {
            return s;
        }
        return s.substring(s1.length());
    }

    public static String repeat(char c, int i)
    {
        char ac[] = new char[i];
        for (i--; i >= 0; i--)
        {
            ac[i] = c;
        }

        return new String(ac);
    }

    public static String repeat(String s, int i)
    {
        int j = 0;
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (i <= 0)
            {
                return "";
            }
            int k = s.length();
            s1 = s;
            if (i != 1)
            {
                s1 = s;
                if (k != 0)
                {
                    if (k == 1 && i <= 8192)
                    {
                        return repeat(s.charAt(0), i);
                    }
                    int l = k * i;
                    StringBuilder stringbuilder;
                    switch (k)
                    {
                    default:
                        stringbuilder = new StringBuilder(l);
                        for (; j < i; j++)
                        {
                            stringbuilder.append(s);
                        }

                        break;

                    case 1: // '\001'
                        return repeat(s.charAt(0), i);

                    case 2: // '\002'
                        char c = s.charAt(0);
                        char c1 = s.charAt(1);
                        s = new char[l];
                        for (i = i * 2 - 2; i >= 0; i = i - 1 - 1)
                        {
                            s[i] = c;
                            s[i + 1] = c1;
                        }

                        return new String(s);
                    }
                    return stringbuilder.toString();
                }
            }
        }
        return s1;
    }

    public static String repeat(String s, String s1, int i)
    {
        if (s == null || s1 == null)
        {
            return repeat(s, i);
        } else
        {
            return removeEnd(repeat((new StringBuilder()).append(s).append(s1).toString(), i), s1);
        }
    }

    public static String replace(String s, String s1, String s2)
    {
        return replace(s, s1, s2, -1);
    }

    public static String replace(String s, String s1, String s2, int i)
    {
        int j = 64;
        if (!isEmpty(s) && !isEmpty(s1) && s2 != null && i != 0) goto _L2; else goto _L1
_L1:
        int l;
        return s;
_L2:
        if ((l = s.indexOf(s1, 0)) == -1) goto _L1; else goto _L3
_L3:
        int k;
        int j1;
        j1 = s1.length();
        int i1 = s2.length() - j1;
        k = i1;
        if (i1 < 0)
        {
            k = 0;
        }
        if (i >= 0) goto _L5; else goto _L4
_L4:
        j = 16;
_L7:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder(j * k + s.length());
        boolean flag = false;
        j = i;
        k = l;
        i = ((flag) ? 1 : 0);
        do
        {
            l = i;
            if (k == -1)
            {
                break;
            }
            stringbuilder.append(s.substring(i, k)).append(s2);
            i = k + j1;
            j--;
            l = i;
            if (j == 0)
            {
                break;
            }
            k = s.indexOf(s1, i);
        } while (true);
        break; /* Loop/switch isn't completed */
_L5:
        if (i <= 64)
        {
            j = i;
        }
        if (true) goto _L7; else goto _L6
_L6:
        stringbuilder.append(s.substring(l));
        return stringbuilder.toString();
    }

    public static String replaceChars(String s, char c, char c1)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace(c, c1);
        }
    }

    public static String replaceChars(String s, String s1, String s2)
    {
        boolean flag = false;
        if (!isEmpty(s) && !isEmpty(s1))
        {
            String s3 = s2;
            if (s2 == null)
            {
                s3 = "";
            }
            int j = s3.length();
            int k = s.length();
            s2 = new StringBuilder(k);
            int i = 0;
            while (i < k) 
            {
                char c = s.charAt(i);
                int l = s1.indexOf(c);
                if (l >= 0)
                {
                    boolean flag1 = true;
                    flag = flag1;
                    if (l < j)
                    {
                        s2.append(s3.charAt(l));
                        flag = flag1;
                    }
                } else
                {
                    s2.append(c);
                }
                i++;
            }
            if (flag)
            {
                return s2.toString();
            }
        }
        return s;
    }

    public static String replaceEach(String s, String as[], String as1[])
    {
        return replaceEach(s, as, as1, false, 0);
    }

    private static String replaceEach(String s, String as[], String as1[], boolean flag, int i)
    {
        int i1 = i;
_L17:
        if (s != null && !s.isEmpty() && as != null && as.length != 0 && as1 != null && as1.length != 0) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        boolean aflag[];
        int j;
        int l;
        int j2;
        if (i1 < 0)
        {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        j2 = as.length;
        i = as1.length;
        if (j2 != i)
        {
            throw new IllegalArgumentException((new StringBuilder("Search and Replace array lengths don't match: ")).append(j2).append(" vs ").append(i).toString());
        }
        aflag = new boolean[j2];
        i = -1;
        j = -1;
        l = 0;
_L4:
        int j1;
        int k1;
        int l1;
        if (l >= j2)
        {
            break MISSING_BLOCK_LABEL_268;
        }
        j1 = j;
        k1 = i;
        if (!aflag[l])
        {
            j1 = j;
            k1 = i;
            if (as[l] != null)
            {
                j1 = j;
                k1 = i;
                if (!as[l].isEmpty())
                {
                    j1 = j;
                    k1 = i;
                    if (as1[l] != null)
                    {
                        l1 = s.indexOf(as[l]);
                        if (l1 != -1)
                        {
                            break; /* Loop/switch isn't completed */
                        }
                        aflag[l] = true;
                        k1 = i;
                        j1 = j;
                    }
                }
            }
        }
_L7:
        l++;
        j = j1;
        i = k1;
        if (true) goto _L4; else goto _L3
_L3:
        if (i == -1) goto _L6; else goto _L5
_L5:
        j1 = j;
        k1 = i;
        if (l1 >= i) goto _L7; else goto _L6
_L6:
        j1 = l;
        k1 = l1;
          goto _L7
        StringBuilder stringbuilder;
        if (i == -1)
        {
            return s;
        }
        j1 = 0;
        for (l = 0; l < as.length;)
        {
            k1 = j1;
            if (as[l] != null)
            {
                k1 = j1;
                if (as1[l] != null)
                {
                    l1 = as1[l].length() - as[l].length();
                    k1 = j1;
                    if (l1 > 0)
                    {
                        k1 = j1 + l1 * 3;
                    }
                }
            }
            l++;
            j1 = k1;
        }

        stringbuilder = new StringBuilder(Math.min(j1, s.length() / 5) + s.length());
        l = j;
        j1 = 0;
        j = i;
        i = j1;
_L14:
        if (j == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        for (; i < j; i++)
        {
            stringbuilder.append(s.charAt(i));
        }

        stringbuilder.append(as1[l]);
        l1 = j + as[l].length();
        j = -1;
        l = -1;
        i = 0;
_L9:
        int i2;
        if (i >= j2)
        {
            break MISSING_BLOCK_LABEL_616;
        }
        j1 = l;
        k1 = j;
        if (!aflag[i])
        {
            j1 = l;
            k1 = j;
            if (as[i] != null)
            {
                j1 = l;
                k1 = j;
                if (!as[i].isEmpty())
                {
                    j1 = l;
                    k1 = j;
                    if (as1[i] != null)
                    {
                        i2 = s.indexOf(as[i], l1);
                        if (i2 != -1)
                        {
                            break; /* Loop/switch isn't completed */
                        }
                        aflag[i] = true;
                        k1 = j;
                        j1 = l;
                    }
                }
            }
        }
_L12:
        i++;
        l = j1;
        j = k1;
        if (true) goto _L9; else goto _L8
_L8:
        if (j == -1) goto _L11; else goto _L10
_L10:
        j1 = l;
        k1 = j;
        if (i2 >= j) goto _L12; else goto _L11
_L11:
        j1 = i;
        k1 = i2;
          goto _L12
        i = l1;
        if (true) goto _L14; else goto _L13
_L13:
        String s1;
        for (int k = s.length(); i < k; i++)
        {
            stringbuilder.append(s.charAt(i));
        }

        s1 = stringbuilder.toString();
        s = s1;
        if (!flag) goto _L1; else goto _L15
_L15:
        i1--;
        s = s1;
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static String replaceEachRepeatedly(String s, String as[], String as1[])
    {
        int i;
        if (as == null)
        {
            i = 0;
        } else
        {
            i = as.length;
        }
        return replaceEach(s, as, as1, true, i);
    }

    public static String replaceOnce(String s, String s1, String s2)
    {
        return replace(s, s1, s2, 1);
    }

    public static String replacePattern(String s, String s1, String s2)
    {
        return Pattern.compile(s1, 32).matcher(s).replaceAll(s2);
    }

    public static String reverse(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder(s)).reverse().toString();
        }
    }

    public static String reverseDelimited(String s, char c)
    {
        if (s == null)
        {
            return null;
        } else
        {
            s = split(s, c);
            ArrayUtils.reverse(s);
            return join(s, c);
        }
    }

    public static String right(String s, int i)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (i < 0)
            {
                return "";
            }
            s1 = s;
            if (s.length() > i)
            {
                return s.substring(s.length() - i);
            }
        }
        return s1;
    }

    public static String rightPad(String s, int i)
    {
        return rightPad(s, i, ' ');
    }

    public static String rightPad(String s, int i, char c)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int j = i - s.length();
            s1 = s;
            if (j > 0)
            {
                if (j > 8192)
                {
                    return rightPad(s, i, String.valueOf(c));
                } else
                {
                    return s.concat(repeat(c, j));
                }
            }
        }
        return s1;
    }

    public static String rightPad(String s, int i, String s1)
    {
        boolean flag = false;
        if (s == null)
        {
            s1 = null;
        } else
        {
            String s2 = s1;
            if (isEmpty(s1))
            {
                s2 = " ";
            }
            int j = s2.length();
            int k = i - s.length();
            s1 = s;
            if (k > 0)
            {
                if (j == 1 && k <= 8192)
                {
                    return rightPad(s, i, s2.charAt(0));
                }
                if (k == j)
                {
                    return s.concat(s2);
                }
                if (k < j)
                {
                    return s.concat(s2.substring(0, k));
                }
                s1 = new char[k];
                char ac[] = s2.toCharArray();
                for (i = ((flag) ? 1 : 0); i < k; i++)
                {
                    s1[i] = ac[i % j];
                }

                return s.concat(new String(s1));
            }
        }
        return s1;
    }

    private static double score(CharSequence charsequence, CharSequence charsequence1)
    {
        String s;
        String s1;
        int i;
        if (charsequence.length() > charsequence1.length())
        {
            charsequence = charsequence.toString().toLowerCase();
            charsequence1 = charsequence1.toString().toLowerCase();
        } else
        {
            charsequence1 = charsequence1.toString().toLowerCase();
            s = charsequence.toString().toLowerCase();
            charsequence = charsequence1;
            charsequence1 = s;
        }
        i = charsequence1.length() / 2 + 1;
        s = getSetOfMatchingCharacterWithin(charsequence1, charsequence, i);
        s1 = getSetOfMatchingCharacterWithin(charsequence, charsequence1, i);
        if (s.length() == 0 || s1.length() == 0)
        {
            return 0.0D;
        }
        if (s.length() != s1.length())
        {
            return 0.0D;
        } else
        {
            int j = transpositions(s, s1);
            double d = (double)s.length() / (double)charsequence1.length();
            return ((double)s1.length() / (double)charsequence.length() + d + (double)(s.length() - j) / (double)s.length()) / 3D;
        }
    }

    public static String[] split(String s)
    {
        return split(s, null, -1);
    }

    public static String[] split(String s, char c)
    {
        return splitWorker(s, c, false);
    }

    public static String[] split(String s, String s1)
    {
        return splitWorker(s, s1, -1, false);
    }

    public static String[] split(String s, String s1, int i)
    {
        return splitWorker(s, s1, i, false);
    }

    public static String[] splitByCharacterType(String s)
    {
        return splitByCharacterType(s, false);
    }

    private static String[] splitByCharacterType(String s, boolean flag)
    {
        if (s == null)
        {
            return null;
        }
        if (s.isEmpty())
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        s = s.toCharArray();
        ArrayList arraylist = new ArrayList();
        int l = Character.getType(s[0]);
        int k = 0;
        int j = 1;
        while (j < s.length) 
        {
            int j1 = Character.getType(s[j]);
            int i1 = l;
            int i = k;
            if (j1 != l)
            {
                if (flag && j1 == 2 && l == 1)
                {
                    l = j - 1;
                    i = k;
                    if (l != k)
                    {
                        arraylist.add(new String(s, k, l - k));
                        i = l;
                    }
                } else
                {
                    arraylist.add(new String(s, k, j - k));
                    i = j;
                }
                i1 = j1;
            }
            j++;
            l = i1;
            k = i;
        }
        arraylist.add(new String(s, k, s.length - k));
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static String[] splitByCharacterTypeCamelCase(String s)
    {
        return splitByCharacterType(s, true);
    }

    public static String[] splitByWholeSeparator(String s, String s1)
    {
        return splitByWholeSeparatorWorker(s, s1, -1, false);
    }

    public static String[] splitByWholeSeparator(String s, String s1, int i)
    {
        return splitByWholeSeparatorWorker(s, s1, i, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String s, String s1)
    {
        return splitByWholeSeparatorWorker(s, s1, -1, true);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String s, String s1, int i)
    {
        return splitByWholeSeparatorWorker(s, s1, i, true);
    }

    private static String[] splitByWholeSeparatorWorker(String s, String s1, int i, boolean flag)
    {
        int k = 0;
        if (s == null)
        {
            return null;
        }
        int l = s.length();
        if (l == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        if (s1 == null || "".equals(s1))
        {
            return splitWorker(s, null, i, flag);
        }
        int l1 = s1.length();
        ArrayList arraylist = new ArrayList();
        int j = 0;
        int i1 = 0;
        while (j < l) 
        {
            int j1 = s.indexOf(s1, i1);
            if (j1 >= 0)
            {
                if (j1 > i1)
                {
                    j = k + 1;
                    if (j == i)
                    {
                        arraylist.add(s.substring(i1));
                        k = l;
                        j1 = j;
                        j = k;
                        k = j1;
                    } else
                    {
                        arraylist.add(s.substring(i1, j1));
                        i1 = j1 + l1;
                        k = j;
                        j = j1;
                    }
                } else
                {
                    j = j1;
                    int k1 = k;
                    if (flag)
                    {
                        k1 = k + 1;
                        if (k1 == i)
                        {
                            arraylist.add(s.substring(i1));
                            j = l;
                        } else
                        {
                            arraylist.add("");
                            j = j1;
                        }
                    }
                    i1 = j + l1;
                    k = k1;
                }
            } else
            {
                arraylist.add(s.substring(i1));
                j = l;
            }
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    public static String[] splitPreserveAllTokens(String s)
    {
        return splitWorker(s, null, -1, true);
    }

    public static String[] splitPreserveAllTokens(String s, char c)
    {
        return splitWorker(s, c, true);
    }

    public static String[] splitPreserveAllTokens(String s, String s1)
    {
        return splitWorker(s, s1, -1, true);
    }

    public static String[] splitPreserveAllTokens(String s, String s1, int i)
    {
        return splitWorker(s, s1, i, true);
    }

    private static String[] splitWorker(String s, char c, boolean flag)
    {
        if (s == null)
        {
            return null;
        }
        int k = s.length();
        if (k == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arraylist = new ArrayList();
        boolean flag1 = false;
        boolean flag2 = false;
        int j = 0;
        int i;
        for (i = 0; i < k;)
        {
            if (s.charAt(i) == c)
            {
                if (flag2 || flag)
                {
                    arraylist.add(s.substring(j, i));
                    flag1 = true;
                    flag2 = false;
                }
                j = i + 1;
                i = j;
            } else
            {
                flag2 = true;
                i++;
                flag1 = false;
            }
        }

        if (flag2 || flag && flag1)
        {
            arraylist.add(s.substring(j, i));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private static String[] splitWorker(String s, String s1, int i, boolean flag)
    {
        ArrayList arraylist;
        int i1;
        if (s == null)
        {
            return null;
        }
        i1 = s.length();
        if (i1 == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        arraylist = new ArrayList();
        if (s1 != null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        int l;
        int j1;
        int l2;
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l2 = 1;
_L5:
        int l1;
        int i2;
        int j2;
        int k2;
        k2 = j;
        i2 = k;
        l1 = l;
        j2 = j1;
        if (j >= i1) goto _L4; else goto _L3
_L3:
        if (Character.isWhitespace(s.charAt(j)))
        {
            if (l != 0 || flag)
            {
                if (l2 == i)
                {
                    j = 0;
                    k = i1;
                } else
                {
                    k = j;
                    j = 1;
                }
                arraylist.add(s.substring(j1, k));
                l2++;
                j1 = 0;
                l = k;
                k = j1;
            } else
            {
                int k1 = j;
                j = k;
                k = l;
                l = k1;
            }
            j1 = l + 1;
            l = k;
            k = j;
            j = j1;
        } else
        {
            j++;
            k = 0;
            l = 1;
        }
        if (true) goto _L5; else goto _L4
_L2:
        if (s1.length() != 1) goto _L7; else goto _L6
_L6:
        i2 = s1.charAt(0);
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l1 = 1;
        while (j < i1) 
        {
            if (s.charAt(j) == i2)
            {
                if (l != 0 || flag)
                {
                    if (l1 == i)
                    {
                        j = 0;
                        k = i1;
                    } else
                    {
                        k = j;
                        j = 1;
                    }
                    arraylist.add(s.substring(j1, k));
                    l1++;
                    j1 = 0;
                    l = k;
                    k = j1;
                } else
                {
                    j1 = j;
                    j = k;
                    k = l;
                    l = j1;
                }
                j1 = l + 1;
                l = k;
                k = j;
                j = j1;
            } else
            {
                j++;
                k = 0;
                l = 1;
            }
        }
_L10:
        if (l != 0 || flag && k != 0)
        {
            arraylist.add(s.substring(j1, j));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
_L9:
        k2 = j;
        i2 = k;
        l1 = l;
        j2 = j1;
        if (j >= i1) goto _L4; else goto _L8
_L8:
        if (s1.indexOf(s.charAt(j)) >= 0)
        {
            if (l != 0 || flag)
            {
                if (l2 == i)
                {
                    j = 0;
                    k = i1;
                } else
                {
                    k = j;
                    j = 1;
                }
                arraylist.add(s.substring(j1, k));
                l2++;
                j1 = 0;
                l = k;
                k = j1;
            } else
            {
                j1 = j;
                j = k;
                k = l;
                l = j1;
            }
            j1 = l + 1;
            l = k;
            k = j;
            j = j1;
        } else
        {
            j++;
            k = 0;
            l = 1;
        }
          goto _L9
_L4:
        j = k2;
        j1 = j2;
        k = i2;
        l = l1;
          goto _L10
_L7:
        k = 0;
        l = 0;
        j1 = 0;
        j = 0;
        l2 = 1;
          goto _L9
    }

    public static boolean startsWith(CharSequence charsequence, CharSequence charsequence1)
    {
        return startsWith(charsequence, charsequence1, false);
    }

    private static boolean startsWith(CharSequence charsequence, CharSequence charsequence1, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1;
        if (charsequence == null || charsequence1 == null)
        {
            flag1 = flag2;
            if (charsequence == null)
            {
                flag1 = flag2;
                if (charsequence1 == null)
                {
                    flag1 = true;
                }
            }
        } else
        {
            flag1 = flag2;
            if (charsequence1.length() <= charsequence.length())
            {
                return CharSequenceUtils.regionMatches(charsequence, flag, 0, charsequence1, 0, charsequence1.length());
            }
        }
        return flag1;
    }

    public static transient boolean startsWithAny(CharSequence charsequence, CharSequence acharsequence[])
    {
        if (!isEmpty(charsequence) && !ArrayUtils.isEmpty(acharsequence))
        {
            int j = acharsequence.length;
            int i = 0;
            while (i < j) 
            {
                if (startsWith(charsequence, acharsequence[i]))
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static boolean startsWithIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        return startsWith(charsequence, charsequence1, true);
    }

    public static String strip(String s)
    {
        return strip(s, null);
    }

    public static String strip(String s, String s1)
    {
        if (isEmpty(s))
        {
            return s;
        } else
        {
            return stripEnd(stripStart(s, s1), s1);
        }
    }

    public static String stripAccents(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return Pattern.compile("\\p{InCombiningDiacriticalMarks}+").matcher(Normalizer.normalize(s, java.text.Normalizer.Form.NFD)).replaceAll("");
        }
    }

    public static transient String[] stripAll(String as[])
    {
        return stripAll(as, null);
    }

    public static String[] stripAll(String as[], String s)
    {
        int j;
label0:
        {
            if (as != null)
            {
                j = as.length;
                if (j != 0)
                {
                    break label0;
                }
            }
            return as;
        }
        String as1[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as1[i] = strip(as[i], s);
        }

        return as1;
    }

    public static String stripEnd(String s, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = s.length();
        if (i != 0) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        int j;
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        do
        {
            j = i;
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_84;
            }
            j = i;
            if (!Character.isWhitespace(s.charAt(i - 1)))
            {
                break MISSING_BLOCK_LABEL_84;
            }
            i--;
        } while (true);
        if (s1.isEmpty()) goto _L2; else goto _L4
_L4:
        do
        {
            j = i;
            if (i == 0)
            {
                break;
            }
            j = i;
            if (s1.indexOf(s.charAt(i - 1)) == -1)
            {
                break;
            }
            i--;
        } while (true);
        return s.substring(0, j);
    }

    public static String stripStart(String s, String s1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        int l = s.length();
        if (l != 0) goto _L3; else goto _L2
_L2:
        return s;
_L3:
        int k;
        k = 0;
        int i = 0;
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        do
        {
            k = i;
            if (i == l)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            k = i;
            if (!Character.isWhitespace(s.charAt(i)))
            {
                break MISSING_BLOCK_LABEL_92;
            }
            i++;
        } while (true);
        if (s1.isEmpty()) goto _L2; else goto _L4
_L4:
        int j = k;
        do
        {
            k = j;
            if (j == l)
            {
                break;
            }
            k = j;
            if (s1.indexOf(s.charAt(j)) == -1)
            {
                break;
            }
            j++;
        } while (true);
        return s.substring(k);
    }

    public static String stripToEmpty(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return strip(s, null);
        }
    }

    public static String stripToNull(String s)
    {
        if (s != null)
        {
            if (!(s = strip(s, null)).isEmpty())
            {
                return s;
            }
        }
        return null;
    }

    public static String substring(String s, int i)
    {
        if (s == null)
        {
            return null;
        }
        if (i < 0)
        {
            i = s.length() + i;
        }
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        if (j > s.length())
        {
            return "";
        } else
        {
            return s.substring(j);
        }
    }

    public static String substring(String s, int i, int j)
    {
        boolean flag = false;
        if (s == null)
        {
            return null;
        }
        int k;
        if (j < 0)
        {
            k = s.length() + j;
        } else
        {
            k = j;
        }
        j = i;
        if (i < 0)
        {
            j = i + s.length();
        }
        i = k;
        if (k > s.length())
        {
            i = s.length();
        }
        if (j > i)
        {
            return "";
        }
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        if (i < 0)
        {
            i = ((flag) ? 1 : 0);
        }
        return s.substring(k, i);
    }

    public static String substringAfter(String s, String s1)
    {
        if (isEmpty(s))
        {
            return s;
        }
        if (s1 == null)
        {
            return "";
        }
        int i = s.indexOf(s1);
        if (i == -1)
        {
            return "";
        } else
        {
            return s.substring(i + s1.length());
        }
    }

    public static String substringAfterLast(String s, String s1)
    {
        if (isEmpty(s))
        {
            return s;
        }
        if (isEmpty(s1))
        {
            return "";
        }
        int i = s.lastIndexOf(s1);
        if (i == -1 || i == s.length() - s1.length())
        {
            return "";
        } else
        {
            return s.substring(i + s1.length());
        }
    }

    public static String substringBefore(String s, String s1)
    {
        if (!isEmpty(s) && s1 != null)
        {
            if (s1.isEmpty())
            {
                return "";
            }
            int i = s.indexOf(s1);
            if (i != -1)
            {
                return s.substring(0, i);
            }
        }
        return s;
    }

    public static String substringBeforeLast(String s, String s1)
    {
        int i;
        if (!isEmpty(s) && !isEmpty(s1))
        {
            if ((i = s.lastIndexOf(s1)) != -1)
            {
                return s.substring(0, i);
            }
        }
        return s;
    }

    public static String substringBetween(String s, String s1)
    {
        return substringBetween(s, s1, s1);
    }

    public static String substringBetween(String s, String s1, String s2)
    {
        int i;
        int j;
        if (s != null && s1 != null && s2 != null)
        {
            if ((i = s.indexOf(s1)) != -1 && (j = s.indexOf(s2, s1.length() + i)) != -1)
            {
                return s.substring(s1.length() + i, j);
            }
        }
        return null;
    }

    public static String[] substringsBetween(String s, String s1, String s2)
    {
        if (s != null && !isEmpty(s1) && !isEmpty(s2))
        {
            int j = s.length();
            if (j == 0)
            {
                return ArrayUtils.EMPTY_STRING_ARRAY;
            }
            int k = s2.length();
            int l = s1.length();
            ArrayList arraylist = new ArrayList();
            int i = 0;
            do
            {
                if (i >= j - k)
                {
                    break;
                }
                i = s.indexOf(s1, i);
                if (i < 0)
                {
                    break;
                }
                i += l;
                int i1 = s.indexOf(s2, i);
                if (i1 < 0)
                {
                    break;
                }
                arraylist.add(s.substring(i, i1));
                i = i1 + k;
            } while (true);
            if (!arraylist.isEmpty())
            {
                return (String[])arraylist.toArray(new String[arraylist.size()]);
            }
        }
        return null;
    }

    public static String swapCase(String s)
    {
        if (isEmpty(s))
        {
            return s;
        }
        s = s.toCharArray();
        int i = 0;
        while (i < s.length) 
        {
            char c = s[i];
            if (Character.isUpperCase(c))
            {
                s[i] = Character.toLowerCase(c);
            } else
            if (Character.isTitleCase(c))
            {
                s[i] = Character.toLowerCase(c);
            } else
            if (Character.isLowerCase(c))
            {
                s[i] = Character.toUpperCase(c);
            }
            i++;
        }
        return new String(s);
    }

    public static String toEncodedString(byte abyte0[], Charset charset)
    {
        if (charset == null)
        {
            charset = Charset.defaultCharset();
        }
        return new String(abyte0, charset);
    }

    public static String toString(byte abyte0[], String s)
    {
        if (s != null)
        {
            return new String(abyte0, s);
        } else
        {
            return new String(abyte0, Charset.defaultCharset());
        }
    }

    private static int transpositions(CharSequence charsequence, CharSequence charsequence1)
    {
        int i = 0;
        int j;
        int k;
        for (j = 0; i < charsequence.length(); j = k)
        {
            k = j;
            if (charsequence.charAt(i) != charsequence1.charAt(i))
            {
                k = j + 1;
            }
            i++;
        }

        return j / 2;
    }

    public static String trim(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.trim();
        }
    }

    public static String trimToEmpty(String s)
    {
        if (s == null)
        {
            return "";
        } else
        {
            return s.trim();
        }
    }

    public static String trimToNull(String s)
    {
        String s1 = trim(s);
        s = s1;
        if (isEmpty(s1))
        {
            s = null;
        }
        return s;
    }

    public static String uncapitalize(String s)
    {
        if (s != null)
        {
            int i = s.length();
            char c;
            if (i != 0)
            {
                if (!Character.isLowerCase(c = s.charAt(0)))
                {
                    return (new StringBuilder(i)).append(Character.toLowerCase(c)).append(s.substring(1)).toString();
                }
            }
        }
        return s;
    }

    public static String upperCase(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toUpperCase();
        }
    }

    public static String upperCase(String s, Locale locale)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.toUpperCase(locale);
        }
    }

    public static String wrap(String s, char c)
    {
        if (isEmpty(s) || c == 0)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(c).append(s).append(c).toString();
        }
    }

    public static String wrap(String s, String s1)
    {
        if (isEmpty(s) || isEmpty(s1))
        {
            return s;
        } else
        {
            return s1.concat(s).concat(s1);
        }
    }
}
