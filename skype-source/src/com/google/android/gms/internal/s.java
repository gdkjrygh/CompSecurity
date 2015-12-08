// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.android.gms.internal:
//            q

public final class s
{
    public final class a extends Exception
    {

        final s a;

        public a()
        {
            a = s.this;
            super();
        }

        public a(Throwable throwable)
        {
            a = s.this;
            super(throwable);
        }
    }


    private final q a;
    private final SecureRandom b = null;

    public s(q q1)
    {
        a = q1;
    }

    public final byte[] a(String s1)
        throws a
    {
        try
        {
            s1 = a.a(s1);
            if (s1.length != 32)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new a(s1);
        }
        byte abyte0[];
        s1 = ByteBuffer.wrap(s1, 4, 16);
        abyte0 = new byte[16];
        s1.get(abyte0);
        for (int i = 0; i < 16; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ 0x44);
        }

        return abyte0;
    }

    public final byte[] a(byte abyte0[], String s1)
        throws a
    {
        if (abyte0.length != 16)
        {
            throw new a();
        }
        byte abyte1[];
        Object obj;
        try
        {
            abyte1 = a.a(s1);
            if (abyte1.length <= 16)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new a(abyte0);
        }
        obj = ByteBuffer.allocate(abyte1.length);
        ((ByteBuffer) (obj)).put(abyte1);
        ((ByteBuffer) (obj)).flip();
        s1 = new byte[16];
        abyte1 = new byte[abyte1.length - 16];
        ((ByteBuffer) (obj)).get(s1);
        ((ByteBuffer) (obj)).get(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
        ((Cipher) (obj)).init(2, abyte0, new IvParameterSpec(s1));
        abyte0 = ((Cipher) (obj)).doFinal(abyte1);
        return abyte0;
    }
}
