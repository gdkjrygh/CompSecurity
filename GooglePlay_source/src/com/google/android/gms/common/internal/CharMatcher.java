// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            Preconditions

public abstract class CharMatcher
{
    private static final class Or extends CharMatcher
    {

        List components;

        public final boolean matches(char c)
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

        public final CharMatcher or(CharMatcher charmatcher)
        {
            ArrayList arraylist = new ArrayList(components);
            arraylist.add(Preconditions.checkNotNull(charmatcher));
            return new Or(arraylist);
        }

        Or(List list)
        {
            components = list;
        }
    }


    public static final CharMatcher ANY = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return true;
        }

        public final boolean matchesAllOf(CharSequence charsequence)
        {
            Preconditions.checkNotNull(charsequence);
            return true;
        }

        public final CharMatcher or(CharMatcher charmatcher1)
        {
            Preconditions.checkNotNull(charmatcher1);
            return this;
        }

    };
    public static final CharMatcher ASCII = inRange('\0', '\177');
    public static final CharMatcher BREAKING_WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200A'));
    public static final CharMatcher DIGIT;
    public static final CharMatcher INVISIBLE = inRange('\0', ' ').or(inRange('\177', '\240')).or(is('\255')).or(inRange('\u0600', '\u0603')).or(anyOf("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).or(inRange('\u2000', '\u200F')).or(inRange('\u2028', '\u202F')).or(inRange('\u205F', '\u2064')).or(inRange('\u206A', '\u206F')).or(is('\u3000')).or(inRange('\uD800', '\uF8FF')).or(anyOf("\uFEFF\uFFF9\uFFFA\uFFFB"));
    public static final CharMatcher JAVA_DIGIT = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return Character.isDigit(c1);
        }

    };
    public static final CharMatcher JAVA_ISO_CONTROL = inRange('\0', '\037').or(inRange('\177', '\237'));
    public static final CharMatcher JAVA_LETTER = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return Character.isLetter(c1);
        }

    };
    public static final CharMatcher JAVA_LETTER_OR_DIGIT = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return Character.isLetterOrDigit(c1);
        }

    };
    public static final CharMatcher JAVA_LOWER_CASE = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return Character.isLowerCase(c1);
        }

    };
    public static final CharMatcher JAVA_UPPER_CASE = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return Character.isUpperCase(c1);
        }

    };
    public static final CharMatcher JAVA_WHITESPACE = inRange('\t', '\r').or(inRange('\034', ' ')).or(is('\u1680')).or(is('\u180E')).or(inRange('\u2000', '\u2006')).or(inRange('\u2008', '\u200B')).or(inRange('\u2028', '\u2029')).or(is('\u205F')).or(is('\u3000'));
    public static final CharMatcher NONE = new CharMatcher() {

        public final boolean matches(char c1)
        {
            return false;
        }

        public final boolean matchesAllOf(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

        public final CharMatcher or(CharMatcher charmatcher1)
        {
            return (CharMatcher)Preconditions.checkNotNull(charmatcher1);
        }

    };
    public static final CharMatcher SINGLE_WIDTH = inRange('\0', '\u04F9').or(is('\u05BE')).or(inRange('\u05D0', '\u05EA')).or(is('\u05F3')).or(is('\u05F4')).or(inRange('\u0600', '\u06FF')).or(inRange('\u0750', '\u077F')).or(inRange('\u0E00', '\u0E7F')).or(inRange('\u1E00', '\u20AF')).or(inRange('\u2100', '\u213A')).or(inRange('\uFB50', '\uFDFF')).or(inRange('\uFE70', '\uFEFF')).or(inRange('\uFF61', '\uFFDC'));
    public static final CharMatcher WHITESPACE = anyOf("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").or(inRange('\u2000', '\u200A'));

    public CharMatcher()
    {
    }

    private static CharMatcher anyOf(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new CharMatcher(charsequence) {

                final char val$chars[];

                public final boolean matches(char c)
                {
                    return Arrays.binarySearch(chars, c) >= 0;
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

                public final boolean matches(char c)
                {
                    return c == match1 || c == match2;
                }

            
            {
                match1 = c;
                match2 = c1;
                super();
            }
            };
        }
    }

    private static CharMatcher inRange(char c, char c1)
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

            public final boolean matches(char c2)
            {
                return startInclusive <= c2 && c2 <= endInclusive;
            }

            
            {
                startInclusive = c;
                endInclusive = c1;
                super();
            }
        };
    }

    private static CharMatcher is(char c)
    {
        return new CharMatcher(c) {

            final char val$match;

            public final boolean matches(char c1)
            {
                return c1 == match;
            }

            public final CharMatcher or(CharMatcher charmatcher)
            {
                if (charmatcher.matches(match))
                {
                    return charmatcher;
                } else
                {
                    return or(charmatcher);
                }
            }

            
            {
                match = c;
                super();
            }
        };
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

    public CharMatcher or(CharMatcher charmatcher)
    {
        return new Or(Arrays.asList(new CharMatcher[] {
            this, (CharMatcher)Preconditions.checkNotNull(charmatcher)
        }));
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

        DIGIT = charmatcher;
    }
}
