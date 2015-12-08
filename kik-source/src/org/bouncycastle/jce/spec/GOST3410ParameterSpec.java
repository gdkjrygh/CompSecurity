// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST3410NamedParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410ParamSetParameters;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;

// Referenced classes of package org.bouncycastle.jce.spec:
//            GOST3410PublicKeyParameterSetSpec

public class GOST3410ParameterSpec
    implements AlgorithmParameterSpec, GOST3410Params
{

    private GOST3410PublicKeyParameterSetSpec a;
    private String b;
    private String c;
    private String d;

    public GOST3410ParameterSpec(String s)
    {
        this(s, CryptoProObjectIdentifiers.g.e(), null);
    }

    private GOST3410ParameterSpec(String s, String s1)
    {
        this(s, s1, null);
    }

    private GOST3410ParameterSpec(String s, String s1, String s2)
    {
        GOST3410ParamSetParameters gost3410paramsetparameters;
        gost3410paramsetparameters = null;
        GOST3410ParamSetParameters gost3410paramsetparameters1 = GOST3410NamedParameters.a(new DERObjectIdentifier(s));
        gost3410paramsetparameters = gost3410paramsetparameters1;
_L1:
        IllegalArgumentException illegalargumentexception;
        if (gost3410paramsetparameters == null)
        {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        } else
        {
            a = new GOST3410PublicKeyParameterSetSpec(gost3410paramsetparameters.e(), gost3410paramsetparameters.f(), gost3410paramsetparameters.g());
            b = s;
            c = s1;
            d = s2;
            return;
        }
        illegalargumentexception;
        DERObjectIdentifier derobjectidentifier = GOST3410NamedParameters.a(s);
        if (derobjectidentifier != null)
        {
            s = derobjectidentifier.e();
            gost3410paramsetparameters = GOST3410NamedParameters.a(derobjectidentifier);
        }
          goto _L1
    }

    public GOST3410ParameterSpec(GOST3410PublicKeyParameterSetSpec gost3410publickeyparametersetspec)
    {
        a = gost3410publickeyparametersetspec;
        c = CryptoProObjectIdentifiers.g.e();
        d = null;
    }

    public static GOST3410ParameterSpec a(GOST3410PublicKeyAlgParameters gost3410publickeyalgparameters)
    {
        if (gost3410publickeyalgparameters.g() != null)
        {
            return new GOST3410ParameterSpec(gost3410publickeyalgparameters.e().e(), gost3410publickeyalgparameters.f().e(), gost3410publickeyalgparameters.g().e());
        } else
        {
            return new GOST3410ParameterSpec(gost3410publickeyalgparameters.e().e(), gost3410publickeyalgparameters.f().e());
        }
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final GOST3410PublicKeyParameterSetSpec d()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (!(obj instanceof GOST3410ParameterSpec))
            {
                break label0;
            }
            obj = (GOST3410ParameterSpec)obj;
            flag = flag1;
            if (!a.equals(((GOST3410ParameterSpec) (obj)).a))
            {
                break label0;
            }
            flag = flag1;
            if (!c.equals(((GOST3410ParameterSpec) (obj)).c))
            {
                break label0;
            }
            if (d != ((GOST3410ParameterSpec) (obj)).d)
            {
                flag = flag1;
                if (d == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!d.equals(((GOST3410ParameterSpec) (obj)).d))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public int hashCode()
    {
        int j = a.hashCode();
        int k = c.hashCode();
        int i;
        if (d != null)
        {
            i = d.hashCode();
        } else
        {
            i = 0;
        }
        return i ^ (k ^ j);
    }
}
