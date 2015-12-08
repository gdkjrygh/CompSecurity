// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import org.keyczar.enums.CipherMode;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            AesKey, HmacKey

final class rException
    implements DecryptingStream, EncryptingStream
{

    private final Cipher decryptingCipher;
    private final Cipher encryptingCipher;
    boolean ivRead;
    private final SigningStream signStream;
    final AesKey this$0;

    public final int doFinalDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        if (ivRead)
        {
            if (bytebuffer.remaining() == 0)
            {
                return 0;
            }
            byte abyte0[] = new byte[16];
            bytebuffer.get(abyte0);
            decryptingCipher.update(abyte0);
            ivRead = false;
        }
        int i;
        try
        {
            if (bytebuffer.remaining() == 0)
            {
                bytebuffer = decryptingCipher.doFinal();
                bytebuffer1.put(bytebuffer);
                return bytebuffer.length;
            }
            i = decryptingCipher.doFinal(bytebuffer, bytebuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        return i;
    }

    public final int doFinalEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        int i;
        try
        {
            i = encryptingCipher.doFinal(bytebuffer, bytebuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new KeyczarException(bytebuffer);
        }
        return i;
    }

    public final SigningStream getSigningStream()
    {
        return signStream;
    }

    public final VerifyingStream getVerifyingStream()
    {
        return (VerifyingStream)signStream;
    }

    public final void initDecrypt(ByteBuffer bytebuffer)
    {
        byte abyte0[] = new byte[16];
        bytebuffer.get(abyte0);
        decryptingCipher.update(abyte0);
        ivRead = true;
    }

    public final int initEncrypt(ByteBuffer bytebuffer)
        throws KeyczarException
    {
        byte abyte0[] = new byte[16];
        Util.rand(abyte0);
        int i;
        try
        {
            i = encryptingCipher.update(ByteBuffer.wrap(abyte0), bytebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new org.keyczar.exceptions.ShortBufferException(bytebuffer);
        }
        return i;
    }

    public final int maxOutputSize(int i)
    {
        return AesKey.access$000(AesKey.this).getOutputSize(16, i);
    }

    public final int updateDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        if (ivRead && bytebuffer.remaining() >= 16)
        {
            byte abyte0[] = new byte[16];
            bytebuffer.get(abyte0);
            decryptingCipher.update(abyte0);
            ivRead = false;
        }
        int i;
        try
        {
            i = decryptingCipher.update(bytebuffer, bytebuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new org.keyczar.exceptions.ShortBufferException(bytebuffer);
        }
        return i;
    }

    public final int updateEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
        throws KeyczarException
    {
        int i;
        try
        {
            i = encryptingCipher.update(bytebuffer, bytebuffer1);
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            throw new org.keyczar.exceptions.ShortBufferException(bytebuffer);
        }
        return i;
    }

    public arameterSpec()
        throws KeyczarException
    {
        this$0 = AesKey.this;
        super();
        ivRead = false;
        IvParameterSpec ivparameterspec = new IvParameterSpec(new byte[16]);
        try
        {
            encryptingCipher = Cipher.getInstance(AesKey.access$000(AesKey.this).getMode());
            encryptingCipher.init(1, AesKey.access$100(AesKey.this), ivparameterspec);
            decryptingCipher = Cipher.getInstance(AesKey.access$000(AesKey.this).getMode());
            decryptingCipher.init(2, AesKey.access$100(AesKey.this), ivparameterspec);
            signStream = (SigningStream)AesKey.access$200(AesKey.this).getStream();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (AesKey aeskey)
        {
            throw new KeyczarException(AesKey.this);
        }
    }
}
