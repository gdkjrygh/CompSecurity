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
        int j = 0;
        int i = 1;
        int l = genericgfpoly.getDegree();
        if (l == 1)
        {
            return (new int[] {
                genericgfpoly.getCoefficient(1)
            });
        }
        int ai[] = new int[l];
        int k;
        for (; i < field.getSize() && j < l; j = k)
        {
            k = j;
            if (genericgfpoly.evaluateAt(i) == 0)
            {
                ai[j] = field.inverse(i);
                k = j + 1;
            }
            i++;
        }

        if (j != l)
        {
            throw new ReedSolomonException("Error locator degree does not match number of roots");
        } else
        {
            return ai;
        }
    }

    private int[] findErrorMagnitudes(GenericGFPoly genericgfpoly, int ai[])
    {
        int i1 = ai.length;
        int ai1[] = new int[i1];
        for (int j = 0; j < i1; j++)
        {
            int j1 = field.inverse(ai[j]);
            int i = 1;
            int k = 0;
            while (k < i1) 
            {
                if (j != k)
                {
                    int l = field.multiply(ai[k], j1);
                    if ((l & 1) == 0)
                    {
                        l |= 1;
                    } else
                    {
                        l &= -2;
                    }
                    i = field.multiply(i, l);
                }
                k++;
            }
            ai1[j] = field.multiply(genericgfpoly.evaluateAt(j1), field.inverse(i));
            if (field.getGeneratorBase() != 0)
            {
                ai1[j] = field.multiply(ai1[j], j1);
            }
        }

        return ai1;
    }

    public void decode(int ai[], int i)
        throws ReedSolomonException
    {
        boolean flag1 = false;
        GenericGFPoly genericgfpoly = new GenericGFPoly(field, ai);
        Object aobj[] = new int[i];
        int j = 0;
        boolean flag = true;
        for (; j < i; j++)
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
            i = ((flag1) ? 1 : 0);
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

    public GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly genericgfpoly, GenericGFPoly genericgfpoly1, int i)
        throws ReedSolomonException
    {
        GenericGFPoly genericgfpoly2;
        GenericGFPoly genericgfpoly4;
        if (genericgfpoly.getDegree() >= genericgfpoly1.getDegree())
        {
            GenericGFPoly genericgfpoly3 = genericgfpoly;
            genericgfpoly = genericgfpoly1;
            genericgfpoly1 = genericgfpoly3;
        }
        genericgfpoly4 = field.getZero();
        genericgfpoly2 = field.getOne();
        while (genericgfpoly.getDegree() >= i / 2) 
        {
            if (genericgfpoly.isZero())
            {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            GenericGFPoly genericgfpoly5 = field.getZero();
            int j = genericgfpoly.getCoefficient(genericgfpoly.getDegree());
            j = field.inverse(j);
            int k;
            int l;
            for (; genericgfpoly1.getDegree() >= genericgfpoly.getDegree() && !genericgfpoly1.isZero(); genericgfpoly1 = genericgfpoly1.addOrSubtract(genericgfpoly.multiplyByMonomial(k, l)))
            {
                k = genericgfpoly1.getDegree() - genericgfpoly.getDegree();
                l = field.multiply(genericgfpoly1.getCoefficient(genericgfpoly1.getDegree()), j);
                genericgfpoly5 = genericgfpoly5.addOrSubtract(field.buildMonomial(k, l));
            }

            genericgfpoly4 = genericgfpoly5.multiply(genericgfpoly2).addOrSubtract(genericgfpoly4);
            if (genericgfpoly1.getDegree() >= genericgfpoly.getDegree())
            {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
            }
            genericgfpoly5 = genericgfpoly;
            genericgfpoly = genericgfpoly1;
            genericgfpoly1 = genericgfpoly4;
            genericgfpoly4 = genericgfpoly2;
            genericgfpoly2 = genericgfpoly1;
            genericgfpoly1 = genericgfpoly5;
        }
        i = genericgfpoly2.getCoefficient(0);
        if (i == 0)
        {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        } else
        {
            i = field.inverse(i);
            return (new GenericGFPoly[] {
                genericgfpoly2.multiply(i), genericgfpoly.multiply(i)
            });
        }
    }
}
