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
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.Stream;
import org.keyczar.interfaces.VerifyingStream;
import org.keyczar.util.Base64Coder;
import org.keyczar.util.Util;

// Referenced classes of package org.keyczar:
//            KeyczarPublicKey

public class DsaPublicKey extends KeyczarPublicKey
{
    final class DsaVerifyingStream
        implements VerifyingStream
    {

        private Signature signature;
        final DsaPublicKey this$0;

        public final int digestSize()
        {
            return 48;
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

        public DsaVerifyingStream()
            throws KeyczarException
        {
            this$0 = DsaPublicKey.this;
            super();
            try
            {
                signature = Signature.getInstance("SHA1withDSA");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DsaPublicKey dsapublickey)
            {
                throw new KeyczarException(DsaPublicKey.this);
            }
        }
    }


    final String g = null;
    private final byte hash[] = new byte[4];
    private DSAPublicKey jcePublicKey;
    final String p = null;
    final String q = null;
    final String y = null;

    private DsaPublicKey()
    {
        super(0);
        jcePublicKey = null;
    }

    private void initializeHash()
        throws KeyczarException
    {
        DSAParams dsaparams = jcePublicKey.getParams();
        System.arraycopy(Util.prefixHash(new byte[][] {
            Util.stripLeadingZeros(dsaparams.getP().toByteArray()), Util.stripLeadingZeros(dsaparams.getQ().toByteArray()), Util.stripLeadingZeros(dsaparams.getG().toByteArray()), Util.stripLeadingZeros(jcePublicKey.getY().toByteArray())
        }), 0, hash, 0, hash.length);
    }

    private void initializeJceKey(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, BigInteger biginteger3)
        throws KeyczarException
    {
        try
        {
            jcePublicKey = (DSAPublicKey)KeyFactory.getInstance("DSA").generatePublic(new DSAPublicKeySpec(biginteger, biginteger1, biginteger2, biginteger3));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BigInteger biginteger)
        {
            throw new KeyczarException(biginteger);
        }
    }

    static DsaPublicKey read(String s)
        throws KeyczarException
    {
        s = (DsaPublicKey)Util.gson().fromJson(s, org/keyczar/DsaPublicKey);
        s.initFromJson();
        return s;
    }

    protected final Stream getStream()
        throws KeyczarException
    {
        return new DsaVerifyingStream();
    }

    public final byte[] hash()
    {
        return hash;
    }

    final void initFromJson()
        throws KeyczarException
    {
        initializeJceKey(new BigInteger(Base64Coder.decodeWebSafe(y)), new BigInteger(Base64Coder.decodeWebSafe(p)), new BigInteger(Base64Coder.decodeWebSafe(q)), new BigInteger(Base64Coder.decodeWebSafe(g)));
        initializeHash();
    }

}
