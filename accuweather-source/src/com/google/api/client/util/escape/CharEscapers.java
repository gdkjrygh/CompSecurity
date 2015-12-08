// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.escape;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.api.client.util.escape:
//            PercentEscaper, Escaper

public final class CharEscapers
{

    private static final Escaper URI_ESCAPER = new PercentEscaper("-_.*", true);
    private static final Escaper URI_PATH_ESCAPER = new PercentEscaper("-_.!~*'()@:$&,;=", false);
    private static final Escaper URI_QUERY_STRING_ESCAPER = new PercentEscaper("-_.!~*'()@:$,;/?:", false);
    private static final Escaper URI_RESERVED_ESCAPER = new PercentEscaper("-_.!~*'()@:$&,;=+/?", false);
    private static final Escaper URI_USERINFO_ESCAPER = new PercentEscaper("-_.!~*'():$&,;=", false);

    private CharEscapers()
    {
    }

    public static String decodeUri(String s)
    {
        try
        {
            s = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static String escapeUri(String s)
    {
        return URI_ESCAPER.escape(s);
    }

    public static String escapeUriPath(String s)
    {
        return URI_PATH_ESCAPER.escape(s);
    }

    public static String escapeUriPathWithoutReserved(String s)
    {
        return URI_RESERVED_ESCAPER.escape(s);
    }

    public static String escapeUriQuery(String s)
    {
        return URI_QUERY_STRING_ESCAPER.escape(s);
    }

    public static String escapeUriUserInfo(String s)
    {
        return URI_USERINFO_ESCAPER.escape(s);
    }

}
