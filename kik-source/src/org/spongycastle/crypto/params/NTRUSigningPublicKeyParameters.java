// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;

// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, NTRUSigningParameters

public class NTRUSigningPublicKeyParameters extends AsymmetricKeyParameter
{

    public IntegerPolynomial b;
    private NTRUSigningParameters c;

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (NTRUSigningPublicKeyParameters)obj;
        if (b == null)
        {
            if (((NTRUSigningPublicKeyParameters) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((NTRUSigningPublicKeyParameters) (obj)).b))
        {
            return false;
        }
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((NTRUSigningPublicKeyParameters) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((NTRUSigningPublicKeyParameters) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
