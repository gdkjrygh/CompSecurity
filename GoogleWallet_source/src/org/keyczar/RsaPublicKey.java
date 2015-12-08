// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.UnsupportedTypeException;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarPublicKey, DefaultKeyType

public class RsaPublicKey extends KeyczarPublicKey
{
    final class RsaStream
        implements EncryptingStream, VerifyingStream
    {

        private Cipher cipher;
        private Signature signature;
        final RsaPublicKey this$0;

        public final int digestSize()
        {
            return keySizeInBytes();
        }

        public final int doFinalEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
            throws KeyczarException
        {
            int i;
            int j;
            ByteBuffer bytebuffer2;
            try
            {
                i = cipher.getOutputSize(bytebuffer.limit());
                j = bytebuffer1.limit() - bytebuffer1.position();
                bytebuffer2 = ByteBuffer.allocate(i);
                cipher.doFinal(bytebuffer, bytebuffer2);
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
            if (i != j)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            bytebuffer1.put(bytebuffer2.array());
            return j;
            if (i != j + 1)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            if (bytebuffer2.array()[i - 1] != 0)
            {
                break MISSING_BLOCK_LABEL_105;
            }
            bytebuffer1.put(bytebuffer2.array(), 0, j);
            return j;
            throw new KeyczarException((new StringBuilder(72)).append("Expected ").append(j).append(" bytes from encryption operation but got ").append(i).toString());
        }

        public final SigningStream getSigningStream()
        {
            return new SigningStream() {

                final RsaStream this$1;

                public final int digestSize()
                {
                    return 0;
                }

                public final void initSign()
                {
                }

                public final void sign(ByteBuffer bytebuffer)
                {
                }

                public final void updateSign(ByteBuffer bytebuffer)
                {
                }

            
            {
                this$1 = RsaStream.this;
                super();
            }
            };
        }

        public final int initEncrypt(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            try
            {
                cipher.init(1, jcePublicKey);
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
            return 0;
        }

        public final void initVerify()
            throws KeyczarException
        {
            try
            {
                signature.initVerify(jcePublicKey);
                return;
            }
            catch (GeneralSecurityException generalsecurityexception)
            {
                throw new KeyczarException(generalsecurityexception);
            }
        }

        public final int maxOutputSize(int i)
        {
            return keySizeInBytes();
        }

        public final int updateEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
            throws KeyczarException
        {
            int i;
            try
            {
                i = cipher.update(bytebuffer, bytebuffer1);
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
            return i;
        }

        public final void updateVerify(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            try
            {
                signature.update(bytebuffer);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
        }

        public final boolean verify(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            boolean flag;
            try
            {
                flag = signature.verify(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit() - bytebuffer.position());
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
            return flag;
        }

        RsaStream()
            throws KeyczarException
        {
            this$0 = RsaPublicKey.this;
            super();
            try
            {
                signature = Signature.getInstance("SHA1withRSA");
                cipher = Cipher.getInstance(getPadding().getCryptAlgorithm());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RsaPublicKey rsapublickey)
            {
                throw new KeyczarException(RsaPublicKey.this);
            }
        }
    }


    private final byte hash[] = new byte[4];
    private RSAPublicKey jcePublicKey;
    final String modulus = null;
    final RsaPadding padding = null;
    final String publicExponent = null;

    private RsaPublicKey()
    {
        super(0);
    }

    private static KeyType getType()
    {
        return DefaultKeyType.RSA_PUB;
    }

    private void initializeHash()
        throws KeyczarException
    {
        System.arraycopy(getPadding().computeFullHash(jcePublicKey), 0, hash, 0, hash.length);
    }

    private void initializeJceKey(BigInteger biginteger, BigInteger biginteger1)
        throws KeyczarException
    {
        try
        {
            biginteger = new RSAPublicKeySpec(biginteger, biginteger1);
            jcePublicKey = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(biginteger);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BigInteger biginteger)
        {
            throw new KeyczarException(biginteger);
        }
    }

    static RsaPublicKey read(String s)
        throws KeyczarException
    {
        s = (RsaPublicKey)Util.gson().fromJson(s, org/keyczar/RsaPublicKey);
        if (getType() != DefaultKeyType.RSA_PUB)
        {
            throw new UnsupportedTypeException(getType());
        } else
        {
            return s.initFromJson();
        }
    }

    public final RsaPadding getPadding()
    {
        if (padding == null || padding == RsaPadding.OAEP)
        {
            return RsaPadding.OAEP;
        } else
        {
            return RsaPadding.PKCS;
        }
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new RsaStream();
    }

    public final byte[] hash()
    {
        return hash;
    }

    final RsaPublicKey initFromJson()
        throws KeyczarException
    {
        initializeJceKey(Util.decodeBigInteger(modulus), Util.decodeBigInteger(publicExponent));
        initializeHash();
        return this;
    }

    final int keySizeInBytes()
    {
        return jcePublicKey.getModulus().bitLength() / 8;
    }

}
