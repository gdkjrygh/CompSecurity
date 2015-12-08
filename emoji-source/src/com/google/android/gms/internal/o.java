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
//            m

public class o
{
    public class a extends Exception
    {

        final o km;

        public a()
        {
            km = o.this;
            super();
        }

        public a(Throwable throwable)
        {
            km = o.this;
            super(throwable);
        }
    }


    private final m jQ;
    private final SecureRandom kl;

    public o(m m1, SecureRandom securerandom)
    {
        jQ = m1;
        kl = securerandom;
    }

    static void c(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ 0x44);
        }

    }

    public byte[] b(String s)
        throws a
    {
        try
        {
            s = jQ.a(s, false);
            if (s.length != 32)
            {
                throw new a();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new a(s);
        }
        byte abyte0[];
        s = ByteBuffer.wrap(s, 4, 16);
        abyte0 = new byte[16];
        s.get(abyte0);
        c(abyte0);
        return abyte0;
    }

    public byte[] c(byte abyte0[], String s)
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
            abyte1 = jQ.a(s, false);
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
        s = new byte[16];
        abyte1 = new byte[abyte1.length - 16];
        ((ByteBuffer) (obj)).get(s);
        ((ByteBuffer) (obj)).get(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
        ((Cipher) (obj)).init(2, abyte0, new IvParameterSpec(s));
        abyte0 = ((Cipher) (obj)).doFinal(abyte1);
        return abyte0;
    }
}
