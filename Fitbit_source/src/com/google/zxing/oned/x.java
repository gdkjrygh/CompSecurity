// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.k;
import com.google.zxing.l;
import com.google.zxing.m;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            q, w, l

public abstract class x extends q
{

    private static final float a = 0.48F;
    static final int b[] = {
        1, 1, 1
    };
    static final int c[] = {
        1, 1, 1, 1, 1
    };
    static final int d[][];
    static final int e[][];
    private static final float f = 0.7F;
    private final StringBuilder g = new StringBuilder(20);
    private final w h = new w();
    private final com.google.zxing.oned.l i = new com.google.zxing.oned.l();

    protected x()
    {
    }

    static int a(a a1, int ai[], int j, int ai1[][])
        throws NotFoundException
    {
        a(a1, j, ai);
        float f1 = 0.48F;
        int i1 = -1;
        int j1 = ai1.length;
        for (j = 0; j < j1; j++)
        {
            float f2 = a(ai, ai1[j], 0.7F);
            if (f2 < f1)
            {
                i1 = j;
                f1 = f2;
            }
        }

        if (i1 >= 0)
        {
            return i1;
        } else
        {
            throw NotFoundException.a();
        }
    }

    static boolean a(CharSequence charsequence)
        throws FormatException
    {
        int k1 = charsequence.length();
        if (k1 != 0)
        {
            int j = k1 - 2;
            int j1 = 0;
            for (; j >= 0; j -= 2)
            {
                int i2 = charsequence.charAt(j) - 48;
                if (i2 < 0 || i2 > 9)
                {
                    throw FormatException.a();
                }
                j1 += i2;
            }

            j1 *= 3;
            for (int i1 = k1 - 1; i1 >= 0; i1 -= 2)
            {
                int l1 = charsequence.charAt(i1) - 48;
                if (l1 < 0 || l1 > 9)
                {
                    throw FormatException.a();
                }
                j1 += l1;
            }

            if (j1 % 10 == 0)
            {
                return true;
            }
        }
        return false;
    }

