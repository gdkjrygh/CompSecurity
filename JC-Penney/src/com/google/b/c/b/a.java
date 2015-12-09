// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.b;

import com.google.b.b.a.b;
import com.google.b.b.g;
import com.google.b.b.i;
import com.google.b.m;
import com.google.b.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.b.c.b:
//            c, d

public final class a
{

    private final com.google.b.b.b a;
    private final b b;

    public a(com.google.b.b.b b1)
    {
        a = b1;
        b = new b(b1);
    }

    private static int a(s s1, s s2)
    {
        return com.google.b.b.a.a.a(s.a(s1, s2));
    }

    private static com.google.b.b.b a(com.google.b.b.b b1, s s1, s s2, s s3, s s4, int j, int k)
    {
        return i.a().a(b1, j, k, 0.5F, 0.5F, (float)j - 0.5F, 0.5F, (float)j - 0.5F, (float)k - 0.5F, 0.5F, (float)k - 0.5F, s1.a(), s1.b(), s4.a(), s4.b(), s3.a(), s3.b(), s2.a(), s2.b());
    }

    private s a(s s1, s s2, s s3, s s4, int j)
    {
        s s5;
        float f = (float)a(s1, s2) / (float)j;
        int k = a(s3, s4);
        float f1 = (s4.a() - s3.a()) / (float)k;
        float f2 = (s4.b() - s3.b()) / (float)k;
        s5 = new s(f1 * f + s4.a(), f * f2 + s4.b());
        f = (float)a(s1, s3) / (float)j;
        j = a(s2, s4);
        f1 = (s4.a() - s2.a()) / (float)j;
        f2 = (s4.b() - s2.b()) / (float)j;
        s4 = new s(f1 * f + s4.a(), f * f2 + s4.b());
        if (a(s5)) goto _L2; else goto _L1
_L1:
        if (!a(s4)) goto _L4; else goto _L3
_L3:
        s1 = s4;
_L6:
        return s1;
_L4:
        return null;
_L2:
        s1 = s5;
        if (a(s4))
        {
            s1 = s5;
            if (Math.abs(b(s3, s5).c() - b(s2, s5).c()) > Math.abs(b(s3, s4).c() - b(s2, s4).c()))
            {
                return s4;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private s a(s s1, s s2, s s3, s s4, int j, int k)
    {
        s s5;
        float f = (float)a(s1, s2) / (float)j;
        int l = a(s3, s4);
        float f1 = (s4.a() - s3.a()) / (float)l;
        float f2 = (s4.b() - s3.b()) / (float)l;
        s5 = new s(f1 * f + s4.a(), f * f2 + s4.b());
        f = (float)a(s1, s3) / (float)k;
        l = a(s2, s4);
        f1 = (s4.a() - s2.a()) / (float)l;
        f2 = (s4.b() - s2.b()) / (float)l;
        s1 = new s(f1 * f + s4.a(), f * f2 + s4.b());
        if (a(s5)) goto _L2; else goto _L1
_L1:
        if (!a(s1)) goto _L4; else goto _L3
_L3:
        return s1;
_L4:
        return null;
_L2:
        if (!a(s1))
        {
            return s5;
        }
        if (Math.abs(j - b(s3, s5).c()) + Math.abs(k - b(s2, s5).c()) <= Math.abs(j - b(s3, s1).c()) + Math.abs(k - b(s2, s1).c()))
        {
            return s5;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private static void a(Map map, s s1)
    {
        Integer integer = (Integer)map.get(s1);
        int j;
        if (integer == null)
        {
            j = 1;
        } else
        {
            j = integer.intValue() + 1;
        }
        map.put(s1, Integer.valueOf(j));
    }

    private boolean a(s s1)
    {
        return s1.a() >= 0.0F && s1.a() < (float)a.f() && s1.b() > 0.0F && s1.b() < (float)a.g();
    }

    private c b(s s1, s s2)
    {
        int k = (int)s1.a();
        int j = (int)s1.b();
        int l1 = (int)s2.a();
        int i2 = (int)s2.b();
        com.google.b.b.b b1;
        int l;
        int j1;
        boolean flag;
        byte byte0;
        byte byte1;
        int j2;
        int k2;
        int l2;
        int i3;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (Math.abs(i2 - j) > Math.abs(l1 - k))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int i1 = l1;
            l1 = i2;
            int k1 = k;
            i2 = i1;
            k = j;
            j = k1;
        }
        l2 = Math.abs(i2 - j);
        i3 = Math.abs(l1 - k);
        j2 = -l2 / 2;
        if (k < l1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (j < i2)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        k2 = 0;
        b1 = a;
        if (flag)
        {
            l = k;
        } else
        {
            l = j;
        }
        if (flag)
        {
            j1 = j;
        } else
        {
            j1 = k;
        }
        flag1 = b1.a(l, j1);
        l = k2;
        if (j == i2) goto _L2; else goto _L1
_L1:
        b1 = a;
        if (flag)
        {
            j1 = k;
        } else
        {
            j1 = j;
        }
        if (flag)
        {
            k2 = j;
        } else
        {
            k2 = k;
        }
        flag3 = b1.a(j1, k2);
        j1 = l;
        flag2 = flag1;
        if (flag3 != flag1)
        {
            j1 = l + 1;
            flag2 = flag3;
        }
        k2 = j2 + i3;
        l = k2;
        j2 = k;
        if (k2 <= 0) goto _L4; else goto _L3
_L3:
        if (k != l1) goto _L6; else goto _L5
_L5:
        return new c(s1, s2, j1, null);
_L6:
        j2 = k + byte0;
        l = k2 - l2;
_L4:
        j += byte1;
        k2 = l;
        k = j2;
        l = j1;
        flag1 = flag2;
        j2 = k2;
        break MISSING_BLOCK_LABEL_142;
_L2:
        j1 = l;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public g a()
    {
        s as[] = b.a();
        s s6 = as[0];
        s s7 = as[1];
        s s8 = as[2];
        s s9 = as[3];
        Object obj1 = new ArrayList(4);
        ((List) (obj1)).add(b(s6, s7));
        ((List) (obj1)).add(b(s6, s8));
        ((List) (obj1)).add(b(s7, s9));
        ((List) (obj1)).add(b(s8, s9));
        Collections.sort(((List) (obj1)), new d(null));
        Object obj = (c)((List) (obj1)).get(0);
        obj1 = (c)((List) (obj1)).get(1);
        HashMap hashmap = new HashMap();
        a(((Map) (hashmap)), ((c) (obj)).a());
        a(((Map) (hashmap)), ((c) (obj)).b());
        a(((Map) (hashmap)), ((c) (obj1)).a());
        a(((Map) (hashmap)), ((c) (obj1)).b());
        obj1 = null;
        s s1 = null;
        obj = null;
        Object obj2 = hashmap.entrySet().iterator();
        while (((Iterator) (obj2)).hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj2)).next();
            s s4 = (s)entry.getKey();
            if (((Integer)entry.getValue()).intValue() == 2)
            {
                s1 = ((s) (obj1));
                obj1 = s4;
            } else
            if (obj1 == null)
            {
                obj1 = s1;
                s1 = s4;
            } else
            {
                obj = s1;
                s1 = ((s) (obj1));
                obj1 = obj;
                obj = s4;
            }
            s4 = s1;
            s1 = ((s) (obj1));
            obj1 = s4;
        }
        if (obj1 == null || s1 == null || obj == null)
        {
            throw m.a();
        }
        s as1[] = new s[3];
        as1[0] = ((s) (obj1));
        as1[1] = s1;
        as1[2] = ((s) (obj));
        s.a(as1);
        s s5 = as1[0];
        obj2 = as1[1];
        s s10 = as1[2];
        int j;
        int k;
        int j1;
        if (!hashmap.containsKey(s6))
        {
            obj = s6;
        } else
        if (!hashmap.containsKey(s7))
        {
            obj = s7;
        } else
        if (!hashmap.containsKey(s8))
        {
            obj = s8;
        } else
        {
            obj = s9;
        }
        j1 = b(s10, ((s) (obj))).c();
        k = b(s5, ((s) (obj))).c();
        j = j1;
        if ((j1 & 1) == 1)
        {
            j = j1 + 1;
        }
        j1 = j + 2;
        j = k;
        if ((k & 1) == 1)
        {
            j = k + 1;
        }
        j += 2;
        if (j1 * 4 >= j * 7 || j * 4 >= j1 * 7)
        {
            s s2 = a(((s) (obj2)), s5, s10, ((s) (obj)), j1, j);
            obj1 = s2;
            if (s2 == null)
            {
                obj1 = obj;
            }
            int l = b(s10, ((s) (obj1))).c();
            j1 = b(s5, ((s) (obj1))).c();
            j = l;
            if ((l & 1) == 1)
            {
                j = l + 1;
            }
            l = j1;
            if ((j1 & 1) == 1)
            {
                l = j1 + 1;
            }
            obj = a(a, s10, ((s) (obj2)), s5, ((s) (obj1)), j, l);
        } else
        {
            s s3 = a(((s) (obj2)), s5, s10, ((s) (obj)), Math.min(j, j1));
            obj1 = s3;
            if (s3 == null)
            {
                obj1 = obj;
            }
            int i1 = Math.max(b(s10, ((s) (obj1))).c(), b(s5, ((s) (obj1))).c()) + 1;
            j = i1;
            if ((i1 & 1) == 1)
            {
                j = i1 + 1;
            }
            obj = a(a, s10, ((s) (obj2)), s5, ((s) (obj1)), j, j);
        }
        return new g(((com.google.b.b.b) (obj)), new s[] {
            s10, obj2, s5, obj1
        });
    }
}
