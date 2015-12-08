// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter, DHParameters

public class DHKeyParameters extends AsymmetricKeyParameter
{

    private DHParameters params;

    protected DHKeyParameters(boolean flag, DHParameters dhparameters)
    {
        super(flag);
        params = dhparameters;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHKeyParameters)
        {
            obj = (DHKeyParameters)obj;
            if (params == null)
            {
                if (((DHKeyParameters) (obj)).getParameters() == null)
                {
                    return true;
                }
            } else
            {
                return params.equals(((DHKeyParameters) (obj)).getParameters());
            }
        }
        return false;
    }

    public DHParameters getParameters()
    {
        return params;
    }

    public int hashCode()
    {
        boolean flag;
        int i;
        if (isPrivate())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        i = ((flag) ? 1 : 0);
        if (params != null)
        {
            i = flag ^ params.hashCode();
        }
        return i;
    }
}
