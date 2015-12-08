// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

// Referenced classes of package org.spongycastle.util.encoders:
//            HexEncoder, Encoder

public class Hex
{

    private static final Encoder a = new HexEncoder();

    public Hex()
    {
    }

    public static byte[] a(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            a.a(s, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException((new StringBuilder("exception decoding Hex string: ")).append(s).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static byte[] a(byte abyte0[], int i, int j)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            a.a(abyte0, i, j, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException((new StringBuilder("exception encoding Hex string: ")).append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

}
