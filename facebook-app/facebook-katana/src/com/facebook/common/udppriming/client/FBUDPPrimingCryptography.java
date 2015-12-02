// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import android.util.Log;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.facebook.common.udppriming.client:
//            HMAC

public class FBUDPPrimingCryptography
{

    private final byte a[];
    private final Cipher b = Cipher.getInstance("AES/CBC/NOPadding");
    private final byte c[];
    private final SecureRandom d;
    private byte e[];

    public FBUDPPrimingCryptography(byte abyte0[], byte abyte1[], SecureRandom securerandom)
    {
        d = securerandom;
        a = abyte0;
        e = a();
        c = abyte1;
    }

    private byte[] a()
    {
        byte abyte0[] = new byte[16];
        d.nextBytes(abyte0);
        return abyte0;
    }

    private static byte[] a(int i)
    {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    private byte[] a(byte abyte0[])
    {
        SecretKeySpec secretkeyspec = new SecretKeySpec(c, "AES");
        b.init(1, secretkeyspec, new IvParameterSpec(e));
        abyte0 = b.doFinal(abyte0);
        return abyte0;
        abyte0;
        Log.e("FBUDPPrimingCryptography", "Bad padding exception in AES256Encrypt.", abyte0);
_L2:
        throw new RuntimeException(abyte0);
        abyte0;
        Log.e("FBUDPPrimingCryptography", "Illegal block size exception in AES256Encrypt.", abyte0);
        continue; /* Loop/switch isn't completed */
        abyte0;
        Log.e("FBUDPPrimingCryptography", "Invalid algorithm parameter exception in AES256Encrypt.", abyte0);
        continue; /* Loop/switch isn't completed */
        abyte0;
        Log.e("FBUDPPrimingCryptography", "Invalid key exception in AES256Encrypt.", abyte0);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private byte[] a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        d.nextBytes(abyte1);
        abyte1[i - 1] = (byte)i;
        byte abyte2[] = new byte[abyte0.length + i];
        System.arraycopy(abyte0, 0, abyte2, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte2, abyte0.length, i);
        return abyte2;
    }

    private byte[] a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (abyte0.length != 16 || abyte1.length >= 1500 || abyte2.length >= 256)
        {
            return null;
        } else
        {
            ByteBuffer bytebuffer = ByteBuffer.allocate(abyte1.length + 20 + 4 + abyte2.length);
            bytebuffer.put(abyte0);
            bytebuffer.put(a(abyte1.length));
            bytebuffer.put(abyte1);
            bytebuffer.put(a(abyte2.length));
            bytebuffer.put(abyte2);
            return HMAC.a(bytebuffer.array(), a, HMAC.KeyAlgorithm.HMAC_SHA256);
        }
    }

    public final byte[] a(byte abyte0[], byte abyte1[])
    {
        int i = 16 - abyte0.length % 16;
        ByteBuffer bytebuffer = ByteBuffer.allocate(abyte0.length + i + 49);
        bytebuffer.put((byte)1);
        abyte0 = a(a(abyte0, i));
        abyte1 = a(e, abyte0, abyte1);
        if (abyte1 == null)
        {
            return null;
        } else
        {
            bytebuffer.put(abyte1);
            bytebuffer.put(e);
            bytebuffer.put(abyte0);
            return bytebuffer.array();
        }
    }
}
