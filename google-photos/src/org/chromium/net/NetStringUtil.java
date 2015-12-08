// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.text.Normalizer;

public class NetStringUtil
{

    public NetStringUtil()
    {
    }

    private static String convertToUnicode(ByteBuffer bytebuffer, String s)
    {
        try
        {
            bytebuffer = Charset.forName(s).newDecoder().decode(bytebuffer).toString();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            return null;
        }
        return bytebuffer;
    }

    private static String convertToUnicodeAndNormalize(ByteBuffer bytebuffer, String s)
    {
        bytebuffer = convertToUnicode(bytebuffer, s);
        if (bytebuffer == null)
        {
            return null;
        } else
        {
            return Normalizer.normalize(bytebuffer, java.text.Normalizer.Form.NFC);
        }
    }

    private static String convertToUnicodeWithSubstitutions(ByteBuffer bytebuffer, String s)
    {
        try
        {
            s = Charset.forName(s).newDecoder();
            s.onMalformedInput(CodingErrorAction.REPLACE);
            s.onUnmappableCharacter(CodingErrorAction.REPLACE);
            s.replaceWith("\uFFFD");
            bytebuffer = s.decode(bytebuffer).toString();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            return null;
        }
        return bytebuffer;
    }
}
