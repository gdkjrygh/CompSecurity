// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;

// Referenced classes of package com.google.common.base:
//            Predicate, Preconditions, SmallCharMatcher, Platform

public abstract class CharMatcher
    implements Predicate
{

    public static final CharMatcher ANY = new _cls7("CharMatcher.ANY");
    public static final CharMatcher ASCII = inRange('\0', '\177', "CharMatcher.ASCII");
    public static final CharMatcher BREAKING_WHITESPACE = new _cls1();
    public static final CharMatcher DIGIT;
    private static final int DISTINCT_CHARS = 0x10000;
    public static final CharMatcher INVISIBLE = new RangesMatcher("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final CharMatcher JAVA_DIGIT = new _cls2("CharMatcher.JAVA_DIGIT");
    public static final CharMatcher JAVA_ISO_CONTROL = inRange('\0', '\037').or(inRange('\177', '\237')).withToString("CharMatcher.JAVA_ISO_CONTROL");
    public static final CharMatcher JAVA_LETTER = new _cls3("CharMatcher.JAVA_LETTER");
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new _cls4("CharMatcher.JAVA_LETTER_OR_DIGIT");
    public static final CharMatcher JAVA_LOWER_CASE = new _cls6("CharMatcher.JAVA_LOWER_CASE");
    public static final CharMatcher JAVA_UPPER_CASE = new _cls5("CharMatcher.JAVA_UPPER_CASE");
    private static final String NINES;
    public static final CharMatcher NONE = new _cls8("CharMatcher.NONE");
    public static final CharMatcher SINGLE_WIDTH = new RangesMatcher("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final CharMatcher WHITESPACE = new _cls15("WHITESPACE");
    static final int WHITESPACE_MULTIPLIER = 0x6449bf0a;
    static final int WHITESPACE_SHIFT = Integer.numberOfLeadingZeros(31);
    static final String WHITESPACE_TABLE = "\u2002\u3000\r\205\u200A\u2005\u2000\u3000\u2029\013\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\240\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000";
    private static final String ZEROES = "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10";
    final String description;

    protected CharMatcher()
    {
        description = super.toString();
    }

    CharMatcher(String s)
    {
        description = s;
    }

    public static CharMatcher anyOf(CharSequence charsequence)
    {
        int i = 0;
        StringBuilder stringbuilder;
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            stringbuilder = new StringBuilder("CharMatcher.anyOf(\"");
            for (int j = charsequence.length; i < j; i++)
            {
                stringbuilder.append(showCharacter(charsequence[i]));
            }

            break;

        case 0: // '\0'
            return NONE;

        case 1: // '\001'
            return is(charsequence.charAt(0));

        case 2: // '\002'
            return isEither(charsequence.charAt(0), charsequence.charAt(1));
        }
        stringbuilder.append("\")");
        return new _cls11(stringbuilder.toString(), charsequence);
    }

    private String finishCollapseFrom(CharSequence charsequence, int i, int j, char c, StringBuilder stringbuilder, boolean flag)
    {
        boolean flag1 = flag;
        while (i < j) 
        {
            char c1 = charsequence.charAt(i);
            if (matches(c1))
            {
                flag = flag1;
                if (!flag1)
                {
                    stringbuilder.append(c);
                    flag = true;
                }
            } else
            {
                stringbuilder.append(c1);
                flag = false;
            }
            i++;
            flag1 = flag;
        }
        return stringbuilder.toString();
    }

    public static CharMatcher forPredicate(Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (predicate instanceof CharMatcher)
        {
            return (CharMatcher)predicate;
        } else
        {
            String s = String.valueOf(String.valueOf(predicate));
            return new _cls14((new StringBuilder(s.length() + 26)).append("CharMatcher.forPredicate(").append(s).append(")").toString(), predicate);
        }
    }

    public static CharMatcher inRange(char c, char c1)
    {
        String s;
        String s1;
        boolean flag;
        if (c1 >= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        s = String.valueOf(String.valueOf(showCharacter(c)));
        s1 = String.valueOf(String.valueOf(showCharacter(c1)));
        return inRange(c, c1, (new StringBuilder(s.length() + 27 + s1.length())).append("CharMatcher.inRange('").append(s).append("', '").append(s1).append("')").toString());
    }

    static CharMatcher inRange(char c, char c1, String s)
    {
        return new _cls13(s, c, c1);
    }

    public static CharMatcher is(char c)
    {
        String s = String.valueOf(String.valueOf(showCharacter(c)));
        return new _cls9((new StringBuilder(s.length() + 18)).append("CharMatcher.is('").append(s).append("')").toString(), c);
    }

    private static CharMatcher isEither(char c, char c1)
    {
        String s = String.valueOf(String.valueOf(showCharacter(c)));
        String s1 = String.valueOf(String.valueOf(showCharacter(c1)));
        return new _cls12((new StringBuilder(s.length() + 21 + s1.length())).append("CharMatcher.anyOf(\"").append(s).append(s1).append("\")").toString(), c, c1);
    }

    public static CharMatcher isNot(char c)
    {
        String s = String.valueOf(String.valueOf(showCharacter(c)));
        return new _cls10((new StringBuilder(s.length() + 21)).append("CharMatcher.isNot('").append(s).append("')").toString(), c);
    }

    private static boolean isSmall(int i, int j)
    {
        return i <= 1023 && j > i * 4 * 16;
    }

    public static CharMatcher noneOf(CharSequence charsequence)
    {
        return anyOf(charsequence).negate();
    }

    private static CharMatcher precomputedPositive(int i, BitSet bitset, String s)
    {
        switch (i)
        {
        default:
            if (isSmall(i, bitset.length()))
            {
                return SmallCharMatcher.from(bitset, s);
            } else
            {
                return new BitSetMatcher(bitset, s, null);
            }

        case 0: // '\0'
            return NONE;

        case 1: // '\001'
            return is((char)bitset.nextSetBit(0));

        case 2: // '\002'
            char c = (char)bitset.nextSetBit(0);
            return isEither(c, (char)bitset.nextSetBit(c + 1));
        }
    }

    private static String showCharacter(char c)
    {
        char ac[] = new char[6];
        char[] _tmp = ac;
        ac[0] = '\\';
        ac[1] = 'u';
        ac[2] = '\0';
        ac[3] = '\0';
        ac[4] = '\0';
        ac[5] = '\0';
        boolean flag = false;
        char c1 = c;
        for (c = flag; c < '\004'; c++)
        {
            ac[5 - c] = "0123456789ABCDEF".charAt(c1 & 0xf);
            c1 >>= '\004';
        }

        return String.copyValueOf(ac);
    }

    public CharMatcher and(CharMatcher charmatcher)
    {
        return new And((CharMatcher)Preconditions.checkNotNull(charmatcher));
    }

    public boolean apply(Character character)
    {
        return matches(character.charValue());
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Character)obj);
    }

    public String collapseFrom(CharSequence charsequence, char c)
    {
label0:
        {
            int k = charsequence.length();
            int i = 0;
            do
            {
                if (i >= k)
                {
                    break label0;
                }
                char c1 = charsequence.charAt(i);
                int j = i;
                if (matches(c1))
                {
                    if (c1 != c || i != k - 1 && matches(charsequence.charAt(i + 1)))
                    {
                        break;
                    }
                    j = i + 1;
                }
                i = j + 1;
            } while (true);
            return finishCollapseFrom(charsequence, i + 1, k, c, (new StringBuilder(k)).append(charsequence.subSequence(0, i)).append(c), true);
        }
        return charsequence.toString();
    }

    public int countIn(CharSequence charsequence)
    {
        int i = 0;
        int j;
        int k;
        for (j = 0; i < charsequence.length(); j = k)
        {
            k = j;
            if (matches(charsequence.charAt(i)))
            {
                k = j + 1;
            }
            i++;
        }

        return j;
    }

    public int indexIn(CharSequence charsequence)
    {
        int j = charsequence.length();
        for (int i = 0; i < j; i++)
        {
            if (matches(charsequence.charAt(i)))
            {
                return i;
            }
        }

        return -1;
    }

    public int indexIn(CharSequence charsequence, int i)
    {
        int j = charsequence.length();
        Preconditions.checkPositionIndex(i, j);
        for (; i < j; i++)
        {
            if (matches(charsequence.charAt(i)))
            {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexIn(CharSequence charsequence)
    {
        for (int i = charsequence.length() - 1; i >= 0; i--)
        {
            if (matches(charsequence.charAt(i)))
            {
                return i;
            }
        }

        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charsequence)
    {
        for (int i = charsequence.length() - 1; i >= 0; i--)
        {
            if (!matches(charsequence.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }

    public boolean matchesAnyOf(CharSequence charsequence)
    {
        return !matchesNoneOf(charsequence);
    }

    public boolean matchesNoneOf(CharSequence charsequence)
    {
        return indexIn(charsequence) == -1;
    }

    public CharMatcher negate()
    {
        return new NegatedMatcher();
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        return new Or((CharMatcher)Preconditions.checkNotNull(charmatcher));
    }

    public CharMatcher precomputed()
    {
        return Platform.precomputeCharMatcher(this);
    }

    CharMatcher precomputedInternal()
    {
        BitSet bitset = new BitSet();
        setBits(bitset);
        int i = bitset.cardinality();
        if (i * 2 <= 0x10000)
        {
            return precomputedPositive(i, bitset, description);
        }
        bitset.flip(0, 0x10000);
        String s;
        if (description.endsWith(".negate()"))
        {
            s = description.substring(0, description.length() - ".negate()".length());
        } else
        {
            s = String.valueOf(description);
            String s1 = String.valueOf(".negate()");
            if (s1.length() != 0)
            {
                s = s.concat(s1);
            } else
            {
                s = new String(s);
            }
        }
        return new NegatedFastMatcher(toString(), precomputedPositive(0x10000 - i, bitset, s));
    }

    public String removeFrom(CharSequence charsequence)
    {
        charsequence = charsequence.toString();
        int j = indexIn(charsequence);
        if (j == -1)
        {
            return charsequence;
        }
        charsequence = charsequence.toCharArray();
        int i = 1;
        do
        {
            j++;
            if (j != charsequence.length)
            {
                if (!matches(charsequence[j]))
                {
                    charsequence[j - i] = charsequence[j];
                } else
                {
                    i++;
                }
            } else
            {
                return new String(charsequence, 0, j - i);
            }
        } while (true);
    }

    public String replaceFrom(CharSequence charsequence, char c)
    {
        charsequence = charsequence.toString();
        int i = indexIn(charsequence);
        if (i == -1)
        {
            return charsequence;
        }
        charsequence = charsequence.toCharArray();
        charsequence[i] = c;
        for (i++; i < charsequence.length; i++)
        {
            if (matches(charsequence[i]))
            {
                charsequence[i] = c;
            }
        }

        return new String(charsequence);
    }

    public String replaceFrom(CharSequence charsequence, CharSequence charsequence1)
    {
        int j = 0;
        int i = charsequence1.length();
        if (i == 0)
        {
            return removeFrom(charsequence);
        }
        if (i == 1)
        {
            return replaceFrom(charsequence, charsequence1.charAt(0));
        }
        charsequence = charsequence.toString();
        i = indexIn(charsequence);
        if (i == -1)
        {
            return charsequence;
        }
        int i1 = charsequence.length();
        StringBuilder stringbuilder = new StringBuilder((i1 * 3) / 2 + 16);
        int k;
        int l;
        do
        {
            stringbuilder.append(charsequence, j, i);
            stringbuilder.append(charsequence1);
            k = i + 1;
            l = indexIn(charsequence, k);
            j = k;
            i = l;
        } while (l != -1);
        stringbuilder.append(charsequence, k, i1);
        return stringbuilder.toString();
    }

    public String retainFrom(CharSequence charsequence)
    {
        return negate().removeFrom(charsequence);
    }

    void setBits(BitSet bitset)
    {
        for (int i = 65535; i >= 0; i--)
        {
            if (matches((char)i))
            {
                bitset.set(i);
            }
        }

    }

    public String toString()
    {
        return description;
    }

    public String trimAndCollapseFrom(CharSequence charsequence, char c)
    {
        int k = charsequence.length();
        int i;
        for (i = 0; i < k && matches(charsequence.charAt(i)); i++) { }
        int j;
        for (j = k - 1; j > i && matches(charsequence.charAt(j)); j--) { }
        if (i == 0 && j == k - 1)
        {
            return collapseFrom(charsequence, c);
        } else
        {
            return finishCollapseFrom(charsequence, i, j + 1, c, new StringBuilder((j + 1) - i), false);
        }
    }

    public String trimFrom(CharSequence charsequence)
    {
        int j = charsequence.length();
        int i;
        for (i = 0; i < j && matches(charsequence.charAt(i)); i++) { }
        for (j--; j > i && matches(charsequence.charAt(j)); j--) { }
        return charsequence.subSequence(i, j + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charsequence)
    {
        int j = charsequence.length();
        for (int i = 0; i < j; i++)
        {
            if (!matches(charsequence.charAt(i)))
            {
                return charsequence.subSequence(i, j).toString();
            }
        }

        return "";
    }

    public String trimTrailingFrom(CharSequence charsequence)
    {
        for (int i = charsequence.length() - 1; i >= 0; i--)
        {
            if (!matches(charsequence.charAt(i)))
            {
                return charsequence.subSequence(0, i + 1).toString();
            }
        }

        return "";
    }

    CharMatcher withToString(String s)
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder(31);
        for (int i = 0; i < 31; i++)
        {
            stringbuilder.append((char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".charAt(i) + 9));
        }

        NINES = stringbuilder.toString();
        DIGIT = new RangesMatcher("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), NINES.toCharArray());
    }

    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls10 {}


    /* member class not found */
    class BitSetMatcher {}


    /* member class not found */
    class And {}


    /* member class not found */
    class NegatedMatcher {}


    /* member class not found */
    class Or {}


    /* member class not found */
    class NegatedFastMatcher {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class RangesMatcher {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls15 {}

}
