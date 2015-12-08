// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.binary;

import java.io.UnsupportedEncodingException;

public class StringUtils
{

    public static byte[] getBytesUnchecked(String s, String s1)
    {
        if (s == null)
        {
            return null;
        }
        try
        {
            s = s.getBytes(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw newIllegalStateException(s1, s);
        }
        return s;
    }

    public static byte[] getBytesUtf8(String s)
    {
        return getBytesUnchecked(s, "UTF-8");
    }

    private static IllegalStateException newIllegalStateException(String s, UnsupportedEncodingException unsupportedencodingexception)
    {
        return new IllegalStateException((new StringBuilder()).append(s).append(": ").append(unsupportedencodingexception).toString());
    }
}
