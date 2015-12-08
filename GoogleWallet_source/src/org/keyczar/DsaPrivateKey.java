// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.keyczar;

import com.google.gson.Gson;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAPrivateKeySpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.SigningStream;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarKey, DsaPublicKey, KeyczarPublicKey

public class DsaPrivateKey extends KeyczarKey
{
    final class DsaSigningStream
        implements SigningStream, VerifyingStream
    {

        private Signature signature;
        final DsaPrivateKey this$0;
        private VerifyingStream verifyingStream;

        public final int digestSize()
        {
            return 48;
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

        public DsaSigningStream()
            throws KeyczarException
        {
            this$0 = DsaPrivateKey.this;
            super();
            try
            {
                signature = Signature.getInstance("SHA1withDSA");
                verifyingStream = (VerifyingStream)publicKey.getStream();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DsaPrivateKey dsaprivatekey)
            {
                throw new KeyczarException(DsaPrivateKey.this);
            }
        }
    }


    private DSAPrivateKey jcePrivateKey;
    private final DsaPublicKey publicKey = null;
    private final String x = null;

    private DsaPrivateKey()
    {
        super(0);
    }

    private KeyczarPublicKey getPublic()
    {
        return publicKey;
    }

    private DsaPrivateKey initFromJson()
        throws KeyczarException
    {
        publicKey.initFromJson();
        BigInteger biginteger = new BigInteger(Base64Coder.decodeWebSafe(x));
        BigInteger biginteger1 = new BigInteger(Base64Coder.decodeWebSafe(publicKey.p));
        BigInteger biginteger2 = new BigInteger(Base64Coder.decodeWebSafe(publicKey.q));
        BigInteger biginteger3 = new BigInteger(Base64Coder.decodeWebSafe(publicKey.g));
        try
        {
            jcePrivateKey = (DSAPrivateKey)KeyFactory.getInstance("DSA").generatePrivate(new DSAPrivateKeySpec(biginteger, biginteger1, biginteger2, biginteger3));
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            throw new KeyczarException(generalsecurityexception);
        }
        return this;
    }

    static DsaPrivateKey read(String s)
        throws KeyczarException
    {
        return ((DsaPrivateKey)Util.gson().fromJson(s, org/keyczar/DsaPrivateKey)).initFromJson();
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new DsaSigningStream();
    }

    protected final byte[] hash()
    {
        return getPublic().hash();
    }


}
