// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.io.scribe:
//            ImppScribe

private static class linkFormat
{

    private final int handleGroup;
    private final String linkFormat;
    private final Pattern parseRegex;
    private final String protocol;

    public String buildLink(String s)
    {
        return String.format(linkFormat, new Object[] {
            s
        });
    }

    public String getProtocol()
    {
        return protocol;
    }

    public String parseHandle(String s)
    {
        s = parseRegex.matcher(s);
        if (s.find())
        {
            return s.group(handleGroup);
        } else
        {
            return null;
        }
    }

    public (String s)
    {
        this(s, "(.*)", 1, "%s");
    }

    public <init>(String s, String s1, int i, String s2)
    {
        parseRegex = Pattern.compile((new StringBuilder()).append('^').append(s).append(':').append(s1).toString(), 2);
        protocol = s;
        handleGroup = i;
        linkFormat = (new StringBuilder()).append(s).append(':').append(s2).toString();
    }
}
