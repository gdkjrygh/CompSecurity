// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

public class JCEPBEKey
    implements PBEKey
{

    String a;
    DERObjectIdentifier b;
    int c;
    int d;
    int e;
    int f;
    CipherParameters g;
    PBEKeySpec h;
    boolean i;

    public JCEPBEKey(String s, DERObjectIdentifier derobjectidentifier, int j, int k, int l, int i1, PBEKeySpec pbekeyspec, 
            CipherParameters cipherparameters)
    {
        i = false;
        a = s;
        b = derobjectidentifier;
        c = j;
        d = k;
        e = l;
        f = i1;
        h = pbekeyspec;
        g = cipherparameters;
    }

    public String getAlgorithm()
    {
        return a;
    }

    public byte[] getEncoded()
    {
        if (g != null)
        {
            KeyParameter keyparameter;
            if (g instanceof ParametersWithIV)
            {
                keyparameter = (KeyParameter)((ParametersWithIV)g).getParameters();
            } else
            {
                keyparameter = (KeyParameter)g;
            }
            return keyparameter.getKey();
        }
        if (c == 2)
        {
            return PBEParametersGenerator.PKCS12PasswordToBytes(h.getPassword());
        } else
        {
            return PBEParametersGenerator.PKCS5PasswordToBytes(h.getPassword());
        }
    }

    public String getFormat()
    {
        return "RAW";
    }

    public int getIterationCount()
    {
        return h.getIterationCount();
    }

    public char[] getPassword()
    {
        return h.getPassword();
    }

    public byte[] getSalt()
    {
        return h.getSalt();
    }
}
