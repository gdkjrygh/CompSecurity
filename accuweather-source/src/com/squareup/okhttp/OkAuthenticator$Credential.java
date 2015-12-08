// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Base64;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.squareup.okhttp:
//            OkAuthenticator

public static final class headerValue
{

    private final String headerValue;

    public static headerValue basic(String s, String s1)
    {
        try
        {
            s = Base64.encode((new StringBuilder()).append(s).append(":").append(s1).toString().getBytes("ISO-8859-1"));
            s = new <init>((new StringBuilder()).append("Basic ").append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new AssertionError();
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof <init>) && ((<init>)obj).headerValue.equals(headerValue);
    }

    public String getHeaderValue()
    {
        return headerValue;
    }

    public int hashCode()
    {
        return headerValue.hashCode();
    }

    public String toString()
    {
        return headerValue;
    }

    private (String s)
    {
        headerValue = s;
    }
}
