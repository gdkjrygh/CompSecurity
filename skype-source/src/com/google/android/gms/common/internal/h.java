// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            y

public abstract class h
{
    private static final class a extends h
    {

        List p;

        public final h a(h h1)
        {
            ArrayList arraylist = new ArrayList(p);
            arraylist.add(y.a(h1));
            return new a(arraylist);
        }

        public final boolean a(char c1)
        {
            for (Iterator iterator = p.iterator(); iterator.hasNext();)
            {
                if (((h)iterator.next()).a(c1))
                {
                    return true;
                }
            }

            return false;
        }

        a(List list)
        {
            p = list;
        }
    }


    public static final h a = b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000\240\u180E\u202F").a(a('\u2000', '\u200A'));
    public static final h b = b("\t\n\013\f\r \205\u1680\u2028\u2029\u205F\u3000").a(a('\u2000', '\u2006')).a(a('\u2008', '\u200A'));
    public static final h c = a('\0', '\177');
    public static final h d;
    public static final h e = a('\t', '\r').a(a('\034', ' ')).a(b('\u1680')).a(b('\u180E')).a(a('\u2000', '\u2006')).a(a('\u2008', '\u200B')).a(a('\u2028', '\u2029')).a(b('\u205F')).a(b('\u3000'));
    public static final h f = new h() {

        public final boolean a(char c2)
        {
            return Character.isDigit(c2);
        }

    };
    public static final h g = new h() {

        public final boolean a(char c2)
        {
            return Character.isLetter(c2);
        }

    };
    public static final h h = new h() {

        public final boolean a(char c2)
        {
            return Character.isLetterOrDigit(c2);
        }

    };
    public static final h i = new h() {

        public final boolean a(char c2)
        {
            return Character.isUpperCase(c2);
        }

    };
    public static final h j = new h() {

        public final boolean a(char c2)
        {
            return Character.isLowerCase(c2);
        }

    };
    public static final h k = a('\0', '\037').a(a('\177', '\237'));
    public static final h l = a('\0', ' ').a(a('\177', '\240')).a(b('\255')).a(a('\u0600', '\u0603')).a(b("\u06DD\u070F\u1680\u17B4\u17B5\u180E")).a(a('\u2000', '\u200F')).a(a('\u2028', '\u202F')).a(a('\u205F', '\u2064')).a(a('\u206A', '\u206F')).a(b('\u3000')).a(a('\uD800', '\uF8FF')).a(b("\uFEFF\uFFF9\uFFFA\uFFFB"));
    public static final h m = a('\0', '\u04F9').a(b('\u05BE')).a(a('\u05D0', '\u05EA')).a(b('\u05F3')).a(b('\u05F4')).a(a('\u0600', '\u06FF')).a(a('\u0750', '\u077F')).a(a('\u0E00', '\u0E7F')).a(a('\u1E00', '\u20AF')).a(a('\u2100', '\u213A')).a(a('\uFB50', '\uFDFF')).a(a('\uFE70', '\uFEFF')).a(a('\uFF61', '\uFFDC'));
    public static final h n = new h() {

        public final h a(h h2)
        {
            y.a(h2);
            return this;
        }

        public final boolean a(char c2)
        {
            return true;
        }

        public final boolean a(CharSequence charsequence)
        {
            y.a(charsequence);
            return true;
        }

    };
    public static final h o = new h() {

        public final h a(h h2)
        {
            return (h)y.a(h2);
        }

        public final boolean a(char c2)
        {
            return false;
        }

        public final boolean a(CharSequence charsequence)
        {
            return charsequence.length() == 0;
        }

    };

    public h()
    {
    }

    private static h a(char c1, char c2)
    {
        boolean flag;
        if (c2 >= c1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.b(flag);
        return new h(c1, c2) {

            final char p;
            final char q;

            public final boolean a(char c3)
            {
                return p <= c3 && c3 <= q;
            }

            
            {
                p = c1;
                q = c2;
                super();
            }
        };
    }

    private static h b(char c1)
    {
        return new h(c1) {

            final char p;

            public final h a(h h1)
            {
                if (h1.a(p))
                {
                    return h1;
                } else
                {
                    return a(h1);
                }
            }

            public final boolean a(char c2)
            {
                return c2 == p;
            }

            
            {
                p = c1;
                super();
            }
        };
    }

    private static h b(CharSequence charsequence)
    {
        switch (charsequence.length())
        {
        default:
            charsequence = charsequence.toString().toCharArray();
            Arrays.sort(charsequence);
            return new h(charsequence) {

                final char p[];

                public final boolean a(char c1)
                {
                    return Arrays.binarySearch(p, c1) >= 0;
                }

            
            {
                p = ac;
                super();
            }
            };

        case 0: // '\0'
            return o;

        case 1: // '\001'
            return b(charsequence.charAt(0));

        case 2: // '\002'
            return new h(charsequence.charAt(0), charsequence.charAt(1)) {

                final char p;
                final char q;

                public final boolean a(char c1)
                {
                    return c1 == p || c1 == q;
                }

            
            {
                p = c1;
                q = c2;
                super();
            }
            };
        }
    }

    public h a(h h1)
    {
        return new a(Arrays.asList(new h[] {
            this, (h)y.a(h1)
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
        h h1 = a('0', '9');
        char ac[] = "\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uAA50\uFF10".toCharArray();
        int j1 = ac.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            char c1 = ac[i1];
            h1 = h1.a(a(c1, (char)(c1 + 9)));
        }

        d = h1;
    }
}
