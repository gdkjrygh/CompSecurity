// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class enk extends aep
    implements fso
{

    final float a;
    int b;
    int c;
    int d;
    int e;
    public int f;
    int g;
    private final aen h;
    private final enh i;
    private final SparseIntArray j = new SparseIntArray();
    private final SparseIntArray k = new SparseIntArray();
    private final SparseIntArray l = new SparseIntArray();
    private final SparseIntArray m = new SparseIntArray();
    private final SparseIntArray n = new SparseIntArray();
    private final SparseIntArray o = new SparseIntArray();
    private final SparseIntArray p = new SparseIntArray();

    public enk(Context context, aen aen1, enh enh1)
    {
        h = aen1;
        i = enh1;
        aen1.a(this);
        a = (float)context.getResources().getInteger(b.mi) / 100F;
    }

    private static int a(float f1, int i1, int j1)
    {
        if (f1 == -1F)
        {
            return i1;
        } else
        {
            return Math.round((float)j1 * f1);
        }
    }

    private List a(SparseArray sparsearray)
    {
        LinkedList linkedlist = new LinkedList();
        for (Object obj = (enl)sparsearray.get(h.a() - 1); obj != null; obj = (enl)sparsearray.get(((enm) (obj)).a - 1))
        {
            obj = ((enl) (obj)).b;
            linkedlist.add(0, obj);
        }

        return linkedlist;
    }

    private void a(List list)
    {
        Iterator iterator = list.iterator();
        int i2 = -1;
        do
        {
label0:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                enm enm1 = (enm)iterator.next();
                int j2 = i2 + 1;
                int i1 = g - (enm1.b - enm1.a) * f;
                int l1 = Math.min(c, enm1.c);
                for (int j1 = enm1.a; j1 <= enm1.b; j1++)
                {
                    i2 = a(d(j1), i1, l1);
                    i1 -= i2;
                    j.put(j1, i2);
                    k.put(j1, l1);
                }

                int k2 = (enm1.b - enm1.a) + 1 << 1;
                int k1;
                boolean flag;
                if (enm1.g || j2 == list.size() - 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                k1 = i1;
                if (flag)
                {
                    k1 = i1;
                    if (i1 > k2)
                    {
                        i1 = g - (enm1.b - enm1.a) * f;
                        i2 = enm1.a;
                        do
                        {
                            k1 = i1;
                            if (i2 > enm1.b)
                            {
                                break;
                            }
                            k1 = a(d(i2), i1, b);
                            i1 -= k1;
                            j.put(i2, k1);
                            k.put(i2, b);
                            i2++;
                        } while (true);
                    }
                }
                if (k1 != 0 && (flag && !enm1.g || k1 <= k2))
                {
                    int l2 = Math.abs(k1);
                    i1 = enm1.a;
                    flag = false;
                    while (flag < l2) 
                    {
                        int j3 = j.get(i1);
                        if (k1 > 0)
                        {
                            i2 = 1;
                        } else
                        {
                            i2 = -1;
                        }
                        j.put(i1, i2 + j3);
                        if (i1 < enm1.b)
                        {
                            i1++;
                        } else
                        {
                            i1 = enm1.a;
                        }
                        flag++;
                    }
                }
                k1 = enm1.a;
                i1 = 0;
                flag = false;
                do
                {
                    i2 = j2;
                    if (k1 > enm1.b)
                    {
                        break;
                    }
                    int i3;
                    if (k1 > enm1.a)
                    {
                        i2 = f;
                    } else
                    {
                        i2 = 0;
                    }
                    flag = i2 + flag;
                    i2 = j.get(k1);
                    i3 = k.get(k1);
                    l.put(k1, flag);
                    m.put(k1, flag + i2);
                    n.put(k1, i3);
                    o.put(k1, i1);
                    p.put(k1, (enm1.b - enm1.a) + 1);
                    k1++;
                    flag += i2;
                    i1++;
                } while (true);
            }
        } while (true);
    }

    private List c(int i1)
    {
        LinkedList linkedlist;
        int j1;
        int k1;
        int l1;
        int k2;
        linkedlist = new LinkedList();
        k1 = 0;
        l1 = 0;
        k2 = h.a() - 1;
        j1 = i1;
_L10:
        if (j1 > k2) goto _L2; else goto _L1
_L1:
        float f3 = d(j1);
        if (f3 != -1F) goto _L4; else goto _L3
_L3:
        if (j1 != i1) goto _L6; else goto _L5
_L5:
        linkedlist.add(new enm(i1, j1, -1, 0.0F, (byte)0));
_L7:
        return linkedlist;
_L6:
        if (linkedlist.isEmpty())
        {
            float f1 = d(k1, l1);
            l1 = e(k1, l1);
            k1 = l1;
            if (l1 > c)
            {
                k1 = c;
                f1 = 1.0F;
            }
            enm enm1 = new enm(i1, j1 - 1, k1, f1, (byte)0);
            enm1.g = true;
            linkedlist.add(enm1);
        }
        if (true) goto _L7; else goto _L4
_L4:
        float f2;
        int l2;
        l2 = Math.round((float)b * f3);
        k1 += l2;
        int i2;
        int i3;
        if (j1 - i1 > 0)
        {
            i2 = f;
        } else
        {
            i2 = 0;
        }
        l1 += i2;
        f2 = d(k1, l1);
        i3 = e(k1, l1);
        if ((float)i3 * f3 > (float)e)
        {
            i2 = 1;
        } else
        {
            i2 = 0;
        }
        if (-1F > f2 || f2 > 1.0F || i2 == 0) goto _L9; else goto _L8
_L8:
        linkedlist.add(new enm(i1, j1, i3, f2, (byte)0));
_L11:
        j1++;
          goto _L10
_L9:
        if (f2 >= -1F)
        {
            break MISSING_BLOCK_LABEL_413;
        }
        if (linkedlist.isEmpty())
        {
            int j2;
            if (j1 > i1)
            {
                j2 = k1 - l2;
                if (j1 - i1 > 0)
                {
                    k1 = f;
                } else
                {
                    k1 = 0;
                }
                k1 = l1 - k1;
                l1 = j1 - 1;
                f2 = d(j2, k1);
                j1 = k1;
                k1 = j1;
            } else
            {
                j2 = k1;
                k1 = l1;
                l1 = j1;
            }
            linkedlist.add(new enm(i1, l1, e(j2, k1), f2, (byte)0));
        }
_L2:
        return linkedlist;
        if (j1 == k2)
        {
            linkedlist.add(new enm(i1, j1, b, 0.0F, (byte)0));
        }
          goto _L11
    }

    private float d(int i1)
    {
label0:
        {
            float f2 = i.a(i1);
            float f1 = f2;
            if (f2 == -2F)
            {
                if ((i1 % 2 + i1 % 5 + i1 % 7) % 2 != 0)
                {
                    break label0;
                }
                f1 = 0.8F;
            }
            return f1;
        }
        return 1.25F;
    }

    private float d(int i1, int j1)
    {
        int k1 = g - i1 - j1;
        if (k1 < 0)
        {
            return -(1.0F - (float)(g - j1) / (float)i1) / 0.3F;
        }
        if (k1 > 0)
        {
            return (1.0F - (float)i1 / (float)(g - j1)) / 0.5F;
        } else
        {
            return 0.0F;
        }
    }

    private int e(int i1, int j1)
    {
        i1 = Math.round(((float)(g - j1) / (float)i1) * (float)b);
        return Math.max(d, i1);
    }

    public final int a(int i1)
    {
        return p.get(i1);
    }

    public final void a()
    {
        b();
    }

    public final void a(int i1, int j1, int k1)
    {
        b();
    }

    final void a(int i1, Rect rect)
    {
        int k1 = l.get(i1, -1);
        int j1 = k1;
        if (k1 == -1)
        {
            SparseArray sparsearray = new SparseArray();
            LinkedList linkedlist = new LinkedList();
            linkedlist.add(Integer.valueOf(0));
            while (!linkedlist.isEmpty()) 
            {
                j1 = ((Integer)linkedlist.remove(0)).intValue();
                List list = c(j1);
                float f1;
                Iterator iterator;
                if (j1 > 0)
                {
                    f1 = ((enl)sparsearray.get(j1 - 1)).c;
                } else
                {
                    f1 = 0.0F;
                }
                iterator = list.iterator();
                while (iterator.hasNext()) 
                {
                    enm enm1 = (enm)iterator.next();
                    enl enl2 = (enl)sparsearray.get(enm1.b);
                    enl enl1 = enl2;
                    if (enl2 == null)
                    {
                        enl enl3 = new enl(enm1.b);
                        sparsearray.put(enm1.b, enl3);
                        enl3.c = 3.402823E+38F;
                        enl1 = enl3;
                        if (enl3.a + 1 < h.a())
                        {
                            linkedlist.add(Integer.valueOf(enl3.a + 1));
                            enl1 = enl3;
                        }
                    }
                    enm1.e = (float)Math.pow((float)(100D * Math.pow(Math.abs(enm1.d), 3D) + 0.5D) + 10F, 2D);
                    enm1.f = enm1.e + f1;
                    if (enm1.f < enl1.c)
                    {
                        enl1.c = enm1.f;
                        enl1.b = enm1;
                    }
                }
            }
            a(a(sparsearray));
            j1 = l.get(i1);
        }
        rect.set(j1, 0, m.get(i1), n.get(i1));
    }

    public final void a_(int i1, int j1)
    {
        b();
    }

    public final int b(int i1)
    {
        return o.get(i1);
    }

    void b()
    {
        l.clear();
        m.clear();
        n.clear();
        o.clear();
        p.clear();
        j.clear();
        k.clear();
    }

    public final void b_(int i1, int j1)
    {
        b();
    }

    public final void c_(int i1, int j1)
    {
        b();
    }
}
