// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.crypto;

import KK;
import android.util.Base64;
import com.facebook.crypto.CBCCrypto;
import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.exception.KeyChainException;
import com.snapchat.android.Timber;
import eK;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.IOUtils;

public final class CbcEncryptionAlgorithm
    implements KK
{
    public static final class MODE extends Enum
    {

        private static final MODE $VALUES[];
        public static final MODE DECRYPT;
        public static final MODE ENCRYPT;

        public static MODE valueOf(String s)
        {
            return (MODE)Enum.valueOf(com/snapchat/android/util/crypto/CbcEncryptionAlgorithm$MODE, s);
        }

        public static MODE[] values()
        {
            return (MODE[])$VALUES.clone();
        }

        static 
        {
            ENCRYPT = new MODE("ENCRYPT", 0);
            DECRYPT = new MODE("DECRYPT", 1);
            $VALUES = (new MODE[] {
                ENCRYPT, DECRYPT
            });
        }

        private MODE(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String TAG = "CbcEncryptionAlgorithm";
    private final byte mIv[];
    private final byte mKey[];

    public CbcEncryptionAlgorithm()
    {
        SecureRandom securerandom = new SecureRandom();
        byte abyte0[] = new byte[16];
        securerandom.nextBytes(abyte0);
        this(abyte0, a());
    }

    public CbcEncryptionAlgorithm(String s, String s1)
    {
        this(Base64.decode(s, 0), Base64.decode(s1, 0));
    }

    public CbcEncryptionAlgorithm(byte abyte0[], byte abyte1[])
    {
        mKey = abyte0;
        mIv = abyte1;
    }

    private InputStream a(InputStream inputstream, MODE mode)
    {
        CBCCrypto cbccrypto;
        cbccrypto = CBCCrypto.getInstance();
        if (!cbccrypto.isAvailable())
        {
            Timber.e("CbcEncryptionAlgorithm", "Crypto not available.", new Object[0]);
            return null;
        }
        if (MODE.ENCRYPT.equals(mode))
        {
            return cbccrypto.getCipherInputStream(inputstream, mKey, mIv);
        }
        inputstream = cbccrypto.getDecipherInputStream(inputstream, mKey, mIv);
        return inputstream;
        inputstream;
_L2:
        Timber.e("CbcEncryptionAlgorithm", (new StringBuilder("Exception during native encryption/decryption ")).append(inputstream).toString(), new Object[0]);
        return null;
        inputstream;
        continue; /* Loop/switch isn't completed */
        inputstream;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] a()
    {
        byte abyte0[] = null;
        byte abyte1[];
        try
        {
            abyte1 = new byte[Cipher.getInstance("AES/CBC/PKCS5Padding").getBlockSize()];
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            Timber.e("CbcEncryptionAlgorithm", "Could not generate iv", new Object[0]);
            return abyte0;
        }
        abyte0 = abyte1;
        (new SecureRandom()).nextBytes(abyte1);
        return abyte1;
    }

    private static Cipher d()
    {
        if (android.os.Build.VERSION.SDK_INT == 18)
        {
            return Cipher.getInstance("AES/CBC/PKCS5Padding", "BC");
        } else
        {
            return Cipher.getInstance("AES/CBC/PKCS5Padding");
        }
    }

    private static boolean e()
    {
        return android.os.Build.VERSION.SDK_INT > 18;
    }

    public final InputStream a(InputStream inputstream)
    {
        Object obj = null;
        if (!e())
        {
            obj = a(inputstream, MODE.DECRYPT);
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        Cipher cipher = d();
        cipher.init(2, new SecretKeySpec(mKey, "AES"), new IvParameterSpec(mIv));
        inputstream = new CipherInputStream(inputstream, cipher);
        return inputstream;
        obj;
        inputstream = null;
_L3:
        Timber.a("CbcEncryptionAlgorithm", ((Throwable) (obj)));
        Timber.e("CbcEncryptionAlgorithm", "Unable to decrypt data from input stream [key:%s, iv:%s]", new Object[] {
            eK.a().a(mKey), eK.a().a(mIv)
        });
        return inputstream;
        GeneralSecurityException generalsecurityexception;
        generalsecurityexception;
        inputstream = ((InputStream) (obj));
        obj = generalsecurityexception;
        if (true) goto _L3; else goto _L2
_L2:
        return ((InputStream) (obj));
    }

    public final byte[] a(byte abyte0[])
    {
        return a(abyte0, "no dataId provided");
    }

    public final byte[] a(byte abyte0[], String s)
    {
        Object obj = null;
        if (e()) goto _L2; else goto _L1
_L1:
        InputStream inputstream = a(((InputStream) (new ByteArrayInputStream(abyte0))), MODE.ENCRYPT);
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = IOUtils.toByteArray(inputstream);
        GeneralSecurityException generalsecurityexception;
        try
        {
            IOUtils.closeQuietly(inputstream);
        }
        // Misplaced declaration of an exception variable
        catch (GeneralSecurityException generalsecurityexception)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        inputstream = ((InputStream) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        inputstream = d();
        inputstream.init(1, new SecretKeySpec(mKey, "AES"), new IvParameterSpec(mIv));
        inputstream = inputstream.doFinal(abyte0);
        return inputstream;
        obj;
        Timber.e("CbcEncryptionAlgorithm", (new StringBuilder("Exception during native encryption")).append(obj).toString(), new Object[0]);
        IOUtils.closeQuietly(inputstream);
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj;
        IOUtils.closeQuietly(inputstream);
        throw obj;
        generalsecurityexception;
        obj = null;
_L3:
        Timber.a("CbcEncryptionAlgorithm", generalsecurityexception);
        Timber.e("CbcEncryptionAlgorithm", "Unable to encrypt data [dataId:%s, length:%d, key:%s, iv:%s]", new Object[] {
            s, Integer.valueOf(abyte0.length), eK.a().a(mKey), eK.a().a(mIv)
        });
        return ((byte []) (obj));
        generalsecurityexception;
        if (true) goto _L3; else goto _L2
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final String b()
    {
        return Base64.encodeToString(mKey, 0);
    }

    public final byte[] b(byte abyte0[])
    {
        return b(abyte0, "no dataId provided");
    }

    public final byte[] b(byte abyte0[], String s)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        InputStream inputstream;
        if (e())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        inputstream = a(new ByteArrayInputStream(abyte0), MODE.DECRYPT);
        obj = obj1;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = IOUtils.toByteArray(inputstream);
_L1:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        try
        {
            obj = d();
            ((Cipher) (obj)).init(2, new SecretKeySpec(mKey, "AES"), new IvParameterSpec(mIv));
            return ((Cipher) (obj)).doFinal(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Timber.e("CbcEncryptionAlgorithm", "Unable to decrypt data [dataId:%s, length:%d, key:%s, iv:%s]", new Object[] {
                s, Integer.valueOf(abyte0.length), eK.a().a(mKey), eK.a().a(mIv)
            });
        }
        break MISSING_BLOCK_LABEL_173;
        obj;
        Timber.e("CbcEncryptionAlgorithm", (new StringBuilder("Exception during native decryption")).append(obj).toString(), new Object[0]);
        IOUtils.closeQuietly(inputstream);
        obj = obj1;
          goto _L1
        throw new GeneralSecurityException(((Throwable) (obj)));
        return ((byte []) (obj));
    }

    public final String c()
    {
        return Base64.encodeToString(mIv, 0);
    }
}
