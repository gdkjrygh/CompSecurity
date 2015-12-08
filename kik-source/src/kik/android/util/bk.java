// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.Hashtable;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bk
{
    public static final class a
    {

        private int a;
        private String b;

        public final int a()
        {
            return a;
        }

        public final int b()
        {
            return a + b.length();
        }

        public final String c()
        {
            return b;
        }

        protected a(String s, int i)
        {
            a = i;
            b = s;
        }
    }


    private Pattern a;
    private StringBuilder b;
    private Hashtable c;

    public bk()
    {
        b = new StringBuilder();
        c = new Hashtable();
        a(":)", "\uE056", "", "");
        a(";)", "\uE405", "", "");
        a(":D", "\uE057", "", "A-Za-z0-9");
        a(":P", "\uE105", "", "A-Za-z0-9");
        a(":|", "\uE40E", "", "");
        a(":/", "\uE40B", "", "/");
        a(">:(", "\uE416", "", "");
        a(":(", "\uE403", "", "");
        a(":X", "\uE406", "", "A-Za-z0-9");
        a("<3", "\uE328", "", "");
        a("</3", "\uE023", "", "");
        a("B)", "\uE402", "A-Za-z0-9", "");
        a(":3", "\uE04F", "0-9", "0-9");
        a(":'(", "\uE413", "", "");
        a(":O", "\uE410", "", "A-Za-z0-9");
        a(":S", "\uE411", "", "A-Za-z0-9");
        a(":$", "\uE40D", "", "0-9");
        a(":*", "\uE418", "", "");
        a("(KIK)", "\uE21A", "", "");
        a(":E", "\uE404", "", "A-Za-z0-9");
        a("D:", "\uE415", "A-Za-z0-9", "");
        a(">:)", "", "", "");
        a(":p", a(":P"), "", "A-Za-z0-9");
        a(":s", a(":S"), "", "A-Za-z0-9");
        a(":o", a(":O"), "", "A-Za-z0-9");
        a(":x", a(":X"), "", "A-Za-z0-9");
    }

    private String a(String s)
    {
        return (String)c.get(s);
    }

    private a a(CharSequence charsequence, int i)
    {
        charsequence = a.matcher(charsequence);
        if (!charsequence.find(i))
        {
            return null;
        }
        int j = charsequence.groupCount();
        for (i = 1; i <= j && charsequence.group(i) == null; i++) { }
        return new a(charsequence.group(i), charsequence.start(i));
    }

    private void a(String s, String s1, String s2, String s3)
    {
        c.put(s, s1);
        if (b.length() > 0)
        {
            b.append('|');
        }
        b.append("(?:");
        if (s2.length() > 0)
        {
            b.append("(?:^|[^").append(s2).append("])");
        }
        b.append('(');
        b.append(Pattern.quote(s));
        b.append(')');
        if (s3.length() > 0)
        {
            b.append("(?:[^").append(s3).append("]|$)");
        }
        b.append(')');
        a = Pattern.compile(b.toString());
    }

    public final a[] a(CharSequence charsequence)
    {
        Vector vector = new Vector();
        int i = 0;
        do
        {
            a a1 = a(charsequence, i);
            if (a1 != null)
            {
                vector.add(a1);
                i = a1.b();
            } else
            {
                charsequence = new a[vector.size()];
                vector.toArray(charsequence);
                return charsequence;
            }
        } while (true);
    }
}
