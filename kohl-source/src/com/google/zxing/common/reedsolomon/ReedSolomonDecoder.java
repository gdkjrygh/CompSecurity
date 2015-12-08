// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            ReedSolomonException, GenericGFPoly, GenericGF

public final class ReedSolomonDecoder
{

    private final GenericGF field;

    public ReedSolomonDecoder(GenericGF genericgf)
    {
        field = genericgf;
    }

    private int[] findErrorLocations(GenericGFPoly genericgfpoly)
        throws ReedSolomonException
    {
        int l = genericgfpoly.getDegree();
        if (l == 1)
        {
            int ai[] = new int[1];
            ai[0] = genericgfpoly.getCoefficient(1);
            genericgfpoly = ai;
        } else
        {
            int ai1[] = new int[l];
            int j = 0;
            int k;
            for (int i = 1; i < field.getSize() && j < l; j = k)
            {
                k = j;
                if (genericgfpoly.evaluateAt(i) == 0)
                {
                    ai1[j] = field.inverse(i);
                    k = j + 1;
                }
                i++;
            }

            genericgfpoly = ai1;
            if (j != l)
            {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
        }
        return genericgfpoly;
    }

    private int[] findErrorMagnitudes(GenericGFPoly genericgfpoly, int ai[])
    {
        int i1 = ai.length;
        int ai1[] = new int[i1];
        for (int i = 0; i < i1; i++)
        {
            int j1 = field.inverse(ai[i]);
            int k = 1;
            int j = 0;
            while (j < i1) 
            {
                int l = k;
                if (i != j)
                {
                    l = field.multiply(ai[j], j1);
                    if ((l & 1) == 0)
                    {
                        l |= 1;
                    } else
                    {
                        l &= -2;
                    }
                    l = field.multiply(k, l);
                }
                j++;
                k = l;
            }
            ai1[i] = field.multiply(genericgfpoly.evaluateAt(j1), field.inverse(k));
            if (field.getGeneratorBase() != 0)
            {
                ai1[i] = field.multiply(ai1[i], j1);
            }
        }

        return ai1;
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly genericgfpoly, GenericGFPoly genericgfpoly1, int i)
        throws ReedSolomonException
    {
        GenericGFPoly genericgfpoly3 = genericgfpoly;
        GenericGFPoly genericgfpoly2 = genericgfpoly1;
        if (genericgfpoly.getDegree() < genericgfpoly1.getDegree())
        {
            genericgfpoly2 = genericgfpoly;
            genericgfpoly3 = genericgfpoly1;
        }
        GenericGFPoly genericgfpoly4 = field.getZero();
        genericgfpoly1 = field.getOne();
        do
        {
            GenericGFPoly genericgfpoly6 = genericgfpoly4;
            if (genericgfpoly2.getDegree() >= i / 2)
            {
                GenericGFPoly genericgfpoly5 = genericgfpoly2;
                genericgfpoly4 = genericgfpoly1;
                if (genericgfpoly5.isZero())
                {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
                genericgfpoly = genericgfpoly3;
                genericgfpoly1 = field.getZero();
                int j = genericgfpoly5.getCoefficient(genericgfpoly5.getDegree());
                j = field.inverse(j);
                int k;
                int l;
                for (; genericgfpoly.getDegree() >= genericgfpoly5.getDegree() && !genericgfpoly.isZero(); genericgfpoly = genericgfpoly.addOrSubtract(genericgfpoly5.multiplyByMonomial(k, l)))
                {
                    k = genericgfpoly.getDegree() - genericgfpoly5.getDegree();
                    l = field.multiply(genericgfpoly.getCoefficient(genericgfpoly.getDegree()), j);
                    genericgfpoly1 = genericgfpoly1.addOrSubtract(field.buildMonomial(k, l));
                }

                genericgfpoly1 = genericgfpoly1.multiply(genericgfpoly4).addOrSubtract(genericgfpoly6);
                genericgfpoly2 = genericgfpoly;
                genericgfpoly3 = genericgfpoly5;
                if (genericgfpoly.getDegree() >= genericgfpoly5.getDegree())
                {
                    throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                }
            } else
            {
                i = genericgfpoly1.getCoefficient(0);
                if (i == 0)
                {
                    throw new ReedSolomonException("sigmaTilde(0) was zero");
                } else
                {
                    i = field.inverse(i);
                    return (new GenericGFPoly[] {
                        genericgfpoly1.multiply(i), genericgfpoly2.multiply(i)
                    });
                }
            }
        } while (true);
    }

    public void decode(int ai[], int i)
        throws ReedSolomonException
    {
        GenericGFPoly genericgfpoly = new GenericGFPoly(field, ai);
        Object aobj[] = new int[i];
        boolean flag = true;
        for (int j = 0; j < i; j++)
        {
            int l = genericgfpoly.evaluateAt(field.exp(field.getGeneratorBase() + j));
            aobj[aobj.length - 1 - j] = l;
            if (l != 0)
            {
                flag = false;
            }
        }

        if (!flag)
        {
            GenericGFPoly genericgfpoly1 = new GenericGFPoly(field, ((int []) (aobj)));
            aobj = runEuclideanAlgorithm(field.buildMonomial(i, 1), genericgfpoly1, i);
            genericgfpoly1 = aobj[0];
            GenericGFPoly genericgfpoly2 = aobj[1];
            int ai1[] = findErrorLocations(genericgfpoly1);
            genericgfpoly2 = findErrorMagnitudes(genericgfpoly2, ai1);
            i = 0;
            while (i < ai1.length) 
            {
                int k = ai.length - 1 - field.log(ai1[i]);
                if (k < 0)
                {
                    throw new ReedSolomonException("Bad error location");
                }
                ai[k] = GenericGF.addOrSubtract(ai[k], genericgfpoly2[i]);
                i++;
            }
        }
    }
}
