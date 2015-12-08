// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.gost;

import java.io.IOException;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.crypto.params.GOST3410PublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jce.interfaces.GOST3410Params;
import org.spongycastle.jce.interfaces.GOST3410PublicKey;
import org.spongycastle.jce.spec.GOST3410ParameterSpec;
import org.spongycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;
import org.spongycastle.jce.spec.GOST3410PublicKeySpec;

public class BCGOST3410PublicKey
    implements GOST3410PublicKey
{

    private BigInteger a;
    private transient GOST3410Params b;

    BCGOST3410PublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters = new GOST3410PublicKeyAlgParameters((ASN1Sequence)subjectpublickeyinfo.d().e());
        byte abyte0[];
        int i;
        try
        {
            subjectpublickeyinfo = ((DEROctetString)subjectpublickeyinfo.e()).d();
            abyte0 = new byte[subjectpublickeyinfo.length];
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in GOST3410 public key");
        }
        i = 0;
        if (i == subjectpublickeyinfo.length)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i] = subjectpublickeyinfo[subjectpublickeyinfo.length - 1 - i];
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_41;
_L1:
        a = new BigInteger(1, abyte0);
        b = GOST3410ParameterSpec.a(gost3410publickeyalgparameters);
        return;
    }

    BCGOST3410PublicKey(GOST3410PublicKeyParameters gost3410publickeyparameters, GOST3410ParameterSpec gost3410parameterspec)
    {
        a = gost3410publickeyparameters.c();
        b = gost3410parameterspec;
    }

    BCGOST3410PublicKey(GOST3410PublicKey gost3410publickey)
    {
        a = gost3410publickey.a();
        b = gost3410publickey.b();
    }

    BCGOST3410PublicKey(GOST3410PublicKeySpec gost3410publickeyspec)
    {
        a = gost3410publickeyspec.a();
        b = new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(gost3410publickeyspec.b(), gost3410publickeyspec.c(), gost3410publickeyspec.d()));
    }

    public final BigInteger a()
    {
        return a;
    }

    public final GOST3410Params b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof BCGOST3410PublicKey)
        {
            obj = (BCGOST3410PublicKey)obj;
            flag = flag1;
            if (a.equals(((BCGOST3410PublicKey) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((BCGOST3410PublicKey) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public String getAlgorithm()
    {
        return "GOST3410";
    }

    public byte[] getEncoded()
    {
        int i = 0;
        byte abyte0[] = a.toByteArray();
        Object obj;
        if (abyte0[0] == 0)
        {
            obj = new byte[abyte0.length - 1];
        } else
        {
            obj = new byte[abyte0.length];
        }
        for (; i != obj.length; i++)
        {
            obj[i] = abyte0[abyte0.length - 1 - i];
        }

        if (b instanceof GOST3410ParameterSpec)
        {
            if (b.c() != null)
            {
                obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(b.a()), new ASN1ObjectIdentifier(b.b()), new ASN1ObjectIdentifier(b.c()))), new DEROctetString(((byte []) (obj))));
            } else
            {
                obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c, new GOST3410PublicKeyAlgParameters(new ASN1ObjectIdentifier(b.a()), new ASN1ObjectIdentifier(b.b()))), new DEROctetString(((byte []) (obj))));
            }
        } else
        {
            obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.c), new DEROctetString(((byte []) (obj))));
        }
        return KeyUtil.a(((SubjectPublicKeyInfo) (obj)));
    }

    public String getFormat()
    {
        return "X.509";
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("GOST3410 Public Key").append(s);
        stringbuffer.append("            y: ").append(a.toString(16)).append(s);
        return stringbuffer.toString();
    }
}
