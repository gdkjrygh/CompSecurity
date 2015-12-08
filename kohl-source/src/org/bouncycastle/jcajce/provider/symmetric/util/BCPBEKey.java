// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class BCPBEKey
    implements PBEKey
{

    String algorithm;
    int digest;
    int ivSize;
    int keySize;
    DERObjectIdentifier oid;
    CipherParameters param;
    PBEKeySpec pbeKeySpec;
    boolean tryWrong;
    int type;

    public BCPBEKey(String s, DERObjectIdentifier derobjectidentifier, int i, int j, int k, int l, PBEKeySpec pbekeyspec, 
            CipherParameters cipherparameters)
    {
        tryWrong = false;
        algorithm = s;
        oid = derobjectidentifier;
        type = i;
        digest = j;
        keySize = k;
        ivSize = l;
        pbeKeySpec = pbekeyspec;
        param = cipherparameters;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    int getDigest()
    {
        return digest;
    }

    public byte[] getEncoded()
    {
        if (param != null)
        {
            KeyParameter keyparameter;
            if (param instanceof ParametersWithIV)
            {
                keyparameter = (KeyParameter)((ParametersWithIV)param).getParameters();
            } else
            {
                keyparameter = (KeyParameter)param;
            }
            return keyparameter.getKey();
        }
        if (type == 2)
        {
            return PBEParametersGenerator.PKCS12PasswordToBytes(pbeKeySpec.getPassword());
        } else
        {
            return PBEParametersGenerator.PKCS5PasswordToBytes(pbeKeySpec.getPassword());
        }
    }

    public String getFormat()
    {
        return "RAW";
    }

    public int getIterationCount()
    {
        return pbeKeySpec.getIterationCount();
    }

    public int getIvSize()
    {
        return ivSize;
    }

    int getKeySize()
    {
        return keySize;
    }

    public DERObjectIdentifier getOID()
    {
        return oid;
    }

    public CipherParameters getParam()
    {
        return param;
    }

    public char[] getPassword()
    {
        return pbeKeySpec.getPassword();
    }

    public byte[] getSalt()
    {
        return pbeKeySpec.getSalt();
    }

    int getType()
    {
        return type;
    }

    public void setTryWrongPKCS12Zero(boolean flag)
    {
        tryWrong = flag;
    }

    boolean shouldTryWrongPKCS12()
    {
        return tryWrong;
    }
}
