// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            Predicate, Preconditions, Platform

public abstract class CharMatcher
    implements Predicate
{
    private static class And extends CharMatcher
    {

        List components;

        public CharMatcher and(CharMatcher charmatcher)
        {
            ArrayList arraylist = new ArrayList(components);
            arraylist.add(Preconditions.checkNotNull(charmatcher));
            return new And(arraylist);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            for (Iterator iterator = components.iterator(); iterator.hasNext();)
            {
                if (!((CharMatcher)iterator.next()).matches(c))
                {
                    return false;
                }
            }

            return true;
        }

        And(List list)
        {
            components = list;
        }
    }

    private static final class LookupTable
    {

        int data[];

        boolean get(char c)
        {
            return (data[c >> 5] & 1 << c) != 0;
        }

        void set(char c)
        {
            int ai[] = data;
            int i = c >> 5;
            ai[i] = ai[i] | 1 << c;
        }

        private LookupTable()
        {
            data = new int[2048];
        }

    }

    private static class Or extends CharMatcher
    {

        List components;

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            for (Iterator iterator = components.iterator(); iterator.hasNext();)
            {
                if (((CharMatcher)iterator.next()).matches(c))
                {
                    return true;
                }
            }

            return false;
        }

        public CharMatcher or(CharMatcher charmatcher)
        {
            ArrayList arraylist = new ArrayList(components);
            arraylist.add(Preconditions.checkNotNull(charmatcher));
            return new Or(arraylist);
        }

        void setBits(LookupTable lookuptable)
        {
            for (Iterator iterator = components.iterator(); iterator.hasNext(); ((CharMatcher)iterator.next()).setBits(lookuptable)) { }
        }

        Or(List list)
        {
            components = list;
        }
    }


    public static final CharMatcher ANY = new CharMatcher() {

        public CharMatcher and(CharMatcher charmatcher1)
        {
            return (CharMatcher)Preconditions.checkNotNull(charmatcher1);
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public String collapseFrom(CharSequence charsequence, char c1)
        {
            if (charsequence.length() == 0)
            {
                return "";
            } else
            {
                return String.valueOf(c1);
            }
        }

        public int countIn(CharSequence charsequence)
        {
            return charsequence.length();
        }

        public int indexIn(CharSequence charsequence)
        {
            return charsequence.length() != 0 ? 0 : -1;
        }

        public int indexIn(CharSequence charsequence, int k)
        {
            int i1 = charsequence.length();
            Preconditions.checkPositionIndex(k, i1);
            int l = k;
            if (k == i1)
            {
                l = -1;
            }
            return l;
        }

        public int lastIndexIn(CharSequence charsequence)
        {
            return charsequence.length() - 1;
        }

        public boolean matches(char c1)
        {
            return true;
        }

        public boolean matchesAllOf(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return true;
        }

        public boolean matchesNoneOf(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public CharMatcher negate()
        {
            return NONE;
        }

        public CharMatcher or(CharMatcher charmatcher1)
        {
            Preconditions.checkNotNull(charmatcher1);
            return this;
        }

        public CharMatcher precomputed()
        {
            return this;
        }

        public String removeFrom(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return "";
        }

        public String replaceFrom(CharSequence charsequence, char c1)
        {
            charsequence = new char[charsequence.length()];
            Arrays.fill(charsequence, c1);
            return new String(charsequence);
        }

        public String replaceFrom(CharSequence charsequence, CharSequence charsequence1)
        {
            StringBuilder stringbuilder = new StringBuilder(charsequence.length() * charsequence1.length());
            for (int k = 0; k < charsequence.length(); k++)
            {
                stringbuilder.append(charsequence1);
            }

            return stringbuilder.toString();
        }

        public String trimFrom(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return "";
        }

    };
    public static final CharMatcher ASCII = inRange('\0', '\177');
    public static final CharMatcher BREAKING_WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200A')).precomputed();
    private static final String BREAKING_WHITESPACE_CHARS = "\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000";
    public static final CharMatcher DIGIT;
    public static final CharMatcher INVISIBLE = inRange('\0', ' ').or(inRange('\177', '\240')).or(is('\255')).or(inRange('\u0600', '\u0603')).or(anyOf("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).or(inRange('\u2000', '\u200F')).or(inRange('\u2028', '\u202F')).or(inRange('\u205F', '\u2064')).or(inRange('\u206A', '\u206F')).or(is('\u3000')).or(inRange('\uD800', '\uF8FF')).or(anyOf("\uFEFF\uFFF9\uFFFA\uFFFB")).precomputed();
    public static final CharMatcher JAVA_DIGIT = new CharMatcher() {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c1)
        {
            return Character.isDigit(c1);
        }

    };
    public static final CharMatcher JAVA_ISO_CONTROL = inRange('\0', '\037').or(inRange('\177', '\237'));
    public static final CharMatcher JAVA_LETTER = new CharMatcher() {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c1)
        {
            return Character.isLetter(c1);
        }

    };
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new CharMatcher() {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c1)
        {
            return Character.isLetterOrDigit(c1);
        }

    };
    public static final CharMatcher JAVA_LOWER_CASE = new CharMatcher() {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c1)
        {
            return Character.isLowerCase(c1);
        }

    };
    public static final CharMatcher JAVA_UPPER_CASE = new CharMatcher() {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c1)
        {
            return Character.isUpperCase(c1);
        }

    };
    public static final CharMatcher JAVA_WHITESPACE = inRange('\t', '\r').or(inRange('\034', ' ')).or(is('\u1680')).or(is('\u180E')).or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200B')).or(inRange('\u2028', '\u2029')).or(is('\u205F')).or(is('\u3000')).precomputed();
    public static final CharMatcher NONE = new CharMatcher() {

        public CharMatcher and(CharMatcher charmatcher1)
        {
            Preconditions.checkNotNull(charmatcher1);
            return this;
        }

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public String collapseFrom(CharSequence charsequence, char c1)
        {
            return charsequence.toString();
        }

        public int countIn(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return 0;
        }

        public int indexIn(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return -1;
        }

        public int indexIn(CharSequence charsequence, int k)
        {
            Preconditions.checkPositionIndex(k, charsequence.length());
            return -1;
        }

        public int lastIndexIn(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return -1;
        }

        public boolean matches(char c1)
        {
            return false;
        }

        public boolean matchesAllOf(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public boolean matchesNoneOf(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return true;
        }

        public CharMatcher negate()
        {
            return ANY;
        }

        public CharMatcher or(CharMatcher charmatcher1)
        {
            return (CharMatcher)Preconditions.checkNotNull(charmatcher1);
        }

        public CharMatcher precomputed()
        {
            return this;
        }

        public String removeFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

        public String replaceFrom(CharSequence charsequence, char c1)
        {
            return charsequence.toString();
        }

        public String replaceFrom(CharSequence charsequence, CharSequence charsequence1)
        {
            Preconditions.checkNotNull(charsequence1);
            return charsequence.toString();
        }

        void setBits(LookupTable lookuptable)
        {
        }

        public String trimFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

    };
    private static final String NON_BREAKING_WHITESPACE_CHARS = "\240\u180E\u202F";
    public static final CharMatcher SINGLE_WIDTH = inRange('\0', '\u04F9').or(is('\u05BE')).or(inRange('\u05D0', '\u05EA')).or(is('\u05F3')).or(is('\u05F4')).or(inRange('\u0600', '\u06FF')).or(inRange('\u0750', '\u077F')).or(inRange('\u0E00', '\u0E7F')).or(inRange('\u1E00', '\u20AF')).or(inRange('\u2100', '\u213A')).or(inRange('\uFB50', '\uFDFF')).or(inRange('\uFE70', '\uFEFF')).or(inRange('\uFF61', '\uFFDC')).precomputed();
    public static final CharMatcher WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").or(inRange('\u2000', '\u200A')).precomputed();

    public CharMatcher()
    {
    }

    public static CharMatcher anyOf(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new CharMatcher(charsequence) {

                final char val$chars[];

                public volatile boolean apply(Object obj)
                {
                    return apply((Character)obj);
                }

                public boolean matches(char c)
                {
                    return Arrays.binarySearch(chars, c) >= 0;
                }

                void setBits(LookupTable lookuptable)
                {
                    char ac[] = chars;
                    int j = ac.length;
                    for (int i = 0; i < j; i++)
                    {
                        lookuptable.set(ac[i]);
                    }

                }

            
            {
                chars = ac;
                super();
            }
            };

        case 0: // '\0'
            return NONE;

        case 1: // '\001'
            return is(charsequence.charAt(0));

        case 2: // '\002'
            return new CharMatcher(charsequence.charAt(0), charsequence.charAt(1)) {

                final char val$match1;
                final char val$match2;

                public volatile boolean apply(Object obj)
                {
                    return apply((Character)obj);
                }

                public boolean matches(char c)
                {
                    return c == match1 || c == match2;
                }

                public CharMatcher precomputed()
                {
                    return this;
                }

                void setBits(LookupTable lookuptable)
                {
                    lookuptable.set(match1);
                    lookuptable.set(match2);
                }

            
            {
                match1 = c;
                match2 = c1;
                super();
            }
            };
        }
    }

    public static CharMatcher forPredicate(Predicate predicate)
    {
        Preconditions.checkNotNull(predicate);
        if (predicate instanceof CharMatcher)
        {
            return (CharMatcher)predicate;
        } else
        {
            return new CharMatcher(predicate) {

                final Predicate val$predicate;

                public boolean apply(Character character)
                {
                    return predicate.apply(Preconditions.checkNotNull(character));
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((Character)obj);
                }

                public boolean matches(char c)
                {
                    return predicate.apply(Character.valueOf(c));
                }

            
            {
                predicate = predicate1;
                super();
            }
            };
        }
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
        return new CharMatcher(c, c1) {

            final char val$endInclusive;
            final char val$startInclusive;

            public volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public boolean matches(char c2)
            {
                return startInclusive <= c2 && c2 <= endInclusive;
            }

            public CharMatcher precomputed()
            {
                return this;
            }

            void setBits(LookupTable lookuptable)
            {
                char c2 = startInclusive;
                do
                {
                    lookuptable.set(c2);
                    char c3 = (char)(c2 + 1);
                    if (c2 == endInclusive)
                    {
                        return;
                    }
                    c2 = c3;
                } while (true);
            }

            
            {
                startInclusive = c;
                endInclusive = c1;
                super();
            }
        };
    }

    public static CharMatcher is(char c)
    {
        return new CharMatcher(c) {

            final char val$match;

            public CharMatcher and(CharMatcher charmatcher)
            {
                if (charmatcher.matches(match))
                {
                    return this;
                } else
                {
                    return NONE;
                }
            }

            public volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public boolean matches(char c1)
            {
                return c1 == match;
            }

            public CharMatcher negate()
            {
                return isNot(match);
            }

            public CharMatcher or(CharMatcher charmatcher)
            {
                if (charmatcher.matches(match))
                {
                    return charmatcher;
                } else
                {
                    return or(charmatcher);
                }
            }

            public CharMatcher precomputed()
            {
                return this;
            }

            public String replaceFrom(CharSequence charsequence, char c1)
            {
                return charsequence.toString().replace(match, c1);
            }

            void setBits(LookupTable lookuptable)
            {
                lookuptable.set(match);
            }

            
            {
                match = c;
                super();
            }
        };
    }

    public static CharMatcher isNot(char c)
    {
        return new CharMatcher(c) {

            final char val$match;

            public CharMatcher and(CharMatcher charmatcher)
            {
                CharMatcher charmatcher1 = charmatcher;
                if (charmatcher.matches(match))
                {
                    charmatcher1 = and(charmatcher);
                }
                return charmatcher1;
            }

            public volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public boolean matches(char c1)
            {
                return c1 != match;
            }

            public CharMatcher negate()
            {
                return is(match);
            }

            public CharMatcher or(CharMatcher charmatcher)
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
                super();
            }
        };
    }

    public static CharMatcher noneOf(CharSequence charsequence)
    {
        return anyOf(charsequence).negate();
    }

    public CharMatcher and(CharMatcher charmatcher)
    {
        return new And(Arrays.asList(new CharMatcher[] {
            this, (CharMatcher)Preconditions.checkNotNull(charmatcher)
        }));
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
        int i = indexIn(charsequence);
        if (i == -1)
        {
            return charsequence.toString();
        }
        StringBuilder stringbuilder = (new StringBuilder(charsequence.length())).append(charsequence.subSequence(0, i)).append(c);
        boolean flag1 = true;
        int j = i + 1;
        while (j < charsequence.length()) 
        {
            char c1 = charsequence.charAt(j);
            boolean flag;
            if (apply(Character.valueOf(c1)))
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
            j++;
            flag1 = flag;
        }
        return stringbuilder.toString();
    }

    public int countIn(CharSequence charsequence)
    {
        int j = 0;
        for (int i = 0; i < charsequence.length();)
        {
            int k = j;
            if (matches(charsequence.charAt(i)))
            {
                k = j + 1;
            }
            i++;
            j = k;
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
        return new CharMatcher() {

            final CharMatcher this$0;
            final CharMatcher val$original;

            public volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public int countIn(CharSequence charsequence)
            {
                return charsequence.length() - original.countIn(charsequence);
            }

            public boolean matches(char c)
            {
                return !original.matches(c);
            }

            public boolean matchesAllOf(CharSequence charsequence)
            {
                return original.matchesNoneOf(charsequence);
            }

            public boolean matchesNoneOf(CharSequence charsequence)
            {
                return original.matchesAllOf(charsequence);
            }

            public CharMatcher negate()
            {
                return original;
            }

            
            {
                this$0 = CharMatcher.this;
                original = charmatcher1;
                super();
            }
        };
    }

    public CharMatcher or(CharMatcher charmatcher)
    {
        return new Or(Arrays.asList(new CharMatcher[] {
            this, (CharMatcher)Preconditions.checkNotNull(charmatcher)
        }));
    }

    public CharMatcher precomputed()
    {
        return Platform.precomputeCharMatcher(this);
    }

    CharMatcher precomputedInternal()
    {
        final LookupTable table = new LookupTable();
        setBits(table);
        return new CharMatcher() {

            final CharMatcher this$0;
            final LookupTable val$table;

            public volatile boolean apply(Object obj)
            {
                return apply((Character)obj);
            }

            public boolean matches(char c)
            {
                return table.get(c);
            }

            public CharMatcher precomputed()
            {
                return this;
            }

            
            {
                this$0 = CharMatcher.this;
                table = lookuptable;
                super();
            }
        };
    }

    public String removeFrom(CharSequence charsequence)
    {
        int i;
        int j;
        charsequence = charsequence.toString();
        i = indexIn(charsequence);
        if (i == -1)
        {
            return charsequence;
        }
        charsequence = charsequence.toCharArray();
        j = 1;
_L2:
        i++;
        do
        {
label0:
            {
                if (i == charsequence.length)
                {
                    return new String(charsequence, 0, i - j);
                }
                if (!matches(charsequence[i]))
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            charsequence[i - j] = charsequence[i];
            i++;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
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
        int i = charsequence1.length();
        if (i == 0)
        {
            charsequence = removeFrom(charsequence);
        } else
        {
            if (i == 1)
            {
                return replaceFrom(charsequence, charsequence1.charAt(0));
            }
            String s = charsequence.toString();
            i = indexIn(s);
            charsequence = s;
            if (i != -1)
            {
                int i1 = s.length();
                charsequence = new StringBuilder((i1 * 3) / 2 + 16);
                int j = 0;
                int k;
                int l;
                do
                {
                    charsequence.append(s, j, i);
                    charsequence.append(charsequence1);
                    k = i + 1;
                    l = indexIn(s, k);
                    j = k;
                    i = l;
                } while (l != -1);
                charsequence.append(s, k, i1);
                return charsequence.toString();
            }
        }
        return charsequence;
    }

    public String retainFrom(CharSequence charsequence)
    {
        return negate().removeFrom(charsequence);
    }

    void setBits(LookupTable lookuptable)
    {
        char c = '\0';
        do
        {
            if (matches(c))
            {
                lookuptable.set(c);
            }
            char c1 = (char)(c + 1);
            if (c == '\uFFFF')
            {
                return;
            }
            c = c1;
        } while (true);
    }

    public String trimAndCollapseFrom(CharSequence charsequence, char c)
    {
        int i = negate().indexIn(charsequence);
        if (i == -1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder(charsequence.length());
        boolean flag = false;
        while (i < charsequence.length()) 
        {
            char c1 = charsequence.charAt(i);
            if (apply(Character.valueOf(c1)))
            {
                flag = true;
            } else
            {
                boolean flag1 = flag;
                if (flag)
                {
                    stringbuilder.append(c);
                    flag1 = false;
                }
                stringbuilder.append(c1);
                flag = flag1;
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public String trimFrom(CharSequence charsequence)
    {
        int i;
        int j;
        j = charsequence.length();
        i = 0;
_L3:
        if (i < j && matches(charsequence.charAt(i))) goto _L2; else goto _L1
_L1:
        j--;
_L4:
        if (j <= i || !matches(charsequence.charAt(j)))
        {
            return charsequence.subSequence(i, j + 1).toString();
        }
        break MISSING_BLOCK_LABEL_72;
_L2:
        i++;
          goto _L3
        j--;
          goto _L4
    }

    public String trimLeadingFrom(CharSequence charsequence)
    {
        int j = charsequence.length();
        int i = 0;
        do
        {
            if (i >= j || !matches(charsequence.charAt(i)))
            {
                return charsequence.subSequence(i, j).toString();
            }
            i++;
        } while (true);
    }

    public String trimTrailingFrom(CharSequence charsequence)
    {
        int i = charsequence.length() - 1;
        do
        {
            if (i < 0 || !matches(charsequence.charAt(i)))
            {
                return charsequence.subSequence(0, i + 1).toString();
            }
            i--;
        } while (true);
    }

    static 
    {
        CharMatcher charmatcher = inRange('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            char c = ac[i];
            charmatcher = charmatcher.or(inRange(c, (char)(c + 9)));
        }

        DIGIT = charmatcher.precomputed();
    }
}
