// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            k, q, r, s, 
//            t, u, l, bl, 
//            p, m, o, n, 
//            v

public abstract class j
{

    public static final j a = b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").a(a('\u2000', '\u200A'));
    public static final j b = b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").a(a('\u2000', '\u2006')).a(a('\u2008', '\u200A'));
    public static final j c = a('\0', '\177');
    public static final j d;
    public static final j e = a('\t', '\r').a(a('\034', ' ')).a(b('\u1680')).a(b('\u180E')).a(a('\u2000', '\u2006')).a(a('\u2008', '\u200B')).a(a('\u2028', '\u2029')).a(b('\u205F')).a(b('\u3000'));
    public static final j f = new k();
    public static final j g = new q();
    public static final j h = new r();
    public static final j i = new s();
    public static final j j = new t();
    public static final j k = a('\0', '\037').a(a('\177', '\237'));
    public static final j l = a('\0', ' ').a(a('\177', '\240')).a(b('\255')).a(a('\u0600', '\u0603')).a(b("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).a(a('\u2000', '\u200F')).a(a('\u2028', '\u202F')).a(a('\u205F', '\u2064')).a(a('\u206A', '\u206F')).a(b('\u3000')).a(a('\uD800', '\uF8FF')).a(b("\uFEFF\uFFF9\uFFFA\uFFFB"));
    public static final j m = a('\0', '\u04F9').a(b('\u05BE')).a(a('\u05D0', '\u05EA')).a(b('\u05F3')).a(b('\u05F4')).a(a('\u0600', '\u06FF')).a(a('\u0750', '\u077F')).a(a('\u0E00', '\u0E7F')).a(a('\u1E00', '\u20AF')).a(a('\u2100', '\u213A')).a(a('\uFB50', '\uFDFF')).a(a('\uFE70', '\uFEFF')).a(a('\uFF61', '\uFFDC'));
    public static final j n = new u();
    public static final j o = new l();

    public j()
    {
    }

    private static j a(char c1, char c2)
    {
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag);
        return new p(c1, c2);
    }

    private static j b(char c1)
    {
        return new m(c1);
    }

    private static j b(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new o(charsequence);

        case 0: // '\0'
            return o;

        case 1: // '\001'
            return b(charsequence.charAt(0));

        case 2: // '\002'
            return new n(charsequence.charAt(0), charsequence.charAt(1));
        }
    }

    public j a(j j1)
    {
        return new v(Arrays.asList(new j[] {
            this, (j)bl.a(j1)
        }));
    }

    public abstract boolean a(char c1);

    public boolean a(CharSequence charsequence)
    {
        for (int i1 = charsequence.length() - 1; i1 >= 0; i1--)
        {
            if (!a(charsequence.charAt(i1)))
            {
                return false;
            }
        }

        return true;
    }

    static 
    {
        j j1 = a('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int k1 = ac.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            char c1 = ac[i1];
            j1 = j1.a(a(c1, (char)(c1 + 9)));
        }

        d = j1;
    }
}
