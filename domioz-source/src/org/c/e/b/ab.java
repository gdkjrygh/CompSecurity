// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.e.b;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.c.d.a;

// Referenced classes of package org.c.e.b:
//            aa

final class ab
{

    private final List a;
    private final StringBuilder b;

    private ab(String s)
    {
        a = new LinkedList();
        b = new StringBuilder();
        org.c.d.a.hasText(s, "'uriTemplate' must not be null");
        Matcher matcher = org.c.e.b.aa.a().matcher(s);
        int i = 0;
        while (matcher.find()) 
        {
            b.append(a(s, i, matcher.start()));
            String s1 = matcher.group(1);
            i = s1.indexOf(':');
            if (i == -1)
            {
                b.append("(.*)");
                a.add(s1);
            } else
            {
                if (i + 1 == s1.length())
                {
                    throw new IllegalArgumentException((new StringBuilder("No custom regular expression specified after ':' in \"")).append(s1).append("\"").toString());
                }
                String s2 = s1.substring(i + 1, s1.length());
                b.append('(');
                b.append(s2);
                b.append(')');
                s1 = s1.substring(0, i);
                a.add(s1);
            }
            i = matcher.end();
        }
        b.append(a(s, i, s.length()));
        i = b.length() - 1;
        if (i >= 0 && b.charAt(i) == '/')
        {
            b.deleteCharAt(i);
        }
    }

    ab(String s, byte byte0)
    {
        this(s);
    }

    private static String a(String s, int i, int j)
    {
        if (i == j)
        {
            return "";
        } else
        {
            return Pattern.quote(s.substring(i, j));
        }
    }

    static List a(ab ab1)
    {
        return Collections.unmodifiableList(ab1.a);
    }

    static Pattern b(ab ab1)
    {
        return Pattern.compile(ab1.b.toString());
    }
}
