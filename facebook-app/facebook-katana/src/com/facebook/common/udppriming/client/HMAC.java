// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HMAC
{

    private HMAC()
    {
    }

    public static byte[] a(byte abyte0[], byte abyte1[], KeyAlgorithm keyalgorithm)
    {
        try
        {
            abyte1 = new SecretKeySpec(abyte1, keyalgorithm.getAlgorithmName());
            keyalgorithm = Mac.getInstance(keyalgorithm.getAlgorithmName());
            keyalgorithm.init(abyte1);
            abyte0 = keyalgorithm.doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }

    private class KeyAlgorithm extends Enum
    {

        private static final KeyAlgorithm $VALUES[];
        public static final KeyAlgorithm HMAC_MD5;
        public static final KeyAlgorithm HMAC_SHA1;
        public static final KeyAlgorithm HMAC_SHA256;
        private final String mAlgorithm;

        public static KeyAlgorithm valueOf(String s)
        {
            return (KeyAlgorithm)Enum.valueOf(com/facebook/common/udppriming/client/HMAC$KeyAlgorithm, s);
        }

        public static KeyAlgorithm[] values()
        {
            return (KeyAlgorithm[])$VALUES.clone();
        }

        public final String getAlgorithmName()
        {
            return mAlgorithm;
        }

        static 
        {
            HMAC_MD5 = new KeyAlgorithm("HMAC_MD5", 0, "HmacMD5");
            HMAC_SHA1 = new KeyAlgorithm("HMAC_SHA1", 1, "HmacSHA1");
            HMAC_SHA256 = new KeyAlgorithm("HMAC_SHA256", 2, "HmacSHA256");
            $VALUES = (new KeyAlgorithm[] {
                HMAC_MD5, HMAC_SHA1, HMAC_SHA256
            });
        }

        private KeyAlgorithm(String s, int i, String s1)
        {
            super(s, i);
            mAlgorithm = s1;
        }
    }

}
