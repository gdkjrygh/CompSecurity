// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common.reedsolomon;


// Referenced classes of package com.google.zxing.common.reedsolomon:
//            GenericGF

final class GenericGFPoly
{

    private final int coefficients[];
    private final GenericGF field;

    GenericGFPoly(GenericGF genericgf, int ai[])
    {
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        field = genericgf;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            int i;
            for (i = 1; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                coefficients = genericgf.getZero().coefficients;
                return;
            } else
            {
                coefficients = new int[j - i];
                System.arraycopy(ai, i, coefficients, 0, coefficients.length);
                return;
            }
        } else
        {
            coefficients = ai;
            return;
        }
    }

    GenericGFPoly addOrSubtract(GenericGFPoly genericgfpoly)
    {
        if (!field.equals(genericgfpoly.field))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero())
        {
            return genericgfpoly;
        }
        if (genericgfpoly.isZero())
        {
            return this;
        }
        int ai[] = coefficients;
        int ai2[] = genericgfpoly.coefficients;
        int ai1[] = ai2;
        genericgfpoly = ai;
        if (ai.length > ai2.length)
        {
            genericgfpoly = ai2;
            ai1 = ai;
        }
        ai = new int[ai1.length];
        int j = ai1.length - genericgfpoly.length;
        System.arraycopy(ai1, 0, ai, 0, j);
        for (int i = j; i < ai1.length; i++)
        {
            ai[i] = GenericGF.addOrSubtract(genericgfpoly[i - j], ai1[i]);
        }

        return new GenericGFPoly(field, ai);
    }

    GenericGFPoly[] divide(GenericGFPoly genericgfpoly)
    {
        if (!field.equals(genericgfpoly.field))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (genericgfpoly.isZero())
        {
            throw new IllegalArgumentException("Divide by 0");
        }
        GenericGFPoly genericgfpoly2 = field.getZero();
        GenericGFPoly genericgfpoly1 = this;
        int i = genericgfpoly.getCoefficient(genericgfpoly.getDegree());
        i = field.inverse(i);
        GenericGFPoly genericgfpoly3;
        for (; genericgfpoly1.getDegree() >= genericgfpoly.getDegree() && !genericgfpoly1.isZero(); genericgfpoly1 = genericgfpoly1.addOrSubtract(genericgfpoly3))
        {
            int j = genericgfpoly1.getDegree() - genericgfpoly.getDegree();
            int k = field.multiply(genericgfpoly1.getCoefficient(genericgfpoly1.getDegree()), i);
            genericgfpoly3 = genericgfpoly.multiplyByMonomial(j, k);
            genericgfpoly2 = genericgfpoly2.addOrSubtract(field.buildMonomial(j, k));
        }

        return (new GenericGFPoly[] {
            genericgfpoly2, genericgfpoly1
        });
    }

    int evaluateAt(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j = getCoefficient(0);
_L4:
        return j;
_L2:
        int k1 = coefficients.length;
        if (i == 1)
        {
            i = 0;
            int ai[] = coefficients;
            int i1 = ai.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= i1)
                {
                    continue;
                }
                i = GenericGF.addOrSubtract(i, ai[k]);
                k++;
            } while (true);
        }
        int l = coefficients[0];
        int j1 = 1;
        do
        {
            j = l;
            if (j1 >= k1)
            {
                continue;
            }
            l = GenericGF.addOrSubtract(field.multiply(i, l), coefficients[j1]);
            j1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    int getCoefficient(int i)
    {
        return coefficients[coefficients.length - 1 - i];
    }

    int[] getCoefficients()
    {
        return coefficients;
    }

    int getDegree()
    {
        return coefficients.length - 1;
    }

    boolean isZero()
    {
        boolean flag = false;
        if (coefficients[0] == 0)
        {
            flag = true;
        }
        return flag;
    }

    GenericGFPoly multiply(int i)
    {
        GenericGFPoly genericgfpoly;
        if (i == 0)
        {
            genericgfpoly = field.getZero();
        } else
        {
            genericgfpoly = this;
            if (i != 1)
            {
                int k = coefficients.length;
                int ai[] = new int[k];
                for (int j = 0; j < k; j++)
                {
                    ai[j] = field.multiply(coefficients[j], i);
                }

                return new GenericGFPoly(field, ai);
            }
        }
        return genericgfpoly;
    }

    GenericGFPoly multiply(GenericGFPoly genericgfpoly)
    {
        if (!field.equals(genericgfpoly.field))
        {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (isZero() || genericgfpoly.isZero())
        {
            return field.getZero();
        }
        int ai[] = coefficients;
        int k = ai.length;
        genericgfpoly = genericgfpoly.coefficients;
        int l = genericgfpoly.length;
        int ai1[] = new int[(k + l) - 1];
        for (int i = 0; i < k; i++)
        {
            int i1 = ai[i];
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = GenericGF.addOrSubtract(ai1[i + j], field.multiply(i1, genericgfpoly[j]));
            }

        }

        return new GenericGFPoly(field, ai1);
    }

    GenericGFPoly multiplyByMonomial(int i, int j)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException();
        }
        if (j == 0)
        {
            return field.getZero();
        }
        int k = coefficients.length;
        int ai[] = new int[k + i];
        for (i = 0; i < k; i++)
        {
            ai[i] = field.multiply(coefficients[i], j);
        }

        return new GenericGFPoly(field, ai);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(getDegree() * 8);
        int i = getDegree();
        do
        {
            if (i >= 0)
            {
                int k = getCoefficient(i);
                if (k != 0)
                {
                    int j;
                    if (k < 0)
                    {
                        stringbuilder.append(" - ");
                        j = -k;
                    } else
                    {
                        j = k;
                        if (stringbuilder.length() > 0)
                        {
                            stringbuilder.append(" + ");
                            j = k;
                        }
                    }
                    if (i == 0 || j != 1)
                    {
                        j = field.log(j);
                        if (j == 0)
                        {
                            stringbuilder.append('1');
                        } else
                        if (j == 1)
                        {
                            stringbuilder.append('a');
                        } else
                        {
                            stringbuilder.append("a^");
                            stringbuilder.append(j);
                        }
                    }
                    if (i != 0)
                    {
                        if (i == 1)
                        {
                            stringbuilder.append('x');
                        } else
                        {
                            stringbuilder.append("x^");
                            stringbuilder.append(i);
                        }
                    }
                }
                i--;
                continue;
            }
            return stringbuilder.toString();
        } while (true);
    }
}
