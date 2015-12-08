// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.b;
import com.google.zxing.common.a;
import com.google.zxing.j;
import com.google.zxing.k;
import com.google.zxing.l;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class q
    implements j
{

    public q()
    {
    }

    protected static float a(int ai[], int ai1[], float f)
    {
        int i;
        int k1;
        int i2;
        i2 = ai.length;
        int i1 = 0;
        k1 = 0;
        i = 0;
        for (; i1 < i2; i1++)
        {
            i += ai[i1];
            k1 += ai1[i1];
        }

        if (i >= k1) goto _L2; else goto _L1
_L1:
        return (1.0F / 0.0F);
_L2:
        float f1;
        float f3 = (float)i / (float)k1;
        f1 = 0.0F;
        int j1 = 0;
        do
        {
label0:
            {
                if (j1 >= i2)
                {
                    break label0;
                }
                int l1 = ai[j1];
                float f2 = (float)ai1[j1] * f3;
                if ((float)l1 > f2)
                {
                    f2 = (float)l1 - f2;
                } else
                {
                    f2 -= l1;
                }
                if (f2 > f * f3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                f1 += f2;
                j1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return f1 / (float)i;
    }

    protected static void a(a a1, int i, int ai[])
        throws NotFoundException
    {
        int i1;
        int j1;
        int l1;
        int i2;
        l1 = ai.length;
        Arrays.fill(ai, 0, l1, 0);
        i2 = a1.a();
        if (i >= i2)
        {
            throw NotFoundException.a();
        }
        boolean flag;
        if (!a1.a(i))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = false;
        j1 = i;
        i = ((flag) ? 1 : 0);
        if (j1 >= i2)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!(a1.a(j1) ^ i1))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
_L5:
        j1++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_47;
_L1:
        int k1 = i + 1;
        if (k1 != l1) goto _L4; else goto _L3
_L3:
        if (k1 != l1 && (k1 != l1 - 1 || j1 != i2))
        {
            throw NotFoundException.a();
        } else
        {
            return;
        }
_L4:
        ai[k1] = 1;
        if (i1 == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        i1 = i;
        i = k1;
          goto _L5
        k1 = i;
          goto _L3
    }

    private k b(b b1, Map map)
        throws NotFoundException
    {
        Object obj;
        int i1;
        int i2;
        int j2;
        j2 = b1.a();
        int l1 = b1.b();
        obj = new a(j2);
        int i;
        int k2;
        if (map != null && map.containsKey(DecodeHintType.d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i1 = 8;
        } else
        {
            i1 = 5;
        }
        k2 = Math.max(1, l1 >> i1);
        if (i != 0)
        {
            i = l1;
        } else
        {
            i = 15;
        }
        i1 = 0;
_L4:
label0:
        {
            if (i1 < i)
            {
                i2 = (i1 + 1) / 2;
                int j1;
                if ((i1 & 1) == 0)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (j1 != 0)
                {
                    j1 = i2;
                } else
                {
                    j1 = -i2;
                }
                i2 = (l1 >> 1) + j1 * k2;
                if (i2 >= 0 && i2 < l1)
                {
                    break label0;
                }
            }
            throw NotFoundException.a();
        }
        Object obj1 = b1.a(i2, ((a) (obj)));
        int k1;
        obj = obj1;
        k1 = 0;
_L2:
        Object obj2;
        obj2 = obj;
        obj1 = map;
        if (k1 >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k1 == 1)
        {
            ((a) (obj)).e();
            if (map != null && map.containsKey(DecodeHintType.j))
            {
                obj1 = new EnumMap(com/google/zxing/DecodeHintType);
                ((Map) (obj1)).putAll(map);
                ((Map) (obj1)).remove(DecodeHintType.j);
                map = ((Map) (obj1));
            }
        }
        obj1 = a(i2, ((a) (obj)), map);
        if (k1 != 1)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((k) (obj1)).a(ResultMetadataType.b, Integer.valueOf(180));
        obj2 = ((k) (obj1)).c();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj2[0] = new l((float)j2 - obj2[0].a() - 1.0F, obj2[0].b());
        obj2[1] = new l((float)j2 - obj2[1].a() - 1.0F, obj2[1].b());
        return ((k) (obj1));
        obj1;
        k1++;
        if (true) goto _L2; else goto _L1
        obj1;
        obj1 = map;
        obj2 = obj;
_L1:
        i1++;
        obj = obj2;
        map = ((Map) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void b(a a1, int i, int ai[])
        throws NotFoundException
    {
        int i1 = ai.length;
        boolean flag = a1.a(i);
        do
        {
            if (i <= 0 || i1 < 0)
            {
                break;
            }
            int j1 = i - 1;
            i = j1;
            if (a1.a(j1) != flag)
            {
                i1--;
                if (!flag)
                {
                    flag = true;
                    i = j1;
                } else
                {
                    flag = false;
                    i = j1;
                }
            }
        } while (true);
        if (i1 >= 0)
        {
            throw NotFoundException.a();
        } else
        {
            a(a1, i + 1, ai);
            return;
        }
    }

    public abstract k a(int i, a a1, Map map)
        throws NotFoundException, ChecksumException, FormatException;

    public k a(b b1)
        throws NotFoundException, FormatException
    {
        return a(b1, null);
    }

    public k a(b b1, Map map)
        throws NotFoundException, FormatException
    {
        k k1;
        try
        {
            k1 = b(b1, map);
        }
        catch (Object obj)
        {
            int i;
            if (map != null && map.containsKey(DecodeHintType.d))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && b1.e())
            {
                b1 = b1.f();
                map = b(b1, map);
                obj = map.e();
                if (obj != null && ((Map) (obj)).containsKey(ResultMetadataType.b))
                {
                    i = (((Integer)((Map) (obj)).get(ResultMetadataType.b)).intValue() + 270) % 360;
                } else
                {
                    i = 270;
                }
                map.a(ResultMetadataType.b, Integer.valueOf(i));
                obj = map.c();
                if (obj != null)
                {
                    int i1 = b1.b();
                    for (i = 0; i < obj.length; i++)
                    {
                        obj[i] = new l((float)i1 - obj[i].b() - 1.0F, obj[i].a());
                    }

                }
                return map;
            } else
            {
                throw obj;
            }
        }
        return k1;
    }

    public void a()
    {
    }
}
