// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;

// Referenced classes of package org.spongycastle.crypto.params:
//            NTRUEncryptionKeyParameters, NTRUEncryptionParameters

public class NTRUEncryptionPublicKeyParameters extends NTRUEncryptionKeyParameters
{

    public IntegerPolynomial c;

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
        if (!(obj instanceof NTRUEncryptionPublicKeyParameters))
        {
            return false;
        }
        obj = (NTRUEncryptionPublicKeyParameters)obj;
        if (c == null)
        {
            if (((NTRUEncryptionPublicKeyParameters) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((NTRUEncryptionPublicKeyParameters) (obj)).c))
        {
            return false;
        }
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((NTRUEncryptionPublicKeyParameters) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((NTRUEncryptionPublicKeyParameters) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return (i + 31) * 31 + j;
    }
}
