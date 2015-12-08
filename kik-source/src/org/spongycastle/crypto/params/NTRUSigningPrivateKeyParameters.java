// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.util.Iterator;
import java.util.List;
import org.spongycastle.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.math.ntru.polynomial.Polynomial;

// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, NTRUSigningKeyGenerationParameters

public class NTRUSigningPrivateKeyParameters extends AsymmetricKeyParameter
{
    public static class Basis
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
            if (!(obj instanceof Basis))
            {
                return false;
            }
            obj = (Basis)obj;
            if (a == null)
            {
                if (((Basis) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((Basis) (obj)).a))
            {
                return false;
            }
            if (b == null)
            {
                if (((Basis) (obj)).b != null)
                {
                    return false;
                }
            } else
            if (!b.equals(((Basis) (obj)).b))
            {
                return false;
            }
            if (c == null)
            {
                if (((Basis) (obj)).c != null)
                {
                    return false;
                }
            } else
            if (!c.equals(((Basis) (obj)).c))
            {
                return false;
            }
            if (d != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((Basis) (obj)).d == null) goto _L1; else goto _L3
_L3:
            return false;
            if (d.equals(((Basis) (obj)).d)) goto _L1; else goto _L4
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


    private List b;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (NTRUSigningPrivateKeyParameters)obj;
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((NTRUSigningPrivateKeyParameters) (obj)).b != null) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (b.size() != ((NTRUSigningPrivateKeyParameters) (obj)).b.size()) goto _L4; else goto _L7
_L7:
        int i = 0;
_L12:
        Basis basis;
        Basis basis1;
        if (i >= b.size())
        {
            break MISSING_BLOCK_LABEL_218;
        }
        basis = (Basis)b.get(i);
        basis1 = (Basis)((NTRUSigningPrivateKeyParameters) (obj)).b.get(i);
        flag = flag1;
        if (!basis.a.equals(basis1.a)) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!basis.b.equals(basis1.b)) goto _L4; else goto _L9
_L9:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!basis.c.equals(basis1.c)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!basis.d.equals(basis1.d)) goto _L4; else goto _L11
_L11:
        i++;
          goto _L12
        return true;
    }

    public int hashCode()
    {
        Iterator iterator;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        iterator = b.iterator();
        for (i += 31; iterator.hasNext(); i = ((Basis)iterator.next()).hashCode() + i) { }
        return i;
    }
}
