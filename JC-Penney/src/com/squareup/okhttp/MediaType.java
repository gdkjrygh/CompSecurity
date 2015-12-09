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

    private static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
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
        Object obj = TYPE_SUBTYPE.matcher(s);
        if (((Matcher) (obj)).lookingAt()) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s1;
        String s2;
        String s3;
        Matcher matcher;
        int i;
        s2 = ((Matcher) (obj)).group(1).toLowerCase(Locale.US);
        s3 = ((Matcher) (obj)).group(2).toLowerCase(Locale.US);
        matcher = PARAMETER.matcher(s);
        i = ((Matcher) (obj)).end();
        s1 = null;
_L8:
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        matcher.region(i, s.length());
        if (!matcher.lookingAt()) goto _L1; else goto _L3
_L3:
        String s4;
        s4 = matcher.group(1);
        obj = s1;
        if (s4 == null) goto _L5; else goto _L4
_L4:
        if (s4.equalsIgnoreCase("charset")) goto _L7; else goto _L6
_L6:
        obj = s1;
_L5:
        i = matcher.end();
        s1 = ((String) (obj));
          goto _L8
_L7:
        if (matcher.group(2) != null)
        {
            obj = matcher.group(2);
        } else
        {
            obj = matcher.group(3);
        }
        if (s1 == null || ((String) (obj)).equalsIgnoreCase(s1)) goto _L5; else goto _L9
_L9:
        throw new IllegalArgumentException((new StringBuilder()).append("Multiple different charsets: ").append(s).toString());
        return new MediaType(s, s2, s3, s1);
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
