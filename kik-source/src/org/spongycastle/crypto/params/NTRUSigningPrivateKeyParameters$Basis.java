// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.math.ntru.polynomial.Polynomial;

// Referenced classes of package org.spongycastle.crypto.params:
//            NTRUSigningPrivateKeyParameters, NTRUSigningKeyGenerationParameters

public static class 
{

    public Polynomial a;
    public Polynomial b;
    public IntegerPolynomial c;
    NTRUSigningKeyGenerationParameters d;

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
        if (!(obj instanceof ))
        {
            return false;
        }
        obj = ()obj;
        if (a == null)
        {
            if (((a) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((a) (obj)).a))
        {
            return false;
        }
        if (b == null)
        {
            if (((b) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
        if (c == null)
        {
            if (((c) (obj)).c != null)
            {
                return false;
            }
        } else
        if (!c.equals(((c) (obj)).c))
        {
            return false;
        }
        if (d != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((d) (obj)).d == null) goto _L1; else goto _L3
_L3:
        return false;
        if (d.equals(((als) (obj)).d)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b == null)
        {
            j = 0;
        } else
        {
            j = b.hashCode();
        }
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.hashCode();
        }
        if (d != null)
        {
            l = d.hashCode();
        }
        return (k + (j + (i + 31) * 31) * 31) * 31 + l;
    }
}
