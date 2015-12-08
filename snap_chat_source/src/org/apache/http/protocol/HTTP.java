// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.protocol;

import java.nio.charset.Charset;
import org.apache.http.Consts;

public final class HTTP
{

    public static final Charset DEF_CONTENT_CHARSET;
    public static final Charset DEF_PROTOCOL_CHARSET;

    public static boolean isWhitespace(char c)
    {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    static 
    {
        DEF_CONTENT_CHARSET = Consts.ISO_8859_1;
        DEF_PROTOCOL_CHARSET = Consts.ASCII;
    }
}
