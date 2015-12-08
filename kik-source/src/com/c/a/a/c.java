// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.util.Arrays;

// Referenced classes of package com.c.a.a:
//            v, d, j, k, 
//            l, m, n, o, 
//            p, i, q, u, 
//            h, g, f, e

public abstract class com.c.a.a.c
    implements v
{
    static abstract class a extends com.c.a.a.c
    {

        public com.c.a.a.c a()
        {
            return new b(this);
        }

        public final volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        a(String s)
        {
            super(s);
        }
    }

    static final class b extends c
    {

        final com.c.a.a.c a(String s)
        {
            return new b(s, q);
        }

        b(com.c.a.a.c c1)
        {
            super(c1);
        }

        private b(String s, com.c.a.a.c c1)
        {
            super(s, c1);
        }
    }

    private static class c extends com.c.a.a.c
    {

        final com.c.a.a.c q;

        public final com.c.a.a.c a()
        {
            return q;
        }

        com.c.a.a.c a(String s)
        {
            return new c(s, q);
        }

        public final volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        public final boolean b(CharSequence charsequence)
        {
            return q.c(charsequence);
        }

        public final boolean c(char c1)
        {
            return !q.c(c1);
        }

        public final boolean c(CharSequence charsequence)
        {
            return q.b(charsequence);
        }

        c(com.c.a.a.c c1)
        {
            String s = String.valueOf(String.valueOf(c1));
            this((new StringBuilder(s.length() + 9)).append(s).append(".negate()").toString(), c1);
        }

        c(String s, com.c.a.a.c c1)
        {
            super(s);
            q = c1;
        }
    }

    private static final class d extends com.c.a.a.c
    {

        final com.c.a.a.c q;
        final com.c.a.a.c r;

        final com.c.a.a.c a(String s)
        {
            return new d(q, r, s);
        }

        public final volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        public final boolean c(char c1)
        {
            return q.c(c1) || r.c(c1);
        }

        d(com.c.a.a.c c1, com.c.a.a.c c2)
        {
            String s = String.valueOf(String.valueOf(c1));
            String s1 = String.valueOf(String.valueOf(c2));
            this(c1, c2, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
        }

        private d(com.c.a.a.c c1, com.c.a.a.c c2, String s)
        {
            super(s);
            q = (com.c.a.a.c)u.a(c1);
            r = (com.c.a.a.c)u.a(c2);
        }
    }

    private static final class e extends com.c.a.a.c
    {

        private final char q[];
        private final char r[];

        public final volatile boolean a(Object obj)
        {
            return a((Character)obj);
        }

        public final boolean c(char c1)
        {
            int i1 = Arrays.binarySearch(q, c1);
            if (i1 < 0)
            {
                if ((i1 = ~i1 - 1) < 0 || c1 > r[i1])
                {
                    return false;
                }
            }
            return true;
        }

        e(String s, char ac[], char ac1[])
        {
            super(s);
            q = ac;
            r = ac1;
            int i1;
            boolean flag;
            if (ac.length == ac1.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            u.a(flag);
            i1 = 0;
            while (i1 < ac.length) 
            {
                if (ac[i1] <= ac1[i1])
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                u.a(flag);
                if (i1 + 1 < ac.length)
                {
                    if (ac1[i1] < ac[i1 + 1])
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    u.a(flag);
                }
                i1++;
            }
        }
    }


    public static final com.c.a.a.c a = new com.c.a.a.d();
    public static final com.c.a.a.c b = a('\0', '\177', "CharMatcher.ASCII");
    public static final com.c.a.a.c c;
    public static final com.c.a.a.c d = new j("CharMatcher.JAVA_DIGIT");
    public static final com.c.a.a.c e = new k("CharMatcher.JAVA_LETTER");
    public static final com.c.a.a.c f = new l("CharMatcher.JAVA_LETTER_OR_DIGIT");
    public static final com.c.a.a.c g = new m("CharMatcher.JAVA_UPPER_CASE");
    public static final com.c.a.a.c h = new n("CharMatcher.JAVA_LOWER_CASE");
    public static final com.c.a.a.c i = a('\0', '\037').a(a('\177', '\237')).a("CharMatcher.JAVA_ISO_CONTROL");
    public static final com.c.a.a.c j = new e("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final com.c.a.a.c k = new e("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final com.c.a.a.c l = new o("CharMatcher.ANY");
    public static final com.c.a.a.c m = new p("CharMatcher.NONE");
    static final int o = Integer.numberOfLeadingZeros(31);
    public static final com.c.a.a.c p = new i("WHITESPACE");
    private static final String q;
    final String n;

    protected com.c.a.a.c()
    {
        n = super.toString();
    }

    com.c.a.a.c(String s)
    {
        n = s;
    }

    public static com.c.a.a.c a(char c1)
    {
        String s = String.valueOf(String.valueOf(d(c1)));
        return new q((new StringBuilder(s.length() + 18)).append("CharMatcher.is('").append(s).append("')").toString(), c1);
    }

    private static com.c.a.a.c a(char c1, char c2)
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
        u.a(flag);
        s = String.valueOf(String.valueOf(d(c1)));
        s1 = String.valueOf(String.valueOf(d(c2)));
        return a(c1, c2, (new StringBuilder(s.length() + 27 + s1.length())).append("CharMatcher.inRange('").append(s).append("', '").append(s1).append("')").toString());
    }

    private static com.c.a.a.c a(char c1, char c2, String s)
    {
        return new h(s, c1, c2);
    }

    public static com.c.a.a.c a(CharSequence charsequence)
    {
        int i1 = 0;
        Object obj;
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            obj = new StringBuilder("CharMatcher.anyOf(\"");
            for (int j1 = charsequence.length; i1 < j1; i1++)
            {
                ((StringBuilder) (obj)).append(d(charsequence[i1]));
            }

            break;

        case 0: // '\0'
            return m;

        case 1: // '\001'
            return a(charsequence.charAt(0));

        case 2: // '\002'
            char c1 = charsequence.charAt(0);
            char c2 = charsequence.charAt(1);
            charsequence = String.valueOf(String.valueOf(d(c1)));
            obj = String.valueOf(String.valueOf(d(c2)));
            return new g((new StringBuilder(charsequence.length() + 21 + ((String) (obj)).length())).append("CharMatcher.anyOf(\"").append(charsequence).append(((String) (obj))).append("\")").toString(), c1, c2);
        }
        ((StringBuilder) (obj)).append("\")");
        return new f(((StringBuilder) (obj)).toString(), charsequence);
    }

    public static com.c.a.a.c b(char c1)
    {
        String s = String.valueOf(String.valueOf(d(c1)));
        return new com.c.a.a.e((new StringBuilder(s.length() + 21)).append("CharMatcher.isNot('").append(s).append("')").toString(), c1);
    }

    private static String d(char c1)
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

    public int a(CharSequence charsequence, int i1)
    {
        int j1 = charsequence.length();
        u.b(i1, j1);
        for (; i1 < j1; i1++)
        {
            if (c(charsequence.charAt(i1)))
            {
                return i1;
            }
        }

        return -1;
    }

    public com.c.a.a.c a()
    {
        return new c(this);
    }

    public com.c.a.a.c a(com.c.a.a.c c1)
    {
        return new d(this, (com.c.a.a.c)u.a(c1));
    }

    com.c.a.a.c a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean a(Character character)
    {
        return c(character.charValue());
    }

    public volatile boolean a(Object obj)
    {
        return a((Character)obj);
    }

    public boolean b(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!c(charsequence.charAt(i1)))
            {
                return false;
            }
        }

        return true;
    }

    public abstract boolean c(char c1);

    public boolean c(CharSequence charsequence)
    {
        return d(charsequence) == -1;
    }

    public int d(CharSequence charsequence)
    {
        int j1 = charsequence.length();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (c(charsequence.charAt(i1)))
            {
                return i1;
            }
        }

        return -1;
    }

    public String e(CharSequence charsequence)
    {
        charsequence = charsequence.toString();
        int j1 = d(charsequence);
        if (j1 == -1)
        {
            return charsequence;
        }
        charsequence = charsequence.toCharArray();
        int i1 = 1;
        do
        {
            j1++;
            if (j1 != charsequence.length)
            {
                if (!c(charsequence[j1]))
                {
                    charsequence[j1 - i1] = charsequence[j1];
                } else
                {
                    i1++;
                }
            } else
            {
                return new String(charsequence, 0, j1 - i1);
            }
        } while (true);
    }

    public String f(CharSequence charsequence)
    {
        charsequence = charsequence.toString();
        int i1 = d(charsequence);
        if (i1 == -1)
        {
            return charsequence;
        }
        charsequence = charsequence.toCharArray();
        charsequence[i1] = '.';
        for (i1++; i1 < charsequence.length; i1++)
        {
            if (c(charsequence[i1]))
            {
                charsequence[i1] = '.';
            }
        }

        return new String(charsequence);
    }

    public String toString()
    {
        return n;
    }

    static 
    {
        StringBuilder stringbuilder = new StringBuilder(31);
        for (int i1 = 0; i1 < 31; i1++)
        {
            stringbuilder.append((char)("0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".charAt(i1) + 9));
        }

        q = stringbuilder.toString();
        c = new e("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), q.toCharArray());
    }
}
