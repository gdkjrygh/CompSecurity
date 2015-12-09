// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ctr
    implements cua
{

    public static final ctr a = new cts("CharMatcher.NONE") {

        public final ctr a(ctr ctr1)
        {
            return (ctr)ctz.a(ctr1);
        }

        public final boolean a(char c1)
        {
            return false;
        }

    };
    static final int b = Integer.numberOfLeadingZeros(31);
    private static final String c;
    private String d;

    protected ctr()
    {
        d = super.toString();
    }

    ctr(String s)
    {
        d = s;
    }

    private static ctr a(char c1, char c2)
    {
        String s;
        String s1;
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        s = String.valueOf(String.valueOf(b(c1)));
        s1 = String.valueOf(String.valueOf(b(c2)));
        return a(c1, c2, (new StringBuilder(s.length() + 27 + s1.length())).append("CharMatcher.inRange('").append(s).append("', '").append(s1).append("')").toString());
    }

    private static ctr a(char c1, char c2, String s)
    {
        return new cts(s, c1, c2) {

            private char c;
            private char d;

            public final boolean a(char c3)
            {
                return c <= c3 && c3 <= d;
            }

            
            {
                c = c1;
                d = c2;
                super(s);
            }
        };
    }

    private static String b(char c1)
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
        char c2 = c1;
        for (c1 = flag; c1 < '\004'; c1++)
        {
            ac[5 - c1] = "0123456789ABCDEF".charAt(c2 & 0xf);
            c2 >>= '\004';
        }

        return String.copyValueOf(ac);
    }

    public ctr a(ctr ctr1)
    {
        return new ctt(this, (ctr)ctz.a(ctr1));
    }

    ctr a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean a(char c1);

    public final boolean a(Character character)
    {
        return a(character.charValue());
    }

    public volatile boolean a(Object obj)
    {
        return a((Character)obj);
    }

    public String toString()
    {
        return d;
    }

    static 
    {
        new ctr() {

            public final boolean a(char c1)
            {
                switch (c1)
                {
                default:
                    if (c1 < '\u2000' || c1 > '\u200A')
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

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

            public final String toString()
            {
                return "CharMatcher.BREAKING_WHITESPACE";
            }

        };
        a('\0', '\177', "CharMatcher.ASCII");
        StringBuilder stringbuilder = new StringBuilder(31);
        for (int i = 0; i < 31; i++)
        {
            stringbuilder.append((char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".charAt(i) + 9));
        }

        c = stringbuilder.toString();
        new ctu("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), c.toCharArray());
        new ctr("CharMatcher.JAVA_DIGIT") {

            public final boolean a(char c1)
            {
                return Character.isDigit(c1);
            }

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

        };
        new ctr("CharMatcher.JAVA_LETTER") {

            public final boolean a(char c1)
            {
                return Character.isLetter(c1);
            }

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

        };
        new ctr("CharMatcher.JAVA_LETTER_OR_DIGIT") {

            public final boolean a(char c1)
            {
                return Character.isLetterOrDigit(c1);
            }

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

        };
        new ctr("CharMatcher.JAVA_UPPER_CASE") {

            public final boolean a(char c1)
            {
                return Character.isUpperCase(c1);
            }

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

        };
        new ctr("CharMatcher.JAVA_LOWER_CASE") {

            public final boolean a(char c1)
            {
                return Character.isLowerCase(c1);
            }

            public final volatile boolean a(Object obj)
            {
                return a((Character)obj);
            }

        };
        a('\0', '\037').a(a('\177', '\237')).a("CharMatcher.JAVA_ISO_CONTROL");
        new ctu("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
        new ctu("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
        new cts("CharMatcher.ANY") {

            public final ctr a(ctr ctr1)
            {
                ctz.a(ctr1);
                return this;
            }

            public final boolean a(char c1)
            {
                return true;
            }

        };
        new cts("WHITESPACE") {

            public final boolean a(char c1)
            {
                return "\u2002\u3000\r\205\u200A\u2005\u2000\u3000\u2029\013\u3000\u2008\u2003\u205F\u3000\u1680\t \u2006\u2001\u202F\240\f\u2009\u3000\u2004\u3000\u3000\u2028\n\u2007\u3000".charAt(0x6449bf0a * c1 >>> b) == c1;
            }

        };
    }
}
