// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;

import com.facebook.analytics.logger.HoneyClientEvent;
import com.facebook.common.util.Hex;
import com.google.common.io.CharStreams;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class AppStateLogParser
{

    private static Charset a;
    private final MessageDigest b = MessageDigest.getInstance("MD5");
    private final byte c[];
    private final byte d[] = new byte[32];

    public AppStateLogParser()
    {
        c = new byte[b.getDigestLength()];
    }

    private static String a(Exception exception)
    {
        StringWriter stringwriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringwriter));
        return stringwriter.toString();
    }

    private static Charset a()
    {
        if (a == null)
        {
            a = Charset.forName("US-ASCII");
        }
        return a;
    }

    private void a(InputStream inputstream, HoneyClientEvent honeyclientevent)
    {
        Charset charset = a();
        Object obj = new DataInputStream(inputstream);
        int i;
        try
        {
            i = ((DataInputStream) (obj)).readUnsignedByte();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AppStateLogParserException("Error reading status byte", inputstream);
        }
        honeyclientevent.b("status", Character.toString((char)i));
        try
        {
            ((DataInputStream) (obj)).readFully(d);
            obj = new String(d, charset);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AppStateLogParserException("Error reading checksum", inputstream);
        }
        honeyclientevent.b("checksum", ((String) (obj)));
        try
        {
            b.reset();
            inputstream = CharStreams.a(new InputStreamReader(new DigestInputStream(inputstream, b), charset));
            b.digest(c, 0, c.length);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new AppStateLogParserException("Error reading log contents", inputstream);
        }
        honeyclientevent.b("contents", inputstream);
        inputstream = Hex.a(c, false);
        if (!inputstream.equals(obj))
        {
            throw new AppStateLogParserException((new StringBuilder("Checksum does not match. Expected '")).append(inputstream).append("'").toString());
        } else
        {
            return;
        }
    }

    public final HoneyClientEvent a(InputStream inputstream)
    {
        HoneyClientEvent honeyclientevent = new HoneyClientEvent("fbandroid_cold_start");
        try
        {
            a(inputstream, honeyclientevent);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            honeyclientevent.b("logParseError", a(((Exception) (inputstream))));
            return honeyclientevent;
        }
        return honeyclientevent;
    }

    private class AppStateLogParserException extends Exception
    {

        public AppStateLogParserException(String s)
        {
            super(s);
        }

        public AppStateLogParserException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

}
