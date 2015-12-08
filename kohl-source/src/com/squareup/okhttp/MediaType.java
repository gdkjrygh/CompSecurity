// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MediaType
{

    private static final Pattern PARAMETER = Pattern.compile(";\\s*([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\")");
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    private MediaType(String s, String s1, String s2, String s3)
    {
        mediaType = s;
        type = s1;
        subtype = s2;
        charset = s3;
    }

    public static MediaType parse(String s)
    {
        Matcher matcher = TYPE_SUBTYPE.matcher(s);
        if (matcher.lookingAt()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s1;
        String s3;
        String s4;
        Matcher matcher1;
        int i;
        s3 = matcher.group(1).toLowerCase(Locale.US);
        s4 = matcher.group(2).toLowerCase(Locale.US);
        s1 = null;
        matcher1 = PARAMETER.matcher(s);
        i = matcher.end();
_L6:
        if (i >= s.length()) goto _L4; else goto _L3
_L3:
        matcher1.region(i, s.length());
        if (!matcher1.lookingAt()) goto _L1; else goto _L5
_L5:
        String s5 = matcher1.group(1);
        String s2 = s1;
        if (s5 != null)
        {
            if (!s5.equalsIgnoreCase("charset"))
            {
                s2 = s1;
            } else
            {
                if (s1 != null)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Multiple charsets: ").append(s).toString());
                }
                if (matcher1.group(2) != null)
                {
                    s1 = matcher1.group(2);
                } else
                {
                    s1 = matcher1.group(3);
                }
                s2 = s1;
            }
        }
        i = matcher1.end();
        s1 = s2;
          goto _L6
_L4:
        return new MediaType(s, s3, s4, s1);
    }

    public Charset charset()
    {
        if (charset != null)
        {
            return Charset.forName(charset);
        } else
        {
            return null;
        }
    }

    public Charset charset(Charset charset1)
    {
        if (charset != null)
        {
            charset1 = Charset.forName(charset);
        }
        return charset1;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof MediaType) && ((MediaType)obj).mediaType.equals(mediaType);
    }

    public int hashCode()
    {
        return mediaType.hashCode();
    }

    public String subtype()
    {
        return subtype;
    }

    public String toString()
    {
        return mediaType;
    }

    public String type()
    {
        return type;
    }

}
