// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, DHParameters

public class DHKeyParameters extends AsymmetricKeyParameter
{

    private DHParameters b;

    protected DHKeyParameters(boolean flag, DHParameters dhparameters)
    {
        super(flag);
        b = dhparameters;
    }

    public final DHParameters b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHKeyParameters)
        {
            obj = (DHKeyParameters)obj;
            if (b == null)
            {
                if (((DHKeyParameters) (obj)).b == null)
                {
                    return true;
                }
            } else
            {
                return b.equals(((DHKeyParameters) (obj)).b);
            }
        }
        return false;
    }

    public int hashCode()
    {
        boolean flag;
        int i;
        if (super.a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        i = ((flag) ? 1 : 0);
        if (b != null)
        {
            i = flag ^ b.hashCode();
        }
        return i;
    }
}
