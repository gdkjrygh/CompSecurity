// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.math.ntru.polynomial.Polynomial;

// Referenced classes of package org.spongycastle.crypto.params:
//            NTRUEncryptionKeyParameters, NTRUEncryptionParameters

public class NTRUEncryptionPrivateKeyParameters extends NTRUEncryptionKeyParameters
{

    public Polynomial c;
    public IntegerPolynomial d;
    public IntegerPolynomial e;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof NTRUEncryptionPrivateKeyParameters))
            {
                return false;
            }
            obj = (NTRUEncryptionPrivateKeyParameters)obj;
            if (b == null)
            {
                if (((NTRUEncryptionPrivateKeyParameters) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((NTRUEncryptionPrivateKeyParameters) (obj)).b))
            {
                return false;
            }
            if (c == null)
            {
                if (((NTRUEncryptionPrivateKeyParameters) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((NTRUEncryptionPrivateKeyParameters) (obj)).c))
            {
                return false;
            }
            if (!e.equals(((NTRUEncryptionPrivateKeyParameters) (obj)).e))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c == null)
        {
            j = 0;
        } else
        {
            j = c.hashCode();
        }
        if (e != null)
        {
            k = e.hashCode();
        }
        return (j + (i + 31) * 31) * 31 + k;
    }
}
