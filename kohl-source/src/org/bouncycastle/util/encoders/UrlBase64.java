// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.bouncycastle.util.encoders:
//            UrlBase64Encoder, Encoder

public class UrlBase64
{

    private static final Encoder encoder = new UrlBase64Encoder();

    public UrlBase64()
    {
    }

    public static int decode(String s, OutputStream outputstream)
        throws IOException
    {
        return encoder.decode(s, outputstream);
    }

    public static int decode(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        return encoder.decode(abyte0, 0, abyte0.length, outputstream);
    }

    public static byte[] decode(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            encoder.decode(s, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder()).append("exception decoding URL safe base64 string: ").append(s).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] decode(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            encoder.decode(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException((new StringBuilder()).append("exception decoding URL safe base64 string: ").append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static int encode(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        return encoder.encode(abyte0, 0, abyte0.length, outputstream);
    }

    public static byte[] encode(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            encoder.encode(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException((new StringBuilder()).append("exception encoding URL safe base64 string: ").append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

}
