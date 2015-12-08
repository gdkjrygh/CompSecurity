// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ntru.polynomial;


// Referenced classes of package org.spongycastle.math.ntru.polynomial:
//            Polynomial, SparseTernaryPolynomial, IntegerPolynomial

public class ProductFormPolynomial
    implements Polynomial
{

    private SparseTernaryPolynomial a;
    private SparseTernaryPolynomial b;
    private SparseTernaryPolynomial c;

    public ProductFormPolynomial(SparseTernaryPolynomial sparseternarypolynomial, SparseTernaryPolynomial sparseternarypolynomial1, SparseTernaryPolynomial sparseternarypolynomial2)
    {
        a = sparseternarypolynomial;
        b = sparseternarypolynomial1;
        c = sparseternarypolynomial2;
    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial)
    {
        IntegerPolynomial integerpolynomial1 = a.a(integerpolynomial);
        integerpolynomial1 = b.a(integerpolynomial1);
        integerpolynomial1.b(c.a(integerpolynomial));
        return integerpolynomial1;
    }

    public final IntegerPolynomial a(IntegerPolynomial integerpolynomial, int i)
    {
        integerpolynomial = a(integerpolynomial);
        integerpolynomial.c(i);
        return integerpolynomial;
    }

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
        obj = (ProductFormPolynomial)obj;
        if (a == null)
        {
            if (((ProductFormPolynomial) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((ProductFormPolynomial) (obj)).a))
        {
            return false;
        }
        if (b == null)
        {
            if (((ProductFormPolynomial) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((ProductFormPolynomial) (obj)).b))
        {
            return false;
        }
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ProductFormPolynomial) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((ProductFormPolynomial) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
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
        if (c != null)
        {
            k = c.hashCode();
        }
        return (j + (i + 31) * 31) * 31 + k;
    }
}