    static int[] a(a a1)
        throws NotFoundException
    {
        int ai2[] = new int[b.length];
        int j = 0;
        int ai[] = null;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            Arrays.fill(ai2, 0, b.length, 0);
            int ai1[] = a(a1, j, false, b, ai2);
            int j1 = ai1[0];
            int i1 = ai1[1];
            int k1 = j1 - (i1 - j1);
            j = i1;
            ai = ai1;
            if (k1 >= 0)
            {
                flag = a1.a(k1, j1, false);
                j = i1;
                ai = ai1;
            }
        } while (true);
        return ai;
    }

    static int[] a(a a1, int j, boolean flag, int ai[])
        throws NotFoundException
    {
        return a(a1, j, flag, ai, new int[ai.length]);
    }

    private static int[] a(a a1, int j, boolean flag, int ai[], int ai1[])
        throws NotFoundException
    {
        int l1 = ai.length;
        int i2 = a1.a();
        int i1;
        int j1;
        if (flag)
        {
            j = a1.e(j);
        } else
        {
            j = a1.d(j);
        }
        j1 = j;
        i1 = 0;
        while (j1 < i2) 
        {
            int k1;
            if (a1.a(j1) ^ flag)
            {
                ai1[i1] = ai1[i1] + 1;
                k1 = i1;
                i1 = j;
            } else
            {
                if (i1 == l1 - 1)
                {
                    if (a(ai1, ai, 0.7F) < 0.48F)
                    {
                        return (new int[] {
                            j, j1
                        });
                    }
                    k1 = j + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, l1 - 2);
                    ai1[l1 - 2] = 0;
                    ai1[l1 - 1] = 0;
                    j = i1 - 1;
                    i1 = k1;
                } else
                {
                    k1 = i1 + 1;
                    i1 = j;
                    j = k1;
                }
                ai1[j] = 1;
                if (!flag)
                {
                    flag = true;
                    k1 = j;
                } else
                {
                    flag = false;
                    k1 = j;
                }
            }
            j1++;
            j = i1;
            i1 = k1;
        }
        throw NotFoundException.a();
    }

    protected abstract int a(a a1, int ai[], StringBuilder stringbuilder)
        throws NotFoundException;

    public k a(int j, a a1, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        return a(j, a1, a(a1), map);
    }

    public k a(int j, a a1, int ai[], Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        Object obj;
        Object obj1;
        int ai1[];
        int i1;
        int k1;
        if (map == null)
        {
            obj = null;
        } else
        {
            obj = (m)map.get(DecodeHintType.j);
        }
        if (obj != null)
        {
            ((m) (obj)).a(new l((float)(ai[0] + ai[1]) / 2.0F, j));
        }
        obj1 = g;
        ((StringBuilder) (obj1)).setLength(0);
        i1 = a(a1, ai, ((StringBuilder) (obj1)));
        if (obj != null)
        {
            ((m) (obj)).a(new l(i1, j));
        }
        ai1 = a(a1, i1);
        if (obj != null)
        {
            ((m) (obj)).a(new l((float)(ai1[0] + ai1[1]) / 2.0F, j));
        }
        i1 = ai1[1];
        k1 = (i1 - ai1[0]) + i1;
        if (k1 >= a1.a() || !a1.a(i1, k1, false))
        {
            throw NotFoundException.a();
        }
        obj = ((StringBuilder) (obj1)).toString();
        if (((String) (obj)).length() < 8)
        {
            throw FormatException.a();
        }
        if (!a(((String) (obj))))
        {
            throw ChecksumException.a();
        }
        float f1 = (float)(ai[1] + ai[0]) / 2.0F;
        float f2 = (float)(ai1[1] + ai1[0]) / 2.0F;
        obj1 = b();
        ai = new k(((String) (obj)), null, new l[] {
            new l(f1, j), new l(f2, j)
        }, ((BarcodeFormat) (obj1)));
        try
        {
            a1 = h.a(j, a1, ai1[1]);
            ai.a(ResultMetadataType.h, a1.a());
            ai.a(a1.e());
            ai.a(a1.c());
            j = a1.a().length();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            j = 0;
        }
        if (map == null)
        {
            a1 = null;
        } else
        {
            a1 = (int[])(int[])map.get(DecodeHintType.k);
        }
        if (a1 != null)
        {
            boolean flag1 = false;
            int l1 = a1.length;
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    boolean flag = flag1;
                    if (j1 < l1)
                    {
                        if (j != a1[j1])
                        {
                            break label1;
                        }
                        flag = true;
                    }
                    if (!flag)
                    {
                        throw NotFoundException.a();
                    }
                    break label0;
                }
                j1++;
            } while (true);
        }
        if (obj1 == BarcodeFormat.h || obj1 == BarcodeFormat.o)
        {
            a1 = i.a(((String) (obj)));
            if (a1 != null)
            {
                ai.a(ResultMetadataType.g, a1);
            }
        }
        return ai;
    }

    boolean a(String s)
        throws FormatException
    {
        return a(((CharSequence) (s)));
    }

    int[] a(a a1, int j)
        throws NotFoundException
    {
        return a(a1, j, false, b);
    }

    abstract BarcodeFormat b();

    static 
    {
        int ai[] = {
            3, 2, 1, 1
        };
        int ai2[] = {
            2, 2, 2, 1
        };
        int ai4[] = {
            1, 4, 1, 1
        };
        int ai5[] = {
            1, 1, 3, 2
        };
        int ai6[] = {
            1, 1, 1, 4
        };
        int ai7[] = {
            1, 3, 1, 2
        };
        int ai8[] = {
            1, 2, 1, 3
        };
        int ai9[] = {
            3, 1, 1, 2
        };
        d = (new int[][] {
            ai, ai2, new int[] {
                2, 1, 2, 2
            }, ai4, ai5, new int[] {
                1, 2, 3, 1
            }, ai6, ai7, ai8, ai9
        });
        e = new int[20][];
        System.arraycopy(d, 0, e, 0, 10);
        for (int j = 10; j < 20; j++)
        {
            int ai1[] = d[j - 10];
            int ai3[] = new int[ai1.length];
            for (int i1 = 0; i1 < ai1.length; i1++)
            {
                ai3[i1] = ai1[ai1.length - i1 - 1];
            }

            e[j] = ai3;
        }

    }
}
