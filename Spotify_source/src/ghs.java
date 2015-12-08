// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class ghs
    implements ghz
{

    private static final Pattern c = Pattern.compile("spotify:user:([^:|\"]+)");
    private static final Pattern d = Pattern.compile("spotify%3Auser%3A([^\\%]+)");

    ghs()
    {
    }

    private static String a(String s, String s1, Pattern pattern, String s2)
    {
        String s3 = s;
        if (!s.contains(s1)) goto _L2; else goto _L1
_L1:
        pattern = pattern.matcher(s);
_L5:
        s3 = s;
        if (!pattern.find()) goto _L2; else goto _L3
_L3:
        s1 = s.replaceAll(pattern.group(1), s2);
        s = s1;
        continue; /* Loop/switch isn't completed */
_L2:
        return s3;
        s1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final transient String a(String s, Object aobj[])
    {
        int i = 0;
        int j = aobj.length;
        while (i < j) 
        {
            Object obj = aobj[i];
            String s1 = String.valueOf(String.valueOf(obj));
            String s2 = a(a(s1, "spotify:user:", c, "AnonymizedMarvin"), "spotify%3Auser%3A", d, "AnonymizedMarvin");
            if (s2.equals(s1))
            {
                aobj[i] = obj;
            } else
            {
                aobj[i] = s2;
            }
            i++;
        }
        return String.format(Locale.US, s, aobj);
    }

}
