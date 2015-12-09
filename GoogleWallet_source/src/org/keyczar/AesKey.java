// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.keyczar.enums.CipherMode;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.keyparams.AesKeyParameters;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarKey, DefaultKeyType, HmacKey

public class AesKey extends KeyczarKey
{
    final class AesStream
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
            return mode.getOutputSize(16, i);
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

        public AesStream()
            throws KeyczarException
        {
            this$0 = AesKey.this;
            super();
            ivRead = false;
            IvParameterSpec ivparameterspec = new IvParameterSpec(new byte[16]);
            try
            {
                encryptingCipher = Cipher.getInstance(mode.getMode());
                encryptingCipher.init(1, aesKey, ivparameterspec);
                decryptingCipher = Cipher.getInstance(mode.getMode());
                decryptingCipher.init(2, aesKey, ivparameterspec);
                signStream = (SigningStream)hmacKey.getStream();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (AesKey aeskey)
            {
                throw new KeyczarException(AesKey.this);
            }
        }
    }


    private static final CipherMode DEFAULT_MODE;
    private static final DefaultKeyType KEY_TYPE;
    private SecretKey aesKey;
    private final String aesKeyString;
    private final byte hash[];
    private final HmacKey hmacKey;
    private final CipherMode mode;

    private AesKey()
    {
        super(0);
        hash = new byte[4];
        aesKeyString = null;
        hmacKey = null;
        mode = null;
    }

    private AesKey(byte abyte0[], HmacKey hmackey)
        throws KeyczarException
    {
        super(abyte0.length << 3);
        hash = new byte[4];
        aesKeyString = Base64Coder.encodeWebSafe(abyte0);
        mode = DEFAULT_MODE;
        hmacKey = hmackey;
        initJceKey(abyte0);
    }

    static AesKey generate(AesKeyParameters aeskeyparameters)
        throws KeyczarException
    {
        return new AesKey(Util.rand(aeskeyparameters.getKeySize() / 8), aeskeyparameters.getHmacKey());
    }

    private void initJceKey(byte abyte0[])
        throws KeyczarException
    {
        aesKey = new SecretKeySpec(abyte0, "AES");
        System.arraycopy(Util.hash(new byte[][] {
            Util.fromInt(16), abyte0, hmacKey.getEncoded()
        }), 0, hash, 0, hash.length);
    }

    static AesKey read(String s)
        throws KeyczarException
    {
        s = (AesKey)Util.gson().fromJson(s, org/keyczar/AesKey);
        ((AesKey) (s)).hmacKey.initFromJson();
        s.initJceKey(Base64Coder.decodeWebSafe(((AesKey) (s)).aesKeyString));
        return s;
    }

    final byte[] getEncoded()
    {
        return Util.lenPrefixPack(new byte[][] {
            aesKey.getEncoded(), hmacKey.getEncoded()
        });
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new AesStream();
    }

    protected final byte[] hash()
    {
        return hash;
    }

    static 
    {
        KEY_TYPE = DefaultKeyType.AES;
        DEFAULT_MODE = CipherMode.CBC;
    }



}
