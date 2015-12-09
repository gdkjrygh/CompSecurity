// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class grn
{

    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    final String a;
    private final String d;
    private final String e;

    private grn(String s, String s1, String s2)
    {
        d = s;
        e = s1;
        a = s2;
    }

    public static grn a(String s)
    {
        Object obj = b.matcher(s);
        if (((Matcher) (obj)).lookingAt()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s4;
        Matcher matcher;
        int i;
        s4 = ((Matcher) (obj)).group(1).toLowerCase(Locale.US);
        ((Matcher) (obj)).group(2).toLowerCase(Locale.US);
        matcher = c.matcher(s);
        i = ((Matcher) (obj)).end();
        obj = null;
_L6:
        if (i >= s.length()) goto _L4; else goto _L3
_L3:
        matcher.region(i, s.length());
        if (!matcher.lookingAt()) goto _L1; else goto _L5
_L5:
        String s1 = matcher.group(1);
        String s3;
        if (s1 != null && s1.equalsIgnoreCase("charset"))
        {
            String s2;
            if (matcher.group(2) != null)
            {
                s2 = matcher.group(2);
            } else
            {
                s2 = matcher.group(3);
            }
            s3 = s2;
            if (obj != null)
            {
                s3 = s2;
                if (!s2.equalsIgnoreCase(((String) (obj))))
                {
                    throw new IllegalArgumentException((new StringBuilder("Multiple different charsets: ")).append(s).toString());
                }
            }
        } else
        {
            s3 = ((String) (obj));
        }
        i = matcher.end();
        obj = s3;
          goto _L6
_L4:
        return new grn(s, s4, ((String) (obj)));
    }

    public final String a()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof grn) && ((grn)obj).d.equals(d);
    }

    public final int hashCode()
    {
        return d.hashCode();
    }

    public final String toString()
    {
        return d;
    }

}
