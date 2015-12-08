// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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
    private static class InitStripAccents
    {

        private static final Throwable java6Exception;
        private static final Method java6NormalizeMethod;
        private static final Object java6NormalizerFormNFD;
        private static final Pattern java6Pattern;
        private static final Method sunDecomposeMethod;
        private static final Throwable sunException;
        private static final Pattern sunPattern;

        static 
        {
            Object obj;
            Object obj1;
            Method method;
            Method method1;
            Object obj2;
            Method method2;
            sunPattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
            java6Pattern = sunPattern;
            obj1 = null;
            method = null;
            method1 = null;
            method2 = null;
            obj2 = null;
            obj = obj1;
            Object obj3 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer$Form");
            obj = obj1;
            obj1 = ((Class) (obj3)).getField("NFD").get(null);
            obj = obj1;
            obj3 = Thread.currentThread().getContextClassLoader().loadClass("java.text.Normalizer").getMethod("normalize", new Class[] {
                java/lang/CharSequence, obj3
            });
            method = ((Method) (obj3));
            obj = obj1;
            obj1 = method2;
_L2:
            java6Exception = ((Throwable) (obj1));
            java6NormalizerFormNFD = obj;
            java6NormalizeMethod = method;
            sunException = ((Throwable) (obj2));
            sunDecomposeMethod = method1;
            return;
            obj1;
            method2 = Thread.currentThread().getContextClassLoader().loadClass("sun.text.Normalizer").getMethod("decompose", new Class[] {
                java/lang/String, Boolean.TYPE, Integer.TYPE
            });
            method1 = method2;
            continue; /* Loop/switch isn't completed */
            obj2;
            if (true) goto _L2; else goto _L1
_L1:
        }








        private InitStripAccents()
        {
        }
    }


    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    private static final int PAD_LIMIT = 8192;
    private static final Pattern WHITESPACE_BLOCK = Pattern.compile("\\s+");

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
                    return (new StringBuilder()).append("...").append(abbreviate(s.substring(i), j - 3)).toString();
                } else
                {
                    return (new StringBuilder()).append("...").append(s.substring(s.length() - (j - 3))).toString();
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

    public static String capitalize(String s)
    {
        int i;
label0:
        {
            if (s != null)
            {
                i = s.length();
                if (i != 0)
                {
                    break label0;
                }
            }
            return s;
        }
        return (new StringBuilder(i)).append(Character.toTitleCase(s.charAt(0))).append(s.substring(1)).toString();
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
                return rightPad(leftPad(s, k / 2 + j, c), i, c);
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
                return rightPad(leftPad(s, k / 2 + j, s2), i, s2);
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

    public static int countMatches(CharSequence charsequence, CharSequence charsequence1)
    {
        if (!isEmpty(charsequence) && !isEmpty(charsequence1)) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        int i = 0;
        j = 0;
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
        if (charsequence == null)
        {
            return charsequence1 == null;
        } else
        {
            return charsequence.equals(charsequence1);
        }
    }

    public static boolean equalsIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            return charsequence == charsequence1;
        } else
        {
            return CharSequenceUtils.regionMatches(charsequence, true, 0, charsequence1, 0, Math.max(charsequence.length(), charsequence1.length()));
        }
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

    public static int getLevenshteinDistance(CharSequence charsequence, CharSequence charsequence1)
    {
        if (charsequence == null || charsequence1 == null)
        {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int l = charsequence.length();
        int k = charsequence1.length();
        if (l == 0)
        {
            return k;
        }
        if (k == 0)
        {
            return l;
        }
        int j = k;
        int i = l;
        CharSequence charsequence3 = charsequence;
        CharSequence charsequence2 = charsequence1;
        if (l > k)
        {
            i = k;
            j = charsequence.length();
            charsequence2 = charsequence;
            charsequence3 = charsequence1;
        }
        charsequence1 = new int[i + 1];
        charsequence = new int[i + 1];
        for (k = 0; k <= i; k++)
        {
            charsequence1[k] = k;
        }

        k = 1;
        do
        {
            CharSequence charsequence4 = charsequence1;
            if (k <= j)
            {
                char c = charsequence2.charAt(k - 1);
                charsequence[0] = k;
                int i1 = 1;
                while (i1 <= i) 
                {
                    int j1;
                    if (charsequence3.charAt(i1 - 1) == c)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = 1;
                    }
                    charsequence[i1] = Math.min(Math.min(charsequence[i1 - 1] + 1, charsequence4[i1] + 1), charsequence4[i1 - 1] + j1);
                    i1++;
                }
                charsequence1 = charsequence;
                charsequence = charsequence4;
                k++;
            } else
            {
                return charsequence4[i];
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
        int i1 = charsequence.length();
        int l = charsequence1.length();
        if (i1 == 0)
        {
            if (l <= i)
            {
                return l;
            } else
            {
                return -1;
            }
        }
        if (l == 0)
        {
            if (i1 <= i)
            {
                return i1;
            } else
            {
                return -1;
            }
        }
        int k = l;
        int j = i1;
        CharSequence charsequence3 = charsequence;
        CharSequence charsequence2 = charsequence1;
        if (i1 > l)
        {
            j = l;
            k = charsequence.length();
            charsequence2 = charsequence;
            charsequence3 = charsequence1;
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
        CharSequence charsequence4;
        do
        {
            charsequence4 = charsequence1;
            if (l > k)
            {
                break;
            }
            char c = charsequence2.charAt(l - 1);
            charsequence[0] = l;
            int j1 = Math.max(1, l - i);
            int k1 = Math.min(j, l + i);
            if (j1 > k1)
            {
                return -1;
            }
            if (j1 > 1)
            {
                charsequence[j1 - 1] = 0x7fffffff;
            }
            while (j1 <= k1) 
            {
                if (charsequence3.charAt(j1 - 1) == c)
                {
                    charsequence[j1] = charsequence4[j1 - 1];
                } else
                {
                    charsequence[j1] = Math.min(Math.min(charsequence[j1 - 1], charsequence4[j1]), charsequence4[j1 - 1]) + 1;
                }
                j1++;
            }
            charsequence1 = charsequence;
            charsequence = charsequence4;
            l++;
        } while (true);
        if (charsequence4[j] <= i)
        {
            return charsequence4[j];
        } else
        {
            return -1;
        }
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
            int i1 = acharsequence.length;
            int i = 0x7fffffff;
            j = 0;
            while (j < i1) 
            {
                CharSequence charsequence1 = acharsequence[j];
                int k;
                if (charsequence1 == null)
                {
                    k = i;
                } else
                {
                    int l = CharSequenceUtils.indexOf(charsequence, charsequence1, 0);
                    k = i;
                    if (l != -1)
                    {
                        k = i;
                        if (l < i)
                        {
                            k = l;
                        }
                    }
                }
                j++;
                i = k;
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
_L4:
        return j;
_L2:
        int l;
        int i1;
        l = charsequence.length();
        i1 = ac.length;
_L5:
        char c;
        int i;
        int k;
        for (i = 0; i >= l;)
        {
            break MISSING_BLOCK_LABEL_127;
        }

        c = charsequence.charAt(i);
        k = 0;
_L6:
        j = i;
        if (k >= i1) goto _L4; else goto _L3
_L3:
label0:
        {
            if (ac[k] != c || i < l - 1 && k < i1 - 1 && Character.isHighSurrogate(c) && ac[k + 1] != charsequence.charAt(i + 1))
            {
                break label0;
            }
            i++;
        }
          goto _L5
        k++;
          goto _L6
        return -1;
          goto _L5
    }

    public static int indexOfDifference(CharSequence charsequence, CharSequence charsequence1)
    {
        int j;
        if (charsequence == charsequence1)
        {
            j = -1;
        } else
        {
label0:
            {
                if (charsequence == null || charsequence1 == null)
                {
                    return 0;
                }
                for (int i = 0; i < charsequence.length() && i < charsequence1.length() && charsequence.charAt(i) == charsequence1.charAt(i); i++)
                {
                    break label0;
                }

                j = i;
                if (i >= charsequence1.length())
                {
                    j = i;
                    if (i >= charsequence.length())
                    {
                        return -1;
                    }
                }
            }
        }
        return j;
    }

    public static transient int indexOfDifference(CharSequence acharsequence[])
    {
        if (acharsequence != null && acharsequence.length > 1) goto _L2; else goto _L1
_L1:
        int j = -1;
_L6:
        return j;
_L2:
        int i;
        int k;
        int i1;
        int k1;
        boolean flag = false;
        boolean flag1 = true;
        k1 = acharsequence.length;
        i = 0x7fffffff;
        i1 = 0;
        j = 0;
        while (j < k1) 
        {
            if (acharsequence[j] == null)
            {
                flag = true;
                i = 0;
            } else
            {
                flag1 = false;
                i = Math.min(acharsequence[j].length(), i);
                i1 = Math.max(acharsequence[j].length(), i1);
            }
            j++;
        }
        if (flag1 || i1 == 0 && !flag)
        {
            return -1;
        }
        if (i == 0)
        {
            return 0;
        }
        k = -1;
        j = 0;
_L8:
        int l = k;
        if (j >= i) goto _L4; else goto _L3
_L3:
        int j1;
        char c;
        c = acharsequence[0].charAt(j);
        j1 = 1;
_L7:
        l = k;
        if (j1 < k1)
        {
            if (acharsequence[j1].charAt(j) == c)
            {
                break MISSING_BLOCK_LABEL_187;
            }
            l = j;
        }
        if (l == -1)
        {
            break MISSING_BLOCK_LABEL_196;
        }
_L4:
        if (l != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (i != i1) goto _L6; else goto _L5
_L5:
        return l;
        j1++;
          goto _L7
        j++;
        k = l;
          goto _L8
    }

    public static int indexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1)
    {
        return indexOfIgnoreCase(charsequence, charsequence1, 0);
    }

    public static int indexOfIgnoreCase(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        if (charsequence != null && charsequence1 != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        int k = (charsequence.length() - charsequence1.length()) + 1;
        if (j > k)
        {
            return -1;
        }
        if (charsequence1.length() == 0)
        {
            return j;
        }
        i = j;
label0:
        do
        {
label1:
            {
                if (i >= k)
                {
                    break label1;
                }
                j = i;
                if (CharSequenceUtils.regionMatches(charsequence, true, i, charsequence1, 0, charsequence1.length()))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
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
        if (charsequence != null && charsequence.length() != 0) goto _L2; else goto _L1
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
        if (charsequence != null && charsequence.length() != 0) goto _L2; else goto _L1
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
        if (charsequence != null)
        {
            int j = charsequence.length();
            if (j != 0)
            {
                int i = 0;
                while (i < j) 
                {
                    if (!Character.isWhitespace(charsequence.charAt(i)))
                    {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
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
        if (charsequence != null && charsequence.length() != 0) goto _L2; else goto _L1
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
        if (charsequence != null && acharsequence != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l = acharsequence.length;
        byte byte0 = -1;
        int i = 0;
        do
        {
            j = byte0;
            if (i >= l)
            {
                continue;
            }
            CharSequence charsequence1 = acharsequence[i];
            if (charsequence1 == null)
            {
                j = byte0;
            } else
            {
                int k = CharSequenceUtils.lastIndexOf(charsequence, charsequence1, charsequence.length());
                j = byte0;
                if (k > byte0)
                {
                    j = k;
                }
            }
            i++;
            byte0 = j;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
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
        j = i;
        if (i > charsequence.length() - charsequence1.length())
        {
            j = charsequence.length() - charsequence1.length();
        }
        if (j < 0)
        {
            return -1;
        }
        if (charsequence1.length() == 0)
        {
            return j;
        }
        i = j;
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
                for (i = 0; i < k; i++)
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
        if (s == null)
        {
            return null;
        } else
        {
            return WHITESPACE_BLOCK.matcher(trim(s)).replaceAll(" ");
        }
    }

    public static int ordinalIndexOf(CharSequence charsequence, CharSequence charsequence1, int i)
    {
        return ordinalIndexOf(charsequence, charsequence1, i, false);
    }

    private static int ordinalIndexOf(CharSequence charsequence, CharSequence charsequence1, int i, boolean flag)
    {
        int k;
        int i1;
        k = -1;
        i1 = k;
        if (charsequence == null) goto _L2; else goto _L1
_L1:
        i1 = k;
        if (charsequence1 == null) goto _L2; else goto _L3
_L3:
        if (i > 0) goto _L5; else goto _L4
_L4:
        i1 = k;
_L2:
        return i1;
_L5:
        int l;
        if (charsequence1.length() == 0)
        {
            if (flag)
            {
                i = charsequence.length();
            } else
            {
                i = 0;
            }
            return i;
        }
        boolean flag1 = false;
        l = ((flag1) ? 1 : 0);
        if (flag)
        {
            k = charsequence.length();
            l = ((flag1) ? 1 : 0);
        }
_L7:
        int j;
        if (flag)
        {
            j = CharSequenceUtils.lastIndexOf(charsequence, charsequence1, k - 1);
        } else
        {
            j = CharSequenceUtils.indexOf(charsequence, charsequence1, k + 1);
        }
        i1 = j;
        if (j < 0) goto _L2; else goto _L6
_L6:
        i1 = l + 1;
        l = i1;
        k = j;
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
        int k = i;
        if (i < 0)
        {
            k = 0;
        }
        i = k;
        if (k > l)
        {
            i = l;
        }
        k = j;
        if (j < 0)
        {
            k = 0;
        }
        j = k;
        if (k > l)
        {
            j = l;
        }
        int i1 = i;
        k = j;
        if (i > j)
        {
            k = i;
            i1 = j;
        }
        return (new StringBuilder(((l + i1) - k) + s2.length() + 1)).append(s.substring(0, i1)).append(s2).append(s.substring(k)).toString();
    }

    public static String remove(String s, char c)
    {
        if (isEmpty(s) || s.indexOf(c) == -1)
        {
            return s;
        }
        s = s.toCharArray();
        int j = 0;
        for (int i = 0; i < s.length;)
        {
            int k = j;
            if (s[i] != c)
            {
                s[j] = s[i];
                k = j + 1;
            }
            i++;
            j = k;
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

    private static String removeAccentsJava6(CharSequence charsequence)
        throws IllegalAccessException, InvocationTargetException
    {
        if (InitStripAccents.java6NormalizeMethod == null || InitStripAccents.java6NormalizerFormNFD == null)
        {
            throw new IllegalStateException("java.text.Normalizer is not available", InitStripAccents.java6Exception);
        } else
        {
            charsequence = (String)InitStripAccents.java6NormalizeMethod.invoke(null, new Object[] {
                charsequence, InitStripAccents.java6NormalizerFormNFD
            });
            return InitStripAccents.java6Pattern.matcher(charsequence).replaceAll("");
        }
    }

    private static String removeAccentsSUN(CharSequence charsequence)
        throws IllegalAccessException, InvocationTargetException
    {
        if (InitStripAccents.sunDecomposeMethod == null)
        {
            throw new IllegalStateException("sun.text.Normalizer is not available", InitStripAccents.sunException);
        } else
        {
            charsequence = (String)InitStripAccents.sunDecomposeMethod.invoke(null, new Object[] {
                charsequence, Boolean.FALSE, Integer.valueOf(0)
            });
            return InitStripAccents.sunPattern.matcher(charsequence).replaceAll("");
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
            int j = s.length();
            s1 = s;
            if (i != 1)
            {
                s1 = s;
                if (j != 0)
                {
                    if (j == 1 && i <= 8192)
                    {
                        return repeat(s.charAt(0), i);
                    }
                    int l = j * i;
                    StringBuilder stringbuilder;
                    switch (j)
                    {
                    default:
                        stringbuilder = new StringBuilder(l);
                        for (int k = 0; k < i; k++)
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
        if (!isEmpty(s) && !isEmpty(s1) && s2 != null && i != 0)
        {
            boolean flag = false;
            int l = s.indexOf(s1, 0);
            if (l != -1)
            {
                int k1 = s1.length();
                int j1 = s2.length() - k1;
                int k = j1;
                if (j1 < 0)
                {
                    k = 0;
                }
                StringBuilder stringbuilder;
                if (i < 0)
                {
                    j = 16;
                } else
                if (i <= 64)
                {
                    j = i;
                }
                stringbuilder = new StringBuilder(s.length() + k * j);
                j = i;
                i = ((flag) ? 1 : 0);
                k = l;
                do
                {
label0:
                    {
                        int i1 = i;
                        if (k != -1)
                        {
                            stringbuilder.append(s.substring(i, k)).append(s2);
                            i = k + k1;
                            j--;
                            if (j != 0)
                            {
                                break label0;
                            }
                            i1 = i;
                        }
                        stringbuilder.append(s.substring(i1));
                        return stringbuilder.toString();
                    }
                    k = s.indexOf(s1, i);
                } while (true);
            }
        }
        return s;
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
        if (!isEmpty(s) && !isEmpty(s1))
        {
            String s3 = s2;
            if (s2 == null)
            {
                s3 = "";
            }
            boolean flag = false;
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
        if (s != null && s.length() != 0 && as != null && as.length != 0 && as1 != null && as1.length != 0) goto _L2; else goto _L1
_L1:
        return s;
_L2:
        boolean aflag[];
        int j;
        int k;
        int i1;
        int k2;
        if (i < 0)
        {
            throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
        }
        k2 = as.length;
        j = as1.length;
        if (k2 != j)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Search and Replace array lengths don't match: ").append(k2).append(" vs ").append(j).toString());
        }
        aflag = new boolean[k2];
        j = -1;
        k = -1;
        i1 = 0;
_L4:
        int j1;
        int k1;
        if (i1 >= k2)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = k;
        k1 = j;
        if (!aflag[i1])
        {
            j1 = k;
            k1 = j;
            if (as[i1] != null)
            {
                j1 = k;
                k1 = j;
                if (as[i1].length() != 0)
                {
                    if (as1[i1] != null)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    k1 = j;
                    j1 = k;
                }
            }
        }
_L5:
        i1++;
        k = j1;
        j = k1;
        if (true) goto _L4; else goto _L3
_L3:
        int l1;
label0:
        {
            l1 = s.indexOf(as[i1]);
            if (l1 != -1)
            {
                break label0;
            }
            aflag[i1] = true;
            j1 = k;
            k1 = j;
        }
          goto _L5
        if (j == -1) goto _L7; else goto _L6
_L6:
        j1 = k;
        k1 = j;
        if (l1 >= j) goto _L5; else goto _L7
_L7:
        k1 = l1;
        j1 = i1;
          goto _L5
        if (j == -1) goto _L1; else goto _L8
_L8:
        StringBuilder stringbuilder;
        l1 = 0;
        j1 = 0;
        i1 = 0;
        while (i1 < as.length) 
        {
            k1 = j1;
            if (as[i1] != null)
            {
                if (as1[i1] == null)
                {
                    k1 = j1;
                } else
                {
                    int i2 = as1[i1].length() - as[i1].length();
                    k1 = j1;
                    if (i2 > 0)
                    {
                        k1 = j1 + i2 * 3;
                    }
                }
            }
            i1++;
            j1 = k1;
        }
        i1 = Math.min(j1, s.length() / 5);
        stringbuilder = new StringBuilder(s.length() + i1);
        k1 = j;
        j = l1;
        l1 = k;
_L10:
        int j2;
        if (k1 == -1)
        {
            break MISSING_BLOCK_LABEL_638;
        }
        for (; j < k1; j++)
        {
            stringbuilder.append(s.charAt(j));
        }

        stringbuilder.append(as1[l1]);
        j2 = k1 + as[l1].length();
        i1 = -1;
        j1 = -1;
        k = 0;
_L11:
        l1 = j1;
        j = j2;
        k1 = i1;
        if (k >= k2) goto _L10; else goto _L9
_L9:
        j = j1;
        k1 = i1;
        if (!aflag[k])
        {
            j = j1;
            k1 = i1;
            if (as[k] != null)
            {
                j = j1;
                k1 = i1;
                if (as[k].length() != 0)
                {
                    if (as1[k] == null)
                    {
                        k1 = i1;
                        j = j1;
                    } else
                    {
label1:
                        {
                            l1 = s.indexOf(as[k], j2);
                            if (l1 != -1)
                            {
                                break label1;
                            }
                            aflag[k] = true;
                            j = j1;
                            k1 = i1;
                        }
                    }
                }
            }
        }
_L14:
        k++;
        j1 = j;
        i1 = k1;
          goto _L11
        if (i1 == -1) goto _L13; else goto _L12
_L12:
        j = j1;
        k1 = i1;
        if (l1 >= i1) goto _L14; else goto _L13
_L13:
        k1 = l1;
        j = k;
          goto _L14
        for (int l = s.length(); j < l; j++)
        {
            stringbuilder.append(s.charAt(j));
        }

        s = stringbuilder.toString();
        if (!flag)
        {
            return s;
        } else
        {
            return replaceEach(s, as, as1, flag, i - 1);
        }
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
                for (i = 0; i < k; i++)
                {
                    s1[i] = ac[i % j];
                }

                return s.concat(new String(s1));
            }
        }
        return s1;
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
        if (s.length() == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        s = s.toCharArray();
        ArrayList arraylist = new ArrayList();
        int k = 0;
        int i = Character.getType(s[0]);
        int j = 0 + 1;
        while (j < s.length) 
        {
            int l = Character.getType(s[j]);
            if (l == i)
            {
                l = k;
                k = i;
            } else
            {
                if (flag && l == 2 && i == 1)
                {
                    int i1 = j - 1;
                    i = k;
                    if (i1 != k)
                    {
                        arraylist.add(new String(s, k, i1 - k));
                        i = i1;
                    }
                } else
                {
                    arraylist.add(new String(s, k, j - k));
                    i = j;
                }
                k = l;
                l = i;
            }
            j++;
            i = k;
            k = l;
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
        if (s == null)
        {
            return null;
        }
        int k = s.length();
        if (k == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        if (s1 == null || "".equals(s1))
        {
            return splitWorker(s, null, i, flag);
        }
        int l1 = s1.length();
        ArrayList arraylist = new ArrayList();
        int i1 = 0;
        int l = 0;
        for (int j = 0; j < k;)
        {
            int j1 = s.indexOf(s1, l);
            if (j1 > -1)
            {
                if (j1 > l)
                {
                    i1++;
                    if (i1 == i)
                    {
                        j = k;
                        arraylist.add(s.substring(l));
                    } else
                    {
                        arraylist.add(s.substring(l, j1));
                        l = j1 + l1;
                        j = j1;
                    }
                } else
                {
                    j = j1;
                    int k1 = i1;
                    if (flag)
                    {
                        k1 = i1 + 1;
                        if (k1 == i)
                        {
                            j = k;
                            arraylist.add(s.substring(l));
                        } else
                        {
                            arraylist.add("");
                            j = j1;
                        }
                    }
                    l = j + l1;
                    i1 = k1;
                }
            } else
            {
                arraylist.add(s.substring(l));
                j = k;
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
        int i = 0;
        int j = 0;
        boolean flag2 = false;
        boolean flag1 = false;
        while (i < k) 
        {
            if (s.charAt(i) == c)
            {
                if (flag2 || flag)
                {
                    arraylist.add(s.substring(j, i));
                    flag2 = false;
                    flag1 = true;
                }
                i++;
                j = i;
            } else
            {
                flag1 = false;
                flag2 = true;
                i++;
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
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (s == null)
        {
            return null;
        }
        j1 = s.length();
        if (j1 == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        arraylist = new ArrayList();
        j = 0;
        flag3 = false;
        l1 = 0;
        k2 = 0;
        k1 = 0;
        flag2 = false;
        i2 = 0;
        j2 = 0;
        i1 = 0;
        k = 0;
        flag1 = false;
        l = 0;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        k = 1;
        k1 = ((flag2) ? 1 : 0);
        j = l1;
        do
        {
            k2 = j;
            j2 = l;
            l1 = i1;
            i2 = k;
            i2 = k1;
            if (j >= j1)
            {
                break;
            }
            if (Character.isWhitespace(s.charAt(j)))
            {
                if (i1 != 0 || flag)
                {
                    l = 1;
                    i1 = k + 1;
                    if (k == i)
                    {
                        j = j1;
                        l = 0;
                    }
                    arraylist.add(s.substring(k1, j));
                    k1 = 0;
                    k = i1;
                    i1 = k1;
                }
                j++;
                k1 = j;
            } else
            {
                l = 0;
                i1 = 1;
                j++;
            }
        } while (true);
          goto _L3
_L2:
        if (s1.length() != 1)
        {
            break MISSING_BLOCK_LABEL_550;
        }
        j2 = s1.charAt(0);
        k1 = 1;
        i1 = k2;
        l = i2;
        while (j < j1) 
        {
            if (s.charAt(j) == j2)
            {
                if (l != 0 || flag)
                {
                    k = 1;
                    l = k1 + 1;
                    if (k1 == i)
                    {
                        j = j1;
                        k = 0;
                    }
                    arraylist.add(s.substring(i1, j));
                    i1 = 0;
                } else
                {
                    i1 = l;
                    l = k1;
                }
                j++;
                l1 = j;
                k1 = l;
                l = i1;
                i1 = l1;
            } else
            {
                k = 0;
                l = 1;
                j++;
            }
        }
        if (l != 0 || flag && k != 0)
        {
            arraylist.add(s.substring(i1, j));
        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
_L5:
        k2 = j;
        j2 = k;
        l1 = i1;
        i2 = l;
        i2 = k1;
        if (j < j1)
        {
            if (s1.indexOf(s.charAt(j)) >= 0)
            {
                if (i1 != 0 || flag)
                {
                    k = 1;
                    i1 = l + 1;
                    if (l == i)
                    {
                        j = j1;
                        k = 0;
                    }
                    arraylist.add(s.substring(k1, j));
                    k1 = 0;
                    l = i1;
                    i1 = k1;
                }
                j++;
                k1 = j;
            } else
            {
                k = 0;
                i1 = 1;
                j++;
            }
            continue; /* Loop/switch isn't completed */
        }
_L3:
        j = k2;
        k = j2;
        l = l1;
        i1 = i2;
        break MISSING_BLOCK_LABEL_340;
        l = 1;
        j = ((flag3) ? 1 : 0);
        k = ((flag1) ? 1 : 0);
        i1 = j2;
        if (true) goto _L5; else goto _L4
_L4:
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
        }
        try
        {
            if (InitStripAccents.java6NormalizeMethod != null)
            {
                return removeAccentsJava6(s);
            }
            if (InitStripAccents.sunDecomposeMethod != null)
            {
                return removeAccentsSUN(s);
            } else
            {
                throw new UnsupportedOperationException((new StringBuilder()).append("The stripAccents(CharSequence) method requires at least Java6, but got: ").append(InitStripAccents.java6Exception).append("; or a Sun JVM: ").append(InitStripAccents.sunException).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("IllegalArgumentException occurred", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("IllegalAccessException occurred", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("InvocationTargetException occurred", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException("SecurityException occurred", s);
        }
    }

    public static transient String[] stripAll(String as[])
    {
        return stripAll(as, null);
    }

    public static String[] stripAll(String as[], String s)
    {
        if (as == null) goto _L2; else goto _L1
_L1:
        int j = as.length;
        if (j != 0) goto _L3; else goto _L2
_L2:
        String as1[] = as;
_L5:
        return as1;
_L3:
        String as2[] = new String[j];
        int i = 0;
        do
        {
            as1 = as2;
            if (i >= j)
            {
                continue;
            }
            as2[i] = strip(as[i], s);
            i++;
        } while (true);
        if (true) goto _L5; else goto _L4
_L4:
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
        if (s1.length() == 0) goto _L2; else goto _L4
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
        if (s1.length() == 0) goto _L2; else goto _L4
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
        if (s == null)
        {
            return null;
        }
        String s1 = strip(s, null);
        s = s1;
        if (s1.length() == 0)
        {
            s = null;
        }
        return s;
    }

    public static String substring(String s, int i)
    {
        if (s == null)
        {
            return null;
        }
        int j = i;
        if (i < 0)
        {
            j = i + s.length();
        }
        i = j;
        if (j < 0)
        {
            i = 0;
        }
        if (i > s.length())
        {
            return "";
        } else
        {
            return s.substring(i);
        }
    }

    public static String substring(String s, int i, int j)
    {
        if (s == null)
        {
            return null;
        }
        int k = j;
        if (j < 0)
        {
            k = j + s.length();
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
        j = i;
        if (i < 0)
        {
            j = 0;
        }
        return s.substring(k, j);
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
            return s.substring(s1.length() + i);
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
            return s.substring(s1.length() + i);
        }
    }

    public static String substringBefore(String s, String s1)
    {
        if (!isEmpty(s) && s1 != null)
        {
            if (s1.length() == 0)
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
        if (s != null && !isEmpty(s1) && !isEmpty(s2)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        ArrayList arraylist;
        int i;
        int j;
        int k;
        int l;
        j = s.length();
        if (j == 0)
        {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        k = s2.length();
        l = s1.length();
        arraylist = new ArrayList();
        i = 0;
_L7:
        if (i >= j - k) goto _L4; else goto _L3
_L3:
        i = s.indexOf(s1, i);
        if (i >= 0) goto _L5; else goto _L4
_L4:
        if (!arraylist.isEmpty())
        {
            return (String[])arraylist.toArray(new String[arraylist.size()]);
        }
          goto _L1
_L5:
        int i1;
        i += l;
        i1 = s.indexOf(s2, i);
        if (i1 < 0) goto _L4; else goto _L6
_L6:
        arraylist.add(s.substring(i, i1));
        i = i1 + k;
          goto _L7
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

    public static String toString(byte abyte0[], String s)
        throws UnsupportedEncodingException
    {
        if (s == null)
        {
            return new String(abyte0);
        } else
        {
            return new String(abyte0, s);
        }
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
        int i;
label0:
        {
            if (s != null)
            {
                i = s.length();
                if (i != 0)
                {
                    break label0;
                }
            }
            return s;
        }
        return (new StringBuilder(i)).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
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

}
