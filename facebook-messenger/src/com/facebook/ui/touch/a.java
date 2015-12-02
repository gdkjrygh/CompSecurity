// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.touch;

import android.view.MotionEvent;
import com.facebook.debug.log.b;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.facebook.ui.touch:
//            c, b, d

public class a
{

    private static final Class c = com/facebook/ui/touch/a;
    boolean a;
    boolean b;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k[];
    private float l[];
    private int m;
    private float n;
    private float o;
    private d p;
    private List q;
    private float r;
    private float s;
    private float t;
    private float u;
    private c v;
    private int w;

    public a(d d1, List list, float f1, float f2)
    {
        f = -1F;
        a = false;
        b = false;
        v = c.MONITORING;
        w = 0;
        p = d1;
        com.facebook.debug.b.a.a(p);
        k = new float[6];
        l = new float[6];
        q = list;
        d = f1;
        e = f2;
    }

    private boolean a(float f1, float f2)
    {
        if (r >= s) goto _L2; else goto _L1
_L1:
        if (t >= u ? f1 > r && f1 < s && f2 < t && f2 > u : f1 > r && f1 < s && f2 > t && f2 < u)
        {
            return true;
        }
_L4:
        return false;
_L2:
        if (t >= u)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f1 >= r || f1 <= s || f2 <= t || f2 >= u) goto _L4; else goto _L3
_L3:
        return true;
        if (f1 >= r || f1 <= s || f2 >= t || f2 <= u) goto _L4; else goto _L5
_L5:
        return true;
    }

    private boolean b(float f1)
    {
        return f <= 0.0F || f1 <= f;
    }

    private boolean c()
    {
        return q.contains(Integer.valueOf(1)) || q.contains(Integer.valueOf(-1));
    }

    private boolean d()
    {
        return q.contains(Integer.valueOf(10)) || q.contains(Integer.valueOf(-10));
    }

    private int e()
    {
        boolean flag2 = true;
        byte byte0 = 1;
        if (w == -1 && a() > 0.0F)
        {
            byte0 = -1;
        } else
        if (w != 1 || a() >= 0.0F)
        {
            boolean flag;
            boolean flag1;
            if (w == 10)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (b() < 0.0F)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag & flag1)
            {
                return 10;
            }
            if (w == -10)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (b() > 0.0F)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            return !(flag & flag1) ? 0 : -10;
        }
        return byte0;
    }

    public float a()
    {
        return n;
    }

    public void a(float f1)
    {
        f = f1;
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        a = true;
        r = f1;
        s = f3;
        t = f2;
        u = f4;
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a(MotionEvent motionevent)
    {
        float f1;
        float f2;
        f2 = motionevent.getX();
        f1 = motionevent.getY();
        if (b)
        {
            f2 = motionevent.getRawX();
            f1 = motionevent.getRawY();
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 72
    //                   1 660
    //                   2 163
    //                   3 660;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_660;
_L5:
        return v == c.INTERCEPTING;
_L2:
        g = f2;
        h = f1;
        i = g;
        j = h;
        v = c.MONITORING;
        n = 0.0F;
        o = 0.0F;
        Arrays.fill(k, 0.0F);
        Arrays.fill(l, 0.0F);
        if (a && !a(g, h))
        {
            v = c.DEFERRING;
        }
          goto _L5
_L4:
        b.a[v.ordinal()];
        JVM INSTR tableswitch 1 3: default 200
    //                   1 200
    //                   2 213
    //                   3 534;
           goto _L6 _L6 _L7 _L8
_L6:
        break; /* Loop/switch isn't completed */
_L8:
        break MISSING_BLOCK_LABEL_534;
_L9:
        i = f2;
        j = f1;
          goto _L5
_L7:
        float f3 = f2 - g;
        float f5 = f1 - h;
        float f7 = Math.abs(f3);
        float f8 = Math.abs(f5);
        if (com.facebook.debug.log.b.b(2))
        {
            com.facebook.debug.log.b.a(c, (new StringBuilder()).append("abs_dx=").append(f7).append(" dx=").append(f3).toString());
            com.facebook.debug.log.b.b(c, (new StringBuilder()).append("abs_dy=").append(f8).toString());
        }
        v = c.INTERCEPTING;
        if (d() && f8 > d && b(f7))
        {
            if (f5 > 0.0F)
            {
                w = 10;
            } else
            {
                w = -10;
            }
        } else
        if (c() && f7 > e && b(f8))
        {
            if (f3 > 0.0F)
            {
                w = -1;
            } else
            {
                w = 1;
            }
            if (com.facebook.debug.log.b.b(2))
            {
                com.facebook.debug.log.b.a(c, "setting drag type to: %s abs_dx=%f", new Object[] {
                    Integer.valueOf(w), Float.valueOf(f7)
                });
            }
        } else
        {
            v = c.MONITORING;
            w = 0;
        }
        if (q.contains(Integer.valueOf(w)))
        {
            v = c.INTERCEPTING;
            p.a(g, h);
        } else
        if (v == c.INTERCEPTING)
        {
            v = c.DEFERRING;
        }
          goto _L9
        p.b(f2, f1);
        float f4 = f2 - i;
        float f6 = f1 - j;
        n = n + (f4 - k[m]);
        k[m] = f4;
        m = (m + 1) % k.length;
        o = o + (f6 - l[m]);
        l[m] = f6;
        m = (m + 1) % l.length;
          goto _L9
        if (v != c.DEFERRING && w != 0)
        {
            p.a(f2, f1, e());
        } else
        if (v != c.DEFERRING)
        {
            p.c(f2, f1);
        }
        v = c.MONITORING;
        w = 0;
          goto _L5
    }

    public float b()
    {
        return o;
    }

}
