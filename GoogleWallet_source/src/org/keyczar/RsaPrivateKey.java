// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import org.keyczar.enums.RsaPadding;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.DecryptingStream;
import org.keyczar.interfaces.EncryptingStream;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarKey, RsaPublicKey

public class RsaPrivateKey extends KeyczarKey
{
    final class RsaPrivateStream
        implements DecryptingStream, EncryptingStream, SigningStream, VerifyingStream
    {

        private Cipher cipher;
        private EncryptingStream encryptingStream;
        private Signature signature;
        final RsaPrivateKey this$0;
        private VerifyingStream verifyingStream;

        public final int digestSize()
        {
            return publicKey.keySizeInBytes();
        }

        public final int doFinalDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
            throws KeyczarException
        {
            int i;
            try
            {
                i = cipher.doFinal(bytebuffer, bytebuffer1);
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
            return encryptingStream.doFinalEncrypt(bytebuffer, bytebuffer1);
        }

        public final SigningStream getSigningStream()
            throws KeyczarException
        {
            return encryptingStream.getSigningStream();
        }

        public final VerifyingStream getVerifyingStream()
        {
            return new VerifyingStream() {

                final RsaPrivateStream this$1;

                public final int digestSize()
                {
                    return 0;
                }

                public final void initVerify()
                {
                }

                public final void updateVerify(ByteBuffer bytebuffer)
                {
                }

                public final boolean verify(ByteBuffer bytebuffer)
                {
                    return true;
                }

            
            {
                this$1 = RsaPrivateStream.this;
                super();
            }
            };
        }

        public final void initDecrypt(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            try
            {
                cipher.init(2, jcePrivateKey);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
        }

        public final int initEncrypt(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            return encryptingStream.initEncrypt(bytebuffer);
        }

        public final void initSign()
            throws KeyczarException
        {
            try
            {
                signature.initSign(jcePrivateKey);
                return;
            }
            catch (GeneralSecurityException generalsecurityexception)
            {
                throw new KeyczarException(generalsecurityexception);
            }
        }

        public final void initVerify()
            throws KeyczarException
        {
            verifyingStream.initVerify();
        }

        public final int maxOutputSize(int i)
        {
            return publicKey.keySizeInBytes();
        }

        public final void sign(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            try
            {
                bytebuffer.put(signature.sign());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer)
            {
                throw new KeyczarException(bytebuffer);
            }
        }

        public final int updateDecrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
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

        public final int updateEncrypt(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
            throws KeyczarException
        {
            return encryptingStream.updateEncrypt(bytebuffer, bytebuffer1);
        }

        public final void updateSign(ByteBuffer bytebuffer)
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

        public final void updateVerify(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            verifyingStream.updateVerify(bytebuffer);
        }

        public final boolean verify(ByteBuffer bytebuffer)
            throws KeyczarException
        {
            return verifyingStream.verify(bytebuffer);
        }

        public RsaPrivateStream()
            throws KeyczarException
        {
            this$0 = RsaPrivateKey.this;
            super();
            try
            {
                signature = Signature.getInstance("SHA1withRSA");
                verifyingStream = (VerifyingStream)publicKey.getStream();
                cipher = Cipher.getInstance(publicKey.getPadding().getCryptAlgorithm());
                encryptingStream = (EncryptingStream)publicKey.getStream();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (RsaPrivateKey rsaprivatekey)
            {
                throw new KeyczarException(RsaPrivateKey.this);
            }
        }
    }


    private final String crtCoefficient = null;
    private RSAPrivateCrtKey jcePrivateKey;
    private final String primeExponentP = null;
    private final String primeExponentQ = null;
    private final String primeP = null;
    private final String primeQ = null;
    private final String privateExponent = null;
    private final RsaPublicKey publicKey = null;

    private RsaPrivateKey()
    {
        super(0);
        jcePrivateKey = null;
    }

    private RsaPrivateKey initFromJson()
        throws KeyczarException
    {
        publicKey.initFromJson();
        try
        {
            jcePrivateKey = (RSAPrivateCrtKey)KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateCrtKeySpec(Util.decodeBigInteger(publicKey.modulus), Util.decodeBigInteger(publicKey.publicExponent), Util.decodeBigInteger(privateExponent), Util.decodeBigInteger(primeP), Util.decodeBigInteger(primeQ), Util.decodeBigInteger(primeExponentP), Util.decodeBigInteger(primeExponentQ), Util.decodeBigInteger(crtCoefficient)));
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            throw new KeyczarException(generalsecurityexception);
        }
        return this;
    }

    static RsaPrivateKey read(String s)
        throws KeyczarException
    {
        return ((RsaPrivateKey)Util.gson().fromJson(s, org/keyczar/RsaPrivateKey)).initFromJson();
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new RsaPrivateStream();
    }

    protected final byte[] hash()
    {
        return publicKey.hash();
    }


}
