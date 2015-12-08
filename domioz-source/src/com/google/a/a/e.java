// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            ae, f, r, i, 
//            j, k, l, m, 
//            n, o, h, ad, 
//            g, q

public abstract class e
    implements ae
{

    public static final e a = new f();
    public static final e b = a('\0', '\177', "CharMatcher.ASCII");
    public static final e c;
    public static final e d = new i("CharMatcher.JAVA_DIGIT");
    public static final e e = new j("CharMatcher.JAVA_LETTER");
    public static final e f = new k("CharMatcher.JAVA_LETTER_OR_DIGIT");
    public static final e g = new l("CharMatcher.JAVA_UPPER_CASE");
    public static final e h = new m("CharMatcher.JAVA_LOWER_CASE");
    public static final e i = a('\0', '\037').a(a('\177', '\237')).a("CharMatcher.JAVA_ISO_CONTROL");
    public static final e j = new r("CharMatcher.INVISIBLE", "\000\177\255\u0600\u061C\u06DD\u070F\u1680\u180E\u2000\u2028\u205F\u2066\u2067\u2068\u2069\u206A\u3000\uD800\uFEFF\uFFF9\uFFFA".toCharArray(), " \240\255\u0604\u061C\u06DD\u070F\u1680\u180E\u200F\u202F\u2064\u2066\u2067\u2068\u2069\u206F\u3000\uF8FF\uFEFF\uFFF9\uFFFB".toCharArray());
    public static final e k = new r("CharMatcher.SINGLE_WIDTH", "\000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61".toCharArray(), "\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC".toCharArray());
    public static final e l = new n("CharMatcher.ANY");
    public static final e m = new o("CharMatcher.NONE");
    static final int o = Integer.numberOfLeadingZeros(31);
    public static final e p = new h("WHITESPACE");
    private static final String q;
    final String n;

    protected e()
    {
        n = super.toString();
    }

    e(String s)
    {
        n = s;
    }

    private static e a(char c1, char c2)
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
        ad.a(flag);
        s = String.valueOf(String.valueOf(b(c1)));
        s1 = String.valueOf(String.valueOf(b(c2)));
        return a(c1, c2, (new StringBuilder(s.length() + 27 + s1.length())).append("CharMatcher.inRange('").append(s).append("', '").append(s1).append("')").toString());
    }

    private static e a(char c1, char c2, String s)
    {
        return new g(s, c1, c2);
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

    public e a(e e1)
    {
        return new q(this, (e)ad.a(e1));
    }

    e a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public abstract boolean a(char c1);

    public final boolean a(Character character)
    {
        return a(character.charValue());
    }

    public boolean apply(Object obj)
    {
        return a((Character)obj);
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
        c = new r("CharMatcher.DIGIT", "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray(), q.toCharArray());
    }
}
