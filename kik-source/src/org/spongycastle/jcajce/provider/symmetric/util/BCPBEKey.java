// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class BCPBEKey
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

    public BCPBEKey(String s, DERObjectIdentifier derobjectidentifier, int j, int k, int l, int i1, PBEKeySpec pbekeyspec, 
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

    public final int a()
    {
        return f;
    }

    public final void a(boolean flag)
    {
        i = flag;
    }

    public final CipherParameters b()
    {
        return g;
    }

    public final DERObjectIdentifier c()
    {
        return b;
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
                keyparameter = (KeyParameter)((ParametersWithIV)g).b();
            } else
            {
                keyparameter = (KeyParameter)g;
            }
            return keyparameter.a();
        }
        if (c == 2)
        {
            return PBEParametersGenerator.b(h.getPassword());
        } else
        {
            return PBEParametersGenerator.a(h.getPassword());
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
