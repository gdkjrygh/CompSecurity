// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.decoder.ec;


// Referenced classes of package com.google.zxing.pdf417.decoder.ec:
//            ModulusGF

final class ModulusPoly
{

    private final int coefficients[];
    private final ModulusGF field;

    ModulusPoly(ModulusGF modulusgf, int ai[])
    {
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        field = modulusgf;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            int i;
            for (i = 1; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                coefficients = modulusgf.getZero().coefficients;
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

    ModulusPoly add(ModulusPoly moduluspoly)
    {
        if (!field.equals(moduluspoly.field))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (isZero())
        {
            return moduluspoly;
        }
        if (moduluspoly.isZero())
        {
            return this;
        }
        int ai[] = coefficients;
        int ai2[] = moduluspoly.coefficients;
        int ai1[] = ai2;
        moduluspoly = ai;
        if (ai.length > ai2.length)
        {
            moduluspoly = ai2;
            ai1 = ai;
        }
        ai = new int[ai1.length];
        int j = ai1.length - moduluspoly.length;
        System.arraycopy(ai1, 0, ai, 0, j);
        for (int i = j; i < ai1.length; i++)
        {
            ai[i] = field.add(moduluspoly[i - j], ai1[i]);
        }

        return new ModulusPoly(field, ai);
    }

    ModulusPoly[] divide(ModulusPoly moduluspoly)
    {
        if (!field.equals(moduluspoly.field))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (moduluspoly.isZero())
        {
            throw new IllegalArgumentException("Divide by 0");
        }
        ModulusPoly moduluspoly2 = field.getZero();
        ModulusPoly moduluspoly1 = this;
        int i = moduluspoly.getCoefficient(moduluspoly.getDegree());
        i = field.inverse(i);
        ModulusPoly moduluspoly3;
        for (; moduluspoly1.getDegree() >= moduluspoly.getDegree() && !moduluspoly1.isZero(); moduluspoly1 = moduluspoly1.subtract(moduluspoly3))
        {
            int j = moduluspoly1.getDegree() - moduluspoly.getDegree();
            int k = field.multiply(moduluspoly1.getCoefficient(moduluspoly1.getDegree()), i);
            moduluspoly3 = moduluspoly.multiplyByMonomial(j, k);
            moduluspoly2 = moduluspoly2.add(field.buildMonomial(j, k));
        }

        return (new ModulusPoly[] {
            moduluspoly2, moduluspoly1
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
                j = ai[k];
                i = field.add(i, j);
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
            l = field.add(field.multiply(i, l), coefficients[j1]);
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

    ModulusPoly multiply(int i)
    {
        ModulusPoly moduluspoly;
        if (i == 0)
        {
            moduluspoly = field.getZero();
        } else
        {
            moduluspoly = this;
            if (i != 1)
            {
                int k = coefficients.length;
                int ai[] = new int[k];
                for (int j = 0; j < k; j++)
                {
                    ai[j] = field.multiply(coefficients[j], i);
                }

                return new ModulusPoly(field, ai);
            }
        }
        return moduluspoly;
    }

    ModulusPoly multiply(ModulusPoly moduluspoly)
    {
        if (!field.equals(moduluspoly.field))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (isZero() || moduluspoly.isZero())
        {
            return field.getZero();
        }
        int ai[] = coefficients;
        int k = ai.length;
        moduluspoly = moduluspoly.coefficients;
        int l = moduluspoly.length;
        int ai1[] = new int[(k + l) - 1];
        for (int i = 0; i < k; i++)
        {
            int i1 = ai[i];
            for (int j = 0; j < l; j++)
            {
                ai1[i + j] = field.add(ai1[i + j], field.multiply(i1, moduluspoly[j]));
            }

        }

        return new ModulusPoly(field, ai1);
    }

    ModulusPoly multiplyByMonomial(int i, int j)
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

        return new ModulusPoly(field, ai);
    }

    ModulusPoly negative()
    {
        int j = coefficients.length;
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = field.subtract(0, coefficients[i]);
        }

        return new ModulusPoly(field, ai);
    }

    ModulusPoly subtract(ModulusPoly moduluspoly)
    {
        if (!field.equals(moduluspoly.field))
        {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (moduluspoly.isZero())
        {
            return this;
        } else
        {
            return add(moduluspoly.negative());
        }
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
                        stringbuilder.append(j);
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
