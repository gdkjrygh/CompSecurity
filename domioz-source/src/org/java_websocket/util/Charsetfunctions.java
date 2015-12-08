// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket.util;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import org.java_websocket.c.b;

public class Charsetfunctions
{

    public static CodingErrorAction a;

    public Charsetfunctions()
    {
    }

    public static String a(ByteBuffer bytebuffer)
    {
        Object obj = Charset.forName("UTF8").newDecoder();
        ((CharsetDecoder) (obj)).onMalformedInput(a);
        ((CharsetDecoder) (obj)).onUnmappableCharacter(a);
        try
        {
            bytebuffer.mark();
            obj = ((CharsetDecoder) (obj)).decode(bytebuffer).toString();
            bytebuffer.reset();
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new b(1007, bytebuffer);
        }
        return ((String) (obj));
    }

    public static String a(byte abyte0[], int i)
    {
        try
        {
            abyte0 = new String(abyte0, 0, i, "ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return abyte0;
    }

    public static byte[] a(String s)
    {
        try
        {
            s = s.getBytes("UTF8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static byte[] b(String s)
    {
        try
        {
            s = s.getBytes("ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static void main(String args[])
    {
        a(ByteBuffer.wrap(a("\0")));
        args = b("\0");
        a(args, args.length);
    }

    static 
    {
        a = CodingErrorAction.REPORT;
    }
}
