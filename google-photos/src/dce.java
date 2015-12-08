// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.SparseArray;
import android.view.View;
import android.widget.Adapter;
import java.util.Arrays;

public class dce extends dcc
{

    private static final String c = dce.getSimpleName();
    public dcf b;
    private final ddk d = new ddk();
    private final ddk e = new ddk();
    private boolean f;

    public dce(dbc dbc)
    {
        super(dbc);
        f = true;
    }

    private int a(ddk ddk1, Adapter adapter, int i)
    {
        int k = ddk1.a(adapter.getItemId(i), 0x80000000);
        int j = k;
        if (k == 0x80000000)
        {
            j = k;
            if (b != null)
            {
                long l = b.a(i);
                j = k;
                if (l != -1L)
                {
                    j = ddk1.a(l, 0x80000000);
                }
            }
        }
        return j;
    }

    private static void b(dbd dbd1)
    {
        int j = dbd1.c.size();
        for (int i = 0; i < j; i++)
        {
            ((dba)dbd1.c.valueAt(i)).d = (short)(32767 - i);
        }

    }

    public final void a(dbd dbd1)
    {
        ddk ddk2;
        ddk ddk1;
        int i;
        int k;
        if (f)
        {
            ddk2 = d;
        } else
        {
            ddk2 = e;
        }
        if (f)
        {
            ddk1 = e;
        } else
        {
            ddk1 = d;
        }
        ddk1.c = 0;
        k = dbd1.c.size();
        i = 0;
        while (i < k) 
        {
            int i1 = dbd1.c.keyAt(i);
            long l4 = dbd1.h.getItemId(i1);
            int i2 = dbd1.a(((dba)dbd1.c.valueAt(i)).a);
            int k2 = Arrays.binarySearch(ddk1.a, 0, ddk1.c, l4);
            if (k2 >= 0)
            {
                ddk1.b[k2] = i2;
            } else
            {
                k2 = ~k2;
                if (ddk1.c == ddk1.a.length)
                {
                    int i3 = ddk1.a.length << 1;
                    ddk1.a = Arrays.copyOf(ddk1.a, i3);
                    ddk1.b = Arrays.copyOf(ddk1.b, i3);
                }
                if (ddk1.c != k2)
                {
                    System.arraycopy(ddk1.a, k2, ddk1.a, k2 + 1, ddk1.c - k2);
                    System.arraycopy(ddk1.b, k2, ddk1.b, k2 + 1, ddk1.c - k2);
                }
                ddk1.a[k2] = l4;
                ddk1.b[k2] = i2;
                ddk1.c = ddk1.c + 1;
            }
            if (dbd1.f)
            {
                String.format("Snapshot %s: Position %s = %s", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(i1), Integer.valueOf(i2)
                });
            }
            i++;
        }
        boolean flag;
        if (!f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (dbd1.a(25)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int l;
        int j1;
        int j2;
        int j3;
        int j4;
        j4 = dbd1.c.size();
        j2 = 0x7fffffff;
        j3 = 0x80000000;
        j = 0;
        l = 0;
        j1 = 0;
_L4:
        int l2;
        int k3;
        int l3;
        if (j1 >= j4)
        {
            continue; /* Loop/switch isn't completed */
        }
        l2 = dbd1.c.keyAt(j1);
        View view = ((dba)dbd1.c.valueAt(j1)).a;
        l2 = a(ddk2, dbd1.h, l2);
        l3 = j;
        k3 = j2;
        if (l2 == 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        int i4 = l2 - dbd1.a(view);
        l2 = j;
        j = j2;
        if (j1 < j2)
        {
            l2 = i4;
            j = j1;
        }
        l3 = l2;
        k3 = j;
        if (j1 <= j3)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        l = l2;
        j2 = j1;
        l2 = j;
        j = i4;
_L6:
        j3 = j1 + 1;
        j1 = l;
        l = j;
        j = j1;
        j1 = j3;
        j3 = j2;
        j2 = l2;
        if (true) goto _L4; else goto _L3
_L3:
        if (j2 > j3) goto _L1; else goto _L5
_L5:
        Object obj1 = null;
        Object obj = null;
        Object obj3 = null;
        Object obj2 = null;
        l2 = 0;
        while (l2 < j4) 
        {
            int k1 = dbd1.c.keyAt(l2);
            Object obj4 = (dba)dbd1.c.valueAt(l2);
            Object obj6 = ((dba) (obj4)).a;
            k3 = a(ddk2, dbd1.h, k1);
            if (l2 >= j2 && l2 <= j3)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k3 == 0x80000000 && k1)
            {
                if (dbd1.f)
                {
                    obj4 = String.valueOf(obj4);
                    (new StringBuilder(String.valueOf(obj4).length() + 15)).append("Fading in item ").append(((String) (obj4)));
                }
                dbd1.b();
                ((View) (obj6)).setAlpha(0.0F);
                obj4 = obj;
                if (obj == null)
                {
                    obj4 = new AnimatorSet();
                }
                obj6 = czx.a(((AnimatorSet) (obj4)), ((android.animation.AnimatorSet.Builder) (obj2)), ObjectAnimator.ofFloat(obj6, View.ALPHA, new float[] {
                    0.0F, 1.0F
                }));
                obj = obj3;
                obj2 = obj4;
                obj3 = obj1;
                obj1 = obj;
                obj = obj6;
            } else
            {
                int l1;
                if (l2 <= j2)
                {
                    l1 = j;
                } else
                if (l2 >= j3)
                {
                    l1 = l;
                } else
                {
                    l1 = k3 - dbd1.a(((View) (obj6)));
                }
                if (l1 != 0)
                {
                    if (dbd1.f)
                    {
                        String.format("Moving item %s by %s", new Object[] {
                            obj4, Integer.valueOf(dbd1.a(((View) (obj6))))
                        });
                    }
                    obj4 = obj1;
                    if (obj1 == null)
                    {
                        obj4 = new AnimatorSet();
                    }
                    if (dbd1.a)
                    {
                        obj1 = View.TRANSLATION_X;
                    } else
                    {
                        obj1 = View.TRANSLATION_Y;
                    }
                    obj1 = czx.a(((AnimatorSet) (obj4)), ((android.animation.AnimatorSet.Builder) (obj3)), ObjectAnimator.ofFloat(obj6, ((android.util.Property) (obj1)), new float[] {
                        (float)l1, 0.0F
                    }));
                    obj3 = obj;
                    obj = obj2;
                    obj2 = obj3;
                    obj3 = obj4;
                } else
                {
                    Object obj5 = obj;
                    Object obj7 = obj1;
                    obj = obj2;
                    obj1 = obj3;
                    obj2 = obj5;
                    obj3 = obj7;
                }
            }
            l2++;
            obj4 = obj3;
            obj6 = obj2;
            obj2 = obj;
            obj3 = obj1;
            obj = obj6;
            obj1 = obj4;
        }
        if (obj1 != null || obj != null)
        {
            if (obj1 != null)
            {
                ((AnimatorSet) (obj1)).setDuration(250L);
                b(dbd1);
            }
            if (obj != null)
            {
                ((AnimatorSet) (obj)).setDuration(250L);
            }
            if (obj1 != null && obj != null)
            {
                ((AnimatorSet) (obj1)).setDuration(250L);
                ((AnimatorSet) (obj)).setStartDelay(250L);
                ((AnimatorSet) (obj)).setDuration(250L);
                obj2 = new AnimatorSet();
                ((AnimatorSet) (obj2)).setInterpolator(dac.a);
                ((AnimatorSet) (obj2)).play(((android.animation.Animator) (obj1))).with(((android.animation.Animator) (obj)));
                dbd1.a(((android.animation.Animator) (obj2)), 25);
                return;
            }
            if (obj1 != null)
            {
                ((AnimatorSet) (obj1)).setInterpolator(dac.a);
                ((AnimatorSet) (obj1)).setDuration(250L);
                dbd1.a(((android.animation.Animator) (obj1)), 25);
                return;
            }
            if (obj != null)
            {
                ((AnimatorSet) (obj)).setInterpolator(dac.a);
                ((AnimatorSet) (obj)).setDuration(250L);
                dbd1.a(((android.animation.Animator) (obj)), 25);
                return;
            }
        }
          goto _L1
        j = l;
        l = l3;
        j2 = j3;
        l2 = k3;
          goto _L6
    }

}
