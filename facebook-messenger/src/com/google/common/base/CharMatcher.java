// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Arrays;

// Referenced classes of package com.google.common.base:
//            Predicate, Preconditions, Platform

public abstract class CharMatcher
    implements Predicate
{

    public static final CharMatcher ANY = new _cls6();
    public static final CharMatcher ASCII = inRange('\0', '\177');
    public static final CharMatcher BREAKING_WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200A')).precomputed();
    public static final CharMatcher DIGIT;
    public static final CharMatcher INVISIBLE = inRange('\0', ' ').or(inRange('\177', '\240')).or(is('\255')).or(inRange('\u0600', '\u0603')).or(anyOf("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).or(inRange('\u2000', '\u200F')).or(inRange('\u2028', '\u202F')).or(inRange('\u205F', '\u2064')).or(inRange('\u206A', '\u206F')).or(is('\u3000')).or(inRange('\uD800', '\uF8FF')).or(anyOf("\uFEFF\uFFF9\uFFFA\uFFFB")).precomputed();
    public static final CharMatcher JAVA_DIGIT = new _cls1();
    public static final CharMatcher JAVA_ISO_CONTROL = inRange('\0', '\037').or(inRange('\177', '\237'));
    public static final CharMatcher JAVA_LETTER = new _cls2();
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new _cls3();
    public static final CharMatcher JAVA_LOWER_CASE = new _cls5();
    public static final CharMatcher JAVA_UPPER_CASE = new _cls4();
    public static final CharMatcher JAVA_WHITESPACE = inRange('\t', '\r').or(inRange('\034', ' ')).or(is('\u1680')).or(is('\u180E')).or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200B')).or(inRange('\u2028', '\u2029')).or(is('\u205F')).or(is('\u3000')).precomputed();
    public static final CharMatcher NONE = new _cls7();
    public static final CharMatcher SINGLE_WIDTH = inRange('\0', '\u04F9').or(is('\u05BE')).or(inRange('\u05D0', '\u05EA')).or(is('\u05F3')).or(is('\u05F4')).or(inRange('\u0600', '\u06FF')).or(inRange('\u0750', '\u077F')).or(inRange('\u0E00', '\u0E7F')).or(inRange('\u1E00', '\u20AF')).or(inRange('\u2100', '\u213A')).or(inRange('\uFB50', '\uFDFF')).or(inRange('\uFE70', '\uFEFF')).or(inRange('\uFF61', '\uFFDC')).precomputed();
    public static final CharMatcher WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").or(inRange('\u2000', '\u200A')).precomputed();

    public CharMatcher()
    {
    }

    public static CharMatcher anyOf(final CharSequence chars)
    {
        switch (chars.length())
        {
        default:
            chars = chars.toString().toCharArray();
            Arrays.sort(chars);
            return new _cls11();

        case 0: // '\0'
            return NONE;

        case 1: // '\001'
            return is(chars.charAt(0));

        case 2: // '\002'
            return new _cls10();
        }
    }

    public static CharMatcher inRange(final char startInclusive, final char endInclusive)
    {
        boolean flag;
        if (endInclusive >= startInclusive)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new _cls12();
    }

    public static CharMatcher is(final char match)
    {
        return new _cls8();
    }

    public static CharMatcher isNot(final char match)
    {
        return new _cls9();
    }

    public boolean apply(Character character)
    {
        return matches(character.charValue());
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Character)obj);
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

    public abstract boolean matches(char c);

    public CharMatcher negate()
    {
        return new _cls14();
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
        final LookupTable table = new LookupTable(null);
        setBits(table);
        return new _cls15();
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

    private class _cls11 extends CharMatcher
    {

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

        _cls11()
        {
            chars = ac;
            super();
        }
    }


    private class _cls10 extends CharMatcher
    {

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

        _cls10()
        {
            match1 = c;
            match2 = c1;
            super();
        }
    }


    private class _cls12 extends CharMatcher
    {

        final char val$endInclusive;
        final char val$startInclusive;

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return startInclusive <= c && c <= endInclusive;
        }

        public CharMatcher precomputed()
        {
            return this;
        }

        void setBits(LookupTable lookuptable)
        {
            char c = startInclusive;
            do
            {
                lookuptable.set(c);
                char c1 = (char)(c + 1);
                if (c == endInclusive)
                {
                    return;
                }
                c = c1;
            } while (true);
        }

        _cls12()
        {
            startInclusive = c;
            endInclusive = c1;
            super();
        }
    }


    private class _cls8 extends CharMatcher
    {

        final char val$match;

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return c == match;
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

        void setBits(LookupTable lookuptable)
        {
            lookuptable.set(match);
        }

        _cls8()
        {
            match = c;
            super();
        }
    }


    private class _cls9 extends CharMatcher
    {

        final char val$match;

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return c != match;
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

        _cls9()
        {
            match = c;
            super();
        }
    }


    private class _cls14 extends CharMatcher
    {

        final CharMatcher this$0;
        final CharMatcher val$original;

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return !original.matches(c);
        }

        public CharMatcher negate()
        {
            return original;
        }

        _cls14()
        {
            this$0 = CharMatcher.this;
            original = charmatcher1;
            super();
        }
    }


    private class Or extends CharMatcher
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


    private class LookupTable
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

        LookupTable(_cls1 _pcls1)
        {
            this();
        }
    }


    private class _cls15 extends CharMatcher
    {

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

        _cls15()
        {
            this$0 = CharMatcher.this;
            table = lookuptable;
            super();
        }
    }


    private class _cls1 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return Character.isDigit(c);
        }

        _cls1()
        {
        }
    }


    private class _cls2 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return Character.isLetter(c);
        }

        _cls2()
        {
        }
    }


    private class _cls3 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return Character.isLetterOrDigit(c);
        }

        _cls3()
        {
        }
    }


    private class _cls4 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return Character.isUpperCase(c);
        }

        _cls4()
        {
        }
    }


    private class _cls5 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public boolean matches(char c)
        {
            return Character.isLowerCase(c);
        }

        _cls5()
        {
        }
    }


    private class _cls6 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public int indexIn(CharSequence charsequence)
        {
            return charsequence.length() != 0 ? 0 : -1;
        }

        public boolean matches(char c)
        {
            return true;
        }

        public CharMatcher negate()
        {
            return NONE;
        }

        public CharMatcher or(CharMatcher charmatcher)
        {
            Preconditions.checkNotNull(charmatcher);
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

        public String trimFrom(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return "";
        }

        _cls6()
        {
        }
    }


    private class _cls7 extends CharMatcher
    {

        public volatile boolean apply(Object obj)
        {
            return apply((Character)obj);
        }

        public int indexIn(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return -1;
        }

        public boolean matches(char c)
        {
            return false;
        }

        public CharMatcher negate()
        {
            return ANY;
        }

        public CharMatcher or(CharMatcher charmatcher)
        {
            return (CharMatcher)Preconditions.checkNotNull(charmatcher);
        }

        public CharMatcher precomputed()
        {
            return this;
        }

        public String removeFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

        void setBits(LookupTable lookuptable)
        {
        }

        public String trimFrom(CharSequence charsequence)
        {
            return charsequence.toString();
        }

        _cls7()
        {
        }
    }

}
