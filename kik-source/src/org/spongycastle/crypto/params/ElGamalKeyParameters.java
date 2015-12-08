// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, ElGamalParameters

public class ElGamalKeyParameters extends AsymmetricKeyParameter
{

    private ElGamalParameters b;

    protected ElGamalKeyParameters(boolean flag, ElGamalParameters elgamalparameters)
    {
        super(flag);
        b = elgamalparameters;
    }

    public final ElGamalParameters b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ElGamalKeyParameters)
        {
            obj = (ElGamalKeyParameters)obj;
            if (b == null)
            {
                if (((ElGamalKeyParameters) (obj)).b == null)
                {
                    return true;
                }
            } else
            {
                return b.equals(((ElGamalKeyParameters) (obj)).b);
            }
        }
        return false;
    }

    public int hashCode()
    {
        if (b != null)
        {
            return b.hashCode();
        } else
        {
            return 0;
        }
    }
}
