// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package org.spongycastle.util.encoders:
//            Base64Encoder, Encoder

public class Base64
{

    private static final Encoder a = new Base64Encoder();

    public Base64()
    {
    }

    public static byte[] a(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((s.length() / 4) * 3);
        try
        {
            a.a(s, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder("exception decoding base64 string: ")).append(s).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] a(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(((abyte0.length + 2) / 3) * 4);
        try
        {
            a.a(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException((new StringBuilder("exception encoding base64 string: ")).append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

}
