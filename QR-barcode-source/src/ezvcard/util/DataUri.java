// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import ezvcard.util.org.apache.commons.codec.binary.Base64;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DataUri
{

    private static final Pattern regex = Pattern.compile("^data:(.*?);base64,(.*)", 2);
    private final String contentType;
    private final byte data[];

    public DataUri(String s)
    {
        Matcher matcher = regex.matcher(s);
        if (!matcher.find())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid data URI: ").append(s).toString());
        } else
        {
            contentType = matcher.group(1);
            data = Base64.decodeBase64(matcher.group(2));
            return;
        }
    }

    public DataUri(String s, byte abyte0[])
    {
        contentType = s;
        data = abyte0;
    }

    public String getContentType()
    {
        return contentType;
    }

    public byte[] getData()
    {
        return data;
    }

    public String toString()
    {
        return (new StringBuilder()).append("data:").append(contentType).append(";base64,").append(Base64.encodeBase64String(data)).toString();
    }

    public URI toUri()
    {
        return URI.create(toString());
    }

}
