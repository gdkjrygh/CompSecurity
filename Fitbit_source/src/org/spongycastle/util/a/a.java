// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package org.spongycastle.util.a:
//            b, e

public class a
{

    private static final e a = new b();

    public a()
    {
    }

    public static int a(String s, OutputStream outputstream)
        throws IOException
    {
        return a.a(s, outputstream);
    }

    public static int a(byte abyte0[], int i, int j, OutputStream outputstream)
        throws IOException
    {
        return a.a(abyte0, i, j, outputstream);
    }

    public static int a(byte abyte0[], OutputStream outputstream)
        throws IOException
    {
        return a.a(abyte0, 0, abyte0.length, outputstream);
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
            throw new RuntimeException((new StringBuilder()).append("exception decoding base64 string: ").append(s).toString());
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
            throw new RuntimeException((new StringBuilder()).append("exception encoding base64 string: ").append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] b(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream((abyte0.length / 4) * 3);
        try
        {
            a.b(abyte0, 0, abyte0.length, bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException((new StringBuilder()).append("exception decoding base64 string: ").append(abyte0).toString());
        }
        return bytearrayoutputstream.toByteArray();
    }

}
