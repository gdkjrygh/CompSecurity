// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public abstract class brw
{

    public static final brw a = b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").a(a('\u2000', '\u200A'));
    private static brw b = new brw() {

        public final brw a(brw brw2)
        {
            return (brw)btl.a(brw2);
        }

        public final boolean a(char c1)
        {
            return false;
        }

        public final boolean a(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

    };

    public brw()
    {
    }

    private static brw a(char c, char c1)
    {
        boolean flag;
        if (c1 >= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.b(flag);
        return new brw(c, c1) {

            private char b;
            private char c;

            public final boolean a(char c2)
            {
                return b <= c2 && c2 <= c;
            }

            
            {
                b = c1;
                c = c2;
                super();
            }
        };
    }

    private static brw b(char c)
    {
        return new brw(c) {

            private char b;

            public final brw a(brw brw1)
            {
                if (brw1.a(b))
                {
                    return brw1;
                } else
                {
                    return a(brw1);
                }
            }

            public final boolean a(char c1)
            {
                return c1 == b;
            }

            
            {
                b = c;
                super();
            }
        };
    }

    private static brw b(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new brw(charsequence) {

                private char b[];

                public final boolean a(char c)
                {
                    return Arrays.binarySearch(b, c) >= 0;
                }

            
            {
                b = ac;
                super();
            }
            };

        case 0: // '\0'
            return b;

        case 1: // '\001'
            return b(charsequence.charAt(0));

        case 2: // '\002'
            return new brw(charsequence.charAt(0), charsequence.charAt(1)) {

                private char b;
                private char c;

                public final boolean a(char c1)
                {
                    return c1 == b || c1 == c;
                }

            
            {
                b = c1;
                c = c2;
                super();
            }
            };
        }
    }

    public brw a(brw brw1)
    {
        return new brx(Arrays.asList(new brw[] {
            this, (brw)btl.a(brw1)
        }));
    }

    public abstract boolean a(char c);

    public boolean a(CharSequence charsequence)
    {
        for (int i = charsequence.length() - 1; i >= 0; i--)
        {
            if (!a(charsequence.charAt(i)))
            {
                return false;
            }
        }

        return true;
    }

    static 
    {
        b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").a(a('\u2000', '\u2006')).a(a('\u2008', '\u200A'));
        a('\0', '\177');
        brw brw1 = a('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            char c = ac[i];
            brw1 = brw1.a(a(c, (char)(c + 9)));
        }

        a('\t', '\r').a(a('\034', ' ')).a(b('\u1680')).a(b('\u180E')).a(a('\u2000', '\u2006')).a(a('\u2008', '\u200B')).a(a('\u2028', '\u2029')).a(b('\u205F')).a(b('\u3000'));
        new brw() {

            public final boolean a(char c1)
            {
                return Character.isDigit(c1);
            }

        };
        new brw() {

            public final boolean a(char c1)
            {
                return Character.isLetter(c1);
            }

        };
        new brw() {

            public final boolean a(char c1)
            {
                return Character.isLetterOrDigit(c1);
            }

        };
        new brw() {

            public final boolean a(char c1)
            {
                return Character.isUpperCase(c1);
            }

        };
        new brw() {

            public final boolean a(char c1)
            {
                return Character.isLowerCase(c1);
            }

        };
        a('\0', '\037').a(a('\177', '\237'));
        a('\0', ' ').a(a('\177', '\240')).a(b('\255')).a(a('\u0600', '\u0603')).a(b("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).a(a('\u2000', '\u200F')).a(a('\u2028', '\u202F')).a(a('\u205F', '\u2064')).a(a('\u206A', '\u206F')).a(b('\u3000')).a(a('\uD800', '\uF8FF')).a(b("\uFEFF\uFFF9\uFFFA\uFFFB"));
        a('\0', '\u04F9').a(b('\u05BE')).a(a('\u05D0', '\u05EA')).a(b('\u05F3')).a(b('\u05F4')).a(a('\u0600', '\u06FF')).a(a('\u0750', '\u077F')).a(a('\u0E00', '\u0E7F')).a(a('\u1E00', '\u20AF')).a(a('\u2100', '\u213A')).a(a('\uFB50', '\uFDFF')).a(a('\uFE70', '\uFEFF')).a(a('\uFF61', '\uFFDC'));
        new brw() {

            public final brw a(brw brw2)
            {
                btl.a(brw2);
                return this;
            }

            public final boolean a(char c1)
            {
                return true;
            }

            public final boolean a(CharSequence charsequence)
            {
                btl.a(charsequence);
                return true;
            }

        };
    }
}
