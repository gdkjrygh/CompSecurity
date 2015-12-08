// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter, ElGamalParameters

public class ElGamalKeyParameters extends AsymmetricKeyParameter
{

    private ElGamalParameters params;

    protected ElGamalKeyParameters(boolean flag, ElGamalParameters elgamalparameters)
    {
        super(flag);
        params = elgamalparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ElGamalKeyParameters)
        {
            obj = (ElGamalKeyParameters)obj;
            if (params == null)
            {
                if (((ElGamalKeyParameters) (obj)).getParameters() == null)
                {
                    return true;
                }
            } else
            {
                return params.equals(((ElGamalKeyParameters) (obj)).getParameters());
            }
        }
        return false;
    }

    public ElGamalParameters getParameters()
    {
        return params;
    }

    public int hashCode()
    {
        if (params != null)
        {
            return params.hashCode();
        } else
        {
            return 0;
        }
    }
}
