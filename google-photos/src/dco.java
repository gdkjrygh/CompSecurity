// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class dco extends dcc
{

    private static final String g = dco.getSimpleName();
    public int b;
    public float c;
    public boolean d;
    public Map e;
    public dcp f;
    private final float h;
    private int i;
    private int j;
    private int k;

    public dco(dbc dbc1)
    {
        this(dbc1, 0.5F);
    }

    private dco(dbc dbc1, float f1)
    {
        super(dbc1);
        c = -1F;
        i = -1;
        d = false;
        e = new ConcurrentHashMap();
        h = 0.5F;
    }

    private int a(dbd dbd1, int l, int i1, boolean flag)
    {
        dba dba1 = a.a(dbd1.h, l);
        int k1 = dbd1.b(dba1.a);
        int l1 = dbd1.c(dba1.a);
        int j1 = i1;
        if (!flag)
        {
            j1 = i1 - k1;
        }
        i1 = j1 + k1;
        if (dbd1.a)
        {
            dba1.a.layout(j1, 0, i1, l1);
        } else
        {
            dba1.a.layout(0, j1, l1, i1);
        }
        if (i1 >= d(dbd1) && j1 <= e(dbd1))
        {
            dbd1.c.append(l, dba1);
        }
        l = j1;
        if (flag)
        {
            l = j1 + k1;
        }
        return l;
    }

    private void a(dbd dbd1, int l, int i1, int j1)
    {
        dba dba1 = a.a(dbd1.h, l);
        int k1 = dbd1.i;
        if (dbd1.a)
        {
            i1 = i1 - dbd1.e.left - dba1.a.getMeasuredWidth() / 2;
        } else
        {
            i1 = j1 - dbd1.e.top - dba1.a.getMeasuredHeight() / 2;
        }
        i1 += k1;
        j1 = dbd1.b(dba1.a);
        k1 = dbd1.c(dba1.a);
        if (dbd1.a)
        {
            dba1.a.layout(i1, 0, j1 + i1, k1);
        } else
        {
            dba1.a.layout(0, i1, k1, j1 + i1);
        }
        dbd1.c.append(l, dba1);
    }

    private static int b(dbd dbd1)
    {
        int i1 = dbd1.i;
        int l;
        if (dbd1.a)
        {
            l = dbd1.d.left;
        } else
        {
            l = dbd1.d.top;
        }
        return l + i1;
    }

    private static int c(dbd dbd1)
    {
        int i1 = dbd1.i;
        int l;
        if (dbd1.a)
        {
            l = dbd1.d.right;
        } else
        {
            l = dbd1.d.bottom;
        }
        return l + i1;
    }

    private void c(dbd dbd1, int l)
    {
        int i1;
        int k1;
        int l2;
        do
        {
            int k2 = dbd1.h.getCount();
            View view = a.a(dbd1.h, l).a;
            a(dbd1, l, dbd1.a(view), true);
            int i2;
            int i3;
            int j3;
            int k3;
            if (dbd1.a)
            {
                k1 = view.getLeft();
            } else
            {
                k1 = view.getTop();
            }
            if (dbd1.a)
            {
                i1 = view.getRight();
            } else
            {
                i1 = view.getBottom();
            }
            k3 = d(dbd1);
            i3 = e(dbd1);
            j3 = b(dbd1);
            l2 = c(dbd1);
            int l3;
            for (i2 = l; i2 > 0 && k1 > k3; k1 = a(dbd1, i2, k1 - l3, false))
            {
                l3 = dbd1.b;
                i2--;
            }

            if (i2 == 0)
            {
                i2 = 1;
            } else
            {
                i2 = 0;
            }
            if (i2 && k1 > j3)
            {
                dbd1.i = dbd1.i + (k1 - j3);
                continue;
            }
            boolean flag;
            if (i2 && k1 == j3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dbd1.j = flag;
            int j2;
            for (k1 = l; k1 < k2 - 1 && i1 < i3; i1 = a(dbd1, k1, i1 + j2, true))
            {
                j2 = dbd1.b;
                k1++;
            }

            if (k1 == k2 - 1)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (dbd1.j || !k1 || i1 >= l2)
            {
                break;
            }
            dbd1.i = dbd1.i + (i1 - l2);
        } while (true);
        boolean flag1;
        if (k1 && i1 <= l2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        dbd1.k = flag1;
        if (dbd1.f)
        {
            int j1 = dbd1.c.size();
            for (l = 0; l < j1; l++)
            {
                int l1 = dbd1.c.keyAt(l);
                dba dba1 = (dba)dbd1.c.valueAt(l);
                String.format("(%s): Position=%s Major=%s Item=%s", new Object[] {
                    Integer.valueOf(l), Integer.valueOf(l1), Integer.valueOf(dbd1.a(dba1.a)), dba1
                });
            }

        }
    }

    private int d(dbd dbd1)
    {
        int l = b(dbd1);
        float f1;
        if (dbd1.a)
        {
            f1 = ((float)dbd1.d.width() * h) / 2.0F;
        } else
        {
            f1 = ((float)dbd1.d.height() * h) / 2.0F;
        }
        return l - (int)f1;
    }

    private int e(dbd dbd1)
    {
        int l = c(dbd1);
        float f1;
        if (dbd1.a)
        {
            f1 = ((float)dbd1.d.width() * h) / 2.0F;
        } else
        {
            f1 = ((float)dbd1.d.height() * h) / 2.0F;
        }
        return (int)f1 + l;
    }

    public final void a(int l)
    {
        b = 3;
        i = l;
        a.c();
    }

    public final void a(dbd dbd1)
    {
        c.a(dbd1.h instanceof dae, "LayoutModifier can only be used with adapters that implement the PositionFromIdAdapter interface");
        if (d)
        {
            long l2;
            for (; !e.isEmpty(); e.remove(Long.valueOf(l2)))
            {
                l2 = ((Long)e.keySet().iterator().next()).longValue();
                dba dba1 = dbd1.a(l2);
                if (dba1 != null)
                {
                    ((dbq)dba1.a.findViewById(b.hn)).a((csb)e.get(Long.valueOf(l2)), true);
                }
            }

            d = false;
        }
        if (dbd1.h.getCount() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 446
    //                   1 452
    //                   2 606
    //                   3 663;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        int l = -1;
_L12:
        int i1;
        b = 0;
        i1 = l;
        if (l != -1) goto _L9; else goto _L8
_L8:
        dae dae1;
        int k1;
        dae1 = (dae)dbd1.h;
        k1 = dbd1.c.size();
        l = 0;
_L13:
        if (l >= k1)
        {
            break MISSING_BLOCK_LABEL_733;
        }
        i1 = dae1.a(((dba)dbd1.c.valueAt(l)).b);
        if (i1 < 0) goto _L11; else goto _L10
_L10:
        l = i1;
_L14:
        i1 = l;
        if (dbd1.f)
        {
            String.format("Anchor Position = %s, Item = %s", new Object[] {
                Integer.valueOf(l), dbd1.c.get(l)
            });
            i1 = l;
        }
_L9:
        dbd1.c.clear();
        c(dbd1, i1);
        i1 = dbd1.c.size();
        if (i1 == 0)
        {
            a(dbd1);
        }
        l = dbd1.c.keyAt(i1 / 2);
        View view = ((dba)dbd1.c.valueAt(i1 / 2)).a;
        float f1;
        int l1;
        if (dbd1.a)
        {
            f1 = dbd1.d.left;
            float f2 = dbd1.d.right;
            i1 = view.getLeft();
            f1 = ddl.c(f1, f2, (view.getMeasuredWidth() / 2 + i1) - dbd1.i);
        } else
        {
            f1 = dbd1.d.top;
            float f3 = dbd1.d.bottom;
            int j1 = view.getTop();
            f1 = ddl.c(f1, f3, (view.getMeasuredHeight() / 2 + j1) - dbd1.i);
        }
        c = f1 + (float)l;
        if (f != null)
        {
            f.a();
            return;
        }
          goto _L1
_L4:
        l = -1;
          goto _L12
_L5:
        f1 = c;
        i1 = (int)f1;
        if (i1 >= dbd1.h.getCount())
        {
            l = -1;
        } else
        {
            view = a.a(dbd1.h, i1).a;
            f1 -= i1;
            if (dbd1.a)
            {
                l = view.getLeft();
                l = (view.getMeasuredWidth() / 2 + l) - ddl.a(dbd1.d.left, dbd1.d.right, f1);
            } else
            {
                l = view.getTop();
                l = (view.getMeasuredHeight() / 2 + l) - ddl.a(dbd1.d.top, dbd1.d.bottom, f1);
            }
            dbd1.i = l;
            l = i1;
        }
          goto _L12
_L6:
        if (i < dbd1.h.getCount())
        {
            l = i;
            a(dbd1, i, j, k);
        } else
        {
            l = -1;
        }
        i = -1;
        j = 0;
        k = 0;
          goto _L12
_L7:
        if (i < dbd1.h.getCount())
        {
            l = i;
            i1 = dbd1.e.centerX();
            l1 = dbd1.e.centerY();
            a(dbd1, i, i1, l1);
        } else
        {
            l = -1;
        }
        i = -1;
          goto _L12
_L11:
        l++;
          goto _L13
        l = 0;
          goto _L14
    }

}
