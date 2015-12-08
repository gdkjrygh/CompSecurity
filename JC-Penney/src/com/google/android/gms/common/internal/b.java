// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            c, i, j, k, 
//            l, m, d, e, 
//            u, h, g, f, 
//            n

public abstract class b
{

    public static final b a = a("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").a(a('\u2000', '\u200A'));
    public static final b b = a("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").a(a('\u2000', '\u2006')).a(a('\u2008', '\u200A'));
    public static final b c = a('\0', '\177');
    public static final b d;
    public static final b e = a('\t', '\r').a(a('\034', ' ')).a(a('\u1680')).a(a('\u180E')).a(a('\u2000', '\u2006')).a(a('\u2008', '\u200B')).a(a('\u2028', '\u2029')).a(a('\u205F')).a(a('\u3000'));
    public static final b f = new c();
    public static final b g = new i();
    public static final b h = new j();
    public static final b i = new k();
    public static final b j = new l();
    public static final b k = a('\0', '\037').a(a('\177', '\237'));
    public static final b l = a('\0', ' ').a(a('\177', '\240')).a(a('\255')).a(a('\u0600', '\u0603')).a(a("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).a(a('\u2000', '\u200F')).a(a('\u2028', '\u202F')).a(a('\u205F', '\u2064')).a(a('\u206A', '\u206F')).a(a('\u3000')).a(a('\uD800', '\uF8FF')).a(a("\uFEFF\uFFF9\uFFFA\uFFFB"));
    public static final b m = a('\0', '\u04F9').a(a('\u05BE')).a(a('\u05D0', '\u05EA')).a(a('\u05F3')).a(a('\u05F4')).a(a('\u0600', '\u06FF')).a(a('\u0750', '\u077F')).a(a('\u0E00', '\u0E7F')).a(a('\u1E00', '\u20AF')).a(a('\u2100', '\u213A')).a(a('\uFB50', '\uFDFF')).a(a('\uFE70', '\uFEFF')).a(a('\uFF61', '\uFFDC'));
    public static final b n = new m();
    public static final b o = new d();

    public b()
    {
    }

    public static b a(char c1)
    {
        return new e(c1);
    }

    public static b a(char c1, char c2)
    {
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.a(flag);
        return new h(c1, c2);
    }

    public static b a(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new g(charsequence);

        case 0: // '\0'
            return o;

        case 1: // '\001'
            return a(charsequence.charAt(0));

        case 2: // '\002'
            return new f(charsequence.charAt(0), charsequence.charAt(1));
        }
    }

    public b a(b b1)
    {
        return new n(Arrays.asList(new b[] {
            this, (b)u.a(b1)
        }));
    }

    public abstract boolean b(char c1);

    public boolean b(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!b(charsequence.charAt(i1)))
            {
                return false;
            }
        }

        return true;
    }

    static 
    {
        b b1 = a('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int j1 = ac.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            char c1 = ac[i1];
            b1 = b1.a(a(c1, (char)(c1 + 9)));
        }

        d = b1;
    }
}
