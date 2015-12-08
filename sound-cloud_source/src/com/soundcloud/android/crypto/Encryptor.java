// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.crypto;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.strings.Charsets;
import com.soundcloud.java.strings.Strings;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.soundcloud.android.crypto:
//            EncryptionException, CipherWrapper, EncryptionInterruptedException, DeviceSecret

public class Encryptor
{
    public static interface EncryptionProgressListener
    {

        public abstract void onBytesEncrypted(long l);
    }


    private static final int BLOCK_SIZE = 8192;
    private static final String CIPHER_ALG = "AES/CBC/PKCS7Padding";
    private static final String HASH_ALG = "sha1";
    private static final String KEY_ALG = "AES";
    private static final int REPORT_INTERVAL = 20;
    private final AtomicBoolean cancelRequest = new AtomicBoolean();
    private final CipherWrapper cipher;

    public Encryptor(CipherWrapper cipherwrapper)
    {
        cipher = cipherwrapper;
    }

    private void initCipher(DeviceSecret devicesecret, int i)
        throws EncryptionException
    {
        cipher.init("AES/CBC/PKCS7Padding", i, devicesecret, "AES");
    }

    private void runCipher(InputStream inputstream, OutputStream outputstream, DeviceSecret devicesecret, int i, EncryptionProgressListener encryptionprogresslistener)
        throws EncryptionException, IOException
    {
        initCipher(devicesecret, i);
        devicesecret = new byte[8192];
        byte abyte0[] = new byte[cipher.getOutputSize(8192)];
        long l = 0L;
        do
        {
            if (cancelRequest.get())
            {
                break;
            }
            i = inputstream.read(devicesecret);
            if (i == -1)
            {
                break;
            }
            outputstream.write(abyte0, 0, cipher.update(devicesecret, 0, i, abyte0));
            long l1 = l + (long)i;
            l = l1;
            if (encryptionprogresslistener != null)
            {
                l = l1;
                if ((l1 / 8192L) % 20L == 0L)
                {
                    encryptionprogresslistener.onBytesEncrypted(l1);
                    l = l1;
                }
            }
        } while (true);
        if (cancelRequest.getAndSet(false))
        {
            throw new EncryptionInterruptedException("File encryption cancelled");
        }
        if (encryptionprogresslistener != null)
        {
            encryptionprogresslistener.onBytesEncrypted(l);
        }
        outputstream.write(abyte0, 0, cipher.finish(abyte0, 0));
    }

    public void decrypt(InputStream inputstream, OutputStream outputstream, DeviceSecret devicesecret)
        throws EncryptionException, IOException
    {
        runCipher(inputstream, outputstream, devicesecret, 2, null);
    }

    public void encrypt(InputStream inputstream, OutputStream outputstream, DeviceSecret devicesecret, EncryptionProgressListener encryptionprogresslistener)
        throws EncryptionException, IOException
    {
        runCipher(inputstream, outputstream, devicesecret, 1, encryptionprogresslistener);
    }

    public String hash(Urn urn)
        throws EncryptionException
    {
        try
        {
            urn = hash(urn, MessageDigest.getInstance("sha1"));
        }
        // Misplaced declaration of an exception variable
        catch (Urn urn)
        {
            throw new EncryptionException("No provider found for sha1 digest", urn);
        }
        return urn;
    }

    protected String hash(Urn urn, MessageDigest messagedigest)
    {
        return Strings.toHexString(messagedigest.digest(urn.toEncodedString().getBytes(Charsets.UTF_8)));
    }

    public void tryToCancelRequest()
    {
        cancelRequest.set(true);
    }
}
