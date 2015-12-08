// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.widget.Scroller;

final class ior extends Scroller
{

    int a[];
    private final float b;

    public ior(Context context)
    {
        super(context);
        setFriction(ViewConfiguration.getScrollFriction() * 2.0F);
        b = context.getResources().getDimension(b.Af);
    }

    static void a(ior ior1, int i, boolean flag)
    {
        int ai[] = ior1.a;
        int k = ai.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    int l = ai[j];
                    if ((!flag || l <= i) && (flag || l < i))
                    {
                        break label0;
                    }
                    if (flag)
                    {
                        ior1.startScroll(i, 0, l - i, 0, 1000);
                    }
                }
                return;
            }
            j++;
        } while (true);
    }

    public final void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        if (a != null && a.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Integer integer;
        int ai[];
        int i2;
        int j2;
        int l2;
        integer = null;
        ai = a;
        l2 = ai.length;
        j2 = 0;
        i2 = 0;
_L5:
        if (j2 >= l2) goto _L4; else goto _L3
_L3:
        int i3;
        i3 = ai[j2];
        if (i3 < i)
        {
            integer = Integer.valueOf(i3);
        } else
        {
            if (i3 != i)
            {
                continue; /* Loop/switch isn't completed */
            }
            i2 = 1;
        }
_L7:
        j2++;
          goto _L5
        if (i3 <= i) goto _L7; else goto _L6
_L6:
        Integer integer1 = Integer.valueOf(i3);
_L12:
        int ai1[];
        int k2;
        if ((float)Math.abs(k) >= b)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        if (k2 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i2 = (int)(float)k;
        super.fling(i, j, i2, l, i1, j1, k1, l1);
        l1 = getFinalX();
        k = -1;
        l = 0x7fffffff;
        ai1 = a;
        k2 = ai1.length;
        i1 = 0;
        while (i1 < k2) 
        {
            k1 = ai1[i1];
            j1 = Math.abs(k1 - l1);
            Integer integer2;
            if (j1 < l)
            {
                l = k1;
                k = j1;
            } else
            {
                j1 = k;
                k = l;
                l = j1;
            }
            j1 = i1 + 1;
            i1 = l;
            l = k;
            k = i1;
            i1 = j1;
        }
        if (i2 > 0 && integer1 != null && k < integer1.intValue())
        {
            l = integer1.intValue();
        } else
        {
            l = k;
            if (i2 < 0)
            {
                l = k;
                if (integer != null)
                {
                    l = k;
                    if (k > integer.intValue())
                    {
                        l = integer.intValue();
                    }
                }
            }
        }
        if (integer1 != null && l == integer1.intValue() || integer != null && l == integer.intValue())
        {
            abortAnimation();
            startScroll(i, j, l - i, 0, 1000);
            return;
        } else
        {
            setFinalX(l);
            return;
        }
        if (i2 != 0) goto _L1; else goto _L8
_L8:
        if (integer != null) goto _L10; else goto _L9
_L9:
        integer2 = integer1;
_L11:
        startScroll(i, j, integer2.intValue() - i, 0, 1000);
        return;
_L10:
        if (integer1 != null)
        {
            integer2 = integer1;
            if (Math.abs(integer1.intValue() - i) < Math.abs(integer.intValue() - i))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        integer2 = integer;
        if (true) goto _L11; else goto _L4
_L4:
        integer1 = null;
          goto _L12
    }
}
