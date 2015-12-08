// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.ECGOST3410Signer;
import org.bouncycastle.crypto.signers.GOST3410Signer;
import org.bouncycastle.jce.interfaces.ECKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import org.bouncycastle.jce.interfaces.GOST3410Key;
import org.bouncycastle.jce.provider.asymmetric.ec.ECUtil;

// Referenced classes of package org.bouncycastle.jce.provider:
//            GOST3410Util, JDKKeyFactory

public class JDKGOST3410Signer extends SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{
    public static class ecgost3410 extends JDKGOST3410Signer
    {

        public ecgost3410()
        {
            super(new GOST3411Digest(), new ECGOST3410Signer());
        }
    }

    public static class gost3410 extends JDKGOST3410Signer
    {

        public gost3410()
        {
            super(new GOST3411Digest(), new GOST3410Signer());
        }
    }


    private SecureRandom bA;
    private Digest by;
    private DSA bz;

    protected JDKGOST3410Signer(Digest digest, DSA dsa)
    {
        by = digest;
        bz = dsa;
    }

    protected Object engineGetParameter(String s)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineInitSign(PrivateKey privatekey)
    {
        if (privatekey instanceof ECKey)
        {
            privatekey = ECUtil.a(privatekey);
        } else
        {
            privatekey = GOST3410Util.a(privatekey);
        }
        by.reset();
        if (bA != null)
        {
            bz.init(true, new ParametersWithRandom(privatekey, bA));
            return;
        } else
        {
            bz.init(true, privatekey);
            return;
        }
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        bA = securerandom;
        engineInitSign(privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof ECPublicKey)) goto _L2; else goto _L1
_L1:
        publickey = ECUtil.a(publickey);
_L4:
        by.reset();
        bz.init(false, publickey);
        return;
_L2:
        if (publickey instanceof GOST3410Key)
        {
            publickey = GOST3410Util.a(publickey);
            continue; /* Loop/switch isn't completed */
        }
        publickey = JDKKeyFactory.a(publickey.getEncoded());
        if (!(publickey instanceof ECPublicKey))
        {
            break; /* Loop/switch isn't completed */
        }
        publickey = ECUtil.a(publickey);
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            throw new InvalidKeyException("can't recognise key type in DSA based signer");
        }
        // Misplaced declaration of an exception variable
        catch (PublicKey publickey)
        {
            throw new InvalidKeyException("can't recognise key type in DSA based signer");
        }
    }

    protected void engineSetParameter(String s, Object obj)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected void engineSetParameter(AlgorithmParameterSpec algorithmparameterspec)
    {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    protected byte[] engineSign()
    {
        Object obj;
        byte abyte0[];
        abyte0 = new byte[by.getDigestSize()];
        by.doFinal(abyte0, 0);
        Object aobj[];
        try
        {
            obj = new byte[64];
            aobj = bz.generateSignature(abyte0);
            abyte0 = aobj[0].toByteArray();
            aobj = aobj[1].toByteArray();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new SignatureException(((Exception) (obj)).toString());
        }
        if (aobj[0] == 0)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        System.arraycopy(((Object) (aobj)), 0, obj, 32 - aobj.length, aobj.length);
_L1:
        if (abyte0[0] == 0)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        System.arraycopy(abyte0, 0, obj, 64 - abyte0.length, abyte0.length);
        return ((byte []) (obj));
        System.arraycopy(((Object) (aobj)), 1, obj, 32 - (aobj.length - 1), aobj.length - 1);
          goto _L1
        System.arraycopy(abyte0, 1, obj, 64 - (abyte0.length - 1), abyte0.length - 1);
        return ((byte []) (obj));
    }

    protected void engineUpdate(byte byte0)
    {
        by.update(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        by.update(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[by.getDigestSize()];
        by.doFinal(abyte1, 0);
        try
        {
            byte abyte2[] = new byte[32];
            byte abyte3[] = new byte[32];
            System.arraycopy(abyte0, 0, abyte3, 0, 32);
            System.arraycopy(abyte0, 32, abyte2, 0, 32);
            abyte0 = new BigInteger[2];
            abyte0[0] = new BigInteger(1, abyte2);
            abyte0[1] = new BigInteger(1, abyte3);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new SignatureException("error decoding signature bytes.");
        }
        return bz.verifySignature(abyte1, abyte0[0], abyte0[1]);
    }
}
