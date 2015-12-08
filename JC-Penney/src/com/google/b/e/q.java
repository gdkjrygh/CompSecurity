// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.e;

import com.google.b.b.a;
import com.google.b.c;
import com.google.b.e;
import com.google.b.m;
import com.google.b.o;
import com.google.b.p;
import com.google.b.r;
import com.google.b.s;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class q
    implements o
{

    public q()
    {
    }

    protected static float a(int ai[], int ai1[], float f)
    {
        int i;
        int l;
        int j1;
        j1 = ai.length;
        int j = 0;
        l = 0;
        i = 0;
        for (; j < j1; j++)
        {
            i += ai[j];
            l += ai1[j];
        }

        if (i >= l) goto _L2; else goto _L1
_L1:
        return (1.0F / 0.0F);
_L2:
        float f1;
        float f3 = (float)i / (float)l;
        f1 = 0.0F;
        int k = 0;
        do
        {
label0:
            {
                if (k >= j1)
                {
                    break label0;
                }
                int i1 = ai[k];
                float f2 = (float)ai1[k] * f3;
                if ((float)i1 > f2)
                {
                    f2 = (float)i1 - f2;
                } else
                {
                    f2 -= i1;
                }
                if (f2 > f * f3)
                {
                    continue; /* Loop/switch isn't completed */
                }
                f1 += f2;
                k++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return f1 / (float)i;
    }

    protected static void a(a a1, int i, int ai[])
    {
        int j;
        int k;
        int i1;
        int j1;
        i1 = ai.length;
        Arrays.fill(ai, 0, i1, 0);
        j1 = a1.a();
        if (i >= j1)
        {
            throw m.a();
        }
        boolean flag;
        if (!a1.a(i))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        flag = false;
        k = i;
        i = ((flag) ? 1 : 0);
        if (k >= j1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        if (!(a1.a(k) ^ j))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = ai[i] + 1;
_L5:
        k++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_47;
_L1:
        int l = i + 1;
        if (l != i1) goto _L4; else goto _L3
_L3:
        if (l != i1 && (l != i1 - 1 || k != j1))
        {
            throw m.a();
        } else
        {
            return;
        }
_L4:
        ai[l] = 1;
        if (j == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = i;
        i = l;
          goto _L5
        l = i;
          goto _L3
    }

    private com.google.b.q b(c c1, Map map)
    {
        Object obj;
        int j;
        int j1;
        int k1;
        k1 = c1.a();
        int i1 = c1.b();
        obj = new a(k1);
        int i;
        int l1;
        if (map != null && map.containsKey(e.d))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            j = 8;
        } else
        {
            j = 5;
        }
        l1 = Math.max(1, i1 >> j);
        if (i != 0)
        {
            i = i1;
        } else
        {
            i = 15;
        }
        j = 0;
_L4:
label0:
        {
            if (j < i)
            {
                j1 = (j + 1) / 2;
                int k;
                if ((j & 1) == 0)
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
                if (k != 0)
                {
                    k = j1;
                } else
                {
                    k = -j1;
                }
                j1 = (i1 >> 1) + k * l1;
                if (j1 >= 0 && j1 < i1)
                {
                    break label0;
                }
            }
            throw m.a();
        }
        Object obj1 = c1.a(j1, ((a) (obj)));
        int l;
        obj = obj1;
        l = 0;
_L2:
        Object obj2;
        obj2 = obj;
        obj1 = map;
        if (l >= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l == 1)
        {
            ((a) (obj)).e();
            if (map != null && map.containsKey(e.j))
            {
                obj1 = new EnumMap(com/google/b/e);
                ((Map) (obj1)).putAll(map);
                ((Map) (obj1)).remove(e.j);
                map = ((Map) (obj1));
            }
        }
        obj1 = a(j1, ((a) (obj)), map);
        if (l != 1)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        ((com.google.b.q) (obj1)).a(r.b, Integer.valueOf(180));
        obj2 = ((com.google.b.q) (obj1)).c();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj2[0] = new s((float)k1 - obj2[0].a() - 1.0F, obj2[0].b());
        obj2[1] = new s((float)k1 - obj2[1].a() - 1.0F, obj2[1].b());
        return ((com.google.b.q) (obj1));
        obj1;
        l++;
        if (true) goto _L2; else goto _L1
        obj1;
        obj1 = map;
        obj2 = obj;
_L1:
        j++;
        obj = obj2;
        map = ((Map) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected static void b(a a1, int i, int ai[])
    {
        int j = ai.length;
        boolean flag = a1.a(i);
        do
        {
            if (i <= 0 || j < 0)
            {
                break;
            }
            int k = i - 1;
            i = k;
            if (a1.a(k) != flag)
            {
                j--;
                if (!flag)
                {
                    flag = true;
                    i = k;
                } else
                {
                    flag = false;
                    i = k;
                }
            }
        } while (true);
        if (j >= 0)
        {
            throw m.a();
        } else
        {
            a(a1, i + 1, ai);
            return;
        }
    }

    public abstract com.google.b.q a(int i, a a1, Map map);

    public com.google.b.q a(c c1, Map map)
    {
        com.google.b.q q1;
        try
        {
            q1 = b(c1, map);
        }
        catch (Object obj)
        {
            int i;
            if (map != null && map.containsKey(e.d))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && c1.d())
            {
                c1 = c1.e();
                map = b(c1, map);
                obj = map.e();
                if (obj != null && ((Map) (obj)).containsKey(r.b))
                {
                    i = (((Integer)((Map) (obj)).get(r.b)).intValue() + 270) % 360;
                } else
                {
                    i = 270;
                }
                map.a(r.b, Integer.valueOf(i));
                obj = map.c();
                if (obj != null)
                {
                    int j = c1.b();
                    for (i = 0; i < obj.length; i++)
                    {
                        obj[i] = new s((float)j - obj[i].b() - 1.0F, obj[i].a());
                    }

                }
                return map;
            } else
            {
                throw obj;
            }
        }
        return q1;
    }

    public void a()
    {
    }
}
