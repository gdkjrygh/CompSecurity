// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.gost;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.DSA;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.GOST3411Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.signers.GOST3410Signer;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jce.interfaces.ECKey;
import org.spongycastle.jce.interfaces.ECPublicKey;
import org.spongycastle.jce.interfaces.GOST3410Key;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.provider.GOST3410Util;

public class SignatureSpi extends java.security.SignatureSpi
    implements PKCSObjectIdentifiers, X509ObjectIdentifiers
{

    private DSA bA;
    private SecureRandom bB;
    private Digest bz;

    public SignatureSpi()
    {
        bz = new GOST3411Digest();
        bA = new GOST3410Signer();
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
        bz.c();
        if (bB != null)
        {
            bA.a(true, new ParametersWithRandom(privatekey, bB));
            return;
        } else
        {
            bA.a(true, privatekey);
            return;
        }
    }

    protected void engineInitSign(PrivateKey privatekey, SecureRandom securerandom)
    {
        bB = securerandom;
        engineInitSign(privatekey);
    }

    protected void engineInitVerify(PublicKey publickey)
    {
        if (!(publickey instanceof ECPublicKey)) goto _L2; else goto _L1
_L1:
        publickey = ECUtil.a(publickey);
_L4:
        bz.c();
        bA.a(false, publickey);
        return;
_L2:
        if (publickey instanceof GOST3410Key)
        {
            publickey = GOST3410Util.a(publickey);
            continue; /* Loop/switch isn't completed */
        }
        publickey = BouncyCastleProvider.a(SubjectPublicKeyInfo.a(publickey.getEncoded()));
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
        abyte0 = new byte[bz.b()];
        bz.a(abyte0, 0);
        Object aobj[];
        try
        {
            obj = new byte[64];
            aobj = bA.a(abyte0);
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
        bz.a(byte0);
    }

    protected void engineUpdate(byte abyte0[], int i, int j)
    {
        bz.a(abyte0, i, j);
    }

    protected boolean engineVerify(byte abyte0[])
    {
        byte abyte1[] = new byte[bz.b()];
        bz.a(abyte1, 0);
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
        return bA.a(abyte1, abyte0[0], abyte0[1]);
    }
}
