// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            Predicate, Preconditions

public abstract class CharMatcher
    implements Predicate
{
    static abstract class FastMatcher extends CharMatcher
    {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public CharMatcher negate()
        {
            return new NegatedFastMatcher(this);
        }

        FastMatcher(String s)
        {
            super(s);
        }
    }

    static final class NegatedFastMatcher extends NegatedMatcher
    {

        final CharMatcher withToString(String s)
        {
            return new NegatedFastMatcher(s, original);
        }

        NegatedFastMatcher(CharMatcher charmatcher)
        {
            super(charmatcher);
        }

        private NegatedFastMatcher(String s, CharMatcher charmatcher)
        {
            super(s, charmatcher);
        }
    }

    static class NegatedMatcher extends CharMatcher
    {

        final CharMatcher original;

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return !original.matches(c);
        }

        public final boolean matchesAllOf(CharSequence charsequence)
        {
            return original.matchesNoneOf(charsequence);
        }

        public final boolean matchesNoneOf(CharSequence charsequence)
        {
            return original.matchesAllOf(charsequence);
        }

        public final CharMatcher negate()
        {
            return original;
        }

        CharMatcher withToString(String s)
        {
            return new NegatedMatcher(s, original);
        }

        NegatedMatcher(CharMatcher charmatcher)
        {
            this((new StringBuilder()).append(charmatcher).append(".negate()").toString(), charmatcher);
        }

        NegatedMatcher(String s, CharMatcher charmatcher)
        {
            super(s);
            original = charmatcher;
        }
    }

    static final class Or extends CharMatcher
    {

        final CharMatcher first;
        final CharMatcher second;

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return first.matches(c) || second.matches(c);
        }

        final CharMatcher withToString(String s)
        {
            return new Or(first, second, s);
        }

        Or(CharMatcher charmatcher, CharMatcher charmatcher1)
        {
            this(charmatcher, charmatcher1, (new StringBuilder("CharMatcher.or(")).append(charmatcher).append(", ").append(charmatcher1).append(")").toString());
        }

        private Or(CharMatcher charmatcher, CharMatcher charmatcher1, String s)
        {
            super(s);
            first = (CharMatcher)Preconditions.checkNotNull(charmatcher);
            second = (CharMatcher)Preconditions.checkNotNull(charmatcher1);
        }
    }

    static final class RangesMatcher extends CharMatcher
    {

        private final char rangeEnds[];
        private final char rangeStarts[];

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            int i = Arrays.binarySearch(rangeStarts, c);
            if (i < 0)
            {
                if ((i = ~i - 1) < 0 || c > rangeEnds[i])
                {
                    return false;
                }
            }
            return true;
        }

        RangesMatcher(String s, char ac[], char ac1[])
        {
            super(s);
            rangeStarts = ac;
            rangeEnds = ac1;
            int i;
            boolean flag;
            if (ac.length == ac1.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            i = 0;
            while (i < ac.length) 
            {
                if (ac[i] <= ac1[i])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
                if (i + 1 < ac.length)
                {
                    if (ac1[i] < ac[i + 1])
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    Preconditions.checkArgument(flag);
                }
                i++;
            }
        }
    }


    public static final CharMatcher ANY = new FastMatcher("CharMatcher.ANY") {

        public final String collapseFrom(CharSequence charsequence, char c)
        {
            if (charsequence.length() == 0)
            {
                return "";
            } else
            {
                return String.valueOf(c);
            }
        }

        public final int indexIn(CharSequence charsequence)
        {
            return charsequence.length() != 0 ? 0 : -1;
        }

        public final int indexIn(CharSequence charsequence, int j)
        {
            int l = charsequence.length();
            Preconditions.checkPositionIndex(j, l);
            int k = j;
            if (j == l)
            {
                k = -1;
            }
            return k;
        }

        public final boolean matches(char c)
        {
            return true;
        }

        public final boolean matchesAllOf(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return true;
        }

        public final boolean matchesNoneOf(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public final CharMatcher negate()
        {
            return NONE;
        }

        public final CharMatcher or(CharMatcher charmatcher)
        {
            Preconditions.checkNotNull(charmatcher);
            return this;
        }

    };
    public static final CharMatcher ASCII = inRange('\0', '\177', "CharMatcher.ASCII");
    public static final CharMatcher BREAKING_WHITESPACE = new CharMatcher() {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            switch (c)
            {
            default:
                if (c < '\u2000' || c > '\u200A')
                {
                    break;
                }
                // fall through

            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 32: // ' '
            case 133: 
            case 5760: 
            case 8232: 
            case 8233: 
            case 8287: 
            case 12288: 
                return true;

            case 8199: 
                return false;
            }
            return false;
        }

        public final String toString()
        {
            return "CharMatcher.BREAKING_WHITESPACE";
        }

    };
    public static final CharMatcher DIGIT;
    public static final CharMatcher INVISIBLE = new RangesMatcher("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final CharMatcher JAVA_DIGIT = new CharMatcher("CharMatcher.JAVA_DIGIT") {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return Character.isDigit(c);
        }

    };
    public static final CharMatcher JAVA_ISO_CONTROL = inRange('\0', '\037').or(inRange('\177', '\237')).withToString("CharMatcher.JAVA_ISO_CONTROL");
    public static final CharMatcher JAVA_LETTER = new CharMatcher("CharMatcher.JAVA_LETTER") {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return Character.isLetter(c);
        }

    };
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new CharMatcher("CharMatcher.JAVA_LETTER_OR_DIGIT") {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return Character.isLetterOrDigit(c);
        }

    };
    public static final CharMatcher JAVA_LOWER_CASE = new CharMatcher("CharMatcher.JAVA_LOWER_CASE") {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return Character.isLowerCase(c);
        }

    };
    public static final CharMatcher JAVA_UPPER_CASE = new CharMatcher("CharMatcher.JAVA_UPPER_CASE") {

        public final volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public final boolean matches(char c)
        {
            return Character.isUpperCase(c);
        }

    };
    private static final String NINES;
    public static final CharMatcher NONE = new FastMatcher("CharMatcher.NONE") {

        public final String collapseFrom(CharSequence charsequence, char c)
        {
            return charsequence.toString();
        }

        public final int indexIn(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return -1;
        }

        public final int indexIn(CharSequence charsequence, int j)
        {
            Preconditions.checkPositionIndex(j, charsequence.length());
            return -1;
        }

        public final boolean matches(char c)
        {
            return false;
        }

        public final boolean matchesAllOf(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public final boolean matchesNoneOf(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return true;
        }

        public final CharMatcher negate()
        {
            return ANY;
        }

        public final CharMatcher or(CharMatcher charmatcher)
        {
            return (CharMatcher)Preconditions.checkNotNull(charmatcher);
        }

        public final String trimLeadingFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

        public final String trimTrailingFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

    };
    public static final CharMatcher SINGLE_WIDTH = new RangesMatcher("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final CharMatcher WHITESPACE = new FastMatcher("WHITESPACE") {

        public final boolean matches(char c)
        {
            return "\u2002\u3000\r\205\u200A\u2005\u2000\u3000\u2029\013\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\240\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(0x6449bf0a * c >>> WHITESPACE_SHIFT) == c;
        }

    };
    static final int WHITESPACE_SHIFT = Integer.numberOfLeadingZeros(31);
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
        StringBuilder stringbuilder;
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            stringbuilder = new StringBuilder("CharMatcher.anyOf(\"");
            int j = charsequence.length;
            for (int i = 0; i < j; i++)
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
        return new CharMatcher(stringbuilder.toString(), charsequence) {

            final char val$chars[];

            public final volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public final boolean matches(char c)
            {
                return Arrays.binarySearch(chars, c) >= 0;
            }

            
            {
                chars = ac;
                super(s);
            }
        };
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

    public static CharMatcher inRange(char c, char c1)
    {
        boolean flag;
        if (c1 >= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return inRange(c, c1, (new StringBuilder("CharMatcher.inRange('")).append(showCharacter(c)).append("', '").append(showCharacter(c1)).append("')").toString());
    }

    private static CharMatcher inRange(char c, char c1, String s)
    {
        return new FastMatcher(s, c, c1) {

            final char val$endInclusive;
            final char val$startInclusive;

            public final boolean matches(char c2)
            {
                return startInclusive <= c2 && c2 <= endInclusive;
            }

            
            {
                startInclusive = c;
                endInclusive = c1;
                super(s);
            }
        };
    }

    public static CharMatcher is(char c)
    {
        return new FastMatcher((new StringBuilder("CharMatcher.is('")).append(showCharacter(c)).append("')").toString(), c) {

            final char val$match;

            public final boolean matches(char c1)
            {
                return c1 == match;
            }

            public final CharMatcher negate()
            {
                return isNot(match);
            }

            public final CharMatcher or(CharMatcher charmatcher)
            {
                if (charmatcher.matches(match))
                {
                    return charmatcher;
                } else
                {
                    return super.or(charmatcher);
                }
            }

            
            {
                match = c;
                super(s);
            }
        };
    }

    private static CharMatcher isEither(char c, char c1)
    {
        return new FastMatcher((new StringBuilder("CharMatcher.anyOf(\"")).append(showCharacter(c)).append(showCharacter(c1)).append("\")").toString(), c, c1) {

            final char val$match1;
            final char val$match2;

            public final boolean matches(char c2)
            {
                return c2 == match1 || c2 == match2;
            }

            
            {
                match1 = c;
                match2 = c1;
                super(s);
            }
        };
    }

    public static CharMatcher isNot(char c)
    {
        return new FastMatcher((new StringBuilder("CharMatcher.isNot('")).append(showCharacter(c)).append("')").toString(), c) {

            final char val$match;

            public final boolean matches(char c1)
            {
                return c1 != match;
            }

            public final CharMatcher negate()
            {
                return is(match);
            }

            public final CharMatcher or(CharMatcher charmatcher)
            {
                Object obj = this;
                if (charmatcher.matches(match))
                {
                    obj = ANY;
                }
                return ((CharMatcher) (obj));
            }

            
            {
                match = c;
                super(s);
            }
        };
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

    public final boolean apply(Character character)
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

    public boolean matchesNoneOf(CharSequence charsequence)
    {
        return indexIn(charsequence) == -1;
    }

    public CharMatcher negate()
    {
        return new NegatedMatcher(this);
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        return new Or(this, (CharMatcher)Preconditions.checkNotNull(charmatcher));
    }

    public String toString()
    {
        return description;
    }

    public final String trimAndCollapseFrom(CharSequence charsequence, char c)
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
}
