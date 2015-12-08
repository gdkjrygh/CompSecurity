// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class anv
{

    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.+)");

    public static anu a(String s)
    {
        boolean flag = true;
        Object obj = a.matcher(s);
        if (((Matcher) (obj)).matches())
        {
            long l = Long.valueOf(((Matcher) (obj)).group(1), 16).longValue();
            long l1 = Long.valueOf(((Matcher) (obj)).group(2), 16).longValue();
            s = ((Matcher) (obj)).group(3);
            obj = ((Matcher) (obj)).group(4);
            if (s.indexOf('x') == -1 || ((String) (obj)).indexOf('/') == -1)
            {
                flag = false;
            }
            if (flag)
            {
                return new anu(l, l1 - l, ((String) (obj)));
            }
        }
        return null;
    }

}
